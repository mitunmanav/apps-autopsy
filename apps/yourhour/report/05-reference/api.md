# Reference — Complete Backend API Surface

Recovered from the Retrofit interface (`defpackage/jf6.java` — annotation mapping:
`cn3`=GET · `z86`=POST · `l02`=DELETE · `xv3`=@Header · `d37`=@Query · `hk6`=@Path).
Base URL `https://tv-api.yourhourapp.com/api/v1/`; OkHttp 30 s timeouts; every call sends
`Authorization: Bearer <token>`.

## Auth & account

| Method | Path | Notes |
|---|---|---|
| POST | `auth/register` | account creation |
| POST | `auth/google` | Google ID-token exchange → Bearer |
| POST | `auth/logout` | |
| GET | `auth/me` | current user |
| POST | `auth/fcm-token` | FCM token registration |
| GET | `auth/account/deletion` | deletion status |
| POST | `auth/account/deletion/cancel` | cancel pending deletion |

## Devices & pairing

| Method | Path | Notes |
|---|---|---|
| GET | `devices` | paired device list |
| POST | `devices/pair` | pair by device id |
| POST | `devices/pair/short-code` | pair by 4/8-digit code |
| GET | `devices/auto-pair/candidates` | same-Google-account candidates |
| POST | `devices/{id}/auto-pair` | confirm auto-pair |
| DELETE | `devices/{id}` | **unpair** |

## Remote control

| Method | Path | Notes |
|---|---|---|
| GET | `devices/{id}/apps` | phone's app list — `@Query sort_by, order, filter, page, limit` (**paginated/filterable**) |
| GET | `devices/{id}/apps/{pkg}/detail/today` | per-app today usage |
| GET | `devices/{id}/apps/{pkg}/detail/week` | per-app week usage |
| POST | `devices/{id}/locks` | create app lock |
| DELETE | `devices/{id}/locks/{pkg}` | remove app lock |
| POST | `devices/{id}/override` | request temporary unlock |
| GET | `devices/{id}/overrides/active` | active overrides |
| DELETE | `devices/{id}/override/{token}` | **revoke override by URL-path token** |
| GET | `devices/{id}/settings` | device settings |
| POST | `forget-pin/respond` | **phone answers guardian's forget-PIN request (server-mediated)** |

## Stats sync

| Method | Path | Notes |
|---|---|---|
| GET | `devices/{id}/stats/dashboard` | TV-side dashboard data |
| GET | `devices/{id}/stats/mobile-dashboard` | phone-side view of remote stats |
| POST | `devices/{id}/stats/refresh` | trigger sync |

## Monetization / config (second interface — strings-recovered)

| Method | Path | Notes |
|---|---|---|
| GET | `subscriptions/status` | **server-side subscription verification exists** — the entitlement isn't purely client-side after all (refines S9) |
| GET | `apps` · `challenges` · `notifications` · `offers/active` | server-driven catalog + offers + push registry |
| GET | `config/app/{version}` | force-update rules, feature config |
| POST | `backups` · `delete` | cloud backup upload/delete |

## Corrections vs earlier docs

- Earlier files attributed `l02` to locks/override DELETEs — confirmed.
- `forget-pin/respond` is new: the phone's ACCEPT/REJECT goes to the **server**, which
  relays to the TV — not local-only.
- `subscriptions/status` means premium state *can* be checked server-side; the
  client-side-gates finding (S9) is softened — offline the client still trusts its cache.
- `devices/{id}/apps` is paginated with sort/filter — the phone's full app inventory is
  queryable remotely.
