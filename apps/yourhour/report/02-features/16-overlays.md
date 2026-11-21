# 16 — Overlays: Floating Timer & Mindful Pause

Both are `SYSTEM_ALERT_WINDOW`-dependent, Compose-rendered overlays managed by obfuscated
coordinators — and both are **premium features**.

## Floating Timer (`floating_clock`)

- Per-app toggle (AppSettings) + global `FloatingTimerSettingsActivity`
  (`floating_timer_settings`); event `floating_clock_setting_changed`.
- Modes (strings): show **current app's usage**, **total phone usage**, **category usage**,
  or **Diet-challenge countdown** — a draggable always-on-top chip fed by the polling loop.

## Mindful Pause

- `SocialMediaOverlayService` (not exported): a `WindowManager` overlay host + coroutine
  coordinator (`eh5`) driven by a tiny state machine —
  `MindfulVisitContext`, `MindfulCountState$Ready`, request intents carrying
  `mindful_request_id` (extra `nh5`).
- Trigger: UsageTimerService detects a foreground app whose **Mindful Pause** toggle is on →
  starts the service with a request id → coordinator `read()`s the visit context, checks
  `isCurrent`, and inflates a Compose overlay (`lg1` view with lifecycle/saved-state tags)
  before the app can be used.
- UX: "continue or don't open" interstitial with an **attempts counter**; styles chosen in
  `ChooseMindfulStyleActivity` (`selected_style_no`, `mindful_pause_screen_style` →
  `choose_mindful_style`), configured per-app in `MindfulPauseSettingActivity`
  (`mindful_pause`, `mindful_pause_setting_opened`).
- Dismissal: listens for `CLOSE_SYSTEM_DIALOGS` (home/recents) to tear down; tracks
  `stopSelfResult` start ids (`Math.max` id bookkeeping); cleans coordinator on destroy.

## Other overlays sharing the machinery

- **Auto-lock screen** (limit reached) and **settings-lock/PIN** screens — same overlay infra;
  sticky-notification requirement documented for locking.
- Reel-blocker has its own overlay (see 17) — accessibility window type `2032` instead of
  `TYPE_APPLICATION_OVERLAY` so it works without the overlay permission.

## Analytics

`floating_timer_settings`, `floating_clock_setting_changed`, `mindful_pause`,
`mindful_pause_setting_opened`, `choose_mindful_style`, per-app toggle events.
