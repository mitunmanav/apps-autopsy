# Native Libraries & JNI — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`
Source: `split_config.arm64_v8a.apk` `0bc03355…`, libraries extracted to `extracted/lib/arm64-v8a/`. Only arm64-v8a ships (obs).

## Library inventory (obs)

| Library | Role (inf) | Notes |
|---|---|---|
| `libreactnative.so` | React Native core | FB JNI runtime |
| `libhermes.so` | Hermes VM | runs `index.android.bundle` v96 |
| `libhermestooling.so` | Hermes tooling/debug | shipped in release |
| `libjsi.so`, `libfbjni.so` | RN JSI/JNI bridge | |
| `librnscreens.so` | react-native-screens | |
| `libc++_shared.so` | LLVM C++ runtime | shared by RN/map/image libs |
| `libmaplibre.so` | MapLibre GL (Ola Maps) | 13,103,240 B, sha `7a5b3298…` |
| `libimagepipeline.so`, `libnative-filters.so`, `libnative-imagetranscoder.so` | Fresco native image pipeline | |
| `libtoolChecker.so` | RootBeer native checker | 5,512 B, sha `eeb2317e…` |

## libtoolChecker.so (obs, ev_0deebffa…)
ARM64 ELF. Exports:
- `Java_com_scottyab_rootbeer_RootBeerNative_checkForRoot`
- `Java_com_scottyab_rootbeer_RootBeerNative_setLogDebugMessages`
- `_Z6existsPKc` (C++ `exists(const char*)` — file-path existence probe)

Java side: `com.scottyab.rootbeer.{RootBeerNative,a,b,util.a}` present (obs). **Static presence ≠ runtime execution** — no evidence collected on when/if `checkForRoot` is invoked or what the app does with the result (unk).

## libmaplibre.so hardening (obs, ev_97686d34…)
NX ✓ · full RELRO (BIND_NOW) ✓ · stack protector (`__stack_chk_fail`) ✓ · FORTIFY (`__memcpy_chk`) ✓ · stripped ✓ · no RPATH/RUNPATH ✓ · AArch64 BTI/PAC **absent** (opt-in, not set) · PIE n/a (shared object).

## JNI inventory (ev_e9f761f6…)
- **941 `native` method declarations** across 6 DEX files / 335,109 methods scanned (obs).
- The unfiltered bindings call returned **no selected libraries/matched Java↔native pairs** — REA limitation: the matcher did not auto-pair the JNIEXPORT exports (e.g. RootBeerNative above). Bindings were verified manually for libtoolChecker only (obs); React Native/Fresco/MapLibre JNI registration largely happens via `RegisterNatives` at runtime (unk, cannot be resolved statically).

## Unknowns
- Full Java→native binding map (dynamic `RegisterNatives`).
- Custom Juspay/Ola native code inside libs vs upstream builds (libs are stripped; provenance inf by name only).
- Whether `libhermestooling` is ever loaded in production (inf: tooling lib, likely dead weight).
