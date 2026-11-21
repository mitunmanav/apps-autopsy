> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Merge PDF

Combine multiple PDFs into one.

## How it works
- `Tools.Merge` (`internalName=MERGE`, `offlineSupport=true`, not premium).
- UI: `tools.merge.MergeToolFragment` (`tool_merge_nav_graph`) → merge options
  (`presentation.tools.merge.options`), file picker (`FileSelectionFragment`).
- `ToolManagerImpl` routes to `MergeLocalTask`
  (`presentation.tools.local.task.MergeLocalTask`), which opens each input via
  `DataProviderOpenDocument`, calls `getTaskToProcess(documents)` →
  `PdfProcessorTask.empty()` then `addNewPage(NewPage.fromPage(doc, page))` for
  every page of every source (Nutrient PSPDFKit `PdfProcessorTask`), processes
  into the output path, reports progress via `TaskResult`.
- A remote path (`ilovepdfsdk.domain.tasks.MergeTask` → `Tool.MERGE`) exists for
  the server pipeline; params class `MergeParams`.
- Password-protected inputs are checked (`pdfIsProtected`/`passwordIsCorrect`
  native calls); missing/wrong password → typed errors (`PasswordNeededException`).
- Output naming via `FileNameUtil` (collision-safe); temp files cleaned via
  `DeleteFilesUseCase`/`clearCache` flow.
