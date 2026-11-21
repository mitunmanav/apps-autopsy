# Keyboard layouts & input modes

## Keys & layout options (`prefs_keys.xml`)

- **Extended layout** (`prefs_extended_layout_*`) — "Show left and right arrow keys" (`pref_arrows_key`).
- **Number row** (`pref_number_row_key`) + number display style (`pref_number_display_key`).
- **Key-press popups** (`pref_key_press_popup_key`), **show all accented characters** (`pref_keyboard_show_all_accents_key`).
- **PC keyboard layout** (`pref_pc_keyboard_key`) — desktop-style layout variant.
- **URL-specific keys** (`pref_display_url_specific_keys`) — .com, / keys in URL fields.
- Dedicated emoji key + adaptive enter key (see emoji doc).

Evidence: `res/xml/primary_keys_*.xml` (227 files / **171 distinct by content hash**), `res/xml/method.xml` (156 subtypes), `res/raw/charactermap_*.json`, `prefs_*` screens, `com.touchtype.keyboard.view.layoutswitcher.*`.

## Layout model

- Keys are **not** per-language XML grids. `res/xml/primary_keys_*.xml` are ordered `PrimaryKey` lists of logical key ids (`q`…, `icon_ShiftKey`, `icon_DeleteKey`, `icon_upArrow`, currency symbols) in the `touchtype:` namespace. Geometry, key sizing, popup/alternate characters come from theme `style.json` + `KeyShape`/`InputMapper` in Fluency + per-language character maps.
- Layout switching: `layoutswitcher` package (`LayoutSwitcherProvider$getPopupView$layoutManager$1`) + spacebar swipe (string: "Swipe on space bar to activate"/"you can change the layout… swiping left or right on your keyboard spacebar").
- `method.xml` declares 156 `<subtype>` entries — every subtype maps an `imeSubtypeLocale` + `layoutName` extra value (`layoutName=ARABIC`, `QWERTY_ESTONIAN`, `TIFINAGH_INTERNATIONAL`, …) with a fixed `subtypeId` hash and `isAsciiCapable` flag.

## Layout families observed (171 distinct)

Latin: QWERTY (regional variants: Estonian, Georgian, Icelandic, Lithuanian, Norwegian, Serbian, Spanish, Swedish, Turkmen, Venetian, Vietnamese…), QWERTZ (+Albanian, extended, Serbian, Swiss-French), AZERTY, QZERTY, BÉPO (`french_bepo`), Dvorak (`swedish_svorak`, `dvorak`…), Turkish F, compact variants (`russian_compact`, `ukrainian_compact`).

Non-Latin script layouts: Arabic (many variants: `_2/_3`, `_v2`, western-digit variants, `arabic_farsi`, `arabic_urdu`, `arabic_uyghur`), Armenian, Assamese, Azerbaijani, Belarusian, Bengali (+`bengali_smart`, secondary), Bulgarian (BDS + phonetic), Burmese (+`burmese_zawgyi` — Zawgyi encoding support), Cantonese, Cangjie (`cangjie_fixed`), Chinese 5-stroke sections (`5_5_5_chinese_5stroke_section_*` for CN/HK/TW), Amharic, Georgian, Gujarati (+smart), Hindi (+smart), Kannada (+smart), Khmer (+`khmer_new`), Korean (Naratgeul `naratgul`, `single_vowel`, `vega`, Chonjiin `12key_chunjiin`), Lao (+new), Malayalam (+smart), Marathi (+smart), Mongolian?, Nepali, Oriya (+smart), Persian?, Punjabi, Pinyin (`pinyin`, 12-key, fuzzy-mapping charmaps), Rapa Nui, Romaji (Japanese), Russian (`russian` WIN/phonetic/compact), Rusyn, Serbian Cyrillic, Sgaw Karen, Shan, Shughnani, Sindhi, Sinhala (+smart), Syriac (Arabic + QWERTY), Tai Nua, Tajik, Tamil (+Tamil99), Tatar, Telugu (+smart), Thai (+Kedmanee, `thai_new`), Tibetan, Tifinagh (3 variants), Twi, Ukrainian (+compact), Wakhi, Yakut, Zhuyin (+12-key).

`res/raw/charactermap_*.json` (~30 files) — per-script popup/alternate-character maps incl. full `charactermap_all_accents.json`, Chinese fuzzy-pinyin mapping tables (`pinyin_fuzzy_mapping_{ang,ch,eng,h,iang,ing,k,n,r,sh}`).

## Per-language input features

- **Chinese**: `prefs_typing_chinese_input.xml`, `prefs_typing_chinese_input_fuzzy_pinyin.xml` — fuzzy pinyin pairs (zh=z, ch=c, sh=s, ang=an, eng=en, h=f, iang=ian, ing=in, k=g, n=l, r=l, uang=uan); handwriting timeout preference.
- **Japanese**: `pref_flick_cycle_mode_*` — flick input behavior modes: `FLICK` (swipe for kana), `CYCLE` (multi-tap), `FLICK_AND_CYCLE` (either); Romaji subtype too. Engine has `Japanese`, `Telex` helper classes.
- **Korean**: Naratgeul/Vega/single-vowel/Chonjiin layouts + `Chonjiin`, `Hangul`, `NaratGeul` engine classes.
- **Indic**: "smart" layout variants (Bengali/Gujarati/Hindi/Kannada/Malayalam/Marathi/Oriya/Sinhala/Telugu) + `language_classifier_profiles/*.txt` (asm, ben, en, guj, hg, kan, mal, mar, ori, pan, tam, tel) — script/language classification for transliteration.
- **Transliteration**: `transliteration_*` strings (14) — type Latin → get native script suggestions.
- **Number/digit variants**: "western" Arabic layouts select digit sets; `Switch numbers` quick-switch education key.

## Layout add-ons

Language details screen exposes per-language **Add ons** (`languages_language_details_add_ons_title`) — alternate layouts/layout options per language.
