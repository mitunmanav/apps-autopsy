# Tool: Backtrack (undo a swipe)

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

- **UI entry** [obs]: `encounters_backtrackV2_entryPoint` string, `BacktrackInVoteCardClicked`, `ClickBacktrack(immediateOutcome=`, `HookProfileBacktracked(position=`, `ELEMENT_BACKTRACK_BEST_BEE_TOOLTIP`, `UpdateBacktrackTooltipIsDismissed`, `BACKTRACK`/`BackTrack`/`backtrack` product strings
- **Param model** [obs]: `BACKTRACK`/`BACKTRACK_ENCOUNTERS` params (no `SERVER_BACKTRACK` verb); position/card reference carried by `HookProfileBacktracked(position=` model
- **Execution path** [inf]: shake/button/entry-point on deck → if entitled → `BACKTRACK`/`BACKTRACK_ENCOUNTERS` params → last card restored → re-vote; if not → paywall (tooltip shows "Best Bee" upsell)
- **Local vs remote**: server confirms undo (deck truth is remote); local animation + card reinsert [inf].
- **Premium/offline**: premium-gated (unlimited in higher tiers; tooltip upsell = paid) [obs gate strings]; online.
- **Input → output**: undo gesture → restored card + re-vote.
