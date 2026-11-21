# Third-party SDK inventory

From class packages + native libs (19,020 classes). Counts approximate.

| SDK | Packages/libs | Purpose |
|---|---|---|
| **Microsoft Fluency** | `com.microsoft.fluency`, `com.touchtype_fluency.*`, `libfluency-java-internal.so` | Prediction/typing engine (1st-party core) |
| **Microsoft HWR** | `com.microsoft.hwr`, `libhwr_jni.so` | Handwriting recognition |
| **ONNX Runtime** | `ai.onnxruntime.*`, `libonnxruntime.so`, `libonnxruntime4j_jni.so` | On-device ML (Whisper/AI modules) |
| **MSAL/OneAuth** | `com.microsoft.identity.*` (~536 classes) | Microsoft account auth |
| **TokenShare** | `com.microsoft.tokenshare.*` | Cross-app SSO |
| **Firebase/FCM** | `com.google.firebase.*` | Push, init |
| **Play Core** | `com.google.android.play.core.*` | Dynamic delivery, in-app updates, SplitCompat |
| **AndroidX** | `androidx.*` (startup, datastore `libdatastore_shared_counter.so`, graphics-path lib, etc.) | Platform plumbing |
| **Adjust** | `com.adjust.sdk.*`, `libsigner.so` | Attribution |
| **Xandr/AppNexus** | `com.appnexus.*`, `AdActivity` | Ads |
| **GIPHY** | GIPHY API client | GIFs |
| **Klipy** | `com.klipy.*` | GIFs/stickers + ads |
| **Tenor** | tenor_gifs config | GIF search (key via BiBo) |
| **Fresco** | `com.facebook.fresco`/`drawee` | Image pipeline (GIF/WebP display; debug toggle) |
| **Lottie** | `com.airbnb.lottie`, `assets/lottie/*` | Animated illustrations (sign-in carousel etc.) |
| **Material/components** | `com.google.android.material` | Settings/UI widgets |
| **Avro** | `org.apache.avro` | Telemetry serialization |
| **BouncyCastle-ish/crypto** | within `com.microsoft.identity` | Auth crypto |
| **Gson/Jackson** | `*Gson` names, json libs | Config/model parsing |
| **okhttp/okio** | `okhttp3` | HTTP client |
| **Google Tink** | `com.google.crypto.tink.shaded` (76, shaded) | Crypto — likely inside MSAL/GMS encrypted storage |
| **Nimbus JOSE+JWT** | `com.nimbusds.jose.shaded.*` (~300, shaded) | JWS/JWE/JWK/JWT — TokenShare + MSAL token handling |
| **Certificate Transparency** | `com.appmattus.certificatetransparency` (27) | CT log-list verification for TLS |
| **Google Tag Manager + Analytics** | `com.google.android.gms.tagmanager` (37), `…gms.analytics` (5), `…datatransport` | GTM containers + GA + Firebase transport upload path |
| **AndroidX Credentials + FIDO** | `androidx.credentials.*` (50), `…gms.fido` | Credential Manager — passkeys (`CreatePublicKeyCredential`, `BeginSignIn`, `GetSignInIntent`, `CreatePassword`, `CredentialProviderService`) |
| **Trusted Web Activity** | `com.google.androidbrowserhelper.trusted` (5), `customtabs.trusted.*` meta-data | Chrome Custom Tabs/TWA wrapper for Bing/Copilot pages |
| **YubiKit** | `yubikit_*` strings | YubiKey NFC/USB OTP+PIV sign-in |
| **Install Referrer** | `com.android.installreferrer.api` | Play referrer API |
| **PaperBoy** | `net.swiftkey.androidlibs.paperboy` | SwiftKey's internal network library |
| **Guava** | `com.google.common.cache` | Collections/cache |
| **Jetpack Compose** | `com.skydoves.compose.stability` (+ compose runtime) | Declarative UI (used somewhere in settings/AI surfaces) |
| **Avro telemetry** | `com.swiftkey.avro.telemetry` + `org.apache.avro` | Event schema serialization |
| **js-bridge** | `assets/js-bridge.js` | WebView bridge for Bing/cards HTML (`assets/bing_hub`, `web_search`) |

1st-party-ish but shipped as packages: `com.touchtype*` (app), `com.swiftkey.*` (voice/signin/di), `com.microsoft.fluency`, `com.microsoft.hwr`.
