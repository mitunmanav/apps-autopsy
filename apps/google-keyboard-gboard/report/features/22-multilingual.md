# Multilingual typing, language packs & language picker

## Languages & layouts

- **99 locale resource configurations** ship (af…zu, incl. `b+es+419`, `b+my+Qaag`, `my-rZG`, `zh-r*`, `en-rXC` pseudo-locale), plus 16 non-locale qualifier sets (`values-h{360,480,500,720}dp`, `values-w{360,400,600}dp-port`, `values-v{27..36}`) carrying per-height/width/API resource variants.
- `libs.languageselection.*` + `libraries.inputmethod.dynamiclanguagesetter` — language selection + dynamic switching.
- `settings_header_language`, `settings_header_add_language`, `settings_header_language_specific`, `enable_gboard_language_picker_redesign`, `enable_language_order_menu`, `enable_language_promo`, `enable_language_report_in_apps`, `enable_language_reporter`, `show_default_explanation_for_auto_switch_language` — picker redesign + per-app language reporting.
- `Default layouts for languages` / `Disable languages / layouts` dev flags — per-language layout mapping and kill-switches.
- `enable_multilingual_typing` — simultaneous multi-LM decode (mixed-language suggestions).
- `enable_crank_for_{primary,first_supported}_locale_in_multilingual` — crank engines per locale in multilingual mode.
- "Voice typing will automatically detect your language" — auto voice-language detect; `enable_avt_by_default_for_multilang`.
- `enable_auto_correction_stats`/`enable_pk_auto_correction_locales` — per-locale autocorrect.
- `enable_use_bluetooth_setting` etc. — see physical-keyboard doc.

## Language data delivery

- Language models ship via **Superpacks** (`libs.dataservice.superpacks`, `use_mdd_for_superpack`) — see downloads doc.
- `assets/emoji_superpacks_manifest_*.json` — emoji packs per language.
- `main_en_us_d3` raw resource — bundled English LM bootstrap.
- `disable_load_v2_klp`, `enable_load_key_correction_model_from_klp` — KLP (keyboard layout package) v2 loading.

## Notes

`enable_lite_emoji_prediction_engine`, `enable_emoji_kitchen_for_zero_state_emojis`, `enable_expression_moment_language_tags`, `enable_emojify_language_tags`, `enable_dynamic_art_language_tags`, `enable_writing_tools_commands_biasing_{de,en,es,fr,it}` — nearly every smart feature is per-language-tag gated.
