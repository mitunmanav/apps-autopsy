# Tool: Live-Ops Events
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

- **UI entry:** dashboard event cards/nudges; feature hubs for each event family [observation — type namespaces].
- **Event families [observation — namespaces/assemblies]:**
  - `Hitwicket.RoadToIPL` / `Hitwicket.IPL` — IPL-themed events [observation — real image names]
  - `Features.LiveEvents.AllianceBattleRoyale` — alliance BR
  - `Hitwicket.LiveMatches` — live-match streaks (`LiveMatchStreakView`, `LiveMatchStreakDayCard`, `DCLiveMatch*`)
  - Daily Contest (`DC*` types: coop, rewards, room codes — no dedicated assembly name found)
  - Hitfest (`HitfestTrackerHelper` type), Olympics (`OlympicShareContactPopupController` type), SeasonPass (`SeasonPass` types + `season_pass_*` catalog keys), YC (youth championship types) — features exist as types, not separately-named assemblies
  - `Features.LiveEvents.*` generic framework; `Events` bucket 43 types; `Daily` 56; `Season` 58
- **Parameter model:** event payloads `Superstars.Payload` namespace, catalogs `popup_catalogue_*`, RemoteConfig (`RemoteConfigHandler`), `api/events` endpoint for match-event streams [observation].
- **Execution path:** remote event config → `ApiHelper` event calls → dedicated event scenes/UI → rewards via claims APIs; energy consumables purchased (`purchaseEnergy`) [observation].
- **Premium/offline flags:** **online**; some purchasable entries (streak claims, consumables) [inference].
- **I/O flow:** event metadata → time-boxed UI → participation APIs → leaderboard/reward APIs → `afterMatchTracking` telemetry.
