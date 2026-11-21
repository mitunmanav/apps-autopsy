# Tool: Practice / Offline Matches
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

- **UI entry:** `OfflinePlayPopup` (offline fallback), practice mode entry; `assets/Practice` serialized configs [observation].
- **Parameter model:** canned match data (`offline_quick_match_data_c{l}_l{t}_{name}` literals), bundled `assets/Practice`×5 files, `OfflinePlayerPrefs` [observation].
- **Execution path:** `OfflineDataHelper`/`OfflineDataManager` + `OfflinePlayerPrefs` feed `Hitwicket.MatchEngine` locally; no socket/REST needed [inference from offline helper types + data files].
- **Premium/offline flags:** **offline-capable**; no purchases inside offline mode (OfflineTutorialDb catalogs are fake data — no real payment path) [observation].
- **I/O flow:** local config → engine simulation → GameScene → results held in `OfflinePlayerPrefs`; progression not synced [inference].
