> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Excel → PDF

## How it works
- `Tools.ExcelToPdf` (`internalName=excelPdf`, remote).
- `OfficeToPdfTask` with xls/xlsx input → PDF. UI `tools.excel_to_pdf.*`.
