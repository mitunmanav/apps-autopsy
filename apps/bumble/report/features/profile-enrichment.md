# Feature: Profile Enrichment, Discovery Signals & Coaching

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

Grouped profile/discovery surfaces that don't warrant their own file; all evidence is shipped strings/classes.

## Profile content types [obs]
- **Languages**: `com.bumble.app.languages.*` package + activities, `LANGUAGE_BADGES`, `TYPED_SPOKEN_LANGUAGES`, `PROFILE_OPTION_TYPE_{PREFERRED_,}LANGUAGES`
- **Culturally Connected**: `CULTURALLY_CONNECTED` field + dedicated screens
- **Causes & Communities**: `USER_FIELD_MY_CAUSES_AND_COMMUNITIES`, `causes_communities_title`
- **Voice prompts**: `PROFILE_OPTION_TYPE_VOICE_PROMPTS` + recording UI strings
- **Photo prompts**: `BUMBLE_PHOTO_PROMPTS`; **profile videos**: `VIDEOS_ON_*_PROFILE` + `FullscreenVideo`/`VideoEditor` activities
- **Extended gender**: `ALLOW_EXTENDED_GENDERS`, `ELEMENT_TRANSGENDER_INDIA`, `showAsBaseGender` mapping; pronouns field
- **Astrology / Cosmic Connections**: `SERVER_GET_ASTROLOGY_COSMIC_CONNECTIONS`, `ELEMENT_COSMIC_CONNECTION_{FREE,PAYER}_ENTRYPOINT/UPSELL/INSIGHTS`, birth-data activation — **premium-gated compatibility layer** [obs]
- **Music**: `GET_MUSIC_SERVICES`, `MUSIC_ACTION`, `APPLE_MUSIC_*` flags + Spotify link

## Profile quality & coaching [obs]
- `SERVER_GET_PROFILE_QUALITY_TIP`/`SERVER_GET_PROFILE_SCORE`/`SERVER_GET_PROFILE_SUMMARY`, `*_PROFILE_QUALITY_WALKTHROUGH` (PQW v2), `BUMBLE_PROFILE_BUILDER`, `COMPLETED_PROFILE_BADGE`
- `EXTRA_SHOWS_PROMO_IN_PROFILE_SCORE` — profile-score screen doubles as an extra-shows upsell [obs]
- **Coaching hub**: `com.bumble.coaching.*` + `CoachingNavigationActivity`, `ALLOW_BUMBLE_COACHING`, `ELEMENT_COACHING_{HUB,IN_CHAT,IN_CONNECTIONS,TIP}`, `CLIENT_SOURCE_COACHING_{ARTICLE,HUB,VIDEO}`, `PROMO_BLOCK_TYPE_{PHOTO_,}COACHING_*`, `timelyinjections` package + `ALLOW_BUMBLE_TIMELY_INJECTIONS` (timed tips injected contextually)
- `PhotoInsights`/`ProfileInsights{,Modal}Activity`, `ALLOW_PHOTO_COACHING`, `PHOTO_INSIGHTS_CTA` — AI photo feedback; insights chart blurred unless Premium+ (see matchmaking-mechanics)

## Known For badges (peer-awarded) [obs]
- `SERVER_AWARD_KNOWN_FOR_BADGE`, `SERVER_GET_AWARDABLE_KNOWN_FOR_BADGES`, `CHAT_MESSAGE_TYPE_KNOWN_FOR_BADGE`, `USER_FIELD_KNOWN_FOR_BADGES`
- Badge set: `GOOD_VIBES`, `MADE_ME_LAUGH`, `RESPECTFUL_CHATS`, `RESPONSIVE`, `THOUGHTFUL_QUESTIONS`, … — after chatting, you award badges shown on their profile [inf]

## "Buzzing" activity status [obs]
- `FEATURE_BUZZING`, `ALLOW_BUMBLE_BUZZING`, `USER_FIELD_BUZZING_ACTIVITY`, `PROFILE_OPTION_TYPE_BUZZING_ACTIVITY`, `BUMBLE_BUZZING_{ONBOARDING,SAFETY_PLEDGE}`, `COMPLIMENT_TO_BUZZING_ACTIVITY`, add/delete + expiry-ring flags — a current-activity status field on profiles (what you're up for now [inf])

## Discovery-assist extras [obs]
- **Likes Sent**: `ALLOW_BUMBLE_LIKES_SENT`, `FOLDER_TYPE_LIKES_SENT`, `LikesSentEntryPointDataSource` — see who *you* liked
- **Recommend to Friend**: `recommendtofriend.*` package + activities, `BUMBLE_SHARE_PROFILE{,_DISALLOWED,_IN_CHAT_MENU,_SHARING_FLOW}`, `SERVER_GET_SHARED_USER`, `SERVER_REVEAL_PROFILE` — share profiles inside/outside app
- **Bee Key / Instant Match QR**: `ALLOW_BUMBLE_BEE_KEY`, `SERVER_GET_BEE_KEY_QR_CODE`, `SERVER_GET_INSTANT_MATCH_QR_CODE`, `ALLOW_INSTANT_MATCH`, `NOTIFICATION_TYPE_INSTANT_MATCH`, `REFRESH_INSTANT_MATCH_QR_CODE` — QR-based instant matching (in-person meetups/events [inf])
- **Anti-ghosting**: `SERVER_SEND_ANTI_GHOSTING`, `YOUR_MOVE_BADGE_WITH_SYSTEM_NOTIFICATION`, `SERVER_READY_TO_DATE` — nudges to reply; "Your move" badge
- **Best Bees expansion**: `BEST_BEES_{IN_CHAT,RECEIVER_EXPERIENCE,SIMILARITIES}`, `COMPLIMENTS_ON_BEST_BEES`, `PASSIVE_MATCH_*_TO_BEST_BEES` — curated picks surface in chat too; passive match conversion flag
- **Compatible People**: `*_PREMIUM/PRE_FEATURE_EMPTY_STATE/REGULAR_VOTE`, `EXHAUSTED_COMPATIBLE_PEOPLE_FREE_CREDITS` — another server-curated set with free-credit exhaustion → paywall
- **Request verification of match**: see `features/verification.md` (`SERVER_REQUEST_VERIFICATION`, verified-only filters)
- **Fixed (manual) location**: `BUMBLE_FIXED_LOCATION`, `LOCATION_SOURCE_MANUAL`, `FixedLocationDetailActivity` — set a static location distinct from GPS/travel
