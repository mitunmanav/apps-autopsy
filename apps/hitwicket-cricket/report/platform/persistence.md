# Persistence

**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 (205957) — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

## Shipped data stores [observation]

| Store | Location | Content |
|---|---|---|
| `OfflineTutorialDb/` | `split_UnityStreamingAssetsPack` `assets/` | **144 `.dat` files** (verified `unzip -l`): simulated-backend catalogs (`campaign_data`, `catalogue_0`, `dashboard_0`, `fake_scout_data`, `features_data_0/1`, `play_button_data`, `offline_play_button_data`, `spin_wheel`, `team_names`, `player_names_1-17`, `player_names_city_1-15`, `players_data_7_0`, `player_profile_page_7_0`, `offline_trophy_road_ftue_7_0/1`, `pk_challenge_match_recruit`) + scripted-match fixtures (`offline_quick_match_data_c1_l2-l5`, `offline_opponent_lineup_data_c1_l1-l15`, `offline_lineup_data_7/10/14`, `quick_match_7_0/1/2,10_0/1,12_0`, `smart_play_match_1`, `pk_match_data_0/1`, `pk_match_lineup_data_0/1`, `ftue_10_min_match1/2`) — most in domestic + `_international` variants and named tutorial variants (`ftue_10_min`, `gradual_rampup`, `sachin_saga`, `super_shards`). String literals separately reference catalog keys (`match_list`, `wallet_*`, `gacha_*`, etc.) the offline DB serves — keys ≠ filenames |
| `OfflineData/` | streaming assets | `ftue_rig_catalog.dat` (3.7KB), `whatsappauthcountry/country_codes.dat` (3.9KB) |
| `BadWords/` | streaming assets | profanity lists en, es, fil, fr, hi, id, mr, pa, pt, te, tl |
| `Catalogs/` | streaming assets | `MRPLevels.dat`, `popup_catalogue_*.dat` (local pricing/popup catalogs, binary) |
| `Video/intro_video_v3_1080p.mp4` | streaming assets | 7.4MB intro |
| `assets/Match` ×5, `assets/Practice` ×5 | streaming assets | Unity serialized scene/config files (~0.5–15KB) |
| Unity serialized files | `UnityDataAssetPack.config.astc` `assets/bin/Data/<hash>` | ~317MB of hash-named Unity serialized assets (level, scene, shader bundles) |
| Addressables | `AddressablesAssetPack` | catalog-driven downloadable bundles (catalog `cdn.octathorpeweb.com/assetbundles/production/WV/Android/catalog_main_v1.json`) [evidence: catalog URL in metadata] |

## Code-level storage [observation — IL2CPP types]
- `Hitwicket.Core.StorageModule`: `DataStoreService`, `BaseDataStore<T>`, `DataStoreConfigSO`, `DataStoreSettings`, `FileStorageModule`, `IStorageModule`, `IDataStoreRemoteConnector`, `DataStoreError`, `MResult<T>` — typed datastore abstraction with remote-connector interface (cloud sync) [observation]
- Store adapters: `CurrencyPackagesDataStoreAdapter`, `DailyDealsDataStoreAdapter`, `EliteStoreDataStoreAdapter`, `GachaChestDataStoreAdapter`, `OffersDataStoreAdapter`, `PlayerBoxDataStoreAdapter`, `ScoutDataStoreAdapter` (Hitwicket.Store.UnityAdapters)
- `OfflinePlayerPrefs`, `MatchHistoryDataStore`, `PaymentsStorage`/`PaymentHistoryStorage`/`PaymentsDBStorage`/`PaymentsStorageMigrator`, `GameSceneEventFileStorage`, `GenericAudioStorage<T>`, `MainSceneAudioStorage`
- `OfflineFtueWalletSnapshot`, `OfflineDataHelper`/`OfflineDataManager` types (+ `InjectOfflineDataHelper` injection method), `Hitwicket.FakeScoutV2` namespace (98 types) — offline/fake providers
- Java layer: Room (`MultiInstanceInvalidationService`), DataStore (`libdatastore_shared_counter.so`), WorkManager, Firebase Installations, FileProvider, SharedPreferences consumers (PnTrackerQueue persists events [inference])

## Databases / queues [inference]
- `PnTrackerQueue`/`PnTrackerEvent`/`PnTrackerDrainer`/`PnTrackerFlusher` — Java-side persistent queue of push-notification delivery/tap trackers, flushed via `flushAsync`.
- `libsqlite3.so` ships for SDK databases (WorkManager, Room, Firebase, ads SDKs).

## Server-side persistence [observation]
`PersistTeamIdFromLogin`, `WriteSessionTokenFromLogin` (AuthCoordinator) — session token + team id written locally after login; `PaymentTracker` records purchases.
