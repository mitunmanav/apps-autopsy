# BiBo — remote config & model delivery

Evidence: `https://bibo.api.swiftkey.com` endpoint, `bibomodels.*` packages (`themesfeaturedbanner`, `inappupdate`, …), `BiboSelectorActivity` (debug), `assets/ts_configuration.jwt` (auth), dozens of `assets/appconfig/<feature>/{key,params,behaviour,models}` trees.

## What BiBo is

SwiftKey's **configuration/asset delivery service**. Client polls `bibo.api.swiftkey.com` for per-feature "models" (JSON/YAML payloads) and caches them; app code reads the active model through generated `bibomodels.<feature>.*` classes.

## Shipped models (assets/appconfig)

`camera/remix` (Bing create URLs, form codes), `fluency/params` (engine constants), `backup_and_sync/behaviour`, `emoji_panel/banner_ad`, `toolbarItemsOrdering/params`, `language_packs/overrides`, `onboarding/steps`, `themes/featured_banner` (banner zip), `microsoft_rewards`, `in_app_update/params`, `tenor_gifs/key` (API-key override, `imeVersion >= 9.13.10` criteria), `signature_config`, `event_forwarding`, `experiments` (empty arrays — assignments server-side), `dynamicFeatures` key strings, `ads_data_consent` pref.

## Model anatomy

`config.yaml` key files + `models/*.json|zip` payloads. Criteria blocks (version gates like `imeVersion >= 9.13.10`) select among variants; `*.zip` models carry media (banner webps).

## Debug surface

`BiboSelectorActivity` — dev screen to force/preview model variants; shipped in the APK (internal tool, gated by build config flags presumably).

## Auth/integrity

`ts_configuration.jwt`/`signature_config.json` for service trust; models carry sha1s for media; client pins to `assets.swiftkey.com`/`bibo.api.swiftkey.com` over TLS (cleartext disabled).
