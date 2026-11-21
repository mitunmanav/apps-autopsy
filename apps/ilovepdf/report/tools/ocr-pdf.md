> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# OCR PDF (premium)

Produce a searchable PDF by adding a text layer.

## How it works
- `Tools.OcrPdf` (`internalName=OCR_PDF`, `isPremium=true`) — gated by the
  premium/limits system (`billing.*`, `ToolLimitsDBModel`).
- `OCRToolManagerImpl` (`presentation.tools.ocr`) orchestrates: page render →
  Tesseract recognition (`OcrManager`, `OcrLanguageManagerImpl`, lang pack
  download `GetOcrLanguagePack`) → rebuild PDF with text layer
  (`OcrDocumentStore`/`StoreOCRUseCase`); progress streamed as `TaskResult`.
- Scanner variant: "Save as PDF and OCR" in the scanner flows into the same
  machinery (`ocr_nav_graph`, `ScannerOcrActivity`).
