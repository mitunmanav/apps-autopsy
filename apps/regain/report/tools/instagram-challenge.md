# Instagram Challenge & Education-app flows

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Evidence:** OBS (routes, strings, `HandleEducationAppNotification`)

## What it is
Onboarding gamification: "Instagram challenge" (commit to reduce Instagram), plus special handling for education apps (e.g., school apps allowed/notified differently).

## UI entry (OBS)
`instagram_challenge` route + `instagram_challenge_*` strings; `HandleEducationAppNotification` receiver.

## Params model (OBS)
`BlockFeatureSetting` reuse; `NotificationAndWidgetUpdateReceiver`; education-app notification channel meta.

## Execution path (OBS)
Onboarding step `instagram_challenge` → set Instagram as a distracting app + commit → block shorts/reels feed + track streak → strings `instagram_challenge_flow`/`rewards`; `HandleEducationAppNotification` intercepts educational-app notifications to allow/annotate them during blocks.

## Premium/offline (OBS)
Local; challenge completion strings + `impact_share` share-card output.
