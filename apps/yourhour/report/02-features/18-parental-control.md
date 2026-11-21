# 18 — Parental Control & TV Platform

The biggest secondary system: pairs the phone with a companion **Android TV app** so a
guardian can watch and lock the phone remotely. Backend `https://tv-api.yourhourapp.com/api/v1/`.

## Components

| Component | Role |
|---|---|
| `ParentalControlActivity` | hub — Google sign-in (`authGateway`, "Google sign-in returned no account", sign-in error codes), device list, locks, overrides, stats; broadcasts `PARENTAL_DEVICES_CHANGED`, `PARENTAL_SESSION_EXPIRED`, `ACTION_TV_PARENTAL_UNPAIRED`, `PARENTAL_STATS_UPDATED`, `PARENTAL_NOTIFICATION_RECEIVED`; prefs `parental_control_prefs` (`device_refresh_pending`, `fcm_token_registration_pending`); extras `launched_from_nav`, `open_notification_history` |
| `ParentalControlOnboardingActivity` (`parental_onboarding`) | carousel; analytics `parental_onboarding_started/abandoned` with `source` (`dashboard_remote_tv_card`), `total_pages`, `last_page_*`, `total_time_seconds`, `user_type` (`pro`/`adfree`/`lite`/`free`), `has_paired_device_once`, `days_from_install` |
| `ParentalSettingActivity` | TV-side settings surface (exported) |
| `ParentalPremiumActivity` | dedicated **TV-plan paywall** inside parental flow |
| `ForgetPinActivity` | handles **FORGET_PIN_REQUEST** pushes from TV — `extra_request_token`, `extra_device_name` ("Your TV"), `extra_requested_at`; phone's ACCEPT/REJECT posts to **`forget-pin/respond`** (server-mediated, not local) |
| PIN flows | `SetPinActivity` ("Enter PIN!!", "PINs don't match"), `ChangePinActivity`, `EnterPinActivity` (`arg_pin_screen`) — PIN protects settings + uninstall |
| `YourHourAdminReceiver` | device-admin for anti-uninstall (empty policy list) |

## Backend API (`/api/v1/`)

```
auth/register · auth/google · auth/logout · auth/me · auth/fcm-token
auth/account · auth/account/deletion · auth/account/deletion/cancel
apps · challenges · notifications · offers/active · config/app/{v}
devices · devices/pair · devices/pair/short-code · devices/auto-pair/candidates
devices/{id} · devices/{id}/apps
devices/{id}/apps/{pkg}/detail/{today,week}
devices/{id}/auto-pair · devices/{id}/locks · devices/{id}/locks/{pkg}
devices/{id}/override · devices/{id}/override/{token} · devices/{id}/overrides/active
devices/{id}/settings · devices/tv/{id}/settings
devices/{id}/stats/dashboard · devices/{id}/stats/mobile-dashboard · devices/{id}/stats/refresh
backups · delete
```

OkHttp 30 s; auth via Google sign-in token; FCM token registered (`fcm_token_registration_pending`).

## Pairing

Two paths: **short-code** (`devices/pair/short-code` — 4/8-digit code shown on TV) and
**auto-pair** (`auto-pair/candidates` — same Google account on both devices).

## Remote control surface

- **Locks**: TV applies per-app locks (`POST devices/{id}/locks`, `DELETE .../locks/{pkg}`)
  → FCM `LOCK_APPLIED`/`LOCK_REMOVED` → phone enforces via overlay-lock; `COMMAND_ACKED` round-trips.
- **Remote visibility**: `GET devices/{id}/apps` is **paginated** (`sort_by`, `order`,
  `filter`, `page`, `limit`) — guardian can sort/filter the child's full app inventory;
  `apps/{pkg}/detail/{today,week}` gives per-app usage on demand.
- **Unpair**: `DELETE devices/{id}`; **revoke override**: `DELETE .../override/{token}`;
  subscription check: `GET subscriptions/status` (server-side).
- **Overrides**: child requests temporary unlock → `devices/{id}/override` → guardian
  approves → `override/{token}` activation; `overrides/active` listing.
- **Stats**: `stats/mobile-dashboard` pushes this phone's usage to the TV dashboard;
  `stats/refresh` on demand; `usageSyncedAt`/`appsSyncedAt` bookkeeping.
- **Forget-PIN**: TV can request a PIN reset → `ForgetPinActivity` ACCEPT/REJECT with
  `request_token`.

## FCM event handling (`NotificationReceiver`)

Message types: `DEVICE_PAIRED`, `DEVICE_AUTO_LINKED`, `SUBSCRIPTION_OFFER`,
`STATS_UPDATED`, `LOCK_REMOVED`, `DEVICE_PARENTAL_UNPAIRED_BY_TV`, `UNLINKED`,
`COMMAND_ACKED`, `LOCK_APPLIED`, `FORGET_PIN_REQUEST` — each reposts a local broadcast +
notification on `parentalControlChannel`. Unpair wipes `linkState`/`unpairedAt`/`reason`.

## Wire schema

Complete request/response JSON field names (~180) recovered — see
[reference/api-fields.md](../05-reference/api-fields.md). Confirms the guardian sees
**per-app usage vs limit context** (`used_ms`, `limit_duration_ms`, `icon_url`,
`action_type`), hourly/weekly graphs, visit counts, idle time, peak day, and device
online/pairing metadata — not just lock state.

## Monetization

TV-side SKUs: `yourhour_tv_1month_sub`, `yourhour_tv_3month_sub`, `yourhour_tv_1year_sub`
— remote control is a separate paid plan from phone-side Premium.

## Privacy

Paired guardian gets per-app usage + can lock apps — full remote supervision; consent model
is Google-account pairing + on-phone PIN. `action_notifications` table keeps the audit trail.
