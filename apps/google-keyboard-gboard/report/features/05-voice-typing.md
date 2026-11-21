# Voice typing & dictation

## Architecture

Three recognizer families coexist (strings: "Assistant voice typing, NGA, Smart dictation"; "Dictation type"):

| Engine | Evidence | Role |
|---|---|---|
| **SODA** (Speech On-Device API) | `NativeLibHelper.c("gboard_soda_jni")`, `Loaded SODA %s native library`, `SODA capture session`, `sodaCoreConfig`, `enable_soda_longform_experiment` | On-device ASR (offline dictation) — Google's greco3 pipeline inside `libintegrated_shared_object.so` (`speech/greco3/pipeline/*`) |
| **Jetson / JetsonLite** | `JetsonLiteRecognizer`, `JetsonInputSession`, `JetsonLiteHandler`, `enable_nga`, `settings_header_jetson_voice` | On-device "voice-editing" ASR that understands commands (see Jetson doc) — the default advanced dictation |
| **Online S3 ("news3")** | `Online recognizer - start listening [news3]`, `enable_s3_as_fallback_in_smart_dictation`, `enable_s3_auto_punctuation`, `enable_jetson_s3_quota_experiment_override` | Server ASR fallback ("Speech3" streaming) |
| **NGA (Assistant)** | `libs.nga.impl.*` (`NgaInputManager`, `CorrectionsControllerNative`, `VoiceCommandsListFragment`), `enable_nga`, `enable_nga_data_share`, `enable_nga_lab_*` | Assistant-driven voice typing ("new Google Assistant" era) |

Native: `dictation_jni`, `gboard_soda_jni`, `ogg_opus_encoder` (`libogg_opus_encoder.so` — Opus encoding for streamed audio).

## Modes & features

- **Dictation types**: simple word-for-word vs "advanced features" (Smart Dictation) — strings: "Simple word-for-word voice typing, with some advanced features", "Voice typing with advanced features is not available right now".
- **Seamless voice typing**: `enable_global_direct_to_voice_toolbar`, `config_global_direct_to_dictation`, "Seamless voice typing" access point + auto-start on keyboard show (`settings_header_traditional_voice`).
- **Smart Dictation**: `smartdictation.service.*` — `NativeFormatterImpl` (native formatter), `fulfillment.emoji.nlu.NativeEmojiNluHandler` ("say 'smiling emoji'"), `spelling.SpeechAlternativesTrie` (`use_trie_for_speech_alternatives` — spell out names), plus formatter/punctuation/casing.
- **Multilingual dictation**: auto language detect — "Voice typing will automatically detect your language", `enable_avt_by_default_for_multilang`, `enable_crank_for_{primary,first_supported}_locale_in_multilingual`, `enable_speech_enhancement_for_multilang_users`.
- **Speech enhancement**: `enable_speech_enhancement_languages`, `disable_speech_enhancement_languages`, `enable_speech_enhancement_nam_cache_file`, `enable_internal_speech_enhancement_indicator`, `enable_internal_speech_enhancement_pii_logging`, `enable_smart_dictation_speech_enhancement_setting` — audio enhancement pre-ASR (denoise/etc.) with a NAM cache.
- **Contact biasing**: `enable_biasing_for_contacts`, `enable_biasing_for_contacts_learned_from_past_corrections`, `enable_biasing_for_contact_fields`, `enable_learn_name_biasing`, `enable_user_contact_biasing`, `enable_p13n_contact_phone`, `allow_contact_request_in_*`, `allow_contact_promo_dialog_in_smart_dictation` — mic+contacts improve name recognition.
- **Command biasing**: `enable_biasing_for_commands`, `enable_writing_tools_commands_biasing_{de,en,es,fr,it}` (five locales only — no `ja` variant ships), `enable_experimental_instructions_for_biasing` — biasing dictation toward edit commands per locale.
- **Voice commands catalog**: `nga.impl.preference.VoiceCommandsListFragment` — "See voice commands" settings link.
- **Voice editing UX**: `enable_highlight_voice_composing_text_cursor_on_edge`, `enable_highlight_voice_reconversion_composing_text`, `enable_revert_auto_correct_on_pk`, `use_scrollable_candidate_for_voice`, `show_suggestions_for_selected_text_while_dictating`, `enable_beep_sound_at_recognition_end`, `enable_action_key_on_voice_toolbar`, `enable_voice_chip_tooltip`, `enable_sticky_mic_background`, `enable_partial_commit_in_batch_edit`, `enable_voice_sound_media_volume_scaling`.
- **Universal Dictation**: `libs.universaldictation` + `StartActivityForResult` — system-wide dictation surface (Android 13+ "universal dictation").
- **Agentic Dictation**: see dedicated doc.
- **Offline/on-device**: `enable_ondevice_voice`, `enable_ondevice_recognizer`, `enable_fallback_ondevice_recognizer`, `enable_pcm_audio_caching_for_offline_fallback`, `disable_smart_dictation_with_network_connection` — offline packs + offline fallback.
- **Language packs**: `force_speech_language_pack_updates` dev flag, `allow_language_pack_downloads_on_metered_connections`, `allow_metered_small_speech_pack_downloads`, `enable_dictation_feature_split_install` — voice packs via MDD/feature split ("Additional module (Dictation)").
- **Physical-key dictation key**: `INJECT_KEY_EVENTS` + "Key code of dictation key" — dedicated dictation key support.
- **Voice in odd places**: `enable_voice_in_handwriting`, `enable_voice_in_japanese`, voice toolbar auto-show pref.
- **Audio caching/debug**: `enable_save_audio_history_to_file`, `enable_best_frame_search_for_logging`, `enable_audio_silence_callback`, `AudioSilenceMonitor`.
- **Donation**: `enable_crowdsource_integration` — "audio donation" via Google Crowdsource (strings: snippets reviewed by humans).
- **Privacy**: voice disabled in Incognito ("Voice typing is disabled in Incognito Mode"), email fields, work-profile restrictions, admin kill-switch ("Advanced features have been turned off by your Google Workspace admin").

## Notes

Recognition runs in `libintegrated_shared_object.so` (greco3) + SODA JNI shim; model files are downloaded (Superpacks/MDD + "RamblerLite LLM Download" for the LLM). The keyboard streams Opus when online (S3) and stays fully offline otherwise.
