# 13 — PDF reporting

Classes: `helper.GeneratePDF` (`ev_e804d726…`), `activity.PDFReportingActivity`, `activity.PDFSettingActivity`, `model.PDFDataModel`, `model.PDFImageModule`, `helper.PdfLinkInfo`, `helper.OnEmailItemClickListener`.

## Stack

**iText** (`com.itextpdf.text.pdf.*` — `PdfWriter`, `ColumnText`, `Barcode128` imports in app code) + `com.tejpratapsingh.pdfcreator` library.

## `GeneratePDF` methods (summary evidence `ev_e804d726…`)

- `generateCompletePdf` — full work-report PDF
- `generateBefAftPdf` — before/after comparison PDF
- Header/footer generators, image rows, comparison groups
- `PdfLinkInfo` + link extraction from views — clickable links inside generated PDF
- Preview bitmap list creation; logo insertion

## PDF settings (`pdf_*` / `IS_PDF_*` keys)

Toggles: `pdf_title`, `pdf_project_name`, `pdf_supervisor`, `pdf_company_name`, `pdf_remark`, `pdf_report_by`, `pdf_logo`, `pdf_date_time`. Values: `BEF_AFT_PDF_COMPANY_NAME/PERSON_NAME/REPORT_NAME/SUMMARY`.

## QR/barcodes in PDFs

`Barcode128` (iText code-128) + QR template family + ML Kit barcode scanning libs — QR template likely embeds a scannable code on stamps/reports.

## Unknowns

- PDF page templates/layout XML mapping (obfuscated)
