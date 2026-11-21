> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Companion scanner (phone → desktop/web)

Pair the phone camera to a desktop session so scanned pages land on the web.

## How it works
- Entry: QR/deep link `https://links.ilovepdf.com/scanner` +
  `CompanionScannerActivity`/`ScannerWelcomeActivity` → pair via QR
  (`QrCodeScanActivity`, ML Kit barcode `libbarhopper_v3.so` +
  `assets/mlkit_barcode_models/`) or manual code (`insert_code`, `write_code`).
- Pairing/comm channel: `com.android.data.api.CompanionService` +
  `RemoteCompanionDataSource`/`CompanionRepositoryImpl` (mobile service API),
  `WebSocketManager`/`WebSocketManagerImpl` (`network.websocket`) for live
  session events; session model `companionsessionmodel`.
- Captured pages stream up through `ImageUploadService`
  (`service.companion.scanner`, exported service) with progress UI
  (`ScannerLoadingActivity`, `ScannerUploadActivity`, `ScannerProcessActivity`);
  `CompanionScannerService` keeps it alive.
- Same capture/enhance stack as the local scanner (Genius + filters).
