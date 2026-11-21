# Arrow Puzzle — teardown report

| | |
| --- | --- |
| **Target** | `com.easybrain.arrow.puzzle.game` (`base.apk`) |
| **Version** | 1.13.0 (versionCode 11300027, minSdk 26, targetSdk 36) |
| **SHA-256** | `3e86c708abeb06ae7885f9bdf0d4d4c149f8a7b4a90580eb6e07e5e5540b97f0` |
| **Platform** | Android |
| **Method** | static |
| **Analyzed** | unknown |
| **Tools** | REA 6.9.0 · JADX headless 0.7.1 · apktool 2.7.0 probe |
| **Obtained** | local archive |
| **Analyst** | @mitunmanav |

## What this is

Casual arrow-path puzzle game by EasyBrain, built on Unity (IL2CPP). This
report covers `base.apk` only — the manifest declares
`requiredSplitTypes=base__abi`, so the ABI split is outside this artifact's
scope.

## Findings

Claims are tagged [Observation], [Inference] or [Unknown]; names alone are
not treated as behavior evidence.

- [Observation] Unity IL2CPP build — managed game code ships as IL2CPP metadata, not plain DEX.
- [Observation] 17 DEX paths, including 2 under `assets/audience_network` (Meta Audience Network ads SDK).
- [Observation] 185 manifest components; 341 JNI declarations with 0 resolved bindings.

## Method
- [Observation] Relevant REA MCP operations covered package/manifest, artifact inventory, signature, JNI, Android class/method source and references, Unity IL2CPP metadata, application graph, extraction, and evidence/unknown ledgers.
- [Observation] Analysis engines reported REA 6.9.0 and JADX 0.7.1. Apktool probe reported 2.7.0-dirty; resource decoding was skipped because patch provenance was not verified.
- [Observation] Upstream REA docs read: [Android analysis](https://github.com/morluto/rea/blob/main/docs/guides/android/android-analysis.md), [resource analysis](https://github.com/morluto/rea/blob/main/docs/guides/android/apktool-resource-analysis.md), [IL2CPP metadata](https://github.com/morluto/rea/blob/main/docs/il2cpp-metadata.md).
- [Observation] Other MCP tool families unrelated to static APK analysis were not invoked.

## Exact counts

| [Observation] Item | Count/value |
|---|---:|
| [Observation] Package classes | 55,442 |
| [Observation] Android resources | 2,998 |
| [Observation] Declared permissions | 17 |
| [Observation] Manifest components | 185 (132 activities, 17 providers, 17 services, 19 receivers) |
| [Observation] DEX paths | 17 (15 root + 2 assets/audience_network) |
| [Observation] JNI declarations / candidates / bindings | 341 / 0 / 0 |
| [Observation] IL2CPP metadata | 31 sections; 92 images; 14,755 types; 96,746 methods; 63,191 fields; 17,278 properties; 732 events; 98,745 parameters; 16,349 literals |
| [Observation] Artifact graph | 2,799 nodes; 2,999 occurrences; 2,998 edges; 0 integrity contradictions |
| [Observation] Markdown pages | 63 total: 11 platform, 15 tools, 36 features, 1 README |
| [Observation] Open Unknowns | 3 |

## Layout of this report

### Platform
- [Observation] [Architecture Native Jni](platform/architecture-native-jni.md) — report page.
- [Observation] [Coverage Limitations](platform/coverage-limitations.md) — report page.
- [Observation] [Data Pipeline](platform/data-pipeline.md) — report page.
- [Observation] [Identity](platform/identity.md) — report page.
- [Observation] [Manifest Components](platform/manifest-components.md) — report page.
- [Observation] [Navigation Map](platform/navigation-map.md) — report page.
- [Observation] [Network Api](platform/network-api.md) — report page.
- [Observation] [Offline Online](platform/offline-online.md) — report page.
- [Observation] [Persistence](platform/persistence.md) — report page.
- [Observation] [Screen Map](platform/screen-map.md) — report page.
- [Observation] [Sdks Permissions](platform/sdks-permissions.md) — report page.

### Tools
- [Observation] [Android Ads](tools/android-ads.md) — report page.
- [Observation] [Android Analytics](tools/android-analytics.md) — report page.
- [Observation] [Android App Update](tools/android-app-update.md) — report page.
- [Observation] [Android Billing](tools/android-billing.md) — report page.
- [Observation] [Android Bridge Deeplink](tools/android-bridge-deeplink.md) — report page.
- [Observation] [Android Consent](tools/android-consent.md) — report page.
- [Observation] [Android Cross Promo](tools/android-cross-promo.md) — report page.
- [Observation] [Android Identification](tools/android-identification.md) — report page.
- [Observation] [Android Lifecycle](tools/android-lifecycle.md) — report page.
- [Observation] [Android Metrics](tools/android-metrics.md) — report page.
- [Observation] [Android Rate Dialog](tools/android-rate-dialog.md) — report page.
- [Observation] [Android Stability](tools/android-stability.md) — report page.
- [Observation] [Game Eraser](tools/game-eraser.md) — report page.
- [Observation] [Game Hint](tools/game-hint.md) — report page.
- [Observation] [Game Magic Stick](tools/game-magic-stick.md) — report page.

### Features
- [Observation] [Assembly Csharp](features/assembly-csharp.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Achievements](features/easybrain-achievements.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Awards](features/easybrain-awards.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Backend](features/easybrain-backend.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Core](features/easybrain-core.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Daily Challenge](features/easybrain-daily-challenge.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Ebcs](features/easybrain-ebcs.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Ebr](features/easybrain-ebr.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Egas](features/easybrain-egas.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Esm Checkpoint](features/easybrain-esm-checkpoint.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Event Preparation](features/easybrain-event-preparation.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Events Core](features/easybrain-events-core.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Events Map Common](features/easybrain-events-map-common.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Events Map Simple](features/easybrain-events-map-simple.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Events Postcard](features/easybrain-events-postcard.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Ggps](features/easybrain-ggps.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Gradual Conditions](features/easybrain-gradual-conditions.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Local Data Storage](features/easybrain-local-data-storage.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Localization Binary Providers](features/easybrain-localization-binary-providers.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Localization](features/easybrain-localization.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Modifiers Core](features/easybrain-modifiers-core.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Network Client](features/easybrain-network-client.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Purchases](features/easybrain-purchases.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Rate Us](features/easybrain-rate-us.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Rewarded](features/easybrain-rewarded.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Serializer](features/easybrain-serializer.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Sound Engine](features/easybrain-sound-engine.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Themes](features/easybrain-themes.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Tournaments](features/easybrain-tournaments.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Ui Banners Banner](features/easybrain-ui-banners-banner.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Ui Banners Easybanner](features/easybrain-ui-banners-easybanner.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Ui Banners Scroller](features/easybrain-ui-banners-scroller.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Ui Elements](features/easybrain-ui-elements.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Ui Widgets](features/easybrain-ui-widgets.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Ui](features/easybrain-ui.md) — IL2CPP image row and type count.
- [Observation] [Easybrain Wrappers](features/easybrain-wrappers.md) — IL2CPP image row and type count.

## Evidence
- [Observation] Full REA evidence and Unknown ledger: [evidence_bundle.json](evidence_bundle.json).
- [Observation] Coverage gaps and open Unknown IDs: [coverage-limitations](platform/coverage-limitations.md).
## Verification checklist

- [x] [Observation] Package and SHA-256 stamps match on all 63 Markdown pages; the selected base.apk recomputes to 3e86c708abeb06ae7885f9bdf0d4d4c149f8a7b4a90580eb6e07e5e5540b97f0.
- [x] [Observation] All 64 internal Markdown links resolve; the three external links point to REA documentation.
- [x] [Observation] All report body/record lines are tagged; verification found 0 untagged claim lines.
- [x] [Observation] Markdown references exactly one APK name, base.apk; no other APK is cited or analyzed.
- [x] [Observation] Report totals are 63 Markdown files: 11 platform, 15 tools, 36 features, and 1 README; the manifest inventory contains 185 component rows.
- [x] [Observation] evidence_bundle.json contains 392 evidence records and 3 Unknowns; exported size is 27,008,743 bytes.

## Limitations

Static-only analysis — the APK was never executed, no network endpoint was
contacted, and no runtime behavior is asserted. The ABI split
(`requiredSplitTypes=base__abi`) is outside this artifact's scope. Tool gaps
and open Unknown IDs: [platform/coverage-limitations.md](platform/coverage-limitations.md).

## Coverage

Every surface of the artifact, and where this report covers it.
A `n/a` or `gap` here is a statement about this report, not about
the app.

| Surface | Covered in |
| --- | --- |
| Identity & signing | platform/identity.md |
| Components & exported surface | platform/manifest-components.md |
| Permissions | platform/sdks-permissions.md |
| Network & API surface | platform/network-api.md |
| SDKs, ads & trackers | platform/sdks-permissions.md |
| Native code & JNI | platform/architecture-native-jni.md |
| Persistence & local data | platform/persistence.md |
| Protection & obfuscation | platform/architecture-native-jni.md (IL2CPP) |
| Embedded config & shipped secrets | platform/network-api.md |
| Monetization | tools/android-billing.md, tools/android-ads.md |
| Feature inventory | features/ + tools/ indexes below |
| Updates & dynamic delivery | tools/android-app-update.md |
| Privacy | platform/data-pipeline.md |
