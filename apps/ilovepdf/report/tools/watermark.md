> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Watermark PDF

Stamp text or an image across every page.

## How it works
- `Tools.Watermark` (`internalName=WATERMARK`, remote).
- `WaterMarkTask`/`WaterMarkParams`: `mode=text|image` (`WatermarkMode`),
  position 3×3 grid (`WatermarkPosition`), vertical/horizontal offsets, font
  family (`WaterMarkFont`, `watermark_font.xml`), rotation, transparency,
  layer (over/under), `mosaic` tiling; image mode takes an uploaded image file.
- Live preview: `tools.watermark.WatermarkToolFragment` renders page thumbnails
  (`generate.thumbnails`) + font/size pickers (`FontModel`/`FontSizeModel`).
