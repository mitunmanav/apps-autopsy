# Translate & auto-translate

## In-keyboard Translate

- `libs.translate.{TranslateKeyboard, TranslateLanguageBar, ITranslateUiExtension, SystemTranslateProvider}` — a translate keyboard with a language bar; translation is provided by **the system Translate provider** (`SystemTranslateProvider` → Android System Intelligence / Google translate).
- `settings_header_translate` — settings category.
- `attachQueryWatcher`, `noConvToQuery` — live query watching as you type.
- "Translate your replies to %s?" — reply-translation prompt.

## Auto-translate

- `libs.autotranslate.AutoTranslatePreferenceFragment` — auto-translate settings fragment; incoming/outgoing text translated automatically per conversation/app.

## Notes

Gboard delegates to the platform/Google Translate stack — no translation model ships in the APK. Flags in `enable_*` family gate entry points; `enable_text_conversion{,_off_the_spot}` covers adjacent text-conversion (e.g. transliteration) features.
