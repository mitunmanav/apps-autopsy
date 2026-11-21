# Home-screen Widgets

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Module:** `widget` + `GlanceRemoteViewsService` · **Evidence:** OBS (9 receivers, glance)

## What it is
Nine Glance widgets surfacing usage, focus, study goals, pro-pass, unlock counts.

## Receivers (OBS, all `APPWIDGET_UPDATE`)
`AppUsageWidgetReceiver`, `FocusTimerWidgetReceiver`, `StudyGoalWidgetReceiver`, `RegaGoalWidgetReceiver`, `StudyCalendarWidgetReceiver`, `ProPassWidgetReceiver`, `PhoneUnlockCountWidgetReceiver`, `ProPassWidgetRestoreReceiver`, `NotificationAndWidgetUpdateReceiver`.

## Params model (OBS)
`@xml/*_widget_info` (sizes/periods); data from Room + SharedPrefs; `NotificationAndWidgetUpdateWorker` refreshes.

## Execution path (OBS)
DB/use-case read → Glance composition → `actionStartActivity` deep-link into the matching screen; restore receivers re-register after reboot/update.

## Premium/offline (OBS)
Local; ProPass widget reflects `/fg/pro_pass` state.
