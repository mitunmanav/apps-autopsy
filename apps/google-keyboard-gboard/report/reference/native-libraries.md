# Native library reference

All libraries are `arm64-v8a`, `extractNativeLibs="false"` (run directly from APK, page-aligned).

## Base APK (`lib/arm64-v8a/`)

| Library | Role (evidence: SONAME, JNI declarations, embedded strings) |
|---|---|
| `libintegrated_shared_object.so` | **The monolith.** Contains Delight3 decoder (`delight3`), Mozc Japanese IME (`googleclient/ime/mozc/nsc/*`, `i18n/cjk/ja/i18n_mozc/*`), Scribe handwriting (`research/handwriting/{api,service}/scribe_recognizer.h`, `tf_graph_decoder.h`), OCR (`research/ocr/tensorflow/ops/key_value_processor.h`, `research/ocr/util/registerer_helper.h`), speech/greco3 pipeline, grammar checking, and embedded SmartEdit prompt templates. The largest carrier of features. |
| `libgboard_pipeline_jni.so` | JNI bridge for the main decode pipeline (`"gboard_pipeline_jni"` load ref). |
| `libgrammar-checker_jni.so` | Grammar checker JNI. |
| `libexpressive_concepts_model_less_predictor_jni_native.so` | Expressive-concepts predictor (Expression Moments — model-less variant). |
| `libfilterframework_jni.so` | Image filter framework (camera/OCR pipeline). |
| `libimage_processing_util_jni.so` | Image preprocessing for OCR/Lens. |
| `libgraphics-core.so`, `libandroidx.graphics.path.so` | Graphics path/shape rendering (ink, previews). |
| `libsurface_util.so` | Surface utilities (camera/graphic overlay). |
| `libogg_opus_encoder.so` | **Opus encoding** — voice-typing audio codec. |
| `libjni_signalinitializer.so` | Signal/exception handler init. |
| `libnative_crash_handler_jni.so` | Native crash reporting. |
| `libscam_partition.so`, `libscam_partitioner.so`, `libscam_scorer.so` | **SCAM** = on-device semantic-context scorer: partitions surrounding text and scores suggestion/context relevance (metrics namespace confirmed; feeds Smart Compose/contextual ranking). |

## Feature-split libraries

| Split | Library | Role |
|---|---|---|
| `split_brella_feature_split.apk` | `libtensorflow_jni.so` | TensorFlow runtime for on-device FL training + TF-based models (delivered on demand via Play feature delivery) |
| `split_tenoranimation_feature_split.apk` | `libtenoranimation_jni.so` | Animated sticker/GIF decode for the Tenor pipeline |

## Native modules loaded by name (JNI load-library references)

Modules referenced via `System.loadLibrary`/native decls beyond the shipped `.so` set — some resolve inside the monolith, some load from splits, some are optional (Edge TPU delegates):

`gboard_pipeline_jni`, `grammar-checker_jni`, `emojify-jni`, `emojikitchen-ranker-jni`, `expressive_concepts`, `latin_handwriting`, `mobilebert_classifier_android_jni`, `mozc`, `mozc_without_supplemental_model`, `prompt_templates_android_jni`, `rewrite_commands_android_jni`, `safety_violation_checker_jni`, `sentence_explorer_jni`, `tenoranimation_jni`, `tensorflow_jni`, `bad_word_checker_jni`, `dictation_jni`, `interpreter_android_jni`, `post_processor_jni`, `correction_learning_jni`, `scribe`, `hmm`, `mediapipe_jni`.

Manifest `<uses-native-library>` (all optional): **Edge TPU** `libedgetpu_util.so` + `libedgetpu_client.google.so` — TPU delegate for accelerated inference (Signboard "TPU mode" confirmed in strings); **OpenCL** `libOpenCL.so`, `libOpenCL-car.so`, `libOpenCL-pixel.so` — GPU compute delegates (generic/Qualcomm-car/Pixel variants) for TF-Lite/MediaPipe inference.

## Notes

- The monolith consolidates what upstream AOSP/Google ship as separate libs — one `.so` reduces JNI boundary cost and enables shared LM code across Delight/Mozc/Scribe/OCR.
- `lora_name`/`lora_path` keys confirm **LoRA adapters** load on top of base GenAI models (Rambler/Writing Tools personalization).
- 668 native-method declarations in DEX; 228 statically matched to loaded libs. Unmatched methods resolve in the monolith or via reflection — not all bindings are statically provable.
