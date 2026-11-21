# Module: Android Java Services (cricketgames.*)
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

App-owned Java layer (~23 classes under `cricketgames.hitwicket.strategy`) [observation]:

| Class | Role |
|---|---|
| `HitwicketUnityPlayerActivity` | Unity host; `handleNotification`, `handleShortcut`, `sendNotificationTracker`, `trackSdkDrawnTap`, FCM message-id constants (ev_e7367d9d…) |
| `services.notificationhandlers.CustomFirebaseMessageService` | FCM receive/dedupe/`queueDeliveryTrackers` (ev_93a02fe6…) |
| `services.analytics.PnTracker{Flusher,Drainer,Queue,Event}` | durable PN analytics queue + flush (ev_40137731…) |
| `services.alarmscheduler.{AppMonitorService,AndroidAlarmReceiver,...}` | close-scheduled local alarms; boot reschedule; `:pn` process (ev_9b35a52f…) |
| `services.whatsappauth.WhatsAppAuthenticator` | WhatsApp OTP broadcast + validation (ev_7fefddb0…) |
| `services.performance.FirebasePerformanceBridge` | Unity→Firebase perf trace bridge [inference: name] |
| `services.{quickactions.QuickActionPlugin,ringtone.SystemRingtonePlugin,...}` | app shortcuts + ringtone helpers [observation — class names] |
| `services.notificationdisplay.NotificationDisplayService` | custom notification rendering [inference: name] |

- **Unity bridge:** these Java classes receive OS events (intents/alarms/FCM) and forward into Unity via `UnitySendMessage`-style calls [inference]; `custom_notification_android_activity` meta-data routes taps.
- **Process split:** `:pn` isolates notification machinery from the game process [observation].
