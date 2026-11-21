# 18 — Analytics & engagement

## Event taxonomy (`helper.FBEventUtils`, 121 string constants — full list in `_evidence/FBEventUtils_events.txt` and `_jadx/…FBEventUtils.java`)

- **Capture**: `capture_photo`, `capture_image`, `capture_video`, `first_photo_capture`, `first_video_captured`, `camera_back`, `camera_selfie`, `camera_setting_click`, `camera_tracking_on/off`, `camera_reporting`
- **Templates**: `default_phototemp_*` + `default_videotemp_*` ×6 families (advanced, classic, date_time, navigation, reporting, `sacnlocation`[sic])
- **Features**: `feature_addtext`, `feature_manual_location`, `feature_share_capture`, `feature_share_preview`, `feature_share_imgonmap_preview`, `feature_connected_drive`, `email_setting_on`
- **Integrity**: `detect_fake_gps`, `detect_vpn`
- **Funnel**: `flow_language_selection_screen`, `flow_onboarding`, `flow_permission_screen` — one-shot flags `IS_LANGUAGE_EVENT_SEND`, `IS_ONBOARD_EVENT_SEND`, `IS_PERMISSION_EVENT_SEND`
- **Language**: `language` + ~20 `language_*` events (English, Hindi, Kannada, Tamil, Marathi, Gujarati, Bengali, Indonesian, Vietnamese, Thai, Portuguese, Russian, French, Korean, German, Chinese, Italian, Spanish, Malay…)
- `a8a.a(this,"click_drive_promo_notif",…)` — notification-tap analytics in `Splash_Screen`

Analytics backends: Facebook SDK events (class name + Facebook components in manifest), Firebase Analytics, AdMob attestation (`AD_ID`).

## Push

- **OneSignal** + **Firebase Cloud Messaging** components in manifest
- `POST_NOTIFICATIONS`, `WAKE_LOCK`, `FOREGROUND_SERVICE`, `RECEIVE_BOOT_COMPLETED`

## Local notification campaigns (`LocalNotification.AlarmReceiver`, `AutoStart`)

`AlarmReceiver` schedules `AlarmManager.AlarmClockInfo` wake-ups keyed by `alarm_time_*` prefs (16 campaign keys): `15_days` (win-back), `2nd_day`, `3_time_no_buy`(+`_stan`), `10_times_open`, `45/100/500_photos`, `50_photos_pro`, `camset/file/fold/font/map/stamppos/temp_open_time` (feature-discovery nudges). `AutoStart` re-arms on `BOOT_COMPLETED`. Notification channel + `PendingIntent.getBroadcast` (FLAG_IMMUTABLE 0x8000000) on API≥31.

## Engagement counters

`app_count`, `COUNT_DAYS`, `LAST_COUNT_DAY`, `open_time`, `VIDEO_COUNT`, `language_count`, `GALLERY_IMAGE_CLICK_COUNT`.
