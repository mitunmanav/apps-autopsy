> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# PDF → PowerPoint (.pptx)

## How it works
- `Tools.PdfToPowerpoint` (`internalName=pdfPowerpoint`, remote).
- `PdfToOfficeTask` + `output_format=pptx`; each PDF page becomes a slide
  (text/images extracted). UI `tools.pdf_to_powerpoint.*`.
