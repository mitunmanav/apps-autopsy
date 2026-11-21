# 02 — Architecture & obfuscation

## Code layout

19,020 classes in two DEX files. Class inventory: `_work/all-classes.txt`. Top-level packages:

| Package | Count | Role |
|---|---|---|
| `zz.*` … one/two-letter roots | ~15,300 (obfuscated bulk) | app logic + library classes renamed by R8 |
| `com.microsoft.*` | 675 | `com.microsoft.fluency` (engine Java API), `com.microsoft.hwr` (handwriting), `com.microsoft.identity` (MSAL), `com.microsoft.tokenshare` (SSO) |
| `com.fasterxml.*` | 516 | Jackson JSON |
| `com.google.*` | 478 | Firebase, GMS, Play Core, Guava, crypto (Tink) |
| `com.nimbusds.*` | 379 | Nimbus JOSE/JWT (token handling) |
| `com.touchtype.*` | 319 | named app shells (components kept for manifest/Hilt) |
| `com.adjust.*` | 170 | Adjust attribution SDK |
| `org.apache.*` | 160 | Avro serialization |
| `com.facebook.*` | 130 | Fresco image pipeline, soloader |
| `com.touchtype_fluency.*` | 56 | Fluency service wrapper |
| `com.swiftkey.*` | 50 | sign-in, voice, storage, telemetry, webservices, fresco |
| `org.chromium.*` | 43 | `support_lib_boundary` (WebView boundary API) |
| `ai.onnxruntime` | 36 | ONNX Runtime Java bindings |
| `com.appmattus` | 27 | **certificatetransparency** — certificate-transparency pinning lib |
| `net.swiftkey` | 2 | PaperBoy telemetry |

Named `com.touchtype.*`/`com.swiftkey.*` classes are only the entry points kept by keep-rules (manifest components, Hilt roots, SDK API surfaces, Room DBs). The real feature implementations sit in obfuscated packages — e.g. `pz.b`, `af0.e`, `q50.*`, `ek0.*`, `wj0.*`, `m40.*` referenced by `FluencyServiceImpl` signatures.

**Obfuscation style**: outer class survives, members and most implementation classes are renamed (`a`, `a0`, `b`, `b0`, …). Strings are *not* encrypted — resource/string references and log tags (`"WhisperContract"`, `"SplitCompat"`) remain readable, which is what makes feature mapping practical.

## Stack

- **DI**: Dagger-Hilt (`Hilt_KeyboardService`, `Hilt_SwiftKeyApplication`, per-component `Hilt_*`).
- **UI**: mixed legacy Views + **Jetpack Compose** (runtime/foundation/material/material3 in META-INF versions) + custom `com.touchtype.keyboard.view.*` widget tree (`KeyboardFrame`, `BackgroundFrame`, `ImageFrame`, `NavigationBarBackgroundView`, `PerformanceMeasuringFrameLayout`, `SwiftKeyBanner`, `FloatingKeyboardPaddle`).
- **Async**: Kotlin coroutines (`DebugProbesKt.bin` present).
- **Persistence**: Room (`AchievementsDatabase`, `RichContentDatabase`, `UserHistoryDatabase`, `MultiInstanceInvalidationService`), androidx DataStore (+ `libdatastore_shared_counter.so`).
- **Media/images**: Fresco (`SwiftKeyDraweeView`, `FrescoWrapper`), Landscapist-Fresco, GIF via Klipy + Tenor.
- **Serialization**: Jackson, Gson, protobuf, Avro (telemetry schemas `com.swiftkey.avro.telemetry.sk.android`).
- **Networking**: Retrofit/OkHttp-family stack (nimbus JOSE for JWT, `com.appmattus.certificatetransparency`).
- **Web**: WebView + Chromium `support_lib_boundary`, Custom Tabs (`CustomTabLauncherActivity`, `WebViewFallbackActivity`), `js-bridge.js`.
- **Startup**: androidx `InitializationProvider` / `CoreComponentFactory`, Baseline Profiles.
- **AI/ML**: ONNX Runtime, Fluency native engine, language classifier profiles.
- **Monitoring**: OpenTelemetry API (native-image properties), Firebase Crashlytics registrars, Google Analytics, Adjust.

## Build variants shipped in one APK

Resource strings keep three app names: market ("Microsoft SwiftKey Keyboard"), **beta**, and **cesar** ("Microsoft SwiftKey Cesar Keyboard" — internal dogfood). The manifest also queries `com.touchtype.swiftkey.cesar`, and notice strings mention "SwiftKey dog food updates" — the same binary drives internal and public flavors via build flags/config (`signature_config.json`, `ts_configuration.jwt`, notice_board_dev_cloud warning when pointed at dev cloud).
