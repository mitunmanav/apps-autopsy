# Tool: Deep Links & Referrals
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

- **Entry:** `hitwicket://` custom scheme; `https://playhitwicket.go.link` autoVerify App Link; `hitwicket.page.link` Firebase Dynamic Links; `app.adjust.com/18rm68bp`, `automate.adjust.com/engage/deep-links` Adjust routes; `https://k.hitwicketsuperstars.com/appLinks` endpoint [observation].
- **Parameter model:** link payloads carry route+params (invite/match/feature targets — param schema inside IL2CPP not recovered [unknown]); `handleShortcut` + `handleNotification` secondary entries [observation].
- **Execution path:** intent → `HitwicketUnityPlayerActivity` (singleTask, `onNewIntent`) → Unity deep-link router → feature page; Adjust SDK captures attribution (`AdjustReferrerReceiver`, `libsigner`) [observation + inference on router].
- **Premium/offline flags:** routing is local; resolved features may be online [inference].
- **I/O flow:** external URL → activity → route parse → in-app destination + attribution event to Adjust/Firebase.
