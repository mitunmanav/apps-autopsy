# Feature: PDF Editor

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

- `EditorActivity` `[obs]` (not exported; launched from flows) hosts PDFTron tooling on `libPDFNetC`.
- Capabilities `[inf]` from `com.pdftron.pdf.*` classes present: `PDFViewCtrl` rendering, annotation tools (ink/highlight/text/stamp), signature capture, page ops (insert/delete/rotate/reorder via `Page`/`PDFDoc` APIs) — covering tools `b4a` annotate, `c4a` sign, `f4a`/`g4a` view/read, and `o4a` organize group.
- `assets/reflow.js` `[obs]` → reader reflow mode for `f4a` `[inf]`.
- Save path `[inf]`: edited `PDFDoc` → file → `yo2` ReplaceContent / `ep2` SaveToDevice → Room update → optional cloud sync.
- `[unk]`: which editor sub-screens are Compose vs PDFTron-native views; exact tool→editor-mode wiring per `u4a` (dispatch through flow VM `[partial]`).
