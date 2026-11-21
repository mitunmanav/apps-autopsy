# Network / API Surface

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

Evidence: DEX string tables (`server_api_methods.txt`, `urls.txt`, `dex_strings.txt`), `com.bmbl.b4f` class inventory, manifest. **No live capture — every endpoint is a shipped string, not an observed request.**

## Two transports [obs]

### 1. Legacy `SERVER_*` RPC — 640 verbs
String-verb catalog dispatched over the Badoo "BAPI" HTTPS RPC layer [inf for wire format; obs for verbs]. Representative verbs per domain:

- **Discovery/encounters**: `SERVER_GET_ENCOUNTERS`, `SERVER_UPDATE_LOCATION_AND_GET_ENCOUNTERS`, `SERVER_MULTIPLE_ENCOUNTERS_VOTES`, `SERVER_ENCOUNTERS_VOTE`, `SERVER_GET_SEARCH_SETTINGS`, `SERVER_SAVE_SEARCH_SETTINGS`, `SERVER_GET_ENCOUNTER_SETTINGS`, `SERVER_SAVE_SEARCH_SETTINGS_AND_GET_ENCOUNTERS`; filters via B4F `FiltersApi`
- **People/profile**: `SERVER_GET_USER`, `SERVER_GET_PERSON_PROFILE`, `SERVER_GET_USERS`, `SERVER_SAVE_PERSON_PROFILE`, `SERVER_GET_PERSON_PROFILE_EDIT_FORM`
- **Likes/matches**: Beeline via B4F `com.bmbl.b4f.discovery.v1.apis.LikedYouApi`; match list via B4F `ConnectApi`/Stream + SSE; tool params `BACKTRACK`/`BACKTRACK_ENCOUNTERS`, `REQUEST_EXTEND_MATCH`/`EXTEND_MATCH`/`EXTEND_MATCH_CHAT`, `REMATCH`/`REMATCH_ACTION`, `CONSUMABLE_CRUSH`/`BALANCE_TYPE_CRUSHES` (no dedicated `SERVER_*` verbs for these names — verified against the 640-verb catalog)
- **Chat**: `SERVER_OPEN_CHAT`, `SERVER_GET_CHAT_MESSAGES`, `SERVER_SEND_CHAT_MESSAGE`, `SERVER_CHAT_MESSAGE_READ`/`SERVER_CHAT_MESSAGES_READ`, `SERVER_GET_QUICK_HELLO_WITH_CHAT` (icebreaker), `SERVER_GET_GIFT_PRODUCT_LIST` + `SERVER_PURCHASED_GIFT_ACTION`, `SERVER_EXPORT_CHAT`, `SERVER_FORWARD_MESSAGES`, `SERVER_GET_URL_PREVIEW`, `SERVER_SEND_UNMATCH_REASON`
- **Premium/commerce**: `SERVER_GET_CONTEXTUAL_PAYWALL`, `SERVER_GET_INSTANT_PAYWALL`, `SERVER_GET_BILLING_PLAN`, `SERVER_VALIDATE_PURCHASE`, `SERVER_GET_PAYMENT_PROVIDER_BANKS`, `SERVER_INIT_SPOTLIGHT`, `SERVER_STOP_SPOTLIGHT`, `SERVER_START_EXTERNAL_PURCHASE`, `SERVER_GET_PAYMENT_SETTINGS`, `SERVER_UNSUBSCRIBE_CREDITS_AUTO_TOPUP`; subscription catalog via `SubscriptionsApi`/`PaywallsApi`
- **Verification**: `SERVER_START_PHOTO_VERIFICATION`, `SERVER_CHECK_PHOTO_VERIFICATION`, `SERVER_START_ID_VERIFICATION`, `SERVER_CHECK_ID_VERIFICATION`, `SERVER_GET_VERIFF_SESSION`, student-email verbs
- **Calls**: `SERVER_WEBRTC_START_CALL`, `SERVER_WEBRTC_GET_START_CALL`, `SERVER_WEBRTC_CALL_ACTION` (answer/decline/SDP), `SERVER_WEBRTC_CALL_CONFIGURE` (ICE/config), `SERVER_WEBRTC_CALL_HEARTBEAT`, `SERVER_WEBRTC_GET_CANCEL_CALL`, `SERVER_WEBRTC_GET_CALL_STATE`
- **Community/BFF**: `SERVER_GET_BFF_DISCOVERY_HOME`, `SERVER_GET_BFF_COLLECTIVE_INFO`, `SERVER_HIVE_*` (posts, comments, join requests), `SERVER_GET_HIVE_VIDEO_ROOM_CREDENTIALS`
- **Hub/other modes**: `SERVER_GET_DATING_HUB_HOME`, `SERVER_BUMBLE_SPEED_DATING_*`
- **Account**: `SERVER_DELETE_ACCOUNT`, `SERVER_GET_APP_SETTINGS`, `SERVER_GET_USER_AND_APP_SETTINGS`, `SERVER_SAVE_APP_SETTINGS`, `SERVER_PASSKEY_*` (passkey auth), `SERVER_GET_BRAZE_AUTH_DATA`, `SERVER_SAVE_SOURCEPOINT_CONSENT`, `SERVER_SOURCEPOINT_RESHOW_CONSENT`, `SERVER_SEND_ARKOSE_TOKEN`
- **Location/travel**: `REQUEST_SET_TRAVEL_LOCATION` param + `LocationApi` B4F; `SERVER_SAVE_NEARBY_SETTINGS`

### 2. `com.bmbl.b4f` protobuf services — 39 APIs / 18 package domains
Generated kotlinx-protobuf models + gRPC/Connect transport strings [obs: `grpc` strings, `*Req/*Resp` classes]. Domains: account, ads, billing (`OrdersApi`, `OrdersAlternativeApi`, `OrdersGoogleWalletApi`, `PaywallsApi`, `PerksApi`, `SubscriptionsApi`), connect, discovery (`EncountersApi`, `FiltersApi`), edit-profile, handles, help-hub, identity-verification (`IdentityVerifyApi`), location, martech (`BrazeApi`, `ContentCardsApi`, `StatsigApi`), profile, revenue, SSE (`SSEApi`), safety (`BansApi`, `BlockingApi`, `ContentModerationApi`, `ReportsApi`, `UnmatchingApi`, `RestrictionsApi`), views (`ViewsApi`), votes (`VotesApi`).

## Hosts / endpoints in strings [obs]
- `*.cloud.bumble.com` — API + Auth0 (`auth{,-stage,-dev}.cloud.bumble.com`, EU variants)
- `sdk.iad-01.braze.com` + `iamcache` paths — Braze
- `com-bumble-prod1.collector.snplow.net` — Snowplow analytics
- `magic.veriff.me` — Veriff sessions
- Arkose `client-api` endpoints — bot defense
- `x-stream-ext`/`X-Stream-Ticket` headers + `io.getstream` — Stream Chat
- Contentful CDN, `inappservices_silent` carrier-billing endpoints
- GMS endpoints (maps, ads, tflite dynamite)

## Auth headers / tokens [obs strings; construction unk]
`X-API-KEY`/`x-api-key`, `x-version`, `Authorization`/BAPI access-token fields, Firebase-installation auth token headers, Stream `x-stream-ext`/`X-Stream-Ticket`/`Authorization`, Braintree client-token authorization, Bearer tokens for B4F.

## Real-time [obs]
- `SSEApi` (server-sent events) + `SSEApi` v2 (`sseV2GetStream`) strings — server push channel
- WebRTC signaling via `SERVER_WEBRTC_*` + media via `libjingle_peerconnection`
- Stream Chat uses its own websocket (SDK-internal) [inf]

## Cleartext/TLS contradiction [obs — unresolved]

Convention used throughout the report: "(no `SERVER_X` verb)" means the expected legacy RPC name was checked against the 640-verb catalog (`server_api_methods.txt`) and is absent; the feature is reached via B4F services or param-level request models instead.
- Manifest: `android:usesCleartextTraffic="false"`.
- `res/xml/network_security_config.xml` (aapt decode): `base-config cleartextTrafficPermitted="true"`, system trust anchors.
- Direct conflict. Most plausible reading: NSC overrides manifest default → cleartext permitted on system-CA hosts [inf]. No `<pin-set>` observed → **no certificate pinning at NSC level** [obs; pinning could still exist in obfuscated code — unk].
