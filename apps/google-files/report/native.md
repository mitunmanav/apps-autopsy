# Native libraries — `split_config.arm64_v8a.apk`

Four `.so` files, all AArch64 `ET_DYN`. Extracted under `/tmp/fbg/libs/`.
Hardening/exports evidence is static ELF inspection — **no load, no execution**.

| Library | Size | Purpose |
|---|---|---|
| `libandroidx.graphics.path.so` | 10,320 | AndroidX graphics path iterator (Conic curves) |
| `libgeller_jni_lite_lib.so` | 1,021,472 | Geller on-device corpus store JNI |
| `libimageutilsjni.so` | 394,408 | VisionKit image utils (blur/clarity/YUV) |
| `libmappedcountercacheversionjni.so` | 18,776 | ProtoStore mapped counter cache versioning |

## `libgeller_jni_lite_lib.so`

ELF: 33 sections, 9 segments, 145 symbols, 107 relocations
(`ev_acdadf7af267c7105fe4baf2728582c0ddf8cfb74286b87e03961c766be2ff66`).

Hardening (`ev_cbe509f4a124c45b7c09f4cdd1bb82463f427454af3697ed6cc1070b5a50661c`):

- NX stack: **enabled**
- RELRO: **full** (`BIND_NOW` present)
- Stack protector: **present** (`__stack_chk_*`)
- Fortify: **present** (`__*_chk` imports)
- RPATH/RUNPATH: **none**
- Symbols: **stripped** (`.symtab` absent; only `.dynsym`)
- AArch64 BTI/PAC `GNU_PROPERTY_AARCH64_FEATURE_1_*` note: **absent**
  (not armv9 CFI-hardened)

Geller is Google's on-device structured corpus store (used by smart-search /
assistant-quality features); the JNI lite lib bridges `Geller`/
`GellerDatabaseManagerImpl` Java decls.

## `libimageutilsjni.so`

ELF: 32 sections, 9 segments, 112 symbols, 100 relocations
(`ev_ef096b3551be6b182d908af5296136ef3e869bff64e22b6af869b0ba8c06e2ee`).

Exported JNI functions
(`ev_e80b834f286073b188e280224bf22829eed2e01094f7299fa4c6497602e3ae34`):

```
Java_com_google_android_libraries_vision_visionkit_imageutils_ImageUtils_isBlurred
Java_com_google_android_libraries_vision_visionkit_imageutils_ImageUtils_getClarityValue
Java_com_google_android_libraries_vision_visionkit_imageutils_ImageUtils_downsampleImage
Java_com_google_android_libraries_vision_visionkit_imageutils_ImageUtils_convertYUV420SPToARGB8888
Java_com_google_android_libraries_vision_visionkit_imageutils_ImageUtils_convertARGB8888ToYUV420SP
```

Purpose: blur/clarity scoring (feeds cleanup "blurry photos" cards + scanner
quality checks) and fast YUV420SP↔ARGB8888 conversion for camera/ML pipelines.

## `libandroidx.graphics.path.so`

AndroidX `graphics-path` native iterator — `ConicConverter`,
`PathIteratorPreApi34Impl` JNI decls (vector-path conic flattening on pre-34
devices).

## `libmappedcountercacheversionjni.so`

ProtoStore counter-cache versioning shim — `MappedCounterCacheVersion` JNI.
Tiny version-stamp reader to invalidate cached counters across upgrades.

## Unknowns

- Runtime `System.loadLibrary` call sites / load order.
- `RegisterNatives` dynamic registration beyond the named `Java_*` exports.
- Load base, relocation completeness under Android's loader, ASLR layout.
- Any function-level behavior (requires disassembly or execution).
