# 30 — Data Collection Inventory

Everything the app observes, stores, or transmits, grouped by destination.

## On-device only (Room + SharedPreferences + files)

| Data | Store | Sensitivity |
|---|---|---|
| Per-app per-day usage minutes, sessions, 30-min time slices | `app_usages`, `time_slice`, `app_digest` | full behavioral timeline |
| Unlock events + timestamps | `phone_unlock` | attention pattern |
| Installed-app inventory (label, package, icon, system flag, category) | `app_detail`, `category_model` | full device fingerprint of apps |
| Per-app rules (monitor, limits, auto-lock, mindful pause, floating clock, category, snooze, no-phone whitelist) | `app_settings` | reveals which apps user fears |
| Challenge runs (diet/fast/no-phone, success/fail) | `fasting_challenge`, `limit_challenge` | self-control failures |
| Goals (usage minutes, unlock count), day-start hour | `settingsPreference` | |
| Badge history, feed seen-count, promo dismissals, iOS-card snoozes, sticker campaigns | `badge_history`, `feedCount`, promo prefs | engagement state |
| Reel-blocker per-app toggles + blocked counters | `reelBlockerPreference` | which social apps user fights |
| Service heartbeat, repair state, query checkpoints | `app_heartbeat`, `usage_query_checkpoint`, `generated_digest_state` | operational |
| Profile: name + avatar image | prefs + `image_dir/profilePic.jpg` | PII-lite |
| Parental action log | `action_notifications` | remote-control audit |
| Accessibility overlay state, 1-h pass timestamp | static `ob7` fields + prefs | |

## Transmitted — `tv-api.yourhourapp.com` (own backend)

| Endpoint family | Data sent |
|---|---|
| `auth/*` | Google ID token, email, FCM token (`auth/fcm-token`), account create/delete state |
| `devices/*` | paired device metadata (`deviceId`, `deviceName`, `platformDeviceId`, `linkState`), pairing short-codes, Google-linked auto-pair candidates |
| `devices/{id}/apps`, `stats/*` | **this phone's installed-app list + usage summaries** (`usageSyncedAt`, `appsSyncedAt`) pushed for the paired guardian TV |
| `devices/{id}/locks`, `overrides` | lock state per package, override tokens/requests |
| `backups`, `delete` | full `yourhour.db` upload (unencrypted SQLite per 26) |

## Transmitted — Firebase / Google

- **Analytics**: 287 events (catalog below) with params: `entry_point`, `analytics_entry_point`, `source`, `target`, `enabled`, `stage`, `user_type` (pro/adfree/lite/free), `total_usage_minutes`, `goal_minutes`, `usage_time`, `unlock_count`, `days_from_install`, `total_time_seconds`, `total_pages`, `last_page_*`, `has_paired_device_once`, `dialog_type`, `permission_type`, `missing_permission`, `challenge_type`, `app_name`, `reason`, `request_token`, `device_id`, `usage_synced_at`, `apps_synced_at`, `issuedAt`…
- **Crashlytics**: every caught exception via `u83.a().b(e)`.
- **FCM**: registration token; receives parental commands + offers.
- **Ad SDKs** (AdMob `pub-3128150064662905`, FAN embedded dex, Unity): AD_ID (Android Ad Services permissions), device signals, per-placement requests.
- **Facebook SDK**: app-scoped ID `670696773447420`.
- **Drive** (`drive.metadata.readonly`): backup metadata upload.

## Story submission = real PII (analytics field names as evidence)

`story_user_name`, `story_user_email`, `story_age`, `story_profession`,
`story_pic_url`, `story_heading`, `story_content`, `story_reader`, tags, country
filter — voluntary but emailed to backend; moderation notifies via `storyChannel`.

## Analytics event catalog (grouped, 287 strings)

- **Retention/cohorts**: `app_session_started`, `day_0`, `day_1`, `day_1_return`, `day_3_return`, `day_7_return`, `day_14_return`, `day_30_return`, `access_token_expired`
- **Onboarding funnel**: `native_onboarding_viewed`, `welcome_screen_viewed`, `welcome_get_started_clicked`, `welcome_language_selector_clicked`, `onboarding_started`, `new_onboarding_abandoned`, `onboarding_progress_v3`, `onboarding_permission_result`, `onboarding_default_monitoring`, `onboarding_usage_level`, `onboarding_status`, `heads_up_handled`, `intro_card_clicked`, `language_recreated`
- **Service health**: `service_not_running`, `service_disconnected`, `service_timeout`, `service_unavailable`, `service_usage_minute`, `service_fixing_issue_detected`, `service_fixing_notification_shown`, `service_fixing_notification_clicked`, `service_fixing_restart_attempted`, `service_fixing_restart_result`, `usage_visit_repair_completed`
- **Dashboard/cards**: `dashboard_card_viewed`, `dashboard_card_clicked`, `dashboard_card_dismissed`, `dashboard_celebration_premium_clicked`, `campaign_card_clicked`, `exit_card_clicked`, `upgrade_card_clicked`, `upgrade_card_dismissed`, `save_card_dismissed`, `save_switch_clicked`, `save_keep_clicked`, `ios_app_launch_card_completed`, `payment_issue_card_dismissed`, `payment_issue_fix_clicked`, `reward_ended_card_clicked`, `reward_ended_card_dismissed`, `explore_clicked`, `proceed_clicked`
- **Monetization funnel**: `paywall_viewed`, `paywall_offer_viewed`, `plan_selected`, `purchase_cta`, `purchase_cta_clicked`, `purchase_dialog`, `purchase_refund`, `purchases_viewed`, `purchases_entry_clicked`, `purchases_card_viewed`, `restore_started`, `restore_clicked`, `exit_offer_shown`, `exit_offer_sheet`, `exit_offer_sheet_shown`, `exit_offer_claim_clicked`, `exit_offer_left`, `exit_offer_dashboard`, `exit_offer_stage`, `pro_rewarded_video_clicked`, `pro_rewarded_video_completed`, `rewarded_ad_load_requested`, `rewarded_ad_show_requested`, `rewarded_ad_paid`, `rate_later_selected`, `validation_failed`
- **Permissions prompts**: `battery_optimization_allow_clicked`, `battery_optimization_later_clicked`, `notification_permission_enable_clicked`, `notification_permission_later_clicked`, `dont_kill_my_app_clicked`, `protection_handled`
- **Features**: `daily_goal_exceeded`, `goal_change_result`, `limit_created`, `limit_setup_started`, `manage_{monitoring,usage_limit,auto_lock,lock_setting,floating_clock,mindfulpause}_selected`, `categorized_app_selected`, `floating_clock_setting_changed`, `mindful_pause_completed`, `mindful_pause_pro_style_clicked`, `mindful_pause_nonpro_style_clicked`, `mindful_pause_setting_opened`, `instant_/scheduled_{diet,fast,no_phone}_challenge_{created,taken,started}`, `new_daily_report_opened`, `day_statistics_opened`, `week_statistics_opened`, `month_statistics_opened`, `picker_opened`, `picker_selected`, `picker_failed`, `status_updated`
- **Reel blocker**: `reel_blocker_screen_viewed`, `reel_blocker_settings`, `reel_blocker_permission_guide_shown`, `reel_blocker_permission_guide_cta`, `reel_blocker_permission_granted`, `reel_blocker_permission_settings_opened`, `reel_blocker_enable_blocked`, `reel_blocker_toggle_changed`, `reel_blocker_<app>_{enabled,disabled}`, `reel_blocker_skip_first_changed`, `reel_blocker_session_expired`, `reel_blocker_turn_off_dialog_shown`, `reel_blocker_turn_off_action`
- **Parental**: `parental_login_started`, `parental_screen_viewed`, `parental_session_expired`, `parental_pairing_code_mode_changed`, `auto_pair_device_selected`, `parental_auto_pair_candidate_selected`, `parental_lock_sheet_opened`, `parental_lock_sheet_dismissed`, `parental_override_sheet_dismissed`, `parental_apps_filter_changed`, `parental_setting_changed`, `parental_onboarding_{started,page_viewed,cta_clicked,completed,abandoned}`
- **Badges/stories**: `badge_won`, `badge_detail`, `badge_shared`, `badge_notify`, `badge_update_date`, `story_opened`, `story_upvoted`, `story_downvoted`, `story_bookmarked`
- **Settings catalog**: `settings_opened`, `settings_{goal_dialog,notification_settings,floating_timer_settings,open_language,export_data_to_xls,export_database,in_app_purchase{,_selected},purchases_and_subscriptions,about_us,join_community,beta_testing,email_us,facebook,instagram,linkedin,youtube,privacy_policy,privacy_options,rate_now,reset_data,reset_dialog,reset_badge_dialog,share_app,intro_card,offer_card,upgrade_card,exit_card,save_offer,general,screen,start_time_of_the_day,version,12_hour_format,24_hour_format}_{selected,clicked}`, `settings_{nonpro_day_start,nonpro_export_data,nonpro_export_db}_selected` (paywall intercepts!), `settings_premium_{export_data,user_day_start}_selected`, `force_update_{shown,action,cancelled,failed,resolved,onboarding_complete}`, `rule_removed`, `dont_kill_my_app_clicked`, `faq_clicked`

## Privacy assessment

- **Scope is maximal for the product's function**: full app inventory + usage + unlock cadence
  is exactly what a screen-time coach needs — but `QUERY_ALL_PACKAGES` + accessibility +
  overlay + device-admin is a lot of power in one APK.
- **Real PII leaves only via**: Google sign-in (email), story submissions (name/email/age/
  profession/photo), Drive backup, and the parental plane (app list + usage to the guardian TV).
- **Behavioral telemetry is extensive**: 287 events including per-prompt allow/later choices,
  paywall psychology (offer shown/claim/left/stage), service-health failures, and cohort
  retention (D1–D30 return pings) — a full product-analytics picture of each user.
- **Dark-pattern telemetry**: exit-offer staging, `reward_ended` re-engagement nudges,
  non-pro settings intercept events — monetization pressure points are all instrumented.
