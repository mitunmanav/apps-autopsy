# 12 — Per-App Management & Settings

## Components

| Component | Role |
|---|---|
| `AppSettingsActivity` (`app_settings`, extra `package_name`) | the per-app control sheet |
| `ManageAppActivity` (`manage_app`, extra `arg_selection`) | bulk app list — pick apps for a given management action; filters `isSystem`, category, `edit`/`mixed` modes; `provider.Settings` links out to system settings |
| `AppUsageReportActivity` (`app_usage_report`) | per-app report: usage history + settings; extras `arg_pin_screen`, `analytics_entry_point`, `report`/`premium`/`free`/`unknown` tier |

## Per-app toggles (persisted in `app_settings` table)

- **Monitor** — include/exclude app from tracking (`manage_monitoring_selected`).
- **Daily usage limit** — minutes per day (`manage_usage_limit_selected`, `limit_setup_started`).
- **Auto-lock** — overlay lock when limit hits (`manage_auto_lock_selected`).
- **Lock settings / settings lock** — PIN-gate this app's settings changes (`manage_lock_setting_selected`).
- **Floating clock** — show floating timer while app is foreground (`manage_floating_clock_selected`).
- **Mindful Pause** — interstitial before opening (`manage_mindfulpause_selected`).
- **Usage alert** — notification at threshold.
- **Category assignment** — assign app to a category (`categorized_app_selected`, `selectedCategory`).
- **Snooze** — temporary enforcement pause.
- **Ignore for No-Phone** — whitelist inside No-Phone challenge.

Bulk ops in ManageAppActivity fan a chosen setting out across many selected apps.

## Guided tour

App-settings screen has a step-by-step coach tour (strings): daily limit → auto-lock →
lock settings → category → floating timer → mindful pause → monitor — the same feature
inventory as the toggles above.

## Enforcement linkage

All toggles feed the `enforcement` collaborator of `UsageTimerService` (see 10): limits and
auto-lock are evaluated in the polling loop; floating clock and Mindful Pause front-run via
foreground-app detection; alerts fire notifications.

## Analytics

`app_settings`/`manage_app`/`app_usage_report` screens; per-toggle selection events
(`manage_*_selected`, `categorized_app_selected`, `limit_setup_started`).
