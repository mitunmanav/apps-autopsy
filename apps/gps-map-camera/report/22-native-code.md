# 22 — Native code & JNI

## Libraries (arm64 split only)

| `.so` | Purpose | Evidence |
|---|---|---|
| `libpairipcore.so` | Google Pairip VM/anti-tamper runtime (`JNI_OnLoad`) | dynsyms, `com.pairip.application.Application`, `FSXa.*.invoke` stubs |
| `libbarhopper_v3.so` | ML Kit Barhopper barcode decode (4.9 MB, 179 syms) | Barhopper JNI declarations in DEX (`ev_b40080b9…`), ML Kit barcode assets |
| `libimage_processing_util_jni.so` | CameraX YUV→RGB image ops | CameraX JNI decls |
| `libsurface_util_jni.so` | CameraX surface utils | CameraX JNI decls |
| `libandroidx.graphics.path.so` | AndroidX graphics path iteration | path-iterator JNI decls |
| `libdatastore_shared_counter.so` | DataStore counter | JNI decls |

## JNI picture

- 22 `native` method declarations located in base DEX (evidence `ev_b40080b9…`); all resolved to bundled libs by name convention
- Dynamic-symbol names in the `.so`s are obfuscated/stripped in places (`Java_a…`, `Java_c…` prefixes seen in `readelf`)
- No `System.loadLibrary` calls in app package code — all loading is library-internal
- `extractNativeLibs="false"` → libs mapped directly from APK

## Pairip surface

- App class `com.pairip.application.Application`; PairIP license-checking component in manifest
- 3 observed VM bridges: `FSXa.MTGPaCQiyDfYqUK.invoke` (`Splash_Screen.onCreate`), `FSXa.bwBoaqry.invoke` (`Splash_Screen`), `FSXa.Ipgnog.invoke` (`CameraActivity`)
- Everything else decompiled normally → protection is selective, not whole-app

## Unknowns

- Behavior of VM-protected method bodies
- Whether Barhopper/QR scanning is user-facing (QR template) or utility
