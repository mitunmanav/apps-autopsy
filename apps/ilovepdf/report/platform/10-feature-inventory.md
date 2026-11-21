> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# 10 — Complete feature inventory & offline/online classification

Evidence: `Tools.java` constructor flags `super(internalName, offlineSupport,
isPremium)` for the 27 tools; app features classified by their implementation
(native/Room vs network service classes). `null` offlineSupport = the tool is
NOT marked local-capable → remote (server) pipeline.

## PDF/Office tools — 27 total

### OFFLINE-capable tools — 7 (`offlineSupport=true`, all non-premium)

| Tool | Local engine (evidence) |
|---|---|
| Merge | Nutrient `PdfProcessorTask` (`MergeLocalTask`) |
| Split | Nutrient `PdfProcessorTask.keepPages` (`SplitLocalTask`) |
| Rotate | K1 `nativeRotate` (`RotateLocalTask`→`PDFNativeLib`) |
| Protect | K1 `nativeProtect` (`ProtectLocalTask`) |
| Repair | K1 `nativeRepair` (`RepairLocalTask`) |
| Image→PDF | `ImageToPdfLocalTask` (Nutrient page assembly) |
| OCR text | Tesseract (`OcrLocalTask`→`OcrManager`, bundled `eng`/`spa` + ~100 downloadable langs) |

Every offline tool *also* has a remote `ilovepdfsdk` task registered, so the
app can fall back to the API (e.g. local engine failure / params the local
path can't express).

### ONLINE-only tools — 20 (`offlineSupport=null`)

| Tool | Remote task → `Tool` |
|---|---|
| Compress | `CompressTask` → COMPRESS |
| Unlock | `UnlockTask` → UNLOCK_PDF (a `UnlockLocalTask` exists but the tool flag marks it remote-classified; local used opportunistically) |
| Watermark | `WaterMarkTask` → WATERMARK |
| Page Numbers | `NumberPagesTask` → NUMBER_PAGES |
| Organize | Nutrient interactive editor + server fallback |
| Edit/Annotate | Nutrient content editor (+server) |
| Sign | SignatureKit UI + server/K1 signing |
| PDF→Image | `PdfToImageTask` → PDF_TO_IMAGE |
| PDF→Word / Excel / PowerPoint | `PdfToOfficeTask` → PDF_TO_OFFICE (3 formats) |
| Word / PowerPoint / Excel→PDF | `OfficeToPdfTask` → OFFICE_TO_PDF (3 formats) |
| Compress Image | `CompressImageTask` → COMPRESS_IMAGE |
| Convert→JPG / From-JPG | `ConvertImageTask` → CONVERT_IMAGE |
| Resize Image | `ResizeImageTask` → RESIZE_IMAGE |
| **OCR PDF** | `OCRToolManagerImpl` premium pipeline |
| Create PDF | `CreatePdfTask` (local Nutrient render — flag is null but execution is on-device) |

Premium flags: **only `OcrPdf` has `isPremium=true`** in `Tools` — other tools
are free-flagged but metered by `ToolLimitsDBModel` counters (free tier) and
feature-level premium checks (`LaunchCloudOnClickOrPremium`,
`RemoteCloudPremiumStrategyImpl`).

## App features — 18 modules (`features/`)

| Offline-capable | Requires network |
|---|---|
| File manager/index, Favorites, Trash | Cloud providers (Drive/Dropbox/OneDrive) |
| Scanner (capture+enhance; metered) | Companion scanner (WS+upload) |
| PDF reader, TXT reader, Image viewer | Login/register/SSO/delete-account |
| Image editor (crop/rotate/filters) | Billing verification, paywall state |
| Widgets (launch shortcuts only) | Support/Freshdesk, NPS, promos |
| Settings, localization | Analytics/events upload |
| Downloads/output browsing (local) | Remote-config experiments, app-update check |
| QR/barcode scan (on-device ML Kit) | Deep links resolving to web features |
