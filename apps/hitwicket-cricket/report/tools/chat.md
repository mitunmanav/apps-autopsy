# Tool: Chat
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

- **UI entry:** `DashboardChatController`/`ChatDashboardButton` (lobby), `MatchChatPanel`/`MatchChatAnimPanel`/`MatchChatDisplayPanel`/`MatchChatMessagePanel` (in-match), `UniversalChatPopupController` [observation].
- **Parameter model:** `ChatMessageData`, `ChatResponseData`, `ChatUserData`, `ChatTeamData`, `ChatSubcribeResponseData`, `ChatOldData`, `MatchMsgChatData`, `MatchEmojiChatData`, `FeaturesChatInfo` [observation].
- **Execution path:** REST `getChatAuthToken` → WSS `wss://flashchat.hitwicketsuperstars.com/` (`Hitwicket.Chat.dll`; socket path assembled at runtime — suffix unknown); in-match signals `MatchChatMsgSignal`, `InGameEmojiChatSignal`; client-side `BadWords/` profanity lists (11 files: en, es, fil, fr, hi, id, mr, pa, pt, te, tl) [observation]. A message-reporting feature is plausible but no reporting type was found — [unknown].
- **Premium/offline flags:** **online-only**; emoji chat = quick-message subset [inference].
- **I/O flow:** token auth → subscribe → send/receive `ChatMessageData` → profanity filter client → report path → moderation backend [partial inference].
