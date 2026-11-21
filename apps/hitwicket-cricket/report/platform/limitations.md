# Limitations & Tool Failures

**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 (205957) — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

## Hard limits
1. **Static only** — no execution; all "behavior" statements are code-evidence, not observed runtime. Reachability of any given call at runtime is unproven.
2. **libil2cpp.so (196MB) not decompiled** — REA IL2CPP metadata analysis gave type/method/field/string tables (38,819 types/221,447 methods) but native machine-code bodies, method→native-address mapping and IL2CPP icall registration were not recovered. Effect: API request bodies, per-screen business logic and protobuf schemas are inferred from names/strings, not read.
3. **Unity serialized assets** — `assets/bin/Data/<hash>` files and `assets/Match|Practice` scenes are binary serialized formats; scene graphs, prefab hierarchies and inspector wiring unread → screen map is type-name-derived, not scene-derived.
4. **Signature unverified** — v2/v3 digests are self-consistent with shipped bytes, but no cert-chain/keystore validation performed (`signature_verification: not_performed`).
5. **JNI binding match = 0** — `inspect_android_jni_bindings` only sees base.apk; all .so files live in the ABI split, so declared natives show 0 bound libraries. Individual lib exports confirm the pairs manually.
6. **ZIP central directory scope** — inventory covers entries only; APK Signing Block / non-entry bytes excluded. `audit_release_exposure` skipped all 1,155 members for text/credential scans (0 scanned — format limit) → credential-marker check is **unknown**, not clean.
7. **Split manifests stubbed** — asset-pack splits carry no runtime components; `.config.astc` payload contents listed but not semantically decoded.

## Coverage blind spots
- Protobuf `.proto` field layouts (`Hwsproto`/`Superstars.Proto.*` types seen, field defs not decoded).
- Exact REST request/response JSON schemas — method names known, payloads not extracted.
- Server gating of every "premium" flag — VIP/subscription booleans exist in types; enforcement is server-side and unverifiable statically.
- Ad waterfall config (remote MAX config), Remote Config defaults — server-fetched.
- Whether shipped staging endpoints are selectable at runtime (env-switch methods exist; default selection unknown but `SetDefaultEvn` + Unity config `production` suggests prod).
- `Hitwicket.FakeScoutV2` (98-type namespace) — dev/fake scout backend ships compiled; whether reachable in release unknown.

## Tool errors encountered (and resolution)
- `inspect_analysis_view` schema pivots (`source.kind`, `facet`, `collection`, `limit` required beyond advertised schema) — corrected per server error details; no data loss.
- `project_android_application_graph` `inventory_evidence` requires array-of-objects form — retried successfully.
- Large JSON tool outputs truncated by client — captured to files, paginated locally.

## Self-audit corrections (two independent verification passes)
Pass 1 found and we fixed: fabricated URL parameter template (`api/events?startTick…` → real `api/events/{id}?from…to…`), fabricated `wss://…/w` chat suffix, fake `ws://api.hitwicket.com:11000`, 4 invented staging subdomains, wrong host `hitwicket.com/pavilion/banners`, 4 invented class names (`OfflineDataProvider`, `HitwicketFakeScoutDataProvider`, `UserDataPersistenceService`, `ReportChatMessagePopup`), MaxDebugger count 14→17, zip count framing (1,155 files vs 1,156 occurrences/1,061 nodes), .so count 24+1, badge perms 16, locales 92.
Pass 2 found and we fixed: invented assembly names (`Hitwicket.AdModule/AdServices` → `Hitwicket.AdsSystem.*`; `Hitwicket.{Hitfest,Olympics,DailyContest}` → types not assemblies; `Hitwicket.{CurrencyPackages…Scout}` → `Hitwicket.Store.*` namespaces in `Hitwicket.Store.dll`; `EliteStore` → `Store.Elite`), wrong Java package paths (`services.performance.*`, `services.ringtone.*`), `FetchRecoverableAccounts`→`…Async`, `hitwicket.go.link`→`playhitwicket.go.link`, `InjectOfflineDataHelper` reclassified as injection method, `Match` bucket 152→153.
Remaining unverifiable: split-APK listing-dependent sizes (`.so` count re-verified 24+1, OfflineTutorialDb=144 verified via unzip, BadWords=11 verified via unzip, Match/Practice file counts verified via unzip), REA-internal counters (32,783 classes, 38,819 types, 227 methods — tool-reported), dex-side Java internals (`PnTracker*`, `handleNotification` — evidence-ID-backed only).
