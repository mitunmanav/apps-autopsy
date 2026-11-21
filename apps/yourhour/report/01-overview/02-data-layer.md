# 02 — Data Layer

## Room database (`AppUsageDatabase` / `AppUsageDatabase_Impl`)

17 entity tables — **full real schemas in [reference/database-schema.md](../05-reference/database-schema.md)** (columns recovered from generated migration classes). Column-level corrections vs earlier inference: `app_digest` has **`visitCount`** (launch counts per app/day), `time_slice` has `scheduledDays`+`notifyFlag` (scheduled windows), `table_story` carries social links + age + profession + country + installDate, `app_heartbeat` has **`trusted_timestamp`** (anti-tamper), `generated_digest_state` has `rawFingerprint` + `adjustHappyTime`.

| Table | Contents (inferred from name + model fields) |
|---|---|
| `app_usages` | per-app per-day usage rows (core fact table) |
| `app_digest` | pre-aggregated daily digests powering reports |
| `app_settings` | per-app config: monitor, floating clock, mindful pause, limit, alert, auto-lock, lock settings, category, snooze, ignore-no-phone |
| `fasting_challenge` | "Fast" challenge runs |
| `limit_challenge` | "Diet" challenge runs (per-app limit) |
| `techno_camping_challenge` | legacy challenge table |
| `phone_unlock` | unlock events → daily unlock counts |
| `feed` | in-app feed items |
| `category_model` | built-in + custom categories |
| `app_detail` | app metadata cache (label, icon, category, system flag) |
| `badge_history` | earned badge records |
| `time_slice` | 30-min usage slices → timeline view |
| `table_story` | community story cache/bookmarks |
| `app_heartbeat` | service heartbeat records |
| `usage_query_checkpoint` | incremental UsageStatsManager query progress |
| `generated_digest_state` | digest-generation bookkeeping |
| `action_notifications` | parental-control action log |

Supporting model files: `UsageEventModel`, `UsageEventSessionTracker$Snapshot/OwnerSegment`,
`UsageEventParser$Snapshot`, `UsageQueryState/Identity`, `UsageReplayComponent/Interval/Row`,
`UsageHistoryRepair`, `PendingActivityStop` — an **event-replay engine** that rebuilds
accurate sessions from `UsageEvents` (MOVE_TO_FOREGROUND etc.) instead of trusting
`queryUsageStats` totals. `UsageQueryIdentity` keys history by `resetDate`, `dayOffset`,
`timeZone`, `installation`, `boot` — so timezone changes, reinstalls and reboots invalidate
checkpoints correctly. `UsageHistoryRepair` keeps `protectedDays` around gaps.

## SharedPreferences files (observed keys)

| File | Keys seen |
|---|---|
| `mobilePePreference` | `setLastProcessedUnlockEventTime`, misc core state |
| `settingsPreference` | `pref_quote_enabled`, `usageAlertNotificationFlag`, `totalUsageAlertNotificationFlag`, `challengeNotificationAlertFlag`, arg_start_of_the_week, date-format |
| `reelBlockerPreference` | `{youtube_shorts,instagram_reels,snapchat_spotlight,facebook_reels,tiktok}_enabled`, `…_blocked_today/total/date`, `pending_blocker_enable_target` |
| `service_health_preference` | `usage_service_heartbeat_at`, `usage_service_hide_warning_at` |
| `stories_pref` | `story_tag_list`, email identity |
| `parental_control_prefs` | `device_refresh_pending`, `fcm_token_registration_pending` |
| `dashboardPromoPreference` | `last_dismissed_at`, `dashboard_promo_current`, `parked_hidden_at_count`, `dismissal_count` |
| `iosAppLaunchPreference` | `ios_app_launch_card_{dismissal_count,completed,last_dismissed_at,next_show_at}` |
| `offerReminderPreference` | `exit_notified_for`, `reward_notified_for`, `reward_notified_at` |
| `force_update_analytics` | `pending_minimum_version_code`, `pending_reason` |
| `sticker_pref` | `sticker_id`, `sticker_code`, `sticker_start_date`, `sticker_end_date`, `sticker_country_code`, `sticker_country_exception` (promo/sticker campaigns) |
| `yh_pref`, `badge_test_pref` | FAQ cache, dev badge testing |
| `onboarding_progress_v3` | intro funnel progress + `analytics_started_at` |
| `appops` | usage-permission grant tracking |
| `CHALLENGES` (broadcast) + prefs | `no_phone_challenge_taken`, `fast_challenge_taken`, `diet_challenge_started` |
| `faqs`, `feedCount` | misc |

## Files

- `image_dir/profilePic.jpg` — avatar crop output (UCrop).
- `yourhour.db` — full-DB export via SAF `CREATE_DOCUMENT` (see 26).
- `*.pdf` — `YourHour {Daily,Weekly,Monthly} Report <range>.pdf` via capturable-PDF activities.
- `/backups` — Drive/backup listing root on server side (`/backups`, `/yourhour.db` paths).
- FileProvider (`fileprovider_paths`): app/cache/external paths for sharing PDFs, XLS, DB, cropped images.

## Key DAO read patterns (real SQL)

- Category reports: `sum(usageTime) FROM app_digest JOIN app_settings JOIN category_model
  WHERE monitorFlag=1 AND date>=? AND date<=? AND pName!=?` — aggregates run server-side-in-SQL,
  excluding the app's own package.
- Checkpoints: `usage_query_checkpoint` stores `payload` **chunked**
  (`length(payload)` + `substr(payload,?,?)` reads) — serialized replay state.
- Pruning: `DELETE app_usages WHERE startTime<?`, `DELETE app_heartbeat WHERE
  created_at<?`, `DELETE action_notifications WHERE receivedAt<?` — retention windows exist.
- Invalidation: `DELETE generated_digest_state WHERE dayOffset!=? OR timeZone!=? OR
  resetDate!=?` — digest rebuild triggers.
- Recent parental feed: `action_notifications WHERE deviceId=? AND receivedAt>=? ORDER BY
  occurredAt DESC`.

## Local-only vs synced

Everything above is **local-first**; nothing in the local schema is required for operation.
The server holds parental-control state (devices, locks, overrides, synced usage summaries —
see 18), backups, and account; analytics go to Firebase. `usageSyncedAt`/`appsSyncedAt`
timestamps in the notification handler confirm usage summaries are pushed for paired devices.
