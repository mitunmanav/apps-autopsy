# Feature: Matchmaking Mechanics, Like Visibility & Gendered Monetization

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

Deep-dive evidence (this pass): `ev_c08ad8de` voting classes, `ev_cece4272` VoteResultAction, `ev_8de033f1` voting.e sealed types, `ev_aa98ded3` B2VoteMetaData, `ev_3d80e6dd` beeline package, `ev_d0a68a05` BeelineCard, `ev_fb7e2d2e` BeelinePromo, `ev_7736e9a2` firstmove classes. Plus DEX string tables.

## 1. The matching loop (what actually happens) [obs names; order inf]

```
deck fetch (SERVER_GET_ENCOUNTERS / EncountersApi, location+filters)
  → card shown (CardStackView, voting.e sealed variants)
  → vote posted (VotesApi / SERVER_ENCOUNTERS_VOTE / SERVER_MULTIPLE_ENCOUNTERS_VOTES)
       vote payload model: voteType= + vote_result= + B2VoteMetaData
       (Parcelable: int, String, int, String, Boolean, Long — position/id/type/source/premium flag/ts [inf])
  → server decides: match | no match | monetization action
  → VoteResultAction sealed results [obs]:
       AfterBoomScreenVoteResultAction  (match "boom" screen)
       ShowOutOfLikes                   (vote-cap paywall mid-deck)
       ShowScratchCardMiniGameUpsell    (gamified upsell on a vote)
       a/b/c/d                          (obfuscated outcomes)
  → match → matchscreen → prematch state (timer) → chat unlock rules
```

Every vote is also a revenue checkpoint — the client models "vote → show upsell" as a first-class result [obs].

## 2. Who sees whom — visibility is sold, not just shown [obs]

Free visibility is algorithmic and server-controlled; **paid visibility is a product line**:

| Tool | Evidence | Effect |
|---|---|---|
| Spotlight | `SERVER_INIT_SPOTLIGHT`, `SERVER_STOP_SPOTLIGHT`, `CONNECTION_STATUS_SPOTLIGHT_ADMIRER` | paid visibility boost; `*_SPOTLIGHT_ADMIRER` marks an admirer linked to a spotlight — direction (your admirers vs their list) ambiguous [inf] |
| SuperSwipe | `BALANCE_TYPE_BUMBLE_SUPERSWIPE`, `SuperSwipe(otherUserId=`, `PROFILE_CAROUSEL_TYPE_SUPERSWIPED_YOU`, `MINOR_FEATURE_SUPERSWIPED_YOU_ATTACHMENT*` | recipient sees a "superliked you" attachment/carousel — paid attention reaches the recipient unblurred |
| Compliments | `Compliment(otherUserId=`, `ALLOW_BUMBLE_COMPLIMENTS_CONSUMABLES`, `ComplimentReply` | paid message attached to a like, lands on recipient's beeline as `ComplimentUser` card |
| Notes | `BeelineCard$NoteUser`, `NoteInternalRoute` | paid note shown in admirer grid |
| Extra Shows / Crush (Badoo heritage — `BADOO_*`/crush names; possibly dormant per limitations.md) | `BALANCE_TYPE_BADOO_EXTRA_SHOWS`, `CONSUMABLE_CRUSH`, `BALANCE_TYPE_CRUSHES`, `CHAT_MESSAGE_TYPE_CRUSH`, `CLIENT_NOTIFICATION_TYPE_EXTRA_SHOWS_WITH_VOTE_BUTTONS` | pay to be shown more / notify-of-like; live-state [unk] |
| Rewarded video | `ELEMENT_CRUSH_REWARDED_VIDEO` | rewarded-ad-to-earn-Crush element exists; live-state [unk] |

## 3. Like visibility — blurred-admirer gating [obs]

- `beeline_likes_count`, `ELEMENT_LIKED_YOU_BADGE`, `TOOLTIP_TYPE_LIKES_COUNTER` — an admirer-count badge field exists; what the free tier actually displays (exact count vs capped/rounded) is [unk].
- `isBlurred` card flag + `blurredImageUrl` field — the server ships **pre-blurred image URLs** for locked admirers [obs]. However the client model also carries `BeelineUser(avatarUrl=`, `LikedYouCard(userId=`, and `unboxedPictureUrl=`/`unboxedPreviewUrl=` fields — an admirer `userId` could plausibly fetch a real profile via `SERVER_GET_PERSON_PROFILE`/`SERVER_GET_USERS`/`SERVER_REVEAL_PROFILE`. Whether an unlocked-view path bypasses the blur is **[unk]** — "no client trick can reveal them" is not proven.
- `ELEMENT_SEEING_BLURRED_IMAGE`, `bumble_beeline_list_blurred_a11y`, `bumble_premium_plus_trending_blurred_profile_a11y_label` — blurring is also on the Trending tab.
- `MINOR_FEATURE_PARTIAL_UNLOCK_OF_LIKED_YOU` + `PAYMENT_PRODUCT_TYPE_UNLOCK_LIKED_YOU` + `ACTIVATION_PLACE_LIKED_YOU_UNLOCK_ONE` — a paid single-admirer unlock surface exists; whether it reveals one card permanently or a time-boxed list is [inf from `UNLOCK_ONE` naming].
- `MINOR_FEATURE_BADOO_SORTING_ON_LIKED_YOU_PAGE_ON_LOCKED_STATE`, `MINOR_FEATURE_BADOO_SORTING_WITH_GSNG_ON_LIKED_YOU_PAGE`, `MINOR_FEATURE_BEELINE_SERVER_CONTROLLED_TABS_ORDER` — flag names indicating server-side grid/tab ordering exist [obs]. The `BADOO_*` flags may be dormant Badoo residue (see limitations.md); live ordering behavior [unk].
- `MINOR_FEATURE_BEELINE_CONSUMABLE_SCROLL_TO_FLASH_SALE` — a scroll-to-flash-sale flag exists [obs name]; trigger semantics (does scrolling trigger it, where does it appear) are [inf].
- `ELEMENT_10_ADMIRER_ENCOUNTER_BLOCKER` vs `ELEMENT_NO_ADMIRER_ENCOUNTER_BLOCKER` — two distinct blocker elements exist keyed to admirer count [obs]; exact thresholds and copy are server-side [unk].
- `MINOR_FEATURE_BEELINE_FARAWAY_ADMIRERS` — out-of-range admirers are still surfaced [inf from flag name].
- `CLIENT_NOTIFICATION_TYPE_LIKED_YOU_IN_ENCOUNTERS_WITH_VOTE_BUTTONS`, `MINOR_FEATURE_REFRESH_BEELINE_NOTIFICATIONS`, `NOTIFICATION_NAME_LIKED_YOU` — liked-you push + in-deck teaser surfaces exist [obs names].
- `MINOR_FEATURE_HIDE_ALL_LIKED_YOU_ENTRYPOINTS`, `MINOR_FEATURE_HIDE_BEELINE_HEADER_IF_MSG_AND_HEADER_NIL`, `MINOR_FEATURE_NO_PERSON_NOTICES_IN_LIKED_YOU_SCREEN` — flags exist to hide teaser surfaces entirely; purpose unknown (holdout groups, regional rules, low inventory all plausible) [unk].
- `BeelineCard` sealed types: `BeelineUser`, `ComplimentUser`, `NoteUser` — the grid model mixes plain likes with paid compliments/notes [obs].
- `BeelinePromo` inner types: `Spotlight`, `Filters`, `ReactionReveal`, `PromoPlaceHolder`, `TopTip` — promo blocks are modeled inside the admirer grid [obs].
- `Beeline(gameMode=`, `ALLOW_BUMBLE_BEELINE_TABBED_INTERFACE`, `ALLOW_BEELINE_COLLECTIONS` + collection names (Nearby, Most Compatible, Shared Music Taste, Similar Lifestyles, Languages, Aligned Intentions, New, Faraway) — categorized admirer "collections" exist [obs].
- `ELEMENT_BLURRED_GRAPH`, `profile_insights.chart.blurred` — a blurred profile-insights chart exists; which tier unlocks it is unclear (`bumble_premium_plus_trending_blurred_*` suggests Premium+) [inf].

## 4. Gender asymmetry — what the code shows [obs]

- `GlobalState(myGender=` — your gender is global app state consulted by features.
- **Prematch copy is coded per gender pair**: `chat_initial_chat_screen_*_pre_match_message_hours_for_{male,female}_about_{male,female}` — separate strings for all 4 (me × them) combinations in dating and bizz; bff carries its own `bff_pre_match_message_hours_for_{female,male}` set with no `about_*` axis. The rule likely adapts by pairing [inf] — full copy coverage would exist even under a blanket women-first rule + mode exceptions, so copy existence alone does not prove the adaptive rule.
- `MaleWaitingForFirstMove(title=` + `maleWaitingForFirstMovePromo=` and `WomanMakesFirstMove(title=` + `womanMakesFirstMovePromo=` + `PROMO_BLOCK_TYPE_MAKE_FIRST_MOVE_EDUCATION` — **dedicated promo screens per gender role**: men get a "you're waiting for her move" surface (upsell opportunity: Extend, Rematch), women get "make the first move" education [obs].
- `PRE_MATCH_TIME_LEFT`, `USER_FIELD_PRE_MATCH_TIME_LEFT`, `SERVER_ERROR_TYPE_PREMATCH_EXPIRED` — the 24h opener window is a server-tracked user field.
- `ACTION_TYPE_BUMBLE_EXTEND_PREMATCH`, `PROMO_BLOCK_TYPE_BUMBLE_PREMATCH_EXTENSION`, `REQUEST_EXTEND_MATCH`/`EXTEND_MATCH` params (no `SERVER_EXTEND_MATCH` verb) — **extending the waiting window is a paid promo block** [obs mechanism]. Both sides can extend: `chat_initial_chat_screen_pre_match_prolongated_by_me_message_hour_for_female_about_{male,female}` shows women get "you extended" copy too. Who buys more is a market question, not a code question [unk].
- `REMATCH`/`REMATCH_ACTION` params (no `SERVER_REMATCH` verb), rematch mini-profile, `ACTIVATION_PLACE_REMATCH_MESSENGER` — reviving an expired match is subscription-gated [obs].
- `ALLOW_CRUSH`/`CONSUMABLE_CRUSH`, SuperSwipe, Compliments, Notes — every "reach their attention before/along the like" tool is paid; the recipient gets these **free as attention signals** (`SUPERSWIPED_YOU_ATTACHMENT`, `ComplimentUser` card) [obs].
- `GENDER_CHANGE_LIMIT`, `ALLOW_BUMBLE_CHANGE_GENDER_CONFIRMATION_SCREEN`, `ELEMENT_CANT_CHANGE_GENDER` — gender changes are rate-limited and gated [obs]. Purpose ambiguous: anti-impersonation, moderation, and match-rule integrity are all plausible [unk].
- `showAsBaseGender=` — extended genders map to a base gender; purpose unspecified (match rules, filtering, display all plausible) [obs field, unk purpose].
- `MINOR_FEATURE_UNSPECIFIED_GENDER_PREFERENCE`, `FILTER_NAME_GENDER`, `FILTER_NAME_EXTENDED_GENDER` — who you see is itself a filter dimension.

## 5. Who controls matching — server [obs→inf]

- All matching inputs (deck composition, admirer sort order, blur sets, match creation, prematch timers, quota) come from server responses; the client renders sealed-model results.
- No scoring/elo/ranking algorithm exists client-side [obs: none found; obfuscated `b.*` can't fully exclude but all match verbs are remote].
- `ALLOW_BEST_BEES_ON_ENCOUNTERS`, `ACTIVATION_PLACE_BEST_BEES`, `isBestBee=` card field, `CLIENT_NOTIFICATION_TYPE_BUMBLE_BEST_BEES_RECEIVER_EXPERIENCE` — "Best Bees" = server-curated picks injected into deck + notified to the picked person [obs].
- `CLIENT_NOTIFICATION_TYPE_BUMBLE_COMPATIBLE_PEOPLE_FREE_VOTE_USED` — a notification tied to consuming a free "compatible people" vote exists; which party receives it is [unk].
- Vote quota: `ACTIVATION_PLACE_VOTE_QUOTA`, `CLIENT_SOURCE_VOTE_QUOTA`, `Votecap` consumable — swipe limits enforced server-side; `VoteResultAction.ShowOutOfLikes` fires mid-deck [obs].

## 6. The funnel in one picture [inf — assembled from obs parts]

```
Free man: swipe (capped) → like → she can see him (admirer badge/card, deck surfacing)
        → match if she likes back → she must open within the prematch window
   monetized pressure: blurred admirer grid, liked-you pushes, admirer-count blockers,
              waiting-for-her promos, flash-sale flag, out-of-likes wall
   paid exits: Beeline (sub or per-admirer unlock), SuperSwipe, Compliment,
              Note, Spotlight, Extend, Rematch, vote-cap lift
   free path in: Opening Moves — answering a move can start the conversation
Free woman: same blurred grid + same paywalls exist [obs — no gender-exempt flag found],
   but she typically holds the opener in hetero matches [inf]
Recipient (either): gets SuperSwipe/compliment/note attachments unblurred —
   paid attention is delivered to the recipient free [obs]
```

## 7. Unknowns
- Whether identical paywalls/prices are shown to men and women — pricing/entitlement is server-side; no gendered price table in client [unk].
- Whether free women see the same admirer-count blockers — flag state is server-driven [unk].
- The actual deck/admirer ranking formula — fully server-side [unk].
- `GSNG` sort flag acronym — unresolved [unk].
