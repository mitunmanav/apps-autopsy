# Feature: Gifts, Rewards, Referrals & Mini-Games

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

## Virtual gifts [obs presence; live-state unk]
- `MINOR_FEATURE_BUMBLE_VIRTUAL_GIFTS`, `chatoff.{giftsending,giftstore}.*` + `GiftGridAdapter` (Badoo gift store — legacy stack, possibly dormant), `SERVER_GET_GIFT_PRODUCT_LIST`, `SERVER_PURCHASED_GIFT_ACTION`
- `GIFT_BOX_SUPPORTED`, `GIFT_FOR_VIDEO`, `MINIMUM_GIFT_PRICE`, `PRICE_PER_GIFT`, `PRIVATE_GIFTS_IN_OTHER_PROFILES`, `BALANCE_TYPE_GIFT_VOUCHER` — priced catalog, vouchers, private/public gift display
- Paid chat attachment model [obs]; whether purchasable in live Bumble is flag/server-gated [unk].

## Daily rewards [obs]
- `SERVER_GET_DAILY_REWARDS`, `ALLOW_DAILY_REWARDS`, `ONBOARDING_PAGE_TYPE_DAILY_REWARDS_V1`, `ELEMENT_DAILY_REWARD{,_COLLECTED}`, `RewardActivity` — retention loop (log in daily → collect)

## Referral + contacts [obs]
- `SERVER_SUBMIT_REFERRAL_CODE`, `SERVER_REFERRALS_TRACKING_EVENT_CONFIRMATION`, `REFERRAL_PROGRAM_V2`, invite verbs, `SERVER_SEND_MOBILE_APP_LINK`
- `ONE_CLICK_CONTACTS_FOR_CREDITS`, `SERVER_SYNC_CONTACT_LIST`, `CONNECT_PHONEBOOK` — contact sync traded for credits [obs — growth + monetization loop]

## Ice Breakers AI [obs]
- `SERVER_GET_ICE_BREAKERS_AI`, `ACTION_TYPE_GET_ICE_BREAKERS`, `EVENT_NAME_SEND_ICE_BREAKER_AI`, dialog elements + promos — server-generated opener suggestions [obs; likely Elise/server LLM-backed — unk which]

## Chat mini-games [obs]
- `SERVER_WOULD_YOU_RATHER_GAME_ACTION` (+errors), `SERVER_QUIZ_*`, `SERVER_GET_QUIZ_MATCH_FLOW`, `SERVER_{SAVE,SUBMIT}_QUIZ_MATCH_ANSWERS`, `MESSENGER_MINI_GAME_RETHINK`, `SERVER_CREATE_POLL` + `MINOR_FEATURE_BUMBLE_POLLS` — polls and quiz games inside chat/hives

## Date Night [obs]
- `SERVER_DATE_NIGHT_{CANCEL,GET,INVITE,SELECTOR_GET_AVAILABLE_GAMES,SELECT_GAME,START}`, `BUMBLE_DATE_NIGHT_SCHEDULING_*`, `DATE_NIGHT_{DATING_CARD_GAME,INAPP_ICON,INVITATION,TOP_BAR_ENTRYPOINT}`, `DATING_HUB_NIGHT_IN` — scheduled virtual date with card games, dating-hub entry

## Moves Making Moves (social impact) [obs]
- `SERVER_{GET,SAVE}_MOVES_MAKING_MOVES*`, `MovesMakingImpactActivity`, walkthrough screens — charity/impact layer tied to making moves

## In-app surveys [obs]
- `SERVER_GET_EXPERIENCE_FORM`, `SERVER_EXPERIENCE_ACTION`, survey submit verbs, `SurveyPromoCardActivity`, `screenstories.inappsurvey`

## Input → output
- In: purchases, daily logins, referrals, contacts, game actions → Out: gifts delivered, credits/rewards, invites, openers, games played, surveys logged.
