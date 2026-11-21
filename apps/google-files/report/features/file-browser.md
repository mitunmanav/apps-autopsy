# Feature: File Browser

## Surface

- `HomeActivity` (launcher) → bottom-nav shell hosting `Browse`/`Clean`/`Share`(nearby) tabs;
  on large screens Jetpack **WindowManager activity-embedding** splits
  (SplitPlaceholder v3/v4) give a two-pane layout (evidence: `onCreate` decompile).
- `documentbrowser.filebrowser.FileBrowserRegularActivity` (real name) +
  obfuscated peer `itt` (browser fragment) — the actual list/grid + navigation.
- `documentbrowser.filepreview.FilePreviewActivity` — internal preview host
  (peer `jha`); gateway `PreviewActivity` handles external VIEW intents.
- `documentbrowser` + `advancedbrowsing` packages host named classes;
  `mediastore.receiver.ContentChangeListenerReceiver` keeps lists live on
  MediaStore change.

## Data model

- **Storagelib** abstraction: every item is a "document" (`pye*`/`qaw*`/`kpu*`),
  collections = folders/categories; uniform over MediaStore, SAF, raw FS, and
  zip containers (`storagelib-zip-document` URIs, `qdr.c()`).
- Category browsing (Images/Video/Audio/Documents/Downloads/Apps) is implemented
  as MediaStore queries + MIME buckets — `application/zip` detection lives in
  `kah`/`itt`/`qdc`/`kpt` (also `x-zip-compressed`, `.lottie` quirk).
- Storage roots: internal, SD card (`storage_location` int), USB OTG volumes —
  encoded into synthetic IDs (`(id << 2) | storage_location` in trash SQL shows
  the packing convention).

## UI machinery

- RecyclerView lists with view-type enums; grid/list toggle; thumbnails via
  MediaStore thumbnail APIs + `libimageutilsjni` for blur badges where relevant.
- Selection mode → batch operation bar (feeds `file-operations.md`).
- Sorting/filtering; "filtering not supported for zipFiles" (`qdm`) — zip
  contents are a flat virtual folder.
- `AudioPreviewOnGlobalLayoutListener`, `OnScroll` events flow through `hpt`.

## Evidence

- `HomeActivity.onCreate` REA method evidence (embedding + warmup + FCM/GNP).
- Class map: `itt` browser peer, `jha` preview peer, `hpt` event hub.
- String index: browse/filter/empty-state strings across 1,116 decoded strings.

## Unknowns

- Exact query predicates per category (obfuscated builder chains).
- Pagination strategy (looks cursor-based through storagelib; no explicit LIMIT seen).
- Performance budgets — can't infer from static code.
