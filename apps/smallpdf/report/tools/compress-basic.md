# Tool: Compress (Basic)

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

- Descriptor `h3a.X`: id `"compress_basic"`, icon `tool_compress_32`, label `tool_compress_basic`, files `1..MAX`, group `j3a` `[obs]`.
- UI entry: home Compress group; deep link `/compress-pdf` (`zra`); `?tool=compress-pdf` (`w00`) `[obs]`.
- Params `[obs]`: single/multiple PDFs; option `nt7(mt7.e)` = basic/auto strength; `timeout=400`, `priority=0`.
- Execution `[obs]`: **remote** — `zl` builds `mu7(uuid, ju7.e COMPRESS, [ns7(fileToken)], nt7(mt7.e), …, lu7 free|pro, 400)` → `POST /v1/tasks/external` → poll `GET /v1/tasks/{id}` → download output → save.
- Premium `[inf]`: consumes a free task unless pro (`isPremiumTool` + `lu7` on request).
- Flow: pick PDF(s) → upload `files.smallpdf.com` → COMPRESS task → smaller PDF → `documents` row.
