> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# PDF/Office tools — index

Every tool is a constant of the sealed class `presentation.tools.Tools`:
`internalName`, `offlineSupport` (true = can run fully on-device),
`isPremium` (true = paywalled). Two engines execute them:

- **LOCAL** — `LocalToolManager` → `*LocalTask` → Nutrient `PdfProcessorTask`
  and/or `PDFNativeLib`→`libk1sdk.so` (K1) and Tesseract for OCR.
- **REMOTE** — `ilovepdfsdk` → `api.ilovepdf.com/v1`
  (auth → start/{tool} → upload → process → download).

| Tool | internalName | Engine (observed) | offline | premium |
|---|---|---|---|---|
| [Merge PDF](merge.md) | MERGE | local Nutrient + remote | ✔ | – |
| [Split PDF](split.md) (incl. by-size) | SPLIT | local Nutrient + remote | ✔ | – |
| [Compress PDF](compress.md) | COMPRESS | remote (K1 optimize local-capable) | – | – |
| [Rotate PDF](rotate.md) | ROTATE | local K1 `nativeRotate` + remote | ✔ | – |
| [Protect PDF](protect.md) | PROTECT | local K1 `nativeProtect` + remote | ✔ | – |
| [Unlock PDF](unlock.md) | UNLOCK | local K1 `nativeUnlock` + remote | – | – |
| [Repair PDF](repair.md) | REPAIR_PDF | local K1 `nativeRepair` + remote | ✔ | – |
| [Organize PDF](organize.md) | ORGANIZE | Nutrient editor + remote | – | – |
| [Edit PDF + redact](annotate.md) | editPdf | Nutrient content editor | – | – |
| [Sign PDF](sign.md) | sign | SignatureKit + K1 `k1_pdfsig` (+NFC keys) | – | – |
| [OCR PDF](ocr-pdf.md) | OCR_PDF | premium pipeline | – | ✔ |
| [OCR (extract text)](ocr.md) | ocr | local Tesseract | ✔ | – |
| [Watermark PDF](watermark.md) | WATERMARK | remote | – | – |
| [Page Numbers](page-numbers.md) | pageNumber | remote | – | – |
| [Image → PDF](image-to-pdf.md) | imagePdf | local (Nutrient/K1 img2pdf) + remote | ✔ | – |
| [PDF → JPG/image](pdf-to-image.md) | pdfJpg | remote (+K1 `pdf2img`) | – | – |
| [PDF → Word](pdf-to-word.md) | pdfWord | remote | – | – |
| [PDF → Excel](pdf-to-excel.md) | pdfExcel | remote | – | – |
| [PDF → PowerPoint](pdf-to-powerpoint.md) | pdfPowerpoint | remote | – | – |
| [Word → PDF](word-to-pdf.md) | wordPdf | remote | – | – |
| [PowerPoint → PDF](powerpoint-to-pdf.md) | powerpointPdf | remote | – | – |
| [Excel → PDF](excel-to-pdf.md) | excelPdf | remote | – | – |
| [Compress image](compress-image.md) | COMPRESS_IMAGE | remote | – | – |
| [Convert → JPG](convert-to-jpg.md) | CONVERT_TO_JPG | remote (TIFF libs local-capable) | – | – |
| [Convert from JPG](convert-from-jpg.md) | CONVERT_FROM_JPG | remote | – | – |
| [Resize image](resize-image.md) | RESIZE_IMAGE | remote | – | – |
| [Create PDF](create-pdf.md) | CREATE_PDF | local (`CreatePdfTask` + templates) | – | – |
