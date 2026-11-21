# Feature: Ads & Monetized Surface

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

## UI entry [obs]
- `com.bumble2.ads` package: `AdFormat`, `AdPlatformType`, `AdsDeeplinkActivity` (`bumble2ads://campaign`), sponsored-opening-move strings, `AdsApi`/`UserAcquisitionApi` B4F services
- Google ads (AdMob `ad_services` meta-data, `ACCESS_ADSERVICES_*` perms), external ad-bidding API strings, rewarded-video API strings

## Param model [obs]
- Ad slot/format models, campaign deep links, attestation via AppsFlyer conversion + Privacy Sandbox (AD_ID/ATTRIBUTION/TOPICS)

- Mediation partners in strings [obs names; live-state unk]: Amazon APS/UAM, AdColony bidding, Pangle, Google Ad Manager, ORTB Facebook; `SERVER_EXTERNAL_AD_BIDDING`, `SERVER_INTERESTS_AD_CAMPAIGN_START`. `mopub_impression_revenue` analytics constants also ship — MoPub itself is defunct, so this is dead-constant residue, not an active partner [inf].

## Execution path [inf]
- Slot request → `AdsApi` + GMS ads → sponsored card in deck/chat surfaces → `bumble2ads://campaign` deep links → attribution via AppsFlyer/Privacy Sandbox
- Rewarded ads → watch → server credit verb [inf from rewarded API strings]

## Local vs remote
- Remote: fill, targeting, attribution; local: slot rendering, frequency prefs [inf].

## Premium/offline
- Free-tier monetization; premium subs likely suppress ads [inf — standard model, no explicit string].

## Input → output
- In: placements + user signals → Out: rendered ads, deep-link campaigns, rewarded credits.
