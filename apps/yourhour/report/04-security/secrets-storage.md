# Secrets & Credential Storage

## S1 — Lock PIN stored in plaintext (High)

`defpackage/wv3.java:2807`:
```java
context.getSharedPreferences("settingsPreference", 0)
       .edit().putString("parent_lock_pin", str).apply();
```
`wv3.N(context)` reads it back verbatim (`getString("parent_lock_pin", "")`).
The user's parental/settings lock PIN is written **as entered — no hash, no salt, no
encryption**. Sweep of all app code found **no `MessageDigest`, `SecretKeySpec`,
`Cipher`, `EncryptedSharedPreferences`, or `AndroidKeyStore` usage** in app classes
(matches were all third-party libs).

Recovery paths for the PIN:
- `shared_prefs/settingsPreference.xml` via `adb backup` (`allowBackup="true"`), root, or
  forensic acquisition.
- The app's own DB/file export features don't include prefs, but device-side access
  (root/backup) is enough.

Impact: whoever extracts the PIN can disable every lock, change parental settings, and
uninstall. The PIN also gates *paid* flows — see S8.

## S4 — API Bearer token unencrypted (Med)

- Token model `defpackage/bw.java`: `{token, expiresIn, receivedAt}` JSON.
- Attached as `Authorization: Bearer <token>` by interceptors (`bg6`, `dg6`, `eg6`).
- Persisted via a prefs-backed store (`au7.f.c("pref_reset_pin")` shows the same plain-pref
  mechanism used for auth state); **no keystore-backed storage anywhere in the app**.

Impact: token theft (backup/root) yields full API identity — devices list, locks,
overrides, synced usage — until expiry. Refresh/logout path exists (`auth/logout`,
`access_token_expired` analytics) but storage is the weak link.

## Shipped public identifiers (Info — low risk, by-design)

| Value | Where | Assessment |
|---|---|---|
| Facebook `applicationId` `670696773447420` + **client token** | resources | client tokens are designed to ship; usable for FB API calls as this app |
| AdMob publisher `ca-app-pub-3128150064662905` | resources + slot keys | public |
| Firebase DB `yourhour-mindefy.firebaseio.com` + google-services config | resources | public config; security depends on DB rules (server-side, unverifiable) |
| API base `https://tv-api.yourhourapp.com/api/v1/` | code | public |

## Other sensitive pref keys (plaintext)

`push_fcm_token`, `fcm_token_registration_pending`, `request_token`,
`extra_request_token`, `session`, `last_weekly_rewarded`, `parent_lock_pin`,
`pref_reset_pin`, `pending_blocker_enable_target` — all plain SharedPreferences.

## What's done right

- No private keys, HMAC secrets, or API secrets embedded (only public config).
- Backend auth is token-based with expiry (`expiresIn`), not password storage.
