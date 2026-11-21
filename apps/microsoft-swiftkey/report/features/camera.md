# Camera

Evidence: `com.swiftkey.camera.activity.CameraActivity`, `com.touchtype.camera.CameraContract`, `oc_*` strings (13 = OneCamera), `com.flipgrid.camera.onecamera.*` (SaveVideoToDownloadsActivity, playback), `androidx.camera.*` (MetadataHolderService), `appconfig/camera/remix/`, `Camera` dynamic module, `READ_MEDIA_IMAGES`/CAMERA perms, `GetRuntimePermissionActivity`.

## What it is

A camera panel inside the keyboard — take photos/videos without leaving the chat, then insert, share, sticker-ify, or AI-remix them.

## Module

- Delivered as the **`Camera` on-demand dynamic module** — `toolbar_camera_downloading_message`/"Downloading Camera", `…_installing_message` "Installing Camera" when first opened.
- Built on Microsoft's **OneCamera** stack (`com.flipgrid.camera.onecamera.*` — Flipgrid camera code) over **CameraX** (`androidx.camera.core.impl.MetadataHolderService`, `…/MetadataHolderService.DEFAULT_CONFIG_PROVIDER`).

## Features (`oc_*` strings)

- `oc_mode_quickcapture` "Quick capture", `oc_quickcapture_helper_modal` "Tap for photo, hold for video" — tap = photo, hold = video.
- Gallery strip (`camera_gallery`), permission flow (`camera_permission_flow`, `camera_permission_result`), `cameraViewModel`.
- `oc_*` categories list (Smilies, Expressions, Hand gestures, People, Animals, Food, Objects, Travel and places, Symbols, Learning, Activities) — **AR/effect categories** for camera overlays.
- `SaveVideoToDownloadsActivity` — export recorded video.

## Camera Remix (Bing AI)

`appconfig/camera/remix/` (enabled, BiBo `CameraRemixModel`):

```json
{"enabled": true, "form_code": "BICSKR",
 "additional_upload_params": {"ptn": "swiftkey"},
 "additional_create_params": {"partner": "swftkey", "emt": "1"},
 "create_url": "https://www.bing.com/images/create/ai-image-generator/template/anime-style",
 "upload_id_param_name": "pfbcid"}
```

→ Upload a captured photo (`bing.com/images/detail/upload`, `pfbcid` param) and AI-remix it via Bing Image Creator templates.

## Photo stickers

`sticker_collection_migration_upsell_banner_*` — photo sticker tool lives under the camera icon; starred sticker items migrated there. Cut a sticker from your own photo [inferred].
