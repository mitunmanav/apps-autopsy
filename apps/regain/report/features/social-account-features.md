# Social / account / content features (invite_flow, user_signin, onboarding, study_goal_home, ai_coach, ai_generate_share_message, wall_of_love, in_app_survey, play_store_rating)

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`

All OBS.

## feature_invite_flow
`InviteFlowDatabase` + `InviteLink`, `InviteSuccessfulMapping`, `CreateLinkResponse`, `ReferralCountResponse`, `GroupInviteCount`, `GroupInviteReferralCountResponse`, `GroupInviteRewards(Only)`, `ClaimRewardResponse`, `RegisterReferralResponse`, `SetUserDeviceLoginResponse`; `UpdateReferralCountWorker`, `UpdateGroupReferralCountWorker`; `/invite/*` endpoints; join/gift/invite deep links.

## feature_user_signin
`PurchaseClaimApi`, all account/backup/device models (`UserProfile*`, `DeviceMeta*`, `Backup*`, `MigrationResponse`, `RefreshToken*`, `UserFirstSeen*`, `UserGoogleInfoPreferencesDto`, `TableChangeEvent`, `ConvertJsonToTableChangeEvents`), workers `BackupDBWorker`, `OnDemandBackupWorker`, service `RestoreBackupService`, `SignInResultToFTOverlay`; all `/auth/*` + `/payments/claim`.

## feature_onboarding
`UserReview(Deserializer)`, `UserReviews`, `ExamSearchData$Row` + `a…w` entities, `ExamSelectionNavArgData`, `presentation/usage_variant_a/screen`; bundled `exam_search_in.json`, `exam_story_*`, `reinstall_v1_*`, `ob_hammer` assets.

## feature_study_goal_home
`DailyStudyGoalDay`, `StudyStamp`, `StudyStampUploadResponse`, `StudyStampSyncWorker`; `/study_stamps/*`; calendar/stamp routes + 3 widgets.

## feature_ai_coach
`AICoachDataBase` + `AICoachResponseData`; bundled `AICoach.db` (732 canned rows, OBS).

## feature_ai_generate_share_message
`AiGeneratedShareRequestDto`/`ResponseDto` → `POST /app_share/generate_message`.

## feature_wall_of_love
`ApprovedPost`, `ApprovedPostsResponseDto`, `RewriteWithAIResponseDto` → `/wall_of_love/*`.

## feature_in_app_survey
`InAppSurveyQuestionsItem`, `QuestionOption`; `in_app_survey` route; RemoteConfig-driven (INF).

## feature_play_store_rating
`RatingFeedbackWorker`, `review.properties`; `rate_us_screen?source=`, `play_store_rating` flow → Play review API.
