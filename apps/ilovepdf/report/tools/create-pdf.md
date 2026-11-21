> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Create PDF

Author a PDF from scratch (text/template/canvas).

## How it works
- `Tools.CreatePdf` (`internalName=CREATE_PDF`, not premium).
- `CreatePdfTask` (`presentation.tools.local.task.CreatePdfTask`) executed via
  `PsPdfKitLocalToolManager.executeCreatePdf` — first calls
  `PdfSdkInitializer.ensureInitialized` (Nutrient license check); failure →
  `createPdfSdkInitializationException`.
- Templates/assets: `assets/templates/*.html` (`create_pdf_template_a4.html`,
  `default.html`), `document_editor_templates`, `res/raw/{a4,letter}_blank.pdf`,
  `pdf_templates` docs + `pdfTemplates` WebView assets — filled by
  `CreatePDFViewModel`/`CreatePDFFileViewModel` (`ui.activity.createpdf`),
  then flattened through the Nutrient processor into the final file.
