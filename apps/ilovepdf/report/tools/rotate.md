> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Rotate PDF / images

Rotate all or selected pages; also used by the image editor (`Rotate` tool in
`image.rotation.rotate_fragment`).

## How it works
- `Tools.Rotate` (`internalName=ROTATE`, `offlineSupport=true`).
- Local: `RotateLocalTask` → `PDFNativeLib` → `nativeRotate(in, out, rotation)`
  on `libpdf_native_lib.so`→`libk1sdk.so`; rotation taken from `RotateParams`;
  `setTempFolder(cacheDir)` before call; result code → `PdfProcessResult`
  (0 ok / 10 missing pw / 11 wrong pw); output `producer="iLovePDF"`.
- Remote: `RotateTask` → `Tool.ROTATE` when local path declined.
- UI: `tools.rotate.RotateToolFragment` → `RotateToolOptionsFragment` (degree +
  which pages); page thumbnails come from `GenerateThumbnailImpl`
  (`generate.thumbnails`) rendering pages via Nutrient.
