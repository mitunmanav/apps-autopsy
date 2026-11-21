# Permissions

**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 (205957) — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`
42 uses-permission entries [observation]; purpose column is [inference] from owning components.

| Permission | Purpose |
|---|---|
| INTERNET, ACCESS_NETWORK_STATE, ACCESS_WIFI_STATE, CHANGE_NETWORK_STATE | core networking; connectivity monitors |
| RECORD_AUDIO, MODIFY_AUDIO_SETTINGS | WebRTC voice chat (awrtc) |
| BLUETOOTH | voice-chat headset routing |
| CAMERA (+camera features, required=false) | likely QR/AR or profile photo flows (no direct consumer found in Java layer; consumer is IL2CPP) [inference] |
| POST_NOTIFICATIONS, VIBRATE | push + Unity local notifications |
| SCHEDULE_EXACT_ALARM | `alarmscheduler` notification scheduling |
| RECEIVE_BOOT_COMPLETED | reschedule notifications after boot (AndroidAlarmReceiver, WorkManager RescheduleReceiver) |
| WAKE_LOCK | realtime sockets/match keepalive |
| FOREGROUND_SERVICE + FOREGROUND_SERVICE_DATA_SYNC | asset-pack ExtractionForegroundService |
| com.google.android.gms.permission.AD_ID + ACCESS_ADSERVICES_{TOPICS,ATTRIBUTION,AD_ID} | ads/analytics attribution (Privacy Sandbox) |
| com.android.vending.BILLING, CHECK_LICENSE | IAP + license check |
| com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE | install referrer |
| com.google.android.c2dm.permission.RECEIVE, com.google.android.providers.gsf.permission.READ_GSERVICES | FCM/GCM + GSF |
| `cricketgames.hitwicket.strategy.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` (signature, self-defined) | guards in-app dynamic receivers |
| `cricketgames.hitwicket.strategy.permission.C2D_MESSAGE` (signature) | C2DM app-scoped permission |
| 16 launcher badge perms (sec×2, htc×2, sonyericsson, sonymobile, anddoes, majeur, huawei×3, oppo×2, everything.badger×2, READ_APP_BADGE) | notification-badge counts via ShortcutBadger-style code |

Notable absences [observation]: no location, contacts, storage/media read, SMS, phone-state permissions.

Sensitive-surface notes [inference]: RECORD_AUDIO is runtime-gated for voice chat; CAMERA usage path not confirmed (IL2CPP-only consumer); AD_ID powers ads+attribution; broad UPI/social package queries expose installed-app probing to the OS.
