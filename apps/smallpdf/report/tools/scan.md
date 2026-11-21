# Tool: Scan → PDF

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

- Descriptor `y3a.Z`: id `"scan"`, icon `tool_scan_from_camera_32`, label `tool_create_from_scan`, subclass of `t4a` (no preselected files), group `z3a` Create `[obs]`.
- UI entry: Create group; `/scanner` deep link; scan widget `[obs]`.
- Execution `[inf]`: **local** — `ScannerActivity`: CameraX preview → `image_processing_util_jni` → ONNX `lcnet100…onnx` edge/quad detection (`em2`/`td4`/`aa1`) → crop/perspective → PDF page assembly (PDFTron) → save. `scanner_detection_kill_switch` remote flag can disable detection `[obs]`.
- Premium `[inf]`: scanning itself ungated; saved PDF counts as a document; any conversion after is remote.
- Input→output: camera frames → detected doc → multi-page PDF.
