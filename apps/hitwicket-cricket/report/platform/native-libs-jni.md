# Native Libraries & JNI

**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 (205957) — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`; libs physically in `split_config.arm64_v8a.apk` sha256 `d9b9b79defe91d71ec53ca591ff5e9bab42449e29e707252f6514de5005318c8` (extractNativeLibs=false → loaded from APK)

## Library inventory (lib/arm64-v8a/) [observation]

| Library | Bytes | Identity |
|---|---|---|
| libil2cpp.so | 195,788,936 | IL2CPP game code (all 210 assemblies) |
| libunity.so | 27,247,752 | Unity engine |
| libwebrtccsharpwrap.so | 13,655,448 | WebRTC C# wrapper (Byn.Awrtc voice) |
| libFirebaseCppApp-13_14_0.so | 4,188,520 | Firebase C++ core v13.14.0 |
| libsqlite3.so | 1,327,456 | SQLite |
| libsigner.so | 945,120 | **Adjust sig lib** — exports `Java_com_adjust_sdk_sig_NativeLibHelper_nSign`, `nOnResume` (ev_577ae7cb…) |
| libcrashlytics-common.so | 864,616 | Crashlytics NDK |
| libapplovin-native-crash-reporter.so | 843,152 | AppLovin crash reporter |
| liblofelt_sdk.so | 815,416 | Lofelt haptics — `Java_com_lofelt_haptics_LofeltHaptics_{create,load,play,loop,seek,stop,getClipDuration,destroy,setAmplitudeMultiplication}` + `lofeltHapticsLoadDirect` (ev_2ae30ecb…) |
| lib_burst_generated.so | 608,408 | Unity Burst-compiled jobs |
| libunitycoherencenative.so | 493,112 | **Unity Coherence bridge** — `CoherenceBridge_{init,vmCreate,vmInvokeMain,vmDrop,vmLastError,getVersions,getCommonAttributes,setExternalUserId,setLogHandler,isInitialized}` (ev_ce9b55d3…) |
| libcrashlytics.so / -handler.so / -trampoline.so | ~460K | Crashlytics NDK parts |
| libFirebaseCpp{Auth,Messaging,RemoteConfig,Analytics,Crashlytics}.so | ~560K | Firebase C++ modules |
| libAdaptivePerformance{Hint,ThermalHeadroom}.so, libAndroidCpuUsage.so | ~35K | Adaptive Performance |
| libdatastore_shared_counter.so | 7,112 | datastore counter |
| libmain.so | 6,696 | Unity entry shim |

## gpdeku split native lib [observation — ev_3fe6b1fa…]
`libgpdeku.so` exports `Java_com_google_android_play_deku_screencapture_NativeBridge_native{Initialize,GetSurfaceControl,GetMirrorSurfaceControl,ReleaseSurfaceControl}` + JniZero glue → Play **screencapture** feature module.

## Java-layer JNI declarations [observation — ev_fe36f40a…]
`inspect_android_jni_bindings` scanned 8 dex / 49,383 class units / 313,291 methods → 293 `native` declarations found (64 shown on the first page: org.webrtc 59, org.webrtc.audio 2, com.lofelt.haptics 2, com.because_why_not.wrtc 1; remaining 229 not yet enumerated). Note: 49,383 counts all class units incl. nested/synthetic classes — the jadx top-level class index reports 32,783 for the same dex set. Binding match = 0 because libraries live in the ABI split, not base.apk — **coverage limit, not absence**. IL2CPP internal calls into libil2cpp/libunity are not visible to this tool.

## Native integration summary [inference]
- Voice: DEX `org.webrtc.*` Java API ↔ `libwebrtccsharpwrap.so` (native peer) and `com.because_why_not.wrtc` bridge into C# `Byn.Awrtc`/`awrtc`/`WebRtcCSharp` assemblies → `ws://s.y-not.app/callapp` signaling.
- Haptics: `Lofelt.NiceVibrations.dll` ↔ liblofelt_sdk.
- Content delivery: `libunitycoherencenative.so` = Unity **Coherence** remote-content VM bridge (not the coherence-mp networking lib).
- Fraud: Adjust signature computed natively via libsigner.
