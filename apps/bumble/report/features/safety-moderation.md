# Feature: Safety, Moderation & Blocking

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

## UI entry [obs]
- `com.bumble.app.reportuser`, `blockers`/`content moderation` packages (bumble2), settings block-list, `BansApi`/`RestrictionsApi`/`ContentModerationApi`/`ReportsApi`/`BlockingApi`/`UnmatchingApi` B4F services

## Param model [obs]
- Report categories/reason strings, block-list models, restriction/ban state models, `SnoozeActionReasonOptionsInner`
- On-device safety: `PrivateDetectorV1` (chat NSFW blur, sender warning + receiver options + deactivation flow), `ReviewBeforeSendV1` (send-time nudge), `DETECT_SCREEN_CAPTURE` perm
- Regional privacy: `bumble__hide_name_india_deployment` flag string — name-hiding in India deployment [obs flag; not an on-device mechanism]

## Execution path [obs names]
- Report/block/unmatch → respective API → safety state → filtered decks/chats
- Arkose `SERVER_SEND_ARKOSE_TOKEN`/`ENCRYPTED_DATA` + `ArkoseLabsAPI.html` → bot challenge on risky actions [inf]
- Play Integrity `requestExpressIntegrityToken` → device verdict → server [inf]

## Local vs remote
- Remote: reports, bans, restrictions, moderation outcomes.
- Local: private-detector + review-before-send inference, screen-capture detection.

## Premium/offline
- Free [obs]; remote parts online-only, local ML works offline [inf].

## Also shipped (see `features/safety-date-tools.md`)
- Share Date + live GPS, post-date check-in, SOS button, Safety Center, security walkthrough
- Full appeal pipeline (`com.bumble2.blockers` + `AppealFlowRepositoryImpl`), age-signals/teen gating, DSA illegal-content reporting, photo-moderation acknowledgment, Sierra support agent, chat export.

## Input → output
- In: user reports/blocks + captured media + device signals → Out: enforcement state, warnings, filtered exposure.
