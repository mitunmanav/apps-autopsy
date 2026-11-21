# Reference — API JSON Field Schema

All `@SerializedName`-equivalent (`@yw7`) field names recovered from the request/response
models. Grouped by domain — this is the **complete wire contract** with
`tv-api.yourhourapp.com/api/v1/`.

## Identity & account

`user`, `email`, `firebase_uid`, `display_name`, `role`, `app`, `app_id`, `app_name`,
`app_version`, `platform`, `is_pro`, `subscription`, `subscription_cancellation`,
`subscription_renewal_restored`, `deletion`, `deletion_request_id`, `fcm_token`,
`fcm_tokens_removed`, `token`, `settings`, `status`, `error`, `success`, `confirmation`,
`source`, `reason`, `created_at`, `updated_at`, `requires_monitoring_epoch`,
`already_scheduled`, `available`, `changed`, `items`, `notifications`.

## Devices & pairing

`device`, `device_id`, `device_name`, `device_type`, `device_time_zone`, `devices`,
`tv_name`, `is_online`, `is_paired`, `is_parentally_paired`, `is_google_linked`,
`fully_unpaired`, `already_paired`, `can_auto_pair`, `auto_pair_status`, `candidates`,
`pairing_code`, `pairing_code_format`, `link_method`, `link_methods`,
`parental_link_method`, `parental_links_removed`, `reset_devices`, `unpair_devices`,
`affected_devices`, `push_status`, `tv_push_status`, `last_heartbeat`, `last_synced`,
`last_synced_at`, `last_usage_synced_at`, `last_apps_synced_at`, `requested_from`.

## Locks, overrides & commands

`parental_lock`, `has_parental_lock`, `is_locked`, `is_enabled`, `restriction_type`,
`immediate_lock_enabled`, `active_override`, `active_overrides`, `active_overrides_count`,
`existing_override`, `override_token`, `command_token`, `request_token`, `requested_at`,
`responded_at`, `grace_period_days`, `expires_at`, `started_at`, `ended_at`,
`scheduled_at`, `disabled_at`, `cancelled_at`, `duration_ms`, `duration_minutes`,
`duration_formatted`, `limit_duration_ms`, `used_duration_ms`, `used_ms`, `used_formatted`,
`action_type`, `direction`, `from`, `to`, `app_name`, `icon_url`, `package_name`-adjacent
`app`, `label`, `category`.

## Usage stats & dashboards

`today`, `today_usage`, `today_usage_ms`, `today_usage_time_ms`,
`today_usage_time_formatted`, `today_visit_count`, `visit_count`, `usage_ms`,
`usage_time_ms`, `usage_time_formatted`, `usage_formatted`, `daily_avg_ms`,
`daily_avg_formatted`, `average_usage_ms`, `average_usage_formatted`, `daily_goal_ms`,
`daily_goal_formatted`, `daily_limit_ms`, `daily_limit_minutes`,
`daily_limit_formatted`, `daily_remaining_ms`, `daily_summaries`,
`daily_usage_goal_minutes`, `weekly_summary`, `weekly_limit_ms`,
`weekly_limit_formatted`, `weekly_average_idle_time_ms`, `weekly_average_tv_time_ms`,
`hourly_graph`, `weekly_graph`, `hour`, `hour_start_at`, `hour_end_at`, `period`,
`week`, `week_start`, `week_end`, `date`, `day_label`, `is_today`, `is_future`,
`top_apps`, `peak_usage_day`, `weekend_usage_percent`, `total_ms`, `total_formatted`,
`total_idle_time_ms`, `total_idle_time_formatted`, `total_tv_time_ms`,
`total_tv_time_formatted`, `total_installed_apps`, `all_apps_open_count`,
`total_days_with_data`, `days_within_limit`, `vs_yesterday`, `vs_last_week`,
`change_percent`, `progress_percent`, `usage_progress_percent`, `used_percent`,
`remaining_ms`, `remaining_formatted`, `left_ms`, `left_formatted`,
`limit_exceeded_by_ms`, `limit_exceeded_by_formatted`, `contribution_to_total_tv_percent`,
`recent_activity`, `dashboard`, `stats`, `limit_info`, `limits_and_controls`,
`user_goal`, `usage_health`, `usage_status`, `apps`.

## Goal window — **"Happy Time"**

`happy_time_goal_minutes`, `happy_time_progress_percent` — server carries the goal window
as a first-class stat. Client-side, "Happy Time" is a **pseudo-app entry** (`bz.c =
"Happy Time"`, added to report name sets — `an5.java:489`): reports render the
under-goal portion as a pseudo-app row so the goal progress appears inside usage lists.
`adjustHappyTime` flag in `generated_digest_state` marks rows that include it.

## What this proves about data sent to TV/guardian

The guardian's TV can query: every installed app (`apps`, paginated), per-app today/week
detail, visit counts, hourly graphs, weekly summaries, idle time, peak day, weekend %,
goal progress, and can push locks (`restriction_type`, `immediate_lock_enabled`,
`duration`, `limit_duration_ms`) and see `used_ms` vs limit. The `action_notifications`
table mirrors `action_type` + `usedDurationMs`/`limitDurationMs` — the guardian sees
**usage-relative-to-limit context for each controlled app**, not just lock state.
