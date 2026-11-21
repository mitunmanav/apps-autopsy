# Ola Cabs — teardown report

| | |
| --- | --- |
| **Target** | `com.olacabs.customer` (`base.apk` + 3 splits) |
| **Version** | 7.6.2 (versionCode 70602010, minSdk 26, targetSdk 36) |
| **SHA-256** | `bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3` (base.apk) |
| **Platform** | Android |
| **Method** | static |
| **Analyzed** | unknown |
| **Tools** | REA · JADX headless 0.7.1 · binary parsers |
| **Obtained** | local archive |
| **Analyst** | @mitunmanav |

## Artifact set analyzed

| File | SHA-256 | Role |
|---|---|---|
| `base.apk` | `bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3` | 74,972,855 bytes; code, manifest, resources, JS bundle |
| `split_config.arm64_v8a.apk` | `0bc033556f4027cfda3bd49dd3eea3484e287847ba3457d0229699d99506ea99` | 13 arm64 `.so` libraries |
| `split_config.en.apk` | `548005770f7232f2472bb611e42e8cf9972c85fb5411a2c4d0ee21613159f697` | English resources |
| `split_config.xxhdpi.apk` | `4aabbb622ae6a94afc3d1efd317dc9b96b6c508cfad78f126d8b4bb6a4d35b90` | xxhdpi resources |

## Method

REA (JADX headless bridge 0.7.1, binary parsers) against `base.apk` plus extracted arm64 libraries. Sequence: package/manifest inspection → signature structure → archive inventory → resource/string decode → class search → targeted class/method decompilation → reference tracing → JNI declaration inventory → ELF hardening/exports. All claims are tagged **obs** (observed in artifact), **inf** (inference from code evidence), or **unk** (unknown).

## Headline numbers (all verified, see `platform/coverage-ledger.md`)

| Metric | Value |
|---|---|
| DEX files | 6 (`classes*.dex`) |
| Classes (JADX load) | 32,228 |
| Methods (JNI scan scope) | 335,109 across 59,475 class records |
| Resources | 5,412 |
| String-table entries decoded | 3,283 valid (16 omitted, 3 pages) |
| Manifest components | 113 activities · 31 services · 29 receivers · 7 providers |
| Native libraries (arm64) | 13 |
| JNI `native` declarations | 941 |
| URL hosts / path families | ~60 endpoints, see `platform/network-api.md` |
| Report files | 31 (this index + 13 platform + 10 tools + 7 features) |

## What this is

Large multi-DEX ride-hailing + fintech super-app. Kotlin/Java core partially R8-obfuscated; one embedded React Native surface (payments, Hermes bytecode); MapLibre/Ola Maps stack; Firebase + MiPush + MoEngage notifications; Juspay HyperSDK, Razorpay UPI Turbo, NPCI CL, PayU, Amazon Pay payment SDKs; an entire Ola Money wallet/lending stack (`olamoneyrest`); Room + Volley disk cache + Proto DataStore persistence; certificate pinning on `apps2.olacabs.com`; RootBeer native root-checker; CodePush OTA.

## Layout of this report

### platform/
- [manifest-components.md](platform/manifest-components.md) — all 180 components, exported surface, intent filters, deeplinks
- [architecture.md](platform/architecture.md) — layering, engines, obfuscation, entry graph
- [native-libs-jni.md](platform/native-libs-jni.md) — 13 `.so` files, exports, hardening, JNI status
- [sdks.md](platform/sdks.md) — third-party SDK inventory with evidence
- [permissions.md](platform/permissions.md) — declared permissions grouped by purpose
- [persistence.md](platform/persistence.md) — Room, Volley disk cache, DataStore, SharedPreferences
- [network-api.md](platform/network-api.md) — hosts, path families, auth headers, pinning
- [data-pipeline.md](platform/data-pipeline.md) — analytics/telemetry/event flow (Sherlock, Watson, batcher)
- [offline-online.md](platform/offline-online.md) — per-feature offline/online classification
- [screen-map.md](platform/screen-map.md) — activity inventory mapped to user screens
- [navigation-map.md](platform/navigation-map.md) — entry points, deeplink routing, web surfaces
- [limitations.md](platform/limitations.md) — what static analysis could not establish
- [coverage-ledger.md](platform/coverage-ledger.md) — tool runs, failures, coverage, verification checklist

### tools/ (per user-facing tool: entry → params → execution path → local vs remote)
- [ride-booking.md](tools/ride-booking.md) — cab/auto/bike booking incl. driver bidding
- [maps-navigation.md](tools/maps-navigation.md) — Ola Maps/MapLibre, turn-by-turn nav service
- [share-live-location.md](tools/share-live-location.md) — MQTT live trip sharing
- [sos-safety.md](tools/sos-safety.md) — SOS flow
- [payments-ride.md](tools/payments-ride.md) — ride payment/instrument selection, RN payment shell
- [ola-money.md](tools/ola-money.md) — wallet, postpaid, recharge, BBPS, P2P, merchant pay, loans
- [upi.md](tools/upi.md) — UPI VPA management, Razorpay Turbo, NPCI pin
- [scan-pay-qr.md](tools/scan-pay-qr.md) — QR reader
- [corporate-rides.md](tools/corporate-rides.md) — corporate expense tagging
- [support-web.md](tools/support-web.md) — self-serve help, webviews

### features/ (per code module, same depth)
- [auth-identity.md](features/auth-identity.md) — login/OTP/password/2-step verification
- [react-native-payments.md](features/react-native-payments.md) — Hermes bundle + PaymentReactActivity
- [olamoneyrest-stack.md](features/olamoneyrest-stack.md) — wallet REST client, endpoints, headers, entities
- [notifications-push.md](features/notifications-push.md) — FCM, MiPush, MoEngage, Connect inbox
- [analytics-telemetry.md](features/analytics-telemetry.md) — Watson/Sherlock models, batcher, Firebase, AppsFlyer, Primer
- [security-hardening.md](features/security-hardening.md) — pinning, RootBeer, signature blocks, ELF hardening
- [update-delivery.md](features/update-delivery.md) — in-app update, Play asset packs, CodePush

## Evidence handling

Evidence IDs cited as `ev_<64hex>` are REA artifacts retained for this session. Embedded keys/tokens listed in `platform/network-api.md` and `sdks.md` are shipped client configuration strings, **not** verified secrets; no claim is made about server-side validity or confidentiality.

## Findings

- **[obs]** Ride-hailing + fintech super-app: cab/auto/bike booking plus a full Ola Money wallet/lending stack (`olamoneyrest`), UPI, BBPS, P2P and merchant pay.
- **[obs]** One embedded React Native surface (payments, Hermes bytecode); MapLibre/Ola Maps stack for maps+navigation.
- **[obs]** Certificate pinning on `apps2.olacabs.com`, RootBeer native root-checker, CodePush OTA; 941 JNI `native` declarations across 13 arm64 `.so` files.

## Limitations

Static only — the APK was never installed or run; no ADB, emulator, proxy or
network capture exists, and nothing in this report describes observed
runtime behavior. What static analysis could not establish:
[platform/limitations.md](platform/limitations.md); coverage and tool
failures: [platform/coverage-ledger.md](platform/coverage-ledger.md).

## Coverage

Every surface of the artifact, and where this report covers it.
A `n/a` or `gap` here is a statement about this report, not about
the app.

| Surface | Covered in |
| --- | --- |
| Identity & signing | platform/manifest-components.md + artifact table above |
| Components & exported surface | platform/manifest-components.md |
| Permissions | platform/permissions.md |
| Network & API surface | platform/network-api.md |
| SDKs, ads & trackers | platform/sdks.md |
| Native code & JNI | platform/native-libs-jni.md |
| Persistence & local data | platform/persistence.md |
| Protection & obfuscation | features/security-hardening.md (pinning, RootBeer) |
| Embedded config & shipped secrets | platform/network-api.md, platform/sdks.md (client config, unverified) |
| Monetization | tools/ola-money.md, tools/payments-ride.md |
| Feature inventory | features/ + tools/ indexes above |
| Updates & dynamic delivery | features/update-delivery.md |
| Privacy | platform/data-pipeline.md |
