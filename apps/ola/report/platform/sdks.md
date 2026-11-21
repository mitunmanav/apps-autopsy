# Third-Party SDKs — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`
Evidence = package/class presence in DEX + components/keys in resources. Presence proves bundling, not active use.

| SDK | Evidence (obs) | Config strings observed |
|---|---|---|
| React Native + Hermes | `com.facebook.react.*`, `libreactnative/libhermes`, `index.android.bundle` v96, `PaymentReactActivity` | RN dev prefs present |
| CodePush | `com.microsoft.codepush.react.*` | deployment key string embedded |
| Juspay HyperSDK | `in.juspay.hypersdk*`, `.jsa` assets, `juspay://` scheme | `client_id=olacabs`, merchant `olacabs_production`, `https://assets.juspay.in`, `https://logs.juspay.in/godel/analytics` |
| Razorpay (+ UPI Turbo) | `com.razorpay.*`, turbo_view activities | test+live key strings, `rzp_*` prefs |
| NPCI UPI Common Lib | `org.npci.upi.security.pinactivitycomponent.*` | GetCredential/CLRemoteServiceImpl exported |
| PayU | classes + `RechargePayUActivity` | merchant key string |
| Amazon Pay | `com.amazon.android.apay.*`, `amzn://` scheme | api.amazon.co.jp/.uk hosts |
| Firebase | messaging/IID/sessions/measurement services, `FirebaseInitProvider` | `olacabs-gcm.firebaseio.com`, `olacabs-gcm.appspot.com` |
| Xiaomi MiPush | `com.xiaomi.*`, `:pushservice` proc, MIPushProvider | app key `5181756299289` |
| MoEngage | `com.moengage.*`, `com.moe.pushlibrary.*` | key `9OWELA5U9CHR1O1MCZWRCF55` |
| AppsFlyer | `com.appsflyer.*` + OneLink host | dev key `xS59cBFU3e3Rxq2RyzcxaG` |
| Facebook SDK | `com.facebook.*` (login/share/CustomTab) | fbconnect scheme, client token |
| Google Play Services | auth/signin, ads.mobile.sdk, measurement, play-core (assetpacks, review, update) | OAuth client id, Maps keys |
| MapLibre + Ola Maps | `libmaplibre.so`, `com.ola.maps*`, NavigationService | `maps.olaelectric.com` host |
| WorkManager / Room / DataStore | androidx services/providers | — |
| Coil + Fresco | `coil.*`, `com.facebook.imagepipeline` + native libs | — |
| Chucker | `com.chuckerteam.chucker.*` (obfuscated), internal UI + FileProvider | wiring unverified (interceptor name obfuscated) |
| Stetho | `com.facebook.stetho.*` | **zero xrefs** → dead code (obs) |
| RootBeer | `com.scottyab.rootbeer.*` + `libtoolChecker.so` | — |
| reCAPTCHA | `www.recaptcha.net/recaptcha/api3` string | site key string |
| Volley | `com.android.volley.*`, `OlaDiskBasedCache` | legacy stack |
| MQTT client | `MqttSdk`/`MqttConnectionConfig` classes (in tracker) | broker config server-supplied (inf) |
| nimbus-jose JWT | `com.nimbusds.jose.*` | token handling (inf) |
| Primer / local telemetry | model classes under watson package | Sherlock pipeline (inf) |
| ZXing/QR | `com.olacabs.qrcode_reader.*` | — |
| Facebook imagepipeline/native-filters | native libs | — |
| Appsflyer OneLink | `olacabs.onelink.me` deeplink | — |
| In-app update (Play) | `com.google.android.play.core.*` | — |

**Note:** All keys above are client-side config strings shipped in the APK (obs). Their server-side validity is unk; treat as embedded public configuration, not leaked secrets.
