# 10 — Usage Tracking & Enforcement Engine

## Core component: `UsageTimerService` (exported, FGS `specialUse`)

The heart of the app — a persistent foreground service that owns all tracking state.

### Lifecycle

- `onCreate`: builds `UsageStatsManager`, `NotificationManager`, `PowerManager` clients;
  atomic state fields; coroutine scope; repositories (`serviceRepo`, `state`, `enforcement`).
- Foreground start: channel `usageTimerForegroundChannel` ("Usage Timer" — "Shows usage time
  and unlock count while tracking is active"), notification **ID 13**; on API 34+ calls
  `startForeground(id, n, 1073741824)` (specialUse). Baselines for usage-minutes and
  unlock-count are initialized at start.
- Handles `SecurityException`, `CancellationException`, `ForegroundServiceStartNotAllowedException`
  (API 31+) — logs + falls back to health-notification path.
- `onDestroy`: cancels jobs, clears state, `onTaskRemoved` restart logic.

### Polling loop

- "UsageTimerService starting polling loop" / "…restarting polling loop: <reason>" log lines;
  restart-safe. Polls `UsageStatsManager` events + current foreground app.
- `USER_PRESENT` broadcast → unlock event persisted via `setLastProcessedUnlockEventTime`
  (dedupes unlock counts).
- Day boundary: tracked with `UsageQueryIdentity(resetDate, dayOffset, timeZone)`; midnight
  rollover finalizes the previous day's rows and resets counters.

### Enforcement

- Dedicated `enforcement` collaborator + `scheduleEnforcement` path.
- Checks per-app usage limits (app_settings), category limits, the global **daily goal**;
  when the daily goal is exceeded it fires Firebase event `daily_goal_exceeded`
  `{total_usage_minutes, goal_minutes}` and triggers the configured consequence.
- Consequences (configurable per app / globally): **usage alert** notification,
  **auto-lock** (overlay lock screen over the offending app), **Mindful Pause** interstitial.
- Auto-lock requires the "sticky" usage-timer notification to stay enabled (documented in
  strings) and, optionally, device-admin to resist uninstall.
- `service_health_preference.usage_service_heartbeat_at` is stamped each cycle; the watchdog
  worker (`ServiceHeartbeatWatchdogWorker`, error-logged "ServiceHeartbeatWatchdogWorker error:")
  and `ServiceHeartbeatReceiver` restart the service when the stamp goes stale; prolonged death
  surfaces a warning notification whose tap opens the dashboard (`ServiceHealthNotificationClickReceiver`,
  suppressible via `usage_service_hide_warning_at`).

### Usage event pipeline (util package)

`UsageEventParser` consumes `UsageEvents` (as `UsageEventModel`s) → `UsageEventSessionTracker` builds
`OwnerSegment`s (package + start + revived flag) and `PendingActivityStop`s →
`UsageReplayComponent` reconciles `expected` (raw query totals) vs `baseline` vs `replay`
→ rows (`UsageReplayRow`/`UsageReplayInterval`) → `UsageQueryState` checkpoints progress in
`usage_query_checkpoint` so re-queries are incremental; `UsageQueryIdentity` invalidates
on timezone/reinstall/boot change; `UsageHistoryRepair` back-fills gaps outside
`protectedDays`. This is a notably robust design — the app does not trust
`queryUsageStats` aggregates; it reconstructs sessions and reconciles.

### State machines (util enums)

- `UsageScreenState`: `INTERACTIVE` / `NON_INTERACTIVE` — screen-on/off drives session
  segmentation (usage only counts while interactive).
- `UsageRuntimeState`: `RUNNING` / `SHUTDOWN_GAP` / `UNKNOWN` — distinguishes a live run
  from a device-off gap vs ambiguous (reboot/kill); feeds repair.

### SQL-level corroboration (real DAO queries)

- Checkpoint store is **chunked**: `SELECT generation, length(payload) … ; SELECT
  substr(payload, ?, ?) FROM usage_query_checkpoint` — serialized `UsageQueryState`
  payloads are paged out in slices.
- Identity invalidation is a real query: `DELETE FROM generated_digest_state WHERE
  dayOffset != ? OR timeZone != ? OR resetDate != ?` — wipes stale digests on TZ/reset change.
- Category report math is SQL-side: `sum(usageTime) FROM app_digest JOIN app_settings JOIN
  category_model WHERE monitorFlag=1 AND date BETWEEN ? AND ?` (excludes self package).
- Retention pruning: `DELETE FROM app_usages WHERE startTime < ?`,
  `DELETE FROM app_heartbeat WHERE created_at < ?`,
  `DELETE FROM action_notifications WHERE receivedAt < ?`.
- Overlap-safe session reads: `app_usages WHERE startTime < ? AND startTime+usageTime > ?`.

## Supporting jobs

| Component | Role |
|---|---|
| `MyJobService` | generic deferred job: runs `y92.r()` (usage refresh) then `wo6.d()` (digest/store update) on an `ExecutorService`; per-job futures in a map, cancel on stop |
| `DailyReportJobService` | same two-step refresh + digest, logs "Refresh Usage job executing" to the debug sink; defers finishing via coroutine |
| `RefreshUsageDataReceiver` / `RefreshUsageAlertReceiver` | alarm-driven refresh (`schedule()`/`receiver_refresh_usage`, `receiver_usage_alert_reset`) — scheduled re-computation + reset of per-day alert flags |
| `BootCompletedReceiver` | BOOT_COMPLETED / QUICKBOOT_POWERON / MY_PACKAGE_REPLACED → schedules or immediately starts the FGS; failure logs "Failed to schedule/start…" and falls back to alarm |
| `WidgetSystemReceiver` | BOOT/TIME_SET/TIMEZONE/DATE/LOCALE changes → widget refresh |

## Notification content

Foreground notification body = live usage time + unlock count
(`notifyUsageNotificationIfChanged()`). "Happy Time" string near the service = the goal-met
celebration state.

## Analytics

`daily_goal_exceeded`, service start/stop paths, enforcement triggers, heartbeat failures
(to debug sink). Entry-point extras carried through intents (`analytics_entry_point`).
