> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# 08 — How data is processed (end-to-end)

## 1. Input acquisition
`FileSelectionContainerFragment` aggregates sources: device files
(`FileDBModel` index built by `IndexFilesWorker` over MediaStore/filesystem),
favorites/recents (Room), cloud providers (`CloudFilesFragment` →
Drive/Dropbox/OneDrive managers), share intents (`ShareToILovePDFActivity`,
`IntentFilterToolActivity`), camera (scanner) and deep links. Selection
becomes `List<FileModel>` (path/uri + mime).

## 2. Parameter binding
The per-tool options fragment collects user settings →
`ilovepdfsdk.params.*` subclass (e.g. `SplitParams` ranges, `WaterMarkParams`,
`CompressParams` level). Defaults come from `ToolsDefaultParamsImpl`; last
choices persist via `StoreToolsParamsInterface` (Room/DataStore).

## 3. Execution routing (`ToolManagerImpl.executeTool`)
- `offlineSupport`/`CreatePdf` → `PsPdfKitLocalToolManager`: first
  `PdfSdkInitializer.ensureInitialized` (Nutrient license), then the
  matching `LocalToolTask` emits `TaskResult.Progress/Success(paths)`.
  - Nutrient path: open `PdfDocument` (DataProvider) → `PdfProcessorTask`
    (`addNewPage`/`keepPages`/`NewPage.fromPage`) → `processDocument` → file.
  - K1 path: `PDFNativeLib` sets `tempFolder=cacheDir`, calls
    `native{Rotate,Protect,Unlock,Repair,Optimize,ImageToPdf,...}` in
    `libpdf_native_lib.so`→`libk1sdk.so`; int result → `PdfProcessResult`
    (0 ok /10 missing pw /11 wrong pw /else error).
  - OCR path: `OcrManager`→Tesseract (`traineddata` from `res/raw` or
    `OcrDirectoryManager` dir; ≤3 langs from `OcrDBModel`).
- Otherwise → `ILovePdfSDK` remote pipeline (foreground
  `ForegroundToolExecutionService`, dataSync FGS, notification progress):
  `POST /v1/auth` JWT → `GET /v1/start/{tool}` returns `{task,server}` →
  multipart `POST https://<server>/v1/upload` per file (progress via
  `UploadWithProgressRequestBody`; cloud files reuse `server_filename`) →
  `POST .../process` with `Params` JSON → poll `TaskStatus` →
  `GET .../download/<task>` stream → `DownloadManagerImpl` writes file,
  `ZipExtensionsKt` expands zips → `TaskOutput.paths`.
  Steps surfaced to UI: STARTED→UPLOADING→UPLOADED→PROCESSING→PROCESSED→
  DOWNLOADING→DOWNLOADED (8/8).

## 4. Output handling
`FileNameUtil` collision-safe names into the chosen output dir (default or
user-picked `default_output_location`, `MANAGE_EXTERNAL_STORAGE`); results
shown in `OutputFilesActivity` → open in Nutrient `PdfActivity`/
`ImageActivityCompose`/`TxtReaderActivity`, share via
`DocumentSharingProvider`, save-copy to cloud (`SaveCloudFileAsCopyService`),
or re-queue for another tool. Temp files removed via `DeleteFilesUseCase`,
`clearCache`; index refreshed so new files appear in My Files.

## 5. Side-channel data
- Room: files, recents, favorites, trash, tool uses, limits, OCR langs,
  cloud queue, user, scanner docs.
- DataStore/counters: scanner uses, settings.
- Analytics events (`Events`/`Screens`/`ToolName`) → Firebase + mobile
  service; crashes → Crashlytics; queue persistence lets uploads survive
  reboot (`SystemReceiver`/BOOT).
