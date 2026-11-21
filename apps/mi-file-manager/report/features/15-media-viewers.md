# 15 — Media Viewers (video player, image viewer, GIF)

## Video player

- `VideoPlayerActivity` — in-app video player. Views: `ABMediaView` (custom SurfaceView/MediaPlayer wrapper), `VideoRestTimeView`, `SectorBarForVideoTime` (circular seek-time indicator).
- Resume-position persistence: `dao.videoposition.VideoPositionBeanDao` (Room) + `dao.video` `VideoItemDao`/`UploadItemDao`/`ResponseCacheDao` — stores last-played offset per video, remote video responses cached.
- Controls: play/pause/seek, rotate, brightness/volume gestures typical of MIUI player; playback via `MediaPlayer` (no ExoPlayer/media3 package observed in the dex inventory).

## Large image viewer

- `ViewLargeActivity` + `view.viewlarge` package — `HackyViewPager` (pager that survives PhotoView scale bugs), `SubsamplingScaleImageView` (davemorrissey's — tile-decodes huge bitmaps without OOM), `SkiaImageDecoder` (native-region decoder), `AnimatedImageView`.
- `gif.GifImageView`, `RoundGifImageView` — animated GIF rendering (custom decoder/`Movie`-based) used both in viewer and deep-clean preview.

## Thumbnails

- `FileExplorerAdapter`/holders load thumbnails via `ImageLoader`-style utils + MediaStore thumbnails; `Util.createThumbnail`-style helpers; GIF/video thumbs via `ThumbnailUtils`/MediaMetadataRetriever.

## Evidence

Class inventory `ev_c7d5130a…787a4a` (ABMediaView, HackyViewPager, SubsamplingScaleImageView, GifImageView, dao.videoposition), manifest (activities), `ev_be453578…9b445` (no media JNI — decoders are Skia/framework).

## Unknowns

- `VideoPlayerActivity` gesture set (brightness/volume/seek swipe) — controller classes exist (`ABMediaView` inner classes) but full method bodies not decompiled.
- Whether streaming/remote video playback over FTP/SMB works via `ResponseCacheDao`-cached URLs — DAO exists; path not traced.
