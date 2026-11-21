# 09 — Video capture & playback

## Capture

- `is_video`, `video_quality` (integer 0–3, default 2 — `SettingActivity`/`SubSettingActivity` lines ~526–534, ~408–506)
- `Video with Voice` / `Video without Voice` strings (`RECORD_AUDIO` permission; Open Camera `preference_record_audio*` keys incl. src/channels)
- Aspect ratio keys `BACK_RATIO_VALUE_VID`/`FRONT_RATIO_VALUE_VID`; `BACK_VIDEO_QUALITY`
- Engine-level video prefs (Open Camera): bitrate, output format, log/gamma profile, stabilization, max duration/filesize + auto-restart, subtitles, 4K force, flash-during-video
- Stamp overlay on video: per-template `default_videotemp_*` analytics events confirm video stamping; mechanism (encoder overlay vs post-process) unknown
- `VIDEO_COUNT` engagement counter
- `capture_video`, `first_video_captured` analytics

## Playback

- `ui.activities.VideoPlayerActivity`, `video_player.MediaSideScroll`, `video_player.MySeekBar`, `helper.FullScreenVideoView`
- xxhdpi split resources are all `exo_*` — **Media3/ExoPlayer** playback UI
- `COLLECTION_VIDEO_PLAYER_SCREEN_BANNER` ad slot on the player screen

## Unknowns

- Which encoder path stamps video frames (obfuscated)
- Actual resolution mapping of `video_quality` 0–3
