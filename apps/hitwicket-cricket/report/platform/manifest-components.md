# Manifest & Components

**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 (205957) — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`
Evidence: `inspect_android_package` ev_53eae69d… / decoded manifest ev_f622a3eb…

## Identity & SDK levels [observation]
- package `cricketgames.hitwicket.strategy`, versionName `12.43.0`, versionCode `205957`
- minSdk 24, targetSdk 36, compileSdk 36 ("16")
- `installLocation="preferExternal"`, `requiredSplitTypes="base__abi"`, `appCategory="game"`, `extractNativeLibs="false"`
- `android:name="com.safedk.android.SafeDKApplication"` — app object is SafeDK wrapper [observation]

## Application components — 118 total [observation]
61 activities / 23 services / 20 receivers / 14 providers.

### App-owned (`cricketgames.hitwicket.strategy.*`)
| Component | Kind | Notes |
|---|---|---|
| `HitwicketUnityPlayerActivity` | activity | Launcher, `singleTask`, `userLandscape`, deep links `hitwicket://`, `https://playhitwicket.go.link` (autoVerify). Methods: `handleNotification`, `handleShortcut`, `sendNotificationTracker`, `trackSdkDrawnTap` (ev_e7367d9d…) |
| `services.alarmscheduler.AppMonitorService` | service | exported, `:pn` process; `scheduleOnClose`, `onTaskRemoved` (ev_9b35a52f…) |
| `services.alarmscheduler.AndroidAlarmReceiver` | receiver | BOOT_COMPLETED, perm `RECEIVE_BOOT_COMPLETED`, `:pn` |
| `services.notificationhandlers.CustomFirebaseMessageService` | service | MESSAGING_EVENT, dedupes `google.message_id` in 16-entry LRU, `queueDeliveryTrackers` (ev_93a02fe6…) |
| `services.whatsappauth.WhatsAppAuthenticator` | receiver | `com.whatsapp.otp.OTP_RETRIEVED`, uses `com.whatsapp.otp.android.sdk` (ev_7fefddb0…) |

### Third-party (selected)
- **Ads:** AppLovin `AppLovinFullscreenActivity`, `FullscreenAdService`, 17 `MaxDebugger*`/`MaxCreativeDebugger*` activities (debug UI ships), `MobileAdsInitProvider`, AdMob `AdActivity`/`AdService`/`MobileAdsInitProvider`, InMobi `InMobiAdActivity`/`InMobiInAppBrowserActivity`, ironSource `ControllerActivity`/`InterstitialActivity`/`OpenUrlActivity`/`InlineStoreActivity`/`TestSuiteActivity` + 2 lifecycle providers, Mintegral `MBRewardVideoActivity`/`MBCommonActivity`/`LoadingActivity`/`NetWorkChangeReceiver`, Facebook `AudienceNetworkActivity`/`AudienceNetworkContentProvider`, Unity Ads `FullScreenWebViewDisplay`
- **Firebase:** `FirebaseMessagingService`, `CustomFirebaseMessageService`, `FirebaseInstanceIdReceiver`, `GenericIdpActivity`, `RecaptchaActivity`, `AppMeasurement*` (rcv+2 svc), `SessionLifecycleService`, `FirebaseInitProvider`, `ComponentDiscoveryService`, `MessageForwardingService`, cpp `ListenerService`/`RegistrationIntentService`
- **Play:** `AssetPackExtractionService`, `ExtractionForegroundService`, `HsdpShimActivity`, `PlayCoreDialogWrapperActivity`, `ProxyBillingActivity`/`V2`, games `GenericResolutionActivity`/`NativeBridgeActivity`
- **Facebook:** `FacebookActivity`, `CustomTabActivity`/`CustomTabMainActivity`, `FBUnity*` (8 unity bridge activities), `FacebookContentProvider` (authorities `com.facebook.app.FacebookContentProvider352799898867812`), `FacebookInitProvider`, token receivers
- **androidx/infra:** WorkManager `SystemAlarmService`/`SystemJobService`(exported)/`SystemForegroundService` + 7 receivers (incl. DiagnosticsReceiver exported), `InitializationProvider`, `FileProvider`, `ProfileInstallReceiver` (exported), Room `MultiInstanceInvalidationService`, credentials `HiddenActivity`
- **Other:** `AdjustReferrerReceiver` (INSTALL_REFERRER, perm INSTALL_PACKAGES), `SystemLifecycleContentProvider`, `PicassoProvider`, `yasirkula NativeShare*` (activity/receiver/provider), `TransportBackendDiscovery`/`JobInfoSchedulerService`/`AlarmManagerSchedulerBroadcastReceiver` (datatransport), `HSdpShim`

## Queries (package visibility) [observation]
WhatsApp(+w4b), Messenger, Facebook, Twitter/X, Telegram, UPI apps (`com.google.android.apps.nbu.paisa.user`, `com.phonepe.app`, `net.one97.paytm`, `in.org.npci.upiapp`, `com.cred`, `com.amazon.pay`), `upi://` scheme, `com.android.vending`, `market://`, sms/tel, CustomTabs, SEND/SEND_MULTIPLE `*/*`, Play Billing bind + BillingOverrideService, **root managers** (`com.topjohnwu.magisk`, `eu.chainfire.supersu`, `com.noshufou.android.su`, `com.koushikdutta.superuser`, `com.thirdparty.superuser`), `com.attribution.REFERRAL_PROVIDER`.

## Key meta-data [observation]
`com.facebook.sdk.ApplicationId=fb352799898867812`, `ClientToken=eea1f229bec9669c99db06c9d6cd4049`, AutoLogAppEvents+AdvertiserIDCollection=true; `com.google.android.gms.ads.APPLICATION_ID=ca-app-pub-2285939887669849~2813384647`; `applovin.sdk.verbose_logging=true` (debug flag shipped); `com.google.android.gms.games.APP_ID=352216829522`, games unityVersion 0.10.11; `com.google.android.play.billingclient.version=9.0.0`; `play.core.assetpacks.versionCode=20100`; `custom_notification_android_activity=HitwicketUnityPlayerActivity`; Unity splash/notch/game_mode config; `android.webkit.WebView.EnableSafeBrowsing=true`; `com.android.vending.splits.required=true`, `derived.apk.id=4`, Play source stamp; Firebase ComponentRegistrars (perf, messaging, auth, iid, remoteconfig, crashlytics+ndk, analytics connector, sessions, installations, common, abt, datatransport).

## Signature [observation — ev_39282c91…]
v2+v3 schemes, single signer cert sha256 `d83d4e138bb7f9c28c665375bb0780a9691ce7f1f555066d7f49764de3678808` for both; no v1, no rotation lineage; Play source stamp cert `3257d599a4…`; `self_consistent=true` (declared digest matches bytes). Signature not cryptographically verified (tool limit).
