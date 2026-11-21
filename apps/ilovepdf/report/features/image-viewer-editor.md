> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Image viewer + image editor

## How it works
- Viewer: `ImageActivityCompose` (registered VIEW for `image/*`) →
  `image_activity_nav_graph`; `presentation.features.image` compose UI.
- Editor: `presentation.features.imageeditor` + `ui.activity.image_editor`
  (`EditImageActivity`, `image_editor_nav_graph`): crop
  (`presentation.features.image.crop`, `fragment_crop_rotate_flip`,
  `croppable` strings), rotate/flip (`image.rotation` package), filters
  (`libnative-filters.so`), annotate (`annotate.*` + Ink strokes), resize
  (`resize_image.usecases`), compare before/after (`compare_image` strings).
- Decoding/pipeline: `libnative-imagetranscoder.so`, `libimage_processing_util_jni.so`,
  Fresco, `libwebpframe`, TIFF via `libtifffactory`/`libtiffconverter`.
