# Regain Launcher

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Module:** `feature_regain_launcher` + `ProxyLauncherActivity` · **Evidence:** OBS (decompiled `onCreate`/`forwardToRealLauncher`)

## What it is
Regain can register as the home launcher — to gate the home screen during focus (launcher blocked) and to mediate app launches.

## UI entry (OBS)
`launcher_settings`, `default_launcher_settings`, `user_selected_launcher`; `ProxyLauncherActivity` has `category.HOME`.

## Params model (OBS)
`UserSelectedLauncherEntity` (the user's real launcher `ComponentName`) in `BloxDatabase`.

## Execution path (OBS, verified code)
`ProxyLauncherActivity.onCreate` → `forwardToRealLauncher()` → `getRealLauncher()` reads the saved component → if null or == Regain package, returns null (suppress forward → shows Regain home); else `startActivity` on the real launcher's component + `finish()`. During a blocked session (`is_launcher_blocked`), the forward is suppressed → user lands on Regain's own screen instead of the launcher.

## Data flow
HOME intent → ProxyLauncherActivity → saved launcher entity → forward+finish (or Regain screen when blocked).

## Premium/offline (OBS)
Local only.
