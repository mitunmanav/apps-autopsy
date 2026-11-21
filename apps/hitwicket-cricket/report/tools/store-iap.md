# Tool: Store & In-App Purchases
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

- **UI entry:** store pages per `Hitwicket.Store.UnityAdapters`: `CurrencyPackages`, `DailyDeals`, `EliteStore`, `GachaChest`, `PlayerBox`, `Scout`, `Offers` data-store adapters → page controllers; energy/stamina buy popups; subscription pages [observation].
- **Parameter model:** Play Billing **9.0.0** (`com.google.android.play.billingclient.version`), Unity IAP **5.4.2** (`Unity.Purchasing`+`WebshopService`+`LiveContentAdapterService`), `MRPLevels.dat` + store catalogs, `DailyRewardSubscription`, `SpbSubscription`, `PaymentHistoryStorage` [observation].
- **Execution path:** `ProxyBillingActivity`/`ProxyBillingActivityV2` → BillingClient → Google Play → purchase token → server confirm via `ConfirmGooglePayment` (also `ConfirmApplePayment`, `ConfirmDevPurchase` — dev path ships, `ConfirmWebviewPayment` for web shop) → `PaymentTracker`/`PaymentsStorage` local record → entitlements credited [observation — method names].
- **Remote services:** `iap.services.api.unity.com` (Unity IAP validation), `pavilion.hitwicket.com/buy` web shop, UPI intent queries for alternative payment [observation].
- **Premium/offline flags:** **premium/online**; `getCanWatchMoreRewardedVideos` couples ads↔economy; `OfflineFtueWalletSnapshot` only for tutorial [observation].
- **I/O flow:** SKU catalog → native purchase sheet → receipt → server verify → currency/items granted → transaction persisted (`transaction_*`, `payment_history` catalogs).
