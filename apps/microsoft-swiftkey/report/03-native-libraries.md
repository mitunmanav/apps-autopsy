# 03 — Native libraries

All `.so` files ship in `split_config.arm64_v8a.apk` under `lib/arm64-v8a/` (extracted at `_work/splits/split_config.arm64_v8a/lib/arm64-v8a/`). `extractNativeLibs=false` → they are loaded page-aligned from the APK.

| Library | ELF | Size role | Java surface |
|---|---|---|---|
| `libfluency-java-internal.so` | ELF64 AArch64 DYN | ~5.1 MB — the Fluency prediction/learning engine | `com.microsoft.fluency.*` |
| `libonnxruntime.so` | ELF64 AArch64 DYN | ONNX Runtime core | via `libonnxruntime4j_jni` |
| `libonnxruntime4j_jni.so` | ELF64 AArch64 DYN | ONNX Java JNI shim | `ai.onnxruntime.*` |
| `libhwr_jni.so` | ELF64 AArch64 DYN | Handwriting recognition JNI | `com.microsoft.hwr.*` |
| `libsigner.so` | ELF64 AArch64 DYN | Adjust request signing | `com.adjust.sdk.sig.NativeLibHelper` |
| `libdatastore_shared_counter.so` | ELF64 AArch64 DYN | androidx DataStore counter | `androidx.datastore.core.NativeSharedCounter` |
| `libandroidx.graphics.path.so` | ELF64 AArch64 DYN | androidx graphics path ops | androidx internals |

REA `inspect_android_jni_bindings` (evidence `ev_dcfcff00…`) scanned both DEX files: **466 native declarations** across 21,971 classes / 100,750 methods. Because libraries ship in the abi split, `library_inventory` in the base APK is empty by design — matching is done against extracted `.so` exports.

## Fluency JNI surface (`libfluency-java-internal.so`, evidence `ev_c3fb12ef…`)

Exported `Java_*` symbols establish these peer classes and methods (representative set):

- `com.microsoft.fluency.Fluency`: `getVersion`, `getExpiry` — engine licensing/version
- `Sequence`: `toString`, `getContact`, `subseq`
- `TouchHistory`: `createPeer`, `addPress(Point, ShiftState, F, J, String)`
- `Prediction`: `getReplaceWildcards`
- `ModelSetDescription`: `verify`, `toString`; `ModelMerger`: `serialize`
- `impl.PredictorImpl`: `getPredictions`, `batchUnload`, `setEnabledModels`, `getDynamicModelMetadata`, `getBlocklist`, `getInputMapperImpl`, `getPunctuatorImpl`
- `impl.InputMapperImpl`: `getLayout`, `getAccentedVariantsOfMulti`, `removeCharacterMaps`, `removeAllCharacterMaps`
- `impl.PunctuatorImpl`: `getPredictionTriggerString`
- `impl.TokenizerImpl`: `split`
- `impl.LayoutFilterImpl`: `set`
- `impl.ParameterImpl`/`ParameterSetImpl`: `minValue`, `reset`, `dispose`, `getTargets`
- `impl.NotTaggedWithSelector`: `createPeer`
- `internal.InternalFluency`: `createHybridSession`, `setNativeCrashDetectionEnabled`
- `internal.NetworkRequest`: `getBody`, `setError` — **the engine has a network-request bridge** (server-assisted predictions/delivery), not purely on-device
- `internal.PredictionFactory$Metadata`: `locale`
- `internal.impl.PredictionsPromiseImpl`: `destroyPeer` — async/promise API

Java-side API classes (`_work/jadx-base/sources/com/microsoft/fluency/`): `Session`, `Predictor`, `Predictions`, `Prediction`, `Term`, `Sequence`, `SequenceTermMap`, `TermPosition`, `InputMapper`, `KeyPress`, `KeyPressModel`, `KeyShape`, `Point`, `TouchHistory`, `LayoutFilter`, `ResultsFilter`, `Punctuator`, `Tokenizer`, `SentenceSegmenter`, `TagSelector(s)`, `ModelSetDescription`, `ModelMerger`, `DynamicModelMetadata`, `Parameter(Set)`, `Trainer`, `LoggingListener`, script helpers `Chonjiin`, `Hangul`, `Japanese`, `NaratGeul`, `Telex`, and exceptions incl. `LicenseException` (the engine is licensed, with expiry).

## Handwriting (`libhwr_jni.so`)

`com.microsoft.hwr.LibHwrLoader.init`, `Recognizer.{init, createContext, close}`, `Context.{addStroke, setGuide, process, getResults, reset, close}` — stroke-sequence → recognition pipeline.

## ONNX Runtime

`libonnxruntime.so` + `libonnxruntime4j_jni.so` expose the standard `ai.onnxruntime` API (OnnxMap/OnnxSequence/OnnxSparseTensor/OnnxTensor/OnnxRuntime with `getAvailableProviders`, `initialiseAPIBase`, `initialiseTrainingAPIBase`, `initialiseVersion`). Used by the Whisper AI-voice module and on-device classifiers [inferred from module wiring].

## libsigner.so

`Java_com_adjust_sdk_sig_NativeLibHelper_nSign` / `nOnResume` — Adjust SDK's native request-signing (anti-fraud signature) library.

## libdatastore_shared_counter.so

Standard androidx DataStore multi-process counter JNI.

## libandroidx.graphics.path.so

Standard androidx `graphics-path` native impl (vector path iteration).
