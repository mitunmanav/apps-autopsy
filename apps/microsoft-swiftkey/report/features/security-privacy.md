# Security, signing & privacy posture

Evidence: `00-package-identity-and-signing.md` (v2+v3 signatures, cert sha256 `0ad0088d…`, source stamp `3257d599…`), `res/xml/network_security_config.xml`, `pref_privacy*`/`ads_data_consent`, `FileProvider`, `DYNAMIC_RECEIVER` perm, certificate-transparency-ish config, `DebugProbes` exclusions.

## Transport security

- `network_security_config.xml`: `<base-config cleartextTrafficPermitted="false"/>` — **no HTTP anywhere**.
- Signature allowlists gate the sensitive bridges: TokenShare chains (`ts_configuration.jwt`), MSAL browser safelist, `signature_config.json`.

## Signing

- v2 + v3 signed; same cert in both; **source stamp** present (Play re-sign marker); **no v1**; no rotation lineage declared.
- Authenticity NOT cryptographically verified by tooling — declared identity only (see `00-…md`).

## IPC/permission surface

- `DYNAMIC_RECEIVER` custom permission protects internal broadcasts.
- `FileProvider` exposes only declared cache/file paths (`xml/*file_paths*`).
- `INTERACT_ACROSS_PROFILES`, `INTERACT_ACROSS_USERS*` — cross-profile features (work profile).
- USB host + NFC optional for smart-card sign-in; camera/mic/photos perms bound to explicit features.
- Queries limits other-app visibility to explicit packages (MS authenticators, browsers, token-share services).

## Privacy controls shipped

- Privacy settings screen; `ads_data_consent`; **clear typing data**, learned-word view/delete, delete-account-data vs delete-account.
- Incognito mode (learning off + distinct theme).
- Camera Remix uploads photos to Bing (user-initiated); voice typing sends audio (Whisper on-device vs standard network service).

## Hardening/anti-tamper

- `libsigner.so` signs Adjust calls; `signature_config`/`ts_configuration.jwt` cert pinning for app-to-app trust.
- **Certificate transparency**: `com.appmattus.certificatetransparency` (appmattus CT library, 27 classes incl. log-list store) — TLS certs checked against CT logs.
- **Android backup is a deliberate no-op**: `android:allowBackup="true"` but `backupAgent="com.touchtype.app_backup.EmptyBackupAgent"` — the agent writes nothing, so keyboard data (learned words etc.) is **not** harvested into Google Auto Backup; a `com.google.android.backup.api_key` is still registered.
- Obfuscation: R8 full-mode (see `02-architecture-and-obfuscation.md`); debug probes excluded in release.

## Known unknowns

No runtime checks performed: cert pinning enforcement, root/debug detection, TLS pinning inside native libs, and what telemetry actually leaves the device remain unverified.
