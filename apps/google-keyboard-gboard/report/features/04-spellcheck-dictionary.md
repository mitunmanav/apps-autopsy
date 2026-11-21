# Spell checker, personal dictionary & learned words

## Android spell-checker service

- `com.android.inputmethod.latin.spellcheck.AndroidSpellCheckerService` — exported `BIND_TEXT_SERVICE`; Gboard registers itself as the **system spell checker** for all apps.
- `LatinSpellCheckerSettingsActivity` (exported MAIN) — spell-checker settings entry.
- Flags: `enable_spell_checker_extension`, `enable_spell_checker_highlight_on_web_input`, `enable_spell_checker_stats`, `enable_spell_checker_training_cache`, `enable_spellchecker_chips_ui`, `enable_spellchecker_chips_ui_web_view`, `disable_extended_spellchecker_locales` — chip UI + WebView support + extended locales.
- String: "Notice for calling AI models for Writing Tools" adjacent to spellcheck flows.

## Personal dictionary

- `READ_USER_DICTIONARY`/`WRITE_USER_DICTIONARY` permissions; `libraries.inputmethod.personaldictionary.preference.*` (7 classes) — personal dictionary UI.
- "Add to dictionary", "Delete learned words and data" (confirm-by-number flow), `enable_delete_user_dictionary_typos` — prune typo entries.
- User dictionary syncs with Android's `UserDictionary` provider.

## Learned words & personalization data

- `enable_backup_delight5_personalized_data` — Delight5 personal LM data is backed up to the cloud.
- `enable_hmm_user_history_backup`, `enable_image_file_database_backup` — CJK history + image (sticker/photo) DB backup.
- `disable_correction_storage` — switch off correction-derived storage.
- `enable_export_decoder_state`, `enable_export_pcv2_revert_history`, `enable_export_ufc` — debug export of decoder state/user-feature-cache.
- `settings_header_dictionary`, `settings_header_personal_dictionary` — dedicated settings screens.
- `enable_multiword_*_from_user_history` — phrase suggestions mined from user history.
- `badwordchecker` filters learned content before suggesting.

## Privacy tie-in

Deletion is the "Delete learned words and data" feature (Settings → Privacy): clears Delight5 dynamic LM, user history DB, HMM history, personalization store (see privacy doc).
