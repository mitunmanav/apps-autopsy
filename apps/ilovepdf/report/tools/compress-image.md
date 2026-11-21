> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Compress image

Shrink JPG/PNG file size (image tool).

## How it works
- `Tools.CompressImage` (`internalName=COMPRESS_IMAGE`, remote
  `Tool.COMPRESS_IMAGE`). `CompressImageTask` + `CompressImageParams`
  (compression level). UI under `tools.image.compressimage`
  (`CompressImageToolFragment`); local quality knobs come from
  `compress_image.usecases` / `useAutoCompress` when preparing uploads.
