# Feature: Deep Links & External Entry

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

## App links `[obs]`

`https://smallpdf.com/<path>` `autoVerify` → `HomeActivity`, 16 paths (see manifest-components.md). Resolver `defpackage.zra` `[obs]` maps path→`u4a` tool object (table in navigation-map.md).

## Query deep links `[obs]`

`defpackage.w00` parses `?tool=` / AppsFlyer params → same registry; observed slugs: `compress-pdf`, `merge-pdf`, `smerge`, `pdf-ocr`, `solid-ocr`, `pdf-to-word`, `pdf-to-excel`, `pdf-to-ppt`, `pdf-to-jpg`, `word-to-pdf`, `excel-to-pdf`, `ppt-to-pdf`, `jpg-to-pdf`, `webpage_conversion`, `esign`, `scan`.

## Other entries `[obs/inf]`

- VIEW/SEND[_MULTIPLE] intents → `ToolFlowActivity`/`ShareMultipleToolFlowActivity`.
- Glance widgets → tool-scoped launches `[inf]`.
- `NOTIFICATION_ACTION`/`free_task` → HomeActivity `[inf]`.
- Keycloak redirect → `ExternalBrowserAuthActivity`.
- AccountManager → `AndroidAuthenticatorService`.
- `DocumentsContentProvider` URIs → stored document content.
