# Data Pipeline (observe → store → report → sync)

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`

## Local capture (OBS)

1. `MyMonitorInAppBlockService` (AccessibilityService, `typeAllMask`, `canRetrieveWindowContent`) sees every window/state event → merges with `UsageStats` events (`getBestEvent(AccessibilityEvent, UsageEvents$Event)`, `computeUsageStatsExpiry=60 s` refresh).
2. Per-event resolution (`getForegroundPackageDetails`, `getForegroundAppType`) → writes `EventData`, `AppUsage`, `HourlyAppUsage`, `ProductiveModeEventData`, `PhoneLockUnlockEvent` to Room; `DailyUsageSaveToDbWorker` rolls up; `CheckUsageEventWorker` verifies stream health.
3. `NotificationListener` (NotificationListenerService) captures posted/removed notifications → `NotificationBatchingDatabase`.
4. `MyMonitorService` (FGS) is the always-on orchestrator — 30+ event-type methods (`handleAppLimitWindow`, `handleAppUsageEvent`, `onFocusSessionStarted`, `sendWeeklyFocusStats`, `sendAppUsageEvents`, `handleAppBlockProtection`, `onAppInstalledEvent`, `onScreenTimeUpdate`, `checkZenMode`, `checkC68Alarm`, `onUserUnlocked`…) and is `exported` with wake-lock/battery-exemption requests.

## Local processing → UI (OBS)

Screens read Room via use-cases; widgets (Glance) read DB+SharedPrefs; floating bubbles read live monitor state; `MediaPlayerService` plays focus music; analytics events (`logAnalyticsEvent` enum `EnumC3608a`) emitted everywhere with `JSONObject` payloads.

## Cloud sync (OBS)

| Worker / API | Payload |
|---|---|
| `SendAppUsageEventToServerWorker` + `/usage/submit` | usage aggregates; `/usage/get_sync_time` paces it |
| `SyncAppCategoryToDBWorker` + `/app_category/submit_apps`+`get_app_categories` | installed apps → server returns Regain categories |
| `UploadLogWorker` + `/send_feedback/logs` | logback files (multipart) |
| `SyncGroupRankWorker` + `/fg/group/*` | group stats/leaderboards |
| `NotificationAndWidgetUpdateWorker` + `/notification/*` | notification meta/tag sync |
| `StudyStampSyncWorker` + `/study_stamps/*` | study-stamp photos up/down |
| `OnDemandBackupWorker`/`BackupDBWorker` + `/auth/user/*backup*` | full profile backup |
| `UpdateReferralCountWorker`/`UpdateGroupReferralCountWorker` | referral counters |
| `RatingFeedbackWorker`, `NetworkLogsCleanupWorker`, `CheckNBServiceFixingWorker`, `CheckServiceFixingWorker`, `AutoStartPermissionWorker` | ops/housekeeping |
| FCM `/fcm/save_token` | push token registration |

## Telemetry plane (OBS, separate from product API)

Jitsu `jitsuStaging` (identify once + every event dual-written after `IS_JITSU_USER_IDENTIFIED_DUAL_WRITE_V1`) → `analytics.regainapp.ai`; Mixpanel heartbeats; OTel traces → `otel.regainapp.ai`; Firebase Analytics/Crashlytics/Perf; Facebook events; uncaught-exception handler feeds Jitsu crash events (`stack_trace` truncated 4000 chars).

## Monetization plane (OBS)

Play Billing 8 + RevenueCat + Razorpay → `/payments/*`; purchase claim `POST /payments/claim` binds Google token to `regain_email`; server is source of truth for subscription state (`SubscriptionState` model + `/payments/subscriptions`).
