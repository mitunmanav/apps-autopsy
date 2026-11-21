# Ads & monetization

Evidence: `com.touchtype.keyboard.view.richcontent.emoji.ads*`, `…richcontent.gif.klipy.ads*` packages, `assets/appconfig/emoji_panel/banner_ad/models/*`, `AdActivity` (Xandr/AppNexus), `com.appnexus.*` SDK classes, `com.klipy.*`, `pref_ads_data_consent`/privacy screen, `AD_ID`-style permission, Klipy/GIPHY API keys.

## Ad surfaces

- **Emoji panel banner ad** — `emoji_panel/banner_ad` appconfig (enable, placement, refresh) + `richcontent.emoji.ads` classes.
- **GIF panel ads (Klipy)** — `gif.klipy.ads` package: sponsored GIF/content slots inside the Klipy-powered GIF tab.
- `AdActivity` — full-screen/interstitial-style activity wired to the **Xandr (AppNexus)** SDK (`com.appnexus.opensdk` classes bundled).

## Monetization model

No IAP/billing permission (`com.android.vending.BILLING` absent) → **no paid tier**; monetization = ads inside content panels + Bing/Copilot referral traffic (`FORM=` tracking params everywhere: `SWTACW`, `BICSKR`, `bicswk`).

## Consent/gating

- `ads_data_consent` preference — user consent gate for personalized ads (privacy screen).
- Remote configs control per-surface ad enablement and provider selection (GIPHY vs Klipy vs sponsored slots).

## Status

Ad SDKs present and wired; whether a given market/build serves ads is remote-config decided — not runtime-verified.
