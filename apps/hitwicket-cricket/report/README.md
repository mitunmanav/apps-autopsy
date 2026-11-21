# Hitwicket Cricket — teardown report

| | |
| --- | --- |
| **Target** | `cricketgames.hitwicket.strategy` (`base.apk`, 93,016,825 bytes) |
| **Version** | 12.43.0 (versionCode 205957) |
| **SHA-256** | `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d` |
| **Platform** | Android |
| **Method** | static |
| **Analyzed** | unknown |
| **Tools** | REA · jadx-headless 0.7.1 · Apktool 2.7.0 · IL2CPP/ELF analyzers |
| **Obtained** | local archive |
| **Analyst** | @mitunmanav |

## What this is

Cricket strategy/management game built on Unity (IL2CPP — `Hitwicket.dll`
alone holds 17,517 types). Multi-APK delivery set; never executed.

## Artifact set

**Companion splits analyzed (same package/versionCode):**
- `split_config.arm64_v8a.apk` — sha256 `d9b9b79defe91d71ec53ca591ff5e9bab42449e29e707252f6514de5005318c8` (arm64 native libs)
- `split_gpdeku.apk` — sha256 `25ca35411deef4cc5eb2ce15e5630b98ae013740fb5be8285e34edb5aaf5850b` (Play Deku feature module)
- `split_gpdeku.config.arm64_v8a.apk`, `split_UnityStreamingAssetsPack.apk`, `split_UnityDataAssetPack(.config.astc).apk`, `split_AddressablesAssetPack(.config.astc).apk`, `split_UnityTextureCompressionsAssetPack(.config.astc).apk`

## Method

Static analysis only via the REA reverse-engineering toolset (an MCP server exposing analyzers such as jadx/Apktool/IL2CPP/ELF). The APK was never executed. Engines: jadx-headless-mcp 0.7.1 (DEX/manifest), Apktool 2.7.0 (resources), REA archive/IL2CPP/ELF analyzers. Claims are tagged **[observation]** (direct tool evidence), **[inference]** (reasoned from evidence), **[unknown]** (not determinable statically). `ev_*` IDs cite retained REA evidence records for reproducibility.

## Key numbers

| Metric | Value | Evidence |
|---|---|---|
| DEX classes | 32,783 (8 dex + 2 FAN asset dex) | ev_53eae69d… |
| Components | 118 (61 act / 23 svc / 20 rcv / 14 prv) | ev_53eae69d… |
| Permissions (uses) | 42 | ev_53eae69d… |
| IL2CPP images | 210 | ev_1f2c2253… |
| IL2CPP types / methods / fields / strings | 38,819 / 221,447 / 187,872 / 51,541 | ev_1f2c2253… |
| Game assembly `Hitwicket.dll` types | 17,517 | ev_1f2c2253… |
| JNI declarations (root dex) | 293 `native` decls found (49,383 class units scanned); first page shows 64 (org.webrtc 61, lofelt 2, wrtc 1) | ev_fe36f40a… |
| Zip members (base.apk) | 1,155 files (`unzip -l`); REA inventory: 1,061 nodes / 1,156 occurrences (differing measures of the same archive) | ev_ab10b336… |
| Native libs | 24 `.so` in arm64 split + 1 in gpdeku split | split listing |
| Signing | v2+v3, single signer cert `d83d4e13…`, Play source stamp, self-consistent | ev_39282c91… |
| Release exposure audit | 0 exposed; 2 not_observed; 3 unknown; 3 not_assessed; 7 n/a | ev_326af4dc… |

## Layout of this report

### platform/
- [manifest-components.md](platform/manifest-components.md) — manifest, all 118 components, deep links, queries, meta-data
- [architecture.md](platform/architecture.md) — split APK layout, Unity/IL2CPP layering, SafeDK wrapper
- [native-libs-jni.md](platform/native-libs-jni.md) — 25 native libs total (24 in arm64 split + 1 gpdeku), JNI bindings, WebRTC/coherence/Lofelt/Adjust bridges
- [sdks.md](platform/sdks.md) — ad mediation (AppLovin MAX + 6 networks), Firebase, Adjust, Facebook, Play services
- [permissions.md](platform/permissions.md) — 42 permissions with purpose mapping
- [persistence.md](platform/persistence.md) — storage modules, prefs, Room, asset packs, offline catalogs
- [network-api.md](platform/network-api.md) — endpoint inventory, ApiHelper 227-call API surface, sockets, protobuf
- [data-pipeline.md](platform/data-pipeline.md) — analytics/telemetry flows, PN tracker, FCM→tracker pipeline
- [offline-online.md](platform/offline-online.md) — per-feature offline/online classification
- [limitations.md](platform/limitations.md) — tool failures, blind spots, coverage limits
- [coverage-ledger.md](platform/coverage-ledger.md) — evidence IDs per claim area
- [screen-map.md](platform/screen-map.md) — Android activities + Unity UI/screen inventory
- [navigation-map.md](platform/navigation-map.md) — entry points, deep links, FTUE/launch flow

### tools/ (user-facing tools; UI entry, params, execution path, premium/offline flags, I/O flow)
- [authentication.md](tools/authentication.md) — guest/Firebase/Play Games/Gmail/Game Center/Facebook/WhatsApp OTP
- [match-gameplay.md](tools/match-gameplay.md) — PvP & PvE match engine, GameScene, MatchEngine
- [practice-offline.md](tools/practice-offline.md) — offline quick match, FTUE rigged matches
- [multiplayer-coop.md](tools/multiplayer-coop.md) — rooms, albatross/rplace sockets, co-op live matches
- [spectate.md](tools/spectate.md) — match replay/event-stream spectating
- [chat.md](tools/chat.md) — flashchat socket, match chat, profanity reporting, bad-word lists
- [voice-chat.md](tools/voice-chat.md) — awrtc WebRTC voice, signaling, mic permissions
- [alliances.md](tools/alliances.md) — alliance system, Showdown, Raid, League, Academy
- [social-invites.md](tools/social-invites.md) — friends, invites, UPI/share integrations, NativeShare
- [store-iap.md](tools/store-iap.md) — Unity IAP 5.4.2 + Play Billing 9.0.0, store adapters, web shop
- [ads.md](tools/ads.md) — rewarded ads, AppLovin MAX mediation, SafeDK ad-quality wrapper
- [notifications.md](tools/notifications.md) — FCM, alarm scheduler, PN tracker, Unity notifications
- [liveops-events.md](tools/liveops-events.md) — IPL/YC/DC/ABR/Hitfest/SeasonPass/Olympics event system
- [squad-progression.md](tools/squad-progression.md) — lineup, training, scouting, gacha, auction
- [profile-settings.md](tools/profile-settings.md) — profile popup, settings, country/username changes
- [tutorial-ftue.md](tools/tutorial-ftue.md) — tutorial system, offline FTUE DB, rigged matches
- [deep-links.md](tools/deep-links.md) — hitwicket://, playhitwicket.go.link, page.link, Adjust links
- [anti-cheat.md](tools/anti-cheat.md) — ACTk, CodeHashVerification, root/SU queries

### features/ (engineering modules)
- [gamescene.md](features/gamescene.md) — match presentation layer (Hitwicket.GameScene.*)
- [match-engine.md](features/match-engine.md) — Hitwicket.MatchEngine.dll simulation core
- [core-network.md](features/core-network.md) — Hitwicket.Core.NetworkModule, APIService, protobuf
- [core-auth.md](features/core-auth.md) — HW.Superstars.Login.AuthService, AuthCoordinator
- [core-storage.md](features/core-storage.md) — Hitwicket.Core.StorageModule, adapters
- [liveevents.md](features/liveevents.md) — Features.LiveEvents.* event framework
- [store-economy.md](features/store-economy.md) — Hitwicket.Store.*, UnityAdapters
- [ui-framework.md](features/ui-framework.md) — view/controller/page pattern, OSA, TMP
- [android-services.md](features/android-services.md) — cricketgames.* Java services
- [thirdparty-stack.md](features/thirdparty-stack.md) — assembly/vendor inventory
- [asset-delivery.md](features/asset-delivery.md) — Play Asset Delivery, Addressables, streaming assets
- [gpdeku.md](features/gpdeku.md) — Play Deku screencapture feature module

## Findings

1. **Architecture:** Unity IL2CPP game (Unity boot.config `fb3764f0…`, metadata v31). All game logic in `libil2cpp.so` (196 MB arm64); Java layer is a thin shell (1 launcher activity + ~23 app classes for notifications/auth) wrapped by **SafeDK** (`android:name="com.safedk.android.SafeDKApplication"`). [observation]
2. **Backend:** hitwicketsuperstars.com REST (`/api`), `wss://pvp.hitwicketsuperstars.com/gs/` realtime match socket, `wss://flashchat…` chat socket, `ws://albatross`/`ws://rplace` room services, `ws://s.y-not.app/callapp` WebRTC signaling, `tracker.hitwicketsuperstars.com/api/analytics` telemetry. Staging endpoints (`staging.`, `preproduction.`, `stg5.z.`) ship in the binary. [observation]
3. **Multiplayer:** synchronous PvP over WebSocket with protobuf payloads (`Hwsproto` types, `Superstars.Proto.Match`), room-based co-op (`DCCoop*`, `CoopRoomManager`, `AutoMatchRoomManager`), live matches (`GetLiveMatchesV2`), spectating via match-event HTTP stream + `matchReplay` download. [observation]
4. **Monetization:** Play Billing 9.0.0 + Unity IAP 5.4.2, subscription (`DailyRewardSubscription`, `SpbSubscription`), gacha (`GachaBox*`, `GachaChestApiClientAdapter`), auction, UPI app queries, `pavilion.hitwicket.com/buy` web shop; ads via AppLovin MAX with 6 other ad-network SDKs shipped (mediation by MAX inferred from its orchestration role) + rewarded-ad API calls (`getCanWatchMoreRewardedVideos`). [observation of SDK presence; inference of mediation]
5. **Voice chat:** bundled WebRTC (61 JNI decls, `libwebrtccsharpwrap.so` 13.6 MB, Byn.Awrtc awrtc plugin) with `RECORD_AUDIO`/`BLUETOOTH`/`MODIFY_AUDIO_SETTINGS` and `android.hardware.microphone` feature. [observation]
6. **Anti-abuse:** Anti-Cheat Toolkit (ACTk), `CodeHashVerification` API method, root-package queries (magisk/supersu/etc.), Adjust `libsigner.so` signature lib, Play Deku screencapture module. [observation]
7. **Offline:** offline quick-match fixtures (`OfflineData/`, `OfflineTutorialDb/` **144 `.dat` files** — fake-backend catalogs + scripted matches, verified `unzip -l`, `OfflinePlayerPrefs`, FTUE rigged matches); all competitive/purchase/social paths are server-gated. [observation]

## Verification checklist

| Check | Result |
|---|---|
| Report files exist in `report/{,platform,tools,features}` | 44 files (1 README + 13 platform + 18 tools + 12 features) |
| Every file stamped `cricketgames.hitwicket.strategy` + base sha256 | PASS (44/44) |
| Only this artifact set cited (no foreign APK hashes) | PASS (all hashes belong to the listed splits/libs/metadata) |
| Claims tagged observation/inference/unknown | PASS (44/44) |
| Static-only; no runtime claims | PASS (limitations.md documents unexecuted analysis) |
| Counts match gathered evidence | 118 components, 42 perms, 32,783 top-level classes (49,383 class units incl. nested — JNI scan), 210 images, 38,819 types, 221,447 methods, 51,541 literals, 293 JNI decls, 1,155 zip files (1,156 REA occurrences / 1,061 nodes), 24+1 .so, 227 ApiHelper methods, 144 OfflineTutorialDb files |
| Tool failures/limitations recorded | `platform/limitations.md`, `platform/coverage-ledger.md` |

Skipped: native decompile of libil2cpp (196MB — metadata analysis only), Unity serialized-asset decoding, signature cryptographic verification, credential scan (tool skipped all members).

## Limitations

Static-only — the APK was never executed. Skipped: native decompile of
`libil2cpp` (196 MB — metadata analysis only), Unity serialized-asset
decoding, signature cryptographic verification, credential scan (tool
skipped all members). Detail: [platform/limitations.md](platform/limitations.md),
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
| SDKs, ads & trackers | platform/sdks.md, features/thirdparty-stack.md |
| Native code & JNI | platform/native-libs-jni.md |
| Persistence & local data | platform/persistence.md |
| Protection & obfuscation | platform/architecture.md (IL2CPP, SafeDK) |
| Embedded config & shipped secrets | platform/network-api.md (staging endpoints ship in binary) |
| Monetization | tools/ (store/IAP tools) |
| Feature inventory | features/ + tools/ indexes above |
| Updates & dynamic delivery | features/asset-delivery.md, features/gpdeku.md |
| Privacy | platform/data-pipeline.md |
