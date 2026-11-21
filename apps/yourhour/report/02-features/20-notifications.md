# 20 — Notifications, Reminders & FCM

## Channels (created in `YourHour` application class)

| Channel id | Label | Use |
|---|---|---|
| `appUsageChannel` | App Usage | usage alerts / over-limit warnings |
| `usageTimerForegroundChannel` | Usage Timer | FGS notification (id 13) |
| `offerChannel` | Offer and Promotions | offers/rewards |
| `parentalControlChannel` | Parental Control | pairing/lock/override pushes |
| `challengeChannel` | Challenges | challenge reminders |
| `reportChannel` | Usage Reports | daily/weekly/monthly report delivery |
| `storyChannel` | Story Feedback | story moderation/votes |

## Local reminders

| Receiver | Trigger |
|---|---|
| `ChallengeReminderReceiver` / `ChallengeAlarmReminderReceiver` | challenge start/due alarms (`arg_is_reminder`, `arg_is_once`) |
| `DailyReportReceiver` / `WeeklyReportReceiver` | report-ready at user-picked time (`AlertSettingsActivity.onReportTimeSelected`) |
| `RefreshUsageDataReceiver` / `RefreshUsageAlertReceiver` | scheduled usage recompute + per-day alert-flag reset |
| `OfferReceiver` (`subscription_offer_campaign`) + `OfferReminderReceiver` | exit-offer + reward-expiry nudges; dismiss via `action.DISMISS_OFFER_REMINDER`, end via `action.REWARD_ENDED`; prefs `offerReminderPreference` (`exit_notified_for`, `reward_notified_for`, `reward_notified_at`, `reminder_notification_id`) |
| `ServiceHealthNotificationClickReceiver` | tap on "service stopped" warning → dashboard |

## Per-type toggles (`NotificationSettingActivity`, `notification_settings`)

`usageAlertNotificationFlag`, `totalUsageAlertNotificationFlag`,
`challengeNotificationAlertFlag` in `settingsPreference`.

## FCM (`NotificationReceiver` service, `com.google.firebase.MESSAGING_EVENT`)

Handles parental-control pushes (`DEVICE_PAIRED`, `DEVICE_AUTO_LINKED`, `STATS_UPDATED`,
`LOCK_APPLIED`/`LOCK_REMOVED`, `UNLINKED`, `COMMAND_ACKED`, `FORGET_PIN_REQUEST`,
`DEVICE_PARENTAL_UNPAIRED_BY_TV`, `SUBSCRIPTION_OFFER`) → local broadcasts +
`parentalControlChannel` posts; forwards `request_token`, `deviceId`, `deviceName`,
`issuedAt`, `usageSyncedAt`, `appsSyncedAt` to the parental UI.

## Quote notifications

`pref_quote_enabled` — motivational-quote posts (settings toggle).

## Rich notification layouts (RemoteViews)

Custom layouts in `res/layout/`:
- `notification_usage_alert_layout` — over-limit warning with app context
- `notification_challenges_layout` — challenge reminders
- `notification_custom_layout`, `notification_picture_layout` — branded/photo variants
- **`notification_offer_countdown` + `_expanded`** — live countdown timer inside the offer
  notification (urgency mechanic for exit-offer/reward expiry)
