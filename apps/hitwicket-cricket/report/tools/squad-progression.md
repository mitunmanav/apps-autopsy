# Tool: Squad & Player Progression
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

- **UI entry:** squad page (`Hitwicket.Features.Squad` namespace), player detail, training/nets screens, star-up flow, team-composition editor, `Hitwicket.FakeScoutV2` scout UI [observation].
- **Parameter model:** `player_list`/`squad_list`/`player_performances`/`player_progression_*`/`team_composition`/`training_*` catalogs mirror backend entities; MRP levels (`MRPLevels.dat`) progression table [observation].
- **Execution path:** REST — `getPlayerDetails`, `trainPlayer`, `buyTrainingNets`, `boostNetsTraining`, `startStarUp`/`endStarup`, `saveMatchOrder`; scout/gacha acquisition `ScoutDataStoreAdapter`, `GachaBox*`, `GachaChestApiClientAdapter`; auction acquisition `bidOnPlayer`, `getAuctionTokenInventory` [observation].
- **Premium/offline flags:** **online**; training boosts/star-ups monetized [inference]; FakeScoutV2 = server-backed scout system (name "fake" refers to simulated scouting mechanic) [inference].
- **I/O flow:** squad state → train/acquire → server mutation → updated stats → lineup saved via `saveMatchOrder` → used in matches.
