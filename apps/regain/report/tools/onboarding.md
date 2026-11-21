# Onboarding & Exam setup

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Module:** `feature_onboarding` · **Evidence:** OBS

## What it is
Multi-step student onboarding: intro video → exam picker → goals → educational content → testimonials → signup → permission stack.

## UI entry (OBS)
Routes (OBS): `intro_video*`, `exam_selection(_bs)`, `goal_setup(_bs)`, `study_goal_setup`, `onboarding_screen`, `onboarding_v3`, `onboarding_bs`, `educational_content`, `educational_screens(_bs)`, `testimonials_bs`, `instagram_challenge`, `signup_screen/{P}`, `existing_user_screen`, `reinstall_v1` flows, `device_selection`.

## Params model (OBS)
`ExamSearchData$Row` + `a…w` exam entities (`exam_search_in.json` bundled), `UserReview(s)` (+`UserReviewDeserializer`), `ExamSelectionNavArgData`; bundled assets `exam_story_reviews/stats/voice`, `reinstall_v1_*`.

## Execution path (OBS)
`HomePageActivity` first-run → intro video (ExoPlayer, `ob_hammer` anim) → exam search (`exam_search_in.json` offline corpus) → goal/study-goal setup → educational screens → testimonials (`UserReview`) → signup (`google_sign_in`) → permission coach marks (`PermissionStepsOverlayActivity`) → home.

## Premium/offline (OBS)
Fully local until signup.
