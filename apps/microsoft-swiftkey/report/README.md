# Microsoft SwiftKey — teardown report

| | |
| --- | --- |
| **Target** | `com.touchtype.swiftkey` (split-APK set, 6 files) |
| **Version** | 9.13.20.4 (versionCode 1236533312) |
| **SHA-256** | `d7fb9545fc5fec1e7b3fa78573ccb16d0ce30ae47d7c2b1f357360f97ec169c2` (base.apk) |
| **Platform** | Android |
| **Method** | static |
| **Analyzed** | 2026-11-19 |
| **Tools** | REA · JADX headless 0.7.1 · jadx 1.5.6 · apktool · readelf |
| **Obtained** | local archive |
| **Analyst** | @mitunmanav |

## What this is

Microsoft's keyboard — Fluency prediction/correction engine (native
`libfluency-java-internal.so`), swipe typing, themes, clipboard, AI writing
features. App Bundle install set; never executed.

## Artifact inventory

| File | Size | Role |
|---|---|---|
| `base.apk` | 26,557,770 B (25.3 MiB) | Base module: manifest, all DEX code (2 dex files, 19,020 classes), resources, assets |
| `split_config.arm64_v8a.apk` | 10,822,551 B | arm64-v8a native libraries (7 `.so` files) |
| `split_config.en.apk` | 237,977 B | English resources only |
| `split_config.xxhdpi.apk` | 135,874 B | xxhdpi drawables only |
| `split_LanguagesBundled.apk` | 20,874 B | Dynamic feature module stub (classes.dex + empty `lp.zip` placeholder + `metadata.json`) |
| `split_LanguagesBundled.config.en.apk` | 7,553,566 B | Bundled English (US) language pack `lp.zip` + metadata |

**SHA-256 (base.apk)**: `d7fb9545fc5fec1e7b3fa78573ccb16d0ce30ae47d7c2b1f357360f97ec169c2`

## Method

| Layer | Tool | Evidence |
|---|---|---|
| Manifest, package identity, class/method decompile, JNI scan | REA `inspect_android_package`, `inspect_android_class`, `inspect_android_method`, `search_android_classes`, `inspect_android_jni_bindings` (JADX-headless 0.7.1 provider) | REA Evidence IDs per finding |
| Signing | REA `inspect_apk_signature` | `ev_ef87fdd5…` (parent `ev_ab7e202e…`) |
| Native exports | REA `inspect_native_exports`, `readelf` | per `.so` |
| Resources/layouts/smali | `apktool d` (full decode) | `_work/apktool-base/` |
| Full Java decompile (19,020 classes, 223 class-level errors) | `jadx 1.5.6 --no-res --threads-count 8` | `_work/jadx-base/` |
| Archive/member facts | `unzip`, `file`, `keytool` | inline |

Static decompiler observations do not establish runtime behaviour; the APK was never launched. Obfuscated names (`a`, `b0`, …) are reported as-shipped. Where a conclusion is inferred rather than observed it is labelled **[inferred]**.

## Findings

- **Package**: `com.touchtype.swiftkey`; label `@string/app_name_market` = "Microsoft SwiftKey Keyboard"
- **SDK**: minSdk 26 / targetSdk 36 / compileSdk 36 ("16")
- **IME**: `com.touchtype.KeyboardService` declared in `res/xml/method.xml`; 156 input-method subtypes across ~100+ locales; `supportsInlineSuggestions="true"`; `suppressesSpellChecker="true"`. Declared components: 48 activities, 26 services, 11 receivers, 4 providers
- **Classes**: 19,020 (2 dex files: `classes.dex` 9.1 MB, `classes2.dex` 8.1 MB)
- **Signing**: v2+v3, single signer cert `0ad0088d…b76f`, Play source stamp `3257d599…`, self-consistent digests, no rotation
- **DI**: Hilt (Dagger) — `Hilt_*` generated classes on every component
- **Prediction engine**: Microsoft **Fluency** — Java API `com.microsoft.fluency.*` bound to `libfluency-java-internal.so` (5.1 MB arm64); service `com.touchtype_fluency.service.FluencyServiceImpl`
- **On-device ML**: ONNX Runtime (`ai.onnxruntime`, `libonnxruntime.so` + JNI shim); Whisper on-device AI voice typing as an on-demand module; language classifier profiles for 12 Indic/CJK scripts
- **Handwriting**: `libhwr_jni.so` (`com.microsoft.hwr` Context/Recognizer)
- **Backend**: Microsoft account via MSAL + broker, TokenShare SSO allowlist (50 MS app chains in `ts_configuration.jwt`), OneDrive backups, `clip.api.swiftkey.com` cloud clipboard, `jenson.api.swiftkey.com` model/config CDN, `bibo.api.swiftkey.com` ("Blobs in Blobs out") model-distribution/experimentation
- **Monetization**: Xandr/AppNexus native ads in emoji panel (gated dynamic module), Klipy GIF ads, Adjust attribution + event forwarding
- **Enterprise**: `android:crossProfile="true"`, ConnectedApps cross-profile settings sync, smart-card/YubiKey sign-in (YubiKit NFC+USB), MSAL broker (Company Portal/Authenticator)

## Layout of this report

### Platform

| Doc | Contents |
|---|---|
| [00-package-identity-and-signing.md](00-package-identity-and-signing.md) | identity, digests, signing schemes, source stamp |
| [01-manifest-and-components.md](01-manifest-and-components.md) | every declared component, permissions, intent filters, queries |
| [02-architecture-and-obfuscation.md](02-architecture-and-obfuscation.md) | package map, DI, libraries, dex layout |
| [03-native-libraries.md](03-native-libraries.md) | all 7 `.so` files, JNI surface, ONNX |
| [04-dynamic-modules-and-splits.md](04-dynamic-modules-and-splits.md) | split set, SplitCompat, on-demand modules (Whisper, camera, languages) |

### Input core

| Doc | Feature |
|---|---|
| [features/ime-service.md](features/ime-service.md) | KeyboardService lifecycle, insets, fullscreen, inline suggestions, lock screen |
| [features/fluency-engine.md](features/fluency-engine.md) | Fluency predictor, models, parameters, learning |
| [features/layouts-and-input-modes.md](features/layouts-and-input-modes.md) | 227 layout XMLs, subtypes, CJK/Indic IMs, flick modes |
| [features/flow-gesture-typing.md](features/flow-gesture-typing.md) | continuous-input engine, flow prefs |
| [features/handwriting.md](features/handwriting.md) | `libhwr_jni`, stroke pipeline, CJK handwriting |
| [features/voice-typing.md](features/voice-typing.md) | standard + multi-modal voice |
| [features/whisper-ai-voice.md](features/whisper-ai-voice.md) | on-device Whisper module |
| [features/prediction-bar-candidates.md](features/prediction-bar-candidates.md) | candidate bar, quick-paste, emoji prediction |
| [features/incognito-mode.md](features/incognito-mode.md) | learning suppression |
| [features/modes-resize-cursor.md](features/modes-resize-cursor.md) | Full/One-Hand/Thumb/Float, resize, cursor control |
| [features/hard-keyboard.md](features/hard-keyboard.md) | physical keyboard support |

### Content & AI features

| Doc | Feature |
|---|---|
| [features/toolbar.md](features/toolbar.md) | toolbar architecture, toolgrid, customiser |
| [features/clipboard.md](features/clipboard.md) | local clipboard manager |
| [features/cloud-clipboard.md](features/cloud-clipboard.md) | Windows clipboard sync, `clip.api.swiftkey.com` |
| [features/emoji.md](features/emoji.md) | emoji panel, prediction, variants, font, quick emoji |
| [features/gif-stickers.md](features/gif-stickers.md) | Tenor GIFs, sticker packs |
| [features/ai-creation.md](features/ai-creation.md) | Bing Image Creator, AI sticker generation |
| [features/rich-content-panel.md](features/rich-content-panel.md) | unified All/emoji/GIF/stickers/web-image search |
| [features/camera.md](features/camera.md) | keyboard camera (Flipgrid OneCamera), photo stickers, AI remix |
| [features/editor-tone.md](features/editor-tone.md) | Editor (AI improve) + Tone changer + Writing assistance hub |
| [features/ask-bing-copilot.md](features/ask-bing-copilot.md) | AskBing/Copilot chat surface, JS bridge |
| [features/search.md](features/search.md) | in-keyboard Bing search + autosuggest webview |
| [features/translator.md](features/translator.md) | Microsoft Translator integration |

### Personalization & account

| Doc | Feature |
|---|---|
| [features/themes.md](features/themes.md) | theme engine, bundled/marketplace themes |
| [features/custom-themes.md](features/custom-themes.md) | theme designer, background image editor |
| [features/bing-daily-theme.md](features/bing-daily-theme.md) | daily Bing image theme |
| [features/microsoft-account.md](features/microsoft-account.md) | MSAL sign-in, account management, delete account |
| [features/token-sharing-sso.md](features/token-sharing-sso.md) | TokenShare cross-app SSO |
| [features/smartcard-yubikey.md](features/smartcard-yubikey.md) | CAC/smart-card + YubiKey auth |
| [features/backup-and-sync.md](features/backup-and-sync.md) | OneDrive backup, typing-data sync |
| [features/personalization.md](features/personalization.md) | user dictionary, dynamic model, clear typing data |
| [features/languages.md](features/languages.md) | pack catalog, downloads, add-ons, multilingual |
| [features/work-profile.md](features/work-profile.md) | cross-profile sync, ConnectedApps |

### App shell & growth

| Doc | Feature |
|---|---|
| [features/settings-app.md](features/settings-app.md) | LauncherActivity + materialsettings(x) screens |
| [features/onboarding.md](features/onboarding.md) | installer, welcome sheets, social proof |
| [features/messaging-cards.md](features/messaging-centre-tips-cards.md) | messaging centre, tips, cards JSON |
| [features/achievements-rewards.md](features/achievements-rewards.md) | achievements DB, tiers, Microsoft Rewards |
| [features/surveys.md](features/surveys.md) | in-app survey + HelpImprove |
| [features/notifications-social.md](features/notifications-social.md) | notifications, social proof |
| [features/deep-links-sharing.md](features/deep-links-sharing.md) | swiftkey:// scheme, share/import |
| [features/in-app-updates.md](features/in-app-updates.md) | Play in-app update, notice board upgrades |

### Services & infrastructure

| Doc | Feature |
|---|---|
| [features/bibo.md](features/bibo.md) | BiBo model distribution/flights |
| [features/telemetry.md](features/telemetry.md) | Avro telemetry, PaperBoy, experimentation |
| [features/push-messaging.md](features/push-messaging.md) | FCM, cloud clipboard channel |
| [features/ads.md](features/ads.md) | Xandr/AppNexus emoji ads, Klipy, ads consent |
| [features/adjust.md](features/adjust.md) | attribution, event forwarding, libsigner |
| [features/endpoints.md](features/endpoints.md) | every backend URL/data flow found |
| [features/security-privacy.md](features/security-privacy.md) | network config, cert transparency, consent, privacy modes |
| [features/accessibility.md](features/accessibility.md) | TalkBack/a11y surface |
| [features/debug-tooling.md](features/debug-tooling.md) | BiBo selector, dynamic model debug, test receivers, Cesar/dogfood |
| [features/third-party-sdks.md](features/third-party-sdks.md) | complete SDK inventory |

## Evidence ledger

| ID | Subject |
|---|---|
| `ev_09555907…` | `inspect_android_package` — manifest/identity |
| `ev_ab7e202e…` | `inspect_apk_signature` — signing record |
| `ev_70634541…` / `ev_c4f59c86…` | class searches (`com.touchtype`, `com.swiftkey`) |
| `ev_b97d4dc6…` | `inspect_android_class` KeyboardService |
| `ev_20c3f81a…` | `inspect_android_class` FluencyServiceImpl |
| `ev_dcfcff00…` | `inspect_android_jni_bindings` — 466 declarations |
| `ev_c3fb12ef…` | exports of `libfluency-java-internal.so` |

Local artifacts of the analysis (not shipped): `evidence-bundle.zip` (14 exported REA Evidence records), `_work/apktool-base/` (decoded), `_work/jadx-base/` (decompiled), `_work/manifest.xml` (decoded manifest), `_work/all-classes.txt` (19,010 decompiled class paths), `_work/splits/` (extracted split contents). The REA investigation was reset after export; the bundle preserves all recorded evidence.

## Limitations

Static analysis only — the app was never executed; 223 jadx class-level
errors logged and server-side/flag-gated behavior is unknown unless marked.
The REA investigation was reset after export; `evidence-bundle.zip`
preserves the recorded evidence.

## Coverage

Every surface of the artifact, and where this report covers it.
A `n/a` or `gap` here is a statement about this report, not about
the app.

| Surface | Covered in |
| --- | --- |
| Identity & signing | 00-package-identity-and-signing.md |
| Components & exported surface | 01-manifest-and-components.md |
| Permissions | 01-manifest-and-components.md |
| Network & API surface | features/endpoints.md |
| SDKs, ads & trackers | features/third-party-sdks.md, features/telemetry.md |
| Native code & JNI | 03-native-libraries.md |
| Persistence & local data | features/ per-feature (backup-and-sync, clipboard, personalization) |
| Protection & obfuscation | 02-architecture-and-obfuscation.md |
| Embedded config & shipped secrets | features/token-sharing-sso.md, features/microsoft-account.md |
| Monetization | features/ads.md, features/adjust.md |
| Feature inventory | features/ (~50 files) |
| Updates & dynamic delivery | features/in-app-updates.md, 04-dynamic-modules-and-splits.md |
| Privacy | features/security-privacy.md, features/incognito-mode.md |
