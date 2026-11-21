# Feature: Profile Visitors ("who viewed you")

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

## UI entry [obs]
- `SCREEN_NAME_PROFILE_VISITORS`, `PROFILE_VISITORS`, `LIST_SECTION_TYPE_PROFILE_VISITORS`, `NO_VISITORS` empty state, `NOTIFICATION_NAME_PROFILE_VISITORS` push
- `com.bmbl.b4f.views.v1.apis.ViewsApi` (B4F service) + `SERVER_VISITING_SOURCE` legacy verb
- `USER_FIELD_POPULARITY_VISITORS_{TODAY,MONTH}` — visitor counters are user fields (popularity metric)

## Param model [obs]
- `VISITING_SOURCE_*`, `VISITORS_CAME_FROM` — the app records *where* a profile view originated (deck, beeline, profile link)
- `ALLOW_OPEN_VISITORS` flag; `ELEMENT_INVISIBLE_VISITOR` + `MINOR_FEATURE_INVISIBILITY` — **incognito ties directly to visitors**: invisible users don't appear in others' visitor lists [obs link]

## Execution path [inf]
- View someone → `ViewsApi`/visiting-source records the visit → they see you in Visitors (unless invisible) → push via `NOTIFICATION_NAME_PROFILE_VISITORS`
- Viewing the visitors list is plausibly premium-gated [inf — `ALLOW_OPEN_VISITORS` flag suggests a gate/rollout, but it could equally be a free feature behind staged release; no entitlement string proves the tier]

## Local vs remote
- Remote: visit ledger + counters; local: list rendering.

## Premium/offline
- View-your-visitors gate tier [unk] (see Execution path); incognito hides your own footprint (Premium feature — see `tools/incognito.md`).

## Input → output
- In: profile views + visiting source → Out: visitor lists, popularity counters, "X viewed you" pushes.
