# Tool: Advertisements
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

- **UI entry:** rewarded-ad placements (`getCanWatchMoreRewardedVideos` gate), interstitial slots via mediation [inference: standard MAX placement model].
- **Parameter model:** AppLovin MAX host (`applovin.sdk.verbose_logging=true` ships), networks: AdMob `ca-app-pub-2285939887669849~2813384647`, Meta FAN (embedded dex bundles `assets/audience_network/classes{,2}.dex`), InMobi, ironSource/LevelPlay, Mintegral, Unity Ads [observation].
- **Execution path:** `Hitwicket.AdsSystem.*` namespace (`AdsSystemInstaller`, `RewardedAdService`, `AppLovinSdkHost`) → MAX SDK (`AppLovinFullscreenActivity`, `FullscreenAdService`, `AppRestartDuringAdDetectionService`) → network adapters → network SDKs' own activities; OM SDK JS (`omsdk-v1.js`, `inmobi_omid_js.js`, `omid-session-client-v1.js`) viewability [observation].
- **SafeDK role:** Application wrapper `SafeDKApplication` monitors/controls ad-SDK behavior (ad-quality/security wrapper) [inference from vendor function].
- **Premium/offline flags:** **online-only**; server gates rewarded availability; ad-free state not evidenced [unknown whether IAP removes ads].
- **I/O flow:** placement request → waterfall → creative render → reward callback → `ApiHelper` reward credit; failures no-op with retry.
