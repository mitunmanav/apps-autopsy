# 11 — Dashboard & Home

## Components

| Component | Role |
|---|---|
| `DashboardActivity` | main screen (post-onboarding host) |
| `HomeActivity` | home shell; receives parental broadcasts (`PARENTAL_DEVICES_CHANGED`, `PARENTAL_SESSION_EXPIRED`, `ACTION_TV_PARENTAL_UNPAIRED`) |
| `TodayUsageActivity` (screen key `today_usage`) | today's per-app usage list; entry `app_usage_report`, interstitial `daily_report_interstitial` |
| `TopAppActivity` (`top_apps`, extra `mode`) | top-used apps ranking |
| `AddictionLevelComposeActivity` (`addiction_level`) | addiction classification screen |
| `FeedActivity` (`feed`) | in-app feed (see 23) |
| `BaseActivity` | `progressHud` shared loading UI |

## Dashboard cards / promos

- **Usage summary + goal ring**, unlock count, top apps, report shortcuts, challenge nudges,
  category report entry, floating timer status.
- **`dashboard_extend_pro`** / `dashboard_attach` + `native_ad_dashboard_1/2` — two native ad
  slots and a Pro-upsell card on free tier.
- **iOS launch card**: `iosAppLaunchPreference` tracks `dismissal_count`, `completed`,
  `last_dismissed_at`, `next_show_at` — snooze-aware promotional card announcing the iOS app.
- **Dashboard promo rotation**: `dashboardPromoPreference` with `dashboard_promo_current`,
  `parked_hidden_at_count`, `dismissal_count`, `last_dismissed_at` — sequenced promo units.
- Battery-optimization nudge via `PowerManager.isIgnoringBatteryOptimizations` + settings deep link.
- **Parental/TV card**: `dashboard_remote_tv_card` entry into `ParentalControlOnboardingActivity`.

## Addiction level

Six-level ladder, worst→best: **Addicted → Obsessed → Dependent → Habitual → Achiever →
Champion** (level index `i3` 1-5+ in `t22.java`; i3==5 shows Champion-from-Achiever).
Rules from `category_message` string: computed from **last 7 days** of usage and **apps in
the productivity category are excluded** from the addiction math.

Level-up mechanic (`t22`/`DashboardActivity`): level stored via `j66.z`/`j66.Y`; when the
computed level exceeds the stored max the dashboard fires a **confetti celebration**
(`lm6` + `pj6` particle emitter — 90 particles, 40/s, 2s burst, color sets) and shows a
transition card pairing current→new level names (`ra(i3, next, current)`), e.g.
`message_habitual_to_achiever` "step away from Champion". Exact numeric thresholds live in
the obfuscated ViewModel (`f0().B`) — **not reconstructed** (static-only caveat).

## Analytics

`dashboard` screen key; card impressions/clicks; promo dismissal counts; entry-point extras
(`analytics_entry_point`, premium/free/`unknown` user tier) propagate to downstream screens.

## Data flow

Dashboard reads the Room digest tables + live service state (today's totals, unlock count),
not raw UsageStats — consistent with the digest engine in 10.
