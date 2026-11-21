# Glide typing (gesture input)

## What it is

Swipe/glide typing — trace across keys to form words — handled by `latin5.handler.LatinGestureMotionEventHandler` plus a native gesture engine and an optional **DVRNN** neural recognizer.

## Evidence

- `NativeLibHelper.c("gesture")` — native gesture decoder
- `libs.dvrnn.BrellaReadinessChecker` — DVRNN readiness checks whether the **brella** feature split (TensorFlow) is installed — i.e., the neural gesture/word recognizer is a TF model delivered via the brella split
- `libs.hmmgesture` — HMM gesture decoding for CJK layouts
- `hindiDynamicKeyboardGestureMotionEventHandler`, `Latin9KeyGestureMotionEventHandler` — per-layout gesture variants (Hindi dynamic keyboard, 9-key)
- Flags: `enable_tflite_smartkeys_model*` (spatial model feeding glide), `disable_lift_to_tap`/`support_lift_to_type` (lift-to-type gesture), `enable_settle_gesture_end_before_reset`
- `motioneventhandler.scrubmove.*` — scrub-move cursor gestures (spacebar scrub)

## Notes

- Gesture decoding runs natively inside `libintegrated_shared_object.so` (delight lineage) with a TF path gated on the brella split — a hybrid classic/neural design.
- `use_track_lost_end_pointing` — edge handling for lost touch points.
