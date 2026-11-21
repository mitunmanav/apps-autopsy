> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# PDF → Word (.docx)

## How it works
- `Tools.PdfToWord` (`internalName=pdfWord`, remote).
- `PdfToOfficeTask` + `PdfToOfficeParams(output_format=docx)` → server
  conversion (`Tool.PDF_TO_OFFICE`); result docx downloaded by `DownloadManagerImpl`.
- UI: `tools.pdf_to_word.PdfToWordToolFragment`; premium-gated features
  (OCR-to-docx when scanned, `ocr_required` param path).
