# 24 — Onboarding, Splash & App Lifecycle

## Flow

| Screen | Role |
|---|---|
| `SplashActivity` (exported, LAUNCHER + `mobilepe://shortcut/...` deep links) | cold-start router: sticker/campaign check (`sticker_pref`: `sticker_id/code/start_date/end_date/country_code/country_exception`), pending force-update resume (`force_update_from_splash`), then Welcome → Intro → Dashboard |
| `WelcomeActivity` (`welcome`) | first-run welcome; `welcome_screen_viewed`, `native_onboarding_viewed`, `language_recreated`, `onboarding_progress_v3` + `analytics_started_at`, `resume_bypass` |
| `NewIntroActivity` (`new_onboarding`) | permission-centric intro: usage-access grant via `AppOpsManager` (`appops` pref, `android:get_usage_stats`), `heads_up_handled`, `onboarding_started`, progress v3; `insightViewModel` for live preview stats |

Onboarding v3 is a funnel (`onboarding_progress_v3` + timestamps) — abandonment is measurable.

- `GrantPermissionActivity` (settings/faq) — Compose re-permission screen for re-requesting
  usage/overlay/accessibility grants after denial or revocation.
- `OnboardingMonitoringWorker` — post-onboarding worker that verifies the tracking service
  actually started (feeds `onboarding_permission_result`/`onboarding_status`).

## Force update

`ForceUpdateActivity` + `forceUpdateCoordinator` (Play In-App Update API):
`appUpdateType`, `allowAssetPackDeletion`; config from `config/app/{v}` endpoint
(`minimum_version_code`, `reason`). Events: `force_update_action{immediate|…}`,
`force_update_failed{play_launch|store_unavailable}`, `force_update_resolved{rule_removed}`,
`force_update_onboarding_complete`; pending state persisted (`pending_minimum_version_code`,
`pending_reason`); falls back to `market://` then Play web URL.

## Shortcuts (`shortcurts.xml`)

`daily_report`, `reel_blocker`, `write_ceo`, `share` — all `mobilepe://shortcut/…` →
SplashActivity routing.

## Account lifecycle (backend)

`auth/register`, `auth/google`, `auth/logout`, `auth/me`, `auth/fcm-token`,
`auth/account`, **`auth/account/deletion`** + **`…/deletion/cancel`** — pending → purging →
cancel-able deletion states (strings).

## Misc lifecycle

- Boot/upgrade restart via BootCompletedReceiver; service watchdog (see 10).
- dontkillmyapp + OEM autostart guidance screens (strings) for Chinese OEMs.
- Battery-optimization exemption prompt.
- `Locale`/`configChanges=locale` handled in-app.
- "Write to CEO" mailto shortcut.
