# Coverage Ledger

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`; splits arm64 `7b3846b4…de34`, en `75a6ab29…d9d97`, xxhdpi `97df5cdb…0d70`.

## Completed (with evidence IDs)
| Area | Coverage | Evidence |
|---|---|---|
| Package identity/version/SDK levels | full | ev_05529772da47bbe20a7e7c5f44259efbb42d0acfde150df3c45b14dbded54789, ev_95e134db |
| Signature blocks (v2/v3/stamp) | structure-complete | ev_d0d4bbe36bfe21864577718f8d4b66fd1a5ea6e341ab3e09509762e6a13b0999 |
| Manifest decode + components | 296/296 parsed | ev_76c7945b9c97973a15c988e8a545751cd6fe05af4acc3f3eceb18b4b4781484a + `.work/manifest.xml` |
| Archive inventory (all 4 APKs) | full listings retained | ev_d3404181, ev_3ede306f |
| Application graph (dex/assets/libs) | built | ev_b454821aebef358d9a91f8c66f5843e793837f9b08a328e6260793de676f3c06 |
| JNI declarations | 322/322 scanned, 0 resolved (split boundary) | ev_d0581bd65924e97d3234e2bb7a2657d1d3364516e57c578dd77ba9cfff553797 |
| Class/package maps | com.bumble.app 796, com.badoo 2335, com.bumble2 140, com.bmbl.b4f 1363 inventoried (per `.work/` listing lines; ±1 vs earlier counts is a count-convention artifact) | search sets in `.work/` |
| Resource decode | 4,830 resources; 3,000-string preview + full strings fallback | `decode_resources.json` |
| `SERVER_*` RPC catalog | 640 verbs extracted to `server_api_methods.txt` | DEX strings |
| B4F proto services | 39 APIs / 18 domains enumerated | class+string evidence |
| Selected decompiles | `EliseDownloaderWorker` (ev_d7810059), `WebRtcService` (ev_a65092f7), `Bumble2MainActivity` (ev_1ca207c0), `BumbleMainApplication.onCreate`, `DiscoveryScreenFeature`, `SpiderwebDatabase` | individual evidence IDs |
| SDK inventory | manifest+strings+assets | this report `platform/sdks.md` |
| Premium product catalog | 4 subs + 5 consumables + paywall/promo | `SubscriptionsApi`/product strings |
| Deep links | 45 filters / 41 data decoded | manifest |

## Partially covered
- Per-activity screen map: 222 activities enumerated by name/package; only key entries decompiled (obfuscated bodies). Map is structural [inf], not behavioral.
- JNI↔lib matching: name-level only (0/322 bound).
- `en` split: present-inventoried; localized strings not diffed.
- `xxhdpi` split: asset list only.
- Room schemas: extracted CREATE TABLEs; full entity graph behind obfuscation.

## Not covered
- Per-`.so` internal analysis (11 libs inventoried by name/symbol only).
- Runtime/dynamic loading, reflection targets, `RegisterNatives`.
- Any executed behavior, network traffic, or UI flow.
- Diff vs other APK versions (out of scope per artifact-only rule).

## Tool failures
- `inspect_jeb_client`: `capability_unavailable` — JEB absent. Impact: no second decompiler; JADX-only confidence. Mitigated by: catalog cross-check via raw strings.
- `VotesApi` class lookup failed: API identifiers aren't classes (routing names). Impact: none; corrected by inventorying `*Api` service names + model classes.
- Client truncations on huge views: recovered via overflow files + local mining.

## Pass-2 verification (two independent reviewers over .work evidence)
**Corrected (verified against `server_api_methods.txt`, `manifest.xml`, `dex_strings.txt`):**
- ~20 `SERVER_*` names in pass 1 were paraphrases, not shipped verbs → fixed in place; real names now cited (`SERVER_CHAT_MESSAGE_READ`, `SERVER_WEBRTC_CALL_ACTION`, `SERVER_GET_APP_SETTINGS`, `SERVER_SAVE_PERSON_PROFILE`, `SERVER_SOURCEPOINT_RESHOW_CONSENT`, …). Features relying on non-existent verbs now cite B4F APIs (`LikedYouApi`) or param-level names.
- Exported activities: 12 (not 14); total exported 19 = 12A + 2S + 4R + 1P.
- `offline_signal_*` DDL belongs to Google DataTransport/ads buffered pings, NOT Sentry — corrected in persistence/offline/README.
- Removed permissions not declared: `BLUETOOTH_ADMIN`, `RECEIVE_BOOT_COMPLETED`, exact alarms.
- `s.bumble.com` has no `/f/open-in-app` path — that host is `t.cloud.bumble.com`.
- AdMob meta is `com.google.android.gms.ads.APPLICATION_ID` (+`android.ext.adservices`); Play Integrity strings corrected to `ExpressIntegrityService`/`IntegrityTokenRequest`.
- `stream_chat_*` Room schema claim downgraded — Stream SDK presence confirmed, no such DDL in strings.
- `client_stream` header → `x-stream-ext`/`X-Stream-Ticket`; `SSEv2` → `SSEApi` v2; `IncomingCallReceiver` → `IncomingVideoCallReceiver`; `com.bumble.app.subscriptions` package → `subscriptions_plan`/`subscriptions_features_screen`/`subscriptionstatus`; B4F domains 19 → 18.
**Added (missed in pass 1):** Premium+ tier, Profile Visitors (`ViewsApi`), Bizz mode, Opening Moves, Share Date/live location, post-date check-in, appeals/blockers pipeline, age signals, DSA reporting, Au10tix + document IDV, ThreatMetrix, virtual gifts, daily rewards, referrals, Ice Breakers AI, coaching hub, PQW, Known For, Buzzing, Likes Sent, Recommend to Friend, Bee Key QR, anti-ghosting, astrology, surveys, polls, Would-You-Rather/quiz, Date Night, Sierra agent, Moves Making Moves, ad-mediation partners, dormant whitelabel/livestream residue.
**New files:** `tools/premium-plus.md`, `features/{profile-visitors,bizz-mode,opening-moves,safety-date-tools,gifts-rewards-referrals,profile-enrichment}.md`.
