# Module: Core Storage
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

`Hitwicket.Core.StorageModule`: `DataStoreService`, `BaseDataStore<T>`, `IDataStoreObserver`/`IDataStoreDataUpdated<T>` (reactive observers), `IDataStoreRemoteConnector` (cloud sync iface), `FileStorageModule`, `DataStoreConfigSO`, `DataStoreSettings`, `DataStoreError`, `MResult<T>` [observation].

- **Consumers:** `Hitwicket.Store.UnityAdapters` adapters (CurrencyPackages, DailyDeals, EliteStore, GachaChest, Offers, PlayerBox, Scout), `MatchHistoryDataStore`, `Payments*` storages + `PaymentsStorageMigrator`, `OfflinePlayerPrefs`, `OfflineFtueWalletSnapshot`, `GenericAudioStorage<T>`, `GameSceneEventFileStorage` [observation].
- **Model:** typed local stores with optional remote connector → per-feature data hydration; observers push updates to UI [inference].
- **Java-side:** Room (`MultiInstanceInvalidationService`), androidx DataStore (`libdatastore_shared_counter.so`), SharedPreferences for PN tracker queue [observation].
