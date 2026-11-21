# Screen Map (all UI surfaces)

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`

UI is Jetpack Compose; destinations are deep-link routed (`link.regainapp.ai/...`, 165 routes extracted from smali/decompiled constants — OBS). Full route list: `analysis/deeplinks.txt`. `{P}` = path param, `?x=` = query param.

## Onboarding & auth (OBS routes)
`exam_selection`, `exam_selection_bs`, `goal_setup`, `goal_setup_bs`, `study_goal_setup`, `study_goal_setup_bs`, `onboarding_screen`, `onboarding_v3`, `intro_video`, `intro_video_after_install`, `intro_video_after_login`, `educational_content`, `educational_screens`, `educational_screens_bs`, `testimonials_bs`, `instagram_challenge`, `signup_screen/{P}?showBackButton=`, `sign_in_bs`, `onboarding_bs`, `device_selection`, `backup_options`, `restore_backup`, `reauth_backup`, `backup_restore_dialog`, `backup_restore`, `backup_delete`, `migration_backup`, `logout_confirmation_bs`, `user_device_list`, `delete_user_confirmation_bs`, `delete_user_confirmation_bs2`, `first_seen_settings`.

## Home & insights (OBS)
`home_page_screen`, `app_category_usage_screen`, `app_usage_stats`, `weekly_report_screen/{P}?fromDate=`, `progress_report_card_bs`, `shareable_cards`, `impact_share`, `impact_banner_screen`, `impact_metrics_bs`, `user_stats_bs`, `streak_progress`, `study_progress_calendar`, `study_calendar_screen`, `study_stamp_view`, `study_stamp_capture`, `study_stamp_list`, `study_goal_home`, `notification_analytics`, `notification_channel_meta`, `notification_channels`, `notification_user_tags`, `notification_review`, `weekly_notification_stats`, `phone_unlock_stats`, `app_list_for_category`.

## Focus timer & groups (OBS)
`focus_timer/{P}`, `focus_timer_screen`, `focus_session/{P}`, `focus_session_screen`, `focus_session_study_time_bs`, `focus_timer_study_time_bs`, `focus_timer_tags_bs`, `focus_timer_allow_apps`, `focus_timer_allow_apps/{P}`, `focus_timer_schedule/{P}`, `focus_timer_schedule_screen`, `focus_timer_schedule_create`, `focus_timer_music_bs`, `focus_timer_music/{P}`, `focus_timer_end_screen`, `focus_timer_deep_focus`, `focus_timer_custom_break`, `focus_timer_edit_duration`, `focus_timer_pomodoro`, `focus_timer_pomodoro_settings`, `focus_report/{P}`, `focus_report_share/{P}`, `focus_report_share_bs`, `focus_timer_stats`, `create_group_bs`, `join_invite_bs`, `group_info/{P}`, `group_preview/{P}`, `group_details_screen/{P}`, `group_members/{P}`, `group_leaderboard/{P}`, `group_theme_settings`, `group_week_leaderboard`, `suggested_groups`, `joined_groups`, `after_session_groups_nudge`, `focus_league_screen`, `focus_league_bs`, `focus_league_tiers`, `member_stats/{P}`, `inactive_members`, `nudge_inactive_bs`, `reactions_bs`, `invite_details_screen`, `generate_invite_link`, `focus_stats_heartbeat`, `focus_completed_cumsum`, `focus_milestone`, `focus_guilt_trip`, `live_focus_preview`, `top_focusing_members`.

## Blocking (OBS)
`app_limit`, `app_limit_settings`, `app_limit_reminder`, `app_limit_change`, `add_app_limit_reminder`, `b_l_nudge_screen`, `app_limit_window`, `app_limit_window_v2`, `block_shorts`, `block_shorts_nudge_screen`, `block_feature_settings`, `block_website`, `block_website_setting`, `b_w_overlay`, `block_protection_screen`, `block_protection_settings`, `distracting_apps`, `distracting_apps_picker`, `app_list_settings`, `zen_mode_screen`, `zen_mode_bs`, `zen_mode_settings`, `zen_mode_schedule`, `productive_mode`, `pm_settings`, `pm_allowed_channels`, `pm_allowed_websites`, `pm_allowed_keywords`, `pm_yt_search`, `pm_channel_preview`, `pm_tag_overlay`, `pm_block_screen`, `uninstall_protection`, `prevent_uninstall`.

## Alarm / C68 (OBS)
`c68_alarm`, `c68_alarm_schedule`, `c68_experience`, `pro_pass_widget`, `freepass_screen`, `pass_expiry_notification`.

## Monetization & account (OBS)
`subscription`, `subscription_screen`, `subscription_paywall_screen?source={P}`, `paywall_screen`, `paywall_fullscreen`, `unlock_offer_bs`, `offer_claim`, `reward_claim_screen/{P}/{P}`, `pro_pass`, `invoices_screen`, `invoice_view/{P}`, `payment_methods`, `payment_status`, `checkout`, `regain_payment_methods`, `coin_ledger`, `coin_ledger_bs`, `game_reward`, `game_overlay`, `streak_success_overlay`, `reward_bs`, `creator_demo_toggle`, `creator_rewards`.

## Settings & system (OBS)
`settings`, `profile_settings`, `account_settings`, `theme_selection`, `theme_settings`, `language_settings`, `app_language_bs`, `notification_settings`, `permission_settings`, `accessibility_permission`, `usage_permission_settings`, `overlay_permission_settings`, `notification_permission_settings`, `exact_alarm_permission_settings`, `battery_optimization_settings`, `auto_start_permission_settings`, `background_permission_settings`, `vivo_background_permission_settings`, `default_launcher_settings`, `device_admin_settings`, `service_fixing`, `network_logs`, `permission_logs`, `debug_screen`, `internal_testing`, `diagnostics`, `analytics_screenshot_preview`, `feedback`, `feedback_form`, `in_app_survey`, `play_store_rating`, `rate_us_screen?source=`, `wall_of_love`, `wall_of_love_submit`, `app_share_message`, `regain_commitment_screen/{P}`, `why_coins_removed_screen`, `existing_user_screen`, `launcher_settings`, `user_selected_launcher`.

## Overlay activities (OBS — system-window hosts, exported)
`OverlayActivity`, `OverlayActivitySupportsLandscape`, `BlockShortsOverlayActivity`, `FTOverlayActivity`, `PMTagOverlayActivity`, `BlockProtectionActivity`, `PermissionStepsOverlayActivity` — each hosts a Compose `C4455g0` content node over other apps (`regainapp://overlay*` links), plus `C68AlarmActivity` (full-screen alarm, `showWhenLocked`, dedicated taskAffinity).

## Other surfaces (OBS)
`SubscriptionActivity` (paywall host), `AccessibilityPermissionActivity`, `ai.regainapp.showcase.MainActivity` + `CustomBrowserActivity` (Showkase gallery + in-app browser), `CheckoutActivity` (Razorpay), `com.canhub.cropper.CropImageActivity` (photo crop), `com.facebook.CustomTabActivity`, 9 Glance widget hosts, `MediaPlayerService` media-session UI.
