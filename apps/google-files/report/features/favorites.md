# Feature: Favorites (starred files)

- `FavoritesActivity` + `favorites` namespace.
- Star/unstar actions on file rows; favorites persisted in app DB
  (likely within `files_master_database` — exact table not enumerated; strings
  confirm favorites labels and empty-state).
- Favorites feed home surfaces + quick filter chip.
- Safe-Folder/trashed docs excluded implicitly via doc-state checks
  (op whitelist pattern seen in `luf`-style guards).

## Evidence

Activity + package names, favorites strings.

## Unknowns

- Exact table/DAO names (obfuscated; not isolated in this pass).
- Sync/backup of favorites across devices — no evidence; likely local only.
