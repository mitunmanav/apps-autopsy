# Native Libraries + JNI

Artifact: `com.bumble.app` — libs in `split_config.arm64_v8a.apk` SHA-256 `7b3846b414055f15943b75810151b9d5176637a73c09911bf9dd72f59ed7de34`; declarations in `base.apk` `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

Evidence: `inspect_android_jni_bindings` `ev_d0581bd6` (322 native decls, 10 DEX entries scanned), ZIP listing of arm64 split, class inventories.

## Shipped `.so` files (arm64-v8a only) [obs]
| Library | Vendor/purpose (from symbol/pkg evidence) |
|---|---|
| `libjingle_peerconnection_so.so` | WebRTC peer connection (org.webrtc) — voice/video calls |
| `libtensorflowlite_jni_gms_client.so` | TFLite via GMS dynamite — Elise on-device ML |
| `liblitr-jni.so` | LiteRT JNI — same ML stack |
| `libveriffyuv.so` | Veriff camera YUV processing (ID verification) |
| `libsentry.so`, `libsentry-android.so` | Sentry crash/NDK reporting |
| `libimage_processing_util_jni.so` | CameraX image processing |
| `libsurface_util_jni.so` | CameraX surface utils |
| `libdatastore_shared_counter.so` | androidx DataStore multi-process counter |
| `libandroidx.graphics.path.so` | androidx graphics path |
| `libpl_droidsonroids_gif.so` | android-gif-drawable |

`base.apk` contains **zero** `.so` files [obs]; `extractNativeLibs="false"` means the split's libs are loaded uncompressed from the APK [obs].

## JNI declarations [obs]
- 322 `native` method declarations across base DEXes.
- **0 resolved bindings** — the binding scan cannot match libs across the split boundary; every match is therefore [unk].
- Largest declaration clusters map to `org.webrtc.*`, `org.tensorflow.lite.*`/`com.google.android.gms.tflite.*`, `io.sentry.*`, `androidx.camera.*`, `pl.droidsonroids.gif.*`, Veriff SDK classes [obs from class names; call-graph match unk].

## Loading notes [inf]
- `System.loadLibrary` call sites exist in obfuscated init code; exact load order and lazy/eager behavior unknown without runtime [unk].
- `WebRtcService` decompile shows `org.webrtc.EglBase` + renderers — implies `libjingle_peerconnection` loaded for calls [inf].
- Elise worker stores a model+vocab in `_elise_assets/`; `libtensorflowlite_jni_gms_client` + `liblitr-jni` are the only inference-capable libs → Elise runs on TFLite/LiteRT via GMS dynamite [inf].

## Unknowns
- Runtime `dlopen` of extracted/third-party libs, JNI `RegisterNatives` tables — not resolvable statically [unk].
- Whether any `.so` is dead weight vs. actively loaded [unk].
