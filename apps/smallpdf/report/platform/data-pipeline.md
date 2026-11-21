# Data Pipeline (input → output)

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

## Remote-tool pipeline `[obs]` (corroborated by `b72`, `zl`, `nu7`, `mu7`)

```
user picks file(s) (SAF / share intent / scan)
  → cl5 file model (as2 word | hr2 excel | ur2 ppt | pr2 image | pdf)
  → upload: i(path,progress) → files.smallpdf.com → file token jm2.d        [obs]
  → task create: POST /v1/tasks/external (mu7{id,type,files:[ns7],options,userType,timeout})
  → poll: GET /v1/tasks/{taskId} until done (retry=5, backoff xz7.a)
  → output: bt7.b file refs → download → local file → Room `documents` row  [inf for save step]
  → result screen (gl5 composable: compressing/converting/merging titles by tool group)
```

- Progress UI: `in2`/`jn2`/`kn2` composables; per-group in-progress string chosen via `j3a`/`v3a`/`l4a` membership `[obs]`.
- Failure → `ao2` error results (`"Unsupported type"`, `"No output file found"` literals observed) `[obs]`.

## Local-tool pipeline `[obs/inf]`

```
file → PDFTron (PDFDoc on libPDFNetC) or direct file op
  → annotate/sign (EditorActivity), rotate/reorder/delete-pages/add-pages (organize UI + PDFTron save),
    rename/delete/share/save-to-device/save-to-cloud ops via gp2 commands (xo2/po2/fp2/ep2/bp2)
  → Room row updated (updated_at, sync_status) → sync workers propagate to cloud when signed in  [inf]
```

## Scanner pipeline `[obs/inf]`

```
CameraX stream → image_processing_util_jni (YUV→RGB)
  → OrtSession on lcnet100*.onnx (em2/td4/aa1 wrappers) → edge/quad detection
  → crop/perspective fix → PDF page(s) via PDFTron (jpg_to_pdf path may instead go remote JPG_TO_PDF task) [partial]
```

## Cloud sync `[obs]`

`DocumentStorageContentSyncWorker` + delete/rename workers reconcile `documents` rows (`cloud_id`, `sync_status`) against `filestorage.smallpdf.com`/`files.smallpdf.com` `[inf]`; `bp2` SaveToCloud ops enqueue same path.

## Verification anchors

- `mu7` literals with `timeout=400`, `retries=5`, UUID task ids `[obs]`.
- `nt7(mt7.i|mt7.e)` = compress option strong/basic `[obs]` (zl:1475).
- `xt7` image options emitted only for `pr2`/`JPG_TO_PDF` `[obs]` (b72:216-224).
