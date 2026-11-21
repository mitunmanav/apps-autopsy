# 03 — Camera capture

Primary class: `_jadx/com.gpsmapcamera.geotagginglocationonphoto.activity.CameraActivity.java` (~1.14 MB decompiled; second-largest class after `AddLocationActivity`). Exported to system camera intents (see 02).

## Engine lineage: Open Camera fork

`_evidence/PreferenceKeys.txt` contains **156 preference keys identical to Mark Harman's Open Camera** (`preference_photo_mode`, `preference_raw`, `preference_panorama`, `preference_expo_bracketing_*`, `preference_focus_bracketing_*`, `preference_focus_peaking`, `preference_zebra_stripes_*`, `preference_ghost_image*`, `preference_show_angle`, `preference_video_log`, `preference_remote_*`, `preference_stamp*` …). The camera subsystem is an Open Camera code fork with the app's stamp pipeline layered on top.

Capabilities present in the preference schema (not all necessarily surfaced in UI — UI gating unknown due to obfuscation; treat as engine support):

- Photo modes: HDR, panorama, expo bracketing, focus bracketing, burst/fast-burst
- RAW/DNG (`preference_raw`, raw variants of bracketing)
- Focus: manual focus distance, focus peaking + color, face detection, startup focus, touch capture
- Exposure: exposure compensation, exposure lock, ISO, exposure time, auto-stabilise, color effects, scene modes, antibanding, white balance (+temperature), noise/edge modes
- Guides: grids, crop guide, ghost image overlay (+SAF source, alpha), angle/pitch lines, histogram, zebra stripes (fg/bg colors)
- Video: bitrate, max duration, max filesize, restart-on-limit, output format, log/gamma profile, stabilization, audio src/channels, subtitles, low-power check, flash-during-video, 4K force
- Remote control (`preference_enable_remote`, remote type/device name — matches `BLUETOOTH` admin permission)
- UX: volume keys, timer + beep + voice countdown, immersive mode, UI placement, lock orientation, keep display on, max brightness, shutter sound, toasts
- Stamps (Open Camera's own text stamp system also present: `preference_stamp*`, `preference_textstamp`, date/gps formats, font size/color — overlapped by the app's richer stamp engine)
- Storage: save location + SAF tree, photo/video filename prefixes, EXIF artist/copyright, Zulu time option, free-memory check

## App-level camera settings (`SP` keys)

`FLASH_VALUE`, `FLASH_VALUE_FRONT`, `FOCUS_VALUE`, `GRID_VALUE`, `TIMER_VALUE`, `MIRROR_VALUE` (front mirror), `BACK_RATIO_VALUE`/`FRONT_RATIO_VALUE` (+`_VID` video variants — aspect ratio), `SOUND_VALUE` (shutter sound, `capture.ogg` asset), `whitebalance`, `image_quality`, `video_quality` (0–3, default 2), `is_CameraLevel`, `ORIENTATION_TYPE`.

## Capture pipeline (static call graph)

- Photo/video capture → stamp compositing (StickerView/BitmapRefectore) → `ImageSaver`/`StorageHelper` persist → thumbnail keys `LAST_THUMB_PATH/URI`, `IMAGE_URI_PREVIEW`, `ent_image_uri` → optional Drive flag path (`IS_UPLOAD_ON_GOOGLE_DRIVE`)
- Video with/without voice (`Video with Voice`/`Video without Voice` strings; `RECORD_AUDIO`)
- Analytics: `capture_photo`, `capture_image`, `capture_video`, `first_photo_capture`, `first_video_captured`, `camera_back`, `camera_selfie`, `camera_setting_click`, `camera_tracking_on/off` (FBEventUtils)

## Environmental overlays (all fetched/computed in `CameraActivity`)

- Weather: `api.openweathermap.org/data/2.5/weather?lat=&lon=&appid=a84de63bb92490a6da346b833bfabd94&units=metric` (line ~19640)
- AQI: `api.openweathermap.org/data/2.5/air_pollution?…same key` (line ~18731)
- Elevation fallback: `api.open-meteo.com/v1/elevation?latitude=&longitude=` (line ~18798, keyless)
- `SoundLevelMeter` instance field `G3` — ambient dB stamp
- `EGM96` — geoid height correction for altitude (see 05)

## Dialogs/warnings

- VPN warning dialog (`vpn_title`/`vpn_desc` strings, line ~910)
- Mock-location detection → `detect_fake_gps` event (see 05)

## Unknowns

- Which Open Camera preferences are actually exposed in `SubSettingActivity` UI (obfuscated wiring)
- Exact camera API in use at runtime (`preference_camera_api` suggests both legacy + Camera2 paths; CameraX libs bundled for scan/QR)
- One `CameraActivity` method is Pairip-protected (`FSXa.Ipgnog.invoke`) — role unknown
