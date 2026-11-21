# Native Libraries & JNI

Artifact: `com.smallpdf.app.android` v3.7.0 — arm64 split SHA-256 `7f7a8027…d1adad18` (native payload lives in `split_config.arm64_v8a.apk`; `extractNativeLibs="false"` → mmapped from APK).

## `.so` inventory `[obs]` (arm64 split `lib/arm64-v8a/` — all digests verified locally + REA `ev_b9b32076…`)

| Library | Size (B) | SHA-256 | Exports `[obs]` | JNI_OnLoad | Loader `[obs]` | Role `[inf]` |
|---|---|---|---|---|---|---|
| `libPDFNetC.so` | 61,191,296 | `470bd1a0…326638` | —(capacity fail) | n/a | `com.pdftron.pdf.PDFNet` `loadLibrary("PDFNetC")` | PDFTron PDF engine |
| `libonnxruntime.so` | 32,120,992 | `c9732139…f5501` | —(capacity fail) | n/a | ORT internal dlopen | ONNX Runtime inference |
| `libonnxruntime4j_jni.so` | 83,224 | `540b3725…cb1ab` | **212** (`ev_deb22652…`; jni-scan counted 173 Java_* candidates) | yes | `ai.onnxruntime.OnnxRuntime` | ORT Java JNI bridge |
| `libimage_processing_util_jni.so` | 32,528 | `0292b063…508a2` | **8** (`ev_313df182…`) | no | `androidx.camera.core.ImageProcessingUtil` | CameraX YUV→bitmap |
| `libandroidx.graphics.path.so` | 10,096 | `41e9a793…bfb6` | 1 | yes | `defpackage.bu6` | Compose vector/path ops |
| `libdatastore_shared_counter.so` | 7,112 | `d3e48717…f58e1` | 4 | no | `fl7`/`m06` | DataStore multiprocess counter |
| `libsurface_util_jni.so` | 4,896 | `a5c9d192…16ba` | 1 | no | CameraX surface utils | Surface→Image |

## ELF hardening `[obs]` — `inspect_binary_hardening` ×7

| Lib | NX | RELRO(+BIND_NOW) | Stack-protector | FORTIFY | BTI/PAC | RUNPATH | Stripped |
|---|---|---|---|---|---|---|---|
| libPDFNetC (`ev_6df31207…`) | ✓ | ✓ | ✓ | unknown | absent | none | ✓ |
| libonnxruntime (`ev_54f8fa28…`) | ✓ | ✓ | ✓ | **✓ `__memset_chk`** | absent | `$ORIGIN` | ✓ |
| onnxruntime4j_jni (`ev_28916c10…`) | ✓ | ✓ | ✓ | unknown | absent | none | ✓ |
| image_processing_util_jni (`ev_e8d9c15e…`) | ✓ | ✓ | ✓ | **✓ `__memcpy_chk`** | absent | none | ✓ |
| surface_util_jni (`ev_7cb51b64…`) | ✓ | ✓ | ✓ | unknown | absent | none | ✓ |
| androidx.graphics.path (`ev_e9e3e6db…`) | ✓ | ✓ | ✓ | unknown | absent | none | ✓ |
| datastore_shared_counter (`ev_b6a6c3d9…`) | ✓ | ✓ | ✓ | unknown | absent | none | ✓ |

All 7 are `ET_DYN` shared objects, arm64 little-endian, no AArch64 BTI/PAC property notes (opt-in feature, commonly absent) `[obs]`.

## JNI declarations ↔ libraries `[obs]`

- `inspect_android_jni_bindings` on `base.apk` (`ev_6990d968…`, view `ev_0b7ca360…`): **2,651 native declarations** across **15,444 classes / 85,946 methods** in 3 dex entries — dominated by `ai.onnxruntime.*`, `com.pdftron.*`, DataStore, CameraX.
- On `split_config.arm64_v8a.apk` (`ev_b9b32076…`, view `ev_657d5b2d…`): 7 libraries inventoried, **195 binding candidates** — but the split contains **0 dex entries**, so `bindings: 0`. **Structural limitation**: DEX declarations live in base.apk while libraries live in the split; the tool cannot join across split members in one pass → per-declaration binding rows are `[partial]`.
- Corroborated pairing `[inf]`: `ai.onnxruntime` native declarations (≈173 observed in the declarations page) ↔ `onnxruntime4j_jni` (212 exports / 173 Java_* candidates) — consistent one-bridge-per-namespace.
- `jni_on_load` exported by `libandroidx.graphics.path.so` and `libonnxruntime4j_jni.so` `[obs]`; the two big libs could not be scanned for it (capacity failure below).

## Embedded model `[obs]`

`assets/lcnet100_h_e_bifpn_256_fp32.muladd.onnx` (4,769,051 B) — LCNet-family ONNX graph (SE/BiFPN naming → PP-LCNet-style detector) consumed by scanner code `em2`/`td4`/`aa1` via `ai.onnxruntime` `[obs]`; used for document edge detection `[inf]`. `inspect_model_artifact` is GGUF/safetensors-only → ONNX internals `[unk]` (tool N/A, ledger entry).

## Recorded tool failure `[obs]`

`inspect_android_jni_bindings` library inventory on `libPDFNetC.so` and `libonnxruntime.so` failed with `capacity`: **"ELF sparse relocation index exceeds 65536 retained writes"** → those two libraries' export/JNI_OnLoad rows are `null` in `ev_b9b32076…`. Hardening inspection succeeded on both (headers/dynsym only). Impact: export tables of the two biggest libs not enumerated — mitigated by Java-side declaration inventory + known vendor namespaces.

## Coverage gaps remaining `[unk/partial]`

- Per-declaration DEX→ELF binding table: structural cross-split limit (above).
- `libPDFNetC`/ORT version strings `[unk]`; function-level disassembly not performed (no Ghidra session opened — deep function analysis out of static-report scope).
