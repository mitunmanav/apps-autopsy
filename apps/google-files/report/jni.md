# JNI bindings

Evidence: `ev_b482f31ed2ac27b1f6487de7686a2ed4ac2391c94df9c665db946368a34651da`
— static JNI inventory across 4 DEX files, 18,409 classes, 93,543 methods.

**25 `native` declarations found.** The inventory's library-candidate pass
selected zero libraries when run against `base.apk` — expected, since the
`.so` files live in `split_config.arm64_v8a.apk`. Binding below is by
Java-package ↔ `Java_*` symbol-name matching.

## Declaration groups

| Declaring class | Natives | Bound library | Binding confidence |
|---|---|---|---|
| `com.google.android.libraries.vision.visionkit.imageutils.ImageUtils` | `isBlurred`, `getClarityValue`, `downsampleImage`, `convertYUV420SPToARGB8888`, `convertARGB8888ToYUV420SP` | `libimageutilsjni.so` | **symbol-exact** (all 5 exports match) |
| `com.google.android.libraries.geller.portable.Geller` + `GellerDatabaseManagerImpl` | geller corpus ops (open/read/write/delete/cache mgmt) | `libgeller_jni_lite_lib.so` | high — package/name match; `.so` stripped so no `Java_*` symbol check, but size (1 MB) and name are conclusive |
| `com.google.android.libraries.storage.protostore.MappedCounterCacheVersion` | version stamp read | `libmappedcountercacheversionjni.so` | high — name-exact |
| `androidx.graphics.path.ConicConverter`, `PathIteratorPreApi34Impl` | path/conic iteration | `libandroidx.graphics.path.so` | high — name-exact |

## What is NOT established statically

- `System.loadLibrary(...)` call sites and library load order.
- Whether any `RegisterNatives` dynamic registration exists (geller lib is
  stripped; its JNI binding is likely `RegisterNatives` or C++ dispatch —
  cannot confirm symbolically).
- Invocation liveness: a `native` decl + present `.so` proves the *capability*
  shipped, not that the code path executes at runtime.
- ABI coverage: only arm64-v8a split was provided; other ABIs (armeabi-v7a,
  x86_64) presumably exist in Play-delivered splits but are absent here.
