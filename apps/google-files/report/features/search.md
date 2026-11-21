# Feature: Search

## In-app search

- `documentbrowser.filebrowser.SearchActivity` + `search.filters` package;
  custom action `com.google.android.apps.nbu.files.ACTION_SEARCH` declared.
- `cfo` — `searchRepository` (the query repository class).
- `com.google.android.apps.search.omnient.permission.LAUNCH_FROM_EXTERNAL_APP`
  permission — contract with the Google app (Omnient) for external search
  launch (see `smart-search.md`).
- Filters: category chips, date/time buckets, size — strings confirm
  "top results"/suggestion UX.
- Implementation query path: storagelib collection queries + MediaStore
  `LIKE` matching (obfuscated builders).

## Search history — `search_history_database`

Schema (class `lgg`):

```sql
CREATE TABLE search_history_content(
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  searched_term TEXT NOT NULL,
  timestamp INTEGER NOT NULL);

CREATE VIRTUAL TABLE search_history_fts USING fts4(
  content="search_history_content", searched_term);

CREATE TRIGGER search_history_fts_insert_trigger
  AFTER INSERT ON search_history_content BEGIN
    INSERT INTO search_history_fts(docid, searched_term)
    VALUES (new.id, new.searched_term);
  END;
```

- Suggestions = **FTS4 prefix/fuzzy match** over past queries:
  `SELECT searched_term FROM search_history_content`,
  `WHERE id IN (SELECT docid FROM search_history_fts WHERE search_history_fts MATCH ?)`
  (DAO `juq`).
- History dedupe/timestamp ordering for recency ranking.

## System-wide ("smart") search integration

Separate pipeline — see `smart-search.md` (JAM donation → AppSearch/BlobStore).
Donation-side classes `nio`/`nix`/`njb` (AppSearch schema/docs + consumer
allowlist) handle the index writes; the device-wide search UX itself is a
system surface.

## Evidence

`lgg` schema strings, `juq` DAO SQL, `search.filters` namespace, gateway
alias in manifest.

## Unknowns

- Ranking formula (recency × frequency weights — not recoverable statically).
- Whether file-content search (OCR index) feeds in-app search directly or only
  via AppSearch — likely the latter given the JAM pipeline.
