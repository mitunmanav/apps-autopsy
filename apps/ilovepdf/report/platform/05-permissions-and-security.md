> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# 05 — Permissions and security posture

## Requested permissions (22)

| Group | Permissions | Used by |
|---|---|---|
| Files | `MANAGE_EXTERNAL_STORAGE`, `READ_EXTERNAL_STORAGE` (≤SDK32), `WRITE_EXTERNAL_STORAGE` | All-files access for a document manager app; MediaStore is also used |
| Capture | `CAMERA` | Scanner, QR scanner, companion scanner |
| Identity/billing | `com.android.vending.BILLING`, `BIND_GET_INSTALL_REFERRER_SERVICE` | Play Billing + install referrer |
| Ads/analytics | `AD_ID`, `ACCESS_ADSERVICES_{ATTRIBUTION,AD_ID,CUSTOM_AUDIENCE,TOPICS}` | Privacy Sandbox ads APIs (`res/xml/ad_services_config.xml`: attribution, custom audiences, topics — all `allowAllToAccess`) |
| Account lock | `USE_BIOMETRIC`, `USE_FINGERPRINT` | Biometric app lock / credential prompts |
| Hardware signing | `NFC`, `uses-feature usb.host`, `hardware.nfc` (optional) | YubiKit smart-card signing (PAdES with hardware keys) |
| Misc | `INTERNET`, `ACCESS_NETWORK_STATE`, `VIBRATE`, `WAKE_LOCK`, `RECEIVE_BOOT_COMPLETED`, `FOREGROUND_SERVICE`, `FOREGROUND_SERVICE_DATA_SYNC` | Cloud transfers, boot-resume uploads |
| Self | `com.ilovepdf.www.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` (signature-level, defined by app) | Internal dynamic receivers |

## Network security config

`res/xml/network_security_config.xml` permits cleartext only for the two
staging hosts `ws-stagingws.ilovepdf.com` / `api-stagingws.ilovepdf.com`
(subdomains included) — a dev/staging leftover; production traffic stays HTTPS.

## FileProvider exposure

`file_paths.xml` grants all of `files`, `cache`, `external-files`,
`external-cache` and the **external storage root** (`external-path "."`) —
the broadest possible share scope; any file the app can read can be shared
via `content://` URI to grantee apps.

## Storage notes

`MANAGE_EXTERNAL_STORAGE` + `requestLegacyExternalStorage` = broad file reach,
expected for a file-manager-centric PDF app; `allowBackup="true"` means app
data (incl. Room DB with file indexes and cloud queue state) flows into
Android backups.
