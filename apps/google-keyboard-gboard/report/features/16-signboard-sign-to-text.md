# Signboard — sign language to text

## What it is

**Sign-to-text**: point the camera at signing hands and Gboard transcribes sign language into text — the "Signboard" feature. Flag `enable_signboard`, `use_4c_in_signboard`, `auto_show_signboard`.

## Evidence

- `latin.signboard.{SignboardExtension, SignboardDownloadDialog, SignboardMetricsProcessorHelper, SignboardPiPFrame}` + `SignboardPopup` + `SignboardSuggestionsHandler` — extension entry, model-download dialog, metrics, picture-in-picture preview, suggestion surface.
- `libraries.signlanguage.*` — R8-repackaged to `defpackage`, original names recovered from Flogger source strings: `SignLanguageClient`, `MediapipeRunner`, **`LandmarkProcessor`** (body/hand landmark extraction), **`S3Handler`** + `S3RequestObserver` (streaming recognition — logs `SignLanguageResponse, finalizedText: %s :: pendingText: %s`), `CameraManager`, `FrequencyTrackingHelper`.
- `mediapipe_jni` + `com.google.mediapipe.framework.*` (Packet, Graph, SurfaceOutput, AndroidAssetUtil…) — **MediaPipe** pipeline (`input_video` stream, `FrameProcessor`, "Preheating graph", "Mediapipe error").
- `SIGNBOARD_MODEL` — the sign-recognition model is downloaded (SignboardDownloadDialog).
- `hand_in_space_draw_border_timeout_ms`, `not_use_hands_in_signing_space_endpointing` — **hand-in-space region detection & endpointing**.
- `previewDisplayView must be non-null in TPU mode` — runs on **TPU (EdgeTPU/GPU delegate)** with camera preview.
- `keepScreenOnWindow`, `setKeepScreenOn` — keeps screen on while signing.
- `use_4c_in_signboard` — "4c" = four-corner layout variant of the sign surface.
- Rotation handling: "Screen rotated 180 degrees directly (90 to 270 or vice-versa), reactivating signboard popup."
- Accessibility intent: signs → text for messages.

## User-facing consent (string `0x7f140d10`)

> "Sign-to-text uses your phone's camera to capture video of you signing and translates it using an AI model. The original video never leaves your device, but **points representing the movement of your body are sent to Google for processing and deleted after translation**. This feature is in its early stages…"

So: **video stays on-device; skeletal landmark points are sent to Google for the translation model** — a hybrid design (MediaPipe landmarks on device → server-side sign translation), consistent with the EdgeTPU note. Terms + AI Prohibited Use Policy links ship in `0x7f140d11`.

## Notes

"Rambler/signboard toolbar" (string) shows Signboard shares the AI toolbar surface with Rambler. "Signboard transcription error", `SignboardSuggestionsHandler` — output renders as suggestions the user taps to commit.
