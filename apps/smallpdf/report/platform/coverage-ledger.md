# Coverage Ledger & Verification Checklist

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`; arm64 split `7f7a8027…d1adad18`.

## Verification numbers (real counts) `[obs]`

| Check | Result |
|---|---|
| Split APKs | **10** (base, arm64_v8a, xxhdpi, 7 locales) |
| Base APK size / entries | 25,604,506 B / 2,546 zip entries |
| arm64 split size | 93,524,702 B |
| DEX files | **3** (`classes.dex` 9.2 MB, `classes2.dex` 4.7 KB stub, `classes3.dex` 5.8 MB) |
| Manifest components | **66** |
| `uses-permission` entries | **22** |
| App-link paths | **16** (`zra` map) |
| Top-level classes (jadx emit) | **10,818** (204 decompile errors) |
| `u4a` tool descriptors | **28** concrete (26 direct + `x3a`/`y3a` via abstract `t4a`) |
| `e4a` tool groups | **7** (j3a, d4a, h4a, o4a, v3a[p3a∪u3a], z3a) |
| `ju7` remote task types | **28** |
| Native libs (arm64) | **7** `.so` — all digests + hardening verified (NX/RELRO/SP on all; FORTIFY on ORT + image_processing) |
| JNI native declarations (DEX) | **2,651** across 15,444 classes / 85,946 methods (`ev_6990d968…`) |
| JNI library inventory (split) | 7 libs, **195** binding candidates (`ev_b9b32076…`) |
| ONNX models | **1** (`lcnet100_h_e_bifpn_256_fp32.muladd.onnx`, 4,769,051 B) |
| Room tables (app) | 1 (`documents`, 10 cols) + WorkManager schema in same DB file |
| Workers (named) | 6 |
| gp2 flow ops | 10 |

## REA evidence retained `[obs]`

- Package summary `ev_5770972b…` · signature `ev_92f6cf63…` · arm64 inventory `ev_5abc1fe8…` · manifest view `ev_7d039543…` · class searches `ev_3181ea13…`, `ev_81389d8b…` · resource decode `ev_eb7ada11…`
- JNI bindings: `ev_6990d968…` (base.apk declarations, view `ev_0b7ca360…`), `ev_b9b32076…` (split library inventory, view `ev_657d5b2d…`)
- Hardening: `ev_6df31207…` libPDFNetC · `ev_54f8fa28…` libonnxruntime · `ev_28916c10…` ort4j_jni · `ev_e8d9c15e…` image_processing · `ev_7cb51b64…` surface_util · `ev_e9e3e6db…` graphics.path · `ev_b6a6c3d9…` datastore_counter
- Exports: `ev_deb22652…` (ort4j_jni 212), `ev_313df182…` (image_processing 8), parent `ev_cea2d32d…`/`ev_47785941…`

## Tool/failure ledger

| Operation | Status | Impact |
|---|---|---|
| `inspect_android_package` (base+arm64) | ✅ | identity, components |
| `inspect_apk_signature` | ✅ structural | v2/v3 declared, certs recorded; crypto validity `[unk]` |
| `inspect_analysis_view` manifest | ✅ (after `facet`/`limit` arg fixes) | full 38,428-char manifest |
| `decode_android_resources` | ✅ partial page | strings mined via apktool instead |
| `inspect_android_class` on `…LimitationsService` (named) | ❌ class not found → resolved as obfuscated `sg5`/`m82` | low |
| `inspect_android_jni_bindings` (base.apk) | ✅ 2,651 decls | declarations inventory complete |
| `inspect_android_jni_bindings` (arm64 split) | ⚠ partial — 7 libs + 195 candidates, but `capacity` fail on libPDFNetC/ORT ("ELF sparse relocation index exceeds 65536") and cross-split join impossible (declarations in base DEX, libs in split) | per-decl binding rows `[partial]`; pairing done namespace-wise |
| `inspect_binary_hardening` ×7 | ✅ all libs | full table in native-jni.md |
| `inspect_native_exports` | ✅ ort4j_jni (212), image_processing (8); others counted in split inventory | export tables verified |
| `inspect_model_artifact` | ⛔ N/A — GGUF/safetensors only, ONNX unsupported | ONNX graph internals `[unk]` |
| `project_android_application_graph` | ❌ not run (requires full inventory-evidence payload) | app-wide call graph `[unk]` |
| JADX decompile | ✅ 10,818 classes, 204 errors (mostly lambda/switch) | `ToolFlowActivity` intent switch partially reconstructed `[partial]` |
| Runtime/ADB/Frida/browser tools | ⛔ N/A by policy (static-only) | runtime claims excluded |

## Unresolved items `[unk]`

- Exact HTTP header/auth-interceptor details; full `options` schemas for every `ju7` type; download URL template; PDFTron/ORT version strings; Compose NavHost route strings; Pairip init internals; per-tool `isPremiumTool` truth table (function exists, table `[partial]`); ONNX graph internals (tool N/A); libPDFNetC/ORT export tables (capacity fail).
