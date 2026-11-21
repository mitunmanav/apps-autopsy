# Smallpdf — teardown report

| | |
| --- | --- |
| **Target** | `com.smallpdf.app.android` (split set, 10 APKs) |
| **Version** | 3.7.0 (versionCode 218984204, minSdk 32, targetSdk 36, compileSdk 36) |
| **SHA-256** | `345548b0d87b4dd7e3753ed7f7b4289b9a1fcaac5e63bed9f2adf624f38eb6a6` (base.apk) |
| **Platform** | Android |
| **Method** | static |
| **Analyzed** | unknown |
| **Tools** | REA · apktool 2.7.0 · jadx 0.7.1 headless · aapt2 |
| **Obtained** | local archive |
| **Analyst** | @mitunmanav |

## What this is

Smallpdf's PDF toolkit — view/edit/sign locally on PDFTron, convert/compress
via remote task APIs, freemium-gated. Never installed or run.

## Artifact set

- Package: `com.smallpdf.app.android`
- Version: `3.7.0` (versionCode `218984204`)
- minSdk 32 · targetSdk 36 · compileSdk 36
- Split set (10 APKs): `base.apk`, `split_config.arm64_v8a.apk`, `split_config.xxhdpi.apk`, locale splits `bn en gu kn mr ta te`
- Base APK SHA-256: `345548b0d87b4dd7e3753ed7f7b4289b9a1fcaac5e63bed9f2adf624f38eb6a6`
- arm64 split SHA-256: `7f7a802759c0c89209f371321b35a34f1fd8bbea57f6763685557397d1adad18`
- `requiredSplitTypes="base__abi,base__density"`, `extractNativeLibs="false"`
- Signing: APK Signature Scheme v2 + v3 declared; signer cert SHA-256 `17318e5df97836720af33c0f89a45d05abf54384f1c03ebce99263e2a3d71f1f`; source-stamp cert `3257d599a49d2c961a471ca9843f59d341a405884583fc087df4237b733bbd6d`. Cryptographic verification of signature/chain/revocation **not performed** (structural inspection only).

Every report file re-states this stamp; only this artifact set is cited.

## Method

Static analysis only. The APK was never installed, launched, emulated, or attached to. Evidence sources:

- REA MCP static analyzers: `inspect_android_package`, `inspect_apk_signature`, `inspect_analysis_view` (manifest facet), artifact inventory.
- Local toolchain on extracted bytes: `apktool 2.7.0` (resources, remote-config XML), `jadx 0.7.1` headless full-DEX decompile (`/tmp/smallpdf_jadx/`, 10,818 top-level classes emitted, 204 decompile errors logged), `aapt2`, `unzip`, `sha256sum`.
- No runtime, Frida, ADB, network, or dynamic-instrumentation tools were used.

**Claim tagging** — `[obs]` observation (present in manifest/resources/decompiled bytes/REA evidence); `[inf]` inference (reasoned from ≥2 corroborating observations); `[unk]` unknown (not statically established).

## Artifact summary counts (verified, see `platform/coverage-ledger.md`)

- Split APKs: **10** (1 base + 1 ABI + 1 density + 7 locales)
- Manifest components: **66** (activities/aliases, services, receivers, providers)
- DEX files in base: **3** (`classes.dex` 9.2 MB, `classes2.dex` 4.7 KB desugar stub, `classes3.dex` 5.8 MB)
- Top-level classes decompiled: **10,818** (`com.smallpdf.*` named ≈36; bulk under `defpackage` R8-obfuscated ≈11,880 descriptors incl. members)
- Native libraries (arm64 split): **7** `.so` files, incl. `libPDFNetC.so` ≈58.3 MB (PDFTron engine) and `libonnxruntime.so` ≈30.6 MB
- Embedded ML model: `assets/lcnet100_h_e_bifpn_256_fp32.muladd.onnx` ≈4.77 MB (LCNet-style scanner model)
- Tool descriptors (concrete `u4a` descendants): **28** (26 direct + `x3a`/`y3a` via abstract `t4a`); tool groups (`e4a`): **7**
- Remote task types (`ju7`): **28**; remote task API: `POST /v1/tasks/external`, `GET /v1/tasks/{taskId}`
- Declared permissions: **22** uses-permission entries

## Layout of this report

### Platform

| File | Scope |
|---|---|
| [platform/manifest-components.md](platform/manifest-components.md) | Manifest, 66 components, intent-filters, deep links, meta-data |
| [platform/architecture.md](platform/architecture.md) | App structure, DI, obfuscation, module layering |
| [platform/native-jni.md](platform/native-jni.md) | 7 `.so` files, JNI bindings, ONNX/PDFTron/CameraX natives |
| [platform/sdks.md](platform/sdks.md) | Third-party SDK inventory (PDFTron, ORT, Firebase, Billing, AppsFlyer…) |
| [platform/permissions.md](platform/permissions.md) | All declared permissions with static consumers |
| [platform/persistence.md](platform/persistence.md) | Room `documents` table, DataStore/prefs, WorkManager, files |
| [platform/network-api.md](platform/network-api.md) | Hosts, task API, file storage R2, Keycloak OIDC, auth headers |
| [platform/data-pipeline.md](platform/data-pipeline.md) | Upload → task → poll → download → local save pipeline |
| [platform/offline-online.md](platform/offline-online.md) | Per-tool local vs remote execution classification |
| [platform/limitations.md](platform/limitations.md) | Free-task gating, premium flags, paywall triggers |
| [platform/screen-map.md](platform/screen-map.md) | Screens/destinations observed statically |
| [platform/navigation-map.md](platform/navigation-map.md) | Entry points, deep-link resolution, activity routing |
| [platform/coverage-ledger.md](platform/coverage-ledger.md) | Tool/failure ledger, coverage, verification numbers |

### Tools (`tools/`) — one file per tool descriptor (28)

Groups: **Compress** `basic`+`strong` · **Edit** `annotate`, `sign` · **View** `view`, `read` · **Organize** `merge`, `organize`, `delete_pages`, `rotate_pages`, `add_to_pdf` · **Convert from PDF** `pdf_to_word`, `pdf_to_excel`, `pdf_to_ppt`, `pdf_to_jpg`, `ocr_pdf` · **Convert to PDF** `word_to_pdf`, `excel_to_pdf`, `ppt_to_pdf`, `jpg_to_pdf` · **Create** `scan`, `gallery`, `files` · **Context actions** `delete`, `rename`, `share`, `save_to_cloud`, `save_to_device`.

See [tools/index.md](tools/index.md) for the registry table and links.

### Features (`features/`) — one file per app module

`home`, `tools-flow`, `editor`, `scanner`, `auth-account`, `payment-paywall`, `storage-documents`, `widgets`, `notifications-limitations`, `analytics-telemetry`, `deep-links`. See [features/index.md](features/index.md).

## Findings

- **Hybrid execution** `[inf]`: conversion/compress/merge/organize heavy work is remote (`task.smallpdf.com` + `files.smallpdf.com` R2 upload); edit/sign/rotate/organize-UI, view/read, rename/delete/share/save are local (PDFTron `libPDFNetC` + file I/O). Scanner edge-detection runs locally on ONNX Runtime.
- **Freemium gate** `[obs]`: remote config `max_free_tasks` (default 1), per-tool premium flags via `LimitationsService.isPremiumTool`, free-task countdown drives `PaywallActivity` and a re-engagement notification.
- **Safety note**: the manifest embeds a Google API key and a PDFTron license string. Both are shipped client-side values (normal for Android), reported here only as *observed presence*; values are intentionally redacted in this report.

## Limitations

The APK was never installed, launched, emulated or attached to; remote-task
behavior, server responses and Remote Config values are `[unk]` unless
established. Signature/chain/revocation verification was not performed
(structural inspection only). Gaps: [platform/coverage-ledger.md](platform/coverage-ledger.md).

## Coverage

Every surface of the artifact, and where this report covers it.
A `n/a` or `gap` here is a statement about this report, not about
the app.

| Surface | Covered in |
| --- | --- |
| Identity & signing | platform/manifest-components.md + artifact block above |
| Components & exported surface | platform/manifest-components.md |
| Permissions | platform/permissions.md |
| Network & API surface | platform/network-api.md |
| SDKs, ads & trackers | platform/sdks.md |
| Native code & JNI | platform/native-jni.md |
| Persistence & local data | platform/persistence.md |
| Protection & obfuscation | platform/architecture.md |
| Embedded config & shipped secrets | platform/network-api.md (keys observed, values redacted) |
| Monetization | features/payment-paywall.md |
| Feature inventory | features/index.md |
| Updates & dynamic delivery | n/a — no update/dynamic-delivery mechanism documented |
| Privacy | platform/data-pipeline.md |
