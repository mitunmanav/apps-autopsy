# 01 — Artifact identity & packaging

## APK set

| File | SHA-256 | Role |
|---|---|---|
| `base.apk` | `c1f5bcec9de23c4a7422f84c8877a11689062b12dd9e4769a6e53b59becb259a` | Base module: manifest, DEX, resources, assets |
| `split_config.arm64_v8a.apk` | `7b592e20e8d6f6529877b7cf8e14021d6c2009ee20b6038d667bec2f41b6a80c` | ABI split: 6 arm64-v8a `.so` libs + `stamp-cert-sha256` |
| `split_config.xxhdpi.apk` | `6dad2f04bc858f48d4651e03180a98018b4edf25b5eccb13af3c3e37d1ef0b5d` | Density split: 80 files — Media3/ExoPlayer `exo_*` drawables, `resources.arsc`, `stamp-cert-sha256` |

## Package identity

- Package: `com.gpsmapcamera.geotagginglocationonphoto`
- VersionName `1.9.40`, versionCode `202`
- minSdk 32, targetSdk 36, compileSdk 36
- Application: `com.pairip.application.Application` (Pairip protection wrapper; real app class is `MyApplication`)
- `usesCleartextTraffic="true"`, `allowBackup="false"`, `largeHeap="true"`, `extractNativeLibs="false"`, `requestLegacyExternalStorage` declared
- Custom signature-level permission: `com.gpsmapcamera.geotagginglocationonphoto.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION`
- Network security config declared

## Signing (structural only — not cryptographically verified)

- v2 and v3 signature schemes present; v1 and v3.1 absent
- Both schemes declare signer cert SHA-256 `2cbafeaf408c8df17678f6b54c830c5a26a6aadd7a6d57e85691dd4154b5c651`
- Play source stamp present, cert SHA-256 `3257d599a49d2c961a471ca9843f59d341a405884583fc087df4237b733bbd6d`
- Evidence: `ev_5b3216164f2b3d4ddab48d6a87ccc1af4e8111f01b5ba9ef6514692063ea7ef9`

## Base APK inventory (evidence `ev_864cbfe0…`)

- 6,515 central-directory entries; 3 DEX files (`classes.dex`–`classes3.dex`)
- JADX loaded 14,073 top-level classes and 2,327 resources
- ~1,431 drawable resources, 244 layouts, 34 assets, 85 colors, 120 META-INF entries, 127 Apache Commons codec language classes
- Assets include ML Kit barcode models, TTF fonts, `capture.ogg` shutter sound, `PublicSuffixDatabase.list`, `ww15mgh` EGM96 geoid grid (via `R.raw`), obfuscated asset names

## arm64 split libraries

| Library | Size | Role |
|---|---|---|
| `libbarhopper_v3.so` | 4,946,720 | ML Kit "Barhopper" barcode recognition (179 dynamic symbols) |
| `libpairipcore.so` | 608,896 | Google Pairip VM/anti-tamper (`JNI_OnLoad`, 74 syms) |
| `libimage_processing_util_jni.so` | 32,528 | CameraX image-processing JNI |
| `libandroidx.graphics.path.so` | 10,096 | AndroidX graphics path iterator JNI |
| `libdatastore_shared_counter.so` | 7,112 | DataStore shared-counter JNI |
| `libsurface_util_jni.so` | 4,896 | CameraX surface JNI |

## Protection

Pairip: `libpairipcore.so` + `com.pairip.application.Application` + `FSXa.*.invoke` VM-bridge stubs (3 call sites observed: `Splash_Screen.onCreate`, `Splash_Screen` one other, `CameraActivity` one method). VM-protected method bodies are unavailable to static decompilation — noted as unknowns in feature reports.
