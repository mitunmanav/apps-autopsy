# 16 — Premium & billing

Classes: `activity.InAppPurchaseActivity`, `helper.BillingClientSetup` (`ev_bc5d5f76…` — `getInstance`, `setupBillingClient` singleton), `helper.PurchaseHelper` (`ev_a76e03bf…` — connect, purchase updates, SKU details, purchase handling, `launchBillingFlow`, purchased-items query), `helper.SearchHelper` (`getPurchasedProductIdListing(List)`), `model.PurchaseModel`.

## SKUs (decoded strings)

| Product ID | Type |
|---|---|
| `com.gpsmapcamera.withoutads.oneyear` | subscription (ad-free, yearly) |
| `com.gpsmapcamera.withoutads.sixmonth` | subscription (ad-free, 6-month) |
| `com.gpsmapcamera.geotagginglocationonphoto.removeads` | one-time ad removal |
| `com.gpsmapcamera.geotagginglocationonphoto.fullpurchase` | full unlock |
| `com.gpsmapcamera.geotagginglocationonphoto.adsfullpurchase` | ads+full bundle |

`BILLING` permission declared; `ads_status` key tracks entitlement; `DISCOUNT_PRICE` (double) remote-config field supports promo pricing.

## Gating

Premium/ad-removal messaging strings; `alarm_time_3_time_no_buy`/`_stan` — upsell notification cadence for non-buyers; `50_photos_pro` alarm suggests free-tier photo-count upsell.

## Unknowns

- Server-side purchase verification (Play-only verification visible; no receipt endpoint found → likely local-only entitlement)
- Exact pro-vs-free feature split (obfuscated gates; Drive sync likely pro)
