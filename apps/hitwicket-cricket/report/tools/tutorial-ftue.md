# Tool: Tutorial / FTUE
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

- **UI entry:** first-session tutorial (`HitwicketNew.TutorialSystem` namespace), `Ftue10LiveMatchesLobbyTutorial` and other `Ftue*` tutorial classes, `OfflinePlayPopup` [observation].
- **Parameter model:** `OfflineTutorialDb/` — 144 `.dat` files (verified `unzip -l`): fake-backend catalogs (`campaign_data`, `fake_scout_data`, `features_data_*`, `dashboard_0`, `spin_wheel`, `player_names_*`, `team_names`, `players_data_*`, `offline_trophy_road_*`, `pk_challenge_match_recruit`) + scripted-match fixtures (`offline_quick_match_data_c1_l2-l5`, `offline_opponent_lineup_data_c1_l1-l15`, `quick_match_*`, `smart_play_match_1`, `pk_match_data_*`, `ftue_10_min_match1/2`) in domestic/`_international` + named-variant (`ftue_10_min`, `gradual_rampup`, `sachin_saga`, `super_shards`) forms; plus `OfflineData/ftue_rig_catalog.dat` rigging scripts [observation].
- **Execution path:** `OfflineDataHelper`/`OfflineDataManager` types (+ `InjectOfflineDataHelper` injection method) serve tutorial UI from bundled catalogs → rigged scripted matches (`Hitwicket.FakeScoutV2` namespace, `OfflineFtueWalletSnapshot`) → real backend handoff post-tutorial [inference: rigged catalog + fake providers].
- **Premium/offline flags:** **offline-simulated**; store/tutorial purchases are fake (snapshot only) [observation].
- **I/O flow:** tutorial state machine → canned data → simulated matches → wallet snapshot → transitions to live services.
