# Tool: SuperSwipe

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

- **UI entry** [obs]: `supercompatible`/encounters card buttons; consumable product `SuperSwipe` in catalog
- **Param model** [obs]: vote payload with superswipe flag; purchase via `OrdersApi`/`SERVER_VALIDATE_PURCHASE`
- **Execution path** [inf from verbs]: tap on card → if credits → `SERVER_ENCOUNTERS_VOTE`/`VotesApi` with superswipe → recipient sees badge [server]; if no credits → contextual paywall → consumable purchase → validate → credit
- **Local vs remote**: remote — credit ledger + vote are server-side; local: button/paywall UI only.
- **Premium/offline**: consumable [obs]; online-only.
- **Input → output**: card + tap → superswiped vote + credit decrement.
