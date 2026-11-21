# Module: Asset Delivery & Content
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

- **Play Asset Delivery [observation]:** `com.google.android.play.core.assetpacks` meta-data `versionCode=20100`; packs `UnityDataAssetPack`, `UnityStreamingAssetsPack`, `AddressablesAssetPack`, `UnityTextureCompressionsAssetPack` (fast-follow/install-time per `install-time` in stub manifests [partial observation]); `AssetPackExtractionService`+`ExtractionForegroundService`+`HsdpShimActivity` (FOREGROUND_SERVICE_DATA_SYNC) handle install/extraction; texture-compression targeting via `.config.astc` split variants.
- **Addressables [observation]:** remote catalog `https://cdn.octathorpeweb.com/assetbundles/production/WV/Android/catalog_main_v1.json` (+`banners_catalog.json`) → on-demand bundle downloads to cache; staging CDN endpoints also shipped.
- **Streaming assets [observation]:** OfflineTutorialDb/OfflineData/BadWords/Catalogs/Video + `assets/Match|Practice` scenes + `UnityServicesProjectConfiguration.json` (env=production, core 1.18.0, purchasing 5.4.2) + `google-services-desktop.json`.
- **Coherence [observation]:** `libunitycoherencenative.so` = Unity Coherence content-delivery client (remote content service), `CoherenceBridge` JNI.
- **Content freshness [inference]:** Remote Config + remote catalogs + Addressables allow content/events updates without app update.
