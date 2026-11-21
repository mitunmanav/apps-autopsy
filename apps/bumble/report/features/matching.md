# Feature: Matching & Connections

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

## UI entry [obs]
- `com.bumble2.matchscreen` (match "boom" screen), `connections` package (match/conversation list), beeline (liked-you), `RematchMiniProfileRequested`

## Param model [obs]
- match list via B4F `ConnectApi`/Stream (no `SERVER_GET_MATCHES` verb), new-match state via B4F/SSE (no `SERVER_GET_NEW_MATCHES` verb), B4F `com.bmbl.b4f.discovery.v1.apis.LikedYouApi` (no `SERVER_GET_LIKED_YOU_LIST` verb), `BlockingApi`/`UnmatchingApi`/`ReportsApi` models, match TTL strings (24h window concept [inf from EXTEND/PREMATCH verbs])

## Execution path [obs names]
- Match creation: vote pair → server match → `matchscreen` celebration → connection row
- Match maintenance: `REQUEST_EXTEND_MATCH`/`EXTEND_MATCH` params (no `SERVER_EXTEND_MATCH` verb), `REMATCH`/`REMATCH_ACTION` params (no `SERVER_REMATCH` verb) for expired matches, `UnmatchingApi` + `BlockingApi` + `ReportsApi` (safety exits)
- Women-message-first: `SERVER_ERROR_TYPE_PREMATCH_EXPIRED`, prematch/extend strings = Bumble's 24h opener rule [obs strings; enforcement server-side]

## Local vs remote
- Remote: match truth + timers; local: list rendering, cached connections, badge counts.

## Premium gates [obs]
- Beeline (see likers) = subscription; Rematch, Extend, Backtrack = premium tools (see `tools/*.md`).

## Input → output
- In: mutual votes + opener messages → Out: connection state changes, chat unlock, expiry events.
