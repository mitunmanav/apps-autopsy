# Offline vs Online Classification

**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 (205957) — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`
Detection evidence: `APIService.IsOffline`, `OfflineDataHelper`/`OfflineDataManager`, `OfflinePlayerPrefs`, `OfflineFtueWalletSnapshot`, `OfflinePlayPopup`, OfflineTutorialDb assets, `CanRetry`/reconnect paths.

| Feature | Classification | Evidence |
|---|---|---|
| Practice / offline quick match | **Offline-capable** [observation] | `offline_quick_match_data_*` literals, `assets/Practice` configs, `OfflinePlayPopup` |
| FTUE / tutorial | **Offline-capable (simulated)** [observation] | OfflineTutorialDb full backend snapshot + `ftue_rig_catalog.dat` + fake providers — tutorial plays against canned data |
| PvP match | **Online** [observation] | `wss://pvp…/gs/ws` socket, `pvp.` REST base |
| Co-op rooms / live matches | **Online** [observation] | `ws://albatross`, `ws://rplace`, `DCRoomCodeHandler`, `CoopRoomManager` |
| Spectate / replay | **Online** [observation] | `api/events/{id}?from…to…`, `api/matchReplay` |
| Chat | **Online** [observation] | `getChatAuthToken`, flashchat WS |
| Voice chat | **Online** [observation] | awrtc WebRTC + `ws://s.y-not.app/callapp` signaling |
| Auth / login | **Online** [observation] | Firebase token → session; guest identity provisioned server-side (`EnsureGuestIdentityAsync`→API) [partial inference] |
| Store / IAP | **Online** [observation] | Billing + `Confirm*Payment` server calls |
| Ads | **Online** [observation] | mediation networks; `getCanWatchMoreRewardedVideos` gated by server |
| Alliance / friends / invites | **Online** [observation] | API calls (`claimInviteReward` etc.) |
| Auction | **Online** [observation] | auction APIs |
| Training / squad management | **Online** [observation] | `trainPlayer`, `saveMatchOrder` persist server-side |
| Settings / profile edit | **Mixed** [inference] | local prefs (audio/haptics toggles) + server `changeCountry`/`changeUsername` calls |
| Offline resilience | [observation] | `IsOffline` gate + `CanRetry`/`GetWaitTimeInMS` retry + WS `Reconnect`/`WatchConnectionTimeout` + `CoopReconnectSignal` — app degrades to retrying UI, not local simulation |
| Bad-word filtering | **Offline** [observation] | shipped BadWords lists applied client-side |
| Catalogs (MRP levels, popups) | **Offline-cached** [observation] | bundled `.dat` catalogs + remote `banners_catalog.json` refresh |
