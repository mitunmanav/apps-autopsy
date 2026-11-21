# Editor (grammar) & Tone changer & Writing assistance hub

Evidence: `prefs_editor_*`, `improve_*`, `tone_*` strings, `editor.EditorConfiguration` + `offline_editor_intelligence_dynamic_module_title`, `toolbar_editor_*`, `toolbar_tone_*`, `toolbar_writing_assistance_hub_caption`, `toolbar_tone_change_panel.xml`, `toolbar_improve_panel.xml`, `tips_tone_*`, `editor_clip_candidate_*`.

## Editor ("System Grammar")

- Settings: `prefs_editor_title` "System Grammar corrections" ("See grammar corrections and underline grammar mistakes as you type") + `prefs_editor_candidate_title` "System Grammar suggestions" ("See grammar suggestions in the prediction bar"); prefs `pref_editor_enabled_key`, `pref_editor_candidate_enabled_key`.
- Editor panel (`toolbar_editor_caption` "Editor", `toolbar_editor_open` "Showing Editor panel"): processes the field text; loading copy `improve_loading_1` "Looking for corrections…" → `improve_loading_2` "Suggesting improvements for your text…" → `improve_loading_3` "Generating improved text…"; results replace or annotate text.
- Empty/errors: `improve_empty_input_title` "Welcome to Editor!", `improve_no_change_error`, `improve_rai_error` (responsible-AI refusal).
- `editor_suggestions_available_announcement`, `editor_clip_candidate_content_description` — candidate-bar grammar suggestions.
- **Offline Editor Intelligence** — `offline_editor_intelligence_dynamic_module_title` is a separate on-demand dynamic module: on-device grammar model (ONNX) [inferred — ONNX runtime ships in-base].
- `bibomodels.editor.EditorConfiguration` — remote config.

## Tone changer

- Toolbar "Tone" (`toolbar_tone_caption`, `toolbar_tone_change_panel.xml`, `toolbar_tone_change_tone.xml`): rewrites selected/typed text in a chosen tone.
- **Tones**: Casual, Cheeky, Funny, Polite, Professional, Sarcastic, Social post, Witty.
- Loading: `tone_change_loading_1` "Analysing text…" → `…_2` "Generating alternative versions…" → `…_3` "Suggesting new tones…".
- Per-result actions: Copy / Replace (`tone_copy/replace/copied/replaced_button_description`); `tone_empty_input_message` needs ≥3 words.
- Explainer video `https://assets.swiftkey.com/app/tone-02.webm`; tips page `tips_tone_*` ("How to use tone changer": type → Copilot icon → pick tone).
- Cloud-backed (Bing/Copilot) — shares `bing_*` error/disclaimer/consent machinery.

## Writing assistance hub

`toolbar_writing_assistance_hub_caption` — a toolbar hub grouping AI writing tools (Editor + Tone + Copilot entry points).
