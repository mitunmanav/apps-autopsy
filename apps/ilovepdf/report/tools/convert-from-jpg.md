> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Convert from JPG (JPG → PNG)

## How it works
- `Tools.ConvertFromJpg` (`internalName=CONVERT_FROM_JPG`, remote
  `Tool.CONVERT_IMAGE` with target=png). Same `ConvertImageTask` pipeline.
  UI `tools.image.convertfromjpg.*`.
