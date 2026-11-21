> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Organize PDF

Reorder, rotate, duplicate and delete pages visually.

## How it works
- `Tools.Organize` (`internalName=ORGANIZE`, remote-classified; editing ops are metered by the limits system).
- UI: `tools.organize.OrganizeToolFragment` → Nutrient's page-editor UI
  (`com.pspdfkit.ui.thumbnail`/document editor); changes are committed with a
  `PdfProcessorTask` (remove/move/rotate/duplicate pages) — same engine as the
  local merge/split tasks. K1 `k1_organize`/`k1_duplicatepage` exist as a
  native alternative for headless ops.
- Free tier limits enforced via `ToolLimitsDBModel`/premium check.
