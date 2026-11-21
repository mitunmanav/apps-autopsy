# On-device GenAI stack — Gemma, AICore, Brella/TF, Private AI Compute

## GenAiDelegate — on-device LLM JNI

`libs.ondevicegenai.GenAiDelegate` (`NativeLibHelper.c("tensorflow_jni")` → brella split). Only the handle lifecycle methods are JNI — `llm`/`llmInference`/`proofread` are Java wrappers that check the handler and LoRA file before dispatching into the native session:

```java
public byte[] llm(byte[] bArr, byte[] bArr2);                    // wrapper
public byte[] llmInference(byte[] bArr, byte[] bArr2, byte[] bArr3); // wrapper
public byte[] proofread(byte[] bArr);                            // wrapper
public native long nativeCreateGenAiDelegate();                  // JNI
public static native void nativeDestroyGenAiDelegate(long j);    // JNI
```

- Byte-array protobuf in/out; returns tagged results — all 8 tags found: `<errorcode>`, `<execution_exception>`, `<handler_not_ready>`, `<interrupted_exception>`, `<llm_request_params_error>`, `<lora_file_error>`, `<no_result>`, `<timeout_exception>`.
- Result parser keys on `otc.PROOFREAD` — a typed GenAI result enum (other ops exist: REWRITE etc.).
- LoRA support: `<lora_file_error>` — model adapter files loaded per-feature (proofread LoRA vs rewrite LoRA).
- `enable_gen_ai_delegate` gates it; `ise`/`oqn` handler wraps the native session; `nin` single-thread executor.

## GemmaOdmlWrapper — Gemma via ODML

`libs.ondevicesmallllm.{PostProcessor, impl.GemmaOdmlWrapper}`:

```java
private static native long nativeCreate(byte[] config);
private static native boolean nativePrepare(byte[] cfg);
private static native byte[] nativeGenerateResponse(long handle, byte[] req);
private static native void nativeUnload(long handle);
```

- `ondevicesmallllm` = "on-device small LLM" — Gemma (Nano) through Google's ODML/MediaPipe LLM inference.
- `enable_ai_core_llm`, `enable_ai_core_embedding_gemma`, `enable_gemma_embedding_emoji_kitchen_ranker`, `enable_fallback_for_emoji_search_gemma_engine_error`, `enable_prewarming_for_emoji_gemma_search_engine_activation`, `show_error_status_for_emoji_search_gemma_error` — Gemma also powers **semantic emoji search** and Emoji-Kitchen ranking, with server fallback.

## Brella — TensorFlow feature split

- `split_brella_feature_split.apk` ships `libtensorflow_jni.so` (≈37 MB) on demand; `NativeLibHelper.c("tensorflow_jni")` resolves it.
- `libs.dvrnn.BrellaReadinessChecker` — features check brella availability before loading TF models.
- Phenotype namespaces `BRELLA`, `BRELLA_COUNTERS` — brella has its own metrics stream.
- EdgeTPU: manifest `<uses-native-library>` `libedgetpu_util.so`/`libedgetpu_client.google.so` + `use_tpu` flag — **Pixel Tensor NPU acceleration** when present.
- `enable_fallback_ondevice_recognizer`, `disable_ondevice_auto_download` — download management.

## AICore / Private AI Compute

- `com.google.android.apps.aicore.service.BIND_SERVICE` + `com.google.android.aicore` query — binds to **AICore (Gemini Nano system service)**.
- `com.google.android.as` / `com.google.android.as.oss` — Android System Intelligence / Private Compute Core.
- `enable_llm_pc*` — Private AI Compute flow for Writing Tools (encrypted confidential cloud). The PAC disclosure text (`0x7f14055f`) explains the model to users.
- Queries for `com.google.android.as` update prompt "update your Android System Intelligence app" — advanced dictation features depend on ASI.

## Other on-device ML

| Capability | Native/flag |
|---|---|
| LLM grammar checker | `enable_llm_based_grammar_checker`, `grammar-checker_jni`, `enable_grammar_checker{,_on_webview}` — grammar check incl. WebView |
| Emoji predictor (TFLite) | `enable_emoji_predictor_tflite_engine`, `enable_lite_emoji_prediction_engine` |
| Emojify | `emojify-jni`, `enable_emojify_*` |
| Expressive concepts | `expressive_concepts{,_blocklist}`, `libexpressive_concepts_model_less_predictor_jni_native.so`, `learning.expander.pod.inferenceapi.expressiveconcepts.*` |
| MobileBERT intent | `mobilebert_classifier_android_jni` |
| Sentence explorer | `sentence_explorer_jni` |
| Grammar FST | `speech/util/focus/grammar_fst_compiler`, `nlp/fst_grammar` inside `libintegrated_shared_object.so` |
| Correction learning | `correction_learning_jni` |
| Post-processor | `post_processor_jni`, `ondevicesmallllm.PostProcessor` |
| Prompt templates | `prompt_templates_android_jni`, `ModularPromptTemplates` |
| Safety | `safety_violation_checker_jni` |
| Sign language | `mediapipe_jni`, MediaPipe framework classes |
| WebP decode | `jni_webp` + `libraries.inputmethod.webp.*` |
| OCR | `research/ocr/*` inside monolith + `search.ocr.*` |
| TensorFlow runners | `trainingcache.impls.nativeutils.TfRunner` for federated training |

## Notes

Two parallel GenAI paths exist: **on-device** (GenAiDelegate/GemmaOdml via brella TF + AICore) and **cloud-private** (PAC + Gemini API for Muse/Rambler). Feature flags choose per-locale, per-device. The heavy models are *not* in the APK — they're downloaded (Superpacks/MDD) or provided by AICore.
