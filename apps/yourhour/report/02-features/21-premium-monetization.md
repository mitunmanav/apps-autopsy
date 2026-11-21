# 21 — Premium, Offers & Monetization

## SKUs (Play Billing)

| Product | Type |
|---|---|
| `yourhour_pro` | flagship subscription (monthly/yearly base plans) |
| `yourhour_partial_premium` | "lite" tier (reduced feature set) |
| `yourhour_ad_removal` | one-off ad-removal |
| `yourhour_reset_pin` | **paid PIN-reset** — forgot-PIN is monetized |
| `yourhour_tv_{1month,3month,1year}_sub` | parental/TV plans (separate entitlement) |

User tiers seen in analytics extras: `pro`, `adfree`, `lite` (partial), `free`, `unknown`.

## PurchasePremiumComposeActivity (`purchase_premium`)

- Stage machine extras: `stage`, `entry_point`, `analytics_entry_point`.
- Events: `purchase_cta_clicked`, `purchase_dialog{dialog_type}`,
  `exit_offer_claim_clicked`, `exit_offer_left`, `post_purchase_step`, `pro_icon` reward.
- **Exit offers**: closing the paywall can trigger a discounted offer (`exit_offer`,
  `OFFER`/`exitOfferPreference`; reminder via OfferReceiver + `exit_notified_for`);
  strings mention `yearly-exit` and `monthly-to-yearly` upgrade offers.
- **Student pass**: `student_step_required` — 7-day Pro pass via student-ID photo upload.
- `PurchasesAndSubscriptionsActivity` (`purchases_and_subscriptions`): manages subs —
  renewal_switch, `purchases_viewed`, `purchases_action{direction=off|back|view}`,
  deep-links to `play.google.com/store/account/subscriptions?sku=yourhour_pro`.
- **Pro icon** — launcher-alias swap as a premium cosmetic reward.

## Premium-gated features (from strings/gates)

Category limits & custom categories · custom/scheduled challenges · report depth + PDF ·
export · reel blocker · Mindful Pause · floating timer · custom day-start · pro icon.

## Ads (free tier)

- **Networks:** AdMob (`ca-app-pub-3128150064662905/*`), Meta Audience Network (embedded
  `assets/audience_network` dex), Unity Ads — mediation across placements.
- **Native slots:** `native_ad_dashboard_1/2`, `native_ad_challenge_1/2`, `native_ad_story_1/2`,
  `native_ad_day_statistics`, `native_ad_week_statistics_1/2`, `native_ad_month_statistics_1/2`,
  `native_ad_usage_pattern`, `native_ad_profile`, `native_ad_notification_daily_report`.
- **Interstitials:** `daily_report_interstitial`, `report_interstitial`,
  `challenge_interstitial`, `app_usage_report`.
- **Rewarded:** `week_reward_ad` + "watch an ad → **8 h of Pro**" (reel-blocker reactivation,
  reward_ended broadcast), and general 8-hour pro unlock strings.
- Ad pools warmed at app start (`global_warmup`).

## Server-side pieces

- `GET subscriptions/status` — **server-side subscription verification exists**; the client
  caches entitlement but the plane can verify remotely (refines security S9).
- `SubscriptionOfferSyncWorker` (`offer/`) — periodic WorkManager sync of `offers/active`
  → server-driven offer campaigns targeted by user state.
- `MainEntitlementExpiryWorker` (`home/premium/`) — watches entitlement expiry → drives
  "reward ended"/win-back surfaces.

## Analytics

Tier carried as extras everywhere (`premium`/`free`/`lite`/`unknown`); purchase funnel events;
offer claim/leave events; ad-impression events per screen.
