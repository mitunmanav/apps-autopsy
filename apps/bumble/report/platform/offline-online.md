# Offline / Online Classification

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`. Static evidence only; real offline UX [unk].

## Requires network [obs → inf]
Everything user-visible is server-dependent:
- Login/session (token refresh), encounter decks, votes, matches, chat send/receive, video calls, verification, all purchases, settings sync, dating hub, hives, speed dating, travel, beeline/filters/results, ads, paywall content, feature flags (Statsig), CMS content, model downloads.

## Has offline scaffolding [obs]
| Mechanism | What it suggests offline [inf] |
|---|---|
| `SpiderwebDatabase` `command_inner_entity` | Queues user actions (votes, sends) to flush on reconnect |
| Stream Chat local store | Read cached conversations; compose offline (SDK-internal; no `stream_chat_*` DDL in strings — schema [unk]) |
| Google DataTransport `offline_signal_*` tables | Buffers analytics pings when offline (NOT Sentry) |
| `datapoint` buffer | Analytics events batched |
| WorkManager | Retries downloads/uploads when connectivity returns |
| Downloader-cache provider + file providers | Cached remote assets reused |
| DataStore shared counter | Cross-process counters survive process churn |
| `_elise_assets/` | Once downloaded, Elise inference runs fully on-device |
| Bundled Lottie/JSON/fonts | UI chrome renders offline |

## On-device features (no server needed after setup) [obs/inf]
- **Elise** ML inference — model+vocab local; TFLite/LiteRT natives.
- **Private Detector** — NSFW blur model on-device (chat images); sender/receiver warning screens local.
- Baseline-profile-accelerated cold start; bundled animation/asset rendering.

## Classification verdict [inf]
- **Online-first app**: every revenue + social function needs the API. 
- **Degraded-offline capable**: cached chat read, queued actions, local ML safety features, offline telemetry buffering.
- Boot with no network and no cached token = dead end [inf; no offline-mode strings found beyond retry/queue patterns].
