# 32 — Ad Placement Map & Monetization Mechanics

Complete inventory of the 28 ad-slot keys and where each sits in the UX.

## Native ad slots (in-feed, per screen)

| Slot | Screen |
|---|---|
| `native_ad_dashboard_1`, `native_ad_dashboard_2` | dashboard (two slots + `dashboard_attach`/`dashboard_extend_pro` upsell) |
| `native_ad_challenge_1`, `native_ad_challenge_2` | ManageChallengeActivity |
| `native_ad_story_1`, `native_ad_story_2` (+`native_ad_story_`, `story_1`, `story_2`) | story browser |
| `native_ad_day_statistics` | DayStatisticsActivity |
| `native_ad_week_statistics_1/2` | WeekStatisticActivity |
| `native_ad_month_statistics_1/2` | MonthStatisticsActivity |
| `native_ad_report_daily`, `native_ad_report_weekly`, `native_ad_report_monthly` | report bodies |
| `native_ad_notification_daily_report` | the daily-report *notification* deep-link landing |
| `native_ad_usage_pattern` | UsagePatternActivity |
| `native_ad_profile` | ManageProfileActivity |
| `native_ad_1`, `native_ad_2` (generic) | other surfaces |

## Interstitials (screen-transition ads)

| Slot | Fired between |
|---|---|
| `daily_report_interstitial` | opening any daily-report surface (Today/TopApps/AppUsage/Category/DailyUsageReport) |
| `report_interstitial` | statistics screens (week/month/base) |
| `app_usage_report` | per-app report opens |
| `challenge_interstitial` | challenge create/manage flows |
| `interstitial_requested` | load-request log point |

## Rewarded ads

| Slot | Reward |
|---|---|
| `week_reward_ad` | weekly-report access (watch-to-unlock report) |
| `rewarded_video` / `pro_rewarded_video_*` | **8 h of Pro** — strings + `rewarded_ad_{load,show}_requested`, `rewarded_ad_paid`, `pro_rewarded_video_{clicked,completed}` |
| reel-blocker reactivation | watch an ad to restart an expired 8-h blocking session |

`action.REWARD_ENDED` broadcast + `offerReminderPreference.reward_notified_for/at` →
"reward ended" re-engagement cards (`reward_ended_card_clicked/dismissed`).

## Placement strategy (what the slot map reveals)

- **Ads live at moments of maximum engagement**: after you've *just* looked at your own
  stats (report opens → interstitial), inside the dashboards you check compulsively
  (dashboard/story/statistics native slots), and at feature-completion moments
  (challenge created → interstitial).
- **Free tier is saturated**: ~20 native slots + 4 interstitial triggers across every
  report/stats/social surface; the premium pitch ("ad removal" SKU `yourhour_ad_removal`)
  is priced against that density.
- **Rewarded ads as tier bridges**: instead of only paying, free users trade ad-views for
  8-hour Pro / reel-blocker reactivation / weekly-report unlock — converts engagement
  into revenue while demoing Pro value (`pro_rewarded_video_completed` → upsell funnel).
- **Warm pools**: `global_warmup` preloads `native_ad_dashboard_1/2` at app start so the
  first screen is never ad-less.
- **Networks**: AdMob (`ca-app-pub-3128150064662905`), Meta FAN (embedded dex assets),
  Unity — mediation across all placements.

## Monetization pressure design (dark-pattern notes)

- **Exit offers**: dismissing the paywall triggers staged discount offers
  (`exit_offer_{shown,sheet,claim_clicked,left,dashboard,stage}`,
  `exit_notified_for`) — abandon intent monetized.
- **Paid PIN reset** (`yourhour_reset_pin`): forgetting your own lockout PIN is a paid
  unlock — the only "feature" monetizing user lock-in itself.
- **Settings intercepts**: non-pro taps on day-start/export fire
  `settings_nonpro_*_selected` → paywall (measured at every premium-gated settings row).
- **Card churn**: dashboard/upgrade/exit/save/payment-issue/iOS cards each have
  view/click/dismiss events — placement A/B-able per user.
- **Student pass**: 7-day Pro for a student-ID photo — converts a demographic while
  collecting verification images.
