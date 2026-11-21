# Module: LiveEvents Framework
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

`Features.LiveEvents.*` (incl. `AllianceBattleRoyale`, 233 types) + `Superstars.Payload` (82 event-payload types) + `Hitwicket.{RoadToIPL,IPL,LiveMatches}` assemblies + feature types (`HitfestTrackerHelper`, `OlympicShareContactPopupController`, `DC*`) + `RemoteConfigHandler` [observation].

- **Pattern:** server-driven events; payload types define contract; per-event page/controller/streak/reward triples (e.g., `LiveMatchView`+`LiveMatchDataManager`+`LiveMatchStreakResponse`; `DCCoop*` set for Daily Contest) [observation].
- **Data flow:** Remote Config/`api/events` → `*DataManager` → views → claims → `*Tracker*` telemetry → rewards [inference].
- **Couplings:** co-op rooms (albatross/rplace), chat (alliance), store consumables, voice chat in co-op events [observation of colocated types].
