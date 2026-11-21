# Feature: Payment / Paywall

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

- `PaywallActivity` `[obs]` + Play Billing client **8.3.0** `[obs]` + `com.android.vending.BILLING` permission `[obs]`.
- Trigger `[inf]`: `isPremiumTool`/free-task exhaustion in `m82` → paywall navigation; `b5a` paywall state in tool-list VM `[obs]`.
- Purchase flow `[inf]`: BillingClient purchase → `AcknowledgeAccountSubscriptionWorker` → backend validation → `rv6` pro flag (`z12.t(rv6).a`) unlocks `kg5.k` unlimited limits `[obs chain]`.
- Products `[unk]`: SKU IDs/prices come from Play Console at runtime — not statically present (strings reference generic "Pro"/"Premium" tiers).
- Entitlement checks occur both client-side (`m82.a(tool)`) and server-side (`lu7` on `mu7`) `[obs]`.
