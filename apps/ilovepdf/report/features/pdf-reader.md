> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# PDF / TXT / image reader

## How it works
- `ReadPdfActivity` (VIEW/EDIT intent filters for `application/pdf`) hosts
  Nutrient `com.pspdfkit.ui.PdfActivity`: rendering via `libpspdfkit.so`,
  annotation/outline/bookmark UI, print via `PrintActivity`
  (`print_options_dialog`: copies, page size A3/A4/A5/Letter/Legal, range,
  color, orientation, scale), sharing via `DocumentSharingProvider` /
  `PdfDocumentSharingManager`.
- Protected files prompt through `unlock.*`/password dialogs
  (`pdfIsProtected` native probe).
- `TxtReaderActivity` views .txt (incl. OCR output); `ImageActivityCompose`
  (VIEW image/*, `image_activity_nav_graph`) displays images.
- `PdfViewerActivity`/`PdfViewActivityCompose`/`ReadPdfComposeActivity` are the
  in-app post-tool preview screens.
