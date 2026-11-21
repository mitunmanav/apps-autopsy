# Offline/Online Classification — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`
Classification from static evidence only (obs/inf). Real degraded-mode behavior is unk.

| Feature | Offline capability | Evidence |
|---|---|---|
| Booking / ride creation | **Online-only** (inf) | `v3/booking/create`, `bid_action` require live API; no local booking queue found |
| Ride history/details | Partial offline (inf) | `v3/rides/*` + Volley disk cache may serve cached responses; Room entities could hold history |
| Maps | Partial (inf) | MapLibre supports tile caches; offline tile package not confirmed in assets (unk) |
| Live location sharing | **Online-only** (obs) | MQTT publish requires broker connectivity |
| Payments (all rails) | **Online-only** (inf) | Juspay/Razorpay/NPCI are remote by design; `validateAndDebit` etc. |
| Wallet/Ola Money UI | **Online-only** (inf) | every action = REST endpoint; SIM binding needs SEND_SMS |
| Inbox/notifications | Partial offline (inf) | `InboxEntity` in Room → stored notifications readable offline |
| Help/self-serve | **Online-only** (obs) | `help.olacabs.com/self_serve/v1/` web API |
| Auth | **Online-only** | OTP/password endpoints; cached session unlock plausible but unproven (unk) |
| Deeplinks | Online | route to server-backed screens |
| QR scan | Local capture, online resolve (inf) | camera scan local; pay needs network |
| SOS | **Online-only** (obs) | `v3/sos/*` + `v3/user/call_user` endpoints |

## Offline plumbing present (obs)
- Volley `OlaDiskBasedCache` — response caching.
- Room DB — inbox + transaction entities.
- WorkManager + constraint proxies (`NetworkStateProxy` etc.) — deferred work when network returns (obs components).
- BatcherJobService — queues events for later upload (inf from design).

## Bottom line (inf)
Core business flows are server-dependent; offline support = cached reads (rides/inbox), queued telemetry, and WorkManager retries. No local-first mutation queue for bookings/payments exists in evidence.
