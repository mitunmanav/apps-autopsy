# Feature: Date Safety Tools, Appeals & Compliance

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

## Share Date + live location [obs]
- `com.bumble.app.sharedate.*` package, `ALLOW_BUMBLE_SHARE_DATE`, `SERVER_UPDATE_SHARE_DATE`, `SERVER_WATCH_LIVE_LOCATION`, `SERVER_STOP_LIVE_LOCATION_SHARING`
- `UI_SCREEN_TYPE_BUMBLE_SHARE_DATE_{ENTRY,FEEDBACK,ONBOARDING,SUMMARY}`, `bumble_chat_menu_option_open_share_date` (chat menu entry)
- Share date details + live GPS with trusted contacts; sharing can be stopped anytime; `ABUSE_REPORT_TYPE_SHARE_DATE` ties it to reporting
- `SafetyCenterSupportPageActivity`, `BUMBLE_SAFETY_CENTER{,_V2}`, `BUMBLE_SOS_BUTTON` strings, `SERVER_GET_SECURITY_PAGE`, `SERVER_START_SECURITY_WALKTHROUGH` (+ `RETHINK` variants)

## Post-Date Check-In [obs]
- `CLIENT_NOTIFICATION_TYPE_PRE_POST_DATE_CHECK_IN`, `PROMO_BLOCK_TYPE_POST_DATE_CHECK_IN_{WENT_ON_DATE,DIDNT_GO_ON_DATE,THANK_YOU_1,THANK_YOU_2}`, `CONNECTION_STATUS_INDICATOR_BUMBLE_POST_DATE`, `MINOR_FEATURE_POST_DATE`, `SCREEN_NAME_POST_DATE_REPORT`
- App asks "did you go on the date?" and thanks/checks in [obs strings; outcomes flow to safety + matchmaking signals [inf]]

## Age signals / teen gating [obs]
- `SERVER_SEND_AGE_SIGNAL`, `GOOGLE_PLAY_AGE_SIGNALS_*`, `GOOGLE_PLAY_UPDATE_AGE_SIGNALS` (Play Age Signals API integration)
- `BLOCK_TEENS_AT_ANY_TIME`, `CLIENT_NOTIFICATION_TYPE_NO_MORE_TEENS`, `BlockerAgeVerification` screen, `UPDATE_AGE_WITH_ID` flag — age enforcement paths + ID re-verification

## Appeals & sanction UI [obs]
- `com.bumble2.blockers`: `BlockersActivity`, `BlockerAppealTimeline{,Step}`, `BlockerContentModerated{,AppealState}`, `BlockerModal${Ban,DecisionModal,ContentModeration,RestrictionLanding,VerificationRequired,Warning,Checkbox}`
- `AppealFlowRepositoryImpl`, `SERVER_APPEAL_CONTENT_REMOVED{,_RES}`, `SERVER_RES_ICR_SUBMIT_APPEAL`, `SERVER_CHECK_BLOCK_DISPUTE`, `/identity-verify/v1/flow/verification/sanction` endpoint
- Full appeal pipeline: timeline UI → submit → dispute check

## DSA compliance [obs]
- `BumbleIllegalContentReportingActivity`, `DSA_ILLEGAL_CONTENT_REPORT`, `RES_ILLEGAL_CONTENT_REPORT` — EU Digital Services Act illegal-content reporting channel

## Other safety plumbing [obs]
- Photo moderation ack: `SERVER_GET_MODERATED_PHOTOS`, `SERVER_ACKNOWLEDGE_MODERATED_PHOTOS`, `REVIEW_ENHANCED_PHOTOS`, `TEMPORARY_PHOTOS_REMOVAL`
- `SERVER_EXPORT_CHAT` (export a conversation — evidence/GDPR surface [inf])
- `SERVER_DEACTIVATE_OTHER_SESSIONS` — remote sign-out
- Support agent: `SIERRA_ACTION_*`, `api.cloud.bumble.com/help-hub/v1/sierra/`, `HelpHubActivity`, `SUPPORT_MESSAGE_REPLIES`, `SUPPORT_SELFIE_REQUEST` — in-app AI/support chat (Sierra)

## Input → output
- In: date shares, check-ins, age signals, appeals, reports → Out: safety enforcement states, live-location sessions, compliance records.
