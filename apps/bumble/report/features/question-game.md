# Feature: Question Game

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

## UI entry [obs]
- `com.bumble.app.questiongame` package + `BumbleQuestionGameActivity` + carousel classes — launched inside chat [inf]

## Param model [obs]
- Question verbs: `SERVER_GET_QUESTIONS`, `SERVER_GET_FINAL_QUESTIONS_SCREEN`; question sets as chat payloads; answer-exchange models in package
- `SERVER_GET_QUICK_HELLO_WITH_CHAT` also exists but belongs to the separate QUICK_HELLO family (`ELEMENT_QUICK_HELLO_*`, `MINOR_FEATURE_QUICK_HELLO_*` — possibly dormant Badoo heritage, see limitations.md)

## Execution path [inf]
- One match proposes game → questions fetched → both answer privately → answers revealed in chat thread → conversation starter

## Local vs remote
- Remote: question content + sync between matches; local: carousel UX.

## Premium/offline
- Free engagement feature [inf — no gating strings]; online [obs].

## Input → output
- In: game invite + answers → Out: mutual answer reveal in chat.
