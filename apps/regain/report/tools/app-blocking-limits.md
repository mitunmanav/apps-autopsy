# App Blocking & Limits

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Modules:** `feature_app_limit` + monitor engine · **Evidence:** OBS

## What it is
Per-app daily usage limits with progressive warnings, hard block overlays, reminders, and a coin/reward economy for honoring limits.

## UI entry (OBS)
`app_limit`/`app_limit_settings`/`app_limit_reminder`/`add_app_limit_reminder` routes; `b_l_nudge_screen` (block-limit nudge); home cards.

## Params model (OBS, `AppLimitDatabase`)
`AppLimit` (+`V10/V11/V12` history): package, daily minutes, enabled; `AppLimitChange` (edit audit); `AddAppLimitReminder`/`AppReminderSetting` (warning thresholds); `CoinLedger`/`GameReward`/`GameOverlayData`/`StreakSuccessOverlayData` (reward economy on compliance).

## Execution path (OBS)
1. User sets limit per app → `AppLimitDatabase`.
2. `MyMonitorInAppBlockService`/`MyMonitorService` sees the app in foreground (accessibility + UsageStats, `getBestEvent`), accumulates session time vs `AppUsage` records.
3. Threshold reminder → `handleAppLimitWindow` → `AppLimitWindowFactory` overlay (SYSTEM_ALERT_WINDOW) warns/nudges.
4. Limit reached → block overlay `app_limit_window`/`b_l_nudge_screen`; app can't be used until reset; `BlockProtectionWindowFactory` guards against force-stop.
5. Compliance → `CoinLedger` credit → `game_reward`/`streak_success_overlay` celebration.

## Data flow
Limit config → DB → monitor accumulation → overlay enforcement → coin/ledger + usage stats.

## Premium/offline (OBS)
Enforcement fully local; coin/game overlay economy local. Pro unlocks more simultaneous limits / stricter modes (INF via `premium` strings + subscription check sites).
