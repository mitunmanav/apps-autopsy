# Feature: Paywall & Promo Engine

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

## UI entry [obs]
- `com.bumble2.paywall` package + `StripePaymentRoute`, `Stripe WebViewBridge` (web checkout inside app), `promoplatform`, flash-sale + `PROMO_BLOCK_TYPE_*` strings, consumable-promo classes
- Triggered by: locked features (`LockedCard`, `bumble_settings_incognito_tooltip`, backtrack entry points) and contextual/instant paywall verbs

## Param model [obs]
- `PaywallsApi`, `PerksApi`, `SubscriptionsApi`, `OrdersApi`, `OrdersAlternativeApi`, `OrdersGoogleWalletApi`, `RevenueApi` (B4F)
- `SERVER_GET_CONTEXTUAL_PAYWALL`, `SERVER_GET_INSTANT_PAYWALL`, `SERVER_GET_BILLING_PLAN`, `SERVER_VALIDATE_PURCHASE`, `SERVER_GET_PAYMENT_PROVIDER_BANKS`; subscription info via `SubscriptionsApi` (no `SERVER_GET_BUMBLE_BOOST_INFO` verb)
- Product catalog [obs]: subscriptions `BoostLight`, `GoldTier`, `Premium`, `Premium+`; consumables `Beeline`, `Compliment`, `Spotlight`, `SuperSwipe`, `Votecap`; `PaywallPromo` offers

## Payment providers [obs]
Play Billing + `payments.flows.alternate.{checkout,google.AlternativeBilling}` (alternative billing), Stripe (WebViewBridge), Braintree/PayPal/Venmo, dLocal, Google Wallet, carrier billing (`inappservices_silent`), **Plaid** (`PAYMENT_PROVIDER_TYPE_PLAID` + `SERVER_GET_PLAID_INSTITUTIONS`), **iDEAL** (`IDEAL_API_FLOW`), **Boleto** (`BOLETO_TAX_INFO`), web payment activities (`Bumble*WebPaymentActivity`, `GlobalChargeActivity`), `SERVER_START_EXTERNAL_PURCHASE`, partner-promo redemption (`partnerpromo` activities, `PARTNERSHIP_REDEMPTION_SERVER_ASSETS`), provider-banks list.

## Monetization plumbing [obs]
- `SERVER_UNSUBSCRIBE_CREDITS_AUTO_TOPUP` + `ANYTIME_AUTOBUY` — **credits auto top-up** (auto-replenishing consumables)
- `STORED_PAYMENT_ONE_CLICK`, `LIFETIME_SPP` (lifetime subscription product), `OFFERWALL_SUPERSONIC` (ironSource offerwall — earn credits via offers), `BUNDLE_SALE`/`PACK_SALE`, `CROSS_SELL*`, `ORDER_RECAP*`, `GIVE_ONE_FOR_FREE`, `FREE_PRODUCTS_FOR_ACTIONS`
- `MINOR_FEATURE_THREATMETRIX_DEVICE_PROFILING` + `payments.flows.payment.profiling.*` + `handshake.probity.io` — **LexisNexis ThreatMetrix device fingerprinting at payment time** [obs]

## Execution path [inf — all parts obs]
- Trigger → paywall fetch (contextual/instant/promo) → provider checkout → receipt → `SERVER_VALIDATE_PURCHASE`/`OrdersApi` → entitlement → unlock + `RevenueApi` reporting

## Local vs remote
- Remote: pricing, eligibility, validation; local: paywall rendering, Stripe web bridge, entitlement caches [inf].

## Offline
- None [obs] — every step needs server.

## Input → output
- In: locked-feature taps, promo triggers, payment method → Out: receipt → entitlement → feature access.
