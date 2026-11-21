# SDKs

**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 (205957) — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

## Ad stack [observation]
- **AppLovin MAX** (MaxSdk.Scripts + native): mediation host; `applovin.sdk.verbose_logging=true`, AppLovinInitProvider, `FullscreenAdService`, `AppRestartDuringAdDetectionService`, `libapplovin-native-crash-reporter.so`
- **Google AdMob** `ca-app-pub-2285939887669849~2813384647`, OPTIMIZE_INITIALIZATION/AD_LOADING
- **Meta Audience Network** — `AudienceNetworkActivity`, plus **2 embedded dex bundles** `assets/audience_network/classes{,2}.dex`
- **InMobi** — activities + `res/raw/inmobi_omid_js.js`, `omsdk_v1_6_2.js` (OMID viewability)
- **ironSource / LevelPlay** — controller/interstitial/test-suite activities, lifecycle providers
- **Mintegral (MBridge)** — MB* activities, NetWorkChangeReceiver, assets `iads/` + `mbridge_download_dialog_view.xml`, `rv_binddatas.xml`, `template/` playable ad layouts
- **Unity Ads** — `FullScreenWebViewDisplay`, `AdsSdkInitializer` via androidx.startup
- **OM SDK** — `assets/ad-viewer/omid-session-client-v1.js`, `omsdk-v1.js`

## Firebase [observation]
Analytics/measurement, Auth (GenericIdp+Recaptcha), Cloud Messaging (custom service + cpp listener), Crashlytics (incl. NDK libs + sessions), Remote Config, Performance Monitoring, Installations, ABT, datatransport (cct backend). `google-services-desktop.json` in streaming assets: project `hitwicketsuperstars` #352216829522, api_key `AIzaSyBtRr…[redacted]`, firebaseio RTDB URL, appinvite service enabled (package `com.hitwicketgames.cricket` — legacy package name in config) [observation].

## Attribution / marketing [observation]
- **Adjust SDK** — `AdjustReferrerReceiver`, `libsigner.so` signature lib, `playhitwicket.go.link` verified domain, `app.adjust.com/18rm68bp` link, `automate.adjust.com/engage/deep-links`
- **Facebook SDK** — app id `352799898867812`, ClientToken `eea1f229bec9669c99db06c9d6cd4049`, AutoLogAppEvents + AdvertiserIDCollection enabled, `graph.{0}/{1}/` API, FB Unity bridge activities, content provider
- **SafeDK** — application wrapper (`SafeDKApplication`) for ad-network control/monitoring [inference of purpose from vendor role]

## Google Play [observation]
Play Billing **9.0.0** (+BillingOverrideService query = test-companion hook), Play Games `APP_ID=352216829522` (bridge activities, `games_lite` + `drive.appdata` OAuth scopes), Asset Delivery (4 asset packs + extraction services, `HsdpShimActivity`), Play Review (`Google.Play.Review.dll`), Play Core common/dialog, licensing `CHECK_LICENSE`, install referrer.

## Unity engine packages [observation — images list]
URP + GPUDriven, Addressables (+Android module), IAP 5.4.2 (+WebshopService, LiveContentAdapterService, Security/Tangle), Notifications.Android, Adaptive Performance (+Google.Android), TextMeshPro, Timeline, UIElements, VFX Graph, Visual Scripting none, Unity.Services.Core 1.18.0 (env `production`), MemoryProfiler, ResourceManager, 2D animation, sprite shape.

## Game middleware [observation]
- **Zenject** DI (867 types) + Zenject-usage
- **Best HTTP** (`com.Tivadar.Best.HTTP`, 1,238 types) — REST/WebSocket client
- **protobuf** (`Google.Protobuf`) — wire models (`Hwsproto`, `Superstars.Proto.*`)
- **Newtonsoft.Json**, Sirenix Odin (serialization+inspector), UniTask, **R3** reactive
- **spine-unity** skeletal anim, **Cinemachine**, DOTween(+Pro), LeTai TranslucentImage, OSA scrollview, Coffee.UIParticle, UIEffect, EasyTextEffects, Beardy grid layout
- **ACTk** Anti-Cheat Toolkit (injection/obscured/speed/wall-hack detectors per vendor strings)
- **Byn.Awrtc** (awrtc) WebRTC plugin + audio_input/output + videoinput modules
- **Lofelt.NiceVibrations** haptics, **MathNet.Numerics**, OpenVATRuntime (vertex anim), AnimatedFlags, EpicLootBox/Victory effects, ErbGameArt, ParticleIngredientPack, colyseus.nativewebsocket, AppleAuth, XiaomiSupport, NativeShare (yasirkula), MetaSports.SuperEngine (+Hitwicket.SuperEngine)
- **BadWords** profanity lists (11 files: en, es, fil, fr, hi, id, mr, pa, pt, te, tl), intro mp4, WhatsApp OTP SDK (`com.whatsapp.otp.android.sdk`)
