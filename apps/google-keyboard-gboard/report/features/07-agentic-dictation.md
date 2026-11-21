# Agentic dictation

## What it is

A dedicated `AgenticDictationIme` — a dictation mode where an **agent** acts on the transcript (multi-step voice tasks rather than plain transcription). Distinct from SmartEdit (which edits text), agentic dictation performs actions.

## Evidence

- `libs.agenticdictation.AgenticDictationIme` (extends `AbstractIme`, implements `sgn` voice callbacks: `onVoiceStart/onVoiceText/onVoiceStop/onListeningStop`) — a full IME for agentic sessions.
- `libs.agenticdictation.ui.impl.AgenticDictationOnboardingViewWithArrow` — onboarding UI.
- The whole agentic stack nests under `libs.agenticdictation`: `lite.{JetsonLiteHandler, JetsonLiteRecognizer, JetsonLiteRecognizerModule, JetsonLiteStreamingAsrAdapter}` (Jetson Lite engine — see [06-jetson-smartedit](06-jetson-smartedit.md)), `extension.{RamblerController, RamblerUndoStateMachine}` (Rambler — see [08-rambler-muse](08-rambler-muse.md)), `ui.{RamblerUiManager, impl.{AbstractRamblerUiController, DefaultRamblerUiManager, RamblerUiAlToolbarController, RamblerUiVkController, RamblerAlToolbarFeedbackHandler}}` — the codenames are one system: Jetson = ASR engine, Rambler = UI/extension layer, agentic dictation = the product.
- Flags: `enable_agentic_dictation`, `enable_agentic_dictation_debug_ui`.
- `enable_dictation_feature_split_install` — dictation delivered as an on-demand feature split.
- "Go to a text field to use dictation" + `INJECT_KEY_EVENTS` — agentic actions can inject keys into apps.

## Notes

The class is thin — orchestration lives in the `sgn`-interface handlers (obfuscated `defpackage` classes: `sgm`, `sgn`, `shg`, `vec`, `yvx` voice-session objects) plus the LLM/GenAI stack. The IME wraps the voice session and commits agent output. Debug UI flag suggests an inspector for agent steps.
