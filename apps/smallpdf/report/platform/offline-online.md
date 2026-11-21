# Offline vs Online Execution Classification

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

Classification rule: **remote** = code path creates `mu7`/calls `nu7` or uploads via `files.smallpdf.com`; **local** = PDFTron/file-op only. `[inf]` per tool unless the dispatch was directly observed (`[obs]` noted).

| Tool (id) | Class | Execution |
|---|---|---|
| compress_basic `compress_basic` | `h3a` | **remote** `[obs]` — `zl` builds `mu7(ju7.e COMPRESS, nt7(mt7.e))` |
| compress_strong `compress_strong` | `i3a` | **remote** `[obs]` — same path, `nt7(mt7.i)` |
| pdf_to_word `pdf_to_word` | `o3a` | **remote** `[inf]` — `PDF_TO_WORD` type + same pipeline |
| pdf_to_excel `pdf_to_excel` | `k3a` | **remote** `[inf]` — `PDF_TO_EXCEL` |
| pdf_to_ppt `pdf_to_ppt` | `m3a` | **remote** `[inf]` — `PDF_TO_PPT` |
| pdf_to_jpg `pdf_to_jpg` | `l3a` | **remote** `[inf]` — `PDF_TO_JPG` |
| ocr_pdf `ocr_pdf` | `n3a` | **remote** `[inf]` — OCR requires server (`pdf-ocr`/`solid-ocr` strings; type = PDF_TO_PDF/ocr variant — exact enum `[partial]`) |
| word_to_pdf `word_to_pdf` | `t3a` | **remote** `[obs]` — `as2`→`WORD_TO_PDF` in `b72` |
| excel_to_pdf `excel_to_pdf` | `q3a` | **remote** `[obs]` — `hr2`→`EXCEL_TO_PDF` |
| ppt_to_pdf `ppt_to_pdf` | `s3a` | **remote** `[obs]` — `ur2`→`PPT_TO_PDF` |
| jpg_to_pdf `jpg_to_pdf` | `r3a` | **remote** `[obs]` — `pr2`→`JPG_TO_PDF` + `xt7` options |
| merge `Merge` | `l4a` | **remote** `[inf]` — `MERGE` type exists; merging string used in flow UI |
| annotate `annotate` | `b4a` | **local** `[inf]` — opens `EditorActivity`/PDFTron annotation |
| sign `sign` | `c4a` | **local** `[inf]` — PDFTron signature placement (no SIGN task type consumed locally found; remote `SIGN`/`SIGTRACE` exist for e-sign service flows — in-app sign = `[partial]`) |
| view `view` / read `read` | `g4a`/`f4a` | **local** `[obs]` — viewer/reader (`reflow.js` for read mode) |
| organize `organize` / delete_pages / rotate_pages / add_to_pdf | `m4a`/`k4a`/`n4a`/`i4a` | **local** `[inf]` — PDFTron page ops (remote `DELETE`/`ROTATE`/`SPLIT` types exist server-side but the organize flow operates on the open document) — `[partial]`; a save may upload afterward via sync |
| scan `scan` | `y3a` | **local** `[inf]` — CameraX+ONNX on-device; result becomes a PDF (then optionally synced) |
| gallery `gallery` | `x3a` | **local→remote** `[inf]` — images picked locally; conversion uses `jpg_to_pdf` remote task `[partial]` |
| files `files` | `w3a` | **local** `[inf]` — import/copy into app storage (`vo2` Import) |
| delete `delete` | `a4a` | **local** `[obs]` — `po2` Delete op + delete worker for cloud propagation |
| rename `rename` | `p4a` | **local** `[obs]` — `xo2` Rename + rename worker |
| share `share` | `s4a` | **local** `[obs]` — `fp2` Share via FileProvider |
| save_to_device `save_to_device` | `r4a` | **local** `[obs]` — `ep2` SaveToDevice |
| save_to_cloud `save_to_cloud` | `q4a` | **remote (sync)** `[obs]` — `bp2` SaveToCloud → upload/sync worker |

## Notes

- Network check precedes remote dispatch (`ACCESS_NETWORK_STATE` + connectivity gate in flow VM) `[inf]`; behavior when offline = error result `ao2` `[obs]` (error strings + retry UI).
- Premium tools that are remote decrement free-task counters `[obs]` (see limitations.md).
