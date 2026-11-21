# Subscription & Payments

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Modules:** `feature_subscription`, `ai.regainapp.payments`, RevenueCat, Razorpay, Play Billing · **Evidence:** OBS

## What it is
"Regain Pro" — subscriptions + one-time orders via Google Play Billing 8, RevenueCat orchestration, and Razorpay UPI (India); invoices, paywall variants, offers, experiment enrollment.

## UI entry (OBS)
`subscription*`, `paywall_*`, `SubscriptionActivity`, `unlock_offer_bs`, `invoices_screen`, `invoice_view/{P}`, `payment_methods`, `payment_status`, `regain_payment_methods`, `CheckoutActivity`, `creator_demo_toggle`.

## Params model (OBS)
`SubscriptionState`, `PackageUIModel`, `RegainPaymentMethod`, `InHouseAdConfig`, `PaywallVariantInfo`, `OfferForPackage`, `OfferDetails`, `ClaimOffer*`/`SaveOfferConversion*`/`ExperimentEnrollmentDto` (remote), `PurchaseClaimApi`/`Response`, order/subscription models in `ai.regainapp.payments`.

## Execution path (OBS)
1. Paywall (variant from `PaywallVariantInfo`+RemoteConfig) → Play Billing purchase or `CheckoutActivity` (Razorpay UPI intents to ~100 UPI apps).
2. Purchase token → `POST /payments/claim` (Google token + `regain_email`) or Razorpay order → `/payments/one_time_orders/*`, `/payments/subscriptions/*`, `/payments/orders/channel`, `/payments/orders/status`.
3. Entitlement → RevenueCat + server `SubscriptionState` → pro gating everywhere.
4. Invoices → `GET /payments/invoices` + `/payments/invoices/{id}/pdf` → `PaymentsFileProvider` share; cancel → `/payments/subscriptions/cancel`, `/payments/one_time_orders/cancel`.
5. Offers → `/fg/offers/claim` + `/fg/offers/conversion`; A/B → `/auth/auth/experiment/enroll`.

## Premium/offline (OBS)
Fully network-dependent; `SubscriptionState` cached for offline gating.
