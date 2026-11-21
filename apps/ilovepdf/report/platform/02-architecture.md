> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# 02 — Architecture

## Layers

```
UI (Compose screens + classic Fragments, Nav component, Glance widgets)
  → presentation.viewmodel.* (ViewModels, Action/Event MVI-style)
  → presentation.tools.* / service.* / cloud.* (managers, executors, services)
  → engines:
      local  : PDFNativeLib → libpdf_native_lib.so → libk1sdk.so (K1 SDK)
               Nutrient/PSPDFKit (libpspdfkit.so) for render/edit/merge/split
               Tesseract traineddata for OCR
      remote : com.ilovepdf.ilovepdfsdk → api.ilovepdf.com/v1
  → persistence: Room (database.*), DataStore, filesystem
  → DI: Koin (com.android.ilovepdf.di.*ModuleKt)
```

## Tool execution pipeline

Every user-facing "tool" is a constant of the sealed class
`com.android.ilovepdf.presentation.tools.Tools` (27 values, each carrying
`internalName`, `offlineSupport`, `isPremium`).

1. `ToolsUIModelCatalog`/`ToolsDefaultParamsImpl` build per-tool default params.
2. `ToolManagerImpl.executeTool(tool, params)` routes:
   - `LocalToolManager` (`PsPdfKitLocalToolManager`) — checks `PdfSdkInitializer`
     (Nutrient license init), then finds the matching `LocalToolTask` from a
     DI-registered list; emits `TaskResult` progress on a Kotlin Flow.
   - `OCRToolManager` for the premium OCR pipeline.
   - `ILovePdfSDK` (remote) → `TaskExecutorImpl` → one of 16 `domain.tasks.*`
     tasks → `ILovePDFRepositoryImpl` → Retrofit `ILovePDFApiService`.
3. `ToolExecutionService` / `ForegroundToolExecutionService` host the work so
   processing survives config changes; `ToolTaskReceiver` receives results.
4. `StoreToolsParamsInterface` persists last-used params per tool.

### Local task registry (`LocalToolModuleKt`)

`MergeLocalTask` (Nutrient), `RotateLocalTask` (K1 `nativeRotate`),
`SplitLocalTask` (Nutrient), `ImageToPdfLocalTask` (Nutrient),
`ProtectLocalTask` (K1 `nativeProtect`), `OcrLocalTask` (OcrManager/Tesseract),
`RepairLocalTask` (K1 `nativeRepair`), `UnlockLocalTask` (K1 `nativeUnlock`).

### Remote task registry (`TaskExecutorImpl.toolsCanExecute`)

Compress, Merge, ImageToPdf, PdfToImage, PdfToOffice, OfficeToPdf, NumberPages,
Unlock, Protect, WaterMark, Rotate, Split, CompressImage, ConvertImage,
ResizeImage, RepairPdf — i.e., most tools exist in **both** engines; the app
chooses local when `offlineSupport`/params allow and falls back to the API
(advanced options like watermark/office conversion are remote-only).

## Local engine details (`PDFNativeLib`)

- `System.loadLibrary("pdf_native_lib")`, `setLicenseKey("")`, temp folder = `cacheDir`.
- `ProcessResult` codes: `0` success, `10` MISSING_PASSWORD, `11` WRONG_PASSWORD,
  other → `Error(message, code)` mapped to `PdfProcessResult` sealed class.
- Producer string written into output PDFs: `"iLovePDF"`.

## App-side helpers worth noting

- `com.android.ilovepdf.lib.geom.*` — page sizes (A3/A4/A5/Letter/Legal/Custom)
- `com.android.ilovepdf.lib.imageToPdf.ImageToPdfParams` — layout/margin/align/DPI/rotation
- `IndexFilesWorker`, `RecentFilesWorker` (WorkManager) — filesystem indexing
- `CloudQueueManagerImpl` — persisted cloud upload/download queue (Room)
