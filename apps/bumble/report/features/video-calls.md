# Feature: Video & Voice Calls

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

## UI entry [obs]
- `com.bumble.app.webrtc`, `com.badoo.mobile.webrtc.*`; `IncomingCallActivity` + `IncomingVideoCallReceiver` + incoming-call Worker
- `WebRtcService` (manifest, `com.badoo.mobile.webrtc.call.WebRtcService`) — bound foreground service [obs decompile `ev_a65092f7`: `onBind`, `onStartCommand`, notification builder, `EglBase`, two `TextureViewRenderer`s = local+remote video, `WebRtcUserInfo`]

## Param model [obs]
- Call signaling verbs (640-verb catalog): `SERVER_WEBRTC_START_CALL`, `SERVER_WEBRTC_GET_START_CALL`, `SERVER_WEBRTC_CALL_ACTION`, `SERVER_WEBRTC_CALL_CONFIGURE`, `SERVER_WEBRTC_CALL_HEARTBEAT`, `SERVER_WEBRTC_GET_CALL_STATE`, `SERVER_WEBRTC_GET_CANCEL_CALL`
- No dedicated `ANSWER_CALL`/`DECLINE_CALL`/`END_CALL`/`SEND_ICE_CANDIDATE`/`SEND_OFFER`/`SEND_ANSWER` verbs in the catalog — call actions are presumably `CALL_ACTION` payloads; SDP/ICE fields live inside call-action/configure models [inf]
- Media: `org.webrtc` peer connection; audio routing via Bluetooth + `MODIFY_AUDIO_SETTINGS`

## Execution path [obs names; order inf]
1. Caller: `SERVER_WEBRTC_START_CALL` → SDP offer/answer + ICE candidates exchanged via `SERVER_WEBRTC_CALL_ACTION`/`SERVER_WEBRTC_CALL_CONFIGURE` payloads [inf payload shape]
2. Callee: FCM/Worker → `IncomingCallActivity` (full-screen intent, `USE_FULL_SCREEN_INTENT`, `DISABLE_KEYGUARD`) → answer/decline sent as `CALL_ACTION` values [inf]
3. Media: `libjingle_peerconnection` establishes peer; `WebRtcService` runs foreground with camera/mic FGS types
4. State polled/synced via `SERVER_WEBRTC_GET_CALL_STATE` + `SERVER_WEBRTC_CALL_HEARTBEAT`; cancel via `SERVER_WEBRTC_GET_CANCEL_CALL`

## Local vs remote
- **Remote**: signaling (BAPI), TURN/STUN presumably server-provided [unk creds].
- **Local**: peer media stack (native WebRTC), foreground notification, audio device routing.

## Premium/offline
- Calls require network [obs]; match precondition unevidenced — hive video rooms (`SERVER_GET_HIVE_VIDEO_ROOM_CREDENTIALS`) may allow calls without a match [inf]. No premium-gate string tied to calls found → likely free [inf].
- Offline: none (signaling + media need connectivity) [obs].

## Input → output
- In: call intent, SDP/ICE payloads, camera/mic streams → Out: live A/V session, call-state events, notification UI.
