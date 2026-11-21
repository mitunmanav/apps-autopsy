# Achievements & Microsoft Rewards

Evidence: `com.touchtype.achievements.*` (database + UI), `AchievementsDatabase`, achievements/`reward_*`/`points_*` strings, `RewardsActivity`, `appconfig/microsoft_rewards/*`, home entries `achievements`, `microsoft_rewards`, OneDrive-migration 1,000-pt offer.

## Achievements

- `AchievementsDatabase` — local DB of achievement progress (typed keystroke milestones, feature usage — inferred from counter columns).
- Achievements UI screen (home → "Achievements") with tier badges + progress.
- Share-able achievement card (share-sheet integration, `achievements` share strings).

## Microsoft Rewards

- `RewardsActivity` + `appconfig/microsoft_rewards/` models — Rewards entry in settings, points display, earn rules delivered remotely.
- Earn actions observed in strings/config: enabling **OneDrive backup** grants points (migration campaign "1000 points"), likely also daily typing/feature-use tasks.
- Requires Microsoft account sign-in; points post to Microsoft Rewards backend (`activity.windows.com` telemetry URL ties in).

## Notes

- Rewards availability is region/account gated (`GatingResponseGson` in accessstack auth likely the gate).
- Static only — earn rules live server-side.
