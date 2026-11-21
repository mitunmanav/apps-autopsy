> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e1…ad41`. Static analysis; no runtime evidence.

# Promos, news, showcase & credits

## How it works
- `InAppPromoActivity`, `NewsDetailActivity`, `ShowcaseActivity`,
  `DiscoverAppActivity`, `CreditsActivity` — marketing surfaces driven by the
  `marketing`/`campaign`/`banner`/`promo`/`news` packages: content fetched
  from the mobile service (`mobile.iloveapi.com`) per Remote Config flags;
  `interstitial`/`InterstitialActivity` shows fullscreen promos;
  `adid`/`appset` adservices permissions support campaign attribution.
- `NPSActivity` + `nps`/`nps_survey` packages — periodic NPS survey prompt
  (`rate_us`/`feedback` strings), answers posted to the mobile service.
- `WhatsNew`/`changelog` entries + `DiscoverAppActivity` cross-promote other
  iLove apps (iloveimg/iloveapi family, `app_links`).
