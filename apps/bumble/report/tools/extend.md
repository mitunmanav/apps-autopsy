# Tool: Extend (24h match extension)

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

- **UI entry** [obs]: `ACTION_TYPE_BUMBLE_EXTEND_PREMATCH` string; extend button on expiring match rows [inf]
- **Param model** [obs]: `REQUEST_EXTEND_MATCH`/`EXTEND_MATCH`/`EXTEND_MATCH_CHAT` params (no `SERVER_EXTEND_MATCH` verb in catalog); prematch-expiry state (`SERVER_ERROR_TYPE_PREMATCH_EXPIRED`)
- **Execution path** [inf]: tap extend on expiring match → `EXTEND_MATCH` param → timer reset → updated countdown
- **Local vs remote**: timer truth server-side [inf]; local: countdown display.
- **Premium/offline**: gating strings place `EXTEND` in paywall surfaces [obs]; free quota (if any) is server-side [unk]; online.
- **Input → output**: extend tap → reset match deadline.
