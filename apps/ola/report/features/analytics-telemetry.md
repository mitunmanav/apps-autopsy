# Feature Module: Analytics & Telemetry — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

## First-party pipeline (obs classes)
- `com.olacabs.customer.watson.*`: `WatsonModel`, `WatsonRequestInfo`, `WatsonResponseInfo`, `NetworkModel`, `LogModel`, `SherlockModel`, `WatsonUtils`, `WatsonConstants` — request/response + log event models feeding a Sherlock pipeline (inf: first-party observability).
- `com.olacabs.batcher.*` `BatcherJobService` — JobService batched upload (obs).
- `OlaReceiver`, `OlaService` (BIND_JOB_SERVICE dispatcher: `g(Intent)`, `j(Context,Intent)`, ev_2b0b31ae…).

## Vendor analytics (obs)
Firebase Analytics/AppMeasurement (+datatransport), MoEngage (+RTT realtime triggers), AppsFlyer (dev key + OneLink), Facebook App Events, Juspay `logs.juspay.in/godel/analytics`, Google ads mobile SDK (AdActivity + AD_ID perm).

## Devices/consent
- `v2/sdk/device` endpoint — device registration (obs path).
- `MarketingConsentActivity` + `v1/marketing/app-launch` — consent-gated marketing (inf).
- reCAPTCHA v3 site key — risk scoring on sensitive ops (inf).

## Chucker/Stetho (obs verdict)
- Chucker classes + internal UI + FileProvider present; whether interceptor attached unk (name obfuscated).
- **Stetho: zero inbound references → dead code** (ev_374cde95…, obs).

## Unknowns
- Watson/Sherlock upload endpoint + batch size.
- Sampling/allowlist, PII handling in NetworkModel.
- Ad attribution event list (install/inapp) details.
