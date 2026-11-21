# C68 Alarm (sleep/wake schedule)

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Module:** `feature_c68` · **Evidence:** OBS

## What it is
A full-screen, can't-ignore alarm for sleep/wake discipline ("C68 experience") — wakes the device with its own task, rings, and drives a Pro-pass system ("free pass" to skip).

## UI entry (OBS)
`c68_alarm`/`c68_alarm_schedule`/`c68_experience`/`freepass_screen`/`pass_expiry_notification`; `C68AlarmActivity` (`showWhenLocked`, `excludeFromRecents`, `taskAffinity=ai.regainapp.c68alarm`).

## Params model (OBS)
Alarm schedule entity (in `BloxDatabase`/c68 tables), `ProPassClaimResponse`; `EndTesterProPassWorker`, `C68AlarmMediaRestoreWorker`, `PassExpiryNotificationReceiver` manage the pass lifecycle.

## Execution path (OBS)
1. Schedule → exact alarm → `C68AlarmReceiver`.
2. `C68AlarmService` (FGS `mediaPlayback`, wake lock, ringtone) fires → `C68AlarmActivity` full-screen UI; snooze → `C68AlarmSnoozeReceiver` re-arms; reboot → `C68AlarmRestoreReceiver` + `MyMonitorService.checkC68Alarm` re-schedule.
3. "Pro pass" (free-skip) → `/fg/pro_pass/claim`, `/reset_internal`, `/expire_internal`; expiry → `PassExpiryNotificationReceiver` notification.
4. Media/volume → `C68AlarmMediaRestoreWorker` restores ringer state.
5. Notification cleanup → `NotificationListener` `suppressC68Notification` use-case swallows stale alarm notifications.

## Data flow
Schedule → AlarmManager → FGS ring → UI → snooze/pass API → local state → notification listener cleanup.

## Premium/offline (OBS)
Alarm fully local; Pro-pass + tester-pass lifecycle are `/fg/pro_pass/*` network calls.
