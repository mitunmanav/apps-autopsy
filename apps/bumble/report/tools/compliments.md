# Tool: Compliments

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

- **UI entry** [obs]: `SendComplimentFeature`, `com.bumble.app` compliment classes on profile cards; consumable `Compliment` product
- **Param model** [obs]: message attached to a like/comment on profile content; credit ledger via orders
- **Execution path** [inf]: profile element → compliment button → compose note → `SERVER_ENCOUNTERS_VOTE`/`VotesApi` variant carrying compliment → recipient notified; no credits → paywall → purchase → validate
- **Local vs remote**: remote delivery + credits; local compose UI (+ review-before-send safety [inf]).
- **Premium/offline**: consumable (+ daily free quota typical [inf]); online.
- **Input → output**: note + profile ref → standout like delivered.
