# Permissions

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`. 22 `uses-permission` entries `[obs]`; consumers `[inf]` from code refs.

| Permission | Static consumer `[inf]` |
|---|---|
| `INTERNET` | Retrofit/OkHttp everywhere (tasks, R2, Keycloak, Firebase) |
| `ACCESS_NETWORK_STATE` | WorkManager constraints + offline checks |
| `WAKE_LOCK` | WorkManager/foreground sync |
| `CAMERA` (+ `uses-feature` camera) | `ScannerActivity` CameraX |
| `POST_NOTIFICATIONS` | `FreeTaskAvailableNotificationPoster` gate |
| `FOREGROUND_SERVICE`, `FOREGROUND_SERVICE_DATA_SYNC` | document sync worker |
| `AUTHENTICATE_ACCOUNTS` | `AndroidAuthenticatorService` |
| `com.android.vending.BILLING` | Play Billing |
| `USE_BIOMETRIC`, `USE_FINGERPRINT` | Biometric lock (auth/account) |
| `RECEIVE_BOOT_COMPLETED` | WorkManager reschedule receiver |
| `BIND_GET_INSTALL_REFERRER_SERVICE` | Play install referrer (AppsFlyer) |
| `AD_ID`, `ACCESS_ADSERVICES_AD_ID`, `ACCESS_ADSERVICES_ATTRIBUTION` | Ads/attribution IDs |
| `REORDER_TASKS` | Activity task reordering |
| `DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` (signature, self) | Guards in-app dynamic receivers |
| `com.samsung.android.mapsagent.permission.READ_APP_INFO` | Samsung store referrer |
| `com.huawei.appmarket.service.commondata.permission.GET_COMMON_DATA` | Huawei store referrer |
| `com.android.vending.CHECK_LICENSE` | Play license check (Pairip/LVL) `[inf]` |

Notably **absent** `[obs]`: no `READ/WRITE_EXTERNAL_STORAGE`, no `READ_MEDIA_*` — file access is via SAF/`DocumentsContentProvider` + `FileProvider` (minSdk 32 scoped storage) `[inf]`.
