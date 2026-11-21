# 17 — Providers, Databases & IPC Surface

## Content providers (8)

| Provider | Authority / detail | Exported | Gate |
|---|---|---|---|
| `FileExplorerFileProvider` | `…globalFileexplorer.myprovider`, `res/xml/file_paths.xml` | no | `grantUriPermissions` per-intent |
| `FileContentProvider` | `…dao.filecontent.provider` | **yes** | `ACCESS_FILE_CONTENT` (`signatureOrSystem`) |
| `SearchExportProvider` | `…provider.searchexport` | **yes** | **none declared** |
| `SystemAdContentProvider` | `…systemAd.splashAd` | **yes** | **none declared** |
| `gms.ads.MobileAdsInitProvider` | `…mobileadsinitprovider` | no | — |
| `androidx.startup.InitializationProvider` | `…androidx-startup` | no | WorkManager init |
| `com.facebook.ads.AudienceNetworkContentProvider` | `…AudienceNetworkContentProvider` | no | — |
| `xiaomi.miglobaladsdk.SdkInitProvider` | `…miglobaladsdk.SdkInitProvider` | no | — |

(`DirParseService` is a bound service gated by `DIRPARSE` permission — listed under services, doc 02.)

`FileContentProvider` (`ev_1ae31731…c7d767`): `query/insert/delete/bulkInsert/update` + `a()` UriMatcher helper — the master content gateway over the Room/DAO layer.
`SystemAdContentProvider` (`ev_a3a0d9fd…b7cc6f`): `UriMatcher a`, standard CRUD + `a` inner class — splash-ad metadata exposed **without a declared permission** (doc 23).

## Sub-providers (16) — `provider.dao`/`SubProviders`

`AppInfoSubProvider`, `AppScanConfigSubProvider`, `AppTagSubProvider`, `BlackDirInfoSubProvider`, `CategorySortSubProvider`, `ContentTagSubProvider`, `DirParseSubProvider`, `FileGroupSubProvider`, `FileItemSubProvider`, `ResponseCacheSubProvider`, `StickerGroupItemSubProvider`, `StickerItemSubProvider`, `StickerLikeSubProvider`, `UploadItemSubProvider`, `VersionInfoSubProvider`, `VideoItemSubProvider` — one CRUD surface per table (black-dir = exclusion lists; content-tag = favorites/labels; sticker* = sticker pack store; response-cache/upload-item/video-item = cloud/video caches).

## Room DAO layer

`com.android.fileexplorer.provider.dao` (verified tree: `AppTag`, `CategorySort`, `ContentTag`, `FileGroup`, `FileItem`, `PhoneFileItem`, `Sticker`×3, `parse.DirParseDao`, `scan.{AppInfo,AppScanConfig,BlackDirInfo,VersionInfo}`, `video.{ResponseCache,UploadItem,VideoItem}`, `videoposition.VideoPositionBeanDao`)… Persisted via Room (`androidx.room.MultiInstanceInvalidationService` declared; `VersionInfo` sub-provider manages schema version).

## DirParseService — signature-gated indexer

`service.DirParseService` (`ev_542f2e23…052882`, 13 methods): bound service (`onBind`→`c$a` binder) exposing `f(List<String>,int,d)`/`g(…)` directory-parse operations with callback `d`; `b()` gate; helpers `a`/`e` (`service.e`, `service.a` obfuscated) — lets *other system-signed apps* ask Mi File Manager to index directories into its DB. Export protected by `DIRPARSE` signature|system permission.

## SearchExport

`SearchExportProvider` — shares search results (authority `searchexport`) with launcher/search hosts; **no permission** declared → any app can query result metadata (doc 23).

## Evidence

`ev_1ae31731…c7d767`, `ev_a3a0d9fd…b7cc6f`, `ev_542f2e23…052882`, manifest (`ev_24480d9e…089c2a7`), provider/dao class lists (`ev_c7d5130a…787a4a`).

## Unknowns

- Actual DB schema (tables/columns) — Room entities not exhaustively enumerated; sub-provider names imply shape.
- Whether `SearchExportProvider`/`SystemAdContentProvider` implement caller-UID checks in code compensating for missing manifest permissions — `query()` bodies not fully decompiled.
- `DirParseService` IPC protocol details (AIDL vs callback objects — appears callback-based `d`).
