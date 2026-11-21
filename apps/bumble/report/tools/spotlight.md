# Tool: Spotlight

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

- **UI entry** [obs]: `com.bumble.app.spotlight` package + spotlight entry on own profile/deck
- **Param model** [obs]: `SERVER_INIT_SPOTLIGHT`, `SERVER_STOP_SPOTLIGHT` (no `SERVER_USER_SPOTLIGHT` verb); consumable `Spotlight` product; `com.bumble2` spotlight package
- **Execution path** [inf]: activate → `INIT_SPOTLIGHT` → server boosts profile visibility for a window → countdown UI → `STOP_SPOTLIGHT`/expiry; credits via consumable or subscription allotment
- **Local vs remote**: remote — boost state + timing server-held; local: activation UI + timer.
- **Premium/offline**: consumable (and possibly allotment in Premium) [obs product]; online-only.
- **Input → output**: activation → temporary boosted deck placement + usage counters.
