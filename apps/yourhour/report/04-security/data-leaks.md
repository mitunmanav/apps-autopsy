# How YourHour Leaks User Information — Full Matrix

Three leak classes: **by design** (features that transmit data), **by weakness**
(extractable data), **by platform** (over-broad access).

## By design — intentional transmissions

| Destination | What leaves | Trigger | Evidence |
|---|---|---|---|
| `tv-api.yourhourapp.com` | Google account identity, FCM token, **installed-app list, per-app usage summaries** (`devices/{id}/apps`, `stats/*`, `usageSyncedAt`, `appsSyncedAt`), lock/override state, device metadata (`deviceId`, `deviceName`, `platformDeviceId`) | account use; **parental pairing pushes phone's data to the guardian TV** | API paths; `NotificationReceiver` |
| `tv-api…/backups` | **entire `yourhour.db`** (full usage history, unlocks, settings, challenges) | user-initiated backup/restore | `ImportDataActivity` `/backups`, `/yourhour.db` |
| Firebase Analytics | **287 events**: every screen, toggle, prompt choice (allow/later), paywall psychology, retention cohorts D1–D30, service failures, goal values (`total_usage_minutes`, `goal_minutes`), parental funnel | constant | event catalog (../03-analysis/30-data-collection.md) |
| Crashlytics | every caught exception incl. stack + device context | crashes | `u83.a().b(e)` |
| Ad networks (AdMob pub-3128150064662905, FAN embedded dex, Unity) | AD_ID, device signals, per-placement requests (~28 slots) | free tier | manifest + slot keys |
| Facebook SDK | app-scoped identity, device signals | SDK init | app id `670696773447420` |
| Google Drive | backup metadata/file (`drive.metadata.readonly` scope) | user export | ExportDataActivity |
| Story backend | **name, email, age, profession, photo URL**, story text, tags, country | voluntary submission | `story_user_*` fields |
| FCM server | registration token; receives parental commands | account/parental | `push_fcm_token` |

## By weakness — extractable data

| Vector | What's exposed | How |
|---|---|---|
| `allowBackup="true"` + `fullBackupOnly` | whole sandbox: prefs (incl. **plaintext PIN**, auth token), Room DB | `adb backup` / device backup restore |
| `yourhour.db` export | full history as **unencrypted SQLite** — readable offline by anyone holding the file | built-in export feature (premium) |
| `parent_lock_pin` plaintext | lock PIN — defeats every lock + parental gate | shared_prefs read (backup/root) |
| Bearer token JSON in prefs | API identity until expiry | shared_prefs read |
| **logcat** | `FORGET_PIN_REQUEST` request_token at `Log.e` (`NotificationReceiver.java:167,172`); OkHttp **BASIC** logs Authorization headers on the API client | `adb logcat`, bug reports, READ_LOGS via adb |
| FileProvider broad paths | app/cache/external dirs shared for PDFs/XLS/avatar | `fileprovider_paths.xml` |

## By platform — over-broad access

- **`QUERY_ALL_PACKAGES`**: full installed inventory — the app (and any compromise of it)
  sees everything installed.
- **Accessibility** (`ReelDetectorAccessibilityService`, `canRetrieveWindowContent`): reads
  other apps' window trees — reel detection needs it, but the grant is all-or-nothing.
- **`SYSTEM_ALERT_WINDOW`**: overlays over any app.
- **Usage access**: every app's foreground timing.
- **`READ_PHONE_STATE`**, `GET_TASKS`, `KILL_BACKGROUND_PROCESSES`: device + task visibility.
- **`POST_NOTIFICATIONS` + FCM**: remote-triggered actions (locks, overrides, prompts).

## Consent gaps

- The **child/phone side** of parental control has no in-app indicator that a guardian is
  paired or what is synced (pairing requires on-phone Google sign-in, but ongoing sync is
  silent).
- Story submissions collect PII with no visible age-gate beyond Google's.
- Exit-offer/reward telemetry tracks purchase-intent abandonment — users aren't told their
  paywall behavior is logged.
