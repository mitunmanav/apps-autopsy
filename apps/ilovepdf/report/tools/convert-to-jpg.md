> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Convert to JPG (PNG/GIF/TIFF/SVG/HEIC → JPG)

## How it works
- `Tools.ConvertToJpg` (`internalName=CONVERT_TO_JPG`, remote
  `Tool.CONVERT_IMAGE`, `ConvertImageTask`/`ConvertImageParams` with target=jpg).
- On-device codecs back previews: `libnative-imagetranscoder.so`,
  `libtifffactory/libtiffconverter.so`, WebP/GIF libs; actual batch conversion
  runs server-side. UI `tools.image.converttojpg.*`.
