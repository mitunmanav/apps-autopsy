# Network & API

**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 (205957) — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

## Endpoint inventory [observation — metadata string literals + corroborating types]

### Production backend (hitwicketsuperstars.com)
| URL | Transport | Purpose (evidence) |
|---|---|---|
| `https://pvp.hitwicketsuperstars.com/` (+`{0}` template) | HTTPS REST | PvP match API base (`BuildURLByEnv`) |
| `http://{0}:{1}/api/events/{2}?from={3}&to={4}&ip={5}&port={6}` | HTTP | match event stream / spectate (literal template; used by `EventSourcingBridge` type) |
| `https://pvp.hitwicketsuperstars.com/api/matchReplay?matchId={0}` | HTTPS | replay download |
| `wss://pvp.hitwicketsuperstars.com/gs/ws`, `wss://pvp.hitwicketsuperstars.com/gs/ws2` | WSS | live match socket (`WebSocketContext`, `GameScene.Network.WebSocketBridge`, `GameServerWebSocketUrl` types) |
| `https://flashchat.hitwicketsuperstars.com/api/` | HTTPS | chat REST (`getChatAuthToken`) |
| `wss://flashchat.hitwicketsuperstars.com/` | WSS | chat socket host (literal ends at `/`; path assembled at runtime — exact path unknown) |
| `ws://albatross.hitwicketsuperstars.com` | WS | co-op room service (`CoopRoomManager`, `AutoMatchRoomManager`) [inference of role] |
| `ws://rplace.hitwicketsuperstars.com` | WS | room/match service (DC rooms) [inference of role] |
| `https://tracker.hitwicketsuperstars.com/api/analytics` | HTTPS | first-party event telemetry |
| `https://hitwicketsuperstars.com/api/` | HTTPS | main API base |
| `ws://s.y-not.app/callapp` | WS | awrtc WebRTC signaling (voice) |
| `https://k.hitwicketsuperstars.com/appLinks` | HTTPS | app-link endpoint |

### Non-prod shipped [observation]
`staging.hitwicketsuperstars.com`, `preproduction.hitwicketsuperstars.com`, `stg5.z.hitwicketsuperstars.com` (shipped as `http://stg5.z.hitwicketsuperstars.com/social/`), `localhost`/`127.0.0.1` env switching (`OnEnvironmentSwitchToLocalHost`, `LocalEnvEndpoints`, `isIpAddress`), env socket templates `ws://{0}:{1}` and `ws://{0}:{1}/ws`.

### CDN / content [observation]
`cdn.octathorpeweb.com/assetbundles/production/WV/Android/catalog_main_v1.json` (Addressables catalog), `/v1`, `/v1/superstars-catalogs/banners_catalog.json`, `/static/` images, `pavilion.hitwicket.com` + `pavilion.hitwicket.com/buy` (web shop).

### Third-party [observation]
`api.hitwicket.com` (bare literal, legacy), `iap.services.api.unity.com`, Unity insights ingest, `www.googleapis.com/auth/fitness`+`games`+`games_lite`+`drive.appdata` scopes, Firebase `hitwicketsuperstars.firebaseio.com` (google-services-desktop.json); `identitytoolkit`/`securetoken` expected via Firebase Auth [inference — not found in managed strings], `graph.{0}/{1}/` Facebook, `app.adjust.com/18rm68bp`, `hitwicket.page.link` dynamic links, `playhitwicket.go.link` (+`/invite`).

## API surface — ApiHelper (227 methods) [observation — ev_d428a27a…]
Groups: auth (`userLogin`, `getChatAuthToken`, `GetActiveNewAuth`, `registerUserPushDevice`), matches (`getFutureMatchData`, `saveMatchOrder`, `afterMatchTracking`, `UseNewMatchApi`, replay/event endpoints), players (`getPlayerDetails`, `trainPlayer`, `buyTrainingNets`, `boostNetsTraining`), economy (`purchaseEnergy`, `purchaseStamina`, `ConfirmGooglePayment`, `ConfirmApplePayment`, `ConfirmDevPurchase`, `ConfirmWebviewPayment`, `getAuctionTokenInventory`), auction (`getAuctionPageData`, `getAuctionHistoryPageData`, `bidOnPlayer`, `offerStatusUpdate`), rewards/mail (`getMailBox`, `claimMailReward`, `getInviteData`, `claimInviteReward`, `getCanWatchMoreRewardedVideos`), leaderboard (`getLeaderboard`), star-ups (`startStarUp`, `endStarup`), alliance/IPL/Battle Royale/social/spectating/training-slot calls, `CodeHashVerification` (integrity report).

## Transport layers [observation]
- `APIService` (15 methods): `Initialize`, `SetDefaultEvn`, `SetBestHttpFlag`, `CallApi`, `CanRetry`, `IsOffline`, `BuildApiUrl`, `BuildBaseUrl`, `AttachApiUrlValues`, `AttachApiParametersToUrl`, `AttachDefaultParametersToUrl` — env-aware REST client (BestHTTP).
- `WebSocketContext` (27): Connect/Reconnect/Disconnect family, `OnWebSocket{Open,Message,Close,Error,DisConnected}`, `Send`, `WatchConnectionTimeout`, `UpdateRoundTripTime`, `Send{Connected,Disconnect,}Tracker` — resilient WS with RTT tracking.
- Headers: `x-auth-token`, `device-id`, `getHeader`, default params attached per call.
- Retry logic: `CanRetry`, `GetWaitTimeInMS`, `CallApiAndDispose` vs `CallApiSync`.
- Wire formats: Google.Protobuf (`Hwsproto`, `Superstars.Proto.Match`), JSON (Newtonsoft), form params.

## WebView / external [observation]
`pavilion.hitwicket.com` web shop, WhatsApp OTP, `ConfirmWebviewPayment`, CustomTabs queries, Unity WebView not present; WebView safe-browsing enabled.
