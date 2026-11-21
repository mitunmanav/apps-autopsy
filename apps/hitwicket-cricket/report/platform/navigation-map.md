# Navigation Map

**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 (205957) — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

## Entry points [observation]
| Entry | Trigger | Lands at |
|---|---|---|
| LAUNCHER MAIN | icon tap | `HitwicketUnityPlayerActivity` (singleTask) |
| `hitwicket://*` | deep link | same activity → `handleShortcut`/deep-link router |
| `https://playhitwicket.go.link` | verified App Link (autoVerify) | same; Adjust deferred deep link |
| `hitwicket.page.link` | Firebase dynamic link | Firebase → app |
| `app.adjust.com/18rm68bp`, `automate.adjust.com/engage/deep-links` | Adjust links | redirect → app link |
| FCM notification tap | `custom_notification_android_activity` → activity `handleNotification` | screen encoded in payload + `sendNotificationTracker` |
| App shortcuts | `handleShortcut` | in-game destination |
| Alarm/boot receivers | notification reschedule | `:pn` process, no UI |
| `IsolatedDekuContentProvider` (gpdeku) | Play-initiated | screencapture feature |
| Widget/QS tile | none declared | — |

## Boot flow [observation + inference]
`SafeDKApplication` → androidx.startup/Firebase/ads init providers → `HitwicketUnityPlayerActivity.onCreate` → Unity boot (fullscreen, landscape, splash per meta-data) → IL2CPP `AuthCoordinator.ResolveOnLaunch` → `EnsureGuestIdentityAsync`/`EnsureFirebaseIdTokenAsync` → session token (`WriteSessionTokenFromLogin`) → dashboard; recoverable-account prompt when `FetchRecoverableAccountsAsync` finds matches; `Ftue*` tutorials gate first session (OfflineTutorialDb).

## In-app routing model [inference]
Signal/command buses (Zenject `*Signal` types: `MatchSpectatorJoinSignal`, `CoopDisconnectSignal`, `MultiplayerSpectateResumeMatchSignal`, `DCCancelInviteNotificationsSignal`, `ShowLiveChatInSideMatch`) drive page pushes via `*PageController`/`Navigation` types; deep links map to feature routes through `APIConfigSO`/router.

## Match navigation [observation]
Lobby → mode select (PvP/Practice/Co-op/Live/ABR/DC) → room (`DCRoomCodeHandler`, `AutoMatchRoomManager`) → squad/order (`saveMatchOrder`) → `GameScene` → result → back to lobby (streak cards `LiveMatchStreakDayCard`).

## WebView exits [observation]
`pavilion.hitwicket.com/buy` store webview, `hitwicket.com/privacy-policy`, `/terms`, Facebook/Google custom tabs auth, `playhitwicket.go.link` re-engagement.

## Process navigation [observation]
`:pn` process handles notification scheduling/delivery without UI; `IsolatedDekuContentProvider$Process0-5` isolated provider processes for Play Deku; ad SDKs run their own activities in-app.
