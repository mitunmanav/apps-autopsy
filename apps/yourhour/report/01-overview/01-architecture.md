# 01 — Architecture

## Stack

- **Language:** Kotlin coroutines + Flow throughout (state-machine decompiled code everywhere); some legacy Java-style code.
- **UI:** mixed — XML layouts (530 layouts incl. `layout-v31`/`layout-v33` variants) for older screens, **Jetpack Compose** for newer features (`*ComposeActivity`, overlay Compose content via `ComposeView`-style `lg1`).
- **DI:** none conventional (no Dagger/Hilt). A hand-rolled **service locator / singleton holder** pattern: obfuscated gateway objects (`u83`, `rk1`, `f13`, `wv3`, `i30`, `nv`, `n48`, `o48`, `ob7`, `rq9`…) vend shared repositories, preferences and helpers. `u83.a()` is the global crash/reporting + runtime registry.
- **Persistence:** Room (`AppUsageDatabase` + `_Impl`), many named SharedPreferences files, local files (PDFs, `yourhour.db` backups, `image_dir/profilePic.jpg`).
- **Networking:** Retrofit-style interface + OkHttp (30 s timeouts, BASIC logging) against `https://tv-api.yourhourapp.com/api/v1/`; Firebase (Analytics, Crashlytics, Messaging, Firestore, RTDB `yourhour-mindefy.firebaseio.com`); Google Play Billing.
- **Async work:** JobScheduler (`MyJobService`, `DailyReportJobService`), WorkManager (heartbeat watchdog, widget/day-boundary workers), AlarmManager receivers, a dedicated executor (`em7` with `ExecutorService`).
- **Concurrency:** `Dispatchers.Default/IO` coroutines; `AtomicBoolean`/`AtomicLong` state in services; `LinkedHashMap` job registry in `MyJobService`; wake locks via `PowerManager`.

## Layers

```
Activities (named, manifest) ──► ViewModels (obfuscated, AndroidViewModel + SavedStateHandle)
        │                              │  "Local and anonymous classes can not be ViewModels"
        ▼                              ▼  = factory-less VM lookup, keyed by screen name
Repositories / gateways (obfuscated: y92, wo6, qh5, si, rq9, fk, f2, sq3, eh5…)
        │
Room DAOs · SharedPreferences · UsageStatsManager · OkHttp/Retrofit · Billing · FCM
```

- ViewModels are registered per-screen with a string key (`dashboard`, `today_usage`,
  `manage_challenge`, …) — these keys double as **analytics screen names**.
- Every screen logs an analytics event `<screen>_opened` + entry-point extras
  (`analytics_entry_point`, `arg_is_type`, `arg_date`, `arg_pin_screen`).

## Cross-cutting services

| Piece | Role |
|---|---|
| `YourHour` (Application) | creates 7 notification channels, registers Firebase, warms native-ad pools (`native_ad_dashboard_1/2`, `global_warmup`), restores pending force-update state |
| `UsageTimerService` | the engine — foreground service polling usage stats & enforcing limits (see 10) |
| `u83` holder | crash handler (`Thread.setDefaultUncaughtExceptionHandler` → Crashlytics), global runtime state, debug-event sink (`bs1.e(pq1)` log lines like "Refresh Usage job executing") |
| BootCompletedReceiver + heartbeat watchdog + `service_health_preference` | keep-alive mesh: boot restart, periodic heartbeat stamps (`usage_service_heartbeat_at`), watchdog worker restarts the service, warning notification (`usage_service_hide_warning_at`, click → `ServiceHealthNotificationClickReceiver` → dashboard) |

## Broadcast namespace

Custom actions: `com.mindefy.phoneaddiction.mobilepe.CHALLENGES`, `…mobilepe.UPDATE_BADGE_UI`,
`…mobilepe.action.DISMISS_OFFER_REMINDER`, `…mobilepe.action.REWARD_ENDED`,
`com.mindefy.phoneaddiction.PARENTAL_DEVICES_CHANGED`, `…PARENTAL_SESSION_EXPIRED`,
`…PARENTAL_STATS_UPDATED`, `…PARENTAL_NOTIFICATION_RECEIVED`, `…ACTION_TV_PARENTAL_UNPAIRED`,
`com.mindefy.phoneaddiction.mobilepe.refre…` (refresh, truncated). Deep-link scheme `mobilepe://shortcut/{daily_report,reel_blocker,write_ceo,share}` via `shortcurts.xml`.

## Error-handling convention

Try/catch around every async boundary; `CancellationException` rethrown; other exceptions →
`u83.a().b(e)` (Crashlytics). Graceful degradation everywhere: missing permission → settings
deep-link; missing service → health notification; ad load fail → no-op.
