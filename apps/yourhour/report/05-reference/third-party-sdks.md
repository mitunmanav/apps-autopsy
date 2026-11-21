# Reference — Third-Party SDK Census

DEX class census of `classes.dex` — **the ad stack is far bigger than the earlier
3-network estimate**. This supersedes the AdMob/FAN/Unity-only list in
`../03-analysis/28-integrations.md`.

## Ad mediation stack — 17 networks detected in DEX

| Network | Class hits | Notes |
|---|---|---|
| ByteDance/**Pangle** | 99 | |
| **Smaato** | 89 | |
| Unity Ads | 77 | also `com.unity3d.services.ads.adunit` activities |
| **Mintegral** | 76 | |
| **AppLovin** | 73 | likely the mediation layer (MAX) |
| Google **AdMob** | 61 | `ca-app-pub-3128150064662905` |
| **Vungle** (Liftoff) | 58 | |
| **Fyber** (Digital Turbine) | 56 | |
| **IronSource** (LevelPlay) | 54 | |
| Meta **FAN** | 182 (incl. embedded dex) | `assets/audience_network/` |
| **InMobi** | 24 | |
| **Amazon** Publisher Services | 22 | |
| **Chartboost** | 20 | |
| **Tapjoy** | 20 | |
| **myTarget** (VK) | 19 | |
| **Yandex** Ads | 18 | |
| **Moloco** | 17 | |

**Correction**: this is a ~17-network mediation waterfall (AppLovin MAX or LevelPlay
style), not a 3-SDK setup. The `native_ad_*`/interstitial/rewarded slot keys map onto this
mediation layer. OMSDK (`assets/ad-viewer/omid-*.js`) provides IAB viewability across all of them.

## Analytics / attribution — **none beyond Firebase+Facebook**

Swept for AppsFlyer, Adjust, Branch, Singular, Kochava, Mixpanel, Amplitude, Segment,
Braze, CleverTap, MoEngage, OneSignal — **zero matches**. Attribution is Firebase-only;
push is direct FCM (no third-party push SDK).

## Platform / Google stack

Firebase (Analytics, Crashlytics, Messaging, Firestore, RTDB, sessions, iid,
componentDiscovery, InitProvider) · Google Sign-In (`SignInHubActivity`,
`RevocationBoundService`, `GenericIdp/Recaptcha`) · Play Billing (`ProxyBilling{,V2}`) ·
Play Core in-app updates (`PlayCoreDialogWrapperActivity`) · pairip integrity ·
GMS Measurement + datatransport · androidx credentials · Android Ad Services
(`ACCESS_ADSERVICES_*`).

## App-framework stack

Room (+`MultiInstanceInvalidationService`) · WorkManager (+SystemJob/Foreground services,
RescheduleReceiver, DiagnosticsReceiver) · Glance (widgets) · ProfileInstaller (baseline.prof) ·
Datastore (`libdatastore_shared_counter.so`) · androidx graphics (`libandroidx.graphics.path.so`) ·
Compose · Lifecycle/ViewModel · Startup provider · Credentials.

## Feature libs

UCrop (`canhub.cropper` `CropImageActivity`+`CropFileProvider`) · Lottie · OkHttp/Retrofit
(+ Cronet `keep_cronet_api.xml`) · JExcel/`jexcelapi` (XLS export — the `andykhan.com/jexcelapi`
string) · Facebook SDK (login/share/analytics) · Inter/Montserrat/OpenSans/Raleway fonts.

## Size insight

The app's *own* code is ~136 named classes + ~800 obfuscated (~20 KLOC readable); the
~26k-class total is overwhelmingly SDK bulk — the ad stack alone is thousands of classes.
