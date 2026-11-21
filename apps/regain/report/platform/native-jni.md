# Native Libraries & JNI

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Evidence:** `inspect_android_jni_bindings` `ev_a2a89ba25b9dce07800016d3e5e3b593c629c707fae6af809fce499ca27ce613`; archive `ev_227a0585607a4b72e0fa6e52b9558e9afbe8f741306272fc64ce38fbf66b04ed`

## Findings (OBS, complete)

- **13 native methods declared**, zero are app code — every one belongs to `androidx.camera.core`/`androidx.graphics` internals:
  - `libimage_processing_util_jni.so` → `ImageProcessingUtil` (`convertYUVToRGB`, `convertYUVToBitmap`, `rotateYUV`, `shiftPixel`, `applyRippleCorrection`, `nativeArgbToRgb`, …) — CameraX YUV pipelines.
  - `libsurface_util_jni.so` → `SurfaceUtil` (`nativeGetSurfaceInfo`).
  - `libandroidx.graphics.path.so` → `PathApi`/`PathIterator` natives (`createPathIterator`, `conic`, `destructiveMoveTo`, `getPointsSize`, `next`, `rawSize`, `close`).
- **0 app-authored JNI methods.** All blocking/monitoring/timer logic is pure Java/Kotlin; nothing is hidden behind `native` to defeat decompilation.
- `extractNativeLibs="false"` (OBS) — libs mapped directly from the APK.
- `.so` payloads: **none in base.apk**; the arm64 split `split_config.arm64_v8a.apk` (SHA-256 `e2ab7fd5…9f46`, sibling artifact) carries exactly these 3 androidx `.so` files. No `base__` lib directory → on x86 builds these calls would fail; Google Play delivers the matching ABI split.
- `usesNonSdkApi=true` (OBS, manifest) — hidden-API usage allowed for the app (INF: monitor service needs it).

## JNI binding map (OBS)

| Declared method | Bound class | Library |
|---|---|---|
| `convertYUVToBitmap`, `convertYUVToRGB`, `convertYUVToBitmapInternal`, `rotateYUV`, `shiftPixel`, `applyRippleCorrection`, `nativeArgbToRgb` | `androidx.camera.core.ImageProcessingUtil` | `libimage_processing_util_jni.so` |
| `nativeGetSurfaceInfo` | `androidx.camera.core.internal.utils.SurfaceUtil` | `libsurface_util_jni.so` |
| `createPathIterator`, `conic`, `destructiveMoveTo`, `getPointsSize`, `next`, `rawSize`, `close` | `androidx.graphics.path.PathApi`/`ConicConverter` | `libandroidx.graphics.path.so` |

UNK: no obfuscated/symbol-stripped app `.so` exists — no further native analysis needed.
