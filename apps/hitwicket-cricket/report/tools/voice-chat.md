# Tool: Voice Chat (WebRTC)
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

- **UI entry:** in-match/co-op voice controls [inference]; `BeginWebRtcAfterMicGranted` coroutine shows mic-permission gate [observation].
- **Parameter model:** signaling server `ws://s.y-not.app/callapp`; WebRTC config (ICE/STUN not recovered — IL2CPP internals) [unknown]; `RECORD_AUDIO`, `MODIFY_AUDIO_SETTINGS`, `BLUETOOTH`, `android.hardware.microphone` [observation].
- **Execution path:** C# `Byn.Awrtc`/`awrtc`/`WebRtcCSharp`/`com.because_why_not.wrtc` assemblies → `libwebrtccsharpwrap.so` (13.6MB) → Java `org.webrtc.*` natives (62 JNI decls: org.webrtc 59 + org.webrtc.audio 2 + com.because_why_not.wrtc 1; PeerConnection, NetworkMonitor, audio modules, Libaom AV1 encoder) → signaling over `ws://s.y-not.app/callapp` → peer media [observation].
- **Premium/offline flags:** **online-only**; bundled in `Features.LiveEvents`/co-op namespaces → alliance/co-op voice [inference].
- **I/O flow:** mic permission → peer connection via signaling → audio streams + optional video (videoinput module present) → in-match overlay.
