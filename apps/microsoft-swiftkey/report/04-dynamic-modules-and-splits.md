# 04 — Dynamic modules & split delivery

## Split-APK install set (this sample)

`com.android.vending.splits.required = true`, `derived.apk.id = 4`. `res/xml/splits0.xml` maps config splits:

- **Density splits**: `config.xxhdpi` (this set), plus mdpi–xxxhdpi variants
- **Language splits**: `config.<locale>` for ~70 app-localization locales (`af`…`zu`); this set has `config.en`
- **ABI splits**: `config.arm64_v8a` (this set); other ABIs exist as separate splits
- **Feature splits**: `LanguagesBundled` (+ `LanguagesBundled.config.en`)

## Dynamic feature modules observed

| Module name | Evidence | Delivery |
|---|---|---|
| `LanguagesBundled` | this split pair; `ua0/e.java` `List("Camera","LanguagesBundled")`; `ck0/f.java` `v.D("LanguagesBundled")`; `af0/e.java` `c("LanguagesBundled")` | install-time feature delivering bundled language packs (`res/raw/lp.zip` + `metadata.json` per locale split) |
| `Camera` | module name in module lists; `ad0/e.java` returns `"camera"`; `appconfig/camera/remix/`; manifest has `CameraActivity`; strings `toolbar_camera_downloading_message`/`installing_message` | on-demand — downloaded when user opens camera panel |
| `EmojiAdsXandr` | string `emoji_ads_xandr_dynamic_module_title` "Emoji Ads Xandr"; code refs `"EmojiAdsXandr"` | on-demand — Xandr native ads for emoji panel |
| `Whisper` | `af0/e.java` reflectively loads `com.swiftkey.whisper.DefaultWhisperModuleProvider`, logs "Whisper module not installed"; strings `whisper_download_*` | on-demand — on-device AI voice typing (download progress/installing UI) |
| Bing / Copilot surface | `AskBingActivity` + `bing_hub` assets ship in base | in-base (WebView) |

`DynamicFeatureListActivity` + `com.touchtype.dynamicmodule.BaseSplitActivity` provide an internal module-management UI and legacy SplitCompat bootstrap (installs verified splits from `verified-splits/` dir, relaxes StrictMode during injection). SplitCompat indicates they support pre-API-21-style splits? — actually Play's SplitCompat for accessing split resources on older runtimes.

## Play Core integration

- `com.google.android.play.core.common.PlayCoreDialogWrapperActivity` — Play Core confirmation dialogs.
- `wq/*` (obfuscated) wrap `playcore_split_install_internal` SharedPreferences (`modules_to_uninstall_if_emulated` is Play Core's own emulation rollback bookkeeping).
- `inappupdate/default_config.json` + `appconfig/in_app_update/params/` — in-app update flow (see `features/in-app-updates.md`).
- `ime_base_split_test_activity.xml` + `ime_secondary_split_test_activity.xml` — layouts for internal split-loading tests.

## Bundled language-pack module

`split_LanguagesBundled.config.en.apk` carries `res/raw-en/lp.zip` (7.5 MB) + `metadata.json`:

```json
{"name":"English (US)","locale":"en_US","archive":"https://jenson.api.swiftkey.com/models/ll8sDf…","language":"en","country":"US","sha1":"cf665e05…","version":458}
```

`lp.zip` contents (language model pack):

| File | Purpose |
|---|---|
| `en_US.lm` (7.4 MB) | primary static language model |
| `en_US_bus_c.lm1` (1.5 MB) | secondary/compressed model variant |
| `emoji_bg_c.lm2`, `emoji_intercept.bin`, `emoji_coefficients.zlib` | emoji prediction models |
| `emoji_search/en_US_emoji_search.lm` + `…_flags.lm` | emoji search models |
| `charactermap.json`, `punctuation.json`, `ime.json`, `.config`, `extra.dat`, `swiftkey.lm3` | char maps, punctuation rules, IME metadata |

The non-config `split_LanguagesBundled.apk` ships an **empty** `lp.zip` + `{}` metadata — it's a placeholder stub; real packs arrive via per-locale config splits or CDN download (`jenson.api.swiftkey.com/models/…`).
