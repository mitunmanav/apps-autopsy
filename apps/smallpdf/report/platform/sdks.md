# SDK & Dependency Inventory

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`. All rows `[obs]` from decompiled packages/manifest/resources.

| SDK / library | Evidence package/files | Used for `[inf]` |
|---|---|---|
| **PDFTron PDFNet SDK** | `com.pdftron.*` + `libPDFNetC.so` | Viewing, annotation, signing, page ops, editor |
| **ONNX Runtime (Java)** | `ai.onnxruntime.*` + `libonnxruntime{,4j_jni}.so` + `*.onnx` asset | Scanner document detection |
| **Jetpack Compose** | `androidx.compose.*` | All app UI |
| **CameraX** | `androidx.camera.*` + `image_processing_util_jni` | Scanner capture |
| **Room** | `androidx.room.*`, `DocumentsDatabase_Impl` | `documents` table |
| **DataStore** | `androidx.datastore.*`, `datastore_shared_counter` | Prefs, free-task counters |
| **WorkManager** | `androidx.work.*`, `SystemForegroundService`, workers | Sync/delete/rename/analytics workers |
| **Glance widgets** | `androidx.glance.*`, widget receivers | Home-screen tool widgets |
| **Play Billing 8.3.0** | `com.android.billingclient`, `PaywallActivity` | Subscriptions (pro) |
| **Firebase suite** | `firebase.analytics`, `crashlytics`, `config`, `sessions`, `installations`, `datatransport`, `firebase-ee0cd` meta-data | Analytics/crash/remote-config |
| **AppsFlyer** | `com.appsflyer.*`, `onelink.me` meta-data, `w00` resolver | Attribution/deep links |
| **Credentials / Google Identity** | `androidx.credentials.*`, `com.google.android.libraries.identity` | Google sign-in via Credential Manager |
| **Keycloak OIDC** | `keycloak.smallpdf.com` strings + `ExternalBrowserAuthActivity` | SSO/token issuer |
| **Retrofit/OkHttp** | `retrofit2`, `okhttp3`, `nu7` interface | Task API + file upload |
| **Kotlinx serialization** | `@vn8`, `SerialName` models | API models |
| **Pairip** | `com.pairip.application.Application` | Play app-integrity protection |
| **Ppigen/ad-services** | `AD_ID`, `ACCESS_ADSERVICES_*` perms | Ads attribution IDs |
| **Coil/Glide** | image loaders in `defpackage` (coil) | Thumbnails/previews |
| **AppCompat/Activity/Fragment/Lifecycle/Navigation** | androidx stack | Activity/VM scaffolding |
| **Samsung/Huawei store stubs** | `mapsagent`/`appmarket` perms | Alt-store install-referrer |
| **PublicSuffixDatabase** | `assets/PublicSuffixDatabase.list` | OkHttp cookie/certificate pin support |
| **reflow.js** | `assets/reflow.js` | PDF reflow in reader `[inf]` |

## Version notes `[obs/unk]`

- Play Billing client 8.3.0 (manifest meta-data) `[obs]`. PDFTron SDK version string `[unk]`; ORT version `[unk]`; Firebase BoM versions `[unk]` statically.
