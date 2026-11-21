> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Split PDF

Extract ranges/fixed sizes/remove ranges, or split by file size.

## How it works
- `Tools.Split` (`internalName=SPLIT`, `offlineSupport=true`, not premium).
- UI: `tools.split.SplitToolFragment` → options choose one of three modes;
  results previewed in `SplitResultsActivity`.
- `SplitLocalTask` (Nutrient) implements all modes:
  - **By ranges** — `getRanges(stringRange)` parses the user's range text
    (e.g. "1-3,5") into page pairs → `getSplitTaskToProcess` =
    `PdfProcessorTask.fromDocument(doc).keepPages(range)` per range → one file
    per range.
  - **Fixed ranges** — `getFixedRanges(pageCount, fixedRange)` tiles the doc.
  - **Remove ranges** — `getRemoveTaskToProcess` removes pages instead.
  - **Merge-back path** — `getMergeTaskToProcess(paths)` reassembles selected
    outputs via `addNewPage(NewPage.fromPage(...))`; `deleteFilesAfterMerge`
    cleans intermediate files via `DeleteFilesUseCase`.
- `SplitBySize` is a separate `Tools` value and fragment (`tools.splitbysize`)
  that splits the input into chunks under a size limit (UI side; execution via
  the same split machinery).
- `SplitParams` covers the remote equivalent (`ilovepdfsdk.params.SplitParams`,
  `SplitMode`, `RangeMode`).
