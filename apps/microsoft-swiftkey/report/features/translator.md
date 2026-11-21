# Microsoft Translator

Evidence: `translator_*` strings (69), `keyboard_translator_layout.xml`, `keyboard_translator_read_layout.xml`, `translator_language_picker_*` layouts (4), `com.touchtype.keyboard.view.translator.TranslatorLanguagePickerLayout`, `com.touchtype.translator.*` package, manifest `<queries>` for `com.microsoft.translator`, `translator_upsell_url` `app.adjust.com/n4j99i9`.

## What it is

In-keyboard translation — type in your language, text is translated live into the target language and inserted; plus a **read mode** that translates copied/incoming text.

## Components

- `com.touchtype.translator.*` package — translator controller/classes (obfuscated members).
- `keyboard_translator_layout.xml` — translate-while-you-type panel; `keyboard_translator_read_layout.xml` — read-mode panel (translate incoming messages); `translator_read_mode_action_bar.xml`, `translator_read_mode_error_panel.xml`.
- `TranslatorLanguagePickerLayout` + `translator_language_picker_{dialog_layout,item,separator}` — source/target pickers with auto-detect (`translator_source_language_autodetected_*`).

## Behavior

- **Consent first**: `translator_consent_title` "Welcome to Translator"; `translator_consent_message` — "The text you type using this feature will be sent to Microsoft Translator to be translated" → cloud service (Microsoft Translator API).
- Languages: 70+ (`translator_language_*` incl. de, en, es, fr, hi, it, mww (Hmong Daw), nb, nl, otq (Querétaro Otomi), pt, sr_latn, sw, **tlh (Klingon)**, ty, yue, zh_Hans, zh_Hant).
- Auto-detect source; swap languages (`translator_swap_languages`).
- Read mode: `translator_quick_translate_chip_hint` "Translate copied text"; read panel with paste-into-field + reply actions; too-long text trimming (`translator_read_mode_too_long_text`).
- Errors: offline → "Go online to translate"; app error → reload Translator; network error on language list.
- **Offline upsell**: `translator_language_picker_banner_download_app` — "You can now translate offline! Download Microsoft Translator on Google Play" → deep-links to `com.microsoft.translator` (queries-declared); `translator_upsell_url` = `https://app.adjust.com/n4j99i9` (Adjust-tracked store link).
- Integration: `INTERACT_ACROSS_PROFILES`/shared models with the standalone Translator app when installed [inferred — banner promotes the app's offline packs].
