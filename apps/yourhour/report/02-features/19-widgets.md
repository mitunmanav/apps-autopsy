# 19 — Home-Screen Widgets

Three Glance (Jetpack) widget providers + a self-managed refresh pipeline.

| Provider | Config | Shows |
|---|---|---|
| `DailySummaryWidgetProvider` | `widget_summary_info.xml` | usage, unlocks, goal progress |
| `TodayUsageWidgetProvider` | `widget_usage_info.xml` | usage + goal ring |
| `UnlockWidgetProvider` | `widget_unlocks_info.xml` | unlock count + goal progress |

## Refresh model

- `updatePeriodMillis=0` — the app drives updates itself, not the framework clock.
- **Refresh workers** + a **day-boundary worker** (WorkManager) re-render widgets at
  midnight rollover and after each usage refresh.
- `WidgetSystemReceiver` (not exported) re-arms on `BOOT_COMPLETED`, `MY_PACKAGE_REPLACED`,
  `TIME_SET`, `TIMEZONE_CHANGED`, `DATE_CHANGED`, `LOCALE_CHANGED` — all day-boundary
  relevant events.

## Data

Widgets read the same Room digest/state as the dashboard (usage minutes, unlocks, goal) —
no independent querying of UsageStatsManager.

## Layouts & classes

- Glance impls `DailySummaryGlanceWidget`, `TodayUsageGlanceWidget`, `UnlockGlanceWidget`.
- XML layouts per widget: `widget_summary{,_compact,_preview,_short}`,
  `widget_unlocks{,_compact,_preview}`, `widget_usage{,_compact,_preview}` — size variants.
- `WidgetEntryActivity` — widget-add/info entry screen.
- Workers: `WidgetRefreshWorker` (refresh), `WidgetDayBoundaryWorker` (midnight rollover).
