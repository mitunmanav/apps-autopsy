> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# 01 — Manifest and component surface

125 declared components: **75 activities, 23 services, 18 receivers, 9 providers**.
Source: decoded `AndroidManifest.xml` (REA `inspect_android_package`, Evidence
`ev_81cb0b1a…`; apktool 2.7.0 decode).

## Exported surface (attack-relevant)

| Component | Filters | Purpose |
|---|---|---|
| `SplashScreenActivity` | MAIN/LAUNCHER; VIEW `https://links.ilovepdf.com/scanner` | Launcher + companion-scanner deep link |
| `MainActivity` | VIEW `ilovepdfapp://*`, `https://www.ilovepdfapp.com`, custom `action.open.main` | App shell / deep-link entry |
| `ui.activity.intent_filters.ReadPdfActivity` | VIEW pdf (`content`,`file`,`*.pdf`) | "Open PDF with…" handler → reader |
| `ui.activity.intent_filters.IntentFilterToolActivity` | SEND pdf, SEND image/jpeg, VIEW pdf | "Share/Open with iLovePDF" → routes to tool flow |
| `ui.activity.TxtReaderActivity` | VIEW text/plain, VIEW `*.txt` | TXT reader |
| `ui.activity.imageViewer.ImageActivityCompose` | VIEW `image/*` | Image viewer/editor |
| `ui.activity.SSODeepLinkActivity` | VIEW `ssoilovepdf://sso_callback` | SSO login callback |
| `ui.activity.CreatePdfActivity` | `action.open.create_pdf` | Shortcut: create PDF |
| `ui.activity.InAppPromoActivity` | `action.open.offer` | Shortcut: promo |
| `ui.activity.PurchasesActivity` | `action.open.premium` | Shortcut: paywall |
| `com.pspdfkit.ui.PdfActivity` | (SDK) | Nutrient PDF reader host |
| `com.facebook.*`, `com.dropbox.core.android.AuthActivity`, `com.microsoft.identity.*`, `com.ilovepdf.dropboxsdk.DropboxXiLovePDFAuthActivity` | SDK auth flows | Cloud-provider OAuth |

`<queries>` intent visibility: PDF SEND/VIEW/EDIT, image EDIT, `https` links,
CustomTabs, Facebook (`com.facebook.katana`), Play Billing,
Dropbox (`com.dropbox.android`), Huawei HMS Core, and a block of Microsoft
broker apps (MSAL: Authenticator, Company Portal, …).

## App-owned services

| Service | Role |
|---|---|
| `service.ToolExecutionService` | Background tool execution host |
| `service.tools.ForegroundToolExecutionService` | Foreground tool runner (FGS permission declared) |
| `service.companion.scanner.ImageUploadService` | Uploads companion-scanned images |
| `service.cloud.{Update,Download,UploadFileTo,SaveCloudFileAsCopy}CloudFileService` | Cloud file transfer workers |

## App-owned receivers

`CloudUploadStateReceiver`, `CloudActionsReceiver`, `tools.ToolTaskReceiver`,
`broadcast.TabsBroadcastReceiver`, plus three **home-screen widgets**:
`WidgetRecentToolsReceiver`, `WidgetScanReceiver`, `WidgetPinnedReceiver`
(`android.appwidget.action.APPWIDGET_UPDATE`; provider info
`res/xml/app_tools_widget_provider_info.xml`, `app_scan_widget_provider_info.xml`).

## App-owned provider

`androidx.core.content.FileProvider` — paths: files, cache, external-files,
external-cache, external root (`res/xml/file_paths.xml`). Nutrient ships
`InitializationProvider`, `AssetsContentProvider`, `DocumentSharingProvider`.

## Declared permission

`com.ilovepdf.www.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` (signature) — guards
in-app dynamic receivers.

See `_analysis/components-table.md` for the full 125-row dump.
