# Feature: Bizz mode (professional networking)

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

## UI entry [obs]
- `MODE_BIZZ` game-mode, `BizzProfile`, `BizzProfileBlocker`, `DisableBizzMode`, `bumble_gamemodeswitch_{action,title}_bizz*` strings, `SCREEN_NAME_BIZZ_*`, `bumble_bizz_*` resources
- `SERVER_SWITCH_PROFILE_MODE` — mode switching is a server call
- `BIZZ_TAB_IN_SEARCH_SETTING`, `FILTER_NAME_BIZZ_INTENTIONS`, `LIFESTYLE_BADGE_TYPE_BIZZ_INTENTIONS` — Bizz has its own filter dimension ("intentions": networking goals)

## Distinct mechanics [obs]
- `chat_initial_chat_screen_bizz_pre_match_*` — prematch copy exists for all 4 gender pairs in Bizz; suggests anyone-can-open [inf from copy variants — copy coverage alone does not prove the rule]
- `MINOR_FEATURE_BUMBLE_WOMEN_ONLY_BIZZ` — a women-only Bizz experiment flag
- `ELEMENT_USING_BIZZ_TO_DATE` — misuse detection: dating in Bizz is flagged [inf]
- `SERVER_APPLY_FOR_JOB` — job-application verb (likely dead/experimental [inf])

## Execution path [inf]
- Mode switch → separate profile (`BizzProfile` vs dating profile) → networking deck → matches without opener rules

## Local vs remote
- Remote: mode state + decks; local: separate profile editor.

## Premium/offline
- Free mode [inf]; online.

## Input → output
- In: professional profile + intentions → Out: networking matches, job/networking connections.
