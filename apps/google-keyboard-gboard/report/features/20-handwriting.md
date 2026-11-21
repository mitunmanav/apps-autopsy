# Handwriting & stylus

## Recognizers (two engines)

| Engine | Classes | Notes |
|---|---|---|
| **Scribe** (server-quality) | `libraries.handwriting.classifiers.ScribeRecognizerJNI` + `scribe` native + `research/handwriting/{api,service}/scribe_recognizer.h`, `tf_graph_decoder.h` inside monolith | TF graph-based recognizer (`ScribeRecognitionCandidate` JNI result) |
| **LSTM** | `libraries.handwriting.classifiers.LSTMRecognizerJNI` + `LSTMRecognizerJNI$JNIResult` | On-device LSTM recognizer |
| **Latin handwriting** | `latin_handwriting` native module | Latin-script HW decode |

`libraries.handwriting.base.RecognitionResult` — shared result type.

## IMEs & modes

- `libs.handwriting.ime.{HandwritingIme, NlHandwritingIme, HybridHandwritingImeWrapper}` — handwriting IMEs (natural-language + hybrid variants).
- `libs.handwriting.keyboard.{HandwritingMotionEventHandler, FullscreenHandwritingMotionEventHandler, HandwritingOverlayView}` — overlay keyboard mode.
- `libs.hmmhandwriting.HmmHandwritingIme` — HMM-based handwriting (CJK).
- "Switch to fullscreen handwriting" / "Switch to half screen handwriting"; `enable_handwriting_promo`, `enable_voice_in_handwriting`.
- `enable_fallback_ondevice_recognizer`, `enable_ondevice_recognizer` — on-device fallback when the network recognizer is unavailable.
- **Training**: `enable_handwriting_training_cache`, `enable_hybrid_handwriting_training_cache` — federated-learning signals.
- `enable_proactive_emoji_kitchen`-adjacent: handwriting can emit emoji candidates.

## Stylus

- `latin.stylus.{StylusSettingsActivity, StylusSettingFragment}`, `libs.stylus.LowLatencyHandwritingOverlayView`, `libraries.inputmethod.stylus.education.{StylusConstraintLayout, StylusEducationPreference}` — stylus settings, **low-latency ink overlay** (predictive stroke rendering), stylus education.
- "Open more stylus options"/"More stylus options closed"; `enable_sync_stylus_toolbar`, `enable_stylus_widget` (`false` default), `settings_header_stylus`, `enable_handwriting_promo`.
- Japanese stylus: `mozc.ime.handwriting.JapaneseHandwritingIme`.

## Notes

Handwriting has its own training-cache stream (personalization of the recognizer on-device) and can fall back to voice (`enable_voice_in_handwriting`). The two recognizers coexist: Scribe for quality (server/TF), LSTM for offline.
