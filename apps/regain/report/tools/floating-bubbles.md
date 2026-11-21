# Floating Bubbles

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Module:** `floating_bubble` · **Evidence:** OBS

## What it is
Persistent SYSTEM_ALERT_WINDOW bubbles: a focus-timer mini controller, a productive-mode tag button, and an active-blocks indicator.

## Services (OBS)
- `FTOverlayService` — floating focus-timer widget (live countdown/pause over other apps).
- `PMFloatingButtonService` — productive-mode button for quick tag/allow actions (`pm_tag_overlay`).
- `ActiveBlocksFloatingButtonService` — shows currently active blocks.

## Execution path (OBS)
Monitor/service state → coroutine scope → WindowManager view (compose) → tap → route into `focus_timer_*`/`pm_*`/`block_*` surfaces; position/drag persisted INF.

## Premium/offline (OBS)
Local; requires overlay permission.
