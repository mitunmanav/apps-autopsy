# 05 — Category Browsing (Docs / Images / Video / Audio / APKs / Favorites)

## Mechanism

`CategoryFragment`-family (`.fragment` package) + `FileCategoryActivity` host per-category lists. Category queries run against `FileContentProvider` (the app's own content DB, doc 17) which is kept in sync by a directory-indexer service (`DirParseService`, `DirParseSubProvider`) plus `MediaStore` for standard media — so browsing works even for files MediaStore doesn't index.

Categories are enumerated in `category`/`CategorySort` DAO and surfaced as drawer/grid entries:

- **Documents** — pdf/doc/docx/xls/ppt/txt (MIME map in `res/xml/functionindex.xml`/`FileUtil`), "docs" favorites.
- **Images / Pictures** — `PictureFragment`, gallery-style grid, opens `ViewLargeActivity` viewer (doc 15).
- **Videos** — `Video*` fragment family (tab + group/category variants), opens `VideoPlayerActivity` (doc 15), resume-position tracking via `provider.dao.videoposition.VideoPositionBeanDao` (verified class).
- **Audio / Music** — audio list; playback delegated to external player via intent (`FileViewInteractionHub` open-with).
- **APKs / Apps** — `InstallAppScanner`-driven listing; app category also covers *installed* apps (doc 16).
- **Compressed** — zip/rar/7z listing (extraction via `ArchiveDialogHelper`, doc 04).
- **Favorites** — `ContentTag`/favorites table in FileContentProvider; add/remove from file menus.
- **Recent** — `RecentFragment` recency list (doc 04).

## Category plumbing

- `FileCategoryActivity` intents carry a category key; the fragment binds `FileExplorerAdapter`-style adapters to DAO cursors (`SubProviders.CategorySort`/`FileGroup`/`FileItem`).
- Category counts/labels localized across 88 locales (doc 25); card UI reused by deep-clean `deepclean.cards.*`.
- `CategoryFileUtil`-style helpers classify by extension sets in `FileUtil.MIME`-maps; unknown types fall back to `*/*` open-with.

## App-categorization extras

- `AppTagActivity` (declared) / `AppTagFragment` / `WhatsAppTabAppTagFragment`-family (`.whatsapp` package) — app-tagged views (files grouped by owning app: WhatsApp media, Facebook media, downloads); driven by `provider.dao.{AppTag,AppScanConfig}` DAOs (verified classes).
- `RecentAppsAndFoldersActivity` (`action.Apps`) — launcher entry listing recent apps/folders.

## Evidence

Component/class inventories (`ev_c7d5130a…787a4a` complete app-package search), provider inventory (`ev_a3a0d9fd…b7cc6f` SystemAdContentProvider structure + `ev_1ae31731…c7d767` FileContentProvider — query/bulkInsert/delete), manifest actions (`action.Apps`, `action.FILE_CATEGORY`, ringtone picker — `ev_24480d9e…089c2a7`), strings (category names in 88 locales).

## Unknowns

- Exact extension→category tables (in `FileUtil` maps, partially obfuscated; not exhaustively enumerated).
- Whether category counts come from MediaStore vs the app's own index in all cases (both paths exist in code; selection logic not fully traced).
