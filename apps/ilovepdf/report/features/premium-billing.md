> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Premium / billing / limits

## How it works
- Dual store: `StoreBillingManager` abstraction with
  `PlayStoreBillingManager` (Play Billing 9.0.0, `com.android.billingclient`,
  `com.android.vending.BILLING`) and `AppGalleryBillingManager`
  (Huawei `com.huawei.*` IAP) chosen by `CheckHuaweiMobileServicesUseCase`.
- Flow: query `subscriptionmodel` SKUs → `launchBillingFlow` → purchases
  verified/tracked (`getCurrentPurchases` flow, `subscriptionDoneFlow`) →
  `premium.PremiumManager`/`BillingHelper` marks `UserDBModel` premium;
  server-side entitlement rechecked via mobile service (`user/premium`
  endpoints in `mobileservices`).
- Free-tier metering: `ToolLimitsDBModel` per-tool counters +
  `GetToolLimitsUseCase`/`IncreaseToolLimitUseCase`; premium-gated tools
  flagged in `Tools.isPremium` (e.g. OCR PDF, Organize edit) plus
  `PremiumActivity`/`PremiumFragment`/`PremiumComposeActivity` paywalls,
  `premium_banner_*` upsells, `free_trial`/`special_offer` campaigns
  (`marketing`, `campaign`).
