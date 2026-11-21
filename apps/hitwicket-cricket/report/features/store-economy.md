# Module: Store & Economy
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

`Hitwicket.Store.dll` namespaces `Hitwicket.Store.{CurrencyPackages,DailyDeals,Elite,GachaChest,Offers,PlayerBox,Scout}` + `Hitwicket.Store.UnityAdapters` adapters + Unity.Purchasing stack [observation].

- **Sub-systems:** currency packs, daily deals, elite store, gacha chests (`GachaBox*`, pity/reveal types), player boxes, scouting, offers, subscriptions (`DailyRewardSubscription`,`SpbSubscription`), auction (`getAuction*`/`bidOnPlayer`), energy/stamina top-ups [observation].
- **Payments:** Play Billing 9.0.0 + Unity IAP 5.4.2 + `Confirm{Google,Apple,Dev,Webview}Payment` + `PaymentTracker`/`PaymentsDBStorage` + `transaction_*`/`payment_history` catalogs + UPI/webshop alternates [observation].
- **Economy data:** `Currency` bucket 24 types, `CurrencyPackagesDataStoreAdapter` etc. bind storefront data to UI; `MRPLevels.dat` price table ships locally [observation].
