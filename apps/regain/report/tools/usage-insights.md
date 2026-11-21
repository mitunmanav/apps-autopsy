# Usage Stats, Reports & Insights

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Modules:** `feature_app_usage_stats`, `feature_app_category`, `feature_control_apps`, `feature_profile_stats`, `feature_impact_banner`, `feature_phone_lock_unlock_counter` · **Evidence:** OBS

## What it is
Screen-time dashboard: per-app/per-category usage, hourly patterns, weekly comparisons, "before vs after Regain" impact, unlock counter, shareable report cards.

## UI entry (OBS)
`home_page_screen` cards, `app_category_usage_screen`, `app_usage_stats`, `weekly_report_screen/{P}?fromDate=`, `progress_report_card_bs`, `shareable_cards`, `impact_share`/`impact_banner_screen`/`impact_metrics_bs`, `streak_progress`, `study_progress_calendar`, `phone_unlock_stats`.

## Params model (OBS)
`AppUsage`/`AppUsageToday`/`HourlyAppUsage`/`UserTotalUsage`/`WeeklyUsageStats`/`AppUsageWithLastWeekComparison`/`BeforeRegainUsage`/`EventData`/`InstalledAppMeta`/`ProductiveModeEventData`; categories `UserAppCategory`/`RegainAppCategory`/`CategoryUsageSummary`/`AppCategoryDto`/`InstalledAppDto`; `UserRegainStats`; `BeforeAfterRegainUsageStats`; `PhoneLockUnlockEvent`.

## Execution path (OBS)
1. Monitor service records `EventData`/`AppUsage` per foreground event (accessibility+UsageStats).
2. `DailyUsageSaveToDbWorker`/`CheckUsageEventWorker` roll-up + integrity; `SyncAppCategoryToDBWorker` maps apps→categories (local + `/app_category/*`).
3. Unlock events recorded on `ACTION_USER_PRESENT`/screen receiver → `PhoneLockUnlockEventDatabase`.
4. Sync → `SendAppUsageEventToServerWorker` → `/usage/submit`, `/usage/get_sync_time`, `/usage/delete`.
5. UI reads aggregates → charts (mpandroidchart) → `shareable_cards`/`impact_share` → `ShareReceiver` + `/app_share/generate_message`.

## Premium/offline (OBS)
Local tracking/DB offline; category enrichment, sync, weekly-report aggregation, AI share text need network.
