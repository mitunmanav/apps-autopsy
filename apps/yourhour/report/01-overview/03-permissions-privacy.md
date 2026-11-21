# 03 — Permissions & Privacy

## Declared permissions (manifest)

| Permission | Used for |
|---|---|
| `PACKAGE_USAGE_STATS` | the entire tracking engine (special-access, granted via Settings → Usage Access; app polls `AppOpsManager.get_usage_stats`/`appops` pref in onboarding) |
| `SYSTEM_ALERT_WINDOW` | floating timer, auto-lock screens, Mindful Pause, reel-block overlay fallback, app-lock overlay |
| `FOREGROUND_SERVICE` + `FOREGROUND_SERVICE_SPECIAL_USE` / `_DATA_SYNC` / `_SYSTEM_EXEMPTED` | `UsageTimerService` (type `1073741824` = specialUse on API 34+), sync and exempted helpers |
| `POST_NOTIFICATIONS` | all notification channels |
| `RECEIVE_BOOT_COMPLETED`, `QUICKBOOT_POWERON`, `MY_PACKAGE_REPLACED` | BootCompletedReceiver + WidgetSystemReceiver restart tracking after boot/upgrade/timezone/date/locale change |
| `WAKE_LOCK` | keep polling loop alive during critical work |
| `VIBRATE` | reminder/alert notifications |
| `REQUEST_IGNORE_BATTERY_OPTIMIZATIONS` | onboarding prompt; PowerManager check in dashboard |
| `KILL_BACKGROUND_PROCESSES`, `GET_TASKS`, `REORDER_TASKS` (legacy) | task management for enforcement (kill/bring-forward patterns) |
| `QUERY_ALL_PACKAGES` | full installed-app inventory for monitor list & categories — broad visibility by design |
| `READ/WRITE_EXTERNAL_STORAGE` (+ legacy flag) | XLS/DB export, profile pictures |
| `WRITE_INTERNAL_STORAGE` | rare signature-level permission — requested; no app code path found that requires it *(likely defensive/legacy declaration)* |
| `READ_PHONE_STATE` | device identity for analytics/auth |
| `INTERNET`, `ACCESS_NETWORK_STATE`, `ACCESS_WIFI_STATE` | backend, ads, Firebase |
| `com.android.vending.BILLING`, `CHECK_LICENSE` | subscriptions + pairip license check |
| `AD_ID`, Android Ad Services (`ACCESS_ADSERVICES_*`, TOPICS/ATTRIBUTION/AD_ID) | AdMob/FAN/Unity personalization |
| `com.google.android.c2dm.permission.RECEIVE`, `fcm` perms, `MEASUREMENT` | FCM pushes + Firebase Analytics |
| `BIND_DEVICE_ADMIN` (YourHourAdminReceiver) | anti-uninstall option; `res/xml/device-admin` declares **no policies** — presence alone keeps the app in device-admin list |
| custom `DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` | signature-level guard for internal receivers |

## Runtime-only gates

- **Accessibility** (`ReelDetectorAccessibilityService`): user must enable in Settings →
  Accessibility; service self-detects grant via `onServiceConnected`, applies the queued
  `pending_blocker_enable_target`, restarts the app, logs `reel_blocker_toggle_changed`.
- **Overlay**: `Settings.ACTION_MANAGE_OVERLAY_PERMISSION` deep-links per feature
  (`reel_blocker_enable_blocked` with `missing_permission=overlay`).
- **Device admin**: activate/cancel logged in ManageSettingActivity ("Device Admin Activated/Cancelled").

## What leaves the device

| Destination | Data |
|---|---|
| `tv-api.yourhourapp.com` | account (Google sign-in), FCM token, paired-device usage summaries + app lists (`usageSyncedAt`, `appsSyncedAt`), locks/overrides state, backups, config |
| Firebase Analytics | ~150+ custom events (screen opens, toggles, purchases, funnel) — see per-feature files |
| Crashlytics | every caught exception via `u83.a().b(e)` |
| Ad networks (AdMob `pub-3128150064662905`, FAN `assets/audience_network` dex, Unity) | ad requests, AD_ID, device signals |
| Facebook SDK | app ID `670696773447420`, client token in resources |

## Privacy notes

- `QUERY_ALL_PACKAGES` + usage access = full app-inventory + per-app daily timing; this is the
  product's function but is maximal-scope.
- Parental feature transmits per-app usage to paired TV devices — by design remote surveillance
  of the phone user; consent is via Google-account pairing (see 18).
- Backup flags `allowBackup`/`fullBackupOnly` permit ADB/cloud backup of the local DB.
- `requestLegacyExternalStorage` + storage perms widen file exposure on older devices.
- OkHttp logging set to BASIC (headers) — request/response metadata could reach logcat on debug builds.
