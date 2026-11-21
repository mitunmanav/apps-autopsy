# Feature: BFF Collectives / Hives

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

## UI entry [obs]
- `com.badoo`/app `hive`/`bff` classes; verbs expose full community surface

## Param model [obs — largest verb family]
- Discovery: `SERVER_GET_BFF_DISCOVERY_HOME`, `SERVER_GET_BFF_COLLECTIVE_INFO`
- Membership: `SERVER_HIVE_JOIN_*`/join-request verbs, leave, member lists
- Content: `SERVER_HIVE_*` post/comment/like/create/report verbs
- Real-time: `SERVER_GET_HIVE_VIDEO_ROOM_CREDENTIALS` → group video room (creds fetched then vendor room join [inf — likely a white-label room provider; unk which])

## Execution path [inf]
- Browse collectives → join/request → feed (posts/comments) → attend video events → member connections

## Local vs remote
- Remote: all content + rooms; local: cached feeds, composed posts queued [inf].

## Premium/offline
- Free social surface [inf]; online.

## Input → output
- In: joins, posts, comments, room joins → Out: community feed + group video participation.
