# Persistence

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

Evidence: DEX SQL strings, Room class inventory, provider manifest entries, Elise worker decompile `ev_d7810059`, shared-prefs/settings KMP classes.

## Databases (Room / SQLite) [obs]
| DB | Evidence | Contents |
|---|---|---|
| `SpiderwebDatabase` (`com.bumble.spiderweb.database`) | Room class + 2 DAOs, `command_inner_entity` table | Offline command queue — inner entities for the "spiderweb" sync engine [inf: queues outbound actions like votes/messages while offline] |
| Stream Chat | `io.getstream` providers + receiver | GetStream SDK local store (no `stream_chat_*` DDL found — corrected pass 2) |
| WorkManager DB | androidx schema | Job persistence (Elise downloader, uploads, incoming-call worker) |
| Google DataTransport | `offline_signal_*` tables | Ads/analytics buffered pings (previously misattributed to Sentry — corrected pass 2) |

Plus: `datapoint` analytics buffer tables [obs strings; owner DB unk], downloader-cache ContentProvider (guarded by `ACCESS_CACHE_PROVIDER` via `android:permission`; permission not declared — protection level [unk]).

## Files / directories [obs]
- `_elise_assets/` — `getDir("_elise_assets", 0)` app-private; holds downloaded ML model + vocabulary [obs from decompiled worker `a()`]
- Chat media via FileProvider (`chat file providers`), temp-photo provider, downloader cache provider path XMLs
- `baseline.prof` / `baseline.profm` — baseline profile assets (art)
- Lottie JSON, fonts, shaders in `assets/` [obs]

## Key-value stores [obs]
- androidx **DataStore** + `libdatastore_shared_counter.so` (multi-process counter — the `:light` process shares state [inf])
- SharedPreferences via KMP `russhwolf-settings` classes and plain SP wrappers [obs]
- Settings init providers; consent/flag prefs implied by Sourcepoint/Statsig flows [inf]

## Backup [obs]
- `android:allowBackup="false"` + `backup_rules` + `backup_rules_android11_and_below` XMLs — no user-controlled data extraction via adb backup [obs; rules' content generic allow-lists].

## WorkManager jobs observed [obs]
- `EliseDownloaderWorker` (RxWorker): payload keys `PAYLOAD_KEY`, `MODEL_URL`, `MODEL_COMPRESSED`, `VOCABULARY_URL`, `VOCABULARY_COMPRESSED`; missing payloads → `Result.failure()`. Downloads ML assets → `_elise_assets`.
- Incoming-call worker, upload workers (photo verification `PhotoVerificationUploadService`), generic `SystemJobService` [obs].

## Unknowns
- Exact entity schemas inside obfuscated Room DBs beyond extracted CREATE TABLEs [unk]
- Cache retention/eviction policies, offline TTLs [unk]
- Whether `spiderweb` queue retries votes/messages (plausible from name) — [inf only].
