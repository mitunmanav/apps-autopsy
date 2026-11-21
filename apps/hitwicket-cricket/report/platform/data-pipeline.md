# Data Pipeline (telemetry & event flows)

**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 (205957) — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

## First-party telemetry [observation]
- Endpoint `https://tracker.hitwicketsuperstars.com/api/analytics`.
- IL2CPP tracker types: `MatchTrackerHelper`, `HitfestTrackerHelper`, `FirebaseAuthAuditTracker`, `AllianceShowdownPlayButtonTrackerData`, `AllianceRaceTracker`, `PaymentTracker`, `TrackerData`, tracker helpers across modules (185-type GameScene.Views namespace includes per-screen trackers).
- Java `PnTracker*` pipeline: FCM message → `CustomFirebaseMessageService.queueDeliveryTrackers` → `PnTrackerQueue` (durable, dedup `google.message_id`, 16-entry LRU) → `PnTrackerFlusher.flushAsync`/`PnTrackerDrainer` → server; tap path `HitwicketUnityPlayerActivity.handleNotification` → `sendNotificationTracker`. [observation]
- `WebSocketContext.Send{Connected,Disconnect,}Tracker` — connection-quality telemetry.
- `afterMatchTracking` — post-match analytics upload.
- `CodeHashVerification` — client integrity hash sent to backend.

## Third-party telemetry [observation]
Firebase Analytics + AppMeasurement, Crashlytics (+NDK), Performance Monitoring (`FirebasePerformanceBridge`), Sessions, Facebook App Events (auto-log enabled), Adjust attribution (`libsigner`), ad-SDK trackers (AppLovin Axon events, InMobi, ironSource, Mintegral, Unity Ads), Unity Insights ingest endpoint.

## Attribution & referrer [observation]
- `AdjustReferrerReceiver` → INSTALL_REFERRER intent.
- Finsky BIND_GET_INSTALL_REFERRER_SERVICE query; `com.attribution.REFERRAL_PROVIDER` query (Meta install referrer provider).
- Deep links `playhitwicket.go.link`/`app.adjust.com/18rm68bp`/`hitwicket.page.link` carry attribution params.

## Match data flow [observation]
1. Match init: REST (`getFutureMatchData`/match API) + room creation on albatross/rplace WS (co-op) [partial inference of room service split].
2. Live play: `wss://pvp…/gs/ws` duplex, protobuf payloads; `UpdateRoundTripTime` latency monitor; reconnect path preserved (`CoopReconnectSignal`).
3. Result: `afterMatchTracking` + result screens; replay retrievable via `matchReplay?matchId=`.
4. Spectate: `api/events/{id}?from={tick}&to={tick}` incremental event feed via `EventSourcingBridge` [observation of template; feed shape inferred].

## Chat data flow [observation]
`getChatAuthToken` (REST) → `wss://flashchat.hitwicketsuperstars.com/` socket; `MatchChatMsgSignal`/`InGameEmojiChatSignal` for in-match chat; `ChatSubcribeResponseData`, `ChatOldData` (history), `FeaturesChatInfo`; BadWords lists applied client-side.

## Offline data flow [observation]
`OfflineDataHelper`/`OfflineDataManager` types (+ `InjectOfflineDataHelper` injection method) + `OfflineTutorialDb` (144 .dat files) feed UI when offline/FTUE; `OfflineFtueWalletSnapshot`; offline quick-match fixtures drive practice mode without network.
