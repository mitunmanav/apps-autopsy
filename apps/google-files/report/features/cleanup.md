# Feature: Clean — junk, duplicates, unused apps

## Suggestion engines

`JunkFilesReviewActivity` + `CardReviewActivity` + `cards.ui.CardListActivity`;
`cards.ui`/`snoozing` namespaces. Card loaders `iwz`,`hrk`,`jtx`,`iua`,`jht`,
`jcf`,`ikr` (`Failed to load trash storage status.` family):

- Log files / temp / cache buckets
- **Blurry photos** — `hya` is the blur-card generator
  (`Blur detector detects blurriness only in images`,
  `generate blurry images card failed`, `photosHelper not initialized properly`)
  scoring via `libimageutilsjni` `isBlurred`/`getClarityValue`
- Screenshots / memes / large media (strings)
- **Large files** ranking; **Downloads** cleanup
- **Unused apps** — `PACKAGE_USAGE_STATS` + `app_usage_database`
  (helper `huh`; usage-stats impl `hvg` — `DeviceInfoEvent` logging +
  `PACKAGE_USAGE_STATS`; `hwa` — `android:get_usage_stats`/`usagestats`;
  `iaj` — `Failed to fetch space to free size`; `qdc` — `storagestats` +
  externalstorage tree URIs; `hvv`/`hpj`-adjacent helpers)
- **Trash stats** — `SUM(size)`/`COUNT` on `trash_table` (`knh`,`hmb`)
- `assets/decision_rules.bin` — bundled heuristic/decision-rules binary
  feeding card eligibility (added after archive re-verification)

## Duplicates

`jyp` + `lpx` + `jyc` — `SELECT DISTINCT(file_hash), size FROM
duplicates_alias` — duplicates grouped by **content hash**; `lpx` is
`FileDatabaseAsyncDocumentCollection` (`MainFileTableImpl_*` queries,
`WHERE classification = ?`), i.e. the master file index the duplicate scan
runs over. Review UI = keep-one selection, batch delete.
(earlier draft's `tvc`/`sce`/`rmd` are cronet/tracing classes — corrected)

## Deletion pipeline

Cards resolve to storagelib delete/trash ops (shared with
`file-operations.md`); bulk ops log `Failure in batch trashing operation.`-family
breadcrumbs.

## Evidence

`hya`/`huh`/`hvg`/`hwa`/`iaj`/`qdc`/`hvv` strings; `jyp`/`lpx`/`jyc` SQL;
`decision_rules.bin` in archive; activities + card strings.

## Unknowns

- `file_hash` algorithm (constant not recovered).
- `decision_rules.bin` format/semantics (opaque binary, likely a decision
  forest or rules table).
- Junk threshold constants (age/size cutoffs obfuscated).
- Whether unused-app ranking uses usage events or last-used timestamp.
