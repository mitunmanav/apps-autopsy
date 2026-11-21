# Tool: OCR PDF (searchable)

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

- Descriptor `n3a.X`: id `"ocr_pdf"`, icon `tool_ocr_32`, label `tool_convert_from_pdf_to_ocr_pdf`, files `1..MAX`, group `p3a` `[obs]`.
- UI entry: Convert group (from-PDF). Deep link via `?tool=pdf-ocr`/`solid-ocr` `[obs]`.
- Execution `[inf]`: **remote** — server-side OCR (task type = `PDF_TO_PDF`/ocr variant; exact `ju7` mapping `[partial]`); on-device ONNX model is for scanner edge detection, not text OCR.
- Premium `[inf]`: free-task gated.
- Input→output: scanned PDF → upload → searchable PDF out.
