# 21 — Network Stack, Endpoints & Secrets

## HTTP stack

- `HttpManager` (`ev_e33d20c6…cb0e5`, `com.xiaomi.globalmiuiapp.common`) — app-level request facade; obfuscated internals, layered over **OkHttp/Okio** (verified `ev_b3e4fe2a…8ad243`) with **Moshi** for JSON (verified `ev_5c04b8b8…6064c9a`); `Urls` class holds **parameter names only** (endpoints assembled elsewhere via `GlobalConsts`/`CommonConstant` + runtime config). No Retrofit/Gson/XStream packages in dex.
- `HttpsConnection`-style TLS paths; `X-AG-*.crt` assets = bundled CA certs for Xiaomi ad/telemetry endpoints (certificate pinning/CA bundle).

## Endpoints observed (literal strings / meta-data)

| Endpoint | Use |
|---|---|
| `https://originfileexplorer.firebaseio.com` | Firebase Realtime DB (remote config data) |
| `originfileexplorer.appspot.com` | GCS bucket (assets/config) |
| `599532519894-…apps.googleusercontent.com` | OAuth client (Drive auth) |
| `https://privacy.mi.com/all/%2$s` | privacy policy web |
| `http://www.miui.com/res/doc/eula.html?region=%1$s&lang=%2$s` | EULA web |
| `https://fe.miui.com` / `fe://` | deep links |
| `https://security.fe.miui.com` | score/security web |
| `com.xiaomi.action.sdk.CleanService` | cleaner SDK bind action |
| `ca-app-pub-4062377952200160~8017942393` | AdMob app ID (meta-data) |

Additional Xiaomi ad/analytics/update hosts are built at runtime (obfuscated `HttpManager`/columbus config blobs) — **literal hosts not recoverable in bounded decompiles** (unknown).

## Network security config

`@xml/network_security_config` — **confirmed declared** in the manifest (`ev_24480d9e…089c2a7`); its literal ruleset (cleartext allowances, pin sets) not extracted to a verdict. Cleartext `http://` EULA URL exists in strings regardless.

## Embedded secrets / sensitive constants

- `APP_SECRET=6a75640c500194189dabc2c6b1c1a2eb` — columbus ad SDK app secret, plaintext in manifest meta-data.
- Firebase API key + OAuth client ID in `res/values` (standard google-services exposure — these are "public" keys but identify the project `originfileexplorer`).
- `ANONYMOUS_USERNAME=anonymous` FTP default.
- `CM_PACKAGE_NAME=com.cleanmaster.sdk`, `PACKAGE_NAME_GMS`, browser package constants (GlobalConsts `ev_6298fcc4…deb6b58`).

## Consent/telemetry ordering

`AbsApplicationProxy.init→initSDKConfig/threadInitSDKConfig` — network SDKs initialize after privacy gate; analytics `*_collection_enabled=false` until consent (doc 12/19).

## Evidence

`ev_e33d20c6…cb0e5` (HttpManager summary), `ev_6298fcc4…deb6b58` (GlobalConsts), `ev_4ef9f594…73bdf29` (update path), manifest meta-data, `strings`/`resources.arsc` decode (`ev_13cc3da3…49d31e6d`), archive certs list.

## Unknowns

- Exact ad/telemetry/update hostname literals (runtime-assembled/obfuscated; only shapes verified).
- Whether pinning enforces `X-AG-*` CAs or they ship as fallbacks — network-security XML not resolved to a literal verdict.
- Token/key storage hardening (Keystore vs. plain SharedPreferences) — not verified.
