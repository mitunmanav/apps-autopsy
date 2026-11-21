# Feature: Verification (photo / ID / student)

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

## UI entry [obs]
- `com.bumble.app.verification` + `com.bumble2` verification package; prompts from profile/settings/trust surfaces [inf]
- Veriff SDK internal screens; `VERIFF_STATUS_BROADCAST_PERMISSION` isolates result broadcasts

## Flows [obs names; order inf]
**Photo verification**: `SERVER_START_PHOTO_VERIFICATION` → guided selfie capture (ML Kit `vision.face` detection on-device) → `PhotoVerificationUploadService` (upload worker) → `SERVER_CHECK_PHOTO_VERIFICATION` poll → verified badge.
**ID verification**: `SERVER_START_ID_VERIFICATION` → `SERVER_GET_VERIFF_SESSION` → Veriff SDK capture (`magic.veriff.me`, `libveriffyuv` frame processing) → result broadcast → `SERVER_CHECK_ID_VERIFICATION`. Second IDV vendor also shipped: **Au10tix** (`com.au10tix.sdk.service.LivenessRecordingService`, `SDK_TYPE_AU10TIX`, `MINOR_FEATURE_JAPAN_IDV_V2` flag — regional liveness path [inf]).
**Document photo verification**: `SERVER_START_DOCUMENT_PHOTO_VERIFICATION`, `SERVER_CHECK_DOCUMENT_PHOTO_VERIFICATION`, `DocumentVerificationUploadService` + `IdVerificationUploadService`, `screenstories.documentphotoverification` package — document-photo flow separate from selfie flow [obs].
**Student verification**: student-email flow (institution list strings) [obs; mechanism unk].
**Request-a-match-to-verify**: `SERVER_REQUEST_VERIFICATION`, `PHOTO_VERIFICATION_REQUEST`, `VERIFICATION_DEEPLINK`, `VERIFIED_BY_PHOTO_PROFILE_FILTER`, `IGNORE_NON_VERIFIED_WITH_ONE_CLICK` [obs].

## Local vs remote
- Local: face detection, capture UX, Veriff frame pipeline.
- Remote: session creation, verdict, badge state — all server.

## Premium/offline
- Not premium-gated (trust feature) [inf]; fully online [obs].

## Input → output
- In: camera frames / document images / email → Out: verification state + badge on profile.
