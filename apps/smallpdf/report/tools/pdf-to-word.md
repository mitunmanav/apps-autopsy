# Tool: PDF → Word

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

- Descriptor `o3a.X`: id `"pdf_to_word"`, icon `tool_pdf_word_32`, label `tool_convert_pdf_to_word`, files `1..MAX`, group `p3a` ⊂ `v3a` Convert `[obs]`.
- UI entry: Convert group; `/pdf-to-word` and `/pdf-converter` deep links `[obs]`.
- Params `[inf]`: PDF input → DOCX output; optional OCR for scans (`solid-ocr`/`pdf-ocr` strings in task options `[partial]`).
- Execution `[inf]`: **remote** — `mu7(ju7.w PDF_TO_WORD, [token])` via `b72`/`nu7` pipeline.
- Premium `[inf]`: free-task gated.
- Flow: PDF → upload → `PDF_TO_WORD` → `.docx` download → save/share.
