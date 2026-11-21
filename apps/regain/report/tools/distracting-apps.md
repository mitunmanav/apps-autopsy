# Distracting Apps registry

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Module:** `feature_distracting_apps` · **Evidence:** OBS

## What it is
The user's "bad apps" list — a curated registry every blocking feature consumes (focus sessions, limits, zen mode, PM, overlays).

## UI entry (OBS)
`distracting_apps`, `distracting_apps_picker`, `app_list_for_category`, `app_list_settings` — a picker built from `QUERY_ALL_PACKAGES` installed-app inventory.

## Params model (OBS)
`DistractingApps` entity (package, flags) in `DistractingAppsDatabase`/`_Impl`; categorized via `UserAppCategory`/`RegainAppCategory`.

## Execution path (OBS)
Picker → `InstalledAppMeta` list → select → DB → `getDistractingAppsUseCases` injected into monitor service → overlay block on foreground match (`getAppLevelBlocking`, `checkAppLevelBlocking`, `handleAppLevelBlocking`) → `FocusTimerSessionDistractingAppUsage` records how often a bad app was hit during focus.

## Data flow
Installed apps → picker → registry DB → monitor enforcement + per-session distraction stats.

## Premium/offline (OBS)
Fully local.
