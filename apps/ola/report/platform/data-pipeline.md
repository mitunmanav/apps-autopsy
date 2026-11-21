# Data Pipeline (Telemetry/Events) — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

## Internal telemetry ("Watson/Sherlock", obs class names)
`com.olacabs.customer.watson.*`:
- `WatsonModel`, `WatsonRequestInfo`, `WatsonResponseInfo`, `NetworkModel`, `LogModel`, `SherlockModel`, `WatsonUtils`, `WatsonConstants` (obs).
- Shape: request/response logging records feeding a "Sherlock" event model (inf — a first-party observability funnel). Field-level schema not fully decoded (partial).

## Event batching (obs + inf)
- `com.olacabs.batcher.*` incl. `BatcherJobService` — JobService-scheduled batched event upload (obs binding `BIND_JOB_SERVICE`; payload format unk).
- `com.google.android.datatransport.*` — Google transport layer (Firebase measurement backend, obs).

## Analytics SDKs (obs)
- Firebase Analytics/AppMeasurement (`AppMeasurementService/Receiver/JobService`)
- MoEngage (`MoEPushWorker`, `DataSyncJob`, RTT realtime-trigger `Rtt*`)
- AppsFlyer (attribution, OneLink deeplinks)
- Juspay analytics endpoint `logs.juspay.in/godel/analytics`
- Facebook app events (FacebookSdk components)
- Primer-like device fingerprinting classes under watson/network models (inf)

## Pipeline flow (inf, bounded)
```
app event → watson/Sherlock model → batcher queue (JobService) ─┐
Firebase auto-events → datatransport → Firebase backends        ├→ network → server endpoints
MoEngage events → DataSyncJob                                    │  (ConnectUrls hosts)
MiPush/FCM receipt → ConnectNotification receivers               ┘
```
Exact per-event endpoint mapping, sampling, and queue-persistence details: **unk** (not fully decompiled).

## Marketing consent
`yoda.rearch.marketingconsent.MarketingConsentActivity` + `v1/marketing/app-launch` → consent-gated marketing calls (inf).
