# Tool Registry Index

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

Registry = sealed `u4a` descriptors `[obs]`: `w`=id, `a()`=icon, `b()`=file-count `IntRange`, `d()`=MIME set, `e()`=label. Groups = `e4a` subclasses `[obs]`.

| Group | Tool file | id / class | files | exec |
|---|---|---|---|---|
| Compress `j3a` | [compress-basic.md](compress-basic.md) | `compress_basic`/`h3a` | 1..∞ | remote |
| | [compress-strong.md](compress-strong.md) | `compress_strong`/`i3a` | 1..∞ | remote |
| Edit `d4a` | [annotate.md](annotate.md) | `annotate`/`b4a` | 1 | local |
| | [sign.md](sign.md) | `sign`/`c4a` | 1 | local |
| View `h4a` | [view.md](view.md) | `view`/`g4a` | 1 | local |
| | [read.md](read.md) | `read`/`f4a` | 1 | local |
| Organize `o4a` | [merge.md](merge.md) | `Merge`/`l4a` | 2..∞ | remote |
| | [organize.md](organize.md) | `organize`/`m4a` | 1 | local |
| | [delete-pages.md](delete-pages.md) | `delete_pages`/`k4a` | 1 | local |
| | [rotate-pages.md](rotate-pages.md) | `rotate_pages`/`n4a` | 1 | local |
| | [add-to-pdf.md](add-to-pdf.md) | `add_to_pdf`/`i4a` | 1 | local (hidden from home list `[obs]`) |
| From-PDF `p3a` | [pdf-to-word.md](pdf-to-word.md) | `pdf_to_word`/`o3a` | 1..∞ | remote |
| | [pdf-to-excel.md](pdf-to-excel.md) | `pdf_to_excel`/`k3a` | 1..∞ | remote |
| | [pdf-to-ppt.md](pdf-to-ppt.md) | `pdf_to_ppt`/`m3a` | 1..∞ | remote |
| | [pdf-to-jpg.md](pdf-to-jpg.md) | `pdf_to_jpg`/`l3a` | 1..∞ | remote |
| | [ocr-pdf.md](ocr-pdf.md) | `ocr_pdf`/`n3a` | 1..∞ | remote |
| To-PDF `u3a` | [word-to-pdf.md](word-to-pdf.md) | `word_to_pdf`/`t3a` | 1..∞ | remote |
| | [excel-to-pdf.md](excel-to-pdf.md) | `excel_to_pdf`/`q3a` | 1..∞ | remote |
| | [ppt-to-pdf.md](ppt-to-pdf.md) | `ppt_to_pdf`/`s3a` | 1..∞ | remote |
| | [jpg-to-pdf.md](jpg-to-pdf.md) | `jpg_to_pdf`/`r3a` | 1..∞ | remote |
| Create `z3a` | [scan.md](scan.md) | `scan`/`y3a` | 0-input (`t4a`) | local |
| | [gallery.md](gallery.md) | `gallery`/`x3a` | 0-input (`t4a`) | local→remote conv |
| | [files.md](files.md) | `files`/`w3a` | 1..∞ | local import |
| (context) | [delete.md](delete.md) | `delete`/`a4a` | 1..∞ | local |
| | [rename.md](rename.md) | `rename`/`p4a` | 1 | local |
| | [share.md](share.md) | `share`/`s4a` | 1..∞ | local |
| | [save-to-cloud.md](save-to-cloud.md) | `save_to_cloud`/`q4a` | 1..∞ | sync |
| | [save-to-device.md](save-to-device.md) | `save_to_device`/`r4a` | 1..∞ | local |

MIME sets `[obs]`: PDF-only for from-PDF/organize tools; office/image MIME unions via `hr2`/`pr2`/`ur2`/`as2` sets for to-PDF tools; wildcard for delete/share/save ops.
