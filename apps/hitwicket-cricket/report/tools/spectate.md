# Tool: Spectate & Replays
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

- **UI entry:** `MatchSpectatorJoinSignal`, `MultiplayerSpectateResumeMatchSignal`, `SpectatorModeData`, `SpectatorTransportBridge`, `Hitwicket.Spectate.dll` assembly [observation].
- **Parameter model:** event-stream URL template `http://{0}:{1}/api/events/{2}?from={3}&to={4}&ip={5}&port={6}` — host, port, match/event id, tick window (from/to), plus ip/port echo params [observation — literal + `EventSourcingBridge` type].
- **Execution path:** HTTP GET on the events endpoint returns incremental match-event chunks → `EventSourcingBridge`/`SpectatorTransportBridge` feed them into the same `GameScene` renderer used for live play [inference]; completed matches via `api/matchReplay?matchId={0}` [observation].
- **Premium/offline flags:** **online-only** [observation — requires the HTTP endpoints above].
- **I/O flow:** match id + tick window → event chunks → simulated playback UI → live-chat overlay (`ShowLiveChatInSideMatch`).
