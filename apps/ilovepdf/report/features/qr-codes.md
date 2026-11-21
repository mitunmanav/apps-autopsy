> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# QR / barcode scanning

## How it works
`QrCodeScanActivity` + `presentation.features.qrcode`/`ui.qrcode` +
`scanner.qrcode`: CameraX (`camera-core`/`camera2`) preview fed to ML Kit
barcode (`com.google.mlkit:barcode-scanning`, `libbarhopper_v3.so` +
bundled models). Uses: companion-scanner pairing, `Wi-Fi` QR parse
(`wifi` strings + `WIFI_AUTH_REQUEST`/settings suggestions), and opening
`ilovepdf.com` tool links. `ScannerBarcode`/`QRScannerActivity` variants cover
the legacy scanner's code mode (`ReadableCodeScanActivity` from Genius Scan).
