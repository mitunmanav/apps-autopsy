# Study Goals, Stamps & Calendar

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Modules:** `feature_study_goal_home` + study screens · **Evidence:** OBS

## What it is
Daily study-goal tracking with a photo "study stamp" (proof-of-work selfie/desk pic), a progress calendar/heatmap, streaks, widgets.

## UI entry (OBS)
`study_goal_home`, `study_goal_setup(_bs)`, `study_progress_calendar`, `study_calendar_screen`, `study_stamp_capture`, `study_stamp_view`, `study_stamp_list`, `streak_progress`; `StudyGoalWidgetReceiver`, `RegaGoalWidgetReceiver`, `StudyCalendarWidgetReceiver`.

## Params model (OBS)
`DailyStudyGoalDay` (per-day goal/met), `StudyStamp` (photo + timestamp), `StudyStampUploadResponse`.

## Execution path (OBS)
Goal set → daily minutes target; `study_stamp_capture` → CameraX photo → `POST /study_stamps/upload` → `/study_stamps/get_stamps`/`delete` sync; `StudyStampSyncWorker`; calendar heatmap reads goal-met days; widgets show goal/calendar/streak.

## Premium/offline (OBS)
Goal/calendar local; stamp upload + history sync need `/study_stamps/*`.
