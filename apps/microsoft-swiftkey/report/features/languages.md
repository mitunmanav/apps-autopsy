# Languages & language packs

Evidence: `com.touchtype.common.languagepacks.*`, `LanguagePacksActivity`-family screens, `assets/languagePacksGlobal.json`, `assets/languagePacksChina.json`, `split_LanguagesBundled*.apk`, `res/raw-en/lp.zip`, `splits0.xml`, `method.xml` (156 subtypes), jenson model URL, `LanguagePackDownloadService`/refresh receivers, `appconfig/language_packs/overrides/`.

## Catalog

- `languagePacksGlobal.json` — the world catalog of downloadable packs; `languagePacksChina.json` — separate catalog for the China build/market (different host/availability).
- ~740 pack entries total across catalogs (from earlier count); each entry = locale, layout, model archive URL (`https://jenson.api.swiftkey.com/models/...`), version, sha1, size.
- **Bundled fallback**: `split_LanguagesBundled.config.en.apk` ships `res/raw-en/lp.zip` = English `en_US` pack v458 (`sha1 cf665e05…`) with `en_US.lm`, `en_US_bus_c.lm1`, `swiftkey.lm3`, emoji-search LMs, `emoji_coefficients.zlib`, `emoji_bg_c.lm2`, `emoji_intercept.bin`, `punctuation.json`, `charactermap.json`, `ime.json`, `.config`, `extra.dat` — so the keyboard works offline out of the box for English.

## Model bundle anatomy (per pack)

- `*.lm`/`*.lm1`/`*.lm3` — n-gram language models (main + "bus"/contextual + global shared `swiftkey.lm3`).
- `emoji_search/*.lm` — emoji search index per language; flags LM for flag emoji.
- `emoji_coefficients.zlib`, `emoji_bg_c.lm2`, `emoji_intercept.bin` — emoji prediction model params.
- `punctuation.json` — language punctuation rules; `charactermap.json` — diacritic/alt-char map; `ime.json` — IME metadata; `extra.dat` — opaque payload.

## Delivery

- Play **language config splits** (`split_config.<lang>.apk` per `splits0.xml`) — each carries that language's bundled pack; only installed splits ship.
- Runtime downloads: model refresh `DynamicLanguageRefresh`-type receivers + scheduled jobs fetch newer versions from jenson; `language_packs/overrides` appconfig can repoint/replace entries.
- `method.xml` exposes 156 IME subtypes binding locale → `layoutName` extras (ARABIC, TURKISH_F, ZHUYIN, …) so system keyboard-switcher surfaces per-language layouts.

## UI

Languages settings screen (entry `pref_home_launch_languages_prefs`): list installed packs, download new, per-language layout pickers (e.g. QWERTY/AZERTY variants), multilingual typing (multiple active packs → joint predictions).

## Transliteration

`pref_transliteration_enabled_key` toggle + `transliteration_warm_welcome_*` education cards — type Latin letters, get native-script predictions ("namaste" → "नमस्ते"). Shipped welcome cards for **Hindi, Gujarati, Tamil** ("Better %1$s predictions" / "Better predictions" fallback); `transliteration_warm_welcome_message` format "%1$s → %2$s, %3$s" shows verbatim → prediction.

## Limits

Pack count/contents beyond the en bundle are remote-fetched — not fully auditable statically; catalog JSON is the ground truth shipped.
