# Network & API — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`
All endpoints are **static candidate evidence** (obs). Actual request construction, auth, and runtime selection between hosts are unk unless noted.

## Hosts observed

### Ola first-party
- `https://apps.olacabs.com` — production consumer API (obs; used as Ola Money base in `Endpoint.<clinit>`, ev_47d7635c…)
- `https://apps2.olacabs.com/` — secondary API host, **certificate-pinned** (see below)
- `https://stg-consumer-proxyapi.olacabs-dev.in/` — **staging host shipped in release strings** (obs; whether reachable in prod variant is unk — `AppVariant` selects)
- `http://stg-consumer-proxyapi.olacabs-dev.in` — staging, http variant
- `https://help.olacabs.com/self_serve/v1/` — support
- `https://pay.olacabs.com/`, `https://webapps.olacabs.com/` (+ `/merchandising/consumer-ola-hub`)
- `https://ofs.olacabs.com`, `https://ofs.olacabs.com/olamoney` — Ola financial services
- `https://maps.olaelectric.com` — Ola Electric maps
- `olacabs-gcm.firebaseio.com` — Firebase RTDB (legacy config)

### Third-party
- `https://assets.juspay.in`, `https://logs.juspay.in/godel/analytics` (Juspay)
- `https://api.razorpay.com`, `/v1/` (Razorpay)
- `https://api.amazon.co.jp`, `.co.uk` (Amazon Pay config table)
- `https://www.recaptcha.net/recaptcha/api3` (reCAPTCHA v3)
- `https://olainsure.typeform.com` (insurance forms)

## API path families (obs, grouped)

| Family | Paths |
|---|---|
| Auth v3/v4 | `v3/user/login`, `v3/user/getProfile`, `v3/user/signout`, `v3/user/updateProfile`, `v4/user/initiate_login_signup`, `v4/user/verify_login_signup_otp`, `v4/user/create_user_account`, `v4/user/resetPassword`, `v4/user/change_password` |
| Tokens | `v1/tokens/initialize`, `v1/tokens/refresh` |
| Location | `v1/location/places`, `v1/location/...` |
| Booking v3 | `v3/booking/create`, `v3/booking/get_driver_bids`, `v3/booking/bid_action` (**driver-bidding marketplace**), `v3/booking/coupon/apply`, `v3/booking/feedback` |
| Rides | `v3/rides/history`, `v3/rides/info`, `v3/rides/list` |
| Ride payment | `v3/payment/initiate_payment`, `v3/payment/status`, `v3/payment/outstanding` |
| Purchase/payment v4 | `v4/payment/initiate_purchase`, `v4/payment/purchase_status`, `v4/payment/instrument_list` |
| Order/prebook | `v2/order/info`, `v2/prebook`, `v2/sdk/device` |
| Outstation | `v4/ola_outstation/pre_book`, `v4/ola_outstation/drop_slots` |
| UPI | `v1/upi/...` |
| SOS | `v3/sos/signal`, `v3/sos/deactivate_sos_signal`, `v3/sos/inform_police`, `v3/user/call_user` |
| Marketing | `v1/marketing/app-launch` |
| Misc | `v7/g77o7dn7` (opaque, single literal) |

### Ola Money service paths (`Endpoint.<clinit>`, obs)
Base + `/olamoney` + per-service prefixes: `/orchestrationService`, `/stark-consumer`, `/servicepayments`, `/wallet-card-service`, `/kycservice`, `/postpaid`, `/userfeedback`, `/connectservice/v1/connect/event`, `/connectservice/v1/connect/public/event`, `/fullkyc/insurance/dashboard`.
Endpoints: `olamoney/v1/beneficiary/add`, `olamoney/v3/cancelTransaction`, `olamoney/v3/resendOTP`, `olamoney/v3/users/refresh`, `olamoney/v3/validateAndDebit`.

## TLS pinning (obs, code-verified)
`com.olacabs.customer.app.SSLUtil.a()` builds an OkHttp `CertificatePinner` from `AppVariant.b()`:
- Host `apps2.olacabs.com`:
  - `sha256/r/mIkG3eEpVdm+u/ko/cwxzOMo1bk4TyHIlByibiA5E=`
  - `sha256/Ko8tivDrEjiY90yGasP6ZpBU4jwXvHqVvQI0GS3GNdA=`
(ev_0907ee1e…, ev_283a9f3f…). Whether the pinner is attached to every client: **unk** (built, but call-graph of `.a()` not fully traced).

## Auth/headers (partial)
- `olamoneyrest` `HeaderHelper` static-init creates header helper (obs); full header map not decompiled (unk).
- JWT handling via nimbus-jose (obs).
- `v1/tokens/initialize|refresh` + `v3/user/*` indicate token-based session model (inf).

## Wire protocol (inf)
Retrofit/OkHttp + Volley; JSON (Gson/Moshi-present). MQTT (non-HTTP) used for live location. Connect push uses FCM + XMPush.
