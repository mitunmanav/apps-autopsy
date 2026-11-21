# Tool: Alliances (guilds)
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

- **UI entry:** dashboard alliance button; 162 global-namespace `Alliance*` types; namespace `Features.LiveEvents.AllianceBattleRoyale` [observation].
- **Parameter model:** alliance data, member lists, Showdown/Raid/League/Academy sub-modules, race tracker (`AllianceRaceTracker`, `AllianceShowdownPlayButtonTrackerData`) [observation — type names].
- **Execution path:** alliance REST calls within `ApiHelper` (alliance group methods); alliance chat via flashchat socket; Battle Royale events via live-events framework [inference: names + API groupings].
- **Premium/offline flags:** **online-only**; free to join, competitive rewards [inference].
- **I/O flow:** alliance state → member coordination → event participation (Showdown/Raid/ABR) → shared rewards + leaderboard updates.
