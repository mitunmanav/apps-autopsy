> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Document scanner

Camera → capture → enhance → PDF/image/OCR output.

## How it works
- `ScannerActivity` (`ui.activity.new_scanner`, CAMERA permission) built on
  Genius Scan SDK (`com.geniusscansdk`, `libgssdk-core.so`,
  `gssdk_*` strings: auto-capture, multi-page, filters).
- Pages stored as `ScannerDocumentDBModel`/`ScannerPageDBModel` (Room) via
  `ScannerRepositoryImpl`/`LocalScannerDataSource`/`ScannerStore` — the scanner
  gallery is persistent across sessions.
- `PageEnhancementActivity` + `libaire.so`/`libaire_filters.so`,
  `libnative-filters.so`: crop, rotate, B&W/magic/color filters.
- Output modes (strings): **Save as PDF** (ImageToPdf pipeline),
  **Save as PDF + OCR** (premium `OcrPdf` path), **Save as image**,
  **Generate/download PDF** (`scanner.*` strings). Share/save via
  `PdfUtil`/`SaveAs` flows.
- Free usage metered: `GetScannerUsesLimitUseCase` /
  `IncrementScannerUsesUseCase` (DataStore counter) — paywall after limit.
