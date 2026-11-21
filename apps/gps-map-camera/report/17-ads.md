# 17 — Advertising

Classes: `helper.Admob`, `helper.AdsUtils`(+`Companion`, native-ad callbacks), `helper.AllAdsApproval`, `helper.RemoteAdData`, `AppOpenManager_LifecycleAdapter`. AdMob app ID (shipped value): `ca-app-pub-1531973473735447~5005213190`.

## Networks

- **AdMob** (`om4` NativeAd field, `j7` AdView) — banners + native + interstitial(FS) + app-open
- **AdX / Google Ad Manager secondary network**: `ADAX_BANNER/FS/NATIVE/APPOPEN_ID`, `SHOW_ADAX` toggle, parsed from `adxads` JSON array (status/id per unit). Verified in `Admob.loadAdaptive_bannerAdax`/`loadCollaps_bannerAdax`: AdX units render through the **same GMA `AdView`** (`j7`) as AdMob units — it's a remotely switchable **dual-ID-set waterfall inside one SDK**, not a separate ad SDK (request-builder classes `qz`/`pz` are obfuscated GMA request types)
- `ADS_NETWORK_TYPE` selects active network

## Remote-config driven ad system (`RemoteAdData`)

`FireBaseRemoteConfigAdData()` fetches JSON and fills ~100+ static fields:

- `adsid` array → named units: `APP ID`, `Home Screen Banner`, `Detail Screen Banner`, `Splash Screen Banner`, `Gallery Banner`, `Splash Screen FS`, `Third Click FS`, `In App Feature Screen FS`, `Exit Native`, `Onboarding Native`, `Faq Native`, `Language Native`, …
- Per-screen enable ints + `_TYPE` ints for every screen: `*_SCREEN_BANNER`, `*_SCREEN_FS`, `*_NATIVE`, `*_APP_OPEN` covering Home, AddRec, Theme, BefAft Reporting/Setting, CustomDate, Email, FAQ, FileName, Folder, GDFolder, Gallery, ImageCluster, ImgQuality, Language, MainRec, Mapdata, MyFiles, Onboarding, PDFReporting/Setting, Permission, Preview, Reporting, Setting, … (truncated list in source — full set in `_jadx/…RemoteAdData.java`)
- Meta knobs: `GALLERY_IMAGE_CLICK_COUNT`, `FILE_FOLDER_MAP_TEMPLATE_COUNT`, `THIRD_CLICK_FS`, `DISCOUNT_PRICE`, app-update/transfer/more-apps payloads (`displayUpdateData`, `displayTransferData`, `displayRemoteConfigData`, `displayProData`)

## Placement enforcement

`AllAdsApproval` — 56 `iS<Screen><Format>(Context)` gate methods (e.g., `iSHomeBanner`, `iSGalleryFS`, `iSExitNative`, `iSOnboardNative`) consulted before showing any unit.

## Formats & loaders (`Admob`/`AdsUtils`)

- `loadAdaptive_banner`, `loadCollaps_banner` (+`Adax` variants) → anchored adaptive banners; collapsible confirmed via `Bundle` extra `collapsible=bottom` on the ad request
- `loadNative`/`loadNativeAdax` via `AdsUtils.Companion` on `ExecutorService`, `adLoaded` flag, `getAdWidth`
- `DestroyAd` cleanup; `AppOpenManager_LifecycleAdapter` — app-open ads on lifecycle resume

## Consent

IAB TCF / consent-mode strings (`IABTCF_EnableAdvertiserConsentMode`, `IABConsent_ParsedPurposeConsents`, `CONSENT_SIGNAL_NON_PERSONALIZED_ADS`, `TAG_FOR_UNDER_AGE_OF_CONSENT_*`) are present inside the bundled `ads_mobile_sdk` — consent handling is SDK-internal; no `com.google.android.ump` usage in app code.

## Remote-config defaults

`res/xml/remote_config_defaults.xml` ships stock Firebase demo entries (`welcome_message` = "Welcome to my awesome app!") — shipped defaults are placeholders; real ad/pro JSON is entirely server-side.

## Unknowns

- Current remote-config values (server-side)
- House/transfer ads (`TransferApp`, `MoreAppsData` models → cross-promo)
