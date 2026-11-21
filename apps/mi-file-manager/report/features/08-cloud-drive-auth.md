# 08 — Cloud Drive & Authentication

## Cloud drive (Google Drive)

- `fragment.GDriveFileFragment` (verified — `.gdrive` package is R$-only) + helpers — browse/upload/download Google Drive inside the file manager (Drive node in `RemoteVolumesFragment`-style remote tree).
- OAuth2 via **net.openid.appauth** (AppAuth): `AuthorizationService` + `RedirectUriReceiverActivity` (custom scheme `com.mi.android.globalfileexplorer:/oauth2redirect`/`oauth2redirect`).
- `CloudConfigActivity` — cloud account/config screen; intent `HANDLE_AUTHORIZATION_RESPONSE` receives the AppAuth redirect and exchanges the code.
- `AuthWebActivity` — embedded WebView auth/consent host (Xiaomi/Google login fallbacks).
- Google config (`res/values` google-services): `default_web_client_id = 599532519894-qvdg613vlo22tol6uljd7upk0pg7j0s2.apps.googleusercontent.com`, `firebase_database_url = https://originfileexplorer.firebaseio.com`, `google_storage_bucket = originfileexplorer.appspot.com`.
- `REQUEST_CODE_GOOGLE_AUTHORIZE = 140`, `REQUEST_CODE_WEB_AUTHORIZE = 141` (GlobalConsts).

## Xiaomi account / auth glue

- `com.xiaomi.permission.AUTH_SERVICE` + `com.xiaomi.account.openauth` (XiaomiAccount auth stack) — Xiaomi-account SSO for market/score/selfupdate features.
- `ScoreWebActivity` — device/app "score" web page (rating/points UI, `security.fe.miui.com`-style links).

## Flow (observed statically)

1. User taps Cloud entry → `CloudConfigActivity`/`GDriveFileFragment`.
2. AppAuth `AuthorizationRequest` (Google Drive scope) launched via CustomTabs/browser; redirect returns to `RedirectUriReceiverActivity` → `HANDLE_AUTHORIZATION_RESPONSE` intent → `CloudConfigActivity` exchanges code for tokens.
3. Tokens cached (SharedPreferences/Room); `GDriveFileFragment` lists files via Drive REST API through `HttpManager`+OkHttp stack (doc 21).

## Evidence

Class inventory `ev_c7d5130a…787a4a` (gdrive/cloud/auth classes), AppAuth package inventory, manifest intent filters & meta-data (`ev_24480d9e…089c2a7`), strings (google-services config), GlobalConsts evidence `ev_6298fcc4…deb6b58`.

## Unknowns

- Exact Drive API surface (files.list/download/upload endpoints) — request building inside obfuscated `HttpManager` paths not fully enumerated; no hardcoded Drive URLs beyond standard `googleapis.com`.
- Xiaomi-account features actually shipped vs. stubbed in the global build — AUTH_SERVICE permission declared; usage depth not fully traced.
- Token storage location/encryption — not verified (likely SharedPreferences; no Keystore usage traced).
