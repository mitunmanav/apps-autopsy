# Third-Party SDKs & Libraries

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`

All OBS from `classes*.dex` package prefixes + manifest components/meta-data.

| SDK | Evidence / role |
|---|---|
| Jetpack Compose + material3, coil3 | UI; `coil3.*`, `coil.*`, `com.kmpalette` (image→theme palette). |
| WorkManager 2.x | `androidx.work.impl` + SystemForegroundService/SystemJobService/SystemAlarmService/RescheduleReceiver + all Constraint proxies (charging/idle/network/battery/storage). |
| Room | 17+ `*_Database`/`_Impl` classes + MultiInstanceInvalidationService. |
| CameraX + androidx.graphics.path + Camera2Interop | `androidx.camera.*`, JNI bindings on `libimage_processing_util_jni.so`, `libsurface_util_jni.so`, `libandroidx.graphics.path.so` (all androidx, in arm64 split). |
| Firebase full stack | Analytics, Crashlytics, Perf+Sessions, Messaging, Installations, RemoteConfig (default config embedded), Datatransport, A/B testing (`firebase_abt`, `/auth/auth/experiment/enroll`). |
| Google Play Billing **8.0.0** | `com.android.billingclient`, `billingclient.version=8.0.0`, BillingTestCompanion bind. |
| RevenueCat | `com.revenuecat.purchases` — subscription orchestration layer. |
| Razorpay | `com.razorpay` `CheckoutActivity`, `DeeplinkActivity` (UPI intents — ~100 UPI packages queried). |
| Facebook SDK | `com.facebook` CustomTabActivity + ApplicationId/ClientToken meta-data. |
| Media3/ExoPlayer | `androidx.media3.*` `MediaPlayerService`, `MediaSessionService` (focus music / preview video). |
| Glance | `androidx.glance.*` — all 9 home widgets. |
| Jitsu (self-hosted) | `jitsuStaging` client → `analytics.regainapp.ai`. |
| OpenTelemetry | OTel exporter → `otel.regainapp.ai/v1/traces` (staging/production env switch, embedded API key). |
| Mixpanel (INF) | `logHeartBeatInMixPanel`, `LastLoggedInMixPanelBS` identifiers. |
| Retrofit2/OkHttp/Gson + kotlinx-serialization | API layer; Gson `@SerializedName` on kept models. |
| KSP/Kotlin-serialization JSON; protobuf-lite | Model codecs; DataStore protobuf. |
| Showkase (Airbnb) | Compose showcase browser (`ai.regainapp.showcase`). |
| logback + slf4j | `ch.qos.logback.*` + `assets/logback.xml` → file logging uploaded via `/send_feedback/logs`. |
| Lottie + Rive | `com.airbnb.lottie`, `app.rive` + RiveInitializer. |
| canhub cropper | `CropImageActivity` (profile photo). |
| Markwon (INF) | `io.noties.markwon` markdown rendering (AI coach / in-app text). |
| mpandroidchart (INF) | `com.github.mikephil.charting` — usage charts. |
| desugar JDK libs, jsoup | `j$.time`, `org.jsoup` (HTML parsing — ob_hammer scene / web scraping aid). |
| googleads/UMP | `com.google.android.gms.ads`, User Messaging Platform consent form strings. |
| Play AppUpdate/Review/InstallReferrer | in-app update + rating + attribution. |
| zxing (INF) | `com.google.zxing` QR (invite codes / payments). |
| DataStore, Lifecycle, Navigation, SplashScreen, AppCompat, recyclerview, viewpager2, swiperefresh | standard androidx. |
| Kotlin/Compose Baseline Profile | `androidx/profileinstaller` + `assets/baseline-prof.*`. |
| Health connect client (present, INF dormant) | `androidx.health.connect.client` classes bundled, no declared HC permission. |
| Cronet + Volley + grpc-lite | `org.chromium.net`, `com.google.vr`, grpc — bundled via Play Services libs (INF: Firebase/Media3 transports). |
| Apache POI `poi-ooxml`, `dom4j` | server-export helpers? INF: likely for report/docx generation share or leftover lib. |

No ad-network mediation, no Unity, no crash-silent packer, no DexProtector-style string encryption observed.
