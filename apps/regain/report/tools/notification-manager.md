# Notification Blocking & Batching

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Module:** `feature_notification_batching` + `NotificationListener` · **Evidence:** OBS (`ev_aea26745…` class)

## What it is
Notification-listener service that suppresses distracting notifications (esp. during focus), digests them into batches/digests, and gives per-app/channel analytics + review UI.

## UI entry (OBS)
`notification_settings`, `notification_analytics`, `notification_channels`, `notification_channel_meta`, `notification_user_tags`, `notification_review`, `weekly_notification_stats`.

## Params model (OBS)
`NotificationBatchingDatabase`: `NotificationMetaData`, `NotificationHistoryData`, `NotificationChannelMetaData`, `NotificationUserTagData`, `NotificationCurrentTagData`, `AppNotificationCount`/`Stats`, `WeeklyNotificationStats`; UI models `NotificationAppDataUIModel`, `NotificationsChannelDataUIModel`, `NotificationReviewForEachAppUIModel`; server DTOs `NotificationChannelDataServer`, `NotificationTagDataServer`.

## Execution path (OBS, `NotificationListener.java`)
`extends NotificationListenerService`; injected `notificationBatchingUseCases`, `permissionUseCases`, `shouldBlockNotificationForFocus`, `suppressC68Notification`, `logAnalyticsEvent`; coroutine scope per callback — `onNotificationPosted` → store/batch or suppress if focus-blocking rule hit; `onNotificationRemoved` → cleanup; C68 alarm notifications suppressed via `suppressC68Notification`.
Channel meta + user tags synced `POST /notification/*` (update_channel_meta_data, get_channel_meta_data, update_user_tag, get_user_tag, save_user_tag_data).

## Data flow
Posted notification → listener → rules (focus/per-app/channel tags) → suppress or batch → DB → analytics + review UI → server sync.

## Premium/offline (OBS)
Local suppression/batching offline; channel meta sync + weekly stats need `/notification/*`.
