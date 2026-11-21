# Tool: Notes / Message-before-match (Beemail)

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

- **UI entry** [obs]: `com.bumble.app.beemail` package; `NoteInternalRoute` (+ `$ReviewBeforeSend`) route models; note composer on profiles/chats [inf]
- **Param model** [obs]: internal route → note screen; message payload; `ReviewBeforeSendV1` on-device check before dispatch
- **Execution path** [inf]: entry (profile/chat) → note compose → local safety check (ReviewBeforeSend) → send via messaging pipeline (`SERVER_SEND_CHAT_MESSAGE`/Stream or prematch channel [inf]) → recipient sees note
- **Local vs remote**: remote delivery; local compose + ML safety.
- **Premium/offline**: entitlement-gated (paid/perk) [obs — beemail tied to subscription surfaces]; online.
- **Input → output**: text note → delivered message possibly bypassing opener rules [inf].
