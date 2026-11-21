# 23 — Security & privacy review

## Network

- Manifest declares `usesCleartextTraffic="true"`, **but** `network_security_config.xml` overrides it on API 24+: the decoded config contains a single `domain-config` granting `cleartextTrafficPermitted=true` to **`time-a.nist.gov`** (NIST time server, `includeSubdomains=true`) and **no `base-config`**. Effective cleartext = platform default (blocked, target 36) except that one domain. No caller for it found in app code (likely a library-bundled exception).
- Hardcoded third-party identifiers shipped in plaintext (validity unverified; report as shipped values):
  - Google Maps API key `AIzaSyD741…[redacted]` (`MAP_SDK_KEY`) **plus a second key** `AIzaSyAcAs…[redacted]` (`google_api_key` — likely geocoding/other Google API)
  - OpenWeatherMap key `a84de63bb92490a6da346b833bfabd94` in URL params (`CameraActivity` ×2)
  - AdMob app ID `ca-app-pub-1531973473735447~5005213190`, TikTok `7594777517932707848`
  - Backup passphrase `GMC_Loc_Backup_Secure_Key_2026` + fixed salt (see 15)

## Data protection

- `allowBackup="false"` — good (blocks adb backup of prefs/SQLite)
- `extractNativeLibs="false"`, `largeHeap="true"`
- Custom signature permission guards dynamic receivers
- FileProvider used (not `file://`) for sharing — good. **But** `provider_paths.xml` exposes `root-path` `path="."` plus `external-path`/`files-path`/`cache-path` `path="."` — the entire filesystem is a grantable FileProvider share surface (still requires per-share grants, but over-broad vs restricting to media dirs)
- Legacy `WRITE_EXTERNAL_STORAGE` + `requestLegacyExternalStorage` — broad legacy storage access on older APIs
- `USE_BIOMETRIC`/`USE_FINGERPRINT` declared but **zero biometric usage** in app or bundled code — dead manifest entries from a dependency
- Ad-consent machinery (`IABTCF_*`, `IABConsent_*`, `TAG_FOR_UNDER_AGE_OF_CONSENT`, `CONSENT_SIGNAL_NON_PERSONALIZED_ADS`) exists **inside the bundled GMA SDK**; no app-level UMP consent screen found — whether consent gates personalized ads is SDK-internal, not statically verifiable

## Anti-tamper

- Pairip VM protection + Play source stamp; PairIP license check component
- v2+v3 signing (structural verification only)

## Privacy-relevant collection (static view)

- **App-level network egress found**: only three endpoints — precise GPS coordinates leave the device in URL params to `api.openweathermap.org` (weather + air_pollution, with shipped API key) and `api.open-meteo.com` (elevation). All other traffic is SDK-internal (ads/Firebase/Maps/OneSignal endpoints, not visible in app code)
- Precise location, address geocoding, photos/videos, mic (sound-level + video audio), ad ID, Google account email (`login_email` on Drive sign-in), analytics event stream (FB + Firebase + OneSignal), drive.file OAuth scope requested
- `ACCESS_MEDIA_LOCATION` — reads EXIF GPS from gallery media

## Notable

- Mock-location + VPN detection (integrity gating, `detect_*` events)
- Encrypted `.gmc` backups use a shipped static key — confidentiality ≈ obfuscation (see 15)
