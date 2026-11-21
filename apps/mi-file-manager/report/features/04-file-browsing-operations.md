# 04 — Core File Browsing & Operations

## Entry & shell

- `FileExplorerTabActivity` (102 methods) — the launcher activity. Drawer (`TAG_DRAWER_OPEN` state), tab/content host; tag constants `TAG_CLEAN`, `TAG_RECENT`, `TAG_FILE_VIEW`. Registers `UsbManagerHelper` listener, `SelfUpgradeChecker` check, `ScoreDialog`, `mainIdleHandler` for deferred work; `res/xml/shortcuts` for launcher shortcuts (clean/recent).
- Navigation model: drawer sections → fragments (verified `.fragment` classes: `FileFragment`, `RecentFragment`, `SearchFragment`, Storage/Remote-volumes fragments, `CategoryFragment`/`Docs*`/`Picture*`/`Video*` family, `DeepCleanFragment` entry points, `AppTagFragment`, FTP/SMB/GDrive/Usb file fragments).
- `BaseActivity` — common theme/locale/permission plumbing; `FileExplorerTabActivity` extends it via `BaseActivity`.

## File list core

- `FileViewInteractionHub` (`com.android.fileexplorer.controller`) — the central controller coordinating selection mode, menus, and operations invoked from fragments/adapters; works with a `ModeCallBack` family (Private/Remote/AppTag/Category/Favorite/BaseFileOperation) for per-context behavior.
- `fragment.FileFragment` — host for listing a directory (or volume root) with `FileListView`, `FileExplorerAdapter`-family adapters, path bar, refresh via `RefreshListView` pull-to-refresh.
- Adapters: `adapter.FileListItemAdapter` family (`adapter.z`, `adapter.y` seen as obfuscated letter names — grid/list variants), view holders binding icons by MIME/category.
- Model: `model.FileInfo` (`i0.d`), `model.p` sort helper, `FileSortHelper`-style sorts (name/date/size/type).
- `FileUtil`/`FileUtils` (`com.android.fileexplorer.util`) — MIME mapping via `res/xml/functionindex.xml`/mime maps, `MediaStore` sync, path canonicalization.

## Operations

- `FileOperationManager` (`l0.a`) — copy/move/delete/rename/new-folder, progress + conflict dialogs; drives `FilePasteHelper`-style clipboard for copy/move.
- `FileViewInteractionHub` context/bottom menus → operations incl. **send to private folder** (see doc 11), share (doc 14), compress/extract (below).
- Rename/delete confirmations via `view.dialog.AlertDialog` (custom dialog class used throughout).
- Sort/filter: sort helpers in obfuscated `model` package, hidden-file toggle (`show_hidden` preference).

## Picking & sharing-in entry points (manifest-verified)

- `FileActivity` — declared activity (singleTask, exported): `PICK`, `GET_CONTENT` (openable), `miui.intent.action.{PICK_FOLDER,PICK_MULTIPLE,OPEN}`, plus `MEDIA_MOUNTED`/`MEDIA_UNMOUNTED` filters so mount events refresh the UI.
- Six **activity-aliases** route into `FileActivity`/`FileCategoryActivity` (doc 02):
  - `CopyFileActivity`/`MoveFileActivity` → `FileActivity` — `SEND`/`SEND_MULTIPLE`/`VIEW` handlers: user shares files *into* Mi File Manager and picks a destination folder.
  - `ExtractFileActivity` → `FileActivity` — `VIEW` on `application/{zip,rar,x-rar-compressed}` → extraction UI.
  - `PickImageActivity`/`PickVideoActivity`/`PickAudioActivity` → `FileCategoryActivity` — media pickers.

## Archive handling

- `ArchiveDialogHelper` — zip/rar/7z listing & extract-destination UI; extraction through `FileOperationManager`/`ArchiveUtils`.
- `com.github.junrar` — present in dex (verified `ev_31c89ab4…98a2bf`); used for RAR listing/extraction.
- `ndk_lzma.UnLzma` JNI (`unLzma`, `unLzmaDirectly`) — LZMA decompression for 7z/lzma payloads (doc 22).
- `ShareViaQRCodeActivity` shares via QR+hotspot (doc 14).

## Search integration (UI side)

- `SearchDetailActivity` handles the custom action `com.mi.android.globalFileexplorer.action.SEARCH`; `android.intent.action.SEARCH` + `searchable.xml` is on `FileExplorerTabActivity` (manifest-verified). `SearchFragment` shows results with category filter; `SearchExportProvider` exports results (doc 17/16).

## Recent files

- `TAG_RECENT` fragment (`RecentFragment`) lists recently accessed files — backed by FileContentProvider DB (`FileItem`/recency tracking in `dao` layer, doc 17).

## Notable supporting views

`view.FileListView`, `RefreshListView`, `PathBar`/breadcrumb, `view.menu.i` popup menu, `view.NonScrollLinearLayout`, `view.dialog` custom dialogs, `view.NoFileItemView` empty states, `view.SectorBarForVideoTime` (player overlay), `view.BalloonHint`? tutorial hints.

## Evidence

`ev_f082a1db…e02f72` (TabActivity.onCreate body), `ev_c7d5130a…787a4a` (complete app-package class search), manifest intents (`ev_24480d9e…089c2a7`), `ev_31c89ab4…98a2bf` (junrar present).

## Unknowns

- Full per-operation code paths (copy/move worker internals partly obfuscated) — behaviorally standard but line-level detail not exhaustively decompiled.
- Exact archive-format coverage (7z supported via LZMA JNI; RAR via junrar — confirmed classes, not a format table).
