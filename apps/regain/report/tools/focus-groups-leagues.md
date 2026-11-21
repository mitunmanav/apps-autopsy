# Focus Groups & Leagues

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Module:** `feature_focus_timer` group APIs (`S7/*` Retrofit) · **Evidence:** OBS

## What it is
Social accountability: create/join focus groups, shared leaderboards, weekly leagues with tiers, live "who's focusing now", reactions, nudges, invite links.

## UI entry (OBS)
`create_group_bs`, `join_invite_bs`, `group_*` routes, `focus_league_*`, `after_session_groups_nudge`, `suggested_groups`, `joined_groups`, `group_week_leaderboard`, `top_focusing_members`, `live_focus_preview`.

## Params model (OBS)
`GroupMeta`/`GroupMetaCreate`/`GroupMetaEdit`/`GroupMetaUIModel`, `GroupMember`, `GroupSearchResponse`/`Result`, `GroupCategory`(+`ExamDate`), `GroupTheme`, `GroupPreference`, `GroupWeekLeaderboard*`/`Stats`, `GroupTopCurrentFocusingMembers`, `GroupLiveFocusData`, `GroupNudgeEntity`/`GroupReactionEntity`/`GroupsPinned` (Room), `InactiveMember*`, `KickMemberResponse`, `GenerateInviteLinkResponse`, `InviteDetails`, `League`/`LeagueDetails`/`LeagueTier`, `FocusWithOthersGroupInfo`.

## Execution path (OBS)
Create/edit → `POST /fg/group/*`; join → invite link (join.regainapp.ai) → `join_invite_bs` → `/fg/group/invite`; live presence → `POST /fg/group/update_live_focus` on session heartbeat → `get_top_focusing_members`; weekly rank → `SyncGroupRankWorker` → `get_group_week_leaderboard`; nudge → `nudge_inactive_members` (FCM); reactions → `save_reaction`/`get_reactions`; kick → `kick_member`; theme → `get/update_group_theme`.

## Data flow
Local session stats → `/fg/*` → server aggregates → leaderboard/league responses → Room cache → UI.

## Premium/offline
Fully network-dependent; league tiers INF premium.
