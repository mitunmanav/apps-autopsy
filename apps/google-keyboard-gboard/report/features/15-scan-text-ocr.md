# Scan Text (OCR) & Lens-style text selection

## Scan Text

Camera-based OCR built into the keyboard: "Scan Text" / "Scan Text with OCR" (`0x7f14021c/0x7f14084d-84f`).

- `libs.search.ocr.{OcrEntryPointKeyboard, IOcrEntryPointOpenableExtension, GraphicOverlay}` — an OCR keyboard entry point + camera overlay (`GraphicOverlay`).
- `defpackage.ocr` — obfuscated OCR engine class.
- `enable_ocr`, `enable_camera_permission_overlay`, `ocr`, `ocr_capture` — flag + capability tags.
- Native OCR inside `libintegrated_shared_object.so` (`research/ocr/tensorflow/ops/key_value_processor.h`, `research/ocr/util/registerer_helper.h`) — TF-based text spotting.
- CAMERA permission; "Gboard needs access to the camera in order to enable scan text", "Scan text feature is disabled".
- `image_processing_util_jni`, `filterframework_jni`, `surface_util_jni`, `libgraphics-core.so` — image pipeline (frame → preprocessed → recognizer).

## Lens-style text selection

- `libraries.inputmethod.lens.selection.ui.TextSelectionView` — Lens-like drag-to-select text on camera frames.
- `extracttextview.{ExtractTextLayout, EmojiExtractTextLayout, MaterialExtractButton}` — "extract text" sheet showing recognized text (mirrors GMS Lens Extract Text), including an Emoji variant.

## Notes

Scan Text is fully on-device (`research/ocr` inside the monolith); no capture leaves the phone per the code structure — no upload path exists in the feature code. Camera is also used by Sign-to-text and Theme Builder.
