> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Compress PDF

Reduce PDF size (extreme / recommended / less compression).

## How it works
- `Tools.Compress` (`internalName=COMPRESS`, `offlineSupport=null`).
- UI: `tools.compress.CompressToolFragment` (`tool_compress_nav_graph`) →
  `CompressToolOptionsFragment` picks `CompressParams.CompressLevel`
  (extreme/recommended/low).
- Remote path: `CompressTask` → `Tool.COMPRESS`; server returns a processed
  file whose `download_file_name` is fetched (`UrlUtils` download URL).
- `PDFNativeLib.nativeOptimizePdf` (K1) is the local-capable compressor used by
  other flows (e.g. auto-optimize before upload, `useAutoCompress`
  in `compress_image.usecases`), exposed in-app through the remote tool
  classification.
