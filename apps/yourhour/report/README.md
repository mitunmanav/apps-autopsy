# YourHour — teardown report

| | |
| --- | --- |
| **Target** | `com.mindefy.phoneaddiction.mobilepe` (`base.apk`, 36,936,776 bytes) |
| **Version** | 4.5.6 (versionCode 458, minSdk 32, targetSdk 36) |
| **SHA-256** | `84483c4b53f3e4c8e0b32abefd577611a20a74b5bd70b79dc23c0912f2afa4ee` |
| **Platform** | Android |
| **Method** | static |
| **Analyzed** | unknown |
| **Tools** | REA · jadx · apktool · DEX string-mining |
| **Obtained** | local archive |
| **Analyst** | @mitunmanav |

**Splits:** `split_config.arm64_v8a.apk` (native `.so` ×2 + Play stamp), `split_config.xxhdpi.apk` (density resources)
**Vendor:** Mindefy Technologies, Indore, India · `yourhourapp.com` · `mind-e-fy.com`

## What this is

YourHour is a digital-wellbeing / screen-time tracker. Core loop: a persistent foreground
service polls Android `UsageStatsManager`, counts unlocks, computes per-app and whole-phone
usage, and renders dashboards/reports. Around that engine sits a large feature surface:
per-app limits + auto-lock, app categories, challenges (Diet / Fast / No-Phone), floating
timer overlay, Mindful Pause interstitials, an accessibility-driven **Reel/Shorts blocker**,
home-screen widgets, a badge gamification system, community stories, data export, and a
remote **parental-control platform that pairs the phone with a companion Android TV app**
(short-code pairing, remote app locks, temporary-unlock overrides, pushed action
notifications) backed by `https://tv-api.yourhourapp.com/api/v1/`.

## Findings

- **[obs]** The tracking engine is a persistent foreground service polling `UsageStatsManager` — unlock counts, per-app and whole-phone usage — behind dashboards, per-app limits and auto-lock.
- **[obs]** An accessibility-driven Reel/Shorts blocker + floating timer overlay + Mindful Pause interstitials enforce the limits.
- **[obs]** A remote parental-control platform pairs the phone with a companion **Android TV app** (short-code pairing, remote app locks, temporary-unlock overrides) backed by `tv-api.yourhourapp.com/api/v1/` — undocumented on the store page.

## Packaging & protection

- Signed with **v2 + v3** schemes, one signer, cert SHA-256 `3682aca2…84f6`, Google Play
  **source stamp** present → genuine Play Store build.
- **`com.pairip.application.Application`** — Google Play *Integrity Protection* (pairip)
  wraps the real app (`com.mindefy…YourHour`) and adds `LicenseActivity` +
  `com.android.vending.CHECK_LICENSE`.
- **R8-obfuscated**: manifest-declared classes keep names; all other app code (~800 classes)
  is repackaged into `defpackage.*` alongside obfuscated ad-SDK code (11,438 classes there).
  Domain model recovered via surviving Kotlin `toString` templates, string literals, Room
  SQL and analytics event names.
- Application flags: `largeHeap`, `allowBackup`, `fullBackupOnly`, `extractNativeLibs=false`,
  `requestLegacyExternalStorage`, `appCategory=productivity`, `configChanges=locale`.

## Layout of this report

```
analysis/
├── README.md            ← this index + methodology + caveats
├── 01-overview/         what the app is and how it's built
├── 02-features/         one file per user-facing feature
├── 03-analysis/         cross-cutting deep dives (data, ads, engine, security)
├── 04-security/         severity-rated findings + leak matrices
└── 05-reference/        raw evidence inventories (schemas, components, APIs, SDKs)
```

## 01 — Overview

| File | Scope |
|---|---|
| [00 — Identity & packaging](01-overview/00-identity-packaging.md) | package, signing, splits, pairip, R8, manifest internals, localization |
| [01 — Architecture](01-overview/01-architecture.md) | tech stack, DI/service-locator, threading, app layers |
| [02 — Data layer](01-overview/02-data-layer.md) | Room (17 tables), SharedPreferences, files, backup, real DAO SQL |
| [03 — Permissions & privacy](01-overview/03-permissions-privacy.md) | every permission, usage-access flow, what leaves the device |

## 02 — Features (one file each)

| File | Scope |
|---|---|
| [10 — Usage tracking](02-features/10-usage-tracking.md) | UsageTimerService, event pipeline, digest engine, state machines, heartbeats |
| [11 — Dashboard](02-features/11-dashboard.md) | dashboard cards, 6-level addiction ladder + confetti level-up, feeds |
| [12 — App management](02-features/12-app-management.md) | per-app settings, Manage Apps, app detail report |
| [13 — Reports](02-features/13-reports.md) | daily/weekly/monthly, timeline, PDF, carbon footprint, usage pattern, "Happy Time" |
| [14 — Challenges](02-features/14-challenges.md) | Diet/Fast/No-Phone, schedules, reminders, custom challenges |
| [15 — Categories](02-features/15-categories.md) | built-in + custom categories, category limits/reports |
| [16 — Overlays](02-features/16-overlays.md) | floating timer + Mindful Pause overlay state machines |
| [17 — Reel blocker](02-features/17-reel-blocker.md) | accessibility service, per-app detectors, block overlay |
| [18 — Parental control](02-features/18-parental-control.md) | TV pairing, remote locks, overrides, PIN, device admin, account |
| [19 — Widgets](02-features/19-widgets.md) | 3 Glance widgets + refresh pipeline |
| [20 — Notifications](02-features/20-notifications.md) | channels, reminders, FCM, action notifications |
| [21 — Premium & monetization](02-features/21-premium-monetization.md) | SKUs, entitlements, offers, rewarded-8h, ads stack, student pass |
| [22 — Profile & badges](02-features/22-profile-badges.md) | profile, avatar, full 21-badge catalog with names & thresholds |
| [23 — Stories & feed](02-features/23-stories-feed.md) | story submission/read/vote, in-app feed, PII stored |
| [24 — Onboarding & lifecycle](02-features/24-onboarding-lifecycle.md) | splash, intro v3, welcome, permissions UX, force update, account |
| [25 — Settings](02-features/25-settings.md) | every settings screen, goals, appearance, language, day-start, FAQ/PIN |
| [26 — Import & export](02-features/26-import-export.md) | XLS export, DB backup/restore, Drive upload |
| [27 — Developer console](02-features/27-developer-console.md) | hidden dev/debug surface |

## 03 — Cross-cutting analysis

| File | Scope |
|---|---|
| [28 — Integrations](03-analysis/28-integrations.md) | Firebase suite, 17-network ad mediation, Facebook, billing, pairip |
| [29 — Security exposure](03-analysis/29-security-exposure.md) | exported surface, embedded secrets, logging, hardening notes |
| [30 — Data collection](03-analysis/30-data-collection.md) | complete inventory: on-device, backend, Firebase, ads, PII; 287-event catalog |
| [31 — Tracking-engine analysis](03-analysis/31-tracking-engine-analysis.md) | how screen-time tracking works, wrong-way vs event-replay, residual limits |
| [32 — Ad placement map](03-analysis/32-ad-placement-map.md) | all 28 ad slots mapped to screens, rewarded mechanics, dark patterns |

## 04 — Security — [index](04-security/README.md)

| File | Scope |
|---|---|
| [README](04-security/README.md) | severity-rated findings index S1–S18 + leak summary |
| [secrets-storage](04-security/secrets-storage.md) | plaintext PIN, unencrypted tokens, shipped secrets |
| [data-leaks](04-security/data-leaks.md) | full leak matrix: by design / by weakness / by platform |
| [transport-network](04-security/transport-network.md) | no NSC/pinning, BASIC header logging, token handling |
| [feature-bypass](04-security/feature-bypass.md) | client-side gates, paid-PIN-reset flag, reel bypass, cosmetic device admin |
| [attack-surface](04-security/attack-surface.md) | exported components, deep links, WebViews, embedded DEX, FileProvider |

## 05 — Reference (raw evidence inventories)

| File | Scope |
|---|---|
| [components](05-reference/components.md) | all 160 declared components (104 act / 21 svc / 28 rcv / 7 providers) |
| [database-schema](05-reference/database-schema.md) | real CREATE TABLEs for all 17 Room tables |
| [api](05-reference/api.md) | full API surface: GET/POST/DELETE per endpoint + params |
| [api-fields](05-reference/api-fields.md) | complete API JSON schema (~180 wire fields) |
| [binary-contents](05-reference/binary-contents.md) | dex/lib/assets/raw/fonts/splits/resources inventory |
| [third-party-sdks](05-reference/third-party-sdks.md) | **17-network** ad mediation census + all SDKs |

## Method & evidence

| Evidence ID (REA) | What it covers |
|---|---|
| `ev_0f771a18…a3f6` | `inspect_android_package` — manifest, permissions, identity |
| `ev_ddd183dc…ffd0a` | `search_android_classes` — app class inventory |
| `ev_b778e7f9…a632d` | `decode_android_resources` — manifest + 1,675 strings |
| `ev_47f937ee…7358` | `inspect_apk_signature` — v2/v3 signer + source stamp |
| `ev_7580c011…f834` | `inspect_android_package` (final pass) — 162 components, export/permission map, all 30 permissions |
| `ev_748e8b72…b902` | `audit_release_exposure` — shipped-artifact checks (mostly n/a for APK; credential-marker scan skipped by allowance) |

Plus: full local jadx decompile (25,938 sources; 136 named app classes ≈ 20.7 KLOC),
apktool resource decode (530 layouts, 9 xml configs, ~90 locales), and DEX string-mining
(667 `toString` templates, 167 SQL strings, endpoint paths, analytics event names, pref keys).

## Limitations

- **Static analysis only** — the app was never executed; no runtime/device testing.
- No TLS proxy/certificate-chain inspection; pinning and production logger config unverified.
- No server-side authorization testing against `tv-api.yourhourapp.com`.
- Third-party SDK presence ≠ proof a field is transmitted — capabilities vs observed calls
  are distinguished per file.
- JADX truncation/obfuscation noted where hit (e.g. addiction thresholds in `f0().B`,
  carbon-footprint formula, `CarbonFootprintActivity` is a 1KB R8 shell).

## Coverage

Every surface of the artifact, and where this report covers it.
A `n/a` or `gap` here is a statement about this report, not about
the app.

| Surface | Covered in |
| --- | --- |
| Identity & signing | 01-overview/00-identity-packaging.md |
| Components & exported surface | 05-reference/components.md |
| Permissions | 01-overview/03-permissions-privacy.md |
| Network & API surface | 04-security/transport-network.md, 05-reference/api.md |
| SDKs, ads & trackers | 05-reference/third-party-sdks.md, 03-analysis/32-ad-placement-map.md |
| Native code & JNI | 05-reference/binary-contents.md |
| Persistence & local data | 01-overview/02-data-layer.md, 05-reference/database-schema.md |
| Protection & obfuscation | 04-security/attack-surface.md (Pairip, R8) |
| Embedded config & shipped secrets | 04-security/secrets-storage.md |
| Monetization | 02-features/21-premium-monetization.md |
| Feature inventory | 02-features/ docs 10–27 |
| Updates & dynamic delivery | n/a — no update/dynamic-delivery mechanism documented |
| Privacy | 01-overview/03-permissions-privacy.md, 03-analysis/30-data-collection.md |
