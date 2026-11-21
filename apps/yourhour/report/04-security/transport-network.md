# Transport & Network Security

## S6 — OkHttp BASIC logging (Med)

The app's API client (`rp`-prefixed gateway classes) uses `HttpLoggingInterceptor` at
**BASIC** level — request/response **headers** are written to logcat. The client attaches
`Authorization: Bearer <token>` (`bg6`, `dg6`, `eg6`), so auth headers can appear in logs
on any build where the interceptor is active. 30 s timeouts, Retrofit-style interface to
`tv-api.yourhourapp.com/api/v1/`.

## S7 — No network security config / no pinning observed (Med)

- Manifest has **no `android:networkSecurityConfig`** and no `usesCleartextTraffic="false"`
  → platform default applies; cleartext remains *permitted* (targetSdk≥28 default
  `cleartextTrafficPermitted=true`).
- **No certificate pinning** found — no `OkHttpClient` `CertificatePinner`, no
  `<pin-set>` config. MitM via a user-installed CA is possible for the device's own user
  (and exploitable by attackers who can install a CA).
- Positive: every observed endpoint is `https://` (API, Firebase, Play links); no `http://`
  API calls in app code (only XML namespaces + a JExcel comment).

## FCM/notification channel

- Push payloads carry `request_token`, `deviceId`, `deviceName`, `usageSyncedAt`,
  `appsSyncedAt`, `issuedAt` — delivered via Google's FCM transport (TLS), but the
  request_token is then re-logged locally (see data-leaks S5).
- Token registration path `auth/fcm-token` ties the FCM token to the account — needed for
  remote lock delivery; the phone trusts commands signed by possession of the account
  session.

## Backend endpoints of note (auth surface)

`auth/google` exchanges a Google ID token for the app Bearer token; `auth/account/deletion`
+ `/cancel` manage account state; `devices/pair/short-code` authorizes a TV by code
possession; `devices/{id}/override/{token}` activates unlocks by bearer token in the URL
path — **override tokens in URL paths get logged in access logs** and the local OkHttp log.

## Assessment

Transport design is *typical-consumer-app*: TLS everywhere, bearer auth, no pinning, BASIC
logging left on. The realistic risks are (a) token exposure via logcat/backup rather than
wire interception, and (b) no pinning enabling user-local or managed-proxy inspection of the
parental sync plane.
