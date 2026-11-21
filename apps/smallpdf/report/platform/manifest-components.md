# Manifest & Components

Artifact: `com.smallpdf.app.android` v3.7.0 (218984204) — base SHA-256 `345548b0…f38eb6a6`.

Source: decoded `AndroidManifest.xml` via REA `inspect_analysis_view` android/manifest facet (evidence `ev_7d0395435d…`) + local apktool decode. `[obs]` unless tagged.

## Manifest root

- `android:requiredSplitTypes="base__abi,base__density"`, `extractNativeLibs="false"`, `installLocation="auto"`.
- `android:fullBackupContent="@xml/appsflyer_backup_rules"`, `dataExtractionRules="@xml/appsflyer_data_extraction_rules"`.
- `application` class: `com.smallpdf.app.android.App` wraps `com.pairip.application.Application` (Play Integrity/Pairipcore protection wrapper) `[obs]`.

## Components — 66 total `[obs]`

### Activities (exported unless noted)

| Component | Exported | Role `[inf]` |
|---|---|---|
| `home.HomeActivity` (`singleTask`) | yes | Main hub; hosts deep links + launcher alias `…android.Launcher` |
| `features.tools_flow.ToolFlowActivity` | yes | File-intake + tool orchestration (VIEW/SEND intents) |
| `features.tools_flow.ShareMultipleToolFlowActivity` | yes (alias) | `SEND_MULTIPLE` intake |
| `editor.EditorActivity` | no (implicit intents only) | PDFTron editor host |
| `scanner.ScannerActivity` | no | CameraX+ONNX scan flow |
| `payment.PaywallActivity` | no | Subscription upsell |
| `auth.AuthorizationActivity` | no | Sign-in UI |
| `auth.screens.socials.ExternalBrowserAuthActivity` | yes | OAuth redirect receiver |
| `features.account.AccountManagementActivity` | no | Account settings |

Plus AndroidX/PDFTron/Firebase host activities (`ComponentActivity`, PDFTron `PDFViewCtrlTools`-related, `CustomTabActivity`, credential/billing proxies).

### Deep links `[obs]`

Scheme `https`, host `smallpdf.com`, verified app links (`autoVerify`) → `HomeActivity`:
`/scanner` `/add-file` `/add-img` `/compress-pdf` `/word-to-pdf` `/excel-to-pdf` `/ppt-to-pdf` `/jpg-to-pdf` `/pdf-to-word` `/pdf-to-excel` `/pdf-to-ppt` `/pdf-to-jpg` `/merge-pdf` `/edit-pdf` `/sign-pdf` `/pdf-converter`.

Static resolver `defpackage.zra` `[obs]` maps each path to a `u4a` tool object (see tools/index.md). `defpackage.w00` additionally parses `?tool=<slug>` AppsFlyer/onelink query params → same registry.

### Services

- `core.domain.account.android_authenticator.AndroidAuthenticatorService` — AccountManager authenticator `[obs]`.
- `androidx.work.impl.foreground.SystemForegroundService` + WorkManager `SystemJobService`/`SystemAlarmService` `[obs]`.
- Firebase messaging/installations services, AppsFlyer referrer, Play Billing `com.android.vending`, `androidx.room.MultiInstanceInvalidationService`, metadata-only `FOREGROUND_SERVICE_DATA_SYNC` permission for document sync worker `[inf]`.

### Providers

- `core.domain.documents.DocumentsContentProvider` — exported, authority `com.smallpdf.app.android.storageprovider.documents` `[obs]`.
- `androidx.startup.InitializationProvider`, `FileProvider`, `DocumentsProvider`-style storage access.

### Receivers & widgets

- Boot completed / WorkManager / AppsFlyer / Firebase receivers.
- Glance widget providers for tools, compress, scan, conversion, merge, edit, e-sign `[obs]` (widget metadata in `res/xml/`).

### Meta-data `[obs]` (secrets redacted)

- `com.google.android.gms.version`, `google_app_id` `1:850993444664:android:84e197cb85342415e873cd`, `firebase_database_url` `https://smallpdf-ee0cd.firebaseio.com`, `project_id`/`gcm_defaultSenderId` `smallpdf-ee0cd`/`850993444664`, `google_storage_bucket` `smallpdf-ee0cd.appspot.com`, embedded `com.google.android.geo.API_KEY` value `AIza…` (redacted; shipped client key).
- `com.pdftron.pdfnet.PDFNetLicense` — license string present (redacted).
- AppsFlyer `AF_SMART_BANNER_HOST` `smallpdf-mobile.onelink.me`, default URL `…/LaDa`, assetlinks JSON reference.

## Coverage notes

- `component-summary` facet and full component list: 66 entries extracted `[obs]`. Pairip wrapper means the real `App` init is behind native-protected loading — runtime init order is `[unk]`.
