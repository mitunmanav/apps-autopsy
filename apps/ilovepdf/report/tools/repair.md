> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Repair PDF

Recover a damaged/corrupted PDF.

## How it works
- `Tools.RepairPdf` (`internalName=REPAIR_PDF`, `offlineSupport=true`).
- `RepairLocalTask` → `PDFNativeLib` → `nativeRepair(input, output)` (K1 SDK
  repairs xref/object streams). Errors surface through `PdfProcessResult`.
- Remote: `RepairPdfTask` (`Tool.REPAIR_PDF`, `RepairPdfParams`).
- UI: `tools.repair.RepairToolFragment` (`tools_repair_nav_graph`); result
  preview via `RepairResultActivity`.
