# Feature: Home feed & cards

- `HomeActivity` hosts the feed; `cards.ui.CardListActivity` +
  `snoozing.settings.SnoozedCardListActivity` are the real card surfaces.
- Card surfaces: storage-status, cleanup suggestions, backups (Google Photos
  card strings), trash status, recent/quick-access, tips/promos.
- **Snooze**: `snoozed_card_database` persists dismissed cards with a snooze
  expiry; snoozing package drives re-surface timing.
- Feed composition is phenotype-flagged (card ordering/suppression is
  server-tunable).

## Evidence

Activities + namespaces + `snoozed_card_database` + card strings.

## Unknowns

- Card priority algorithm (server-weighted; local code is a renderer + snooze
  store).
- Per-card taxonomy (some card types identified via strings only).
