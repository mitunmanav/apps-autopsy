# Tool: Incognito mode

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

- **UI entry** [obs]: `bumble_settings_incognito_tooltip`, `INCOGNITO`/`Incognito`/`incognito`, `PROMO_BLOCK_TYPE_BUMBLE_INCOGNITO`, `NOTIFICATION_BADGE_TYPE_INCOGNITO`
- **Param model** [obs]: settings save via `SERVER_SAVE_APP_SETTINGS`; incognito state in settings payload
- **Execution path** [inf]: settings toggle (gated → tooltip paywall if free) → `SERVER_SAVE_APP_SETTINGS` → server hides profile from all except right-swiped targets → badge/notifications adjust (`NOTIFICATION_BADGE_TYPE_INCOGNITO` — badge behavior [inf])
- **Local vs remote**: visibility enforced server-side; local toggle + indicators.
- **Premium/offline**: Premium-tier feature [obs promo/upsell strings]; online.
- **Input → output**: toggle → selective visibility state.
