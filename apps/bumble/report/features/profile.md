# Feature: Profile (view + edit)

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

## UI entry [obs]
- `com.bumble.app.profile_editor`, `prompts`, `screenstories`, `PreviewProfile` models, `com.bumble2` profile viewer/editor

## Param model [obs]
- `B4F` `EditProfileApi` + `ProfileApi` request/response models; photos, bio fields, prompts, interests, badges, work/education, Spotify link (`bumble://spotify`), Instagram import strings (`oauthimport` deep link)

## Execution path [obs names]
- Read: `SERVER_GET_PERSON_PROFILE`, `SERVER_GET_USER`, `SERVER_GET_PERSON_PROFILE_EDIT_FORM`, `ProfileApi`
- Write: `SERVER_SAVE_PERSON_PROFILE`, `EditProfileApi`; photo upload via upload services
- Preview: `PreviewProfile.Profile.rematchData` model → "view as others" mode

## Local vs remote
- Remote: canonical profile + media; local: editor state, cached photos, DataStore prefs [inf].

## Premium/offline
- Free core; some fields surface premium CTAs (e.g., interests/advanced info behind subscription [inf from paywall strings]).
- Edit offline → queued save [inf via spiderweb].

## Input → output
- In: edits, photos, prompt answers → Out: saved profile, verification badge linkage, profile strength scoring strings [obs].
