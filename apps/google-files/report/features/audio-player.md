# Feature: Audio playback

## Service

- `mediaconsumption.audio.service.AudioService` — manifest-declared with
  `foregroundServiceType="mediaPlayback"` + `@string/audio_service_description`.
- Engine: **ExoPlayer/Media3** (bundled androidx media3 classes).
- Sequencing impl: `kse` + `lqp` — `AudioSequenceManager failed to prepare
  sequence` / `prepareAudioSequence not successful` (the queue/sequence manager
  behind gapless play-next behavior).
- Media buttons/lockscreen: handled through MediaSession (no separate
  media-button receiver is declared — earlier draft corrected).

## Controls & events

Central hub `hpt` routes: `PlayPauseButtonClicked`, `PrevButtonClicked`,
`NextButtonClicked`, `RepeatButtonClicked`, `ShuffleButtonClicked`
→ full transport set: play/pause/prev/next/repeat-mode/shuffle.
Strings confirm **playback-speed control**, volume, pause/resume/rewind,
album/artist metadata surfaces.

## Notification

Media-style notification via MediaSession; `kru` is the FCM/GNP
`proxy_notification_initialized` delegate (`FirebaseMessaging`,
`com.google.android.gms`) — push-notification plumbing, not audio logic
(earlier draft listed `kru` as an audio impl — corrected).

## Integration

- Mini-player inside browse (`AudioPreviewOnGlobalLayoutListener` via `hpt`)
  + full player surface inside preview flow; lockscreen/BT controls via
  MediaSession.
- Album art: MediaStore album-art URIs; fallback art bundled.
- Video/audio share the `mediaconsumption` package and FilePreviewActivity
  surface.

## Evidence

Manifest service decl + media3 classes + audio strings; impl `kse`/`lqp`.
Other classes that merely *reference* `AudioService` (binding/start intents):
`hxx` (safe-folder secret — unrelated), `hya` (blur card), `ksl` (cronet/grpc),
`kru` (notification delegate).

## Unknowns

- Audio offload/gapless flags, EQ — not observed.
- Whether speed control persists per-track (pref not located).
