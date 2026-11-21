# Network & API Surface

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`

## Hosts (OBS, extracted from smali/decompiled const strings)

| Host | Role |
|---|---|
| `api.regainapp.ai` | primary REST API (Retrofit, ~70 endpoints below) |
| `analytics.regainapp.ai` | self-hosted Jitsu analytics ingestion |
| `otel.regainapp.ai` | OpenTelemetry `/v1/traces` (staging+production, embedded API key) |
| `puraa.regainapp.ai` | static CDN (paywall assets) |
| `link.regainapp.ai` | deep-link router host (in-app + web links) |
| `join.regainapp.ai`, `gift.regainapp.ai`, `invite.regainapp.ai` | referral/join web links (VIEW deep links into HomePageActivity) |
| `feedback.regainapp.ai` | feedback/logs host |
| `play.google.com`, `api.whatsapp.com`, `youtube.com` | share/rate/external |
| Firebase/Google endpoints | `firebase-settings.crashlytics.com`, `*.googleapis.com`, `firebaseinstallations`, `measurement.com` |

## REST API — `https://api.regainapp.ai` (OBS from Retrofit `@GET/@POST/@PUT/@Multipart` annotations in `T2`, `A2`, `p553y`, `p228jh`, `M0`, `p542xe`, `S7`, `p036bg`, `He`, `Ab`, `p495vc`, `p108ed`, `M3`, `Yd` interfaces)

### Auth / user (`Yd/*`, `feature_user_signin`)
- `GET /auth/google_sign_in` (google token + `regain_email`) → JWT + user
- `POST /auth/refresh_token`
- `GET /auth/user/get-user-data`
- `GET /auth/user/get-user-meta-data`
- `POST /auth/user/save_user_first_seen_version_and_time`, `GET /auth/user/get_first_seen`
- `GET|PUT /auth/user/[get-|update-]google-info-preferences`
- `POST /auth/user/upload-profile-picture` (multipart)
- `POST /auth/user/mark_user_deleted`, `POST /auth/user/mark_user_restored`
- `POST /auth/user/save_device_meta`, `GET /auth/user/get_device_meta` (multi-device list)
- `POST /auth/user/get_backup_meta_data`, `POST /auth/user/save_backup`, `POST /auth/user/migrate_backup`, `POST /auth/user/delete_backup`
- `POST /auth/user/delete_user_data`, `POST /auth/user/delete_user` (+`confirm_delete` flag)
- `GET /auth/user/get_user_available_themes_without_auth_v1` (pre-login themes)
- `POST /auth/user/update_user_time_zone`, `update_user_locale`, `update-user-name`, `user-satisfied?source=…`
- `POST /auth/auth/experiment/enroll` (A/B)
- `GET /tier/get_tier?exam=…&phone_ram_gb=…` (device tier)

### Payments (`p228jh`, `feature_user_signin.PurchaseClaimApi`)
- `POST /payments/subscriptions/setup`, `GET /payments/subscriptions`, `POST /payments/subscriptions/cancel`
- `POST /payments/one_time_orders/setup`, `GET /payments/one_time_orders/status`, `GET /payments/one_time_orders/latest`, `POST /payments/one_time_orders/cancel`
- `GET /payments/orders/status`, `POST /payments/orders/channel` (`payment_channel`)
- `GET /payments/invoices`, `GET /payments/invoices/{id}/pdf`
- `POST /payments/claim` (PurchaseClaimApi — Google purchase token + `regain_email`)

### Focus groups / social (`S7/*` → `/fg`)
- `POST /fg/group/create`, `GET /fg/group/get_groups`, `GET /fg/group/get_joined_groups`, `GET /fg/group/get_suggested_groups`, `GET /fg/group/get_group_details`, `GET /fg/group/get_group_members`
- `POST /fg/group/edit`, `POST /fg/group/leave`, `POST /fg/group/kick_member`, `POST /fg/group/invite`, `POST /fg/group/update_preference`
- `POST /fg/group/save_reaction`, `GET /fg/group/get_reactions`, `GET /fg/group/get_my_reaction_count`, `GET /fg/group/get_inactive_members`, `POST /fg/group/nudge_inactive_members`
- `GET /fg/group/get_group_week_leaderboard`, `GET /fg/group/get_group_week_focus_stats`, `GET /fg/group/get_group_theme`, `POST /fg/group/update_group_theme`, `GET /fg/group/get_top_focusing_members`, `POST /fg/group/update_live_focus`
- `POST /fg/offers/claim`, `POST /fg/offers/conversion` — offer system
- `POST /fg/pro_pass/claim`, `POST /fg/pro_pass/reset_internal`, `POST /fg/pro_pass/expire_internal` — Pro pass

### Usage sync (`p036bg`)
- `POST /usage/submit` (periodic usage upload), `POST /usage/get_sync_time`, `POST /usage/delete`
- `POST /app_category/submit_apps` (installed-app list for server categorization), `GET /app_category/get_app_categories`

### Productive mode / YouTube (`Ab`)
- `GET /pm/get_yt_channel_meta`, `GET /pm/get_yt_channel_meta_using_channel_handle`, `GET /pm/get_yt_channel_meta_using_channel_name`, `GET /pm/get_productive_channels`, `GET /pm/get_yt_search_results_from_regain_api` (server-side YT search)

### Website blocking (`A2`)
- `GET /wb/get_website_search_recommendations`, `GET /wb/get_website_category` (server-side domain→category lookup)

### Notifications (`He`)
- `POST /notification/update_channel_meta_data`, `POST /notification/get_channel_meta_data`, `POST /notification/update_user_tag`, `GET /notification/get_user_tag`, `POST /notification/save_user_tag_data`

### Invite/referral (`p108ed`, `M3`, `p495vc`)
- `POST /invite/create_link` (+`join.regainapp.ai` links), `GET /invite/referral_count`, `GET /invite/group_invite_referral_count_without_auth`, `POST /invite/register_successful_referral`, `POST /invite/claim_reward`, `GET /invite/get_group_invite_rewards`, `POST /invite/set_user_device_login` (new-device referral binding)

### Misc (`p553y`, `p495vc`, `He`, `T2`)
- `POST /app_share/generate_message` (AI share text), `GET /wall_of_love/get_approved_posts`, `POST /wall_of_love/rewrite_with_ai`
- `POST /fcm/save_token`, `POST /send_feedback/logs` (multipart log upload), `GET /study_stamps/get_stamps`, `POST /study_stamps/upload`, `DELETE /study_stamps/delete`
- `POST /event_screenshots` (multipart — analytics screen captures)
- `GET /img` endpoint family on `api.regainapp.ai` for remote images (Coil)

## Transport details (OBS)

- OkHttp + Retrofit + Gson/kotlinx-serialization; `network_logs` Room table + `UploadLogWorker` → `/send_feedback/logs`.
- Auth: Bearer JWT (`getToken()`/`x-access-token` INF) + refresh flow; unauthenticated variants exist (`_without_auth`) for themes/invite counts.
- Certificate pinning: `network_security_config` = `cleartextPermitted=false`, system + user CAs trusted (no pinning INF — user-added CAs accepted is unusual for a blocker).
- Connectivity check via `ACCESS_NETWORK_STATE`; `ResponseCacheDatabase` caches responses for offline.
- FCM: `MyFirebaseMessagingService` + `com.google.firebase.messaging` receiver.
