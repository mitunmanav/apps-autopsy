> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# 06 — Persistence

## Room database (`com.android.ilovepdf.database`)

Entities (`database.models`): `FileDBModel`, `FileItemInfoDBModel`,
`RecentFileDBModel`, `ScannerDocumentDBModel`, `ScannerPageDBModel`,
`OcrDBModel`, `BinFileDBModel` (trash), `FavoriteDBModel`,
`RecentToolDBModel`, `ToolListEntryDBModel`, `ToolUsesDBModel`,
`ToolLimitsDBModel` (free-tier counters), `SettingsDBModel`,
`UpdateCloudFileQueueDBModel`, `UploadCloudFileQueueDBModel` (resumable
cloud queue), `UserDBModel`, `CloudTypeDBModel`.

Infrastructure: `database.converter` (Room type converters), `database.mapper`,
`database.store`, `database.callback`.

## Workers

`IndexFilesWorker` (periodic MediaStore/filesystem indexing into `FileDBModel`),
`RecentFilesWorker`, cloud upload/download services + `CloudQueueManagerImpl`
persist queue so transfers resume (BOOT_COMPLETED receivers).

## Preferences

`SettingsDBModel` + DataStore (`libdatastore_shared_counter`); tool params via
`StoreToolsParamsInterface`/`LocalToolsDataSource` (restore-params toolbar);
OCR language selection (`OcrDBModel`, `OcrLanguageActivity`, max 3).

## On-disk layout (typical)

- `files/` — user outputs, cloud queues (FileProvider `files` scope)
- `cache/` — K1 temp folder (`PDFNativeLib.setTempFolder(cacheDir)`), OCR work dir (`OcrDirectoryManager`), image pipeline
- External storage — user-visible output (scoped `MANAGE_EXTERNAL_STORAGE`), `iLovePDF` folder shortcut
