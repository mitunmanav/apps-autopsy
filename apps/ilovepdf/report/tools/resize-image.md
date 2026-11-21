> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Resize image

Scale by percentage, pixels, or target file size.

## How it works
- `Tools.ResizeImage` (`internalName=RESIZE_IMAGE`, remote
  `Tool.RESIZE_IMAGE`, `ResizeImageTask`/`ResizeImageParams`: mode percent /
  pixels (w×h, keep-aspect) / bytes target). UI `tools.image.resizeimage.*`.
