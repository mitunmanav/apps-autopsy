# Tool: Merge PDF

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

- Descriptor `l4a.X`: id `"Merge"`, icon `tool_merge_32`, label `tool_organize_merge`, files `2..MAX` (only tool requiring ≥2 inputs), group `o4a` `[obs]`.
- UI entry: Organize group; `/merge-pdf` deep link; `?tool=merge-pdf`/`smerge` slug `[obs]`.
- Params `[inf]`: ordered list of ≥2 PDFs → single merged PDF.
- Execution `[inf]` (remote type `ju7.MERGE` exists; flow shows `merging_title`): **remote** — files uploaded, `mu7(MERGE, [tokens])` → poll → merged PDF.
- Premium `[inf]`: counts toward free-task quota.
- Note: a local PDFTron merge is technically possible but no local-merge call site was found → `[partial]`.
