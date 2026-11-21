# Tracking/insight features (app_usage_stats, app_category, control_apps, phone_lock_unlock_counter, notification_batching, regain_api, network_logs, profile_stats, impact_banner)

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`

All OBS.

## feature_app_usage_stats
`AppUsageDatabase` + entities `AppUsage`, `AppUsageToday`, `HourlyAppUsage`, `BeforeRegainUsage`, `EventData`, `InstalledAppMeta`, `ProductiveModeEventData`, `RegainAppCategory`, `UserAppCategory`, `UserTotalUsage`, `WeeklyUsageStats`, `AppUsageWithLastWeekComparison`; `SyncAppCategoryToDBWorker`; `/usage/*` + `/app_category/*` APIs. Feeds dashboard+widgets+weekly report.

## feature_app_category
DTOs `AppCategoryDetailsDto`, `AppCategoryDto`, `InstalledAppDto` → `POST /app_category/submit_apps`, `GET /app_category/get_app_categories`; local `UserAppCategory`/`RegainAppCategory`; `app_category_usage_screen`.

## feature_control_apps
`CategoryUsageSummary` — control/blocked-app category aggregation for settings/dashboards.

## feature_phone_lock_unlock_counter
`PhoneLockUnlockEvent` + `PhoneLockUnlockEventDatabase`; screen receiver records unlocks; `phone_unlock_stats` + `PhoneUnlockCountWidgetReceiver`.

## feature_notification_batching
`NotificationBatchingDatabase` + all notification entities/UI models + `/notification/*` APIs; listener-driven (see core-application).

## feature_regain_api
`AllEventData`, `DeleteResponse`, `UploadLogWorker` — generic telemetry/log upload → `/send_feedback/logs`, `/event_screenshots`.

## feature_network_logs
`NetworkLogsDatabase` + `NetworkLogsCleanupWorker`; `network_logs` debug route.

## feature_profile_stats
`UserRegainStats` — aggregate user stats for `user_stats_bs`/profile.

## feature_impact_banner
`BeforeAfterRegainUsageStats` — "time saved" banner/`impact_share`/`impact_metrics_bs`.
