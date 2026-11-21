# GPS Map Camera — teardown report

| | |
| --- | --- |
| **Target** | `com.gpsmapcamera.geotagginglocationonphoto` (split APK set) |
| **Version** | 1.9.40 (versionCode 202, minSdk 32, targetSdk 36, compileSdk 36) |
| **SHA-256** | `c1f5bcec9de23c4a7422f84c8877a11689062b12dd9e4769a6e53b59becb259a` (base.apk) |
| **Platform** | Android |
| **Method** | static |
| **Analyzed** | unknown |
| **Tools** | REA jadx-headless 0.7.1 · JADX |
| **Obtained** | local archive |
| **Analyst** | @mitunmanav |

## What this is

Camera app that stamps GPS coordinates, maps and weather onto photos —
an Open Camera–derived codebase (156 `PreferenceKeys` match) wrapped in
Google Pairip anti-tamper. Split-APK set; never executed.

## Artifact set

- Base APK SHA-256: `c1f5bcec9de23c4a7422f84c8877a11689062b12dd9e4769a6e53b59becb259a` (33,367,701 bytes, 3 DEX, 6,515 zip entries)
- arm64 split SHA-256: `7b592e20e8d6f6529877b7cf8e14021d6c2009ee20b6038d667bec2f41b6a80c`
- xxhdpi split SHA-256: `6dad2f04bc858f48d4651e03180a98018b4edf25b5eccb13af3c3e37d1ef0b5d`
- Signature: v2 + v3 schemes, single signer cert `2cbafeaf…b5c651`, Play source stamp `3257d599…bbd6d` (structural observation only — no cryptographic verification performed)
- Application class: `com.pairip.application.Application` — Google **Pairip** anti-tamper VM (`libpairipcore.so`); a small number of methods are VM-protected (`FSXa.*.invoke` stubs). All other app code was fully decompiled.

## Method

REA (jadx-headless-mcp 0.7.1) for manifest/resource/class introspection, plus a
full-package JADX decompile of all 130 app-owned classes into
[`_jadx/`](./_jadx/). Supporting extracts in [`_evidence/`](./_evidence/):
decoded manifest, all 1,011 app strings (`strings.json`), 552 SharedPreferences
keys (`SP_keys.txt`), 156 Open Camera preference keys (`PreferenceKeys.txt`).

**This APK was never executed.** All findings are static. Dynamic/reflective
behavior, Pairip VM-protected method bodies, and server-side responses are
unknowns wherever noted.

## Findings

- **[obs]** Google `Pairip` anti-tamper wraps the app — a few methods are VM-protected stubs and could not be decompiled.
- **[obs]** Weather/AQI endpoints with a shipped API key; ad slots driven by Remote Config; encrypted location-backup code present.
- **[obs]** Google Drive upload: sign-in, scope, folder and toggle all exist, but **no upload code path in the Java layer** — unimplemented here or VM-protected `[unk]`.

## Layout of this report

| # | File | Feature |
|---|------|---------|
| 01 | [01-artifact-identity.md](01-artifact-identity.md) | Package identity, splits, signing, archive inventory |
| 02 | [02-manifest-and-components.md](02-manifest-and-components.md) | Manifest, permissions, 60 activities, services, receivers, providers, exported surface |
| 03 | [03-camera-capture.md](03-camera-capture.md) | Camera capture engine (Open Camera fork), photo/video settings |
| 04 | [04-photo-stamps-and-templates.md](04-photo-stamps-and-templates.md) | Six stamp template families, every stamp field, colors/fonts/positions |
| 05 | [05-location-services.md](05-location-services.md) | GPS capture, fused location, geocoding, EGM96, sensors, mock/VPN detection |
| 06 | [06-manual-locations.md](06-manual-locations.md) | Saved/manual locations, SQLite store, map picker |
| 07 | [07-maps.md](07-maps.md) | Google Maps SDK integration, types/positions/scale, image-on-map, clustering |
| 08 | [08-datetime.md](08-datetime.md) | Date/time formats, custom date picker, timezones |
| 09 | [09-video.md](09-video.md) | Video capture quality, audio toggle, playback |
| 10 | [10-gallery-media-files.md](10-gallery-media-files.md) | Gallery, folders, media viewer, file naming, SAF/SD card |
| 11 | [11-notes-hashtags.md](11-notes-hashtags.md) | Notes/hashtag stamp fields, prompt-on-capture |
| 12 | [12-reports-before-after.md](12-reports-before-after.md) | Work reports, before/after comparison |
| 13 | [13-pdf-reporting.md](13-pdf-reporting.md) | iText PDF generation, settings, branding |
| 14 | [14-google-drive.md](14-google-drive.md) | Google Drive sign-in, folder select, upload status |
| 15 | [15-backup-import-export.md](15-backup-import-export.md) | Encrypted `.gmc` location backups, AES-GCM |
| 16 | [16-premium-billing.md](16-premium-billing.md) | Play Billing, 5 SKUs, ad removal |
| 17 | [17-ads.md](17-ads.md) | AdMob + AdX dual network, remote-config ad slots, placements |
| 18 | [18-analytics-engagement.md](18-analytics-engagement.md) | Analytics event taxonomy, OneSignal/FCM, notification campaigns |
| 19 | [19-onboarding-permissions-language.md](19-onboarding-permissions-language.md) | Splash/onboarding/permissions/19 languages |
| 20 | [20-settings-persistence.md](20-settings-persistence.md) | SP/SharePref/PreferenceKeys schemas, settings screens |
| 21 | [21-help-support.md](21-help-support.md) | FAQ, tutorials, user guide, error reports, email recipients |
| 22 | [22-native-code.md](22-native-code.md) | Native libraries, JNI bindings, Pairip VM |
| 23 | [23-security-privacy.md](23-security-privacy.md) | Network security, hardcoded keys, cleartext, anti-tamper |
| 24 | [24-third-party-sdks.md](24-third-party-sdks.md) | Complete SDK/dependency inventory |

## Evidence ledger (high level)

| Claim | Evidence | Confidence |
|---|---|---|
| Package identity/SDK/components | `ev_f4a6fdad…` (manifest), `_evidence/AndroidManifest.decoded.xml` | Observed |
| v2+v3 signing, Play stamp | `ev_5b321616…` | Observed (structural) |
| Archive inventory | `ev_864cbfe0…` | Observed |
| 130 app classes | `ev_3014f067…`, `_jadx/` decompile | Observed |
| Google Maps SDK (no osmdroid) | `ev_5532500e…`, `ev_e3573e6b…` | Observed |
| JNI declarations | `ev_b40080b9…`, split lib listing | Observed |
| Decoded resources/strings | `ev_d5fd4492…`, `_evidence/strings.json` | Observed |
| No Google Drive client classes | `ev_4f95cb29…`, `ev_0beaa957…` | Observed (static) |
| Weather/AQI endpoints + API key | `_jadx/…CameraActivity.java:18731,18798,19640` | Observed |
| Encrypted location backup | `_jadx/…CryptoUtils.java`, `…helper/utils.java:324,565` | Observed |
| Ad slots via Remote Config | `_jadx/…RemoteAdData.java` | Observed |

## Limitations

- APK not executed; no runtime behavior claimed.
- Pairip VM-protected methods (e.g., `Splash_Screen.onCreate`, one
  `CameraActivity` method) could not be decompiled — bodies unknown.
- Release obfuscation renamed most members; semantic names inferred from
  strings, layouts, and call structure.
- Drive upload: sign-in + scope + folder + toggle found, but **no upload code
  path exists in the Java layer** — likely unimplemented in this build or
  VM-protected. See `14-google-drive.md`.
- Signature inspection is structural only.

## Coverage

Every surface of the artifact, and where this report covers it.
A `n/a` or `gap` here is a statement about this report, not about
the app.

| Surface | Covered in |
| --- | --- |
| Identity & signing | 01-artifact-identity.md |
| Components & exported surface | 02-manifest-and-components.md |
| Permissions | 19-onboarding-permissions-language.md |
| Network & API surface | 24-third-party-sdks.md, 05-location-services.md, 07-maps.md |
| SDKs, ads & trackers | 24-third-party-sdks.md, 17-ads.md, 18-analytics-engagement.md |
| Native code & JNI | 22-native-code.md |
| Persistence & local data | 20-settings-persistence.md |
| Protection & obfuscation | 01-artifact-identity.md (Pairip) |
| Embedded config & shipped secrets | 23-security-privacy.md (weather API key) |
| Monetization | 16-premium-billing.md |
| Feature inventory | numbered docs 03–21 above |
| Updates & dynamic delivery | n/a — no update/dynamic-delivery mechanism documented |
| Privacy | 23-security-privacy.md |
