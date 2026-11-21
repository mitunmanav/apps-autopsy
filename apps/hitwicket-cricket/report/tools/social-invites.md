# Tool: Social, Friends & Invites
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

- **UI entry:** friends/invite pages, `CoopFriendsListPanelController`, `OlympicShareContactPopupController`, `DCHighscoreShareImg` share cards [observation].
- **Parameter model:** `getInviteData`, `claimInviteReward`, `friend_list`/`invite_list` catalogs, share payloads (`NativeShare` plugin — `com.yasirkula.unity.NativeShare*`) [observation].
- **Execution path:** REST invite/friend APIs via ApiHelper; outbound shares through `NativeShare` Android bridge (SEND/SEND_MULTIPLE queries to WhatsApp, Messenger, Facebook, X, Telegram); UPI apps queried for payment-related shares [observation].
- **Premium/offline flags:** **online** for invite rewards/friend sync; share intents are local (no network needed to compose) [observation].
- **I/O flow:** invite link/share → friend graph sync → `claimInviteReward` → rewards to wallet; `DCHighscoreShareImg` renders match result images for sharing.
