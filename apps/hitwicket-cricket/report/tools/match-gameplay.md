# Tool: Match Gameplay (PvP / PvE)
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

- **UI entry:** dashboard play buttons → mode select → squad/match-order screen → `GameScene` (`Hitwicket.GameScene.Views` 185 types incl. `BatsmanHUD*`, `ScoreCalloutView`, chibi panels) [observation].
- **Parameter model:** squad selection, batting/bowling order (`saveMatchOrder`), strategy inputs, difficulty/AI opponent for PvE, match config (`match_config` catalog) [observation].
- **Execution path:** `Hitwicket.MatchEngine.dll` simulation core driven by `GameScene` presentation; PvP sync over `wss://pvp.hitwicketsuperstars.com/gs/ws` via `WebSocketContext` (Connect→Send/OnWebSocketMessage→`UpdateRoundTripTime`→reconnect); match data fetched via `getFutureMatchData`; post-match `afterMatchTracking`; replays `api/matchReplay`.
- **Remote vs local:** ball-by-ball simulation runs locally (MatchEngine) while PvP exchanges player decisions/state over WS [inference: synchronous-match socket + local engine]; score/progression persisted server-side via REST.
- **Premium/offline flags:** PvP online-only; PvE/practice playable offline (see practice-offline); ticket/energy gates per event (`purchaseEnergy`) [observation].
- **I/O flow:** squad config + live inputs → simulation events → GameScene view state + server sync → result screen → rewards/progression via REST.
