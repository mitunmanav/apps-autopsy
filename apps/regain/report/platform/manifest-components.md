# Manifest & Declared Components

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a` (`base.apk`)
**Evidence:** `ev_a9d40f3193a49f14ef20f3e2037d83b3d63d9c2c424ed26a45dc102ce4353c0c` (package+manifest), decoded manifest `ev_1637201fd5751511c3e5e2487dc16e12885c3fde34fba2c8ba3ad42f64c7f761` → `analysis/AndroidManifest.xml`

## Application element (OBS)

`ai.blox100.MyApplication`, theme `AppTheme.Dark.SplashScreen`, `allowBackup="false"`, yet `fullBackupContent="@xml/backup_rules"` + `dataExtractionRules` (both exclude only `sharedpref/secure_prefs.xml`), `networkSecurityConfig` set, `extractNativeLibs="false"`, `profileable shell`, `CoreComponentFactory`.

## Component totals (OBS, complete inventory: 121)

| Kind | Count | App (`ai.blox100`/`ai.regainapp`) | Library |
|---|---|---|---|
| activity | 34 | 20 | 14 |
| service | 28 | 11 | 17 |
| receiver | 51 | 33 | 18 |
| provider | 8 | 3 | 5 |

## Entry points (OBS)

- **Launcher:** `ai.blox100.HomePageActivity` (MAIN+LAUNCHER; also VIEW for deep links `link.regainapp.ai`, `join.regainapp.ai`, `gift.regainapp.ai`, `invite.regainapp.ai`, `regainapp://internal`).
- **HOME handler:** `ai.blox100.ProxyLauncherActivity` (MAIN + `category.HOME` + DEFAULT) — Regain can act as home launcher; code forwards to the real launcher (see `tools/launcher.md`).
- `ai.regainapp.showcase.MainActivity` + `CustomBrowserActivity` (not exported).

## Exported surface (OBS)

Exported app components without permission guards: `OverlayActivity`, `OverlayActivitySupportsLandscape`, `PermissionStepsOverlayActivity`, `PMTagOverlayActivity`, `AccessibilityPermissionActivity`, `SubscriptionActivity`, `BlockShortsOverlayActivity`, `FTOverlayActivity`, `BlockProtectionActivity` (all `VIEW`, `regainapp://overlay…` style deep links), `HomePageActivity`, `ProxyLauncherActivity`, `RegainDeviceAdminReceiver` (device-admin actions), 9 widget receivers (`APPWIDGET_UPDATE`), `AppStartReceiver`, `MyMonitorService` (exported, no declared permission — INF: callable by other apps), `MyMonitorInAppBlockService` (AccessibilityService, bound by system), `NotificationListener` (NotificationListenerService), `MyFirebaseMessagingService` (FCM), `FTOverlayService`, `PMFloatingButtonService`, `ActiveBlocksFloatingButtonService`, `FocusTimerNotificationService`, `MediaPlayerService`, `GlanceRemoteViewsService`, `DiagnosticsReceiver`, `ProfileInstallReceiver`, `Facebook CustomTabActivity`, `Razorpay DeeplinkActivity`, `RevocationBoundService`, `FirebaseInstanceIdReceiver`, `Compose PreviewActivity` (exported — INF: dev leftover).

## Key meta-data (OBS)

`google_analytics_adid_collection_enabled=true`, Facebook `sdk.ApplicationId`/`ClientToken` (resource refs), `android.app.device_admin → @xml/device_admin_policies` (`<force-lock/>` only), `accessibilityservice → @xml/accessibility_service_config` (typeAllMask, canRetrieveWindowContent, reportViewIds, retrieveInteractiveWindows, 500 ms timeout), 9 `@xml/*_widget_info` appwidget providers, `billingclient.version=8.0.0`, Firebase component registrars (Analytics, Messaging, Crashlytics, RemoteConfig, Perf, Sessions, Installations, Datatransport, Abt), CameraX `MetadataHolderService`, `autoStoreLocales=true`, Rive `RiveInitializer`, Room `MultiInstanceInvalidationService`, 8× `PROPERTY_SPECIAL_USE_FGS_SUBTYPE`.

## Queries block (OBS)

~100 packages: nearly every Indian UPI app (Paytm, PhonePe, GPay-nbu, BHIM variants, bank apps) → confirms Razorpay UPI intent flow; OEM battery/autostart package names (miui, coloros, vivo, huawei, asus, oneplus, samsung, evenwell, letv); TTS service; WhatsApp (×2); Facebook katana; image capture; `upi:`/`credpay:` schemes; SEND intents; InAppBillingService + BillingTestCompanion binds.

## Splits (OBS)

`requiredSplitTypes="base__abi,base__density"` — base.apk plus `split_config.arm64_v8a.apk` (3 AndroidX libs) and `split_config.xxhdpi.apk` (density drawables). Not analyzed (out of scope per task).

## Signature (OBS, evidence `ev_9e88c3ba…`)

v2+v3, single signer, cert SHA-256 `83bce5d85f10817652ce823ab828eb23960fed90090f1eed1ee754b74cfcdef4`, source stamp `3257d599…6d` present, `self_consistent=true`, no rotation. UNK: authenticity unverified (REA does not verify signatures).
