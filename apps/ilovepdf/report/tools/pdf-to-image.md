> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# PDF → JPG / image

Rasterize pages to JPG, or extract embedded images.

## How it works
- `Tools.PdfToImage` (`internalName=pdfJpg`, remote `Tool.PDF_TO_IMAGE`).
- `PdfToImageTask`/`PdfToImageParams`: mode `pages` (each page → JPG, zipped on
  server, unzipped by `ZipExtensionsKt` into `TaskOutput.paths`) or `extract`
  (pull embedded images); JPEG quality option.
- K1 `k1_pdf2img` (`nativePdfToImage`) is the native primitive used for local
  previews/thumbnails; the user tool is remote.
- UI: `tools.pdftojpg.*` (`tool_pdfjpg_nav_graph`), results in `OutputFilesActivity`.
