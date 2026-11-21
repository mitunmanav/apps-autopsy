# In-app updates

Evidence: `com.google.android.play.core.*` bundled (Play In-App Updates SDK), `assets/appconfig/in_app_update/params/models/*`, `bibomodels.inappupdate.*` classes, card "In App Update - existing users", `in_app_update*`/`app_update_*` strings, market install referrer.

## What it is

Play Core in-app-update flow — prompt inside the app to update from Play Store without leaving.

## Mechanics

- `com.google.android.play.core.appupdate`/`install` SDK present → `AppUpdateManager` immediate/flexible flows.
- `bibomodels.inappupdate.*` + `appconfig/in_app_update/params` — remote criteria (version floor, staleness days, rollout %), delivered via BiBo like other configs.
- Card campaign "In App Update - existing users" — messaging-centre prompt into the update flow.
- `com.android.vending.INSTALL_REFERRER` receiver + `app.adjust.com/n4j99i9` — install-source attribution feeding which users get prompted.

## Limits

Play-side availability required; the flow triggers only when Play reports an update exists — not runtime-verified.
