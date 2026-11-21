# Tool: Co-op Multiplayer & Live Matches
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

- **UI entry:** `DCCoopPageController`, `LiveMatchView`, `PlayLiveMatchPopupView`, `LiveMatchSideNudgeView`, friends list `CoopFriendsListPanelController`, `CoopFriendTeamPanelController` [observation].
- **Parameter model:** room code (`DCEnterRoomCodePopup`, `DCRoomCodeHandler`), friend invites (`CoopInvitePopupData`), auto-match (`AutoMatchRoomManager`), consumables (`DCCoopConsumablesPage`), streak day (`LiveMatchStreakDayData`/`ClaimStatus`) [observation].
- **Execution path:** room lifecycle on `ws://albatross.hitwicketsuperstars.com` and/or `ws://rplace.hitwicketsuperstars.com` [inference: role split unknown], coordinated by `CoopRoomManager`/`LiveMatchesCoopRoomManager`/`DCCoopDataManager`; match play then over `wss://pvp…/gs/ws`; reconnect `CoopReconnectSignal`, disconnect `CoopDisconnectSignal`; invites via `DCInviteNotificationPopup`/`DCCancelInviteNotificationsSignal`.
- **Remote calls:** `GetLiveMatchesV2`, `DCLiveMatchData`/`DCLiveMatchStaticData` payloads, streak claim APIs, room REST fallbacks via ApiHelper [observation].
- **Premium/offline flags:** **online-only**; rewards `DCCoopRewardsController`/`DCCoopRewardRowController`; consumables = monetized [inference].
- **I/O flow:** room join/create (code or auto) → teammate state sync → co-op match events → result `CoopMatchEndResult`/`DCCoopMatchResultComponents` + streak/rewards → `DCHighscoreShareImg` share.
