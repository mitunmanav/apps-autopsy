# Focus Timer

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Module:** `ai.blox100.feature_focus_timer` (387 classes — the app's flagship) · **Evidence:** session/config models OBS in decompile

## What it is
Timed focus sessions with strict lock-in, Pomodoro/stopwatch modes, per-session app whitelists, music, tags, schedules, live stats, and social "focus with others" groups. Largest module in the app.

## UI entry (OBS)
`home_page_screen` → `focus_timer_screen`/`focus_session_screen`; schedule via `focus_timer_schedule*`; music via `focus_timer_music_bs`; widget `FocusTimerWidgetReceiver`; FGS `FocusTimerNotificationService` shows live countdown.

## Params model (OBS, `FocusTimerConfigV34` — current schema)
`id`, `defaultTagId`, `is_launcher_blocked` (block home-button during session), `is_locked_in` (strict mode — can't pause/exit), `lastSelectedMode` (enum `P3.EnumC1243p` — timer|stopwatch|pomodoro), `lastSelectedMusic` (`P3.I`), `lastTimerDurationInMillis`, `lastTimerBreakDurationInMillis`, `lastTimerBreaksAllowedCount`, `lastStopwatchBreakDurationInMillis`, `lastStopwatchBreaksAllowedCount`. Older schemas `V9→V31` retained for migration.
Session: `FocusTimerSessionV7→V34` (duration, breaks, tag, app usage, distracting app usage, stats).

## Execution path (OBS)
1. Configure → `FocusTimerConfig` persisted in `FocusTimerDatabase` (Room).
2. Start → session row + `FocusTimerNotificationService` (FGS with 1 s countdown notification) + `MyMonitorInAppBlockService` applies `FocusTimerAppRestriction`/`FocusTimerAllowedAppsV13` — non-whitelisted apps get blocked overlay (`FTOverlayActivity`); if `is_launcher_blocked`, HOME is intercepted (launcher-forward suppress).
3. Strict `is_locked_in` → exit/pause disabled in service logic.
4. Heartbeat → `FocusStatsHeartBeatData` → `/fg/group/update_live_focus` broadcasts live status to group; widget + notification update.
5. End → `FocusTimerSessionStatsV20` roll-up → `focus_report` screens + `sendWeeklyFocusStats` → `/fg/*` group leaderboard sync.

## Data flow
Config → DB → service enforcement → per-event usage capture (EventData) → stats entities → local reports + widgets + group APIs.

## Premium/offline (OBS+INF)
Core sessions offline; group/league/live stats require `/fg/*`. Strict/lock-in, schedules, some music/themes gated by `SubscriptionState` (INF — pro strings + subscription checks in module).
