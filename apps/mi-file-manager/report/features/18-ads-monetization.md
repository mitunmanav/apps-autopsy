# 18 — Advertising & Monetization

The single largest vendor surface in the APK. Three ad stacks + Xiaomi mediation:

## 1. Xiaomi global ad SDK — `com.xiaomi.miglobaladsdk`

- `MiAdManager`, `SdkInitProvider` (ContentProvider auto-init), `LocalAdMessager`, ad units: `appopenad`, `bannerad`, `interstitialad`, `rewardedvideoad`, `instream`, `nativead` (`streamad`), `audio` ads.
- Mediation/auction: `bid.*` `AuctionManager`, `config.mediationconfig` — client-side waterfall/bidding across networks.
- `ad.feedback` — `DislikeManagerV2` (ad feedback/hide UI — the `action.DislikeManagerV2` intent on TabActivity).

## 2. Columbus / Zeus GMC — `com.zeus.gmc.sdk.mobileads.columbus` (~371 classes)

Xiaomi's own ad network SDK (`com.xiaomi.mobileads.columbus` adapters into miglobaladsdk): banner/interstitial/native/splash/video ads, MRAID, Open Measurement (OM — `omsdk` viewability), ad asset caches (`assets/cands`, `assets/migd`, `terrain/`, `worldmap`, `X-AG-*.crt` certs).
Manifest meta-data: `APP_KEY=FILE_EXPLORER`, `APP_SECRET=6a75640c500194189dabc2c6b1c1a2eb` (**hardcoded app secret** — doc 21/23).

## 3. Google AdMob + Facebook Audience Network

- `com.google.android.gms.ads` — `APPLICATION_ID=ca-app-pub-4062377952200160~8017942393`; `com.xiaomi.mobileads.admob` adapter.
- Facebook AN via **`assets/audience_network.dex`** (loaded dynamically — keeps AN out of the main dex index) + `com.xiaomi.mobileads.facebook` adapter + `com.facebook.ads` glue.

## In-app surfaces

- `AdDetailActivity` (declared, not exported), `recommend.NativeAdViewHelper`, `BannerAdGroupController`, `SystemAdContentProvider` (`systemAd.splashAd` — splash-ad metadata provider).
- Manifest-declared ad activities (verified): `miglobaladsdk.appopenad.OpenNativeAdActivity` (app-open), `columbus.ad.videoads.player.GMCAdActivity` (video), `columbus.interstitialad.ColumbusActivity`, `msa.adjump.AdJumperLoadingActivity`, `facebook.ads.AudienceNetworkActivity`, `gms.ads.{AdActivity,OutOfContextTestingActivity}`.
- `clean.models.result.ResultNativeAdModel` — **native ads are rendered inside cleaner results** (verified class).
- Consent: Zeus `cmpLib.CMPLib` + privacy gate before `initAd` (doc 03/12).

## Data collection (static observations)

- GAID via `AdvertisingIdHelper` (`gms.ads.identifier`); `BIND_GET_INSTALL_REFERRER_SERVICE` permission for install referrer; `cct` datatransport for telemetry.
- Ad requests carry package/version/GAID/OAID-style params (`HttpManager` + `Urls` param names — doc 21).

## Evidence

Manifest meta-data + ad activities (`ev_24480d9e…089c2a7`), class inventories (`ev_c7d5130a…787a4a` app pkg; com.xiaomi — 623 incl. ad stacks), archive (`ev_fec9a360…57e179f`: audience_network.dex, ad assets), `ev_a3a0d9fd…b7cc6f` (SystemAdContentProvider).

## Unknowns

- Exact ad-network request endpoints (assembled in obfuscated `HttpManager`/columbus config; doc 21).
- Frequency caps/placement IDs — in columbus config blobs, not enumerated.
- Whether rewarded ads gate any feature or are purely promotional — placement list unresolved.
