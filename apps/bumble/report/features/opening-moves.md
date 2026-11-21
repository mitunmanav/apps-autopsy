# Feature: Opening Moves (first-move questions)

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

## UI entry [obs — whole package]
- `com.bumble.app.firstmovequestions.*`: `image_opening_move_selection`, `multiple_opening_moves_container`, `your_opening_moves`, `review_before_save` (`FeedbackFeature`)
- `com.bumble.firstmovepromoscreen.FirstMoveActivity` + promo classes
- Models: `OpeningMove`, `Question`, `Image`, `Tab`, `Placeholder`

## Param model [obs]
- `MINOR_FEATURE_OPENING_MOVE`, `MINOR_FEATURE_MULTIPLE_OPENING_MOVES_IN_PROFILES`, `MINOR_FEATURE_OPENING_MOVES_REVIEW_BEFORE_SAVE` — users can set up to 3 moves; review-before-save gated
- `ELEMENT_OPENING_MOVE_{1,2,3}`, `ELEMENT_OPENING_MOVE_MATCH_SCREEN`, `ELEMENT_OPENING_MOVE_MATCH_REPLY_TO_MOVE_TOOLTIP` — moves shown on profile + match screen
- `PROMO_BLOCK_TYPE_OPENING_MOVES_REPLY_MATCH_EXPLANATION` — "reply to move = match" explainer
- `ALBUM_TYPE_OPENING_MOVES`, `ACTIVATION_PLACE_OPENING_MOVES_IMAGE` — photo-based opening moves
- `CLIENT_SOURCE_WRITE_OPENING_MOVE`, `CLIENT_SOURCE_SPONSORED_OPENING_MOVES`, `ELEMENT_SPONSORED_OPENING_MOVES_TAB`, `SponsoredOpeningMovesActivity` (`.work/activitys.txt`) — **sponsored opening moves** exist: partner-authored questions [obs]; whether sold as paid ad inventory vs cross-promo content is [unk]
- `EVENT_NAME_CUSTOM_OPENING_MOVE_MODERATION` — custom moves go through moderation

## Execution path [inf]
- Set move(s) on profile (text or photo question) → matches can reply to your move as the opener → reply = first message, satisfying the prematch opener requirement
- This is Bumble's 2024+ relaxation of "women message first": either side can answer an Opening Move [inf from reply-to-move = match semantics]

## Local vs remote
- Remote: move catalog + moderation + sponsored moves; local: picker/carousel UX, review-before-save.

## Premium/offline
- Core is free; `firstmovepromoscreen` = promo/onboarding surface; sponsored moves are an ad surface [obs].

## Input → output
- In: question/image pick → Out: profile move displayed → match replies to move → conversation opened.
