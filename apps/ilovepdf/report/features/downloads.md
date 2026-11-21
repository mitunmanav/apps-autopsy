> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Downloads & output files

## How it works
- Remote results: `DownloadManagerImpl` streams `downloadFile(url)` → output
  dir; `ZipExtensionsKt` extracts `.zip` multi-results; `FileNameUtil`
  de-dupes names; `TaskOutput.paths` collected → `OutputFilesActivity` /
  `OutputFilesFragment` (grid + open/share/print/save-to-cloud actions).
- `DownloadsFragment`/`DownloadActivity` list fetched files (Room `FileDBModel`
  `is_download` flag + `download` strings); `DownloadFilesActivity` for
  cloud-source fetches. `SaveAsDialog`/`SaveAsActivity` pick target
  (device/Drive/Dropbox/OneDrive).
