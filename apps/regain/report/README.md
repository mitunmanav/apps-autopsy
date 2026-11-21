# Regain — teardown report

| | |
| --- | --- |
| **Target** | `ai.regainapp` (`base.apk`, 79,460,427 bytes) |
| **Version** | 75.4.2131 (versionCode 2131, minSdk 24, targetSdk 36) |
| **SHA-256** | `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a` |
| **Platform** | Android |
| **Method** | static |
| **Analyzed** | unknown |
| **Tools** | REA · jadx 1.5.6 · baksmali 2.5.2 · apktool 2.7.0 |
| **Obtained** | local archive |
| **Analyst** | @mitunmanav |

## Artifact identity

| Field | Value |
|---|---|
| File analyzed | `base.apk` (79,460,427 bytes) |
| SHA-256 | `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a` |
| Package | `ai.regainapp` |
| Version | `75.4.2131` (versionCode `2131`) |
| Min SDK | 24 | Target SDK | 36 (Android 16) |
| App code packages | `ai.blox100.*` (766 top-level classes, white-label app framework), `ai.regainapp.*` (23 classes, shell + payments) |
| Total top-level classes | 29,572 | Resources | 4,692 | DEX files | 4 | Declared components | 121 |
| Native code | None app-specific — 13 JNI declarations, all AndroidX library code |
| Signing | v2 + v3, one signer, cert SHA-256 `83bce5d8…def4`, source stamp present, self-consistent |

## What this is

A student-focused digital-wellbeing / focus app `[obs]` — app & website
blocking, shorts/reels blocking, focus timer with social groups and leagues,
study goals, YouTube-study whitelisting, zen mode, an alarm scheduler, home
widgets, floating bubbles, a replacement launcher, and a Pro subscription
(Google Play Billing + Razorpay UPI + RevenueCat).

## Method (all static; the APK was never executed)

- REA MCP server (`rea` server): `inspect_android_package`, `inspect_apk_signature`, `search_android_classes`, `inspect_android_class`, `inspect_android_jni_bindings`, `decode_android_resources`, `inspect_artifact`, `inspect_analysis_view` — provider JADX-headless-mcp 0.7.1 / jadx-core 1.5.6, apktool 2.7.0.
- Local jadx 1.5.6 full-DEX decompile (classes.dex + classes3.dex → `analysis/jadx-classes/sources/`), baksmali 2.5.2 disassembly of all 4 dexes (`analysis/smali/`).
- Every factual claim is tagged **OBS** (observed in code/manifest/resources), **INF** (inference), or **UNK** (unknown / not establishable statically). No runtime behavior is claimed.

## Key evidence anchors

- Package+manifest Evidence `ev_a9d40f3193a49f14ef20f3e2037d83b3d63d9c2c424ed26a45dc102ce4353c0c` (decoded manifest `ev_1637201fd5751511c3e5e2487dc16e12885c3fde34fba2c8ba3ad42f64c7f761`)
- Signature `ev_9e88c3ba92dbae2398970acc5272a68d571e922499aae5049d20b4b62d7b68d4` · JNI bindings `ev_a2a89ba25b9dce07800016d3e5e3b593c629c707fae6af809fce499ca27ce613` · Resources `ev_7950cc0cb6300ed0059be0f831ffa5779d76ce3de1e850c42fc7b8a4b9afa4e0` (+pages `ev_0b7afae4c0fcd44f1ac6eb1be11ef542566ac56764390a22335d9f81228bc9ee`, `ev_1587a15a82300d617de7c184426b0f621585bd088d7eedf6571c2f07417c72f4`)
- Archive inventory `ev_227a0585607a4b72e0fa6e52b9558e9afbe8f741306272fc64ce38fbf66b04ed` · Blocking-engine class `ev_afb349ab67d855848a96ab1b869b14bd66e0fed742b41e0d16180b112727dbf5` · Monitor `ev_b68dbf0cabc64bcec32994638b0185f19fc657874742778f8b4ac6746e785bf9` · NotificationListener `ev_aea2674537ba2133e7404b9ff4ab3664d8785707d0cc3d47e752b3a81e027bd4` · MyApplication `ev_874183c303bb8d5e1457d1689775b08a2616a03094ef631c84a710825a53052a` · Class inventory `ev_22aacaf4fe25e42eefc41ea1c0a83f8ae4a25b0ee499b24b9957317a09bff18e`

## Layout of this report

- `platform/` — artifact-level docs: manifest+components, architecture, SDKs, native/JNI, permissions, persistence, network/API, data pipeline, offline/online classification, screen map, navigation map, limitations, coverage ledger.
- `tools/` — one file per user-facing capability: UI entry, params model, exact execution path (local SDK vs remote API), premium/offline flags, input→output flow.
- `features/` — one file per code module (`feature_*` package + infrastructure), same depth.

### Index

**platform/**: [manifest-components](platform/manifest-components.md) · [architecture](platform/architecture.md) · [permissions](platform/permissions.md) · [sdks](platform/sdks.md) · [native-jni](platform/native-jni.md) · [persistence](platform/persistence.md) · [network-api](platform/network-api.md) · [data-pipeline](platform/data-pipeline.md) · [offline-online](platform/offline-online.md) · [screen-map](platform/screen-map.md) · [navigation-map](platform/navigation-map.md) · [limitations](platform/limitations.md) · [coverage-ledger](platform/coverage-ledger.md)

**tools/**: [focus-timer](tools/focus-timer.md) · [app-blocking-limits](tools/app-blocking-limits.md) · [shorts-reels-blocking](tools/shorts-reels-blocking.md) · [website-blocking](tools/website-blocking.md) · [youtube-study-mode](tools/youtube-study-mode.md) · [zen-mode](tools/zen-mode.md) · [c68-alarm](tools/c68-alarm.md) · [focus-groups-leagues](tools/focus-groups-leagues.md) · [notification-manager](tools/notification-manager.md) · [usage-insights](tools/usage-insights.md) · [distracting-apps](tools/distracting-apps.md) · [launcher](tools/launcher.md) · [floating-bubbles](tools/floating-bubbles.md) · [home-widgets](tools/home-widgets.md) · [uninstall-protection](tools/uninstall-protection.md) · [instagram-challenge](tools/instagram-challenge.md) · [study-goals-stamps](tools/study-goals-stamps.md) · [invites-referrals](tools/invites-referrals.md) · [subscription-billing](tools/subscription-billing.md) · [ai-coach](tools/ai-coach.md) · [themes](tools/themes.md) · [offers-coins](tools/offers-coins.md) · [onboarding](tools/onboarding.md) · [signin-backup](tools/signin-backup.md) · [weekly-reports](tools/weekly-reports.md)

**features/** (7 files covering all 37 `feature_*` modules + infra — grouped by domain; every module named inside its file): [core-application](features/core-application.md) (MyApplication/DI/analytics/core/network/notification_service/data/util/share_message) · [monitoring-engine](features/monitoring-engine.md) (MyMonitorService + MyMonitorInAppBlockService) · [blocking-features](features/blocking-features.md) (focus_timer, app_limit, block_shorts, block_website, distracting_apps, zen_mode, productive_mode, c68) · [tracking-features](features/tracking-features.md) (app_usage_stats, app_category, control_apps, phone_lock_unlock_counter, notification_batching, regain_api, network_logs, profile_stats, impact_banner) · [social-account-features](features/social-account-features.md) (invite_flow, user_signin, onboarding, study_goal_home, ai_coach, ai_generate_share_message, wall_of_love, in_app_survey, play_store_rating) · [monetization-settings-features](features/monetization-settings-features.md) (subscription, user_theme, language, creator_mode, permission, service_fixing, regain_launcher) · [ui-infra-modules](features/ui-infra-modules.md) (widget, floating_bubble, broadcastReceivers, workers, services, regainapp-shell)

Companion split APKs (`split_config.arm64_v8a.apk`, `split_config.xxhdpi.apk`) exist in the delivery set; per scope, only `base.apk` is analyzed. Their only unique payloads — 3 AndroidX `.so` files and xxhdpi ExoPlayer drawables — were inventoried and are noted where relevant, with their own digests.

## Findings

- **[obs]** Most of the app is a white-label framework — `ai.blox100.*` holds 766 top-level classes; the regain-specific shell (`ai.regainapp.*`) is only 23 classes (mostly payments).
- **[obs]** Blocking is enforced by monitor services (`MyMonitorService`, `MyMonitorInAppBlockService`) plus an uninstall-protection layer and a replacement launcher.
- **[obs]** Pro monetization runs three parallel stacks: Google Play Billing, Razorpay UPI and RevenueCat.

## Limitations

All static — the APK was never executed; runtime behavior, remote-config
values and server responses are unknown unless tagged otherwise. What was
not established: [platform/limitations.md](platform/limitations.md);
coverage: [platform/coverage-ledger.md](platform/coverage-ledger.md).
Companion splits carry only AndroidX `.so` files and xxhdpi drawables —
inventoried, not separately analyzed.

## Coverage

Every surface of the artifact, and where this report covers it.
A `n/a` or `gap` here is a statement about this report, not about
the app.

| Surface | Covered in |
| --- | --- |
| Identity & signing | platform/manifest-components.md + identity table above |
| Components & exported surface | platform/manifest-components.md |
| Permissions | platform/permissions.md |
| Network & API surface | platform/network-api.md |
| SDKs, ads & trackers | platform/sdks.md |
| Native code & JNI | platform/native-jni.md |
| Persistence & local data | platform/persistence.md |
| Protection & obfuscation | platform/architecture.md |
| Embedded config & shipped secrets | platform/network-api.md |
| Monetization | tools/subscription-billing.md |
| Feature inventory | features/ + tools/ indexes above |
| Updates & dynamic delivery | n/a — no update/dynamic-delivery mechanism documented |
| Privacy | platform/data-pipeline.md |
