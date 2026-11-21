# Feature: Document scanner

## Delegation to GMS ML Kit

`kjb` builds the scan intent directly:

- `com.google.android.gms.mlkit.ACTION_SCAN_DOCUMENT` — **scanning is the
  GMS ML Kit Document Scanner**, launched as an activity result; output via
  `extra_scanning_result` into `DocumentScannerSaveFragment` (`kjb`).
- Runtime gates (strings in `kjb`):
  - `Device RAM is below the minimal requirement for this feature: 1.7 GB`
  - `Feature not available in the current version of the Google Play services`
  - `Failed to install MlKit scan module.` — dynamic feature install via
    Play Feature Delivery (`kef`/`hxz` `requestDownloadableFeatureFuture`)
- `kef` — `GmsDocScanDelAct` (GMS delegated activity), language-model reinstall
  (`Reinstall language failed`), install-session bookkeeping
  (`installation failed`, `Cancel install failed`, `Get active sessions failed`).

## On-device OCR assets (bundled in base.apk `assets/`)

Independent of the GMS scanner UI, the app carries a full on-device pipeline:

- `document_detection.tflite` — page-boundary detection
- ML Kit **taser** text-detection models
- **GOCR** Latin ConvNeXt recognition model
- **Script-identification** models
- **Layout-analysis** models

These feed OCR/text-extraction for in-app features (smart search indexing,
smart descriptions) — not the user-facing scan UI, which is GMS-hosted.
Supporting classes: `uhy`,`rch`,`kee`,`lng`,`uxm`,`jxh`,`hvi`.

## Save flow

`DocumentScannerSaveFragment` → pick destination + filename → PDF write via
storagelib (`extra_scanning_result` pages → PDF).

## Manifest deps (verified)

- `com.google.mlkit.vision.DEPENDENCIES` meta-data value:
  `document_ui,custom_ica,ica,tflite_dynamite` — dynamite module list.
- **`GmsDocumentScanningDelegateActivity` is declared in this manifest** —
  the GMS-hosted scan UI entry, conclusively confirming the delegation design.
- Firebase component registrars: `TextRegistrar` (OCR), `ThinLabelRegistrar` +
  `CustomLabelRegistrar` (image labeling) — bundled ML Kit text+label pipelines.
- `uses-feature android.hardware.npu` required=false — optional NPU offload.

## Evidence / unknowns

`kjb`,`kef` strings; assets list; manifest deps. Unresolved: which features
consume the bundled OCR models vs GMS OCR; scan quality params; page-limit.
