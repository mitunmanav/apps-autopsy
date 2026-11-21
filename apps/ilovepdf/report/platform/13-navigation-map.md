> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e1…ad41`. Static analysis; no runtime evidence.

# 13 — Navigation map

## Global flow

```
SplashScreenActivity → OnboardingActivity (first run) → MainActivity
  ├── Home/Files/Clouds/Settings fragments (bottom nav / drawer)
  ├── ToolsFragment / ToolsGridComposeActivity  (27-tool grid)
  └── FileSelectionActivity → FileSelectionContainerFragment (picker_nav_graph:
      device index | recents | favorites | cloud pickers)
        → per-tool nav graph below → ForegroundToolExecutionService
            → OutputFilesActivity (open/share/print/save-to-cloud/next-tool)
```

## Tool → NavGraph routing (`ToolsNavComponentProvider` — exact mapping)

| Tool | nav graph |
|---|---|
| Compress | `compress_nav_graph` (via `getCompressNavComponent`) |
| Merge | `merge_nav_graph` |
| ImageToPdf | `image_pdf_nav_graph` |
| PdfToImage | `pdf_image_nav_graph` |
| Watermark | `watermark_nav_graph` |
| Rotate | `rotate_nav_graph` |
| PdfToExcel | `pdf_to_excel_nav_graph` |
| PageNumbers | `page_numbers_nav_graph` |
| Split | `split_nav_graph` |
| Protect | `protect_nav_graph` |
| ConvertFromJpg | `convert_from_jpg_nav_graph` |
| ResizeImage | `resize_image_nav_graph` |
| OcrPdf | `ocr_pdf_nav_graph` |
| Unlock, PdfToPowerpoint, PdfToWord, ExcelToPdf, PowerpointToPdf, Sign, Annotate, Organize, Ocr, CompressImage, ConvertToJpg, RepairPdf, CreatePdf, WordToPdf | `direct_execution_nav_graph` (options → straight to execution) |

`direct_execution_nav_graph` = 14 of 27 tools: file pick → minimal options →
run. The 12 dedicated graphs add multi-step option screens + previews.

## Other nav graphs

| Graph | Host | Flow |
|---|---|---|
| `picker_nav_graph` | `FileSelectionContainerFragment` | tabbed source pickers (files/cloud) |
| `new_scanner_nav_graph` | `ScannerActivity` | camera → border-detect → enhancement |
| `page_enhancement_nav_graph` | `PageEnhancementActivity` | crop/filter → output choice |
| `scanner_page_viewer_nav_graph` | `PageEnhancementActivity` | scanned-page review |
| `cloud_files_nav_graph` | `CloudFilesFragment` | provider → folder browse → pick |
| `cloud_file_picker_nav_graph` | `CloudFilePickerActivity` | picker variant for share/save-as |
| `bin_file_nav_graph` | `BinFilesActivity` | trash list → restore/purge |
| `image_activity_nav_graph` | `ImageActivityCompose` | image viewer/editor compose host |
| `direct_execution_nav_graph` | `ToolsExecutionActivity` | straight-through tool runs |

## Deep links (manifest-declared)

| URI | Destination |
|---|---|
| `ilovepdfapp://`, `https://www.ilovepdfapp.com` (+staging) | `MainActivity` → `HandleDeepLinkUseCase` → tools/screens |
| `https://links.ilovepdf.com/scanner` | companion-scanner pairing |
| `ssoilovepdf://sso_callback` | `WebViewActivity` SSO return |
| `content://`/`file://` VIEW pdf/image/txt | `ReadPdfActivity`/`ImageActivityCompose`/`TxtReaderActivity` |
| `db-4yum8rnppkgo2nj://`, `db-xntw8za866940lz://` | Dropbox auth callbacks |
| `fb127502793959418://cct.com.ilovepdf.www` | Facebook auth |
| `msauth://`, `fbconnect://com.ilovepdf.msgraphsdk` | MSAL/Graph auth |
| `IntentFilterToolActivity` SEND/VIEW pdf+image | "open with" → tool routing |
| SEND_MULTIPLE | `ShareToILovePDFActivity` |

## Widget → app entry

`ILovePDFWidgetProvider`/`MyWidget` + `WidgetScanReceiver`,
`WidgetRecentToolsReceiver`, `WidgetPinnedReceiver` — each button posts a
deep-link intent into `MainActivity` handled by `DeepLinkRedirect`.
