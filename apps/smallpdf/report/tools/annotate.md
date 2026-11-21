# Tool: Annotate / Edit PDF

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

- Descriptor `b4a.X`: id `"annotate"`, icon `tool_annotate_32`, label `tool_edit_annotate`, files `1..1`, group `d4a` Edit `[obs]`.
- UI entry: Edit group; `/edit-pdf` deep link; `?tool=edit-pdf` `[obs]`.
- Execution `[inf]`: **local** — routes to `EditorActivity` hosting PDFTron `PDFViewCtrl`/annotation tools on `libPDFNetC`; result saved back to the document. Remote `EDIT`/`FLATTEN` task types exist server-side but no local→remote dispatch for annotate was found `[partial]`.
- Premium `[inf]`: editor actions may be premium-gated per `isPremiumTool` + paywall.
- Input→output: PDF → annotation layer edits → saved PDF (+cloud sync if signed in).
