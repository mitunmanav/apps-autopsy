# Feature: Speed Dating

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

## UI entry [obs]
- `com.bumble.app.speeddating` package screens + opt-in/out classes; entry via dating hub/promos [inf]

## Param model [obs]
- `SERVER_BUMBLE_SPEED_DATING_*` verb family (schedule, join, pairing), session/lobby models in package

## Execution path [inf from verb names]
- Opt in → join scheduled event lobby → timed sequential chat/video rounds → post-event match list → normal chat
- Real-time component likely rides chat/WebRTC + SSE [inf; no dedicated call stack found]

## Local vs remote
- Fully server-orchestrated; local = timers/UX.

## Premium/offline
- Event feature, not directly consumable-gated [inf — no purchase verb found]; online-only.

## Input → output
- In: opt-in + presence during window → Out: round robin conversations → mutual matches.
