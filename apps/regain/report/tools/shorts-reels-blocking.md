# Shorts / Reels Blocking

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Module:** `feature_block_shorts` · **Evidence:** OBS (service methods, overlay, models)

## What it is
Detects and blocks infinite-scroll short-video feeds (YouTube Shorts, Instagram Reels, TikTok-style) inside their parent apps — without blocking the whole app. Counts scrolls; "scroll counting" is a named service behavior.

## UI entry (OBS)
`block_shorts`/`block_feature_settings`/`block_shorts_nudge_screen`; `BlockShortsOverlayActivity`.

## Params model (OBS)
`BlockFeatureSetting` (per-feed toggle + per-app), `BlockFeatureUIDetails`, `BlockFeaturePostNavigationAction` (+`Adapter`, post-block where-to-go), obfuscated `a…g` config variants (per-feed type).

## Execution path (OBS, `MyMonitorInAppBlockService` methods)
`getReelsScrollCount`, `checkReelsScrollCount`, `getIsReelsScrollCountLimitReached`, `getIsShortsFeedVisible`, `getIsInstagramReelsFeedVisible`, `performScrollActions`, `handleShortsFeed`, `handleInstagramFeed`, `getIsInstagramSearchFeedVisible`, `checkAppLevelBlocking`, `handleAppLevelBlocking`, `isAccessibilityGestureDetected`, `trackDomainChange` — accessibility tree scraped for the feed's view-id/text signature; each detected scroll increments a counter (`computeScrollCount*`); threshold hit → `ContentBlockWindowFactory`/`BlockShortsOverlayActivity` overlay + optional back-press (`performBackPress`).

## Data flow
Feed view-ids → accessibility scrape → scroll counter → overlay/back action → analytics event.

## Premium/offline (OBS)
Fully local; detection signatures bundled (INF: no remote feed-signature feed observed).
