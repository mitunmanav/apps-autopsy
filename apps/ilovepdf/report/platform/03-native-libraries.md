> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# 03 — Native libraries (`split_config.arm64_v8a.apk`)

25 `.so` files under `lib/arm64-v8a/`; only arm64 split is present (extractNativeLibs=false).

## App / vendor PDF engines

| Library | Owner | Role (observed exports) |
|---|---|---|
| `libpdf_native_lib.so` (24 KB) | iLovePDF | JNI shim `com.android.ilovepdf.lib.PDFNativeLib`: `nativeOptimizePdf`, `nativeProtect`, `nativeUnlock`, `nativePasswordIsCorrect`, `nativePdfIsProtected`, `nativeRepair`, `nativeRotate`, `nativeImageToPdf`, `setLicenseKey`, `setTempFolder` |
| `libk1sdk.so` (24 MB) | K1 SDK (iLovePDF native engine) | Complete local PDF engine: `k1_img2pdf_*` (image→PDF w/ layout: fillpage/placeonpage/tailorpage, margins, orientation, DPI), `k1_pdf2img_*` (page render, DPI/max-size), `k1_pdfopt_*` (optimize/compress), `k1_pdflock_*` + `k1_pdf_encryptionparams_*` (password protect/unlock, permission flags), `k1_pdforg_*` (organize), `k1_pdfsig_*` + `k1_crypt_*` (digital signatures: PFX soft provider, DTM timestamp provider, signature blueprints), `k1_pdfembed_*` (file/invoice embedding), `k1_pdfext_*` (metadata, fonts, encryption, MDP permissions), `k1_pdffnt_*` (fonts), `k1_cancellation_*` |
| `libpspdfkit.so` (24 MB) | Nutrient (PSPDFKit) | `NutrientNative` JNI + `NativeAPStream*` — PDF rendering, editing, redaction, annotations, printing; assets `assets/nutrient/` (annotation schema bfbs, shape templates, note stamps, pattern PDFs, reader CSS, Init.js) |
| `libgssdk-core.so`, `libgssdk-ocr.so` | Genius Scan SDK | Document detection/capture and scan OCR (`com.geniusscansdk.*` ScanActivity) |
| `libtiff.so`, `libtiffconverter.so`, `libtifffactory.so`, `libtiffsaver.so` | TIFF toolchain | TIFF decode/convert/save — image-conversion tools |

## Jetpack / framework

| Library | Role |
|---|---|
| `libink.so` | Jetpack Ink — freehand strokes (annotations, signature draw, markup) |
| `libandroidx.graphics.path.so`, `libgraphics-core.so` | AndroidX graphics |
| `libdatastore_shared_counter.so` | DataStore |
| `libsurface_util_jni.so`, `libimage_processing_util_jni.so` | CameraX/image processing |
| `libtensorflowlite_jni.so`, `libbarhopper_v3.so` | TFLite + ML Kit barcode (QR/scanner) |

## Image loading / transcoding

| Library | Role |
|---|---|
| `libimagepipeline.so`, `libnative-imagetranscoder.so`, `libstatic-webp.so` | Fresco image pipeline |
| `libglide-webp.so`, `libgifimage.so`, `libyuv-decoder.so` | Glide WebP, GIF, YUV decode |
| `libnative-filters.so`, `libaire.so`, `libaire_filters.so` | GPU/image filters — scanner enhancement + image editor |

## How it fits

The **K1 engine is the workhorse for local PDF manipulation**; `libpdf_native_lib.so`
is its only JNI door and is wrapped by `PDFNativeLib` (see
`platform/02-architecture.md`). Nutrient owns on-screen PDF viewing/editing;
K1 owns file-transform tools (optimize/protect/unlock/repair/rotate/img2pdf/sign).
