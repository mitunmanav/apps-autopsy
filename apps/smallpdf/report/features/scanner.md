# Feature: Document Scanner

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

- `ScannerActivity` `[obs]` + `CAMERA` permission + camera `uses-feature` `[obs]`.
- Pipeline `[inf]`: CameraX `ImageAnalysis`/`Preview` → `ImageProcessingUtil` JNI (YUV→bitmap) → `OrtSession` (`ai.onnxruntime` via `em2`/`td4`/`aa1`) on `lcnet100_h_e_bifpn_256_fp32.muladd.onnx` → document quad detection → crop/perspective-correct → assemble PDF pages (PDFTron) → import to library.
- Kill switch `[obs]`: remote config `scanner_detection_kill_switch`.
- `y3a` (camera) and `x3a` (gallery) are `t4a` zero-input tools launching this flow / picker `[obs]`.
- `[partial]`: detection post-processing details (quad refinement thresholds) not recovered; multi-page batch UI `[inf]` from file-count model.
