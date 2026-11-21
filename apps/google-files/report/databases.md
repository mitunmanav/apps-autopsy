# Databases & persisted state

All DDL recovered from decompiled constant strings (`/tmp/stridx.txt`) and
REA class/method inspection. Schemas are static declarations.

## SQLite / Room databases

| DB name | Helper/DAO | Schema (as found) | Purpose |
|---|---|---|---|
| `safe_folder_db` | `hoz`; tables `kng`, DAO `knh`/`kni`/`knj`, model `hzc` | `safe_folder_metadata_table(id INTEGER PK AUTOINCREMENT, original_file_root_relative_path STRING NOT NULL, original_file_storage_location INTEGER NOT NULL, file_safe_folder_path STRING NOT NULL UNIQUE, file_last_modified_timestamp INTEGER NOT NULL)` | maps original path → vault path, so files can be restored to origin |
| `trash_database` | `lub` (DDL), `knh`/`hxz`/`lnl`/`oaa`/`hxz` queries | `trash_table(id INTEGER PK AUTOINCREMENT, file_name TEXT UNIQUE NOT NULL, size INTEGER NOT NULL, uri TEXT NOT NULL, file_date_modified_s INTEGER NOT NULL, original_path TEXT NOT NULL, expiry_date_s INTEGER NOT NULL, storage_location INTEGER NOT NULL)` | trash records with 30-day expiry + original location for restore |
| `search_history_database` | `lgg`, DAO `juq` | `search_history_content(id PK, searched_term TEXT NOT NULL, timestamp INTEGER NOT NULL)` + FTS4 virtual table `search_history_fts` + insert trigger mirroring `searched_term` | suggestion/FTS history |
| `snoozed_card_database` | snoozing package | card snooze records | home-card dismissal persistence |
| `app_usage_database` | helper `huh`; usage impl `hvg`/`hwa`/`hvv`/`iaj` | usage-stat cache for "unused apps" cleanup | cleanup suggestions |
| `files_master_database` | `lpx` (`FileDatabaseAsyncDocumentCollection`, `MainFileTableImpl_*` queries, `WHERE classification = ?`) | master file index + `classification` category column | powers browse/search/duplicates scans |
| `duplicates_alias` (table/view) | `jyp`/`jyc`/`lpx` | `SELECT DISTINCT(file_hash), size FROM duplicates_alias` | duplicate detection by content hash |
| Geller databases | `GellerDatabaseManagerImpl` + `libgeller_jni_lite_lib.so` | proto corpora (opaque) | on-device personalization corpus |
| FCM/messaging DBs | Firebase internals | — | push token/message persistence |

### Notable query forms recovered

- Trash: `SELECT ((id << 2) | storage_location) AS ID_WITH_LOCATION_INFO, * FROM trash_table`
  — packs `storage_location` into low bits of a synthetic ID (internal SD vs
  external storage encoded in one int).
- Trash stats: `SELECT COALESCE(SUM(size),0) AS SUM_BYTES, COALESCE(COUNT(id),0) AS COUNT FROM trash_table`
- Safe Folder lookup: `SELECT * FROM safe_folder_metadata_table WHERE file_safe_folder_path = ?`
- Search history: `SELECT searched_term FROM search_history_content` +
  `WHERE id IN (SELECT docid FROM search_history_fts WHERE search_history_fts MATCH ?)`

## ProtoStore / SharedPreferences surfaces

- `safe_folder_pref` (`kmo`/`wkz`) — vault settings + key metadata
- `MappedCounterCacheVersion` (ProtoStore + JNI stamp) — counter cache invalidation
- GNP/FCM prefs, phenotype channel prefs, `is_first_nearby_share_logging_attempt`
  (`ixj`), `is_gemini_display_logged` (`jld`), onboarding/first-run flags
- WorkManager job DB, Room migration metadata

## Crypto-persisted artifacts (Safe Folder)

Strings `safe_file_proto_mac`, `safe_file_blob_enc`, `safe_file_metadata_enc`
indicate per-file records split into **MAC'd proto header + encrypted blob +
encrypted metadata** — see `features/safe-folder.md`.

## Integrity notes

- `file_name UNIQUE` on `trash_table` prevents duplicate trashing of same name;
  combined with `.trashed-<id>-<name>.trash` on-disk naming the DB id is embedded
  in the filename for recovery.
- No encryption-at-rest for non-Safe-Folder DBs (plain SQLite/Room).
