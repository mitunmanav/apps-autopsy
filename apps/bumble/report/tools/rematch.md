# Tool: Rematch (revive expired match)

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

- **UI entry** [obs]: `Rematched`/`rematched`, `RematchMiniProfileRequested(model=`, `ACTIVATION_PLACE_REMATCH_MESSENGER`, `PreviewProfile.Profile.rematchData` — surfaced in expired-connections + mini-profile popups
- **Param model** [obs]: `REMATCH`/`REMATCH_ACTION` params (no `SERVER_REMATCH` verb); expired-match context model
- **Execution path** [inf]: expired match row → rematch CTA → `REMATCH`/`REMATCH_ACTION` params → match restored → chat window reopened
- **Local vs remote**: server restores match; local UI + list refresh.
- **Premium/offline**: subscription feature [obs — appears in Boost-tier paywall copy + gated entry]; online.
- **Input → output**: rematch tap → reactivated connection.
