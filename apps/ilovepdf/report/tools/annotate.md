> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Edit PDF — annotate, draw, images, redact

Rich PDF editing powered by Nutrient.

## How it works
- `Tools.Annotate` (`internalName=editPdf`).
- UI: `tools.annotate.AnnotateToolFragment` hosts `com.pspdfkit`
  `PdfActivity`/content-editor — draw/ink (`libink.so` strokes), text, shapes,
  stamps, images; `AnnotateViewModel`, `tools.annotate.content`,
  `annotation.*` helpers.
- Redaction: `features.redaction` + `redaction_view` strings — Nutrient
  redaction annotations applied then flattened on save (content actually
  removed, not just covered).
- Saving writes back through PSPDFKit document save + app `PdfUtil`/`ZipUtil`.
