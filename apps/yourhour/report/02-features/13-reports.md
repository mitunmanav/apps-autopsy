# 13 — Reports, Statistics & Timeline

## Component map

| Screen (analytics key) | Purpose |
|---|---|
| `DailyReportActivity` (`daily_report`) | daily report home |
| `DailyUsageReportActivity` (`daily_usage_report`) | detailed per-day report; extras `arg_date`, `arg_is_type`, `analytics_entry_point` (`notification`/`dashboard`/`premium`/`free`/`unknown`), `arg_pin_screen`, `arg_selection`; event `new_daily_report_opened` |
| `DayStatisticsActivity` (`day_statistics`, `day_statistics_opened`) | daily stats page; native ad `native_ad_day_statistics` |
| `WeeklyUsageReportActivity` (`weekly_usage_report`) | week report; extras `arg_date` |
| `WeekStatisticActivity` (`week_statistics`, `week_statistics_opened`) | weekly stats; ads `native_ad_week_statistics_1/2` |
| `MonthStatisticsActivity` (`month_statistics`, `month_statistics_opened`) | monthly stats; ads `native_ad_month_statistics_1/2` |
| `StatisticActivity` (report/manage) | report hub; honors `extra.LAUNCHER_SHORTCUT_ENTRY` |
| `BaseStatisticsActivity` | shared stats scaffold; `report_interstitial` ad; PIN gate via `arg_pin_screen`; `categorized_app_selected` drill-down |
| `TimelineComposeActivity` (`timeline`) | per-day timeline from `time_slice` table (30-min buckets); extras `arg_date`, `arg_is_custom_time`, `arg_timeline_current_logical_day` |
| `UsagePatternActivity` (`usage_pattern`, ad `native_ad_usage_pattern`) | persona classification (Minimalist / Compulsive Checker / Over Engager) |
| `CarbonFootprintActivity` (`carbon_footprint`) | screen-time → CO₂ estimate report — activity shell is R8-stripped (1KB); emission-factor constants (0.38/0.25/0.15/0.12/0.14/0.75/…/`co2` fields) recovered in `defpackage` but the **exact formula is not reconstructed** |

## PDF export

Three **capturable-Compose PDF activities** render a report off-screen and write:
`YourHour Daily Report <date>.pdf`, `YourHour Weekly Report <range>.pdf`,
`YourHour Monthly Report <range>.pdf` — shared via FileProvider/`net.Uri`.

## "Happy Time" pseudo-app

Reports render goal progress as a **pseudo-app row** literally named `"Happy Time"`
(`bz.c="Happy Time"`, added to report name sets — `an5.java:489`; `adjustHappyTime` flag in
`generated_digest_state` marks affected rows). The API mirrors it with
`happy_time_goal_minutes` + `happy_time_progress_percent` — under-goal time shows as a
fake app entry inside usage lists.

## Scheduled reports

- `DailyReportReceiver` → `DailyReportJobService` → "Refresh Usage job executing" → posts on
  `reportChannel`; `arg_is_type`/`arg_date` deep-links land on the matching stats screen
  (`notification_monthly_report`, `monthly_report`).
- `WeeklyReportReceiver` (`receiver_weekly_report`) — same pattern for week.
- Report-time picker: `onReportTimeSelected(II)` in `AlertSettingsActivity`.

## Ads & premium gates

- Interstitial keys: `report_interstitial`, `daily_report_interstitial`, `app_usage_report`,
  `challenge_interstitial`.
- Native ad slots per stats screen (`native_ad_*_1/2`, `native_ad_notification_daily_report`).
- Tier extras (`premium`/`free`/`unknown`) — deeper history/PDF gated for premium.

## Analytics

Every stats screen: `<screen>_opened` + entry-point + `arg_is_type` + `arg_date`;
`categorized_app_selected` when drilling into a category.
