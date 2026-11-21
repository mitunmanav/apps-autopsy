# 14 — Challenges

## Types

| Challenge | Mechanic | Storage |
|---|---|---|
| **Diet** (`diet_challenge_started`) | pick an app, cap its daily minutes; over-limit = fail | `limit_challenge` table |
| **Fast** (`fast_challenge_taken`) | stay off the phone for a duration/schedule | `fasting_challenge` table |
| **No-Phone** (`no_phone_challenge_taken`) | phone-only whitelist (calls); per-app "ignore for no-phone" toggle | tracked via prefs + runs |
| **Custom** | user-defined schedule/duration | challenge tables |
| `techno_camping_challenge` (legacy) | retired predecessor table kept for history | `techno_camping_challenge` |

## Components

| Component | Role |
|---|---|
| `BaseChallengeActivity` | shared scaffold — "Now"/"Once" mode pick, `onStartTimeSelected(II)` time picker, "Cannot create challenge" guard, "App Not Found!!" for uninstalled targets, `challenge_interstitial` ad |
| `CreateChallengeActivity` (`create_challenge`) | new standard challenge; honors `settings_premium_user_day_start_selected` (custom day-start) |
| `CreateCustomChallengeActivity` (`create_custom_challenge`) | custom challenge creation |
| `ManageChallengeActivity` (`manage_challenge` → `challenges`) | list/manage running challenges; extras `challenge_type`, `app_name`, `medal_flag`; ads `native_ad_challenge_1/2`; broadcasts `com.mindefy.phoneaddiction.mobilepe.CHALLENGES` |
| `UpdateCustomChallengeActivity` / `UpdateScheduleChallengeActivity` | edit existing (`arg_challenge_id`, `arg_challenge_type`) |
| `FeedActivity` | can also launch challenges (error toast "Try starting challenge from challenges screen") |
| `ChallengeAlarmReminderReceiver` / `ChallengeReminderReceiver` | alarm + notification reminders; extras `arg_challenge_id`, `arg_challenge_type`, `arg_is_reminder`, `arg_is_once`; events `receiver_challenge_alarm_reminder`, `receiver_challenge_reminder` |

## Mechanics

- **Instant vs scheduled** are distinct analytics/creation paths:
  `instant_{diet,fast,no_phone}_challenge_created` vs `scheduled_{diet,fast,no_phone}_challenge_created`.
- Schema confirms: `scheduleDays` bitmask, `remindAt`, `lockAppFlag` (auto-lock the target
  during the challenge), `countdownFlag` (diet countdown on floating timer), `quitFlag`,
  `isBadgeCompatible` (fast runs count toward badges).
- Modes: **Now** (start immediately) vs **Once** vs **scheduled/repeat** (alarm receivers).
- Start flow: pick type → pick app (Diet) → set duration/limit → `CHALLENGES` broadcast
  updates dashboard + starts tracking counters; service enforcement watches challenge tables.
- Reminders: alarm-driven receivers post to `challengeChannel`.
- Failure/success drives **challenge streaks** → badges (`badge_challenge_streak_3/7/30`,
  `champion 1/2/3`, fast/no-phone cumulative) — see 22.
- Streak state shown via `medal_flag` on manage screen.

## Analytics

`create_challenge`, `create_custom_challenge`, `manage_challenge` screens; start/take events
(`*_challenge_started`, `*_challenge_taken`); reminder receiver events; ad impressions.

## Premium

Custom challenges + repeats are premium-gated; interstitial `challenge_interstitial` on free.
