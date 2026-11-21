# iLovePDF — teardown report

| | |
| --- | --- |
| **Target** | `com.ilovepdf.www` (`base.apk`, 208 MiB) |
| **Version** | 4.2.3 (versionCode 4002003, minSdk 32, targetSdk 36, compileSdk 37) |
| **SHA-256** | `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41` |
| **Platform** | Android |
| **Method** | static |
| **Analyzed** | unknown |
| **Tools** | REA · JADX headless 0.7.1 · JADX 1.5.6 · aapt2/apkanalyzer · ELF inspection |
| **Obtained** | local archive |
| **Analyst** | @mitunmanav |

**Splits:** base.apk (208 MiB), split_config.arm64_v8a.apk, .en, .xxhdpi
**Signature:** v2+v3, cert `d36aa4f8…891c`, Play source stamp, self-consistent

## What this is

PDF toolkit app — 27 document tools (merge, split, compress, convert, OCR,
sign, edit) mixing on-device processing with remote task APIs. Never
executed.

> ⚠️ Every finding in this tree comes from the iLovePDF APK listed above
> (decompile at `../_analysis/jadx-src/`, dumps in `../_analysis/`).
> No other APK's artifacts were read or cited. All claims are static
> observations — the app was never executed; runtime/Remote-Config behavior
> is unknown unless marked.

## Method
REA toolchain (`inspect_apk_signature` ev_fa762812…, `inspect_android_package`
ev_81cb0b1a…, JADX headless-mcp 0.7.1) + local JADX 1.5.6 slim-DEX decompile
(9,274 classes) + aapt2/apkanalyzer dumps + ELF symbol inspection, per the
`reverse-engineer-anything` workflow.

## Counts
- **27 document tools** — 7 offline-capable (Merge, Split, Rotate, Protect,
  Repair, Image→PDF, OCR-text), 20 remote-classified; 1 premium tool (OCR PDF).
- **18 app-feature modules** — 9 offline-capable, 9 requiring network.
- ~200 manifest components, 18 DEX, 28 native libs, ~1,900 strings, 14 locales.

## Layout of this report
### Platform — `platform/` (how the app works)
| File | Covers |
|---|---|
| 00-package-and-signature | identity, cert, splits |
| 01-manifest-and-components (+components-table) | every component & intent filter |
| 02-architecture | layers, DI, execution routing |
| 03-native-libraries | .so inventory, K1 exports, JNI bridge |
| 04-third-party-sdks | Nutrient, Genius, Tesseract, ML Kit, MSAL… |
| 05-permissions-and-security | permission map, cleartext rules |
| 06-persistence | Room schema, workers, file layout |
| 07-network-and-api | endpoints, task lifecycle, params |
| 08-data-processing | input→params→engine→output pipeline |
| 09-known-limitations | what static analysis could not prove |
| 10-feature-inventory | offline/online classification of everything |
| 11-coverage-ledger | question→file checklist, resolved/unresolved |
| 12-screen-map | all 125 components, grouped by package |
| 13-navigation-map | nav graphs, tool→graph routing, deep links |

### Tools — `tools/` (27 files, one per tool)
`tools/README.md` = matrix + links. Each file documents UI entry, params,
local engine and/or remote task, output flow.

### App features — `features/` (20 files)
home-tools, scanner, companion-scanner, file-manager, cloud-providers,
accounts-auth, premium-billing, pdf-reader, image-viewer-editor, widgets,
intents-sharing, settings, analytics-onboarding, support-helpdesk,
background-workers, qr-codes, downloads, language-i18n, crash-handling,
promo-news — each with "how it
works" (classes → flow → storage/network).

## Findings

- **[obs]** Hybrid execution: 7 of 27 document tools run fully offline (Merge, Split, Rotate, Protect, Repair, Image→PDF, OCR-text); 20 are classified remote — files leave the device for those.
- **[obs]** 18 app-feature modules, split roughly half offline / half network-required; OCR PDF is the premium tool.
- **[obs]** ~200 manifest components, 18 DEX, 28 native libs, 14 locales.

## Limitations

Static-only — the app was never executed; remote-task behavior, Remote
Config values and server responses are unknown unless marked. Per-file
coverage notes live in `platform/` and `features/`.

## Coverage

Every surface of the artifact, and where this report covers it.
A `n/a` or `gap` here is a statement about this report, not about
the app.

| Surface | Covered in |
| --- | --- |
| Identity & signing | platform/00-package-and-signature.md |
| Components & exported surface | platform/01-manifest-and-components.md |
| Permissions | platform/05-permissions-and-security.md |
| Network & API surface | platform/07-network-and-api.md |
| SDKs, ads & trackers | platform/04-third-party-sdks.md |
| Native code & JNI | platform/03-native-libraries.md |
| Persistence & local data | platform/06-persistence.md |
| Protection & obfuscation | platform/02-architecture.md |
| Embedded config & shipped secrets | platform/07-network-and-api.md |
| Monetization | features/premium-billing.md |
| Feature inventory | platform/10-feature-inventory.md |
| Updates & dynamic delivery | n/a — no update/dynamic-delivery mechanism documented |
| Privacy | platform/08-data-processing.md |
