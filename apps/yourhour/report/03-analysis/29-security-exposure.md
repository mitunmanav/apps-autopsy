# 29 — Security & Exposure Analysis

## Exported attack surface

| Component | Notes |
|---|---|
| `SplashActivity` | LAUNCHER + `mobilepe://shortcut/*` deep links → check URI handling for unvalidated params |
| `UsageTimerService` | **exported=true** — any app can start it; benign but worth noting |
| `ParentalSettingActivity` | exported |
| `BootCompletedReceiver`, 3 widget providers, `RefreshUsageDataReceiver`, `YourHourAdminReceiver`, `ReelDetectorAccessibilityService` | system-bound intents only |
| `LicenseActivity` (pairip) | Play integrity |
| Internal receivers | guarded by custom signature-level `DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` or `exported=false` |

## Embedded secrets / identifiers (shipped public config — not private keys)

- Facebook `applicationId 670696773447420` + **client token in resources** (client tokens are
  designed to ship; low risk but callable).
- AdMob publisher `ca-app-pub-3128150064662905`.
- Firebase DB URL `yourhour-mindefy.firebaseio.com` + google-services config.
- API base `tv-api.yourhourapp.com`.

## Hardening

- R8 repackage obfuscation (`defpackage`) + pairip integrity/license.
- PIN code gates: settings lock, per-app lock, parental PIN, paid PIN reset.
- Device-admin receiver (empty policy) — anti-uninstall friction.
- `DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` guards internal broadcasts.

## Weak spots (static review)

- `allowBackup` + unencrypted `yourhour.db` export → full usage history extractable by the user or anyone with the file.
- OkHttp BASIC header logging on release path.
- Overlay+accessibility grants give the app near-total UI control — normal for the product but high-impact if the APK is sideloaded/trojanized.
- Reel-blocker view-id heuristics are bypassable by app updates; 1-hour dismissal pass is client-side.
- `KILL_BACKGROUND_PROCESSES`/`GET_TASKS` legacy permissions retained.
- Device-admin with no declared policies provides no real anti-uninstall beyond the prompt.
- `queryUsageStats`/`QUERY_ALL_PACKAGES` data + parental sync = high-sensitivity data plane; TLS terminates at `tv-api.yourhourapp.com` (cert pinning not observed statically — **unverified**).

## Verification limits

No runtime testing performed; reflection/dynamic-loading surface (esp. pairip + FAN embedded
dex) not enumerated; TLS pinning, root detection, and server-side authorization were not
verifiable from the artifact alone.
