# Module: MatchEngine (cricket simulation)
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

Assembly `Hitwicket.MatchEngine.dll` [observation]; `Match` bucket = 153 global-namespace types; `Hitwicket.Maths`, `MathNet.Numerics` for math; Unity Burst `_burst_generated.so` likely accelerates simulation [inference].

- **Role:** deterministic cricket simulation (ball outcomes, innings, commentary events) feeding `match_events_*`/`commentary_*`/`innings_*`/`match_progress` data shapes mirrored in OfflineTutorialDb catalogs [observation of data shapes; engine internals unknown — IL2CPP bodies unread].
- **Boundary:** engine = pure sim (offline-runnable, evidenced by offline practice + FTUE rigged matches — corroborating image names `Hitwicket.MatchRigger.dll` and `Hitwicket.Ftue10MinTutorial.dll` ship); networking wraps it in GameScene/PvP layer [inference].
- **Replay model:** event stream persisted (`GameSceneEventFileStorage`, `match_events_*`) enables replay/spectate reconstruction [inference].
