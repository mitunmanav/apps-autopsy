# 23 — Security & Privacy Assessment

Static findings only — no runtime verification. Severity is a judgment call on static evidence.

## High-signal findings

1. **`SystemAdContentProvider` exported without permission** — authority `…systemAd.splashAd`, `exported=true`, no `permission` attr. Any installed app can query/write splash-ad metadata (ad-fraud/config tampering surface). *Manifest fact; whether code-level checks compensate unverified.*
2. **`SearchExportProvider` exported without permission** — `…searchexport` exposes search results/metadata to any app (file-name/metadata leak). *Manifest fact.*
3. **Hardcoded ad SDK secret** — `APP_SECRET=6a75640c500194189dabc2c6b1c1a2eb` in manifest meta-data (columbus). Secret extractable by trivial decompilation.
4. **`WRITE_SECURE_SETTINGS` + `MANAGE_USERS` + `INTERACT_ACROSS_USERS` + `READ_PRIVILEGED_PHONE_STATE` + `MOUNT_UNMOUNT_FILESYSTEMS` + `DELETE_CACHE_FILES`** — signature-level perms; only effective where platform cert matches (MIUI). On non-MIUI devices they're ignored; on MIUI the app wields OS-level power (consistent with `PLATFORM.RSA` signing).
5. **`QUERY_ALL_PACKAGES` + `REQUEST_INSTALL_PACKAGES`** — full package visibility + install prompts; combined with self-update/`bspatch` gives an update path outside Play (consent-gated, but present).
6. **`MANAGE_EXTERNAL_STORAGE`** — all-files access (required for a file manager, but maximally broad; combined with cleaner's delete path = total-storage write).

## Medium

7. **FTP server** — `ServerControlActivity` exported (`action.SERVER_CONTROL`); anonymous FTP possible (`ANONYMOUS_USERNAME`) → LAN file exposure while enabled. Exported activity means other apps can open its UI (the user still toggles serving inside it).
8. **`PrivateFolderActivity` exported=true** (manifest-verified) — launchable by explicit component from other apps; protected only by the in-app unlock gate (`mUnlocked`/`PrivateModeCallBack`). If the gate is PIN-less or spoofable, vault listing is exposed.
9. **Private folder storage** — vault path/obfuscation mechanism not fully verified; if just dot-renaming, "privacy" is weak (doc 11).
10. **WebView surfaces** — `AuthWebActivity`/`ScoreWebActivity` (exported=false) + `WebViewUtil.handleWebViewDir`; JS interface surface not audited; `http://` EULA URL (cleartext) present.
11. **`audience_network.dex` dynamic loading** — dex loaded at runtime from assets; load-path integrity (verified vs. world-writable staging) not traced.
12. **`bspatch` exec** — native binary exec'd for updates; path traversal/exec-arg hygiene not traced.
13. **`fe://` deep links** — exported scheme handlers; parameter sanitization not verified.
14. **`DirParseService`** — exported bound service; gated by `signature|system` (properly protected — *positive* finding), but the API exposes directory-indexing to platform-signed callers.

## Positive observations

- Custom IPC perms `DIRPARSE`/`ACCESS_FILE_CONTENT` correctly `signatureOrSystem`.
- `FileExplorerFileProvider` is *not* exported, uses per-URI grants — correct share pattern.
- Consent gate before SDK init; analytics disabled meta-data until consent.
- Single signer, v2+v3 schemes; no multi-signer ambiguity.
- PrivateFolder excluded from recents.
- Korea-specific privacy fragment; Zeus `cmpLib.CMPLib` consent.

## Privacy/data-flow notes

- Collects: file metadata (index DB), GAID/OAID, device signals, package list (`QUERY_ALL_PACKAGES`), usage stats (app cleaner), search terms (SearchExport).
- Shares: ad SDKs (AdMob, FB AN, Columbus, miad), Firebase, Xiaomi telemetry, update channel.
- Retention: Room DBs + SharedPreferences; no encryption layer observed at rest (file-content DB stores names/paths only — no file bytes).

## Unresolved security questions

- Code-level guards inside `SystemAdContentProvider`/`SearchExportProvider` `query()`.
- WebView JS-interface whitelists.
- Private-folder cipher strength (if any).
- FTP server auth default at first enable.
- Cert-pinning enforcement.
