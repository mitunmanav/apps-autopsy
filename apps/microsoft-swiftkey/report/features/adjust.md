# Adjust attribution

Evidence: `com.adjust.sdk.*` classes + `AdjustLifecycleProvider`/referrer provider, `libsigner.so` (Adjust signature lib), `https://app.adjust.com/n4j99i9` referral URL, `appconfig/event_forwarding` config, `INSTALL_REFERRER` receiver.

## What it does

Install/referral attribution via **Adjust SDK**:
- `AdjustLifecycleProvider` — provider auto-initializing session tracking.
- `com.android.vending.INSTALL_REFERRER` — Play install-referrer capture.
- `app.adjust.com/n4j99i9` — the app's Adjust tracker token used for deferred deep links/attribution pings (e.g. translator upsell links route through it).
- `libsigner.so` — exports Adjust signing functions — request signing so attribution calls can't be spoofed.
- `event_forwarding` appconfig — which in-app events forward to Adjust for campaign measurement.

## Privacy

Attribution feeds marketing analytics; gated by the same consent plumbing (`ads_data_consent`) presumably — not explicitly verified.
