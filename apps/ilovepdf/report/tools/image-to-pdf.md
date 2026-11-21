> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Image → PDF

Turn JPG/PNG/… into a PDF with page layout options.

## How it works
- `Tools.ImageToPdf` (`internalName=imagePdf`, `offlineSupport=true`, not premium).
- UI: `tools.image_to_pdf.ImageToPdfToolFragment` (`imagetopdf_nav_graph`) →
  `ImageToPdfToolOptionsFragment` → options model `ImageToPdfParams`
  (`lib.imageToPdf`): layout type, page size (`geom.*` A3/A4/A5/Letter/Legal/
  custom w/h), margin, vertical/horizontal align, DPI, rotation.
- Local: `ImageToPdfLocalTask` converts each image via Nutrient `PdfProcessor`
  (`NewPage`/`PageImage`) — images decoded/transcoded by
  `libnative-imagetranscoder.so`/Fresco; TIFF sources via `libtiffconverter.so`.
- Remote: `ImageToPdfTask` (`Tool.IMAGE_TO_PDF`, `ImageToPdfParams`).
- Output can be chained: scanner "Generate PDF" and gallery multi-select both
  feed this pipeline.
