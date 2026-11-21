# Tool: Vote-cap (unlimited swipes)

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

- **UI entry** [obs]: `com.bumble.app.votecap` package; `Votecap` consumable product; swipe-limit interstitial [inf]
- **Param model** [obs]: daily-vote counter (server-side [inf]); cap-reached state → paywall surface
- **Execution path** [inf]: cap hit → block screen → purchase `Votecap`/subscription → entitlement → counters reset/removed
- **Local vs remote**: counter + cap enforced remotely; local interstitial.
- **Premium/offline**: consumable/tier feature [obs]; online.
- **Input → output**: swipe-limit hit → payment → continued swiping.
