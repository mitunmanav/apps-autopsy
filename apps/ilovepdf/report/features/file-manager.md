> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# File manager — My Files / search / favorites / trash

## How it works
- `FilesFragment`/`FileListActivity` + `file_item`, `file_manager` packages:
  lists device PDFs/images indexed by `IndexFilesWorker` (MediaStore + fs scan)
  into `FileDBModel`; folders via `FilesDirectoriesUtil`; `all_files_and_folders`
  scope needs `MANAGE_EXTERNAL_STORAGE`.
- Operations (`storage.manager`, `domain.usecases`): copy/move/rename
  (`FileRenameValidator`), delete→`BinFileDBModel` trash (`TrashFragment`,
  `bin_*` restore/purge), favorites `FavoriteDBModel`, recents
  `RecentFileDBModel`, sort/filter (`sort_options`, `filter_*` views),
  multi-select `ActionMode`/`FilesMode`.
- `SearchFilesActivity`/`search_fragment`: query over indexed names
  (`search_files` strings, `SearchListHeader`).
- Storage overview: `StorageFragment` + `circularchart` lib shows used/free.
- Open actions dispatch by MIME → `ReadPdfActivity`, `ImageActivityCompose`,
  `TxtReaderActivity`, or tool `IntentFilterToolActivity`.
