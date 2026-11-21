# Jetson voice editing & SmartEdit

## What it is

**Jetson** is Gboard's next-generation voice engine — an on-device recognizer that understands both dictation and *editing commands* ("delete that", "make it sound friendly"). **SmartEdit** is the intent layer that turns voice commands into text edits.

## Evidence

- `JetsonLiteRecognizer`, `JetsonInputSession`, `JetsonLiteHandler`, `JetsonLiteRecognizerModule` — on-device ("Lite") voice engine; `VoiceEditingResult [jetson][news3]` — emits structured `VoiceEditingResult` (text + edit ops), with `news3` S3 online fallback.
- `libs.genaivoice.smartedit.Interpreter` — the SmartEdit interpreter; `MobileBertIntentClassifier` + `mobilebert_classifier_android_jni` — **MobileBERT intent classifier** classifies utterances as dictation vs command.
- `libs.genaivoice.rewrite.RewriteCommands` + `rewrite_commands_android_jni` — rewrite-style command execution.
- `interpreter_android_jni` — the command interpreter JNI (inside `libintegrated_shared_object.so`).
- `enable_smart_edit_apply_for_smart_dictation` — SmartEdit applies edits in Smart Dictation.
- `enable_nga_lab_modeless_smartedit`, `enable_nga_lab_smartedit_promo_banner`, `disable_nga_lab_smartedit_promo_banner_throttling` — NGA-lab SmartEdit promo.
- Modeless-SmartEdit model delivery (verified flag keys): `nga_lab_modeless_smartedit_mobilebert_{url,checksum}`, `…_bert_vocab_{url,checksum,case_sensitive}`, `…_llm_timeout_millis`, `…_intent_classifier_{strict_,}threshold`, `…_context_max_words`, `…_{model,regex}_version{,_strict}` — the intent classifier, BERT vocab, and regex rules are **downloaded per-version with checksums**, not bundled.
- `enable_writing_tools_voice_commands` — voice commands for Writing Tools ("Just say 'make it sound friendly' or 'add some happy emoji'").
- `Open the list of supported voice rewrite command options` — supported-command sheet.
- Embedded prompts in `libintegrated_shared_object.so`: `"* Editing: Improving clarity, conciseness, grammar, and tone."`, `"* Polishing: A comprehensive but conservative edit to fix typos and inferred speech recognition errors …"` — the SmartEdit LLM prompt set ships inside the native lib.
- "SmartEdit with Gboard" (string `0x7f140d3c`), "A tooltip to indicate a requested rewrite style is not supported".

## Pipeline

Mic → JetsonLite ASR (on-device, greco3/SODA) → `VoiceEditingResult` (text + spans) → MobileBERT intent classifier → Interpreter (command vs dictation) → `RewriteCommands`/LLM rewrite (Muse, see next doc) → apply edit diff to the field. `AudioSilenceMonitor` handles endpointing; `enable_dual_stream_biasing_arbitration` arbitrates dictation-vs-command biasing.

## Notes

- "news3" = server speech session tag (S3); Jetson can fall back to online recognition.
- `enable_nga_lab_modeless_smartedit` — a "modeless" SmartEdit (no separate mode) is experiment-gated.
