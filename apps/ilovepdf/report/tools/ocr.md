> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# OCR — extract text (image scan)

Recognize text in images/PDFs on-device.

## How it works
- `Tools.Ocr` (`internalName=ocr`, `offlineSupport=true`, not premium).
- `OcrLocalTask` → `OcrManagerImpl` (`presentation.utils`) → Tesseract
  (`res/raw/eng.traineddata`, `spa.traineddata` bundled; more languages
  downloadable per `res/raw/ocr_languages.csv` — ~100 langs with MD5/script
  tag; stored via `OcrDirectoryManager`, selection capped at 3 in
  `OcrLanguageActivity`, persisted in `OcrDBModel`).
- Output modes (strings): copy text, save .txt (opened in `TxtReaderActivity`),
  or forward to create-PDF.
- Distinct from **OCR PDF** (premium, `Tools.OcrPdf`/`OcrToolManagerImpl`)
  which writes an invisible text layer back into the PDF.
