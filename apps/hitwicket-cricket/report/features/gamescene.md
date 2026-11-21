# Module: GameScene (match presentation)
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

Namespace `Hitwicket.GameScene` + `Hitwicket.GameScene.Views` (largest namespace, 185 types) + `GameSceneEventFileStorage` type (recorded event stream → replays/spectate) [observation].

- **Role:** match-time presentation+input layer on top of MatchEngine; HUDs (`BatsmanHUD*`, `BatsmanHUDCoopController`), score callouts (`ScoreCalloutView`), chibi player panels (`ChibiPanelCoopController`), commentary panel, `MatchChat*` in-match chat UI, `MatchSceneHaptics` (Lofelt integration) [observation].
- **Signals:** `MatchChatMsgSignal`, `InGameEmojiChatSignal`, `ShowLiveChatInSideMatch`, `MatchSpectatorJoinSignal`, `Coop{Disconnect,Reconnect}Signal` (Zenject event bus) [observation].
- **Data in/out:** consumes match events from socket/engine → renders; produces player decisions → `WebSocketContext.Send` [inference].
- **Dependencies:** MatchEngine.dll, Spine/Cinemachine/VFX assets, `assets/Match`×5 serialized scene files in streaming assets [observation].
