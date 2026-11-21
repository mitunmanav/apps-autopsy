# Rambler (voice personalization + AI toolbar) & Muse (Gemini editing)

## Rambler — smart-dictation personalization & AI toolbar

Two distinct things carry the "Rambler" name:

1. **Voice personalization**: "Learn and use words you've corrected when voice typing with Rambler"; "This will delete all the words Rambler has learned from your past corrections"; `enable_biasing_for_contacts_learned_from_past_corrections`, `enable_p13n_*` — learns the user's corrections to bias future dictation.
2. **Rambler AL toolbar widget**: `RamblerAlWidgetSoftKeyboardView`, `WidgetInnerHolderForAlRambler`, `RamblerUiAlToolbarController`, `RamblerAlToolbarFeedbackHandler` — an **assistant-like toolbar** on the keyboard (the "energy shader" Gemini bar).
   - Tiers: `Rambler Base`, `Rambler Lite`, `Rambler S` (model tiers); `RamblerLite LLM Download` — Rambler has a downloadable small LLM.
   - Flags: `enable_rambler_al_toolbar`, `enable_rambler_al_toolbar_overflow_menu`, `enable_rambler_al_teleporting_animation`, `enable_rambler_al_show_hide_new_animation`, `enable_rambler_motion_dots`, `enable_rambler_toolbar_at_cursor_position`, `enable_hide_rambler_al_idling_state`, `show_rambler_only`, `show_rambler_dict_settings`, `.rambler-al-feedback-dropdown-icon`, `enable_personal_context_energy_shader_animation`, `enable_personal_context_energy_shader_google_colors` — animated "energy shader" in Google colors.
   - Privacy string: *"When you use this feature, your text, audio input, and personal dictionary will be temporarily processed by Google. Rambler can make mistakes, so double-check it."* — Rambler calls Google's servers (Gemini) with field text + audio + personal dictionary.

## Muse — Gemini-powered editing agent

- `MuseContextModule`, `MuseAudioRecorder`, `MuseStatsProcessor` (obf `defpackage` classes) — a module + audio recorder + stats processor for the Muse feature.
- Event constants: `MUSE_DICTATION`, `MUSE_EDIT`, `MUSE_REGENERATE`, `MUSE_CANCEL`, `MUSE_CLOSE`, `MUSE_AGENT_FEEDBACK`, `MUSE_ACCESS_POINT_{UP,DOWN,EXTRA_TAP}` — Muse is reachable from the access-point toolbar and supports regenerate/cancel + thumbs feedback.
- Config keys: `muse_gemini_api_key`, `muse_gemini_model`, `muse_gemini_mode`, `muse_gemini_temperature`, `muse_gemini_thinking_level`, `muse_audio_bit_rate` — **Muse is a Gemini-API client** with tunable model/mode/temperature/"thinking level".
- Flags: `enable_muse`, `enable_muse_debug`, `enable_muse_opus`, `enable_muse_screen_context`, `enable_muse_streaming` — `muse_opus` (larger model tier), `screen_context` (reads screen for context), `streaming` (streamed responses).
- "Jetson or Traditional preference is null when Jetson layout is enabled" — Muse/Jetson = the new voice stack vs "Traditional" dictation (`settings_header_jetson_voice` vs `settings_header_traditional_voice`).

## Relationship

Rambler (personalization + toolbar surface) → Muse (Gemini edit agent) → Jetson/SmartEdit (voice+edit execution). Rambler AL is the toolbar; Muse is the agent behind "make it sound friendly" generative edits, and Rambler personalization feeds it learned words. `enable_muse_screen_context` and Personal Context hooks make it screen-aware.

## Privacy notes

Explicit consent text ships in the APK: text, audio input, and personal dictionary are *temporarily processed by Google* when the feature runs — server-side processing, distinct from the on-device GenAI path.
