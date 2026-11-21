# Feature: Smart search — JAM donation into AppSearch/BlobStore

The cross-app "find my files everywhere" pipeline: Files **donates** file
metadata into on-device indexes so files surface in Google-app search surfaces.

## Pipeline

- `gjp` — `JamDonation` worker/entry; `hwn` — donation executor with fallbacks:
  `All donation attempts failed`, `Donating to BlobStore failed.`,
  `Donating to AppSearch failed.`, `Exception happened during donation:`
- `njz` — `donateAppContents` RPC (`#donateAppContents - couldn't get
  DonateAppContentsResponse`); `nit` — `@QueryKey` annotated fetch queries.
- Two sinks: **AppSearch** (structured schema docs) and **BlobStore** (blob
  payload storage).

## AppSearch impl (verified classes)

- `nix` — builds `AppSearchSchema`/`SetSchemaRequest`/`AppSearchSession`;
  embeds a **consumer allowlist**: package names
  `com.google.android.deskclock`, `com.google.android.googlequicksearchbox`
  (Google Search app) + package-signature SHA-256 digests
  (`f0fd6c5b…`, `7ce83c1b…`, `1975b2f1…`) — donated docs are scoped to
  specific Google apps verified by cert, not world-readable.
- `njb` — builds `FileObject` schema `GenericDocument`s;
  `"Input schema does not match expectation. Got: "` validation,
  URL patterns `^(https?)`, `www.google.com`/`google.com`.
- `nio` — `GenericDocument` assembly; `mt`/`jfa` — `MediaObject storage for
  AppSearch` (media schema mapping).
- `lpx` (`FileDatabaseAsyncDocumentCollection`, `WHERE classification = ?`)
  feeds file rows into the donation mapper.
- Manifest permission `com.google.android.apps.search.omnient.permission.
  LAUNCH_FROM_EXTERNAL_APP` — declared contract for launching the Omnient
  (Google app) surface, corroborating the integration.
  (earlier draft cited `niz/niy/niq/niu` — wrong names; corrected to
  `nio/nix/njb`)

## Donated schemas (fetch-size flags — `nit`/`njz`)

`File`, `Image`, `DigitalDocument`, `OnlineVideo`, `SavedItem`,
`SavedCollection`, `List`/`ItemList`, `Tab`, `Collection`, `CalendarEvent`,
`Clock`, `PaymentCard`, `FlightReservation`, `EventReservation`, `Universal`
— Files' own donation is the file/image/document subset; the wider schema set
belongs to the shared JAM library.

## Flags (Phenotype)

`appsearchDonationCapping`, `appsearchFetchResultSizeFor*`,
`appsearchDonationToFetchVisibilityDelayInMillis`,
`filesSearchProjectionList` + per-type `*SearchProjectionList`.

## Supporting stores

- **Geller** (`libgeller_jni_lite_lib.so` + `Geller`/`GellerDatabaseManagerImpl`)
  — on-device corpus backing the pipeline.
- **ProtoStore** `MappedCounterCacheVersion` — donation counter versioning.

## Evidence / unknowns

`gjp`/`hwn`/`njz`/`nit`/`jfa`/`nio`/`nix`/`njb`/`lpx` + Omnient permission.
Unknown: content depth (OCR text vs metadata-only), tombstone semantics on
rename/delete, user opt-out surface, donation cadence (server-flagged).
