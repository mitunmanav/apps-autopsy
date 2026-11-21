# Zen Mode

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Module:** `feature_zen_mode` · **Evidence:** OBS

## What it is
Scheduled or instant "everything off" deep block — phone enters a minimal-distraction state (all/most apps blocked) for a duration or daily window.

## UI entry (OBS)
`zen_mode_screen`/`zen_mode_bs`/`zen_mode_settings`/`zen_mode_schedule`; `ZenModeAlarmReceiver` handles scheduled start/stop.

## Params model (OBS)
`ZenModeConfigV7` (current; duration, allowed apps, schedule), `ZenModeConfigOld`+`ZenModeDayWiseOld` (legacy day-wise schedule schemas), `ZenModeUIModel`.

## Execution path (OBS)
1. Configure → `ZenModeDatabase`; schedule → `ZenModeAlarmReceiver` + `USE_EXACT_ALARM`/`SCHEDULE_EXACT_ALARM`.
2. Trigger → `MyMonitorService.checkZenMode`/`startZenMode` + monitor engine blocks per `ZenModeConfigV7` whitelist; overlay covers blocked apps; strict exit prevention (INF: combined with block-protection).
3. End → `stopZenMode`; stats into usage DB; analytics event.

## Data flow
Config/schedule → alarm/worker → monitor enforcement → usage records.

## Premium/offline (OBS)
Fully local; scheduled modes use exact alarms. Pro gating INF (premium strings in module).
