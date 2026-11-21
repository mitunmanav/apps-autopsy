# Feature: Dating Hub

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

## UI entry [obs]
- `com.bumble.app.datinghub` package + `DatingHubActivity` + experiences/share classes — a mode root [inf]

## Param model [obs]
- `SERVER_GET_DATING_HUB_HOME` feed; Contentful CMS content strings; experience cards with routes

## Execution path [obs/inf]
- Home fetch → card feed (events, content, promos, mode switchers) → routes into Encounters/Speed dating/Hives/Profile tasks [inf from verb + package names]

## Local vs remote
- Remote: feed content entirely; local: Lottie/bundled visuals.

## Premium/offline
- Hub is free surface hosting premium promos [inf]; online-only.

## Input → output
- In: home request → Out: curated cards routing to sub-features.
