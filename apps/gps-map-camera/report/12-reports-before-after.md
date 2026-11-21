# 12 — Work reports & before/after comparison

## Reporting (`ReportingActivity`, `model.ReportingTagModel`)

- "Work report" / "Start New Report" strings; `camera_reporting` analytics
- Reporting stamp template family (`*_REPORTING` SP keys, `REPORT_TAG/COLOR/BACKGROUND_COLOR_REPORTING`, `is_orientation_label_nc`)
- Person/contact on reports: `PERSON_NAME_REPORTING`, `is_personname`, `CONTACT_NUMBER`
- `REPORTING_SCREEN_*` ad slots (`iSReportingFS`, `iSBefAftReportingFS`, `iSMapdataFS`)

## Before/After (`BefAftReportingActivity`, `BefAftSettingActivity`, `model.ComparisonGroup`)

- Side-by-side before/after photo pairs (`model.PDFImageModule`, `ComparisonGroup` — paired images + captions)
- `BEF_AFT_PDF_*` keys: `COMPANY_NAME`, `PERSON_NAME`, `REPORT_NAME`, `SUMMARY` — report metadata
- `m_pdf_bef_aft_logo` — report logo
- PDF output of comparisons (see 13: `generateBefAftPdf`, image rows + comparison groups)

## Unknowns

- Report storage format (SQLite vs files — obfuscated)
