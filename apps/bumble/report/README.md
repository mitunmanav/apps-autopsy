# Bumble — teardown report

| | |
| --- | --- |
| **Target** | `com.bumble.app` (`base.apk`, 111,964,968 bytes) |
| **Version** | 5.492.0 (versionCode 4139, minSdk 32, targetSdk 36) |
| **SHA-256** | `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2` |
| **Platform** | Android |
| **Method** | static |
| **Analyzed** | unknown |
| **Tools** | REA · JADX headless 0.7.1 · apktool 2.7.0 · `strings` |
| **Obtained** | local archive |
| **Analyst** | @mitunmanav |

Companion splits (same package and source-stamp cert, not separately
analyzed): `split_config.arm64_v8a.apk` `7b3846b4…de34`,
`split_config.en.apk` `75a6ab29…d9d97`, `split_config.xxhdpi.apk`
`97df5cdb…0d70`.

## What this is

Bumble dating app — swipe/match/chat dating with BFF and Bizz modes. This
report covers `base.apk`; the app was never executed and no runtime claim
is made anywhere.

## Counts (verified)

| Metric | Value | Source |
|---|---|---|
| DEX files | 10 (`classes`…`classes10`) | `project_android_application_graph` ev_b454821a |
| Classes | 81,378 top-level | `inspect_android_package` ev_95e134db |
| Methods scanned (JNI pass) | 518,349 / 148,911 class entries | ev_d0581bd6 |
| Resources | 4,830 (4,831 ZIP occurrences incl. dir meta) | same + `inspect_artifact` ev_3ede306f |
| Manifest components | 296 = 222 activities, 33 services, 23 receivers, 18 providers | manifest parse |
| Exported components | 19 | manifest parse |
| `uses-permission` | 61 (+2 signature-level perms defined) | manifest |
| `SERVER_*` RPC verbs | 640 unique | DEX strings |
| `com.bmbl.b4f.*` proto services | 39 API names in 18 domains | DEX strings + class search |
| Native JNI declarations | 322 (all unmatched — libs ship in ABI split) | `inspect_android_jni_bindings` ev_d0581bd6 |
| Native `.so` libs | 11, all in `split_config.arm64_v8a.apk` | ZIP listing |
| Signing schemes | v2+v3, 1 signer, Play source stamp, self-consistent | `inspect_apk_signature` ev_d0d4bbe3 |
| Room/SQLite DBs | ≥4: SpiderwebDatabase, Stream-Chat store, WorkManager, Google DataTransport `offline_signal_*` | DEX SQL strings |

## How to read this report

- **[obs]** = directly in the shipped artifact (string, manifest entry, class, model field). **[inf]** = inference from observed parts. **[unk]** = not established.
- **REA** = the reverse-engineering toolkit used (JADX decompile, manifest/inventory inspectors). `ev_*` IDs = exported REA evidence records, resolvable via `evidence-bundle*.rea.json` in this directory and raw mined files under `../.work/` (e.g. `server_api_methods.txt`, `dex_strings.txt`, `manifest.xml`).
- **B4F** = `com.bmbl.b4f.*`, the generated protobuf/gRPC/Connect API layer ("bumble for …" naming unknown). **BAPI** = the legacy Badoo HTTPS RPC layer that dispatches `SERVER_*` string verbs.
- **prematch** = the post-match, pre-first-message window (the "who opens first" period, ~24h per shipped copy).
- **String taxonomy**: `SERVER_*` legacy RPC verbs; `MINOR_FEATURE_*`/`ALLOW_*` feature-flag names (flag state is server-side — presence ≠ enabled); `ELEMENT_*`/`CLIENT_*` analytics/UI element keys; `PROMO_BLOCK_TYPE_*` paywall-block types; `*_Api` B4F service names. "(no `SERVER_X` verb)" = checked against the 640-verb catalog and absent.

## Layout of this report

- [`platform/`](platform/) — artifact-level facts: [manifest-components](platform/manifest-components.md), [architecture](platform/architecture.md), [native-libs-jni](platform/native-libs-jni.md), [sdks](platform/sdks.md), [permissions](platform/permissions.md), [persistence](platform/persistence.md), [network-api](platform/network-api.md), [data-pipeline](platform/data-pipeline.md), [offline-online](platform/offline-online.md), [limitations](platform/limitations.md), [coverage-ledger](platform/coverage-ledger.md), [screen-map](platform/screen-map.md), [navigation-map](platform/navigation-map.md).
- [`tools/`](tools/) — user-facing paid/one-shot tools (14 files): [SuperSwipe](tools/superswipe.md), [Spotlight](tools/spotlight.md), [Beeline](tools/beeline.md), [subscriptions](tools/boost-premium-subscriptions.md), [Premium+](tools/premium-plus.md), [Backtrack](tools/backtrack.md), [Extend](tools/extend.md), [Rematch](tools/rematch.md), [Incognito](tools/incognito.md), [Travel](tools/travel-mode.md), [Advanced Filters](tools/advanced-filters.md), [Compliments](tools/compliments.md), [Notes](tools/notes.md), [Vote-cap](tools/votecap.md).
- [`features/`](features/) — 24 app-module files: [encounters](features/encounters.md), [matching](features/matching.md), [matchmaking-mechanics](features/matchmaking-mechanics.md) (deep-dive: likes/gender/monetization), [chat](features/chat.md), [video-calls](features/video-calls.md), [verification](features/verification.md), [profile](features/profile.md), [profile-visitors](features/profile-visitors.md), [profile-enrichment](features/profile-enrichment.md), [dating-hub](features/dating-hub.md), [speed-dating](features/speed-dating.md), [question-game](features/question-game.md), [bff-collective-hives](features/bff-collective-hives.md), [bizz-mode](features/bizz-mode.md), [opening-moves](features/opening-moves.md), [safety-moderation](features/safety-moderation.md), [safety-date-tools](features/safety-date-tools.md), [auth-onboarding](features/auth-onboarding.md), [notifications](features/notifications.md), [ads](features/ads.md), [paywall-promo-engine](features/paywall-promo-engine.md), [elise-ondevice-ml](features/elise-ondevice-ml.md), [gifts-rewards-referrals](features/gifts-rewards-referrals.md), [settings-travel-snooze](features/settings-travel-snooze.md).

## Findings

1. **[obs]** Bumble ships a dual-era codebase: a legacy Badoo-platform layer (`com.badoo.mobile.*`, 640 `SERVER_*` RPC verbs, `chatoff` chat) and a next-gen layer (`com.bumble2.*` routes, `com.bmbl.b4f.*` gRPC/protobuf APIs, `com.bumble.shared` KMP). R8-obfuscated (`b.*`, `a.*`) internals; entry/DI classes keep names.
2. **[obs]** Two chat stacks coexist: full GetStream SDK (contract models, providers/receiver/`io.getstream` classes — no `stream_chat_*` DDL found in strings — push delegate) alongside legacy `chatoff`. Whether this is mid-migration, scoped usage, or dead weight is [unk].
3. **[obs]** Monetization: 4 subscription product names (BoostLight, GoldTier, Premium, **Premium+**) + 5 consumables (Beeline, Compliment, Spotlight, SuperSwipe, Votecap). Payment rails shipped: Play Billing (+alternative billing), Stripe WebView, Braintree/PayPal, dLocal, Google Wallet, Plaid/iDEAL/Boleto, carrier billing, offerwall, credits auto top-up — 40+ payment `SERVER_*`/B4F billing APIs. Which rails are live per region is server/flag-gated [unk]; some (carrier billing, offerwall) may be dormant Badoo-era plumbing. ThreatMetrix device fingerprinting ships in payment flow.
4. **[obs]** On-device ML "Elise" downloads model+vocab to `_elise_assets/` via WorkManager (a text pipeline per model/vocab keys); private-detector (NSFW blur) + review-before-send ship in chat — attributing the image model to Elise is [inf].
5. **[obs]** WebRTC calling = own signaling (`SERVER_WEBRTC_*`) + `libjingle_peerconnection` + foreground `WebRtcService` with dual `TextureViewRenderer`s.
6. **[obs]** Verification stack: in-house photo verification, Veriff ID verification (`magic.veriff.me`, signature perm `VERIFF_STATUS_BROADCAST_PERMISSION`), student email flow, ML Kit face detection.
7. **[obs]** Trust/safety: Play Integrity token requests, Arkose Labs bot-defense JS+API, Sourcepoint CMP consent, `DETECT_SCREEN_CAPTURE`, allowBackup=false.
8. **[obs]** Deep data surface: Snowplow `com-bumble-prod1.collector.snplow.net`, Sentry DSN, Statsig flags, Braze (`sdk.iad-01.braze.com`), AppsFlyer — the app is heavily instrumented.

See `platform/coverage-ledger.md` for what was *not* covered and why.

**Verification pass 2:** a second independent review corrected ~20 shipped verb names (several `SERVER_*` names in pass 1 were paraphrases — now each cites the real verb or is marked "no such verb"), fixed the exported-activity count (12 not 14), reassigned `offline_signal_*` tables to Google DataTransport (not Sentry), removed non-declared permissions, and added previously-missed features: Premium+ tier, Profile Visitors, Bizz mode, Opening Moves, Share Date/live location, appeals pipeline, Au10tix, virtual gifts, daily rewards, referrals, Ice Breakers AI, coaching hub, and ~20 more surfaces now in `features/profile-enrichment.md`, `features/safety-date-tools.md`, `features/gifts-rewards-referrals.md`.

## Limitations

Static-only — no execution, no device, no network capture; feature-flag and
server-gated behavior is `[unk]` wherever noted. Per-file coverage and tool
gaps: [platform/limitations.md](platform/limitations.md) and
[platform/coverage-ledger.md](platform/coverage-ledger.md).

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
| Protection & obfuscation | platform/architecture.md (R8) |
| Embedded config & shipped secrets | platform/network-api.md (client config strings, unverified) |
| Monetization | tools/boost-premium-subscriptions.md, tools/premium-plus.md |
| Feature inventory | features/ index above |
| Updates & dynamic delivery | n/a — no update/dynamic-delivery mechanism documented |
| Privacy | features/safety-moderation.md, features/safety-date-tools.md |
