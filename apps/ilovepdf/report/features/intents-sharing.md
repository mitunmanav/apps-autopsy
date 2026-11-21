> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Intents, share targets & deep links

## How it works
- Inbound: `IntentFilterToolActivity` handles VIEW/EDIT/SEND/SEND_MULTIPLE for
  pdf/images → routes into the matching tool/file flow; `ReadPdfActivity`
  (pdf VIEW/EDIT), `TxtReaderActivity` (text VIEW), `ImageActivityCompose`
  (image VIEW). `ShareToILovePDFActivity`/`ShareFiles*` handle share-sheet
  intake; `SendToCloudActivity` shares out.
- App links (`MainActivity` intent filters): `ilovepdfapp://`, and https
  `*.ilovepdfapp.com` + `links.ilovepdf.com` (+staging, verified
  `autoVerify=true`) — `deeplink.*` package parses → `DeepLinkUri`,
  `DeepLinkRedirect`, `HandleDeepLinkUseCase` map to screens/tools
  (`deeplink_feature` strings, e.g. `…/scanner`, `…/merge-pdf`).
- SSO callback `ssoilovepdf://sso_callback` → `WebViewActivity`.
