# Feature: Chat / Messaging

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

## Two stacks coexist [obs]
1. **Legacy `com.badoo.mobile.chatoff`** + verbs `SERVER_OPEN_CHAT`, `SERVER_GET_CHAT_MESSAGES`, `SERVER_SEND_CHAT_MESSAGE`, `SERVER_CHAT_MESSAGE_READ`/`SERVER_CHAT_MESSAGES_READ`, `SERVER_GET_GIFT_PRODUCT_LIST` + `SERVER_PURCHASED_GIFT_ACTION` (no `SERVER_GET_CHAT_LIST` verb exists; list likely via B4F)
2. **GetStream** (`io.getstream`): `com.bumble2` stream contract models, Stream SDK presence (providers/receiver/`io.getstream` classes — no `stream_chat_*` DDL found in strings), Stream push delegate, `x-stream-ext`/`X-Stream-Ticket` auth headers
Which serves a given conversation: flag/server-decided [unk].

## UI entry [obs]
- `com.bumble.app.chat` screens + `com.bumble2` chat/stream models; conversation opened from match/connection screens [inf]
- Compose route screens for warnings: `PrivateDetectorSenderWarningScreen`, `PrivateDetectorReceiverWarningMenu`, `ReviewBeforeSend` (`NoteInternalRoute$ReviewBeforeSend`)

## Param model [obs]
- Message payloads: text, images (chat FileProvider for sharing), gifts (`SERVER_GET_GIFT_PRODUCT_LIST` + `SERVER_PURCHASED_GIFT_ACTION`), compliments (`SendComplimentFeature`), question-game payloads, voice notes [inf from media perms + classes]

## Execution path [obs names; order inf]
- Send: compose → optional safety checks (Private Detector on images, Review-Before-Send on text) → `SERVER_SEND_CHAT_MESSAGE` or Stream send → offline queue (spiderweb/Stream) → read receipts (`SERVER_CHAT_MESSAGE_READ`/`SERVER_CHAT_MESSAGES_READ`)
- Receive: FCM push + SSE + Stream websocket → Room store → UI; OEM badge counts via badge perms

## Local vs remote
- Remote: all message transport + history.
- Local: Room caches (read history offline [inf]), Private-Detector NSFW blur (on-device ML), notification/badge updates.

## Premium gates [obs]
- Compliments = consumable; Notes/message-before-match (beemail) = entitlement [obs product strings]; Extend/Rematch surfaced from chat [obs].

## Input → output
- In: user text/media/actions → Out: delivered messages, receipts, safety warnings, gift/compliment purchase flows.
