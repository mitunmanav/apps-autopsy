# Screen Map

**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 (205957) — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`
All game screens are Unity-rendered; names below are IL2CPP `*Page`/*View/*Controller/*Popup` types [observation — type names; scene wiring unknown]. Android-side screens are SDK overlays listed at end.

## Launch / auth
- `HitwicketUnityPlayerActivity` (Unity splash → game) [observation]
- Auth: guest continue, Gmail/Play Games/Game Center link prompts, account-recovery list (`FetchRecoverableAccountsAsync`, `ClaimAndProceed` flow) [inference from AuthCoordinator methods]
- `OfflinePlayPopup`, region/username pickers (`changeCountry`, `changeUsername` flows)

## Main lobby / dashboard
`DashboardChatController`, `ChatDashboardButton`, live-match side nudge (`LiveMatchSideNudgeView`), `PlayLiveMatchPopupView`, season/daily-event entries, store/mail/invite icons (from dashboard type buckets: Alliance 162, Daily 56, Store 29, Tournament 25 types).

## Match screens (Hitwicket.GameScene.*, 185+ view types)
Pre-match: squad/lineup, match order (`saveMatchOrder`), opponent preview, toss. In-match: `BatsmanHUD*`, `BowlerHUD`, score bug, `ScoreCalloutView`, chibi panel (`ChibiPanelCoopController`), `MatchChatPanel`/`MatchChatDisplayPanel`/`MatchChatAnimPanel`, emoji chat (`InGameEmojiChatSignal`), haptics (`MatchSceneHaptics`). Post-match: result pages (`HitwicketNew.Features.GameResult`), `CoopMatchEndResult`, `DCCoopMatchResultComponents`, `DCHighscoreShareImg` share card, highlight reels.

## Squad / players
Squad list, player detail (`getPlayerDetails`), training/nets (`trainPlayer`, `buyTrainingNets`, `boostNetsTraining`, training slots), star-up (`startStarUp`/`endStarup`), team composition editor, progression (`player_progression_*`).

## Store / economy
Store pages per adapter: `CurrencyPackages` (coins/cash), `DailyDeals`, `EliteStore`, `GachaChest` (boxes/pity), `PlayerBox`, `Scout`, `Offers` — each a `*Page`/`DataStoreAdapter` pair; subscription store (`DailyRewardSubscription`, `SpbSubscription`); web-shop webview (`pavilion.hitwicket.com/buy`); energy/stamina purchase popups; gacha reveal (`GachaBox*`).

## Auction
Auction lobby, `getAuctionPageData` board, bid panel (`bidOnPlayer`), offer status, history page, token inventory.

## Events / live-ops
IPL hub (`RoadToIPL`), DC (Daily Contest `DC*` pages, `DCCoopPageController`, room-code `DCEnterRoomCodePopup`), ABR (AllianceBattleRoyale), Hitfest, Olympics (`OlympicShareContactPopupController`), SeasonPass track, YC (Youth Championship), live-matches lobby (`LiveMatchView`, `LiveMatchStreakView` + `Ftue10LiveMatchesLobbyTutorial`).

## Alliance
Alliance home, members, Showdown, Raid, League, Academy, race tracker, alliance chat, join/create flows.

## Social
Friends list (`CoopFriendsListPanelController`), friend team preview, invites page, mail/inbox (`getMailBox`, `claimMailReward`), leaderboard pages (`getLeaderboard`), spectate entry.

## Settings / profile
Profile popup, settings page (audio `HapticsToggleController`, notifications, language — 92 locales shipped but game text is IL2CPP-driven [inference]), country/username change, linked-accounts manager, logout (`SoftLogoutToLogin`), support/legal links (`hitwicket.com/privacy-policy`, `/terms`).

## Android/SDK-rendered screens [observation]
AppLovin fullscreen ad + creative debugger, AdMob AdActivity, InMobi ad/browser, ironSource controller/interstitial/test-suite, Mintegral reward-video, FAN AudienceNetwork, Unity Ads fullscreen webview, Facebook auth/custom-tabs, Google Play billing dialogs, Play Games native bridge, Play Core dialog wrapper, HSdpShim (Play asset delivery), WorkManager diagnostics receiver UI none.
