# 02 — Manifest, permissions & components

Decoded manifest: `_evidence/AndroidManifest.decoded.xml`. Evidence `ev_f4a6fdad…`.

## Permissions requested

- **Camera/media**: `CAMERA`, `RECORD_AUDIO`, `FLASHLIGHT`, camera autofocus feature, accelerometer, microphone feature
- **Location**: `ACCESS_FINE_LOCATION`, `ACCESS_COARSE_LOCATION`, `ACCESS_MEDIA_LOCATION`
- **Storage**: `READ/WRITE_EXTERNAL_STORAGE` + `requestLegacyExternalStorage="true"` + SAF. **No `READ_MEDIA_IMAGES`/`READ_MEDIA_VIDEO`** — modern scoped-storage media permissions absent in this build
- **Network**: `INTERNET`, `ACCESS_NETWORK_STATE`, `ACCESS_WIFI_STATE`
- **System**: `FOREGROUND_SERVICE`, `RECEIVE_BOOT_COMPLETED`, `POST_NOTIFICATIONS`, `WAKE_LOCK`, `VIBRATE`, `BLUETOOTH_ADMIN`, `USE_BIOMETRIC`/`USE_FINGERPRINT`, `READ_BASIC_PHONE_STATE`
- **Monetization**: `com.android.vending.BILLING`, `com.android.vending.CHECK_LICENSE` (PairIP), `BIND_GET_INSTALL_REFERRER_SERVICE`, `AD_ID`, `ACCESS_ADSERVICES_{AD_ID,ATTRIBUTION,CUSTOM_AUDIENCE,TOPICS}`
- **Push**: `com.google.android.c2dm.permission.RECEIVE`, `…permission.C2D_MESSAGE`
- **Launcher badges**: `READ_APP_BADGE` + ~14 OEM badge permissions (HTC/Huawei/Oppo/Sony/Samsung/everything.badger/majeur)
- Custom signature permission `…DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION`

## Component counts

- **60 activities**, **15 services**, **15 receivers**, **5 providers**

## Exported entry points

- `Splash_Screen` — LAUNCHER entry
- `CameraActivity` — exported for `android.media.action.IMAGE_CAPTURE`, `IMAGE_CAPTURE_SECURE`, `STILL_IMAGE_CAMERA`, `STILL_IMAGE_CAMERA_SECURE` (device camera-button/app integration)
- Third-party component activities: OneSignal, Firebase Messaging service, Facebook, Google Sign-In, Play Core, PairIP license check, CameraX, WorkManager initializers, `androidx.core.content.FileProvider` (photo/video sharing)

## Application activities (feature map)

| Domain | Activities |
|---|---|
| Core | `CameraActivity`, `Splash_Screen`, `MyApplication` |
| Location | `LocationActivity`, `AddLocationActivity` |
| Stamps | `TempletSelectionActivity`, `TempletSettingActivity`, `StampColorActivity`, `HorizontalCustomDate` |
| Reports | `ReportingActivity`, `BefAftReportingActivity`, `BefAftSettingActivity`, `PDFReportingActivity`, `PDFSettingActivity` |
| Media | `MyFilesActivity`, `FolderActivity`, `clusterImage.activity.GalleryActivity`, `clusterImage.activity.ImageClusterActivity`, `clusterImage.activity.PreviewActivity`, `ui.activities.GalleryActivity`, `ui.activities.MediaViewerActivity`, `ui.activities.SingleFolderActivity`, `ui.activities.VideoPlayerActivity` |
| Monetization | `InAppPurchaseActivity` |
| Cloud | `GDFolderActivity` |
| Config | `SettingActivity`, `SubSettingActivity`, `FileName_Activity`, `EmailSettingActivity`, `PrimaryRecipientActivity`, `SecondaryRecipientActivity`, `NoteActivity`, `LanguageSelectionActivity` |
| Onboarding | `OnBoardingActivity`, `Permission_Activity` |
| Support | `FAQScreen`, `UserGuide_Activity`, `UserGuide_Answer_Activity`, `VideoTutorial`, `Send_An_Error`, `Privacy_Policy`, `MoreAppsActivity` |
| Obfuscated | `activity.fK.sKkO`, `ui.activities.hP.IocDDCWAufvgdf`, `sticker.CJbv.PwHGfuszkTw` |

## Background components

- `LocalNotification.AlarmReceiver` — scheduled engagement/promo notifications (16 `alarm_time_*` keys, see 18)
- `LocalNotification.AutoStart` — `BOOT_COMPLETED` receiver re-arms notification alarms
- Firebase Messaging service + A/B testing (`AbtRegistrar`), OneSignal (incl. HMS + boot/upgrade/dismiss receivers), WorkManager `SystemForegroundService`
- Billing `ProxyBillingActivity(V2)` and `com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND` — Play billing test-companion hook declared in the release manifest
