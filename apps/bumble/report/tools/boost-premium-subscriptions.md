# Tool: Subscriptions — Boost Light / Boost (Gold) / Premium

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

- **UI entry** [obs]: `subscriptions_plan`/`subscriptions_features_screen`/`subscriptionstatus` packages, `com.bumble2.paywall`; subscription info via `SubscriptionsApi` (no `SERVER_GET_BUMBLE_BOOST_INFO` verb)
- **Param model** [obs]: products `BoostLight`, `GoldTier`, `Premium`, `Premium+` (shipped product-string names; marketed tier names differ) (+ `PaywallPromo`); `SubscriptionsApi`, `PaywallsApi`, `SERVER_GET_BILLING_PLAN`
- **Execution path** [inf]: paywall → plan picker → provider checkout (Play/Stripe/Braintree/dLocal/Wallet) → `SERVER_VALIDATE_PURCHASE`/`OrdersApi` → entitlement flag → feature unlocks
- **Bundled tools** [obs→inf mapping from gated surfaces]:
  - BoostLight: Beeline, Rematch, Extend, 1 Spotlight+5 SuperSwipe/wk pattern [inf typical; exact bundle = server]
  - GoldTier/Premium: + Travel, Incognito, Advanced Filters, unlimited Backtrack/Extend [inf from gated tool files]
- **Local vs remote**: entitlements server-held; flags cached locally [inf].
- **Offline**: none.
- **Input → output**: plan + payment → tiered feature access.
