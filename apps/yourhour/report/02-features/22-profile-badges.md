# 22 — Profile & Badges

## Profile

| Component | Role |
|---|---|
| `ManageProfileActivity` (`profile`) | profile hub; ad `native_ad_profile`; listens `UPDATE_BADGE_UI` broadcast; extra `mode` |
| `ProfileIconActivity` | avatar picker/crop — `image_dir/profilePic.jpg`, UCrop, extras `arg_profile_pic_id` |
| `UpdateProfileActivity` | profile name/details editing |
| `ShareBadgeActivity` | badge share-out sheet (share card to social apps) |
| `HappyWeekMonthInfoActivity` | explainer for Happy Weekend + Healthy Week badges |

Profile = name + avatar only; no server-side profile beyond parental account.

## Badge screens

| Component | Role |
|---|---|
| `BadgeInfoActivity` (`badge_info`) | catalog of all badges |
| `ChallengeBadgeActivity` (`arg_challenge_badge`, `arg_no_phone`) | per-challenge badge detail |
| `AppChallengeBadgeActivity` (`app_challenge_badge`, `arg_package_name`) | per-app challenge badge |

## Badge catalog (full — recovered from badge factory `ad1.java`, `tg0` objects)

21 badges with real names + categories (id / category / display name):

| id | Category | Name | Rule |
|---|---|---|---|
| `badge_retention_streak_30` | retention | Buddy | 30 days installed |
| `badge_retention_streak_100` | retention | Best Friend | 100 days |
| `badge_retention_streak_365` | retention | Soul Mate | 365 days |
| `badge_yourhour_visit_3` | visit | Novice | open app 3 days |
| `badge_yourhour_visit_7` | visit | Visitor | 7 days |
| `badge_yourhour_visit_30` | visit | Comrade | 30 days |
| `badge_challenge_streak_3` | challenge | Explorer | 3-day streak |
| `badge_challenge_streak_7` | challenge | Contender | 7-day streak |
| `badge_challenge_streak_30` | challenge | Conqueror | 30-day streak |
| `badge_champion_3` | champion | Enlightened | ≤1h daily, 3 days |
| `badge_champion_7` | champion | Serene Champion | ≤1h, 7 days |
| `badge_champion_30` | champion | Zen Champion | ≤1h, 30 days |
| `badge_fasting_100` | fasting | Disciple | 100 fasting hrs |
| `badge_fasting_500` | fasting | Intermediary | 500 hrs |
| `badge_fasting_1000` | fasting | Crusader | 1000 hrs |
| `badge_no_phone_500` | no_phone | Mage | 500 no-phone hrs |
| `badge_no_phone_1000` | no_phone | Wizard | 1000 hrs |
| `badge_goal_streak_3` | goal | Dignified | goal met 3 days |
| `badge_goal_streak_7` | goal | Meditator | 7 days |
| `badge_goal_streak_30` | goal | Guru | 30 days |
| `badge_premium` | basic | Pro Goer | subscribe |

Plus event-named badges not in this factory list: `badge_no_phone_100`, `badge_fasting_100`,
`badge_happy_weekends` (≤2h weekend day), `badge_healthy_week` (≤11h week), `badge_informed`
(tour done), `badge_organized` (apps categorized), `badge_shared`, `badge_notify`, `badge_won`.

Each `tg0` carries: id, category, display name, shown/hidden drawables
(`ic_serene`/`ic_serene_hidden`, `ic_zen`/`ic_zen_hidden`), tier ints, description strings,
sort order — badges have locked ("hidden") art until earned.

State in `badge_history` table; `UPDATE_BADGE_UI` broadcast refreshes profile/dashboard;
shareable via share sheet (profile sharing).

## Dev hooks

`BadgeTestingActivity` (`badge_test_pref`, `badge_testing_mode`) — dev-only badge simulator
(see 27).
