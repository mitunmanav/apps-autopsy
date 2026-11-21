# Tool: Gallery → PDF

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

- Descriptor `x3a.Z`: id `"gallery"`, icon `tool_scan_from_gallery_32`, label `tool_create_from_gallery`, `t4a` subclass (launches picker, no preset files), group `z3a` `[obs]`.
- Deep link: `/add-img` → `x3a.Z` `[obs]`.
- Execution `[inf]`: pick images locally → conversion to PDF — via the same pipeline as `jpg_to_pdf` (remote `JPG_TO_PDF` task) `[partial]`; local PDFTron image-insert possible but dispatch not directly observed.
- Premium `[inf]`: free-task gated when converted remotely.
- Input→output: gallery images → PDF.
