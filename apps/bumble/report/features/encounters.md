# Feature: Encounters (swipe deck)

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

## UI entry [obs]
- `com.bumble.app.encounters` package, `discovery_screen.feature.DiscoveryScreenFeature`, `CardStackView`, sealed `voting.e` variants (`BacktrackInVoteCardClicked`, `encounters_backtrackV2_entryPoint` strings)
- Reachable as a mode root under the launcher/main shell [inf].

## Param/input model [obs]
- Card data = `com.bmbl.b4f.discovery` models: `LikedYouCard`, `LockedCard`, `ContentResponse`, `FilterCardListComponent`, `ScreenResponseTabStatusEnum`, CTA/route models
- Vote inputs: swipe direction + optional payload (SuperSwipe flag, Compliment attach)

## Execution path [obs names; order inf]
1. Deck fetch: `SERVER_GET_ENCOUNTERS` / `SERVER_UPDATE_LOCATION_AND_GET_ENCOUNTERS` / B4F `EncountersApi` (+ `FiltersApi`, `LocationApi`)
2. Render card stack; prefetch next batch (multiple-votes batching exists: `SERVER_MULTIPLE_ENCOUNTERS_VOTES`)
3. Vote → `SERVER_ENCOUNTERS_VOTE` / `VotesApi` (+ optional premium payload)
4. Match result → `matchscreen` + chat unlock; SSE/push can also inject matches

## Local vs remote
- **Remote**: decks, votes, matches — all server.
- **Local**: card rendering, animations (Lottie), offline vote queue via spiderweb [inf].

## Premium gates [obs]
- Backtrack (`BACKTRACK`/`BACKTRACK_ENCOUNTERS` params; no `SERVER_BACKTRACK` verb) + `BACKTRACK` product; SuperSwipe consumable; `LockedCard`/`LikedYouCard` = Beeline upsell hooks; advanced filters (`FiltersApi`, `bumble_settings_*` strings) are Boost/Premium-gated [inf].

## Input → output
- In: deck request (location + filters) / swipe gestures → Out: votes posted, match state, deck refresh, paywall surfaces on locked actions.
