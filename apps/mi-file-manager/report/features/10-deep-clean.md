# 10 — Deep Clean (per-category deep cleaner)

`com.android.fileexplorer.deepclean` — the "Deep clean" experience separate from the quick cleaner (doc 09): dedicated screens per junk category with preview/delete.

## Screens

**Declared in manifest** (all `exported=false`):

| Activity | Purpose |
|---|---|
| `deepclean.appdata.AppDataActivity` | per-app data/cache breakdown |
| `deepclean.largefile.LargeFilesActivity` | largest files on device, sorted |
| `deepclean.video.VideoListActivity` | large/duplicate videos with preview |
| `deepclean.apk.ApkListActivity` | downloaded/orphaned APKs |

**Present in dex but NOT declared** (dead/disabled in this build — they cannot be launched; verified against manifest + class inventory):

| Activity class | Intended purpose |
|---|---|
| `deepclean.installedapp.InstalledAppsActivity` | unused installed apps (uninstall) |
| `deepclean.appclean.facebook.FacebookCleanerActivity` | Facebook-specific junk |
| `deepclean.appclean.whatsapp.WhatsappCleanerActivity` | WhatsApp media junk |
| `deepclean.appclean.detail.GroupDetailActivity` | file-group detail grid |
| `deepclean.appclean.detail.ViewImageAndGifActivity` | preview before delete |

Names like `CleanSuccessActivity`/`WithAdAppListActivity` were **not observed** in the complete inventory — removed.

## Cards & shared plumbing

- `deepclean.cards.*` — `DeepCleanCard`, `ApkListCard`, `AppCacheCard`, `LargeFileCard`, `VideoFileCard` — dashboard cards on the main page driving into each screen.
- Scanning reuses the same scanner set as MiEngine (doc 09: `ApkScanner`, `LargeFileScanner`, `VideoScanner`, `InstallAppScanner`, `SystemCacheScanner`) and `AppCacheManager` for app-cache classification.
- `appclean.detail.GroupDetailActivity` + `appclean.detail.ViewImageAndGifActivity` (undeclared, see above) — check/uncheck file selection with thumbnails (GIF-aware `gif.GifImageView`).

## Deletion semantics

- Selection models shared with cleaner models; deletion via `FileOperationManager`/`CleanTaskManager` honoring the same whitelist (`BlackWhiteManager`/`whitelist.*`).
- `InstalledAppsActivity` (undeclared) uninstalls via `REQUEST_DELETE_PACKAGES`/package-intent (not silent; user confirms each).

## Evidence

Deep-clean class inventory via `ev_c7d5130a…787a4a` (complete app-package search), manifest activity list (`ev_24480d9e…089c2a7` — declared vs undeclared verified line-by-line), scanner wiring `ev_ff348ddf…8a0468`.

## Unknowns

- Facebook/WhatsApp cleaner specifics (which folders targeted — likely `Facebook/` media cache + `WhatsApp/Media`) — the per-app path lists live in app-clean config not fully decompiled; also moot in this build since those activities are undeclared.
- Why 5 activity classes ship undeclared — dead code vs. removed-from-manifest launch paths cannot be distinguished statically.
