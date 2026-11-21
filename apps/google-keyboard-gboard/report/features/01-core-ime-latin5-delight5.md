# Core IME — LatinIME / "latin5" / Delight5 decoder

## What it is

The main input-method service (`com.android.inputmethod.latin.LatinIME`, `BIND_INPUT_METHOD`, `directBootAware`) delegates decoding to the **Delight5** engine — Google's fifth-generation on-device keyboard language model. A parallel class family `libs.latin5` (`LatinIme`, `ZawgyiWrappedLatinIme`, `LatinDummyIme`) is the current production implementation ("latin5" = LatinIME v5).

## Evidence

- Manifest: `LatinIME` exported, `android.view.im` → `@xml/method` (`ev_696dba11…`)
- Classes: `com.google.android.apps.inputmethod.libs.latin5.{LatinIme, ZawgyiWrappedLatinIme, LatinDummyIme, PeriodicTaskWorker, DebugOverlayView}`, `libs.latin5.handler.{LatinGestureMotionEventHandler, Latin9KeyGestureMotionEventHandler, HindiDynamicKeyboardGestureMotionEventHandler, LatinKeyboardLayoutHandler, LatinPreemptiveDecodeHandler, LatinMotionEventHandler, HeaderMotionEventHandler}`
- `com.google.android.keyboard.client.delight5.{Decoder, DecoderConfiguration, DynamicLm, LanguageIdentifier, ConceptPredictionApi, NativeProfiler, JniUtil}`; `libs.delight5.Delight5Facilitator`; `libs.delight5.Delight5DecoderWrapper` (obf package `defpackage`)
- Native: `NativeLibHelper.c("jni_delight5decoder")`, `libintegrated_shared_object.so` contains `i18n/input/engine/delight3/internal/decoder.h` lineage strings and `inputmethod/keyboard/decoder/featurepool/impls/grammar-feature-producer.h` (`ev_1f0e9ae1…` for binding inventory)
- `Delight5DecoderWrapper.finishComposing`, `Decoder state is invalid`, `next_word_prediction`, `model_interface`, `onActivate(), incognitoMode=%s, shouldEnableLearning=%s` — decoder is per-field aware (incognito disables learning)

## Structure

- `LatinIme` extends `AbstractIme`; handlers split responsibilities: motion events (tap/glide), layout, preemptive decode.
- `ZawgyiWrappedLatinIme` wraps Burmese Zawgyi → Unicode conversion around the IME (Myanmar support).
- `DebugOverlayView` + `NativeProfiler` + `enable_native_profiler`/`libjni_signalinitializer.so` — decoder perf instrumentation.
- `PeriodicTaskWorker` — maintenance (LM pruning, metrics).

## Special key handling

- `enable_new_25q2_keycodes`, `enable_new_26q2_keycodes`, `enable_new_26q3_keycodes`, `enable_new_27q2_keycodes` — quarterly new-keycode rollouts.
- Bengali key-event interpreter (`keyevent.interpreters.BengaliKeyEventInterpreter`) — per-script key routing.

## Limitations

Decoder internals live in native code (Delight3→5 lineage inside `libintegrated_shared_object.so`); exact LM architecture is not visible in DEX. Method-level behavior inferred from wrappers/strings.
