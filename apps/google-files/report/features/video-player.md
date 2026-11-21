# Feature: Video playback

- **No dedicated video activity exists** — the manifest has no
  `MediaPlaybackActivity` (earlier draft corrected). Video renders inside
  `documentbrowser.filepreview.FilePreviewActivity` / gateway `PreviewActivity`
  surfaces, sharing the media3/ExoPlayer pipeline with audio
  (`mediaconsumption` package).
- Gesture set typical of Files builds: seek / brightness / volume scrubs,
  play-speed menu, lock-mode (strings confirm speed/volume controls).
- Player peers `jmm`/`jml`/`jfw`/`jfq` family handle surface/gesture wiring;
  `onConfigurationChanged` paths manage rotate/resize.
- PiP: no `supportsPictureInPicture` attr observed — absent this version.
- Codec coverage = ExoPlayer platform codecs (no bundled ffmpeg extension in
  the archive inventory).

## Evidence

FilePreviewActivity in manifest + media3 classes + playback strings + peer
classes above. No PiP/no standalone activity are manifest-verified negatives.

## Unknowns

- Exact gesture-map constants (obfuscated listener wiring).
- HDR handling — no HDR-specific strings found.
