# Tool: Notifications (push + local)
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

- **UI entry:** system notifications → `HitwicketUnityPlayerActivity` (`custom_notification_android_activity` meta-data) [observation].
- **Parameter model:** FCM data payloads with `google.message_id`, `tracker_id` fields; local alarms via `alarmscheduler`; `DailyGoalsNotification` IL2CPP type; `registerUserPushDevice` API [observation].
- **Execution path:** FCM → `CustomFirebaseMessageService` (`:pn` process): dedupe message_id in 16-entry LRU → `queueDeliveryTrackers` → `PnTrackerQueue` (persistent) → `PnTrackerFlusher.flushAsync`→`PnTrackerDrainer` → tracker backend [observation — ev_93a02fe6…, ev_40137731…]. Tap → `handleNotification` → deep-link route + `sendNotificationTracker` + `trackSdkDrawnTap` [ev_e7367d9d…].
- **Local scheduling:** `AppMonitorService.scheduleOnClose` + `AndroidAlarmReceiver` (BOOT_COMPLETED) + `SCHEDULE_EXACT_ALARM` + Unity `Notifications.Android` (`UnityNotificationManager`) → re-engagement nudges when app closed [observation].
- **Badge:** 16 launcher-badge permissions → unread counts on icons [observation].
- **Premium/offline flags:** push = online (server-initiated); local scheduled = offline [observation].
- **I/O flow:** server campaign → FCM → dedupe/store → display → tap → tracker events round-trip to `tracker.hitwicketsuperstars.com`.
