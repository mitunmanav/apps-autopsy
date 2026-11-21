> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# 04 — Third-party SDK inventory

| SDK | Where | Purpose |
|---|---|---|
| **Nutrient (PSPDFKit)** `com.pspdfkit`, `libpspdfkit.so`, `assets/nutrient/` | PDF engine | Reader (`PdfActivity`), printing (`PrintActivity`), content editor + redaction, annotations, document processing (`PdfProcessorTask`), organize UI, sharing/`DocumentSharingProvider`. License-initialized via `PdfSdkInitializer`; `nutrient_automatic_initialize=false` |
| **K1 SDK** `libk1sdk.so` + `libpdf_native_lib.so` | Native PDF transforms | optimize/protect/unlock/repair/rotate/img2pdf/pdf2img/sign/organize/embed (see `03-native-libraries.md`) |
| **iLovePDF SDK** `com.ilovepdf.ilovepdfsdk` | Remote tools | Embedded client for api.ilovepdf.com (clean-arch: api/data/domain/sdk, Koin `ILovePDFModuleKt`) |
| **iLovePDF SignatureKit** `com.ilovepdf.signaturekit`, `SignatureActivity` | e-signing | draw signature UI + `signaturekit_*` smartcard/PIN strings; Yubico YubiKit + NFC for hardware-key signing |
| **iLovePDF MSGraph SDK** `com.ilovepdf.msgraphsdk` (+ MSAL) | OneDrive/SharePoint | MSAL auth (`client_id 6c9d79a9-…`, `msauth://com.ilovepdf.msgraphsdk/authcallback`), Graph file APIs |
| **iLovePDF Dropbox SDK** `com.ilovepdf.dropboxsdk` | Dropbox | Custom fork (`DropboxXiLovePDFAuthActivity`), file ops |
| **Genius Scan SDK** `com.geniusscansdk`, `libgssdk-*.so` | Scanner | `ScanActivity`, `ReadableCodeScanActivity`, `gssdk_*` strings; capture/OCR |
| **iLovePDF UI kits** `com.ilovepdf.androidbeatkit`, `circularchart`, `ilovepdflogger` | App libs | Design system, storage chart, file logger |
| Google Play Billing 9.0.0 + Huawei IAP (`com.huawei.*`) | `billing.*` | Subscriptions on Play + AppGallery |
| Firebase Analytics/Crashlytics/RemoteConfig + `analytics.*`,`experiment.*`,`ab_testing.*` | Telemetry + flags | Events (`Events`,`Screens`,`ToolName`), feature flags, A/B tests |
| ML Kit (`libbarhopper_v3`, barcode models, text registrar) + CameraX | QR/barcode | QR scanner, companion pairing |
| Tesseract (`res/raw/{eng,spa}.traineddata`, `ocr_languages.csv`, `OcrManager`) | OCR | On-device text recognition, downloadable langs (~100 entries w/ md5 + script tag) |
| MSAL `com.microsoft.identity.*` | Microsoft login | OneDrive/SharePoint OAuth incl. broker flow + WebAuthn js-bridge |
| Facebook SDK (AppId `fb127502793959418`, auto-init off) | Login | Social login |
| Jetpack Ink `libink.so` | Annotations/signing | Stroke capture |
| Fresco (`libimagepipeline*`) + Glide-WebP | Images | Loading/transcoding |
| `libaire*.so`, `libnative-filters.so`, `libtiff*.so` | Image filters/TIFF | Scan enhancement, image editor, TIFF tools |
| WorkManager, Room, DataStore, Glance appwidget | Platform | Background jobs, DB, prefs, widgets |
| Freshdesk | `freshdesk.*` | Contact form |
| Media3/ExoPlayer, androidx.compose, credentials/biometric | Platform | Promo video, UI, passkey/biometric auth |
