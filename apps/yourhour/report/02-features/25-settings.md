# 25 — Settings

## Hub: `ManageSettingActivity` (`settings`, event `settings_opened`)

Sections (screen keys + evidence):

| Screen (key) | Contents |
|---|---|
| `GoalSettingsActivity` (`goal_settings`) | daily usage goal ("2h 30m" default display, `02.00`), unlock goal ("50 times"), "Take a break!"; create/update modes; `goal_change_result` analytics bucketed by goal size (`0_60`, `61_120`, `121_240`, `241_plus` usage minutes; `0_25`, `26_50`, `51_100`, `101_plus` unlocks) |
| `AlertSettingsActivity` (`alert_settings`) | usage/total/challenge alert toggles + report-time picker `onReportTimeSelected(II)` |
| `NotificationSettingActivity` (`notification_settings`) | `usageAlertNotificationFlag`, `totalUsageAlertNotificationFlag`, `challengeNotificationAlertFlag` |
| `AppearanceSettingsActivity` | theme/dark-mode; hub also carries **day-start hour** (`settings_premium_user_day_start_selected` — premium), start-of-week (`arg_start_of_the_week`), date format (`DD/MM/YY`, `MM/DD/YY`), 12/24h format (`settings_12/24_hour_format_selected`), quote toggle `pref_quote_enabled` |
| `LanguageSettingsActivity` (`language_settings`) | ~90 locales + translation credits link |
| `FloatingTimerSettingsActivity` (`floating_timer_settings`) | see 16 |
| `MindfulPauseSettingActivity` (`mindful_pause`) + `ChooseMindfulStyleActivity` (`choose_mindful_style`) | see 16 |
| `ReelBlockerSettingActivity` (`reel_blocker`) | per-app reel toggles + permission deep-links (see 17) |
| `ManageAppActivity` (`manage_apps`) | bulk per-app settings (see 12) |
| `PurchasesAndSubscriptionsActivity` (`purchases_and_subscriptions`) | see 21 |
| Parental/PIN | `SetPinActivity`, `ChangePinActivity`, `EnterPinActivity`, `PinLockInstructionActivity`, `PinLockSettingsActivity` (PIN-lock hub), `ParentalSettingActivity` (see 18); **device admin** toggle ("Device Admin Activated/Cancelled") |
| `GrantPermissionActivity` | re-permission flow (usage/overlay/a11y) |
| `TranslatorCreditActivity` | translation contributors credits |
| `ExportDataActivity` (`export_data`) / `ImportDataActivity` (`import_data`) | see 26 |
| `AboutUsActivity` (`about_us`), `FaqCategoryActivity`/`FaqActivity` (`faq_category`, `faqs`, `yh_pref`), `BlogActivity` (`arg_url` — in-app web view) | info & support; translation credits |

Models: `Faq` = `{id, question, answer, position}`; `FaqCategory` (Parcelable) =
`{id, name, imageUrl, position, likeCounter, dislikeCounter}` — **FAQ categories carry
server-fed like/dislike voting counters**.

PIN lock design (from `how_pin_lock_for_settings_works_instruction`): the intended flow is
an **"accountability partner"** — a friend sets the PIN to lock app settings so the user
can't weaken their own limits. Still undermined by plaintext `parent_lock_pin` storage (S1).

## Hub-level extras

- Manage screen shows live previews ("2h 30m", "50 times", "Off", "Take a break!", "Sunday",
  "DD/MM/YY", "English", "12:00 AM", version "4.5.6").
- `settings_premium_export_data_selected` — export is premium-gated at the hub.
- Subscription deep-link `play.google.com/store/account/subscriptions?sku=yourhour_pro&package=…`.
- `listenerHandler` — pref-change listener propagation to service/enforcement.
- PIN gate: `arg_pin_screen` routes through EnterPinActivity before sensitive sections.
