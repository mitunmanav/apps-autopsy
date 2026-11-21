# Class inventory & feature map

Evidence: `ev_84c506d09e0b861d9fd74f4086d12a0ea8a7df9f667697da9d351662717d0287`
(full class inventory). 17,602 classes, 4 DEX files in base.apk.
JADX graph stats: 18,409 classes / 93,543 methods scanned for JNI.

## Top-level census (local JADX output)

| Package root | Files | Role |
|---|---|---|
| `defpackage` | 16,395 | obfuscated app + merged Google libs |
| `j$` | 514 | desugared Java 8+ backports |
| `com` | 400 | named Google lib packages (partially obfuscated inside) |
| `androidx` | 146 | androidx leftovers with real names |
| `android` | 73 | framework shims |
| `org` | 36 | misc libs |
| `java` | 28 | j$ helpers |
| `kotlinx` | 2 | coroutines remnants |
| `uk` | 1 | — |

## Named app namespaces (133 classes in `com.google.android.apps.nbu.files`)

`advancedbrowsing`, `cards.ui`, `documentbrowser`, `favorites`, `home`,
`managespace`, `mediaconsumption` (audio/video/cast), `offlinesharing`,
`permissions`, `quicksettings`, `safefolder`, `search.filters`, `settings`,
`snoozing`, `trash`, `update`, `gateway`

## Feature → key class map (string-fingerprinted)

| Feature | Classes | Anchor evidence |
|---|---|---|
| File browser | `itt` (browser fragment peer), `jha` (preview peer) | peer wiring |
| Audio hub | `hpt` (~200 event ifaces) | `PlayPauseButtonClicked` etc. |
| Audio sequence impl | `kse`,`lqp` | `AudioSequenceManager failed to prepare sequence` |
| Safe Folder crypto | `kmo` (master key), `kmv` (PBKDF2/AES wrap), `hxx` (secret processing), `wkz`, `tix`, `sih` | `android-keystore://safe_folder_master_key`, `PBKDF2WithHmacSHA1`, `FilesSafeFolder_processSecret` |
| Safe Folder DB | `hoz` (helper), `kng`/`kni`/`knj`/`knh` (schema+DAO), `hzc` | `safe_folder_metadata_table` |
| Safe Folder auth UI | `SafeFolderAuthActivity`, `auth_fragment` | `FLAG_SECURE`, `R.layout.safe_folder_auth_activity` |
| Trash schema | `lub` (CREATE TABLE), `knh`/`hxz`/`lnl`/`oaa` (queries) | `trash_table` DDL |
| Trash naming | `kpv` (regex), `hxz` (`String.format(".trashed-%d-%s.trash")`), `lrp` | `.trashed-` patterns |
| Trash workers | `keb` (enqueue), `ak` (DB sync), `hmb` (stats) | WorkManager enqueue logs |
| MediaStore trash | `qbw` (R+ `createTrashRequest` path), `lpv` (pre-R collection) | `Failed to update MediaStore to trash` |
| Zip browse/extract | `qdm` (reader), `qdq` (entry resolve), `qdr` (zip doc + `ZipFile`), `jqu`/`jqr` (unzip dialog peer) | `Entry not found in zip file`, canonical-path check |
| Zip create | `qdt` (`.zip` naming), `htl`/`gpy`/`gln` (create UI/ops), `lrt` (target doc) | `Can't create zip file with empty name!` |
| Zip-slip guard | `qdr` `Invalid zip file canonical path` | canonical path validation |
| Encrypted zip | `qbn` | `This zip file contains encrypted entries.` |
| Nearby share send | `hro` (intent builder: `SEND_FOLDER`, `FILE_COUNT`), `hrg` (selection set), `hro` (ctx proto) | `com.google.android.gms.nearby.*` |
| Share sheet launch | `mdp` (`ShareSheetActivity`), `kbz` (`ReceiveSurfaceActivity`) | GMS activity names |
| Folder share provider | `kvk`/`kvt` | `foldersharing.provider` URI + projection |
| Share receiver | `lmz` | `INTENT_ACTION_SHARESHEET_CHOOSER_RESULT` |
| First-share logging | `ixj` | `is_first_nearby_share_logging_attempt` |
| Search history DB | `lgg` (FTS4 schema), `juq` (DAO) | `search_history_fts` |
| Smart search/JAM | `gjp` (`JamDonation`), `hwn` (donation attempts), `njz`/`nit` (flag keys, QueryKey annotations), `nio`/`nix`/`njb` (AppSearch schema+docs+allowlist), `jfa` (MediaObject) | `donateAppContents`, BlobStore+AppSearch, deskclock/quicksearchbox package allowlist |
| AI descriptions | `htv` (`SmartDescriptionState`), `hpt`, `igk`, `hvi` | state class strings |
| Entity/address extraction | `ffz` (`wzh`/`xge` regex spec tables: streetAddress, postalCode, addressLocality…) | regex table |
| Gemini PDF | `jld` (bottom-sheet peer `jkz` subclass, `is_gemini_display_logged`), `jlg`,`jov`,`jot`,`jou`,`hpa` | `gemini_button`, support URL `13594961` |
| PDF preview | `pdf_preview_item_host_fragment.xml` (has `gemini_button` FAB), AndroidX pdf services | manifest + layout |
| Doc scanner | `kjb` (GMS scan intent + RAM gate + module install), `kef` (`GmsDocScanDelAct`, lang reinstall), `uhy`,`rch`,`kee`,`lng`,`uxm`,`jxh`,`hvi` | `ACTION_SCAN_DOCUMENT` |
| Image utils JNI | `com.google.android.libraries.vision.visionkit.imageutils.ImageUtils` | 5 `native` decls + exports in `.so` |
| Duplicates | `jyp` (`duplicates_alias` SQL), `lpx` (FileDatabaseAsyncDocumentCollection), `jyc` | `SELECT DISTINCT(file_hash), size FROM duplicates_alias` |
| Junk/cleanup | `hxv`,`hvi`,`hpa`, `hya` (blur card), `iwz`/`hrk`/`jtx`/`iua`/`jht`/`jcf`/`ikr` (stats loaders) | `Blur detector detects blurriness only in images`, `Failed to load trash storage status.` |
| Usage stats/unused apps | `huh` (app_usage_database), `hvg`,`hwa`,`hvv`,`iaj`,`qdc` | `usagestats`, `android:get_usage_stats`, `app_usage_database` |
| Search repository | `cfo` | `searchRepository` |
| Cast | `fcj`,`fck`,`fci`,`fch`,`fcf`,`fce`,`fcd`,`jms`,`xgc` | GMS cast framework |
| Master file index | `lpx` (`FileDatabaseAsyncDocumentCollection`), `hoz`-family | `MainFileTableImpl_*`, `WHERE classification = ?` |
| Update framework | `kef` (in-app update sessions), update activities | `unable to display update prompt` |
| Downloader (MDD) | `omz` (`DownloaderCallbackImpl`), `mxh` (bundle unzip) | `Failed to unzip queued bundle` |
| Feature flags | `vxs` (flag-name table), `kef` (phenotype register/commit) | `enable_zip_folder`, `enable_android_file_sharing*` |
| Telemetry | `nsh`/`njk`/`nsg` (Streamz metric defs), `hpa`/`jld`/`ixj` (event logs) | `/client_streamz/geller/…` |

## Class-name recovery caveats

- `defpackage` names are per-build, unstable across versions — cite via
  role + evidence string, not name alone.
- Synthetic/accessor members inflate method counts; JADX reported 178
  decompile errors (lambda/desugar edges) — treat missing bodies as coverage gaps.
