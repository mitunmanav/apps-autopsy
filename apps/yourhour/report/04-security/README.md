# Security & Data-Leak Analysis — YourHour 4.5.6

All findings are **static evidence** from decompilation (`/tmp/apk/jadx-src`, REA evidence
`ev_0f771a18…`, `ev_ddd183dc…`, `ev_b778e7f9…`, `ev_47f937ee…`). No runtime exploit testing
was performed; items marked *(inference)* are logic deductions from code, not demonstrated
exploits.

## Findings index

| # | Severity | Finding | File |
|---|---|---|---|
| S1 | **High** | Parental/settings lock PIN stored in **plaintext** (`settingsPreference` → `parent_lock_pin`) | [secrets-storage.md](secrets-storage.md) |
| S2 | **High** | Full behavioral DB exportable **unencrypted** (`yourhour.db`, SAF + `allowBackup`) | [data-leaks.md](data-leaks.md) |
| S3 | **High** | Phone's app list + usage syncs to a paired TV — surveillance-capable data plane | [data-leaks.md](data-leaks.md) |
| S4 | Med | API Bearer token stored unencrypted (JSON in prefs); no Keystore/EncryptedSharedPreferences anywhere | [secrets-storage.md](secrets-storage.md) |
| S5 | Med | `FORGET_PIN_REQUEST` request_token written to **logcat at ERROR level** | [data-leaks.md](data-leaks.md) |
| S6 | Med | OkHttp **BASIC** logging (headers) — auth headers can reach logcat | [transport-network.md](transport-network.md) |
| S7 | Med | No network security config → **cleartext permitted by default** (targetSdk 36 default allows); no cert pinning observed | [transport-network.md](transport-network.md) |
| S8 | Med | Paid "PIN reset" gated by client-side boolean `pref_reset_pin` — bypassable on rooted devices *(inference)* | [feature-bypass.md](feature-bypass.md) |
| S9 | Med | All premium gates are client-side entitlement checks — patchable in principle *(inference)* | [feature-bypass.md](feature-bypass.md) |
| S10 | Med | `QUERY_ALL_PACKAGES` + accessibility + overlay + device-admin = maximal control surface | [attack-surface.md](attack-surface.md) |
| S11 | Low-Med | JS-enabled WebViews (`BlogActivity arg_url`, several `setJavaScriptEnabled(true)`); ad-SDK `gmaSdk` JS interface | [attack-surface.md](attack-surface.md) |
| S12 | Low-Med | Reel-blocker: client-side 1-hour dismissal pass + view-id heuristics = easy bypass | [feature-bypass.md](feature-bypass.md) |
| S13 | Low | Device-admin receiver declares **zero policies** — anti-uninstall is cosmetic | [feature-bypass.md](feature-bypass.md) |
| S14 | Low | `UsageTimerService` exported=true; `SplashActivity` exported + `mobilepe://` deep links | [attack-surface.md](attack-surface.md) |
| S15 | Low | Story submission ships real PII (name/email/age/profession/photo URL) | [data-leaks.md](data-leaks.md) |
| S16 | Low | Legacy permissions `KILL_BACKGROUND_PROCESSES`, `GET_TASKS`, `REORDER_TASKS`, `requestLegacyExternalStorage` | [attack-surface.md](attack-surface.md) |
| S17 | Info | Facebook client token + AdMob pub ID + Firebase URL shipped (public config, low risk) | [secrets-storage.md](secrets-storage.md) |
| S18 | Info | Meta FAN ships as embedded DEX in assets — dynamic-code-loading surface | [attack-surface.md](attack-surface.md) |

## How user information leaks — summary

See [data-leaks.md](data-leaks.md) for the full matrix. In short:

1. **By design**: behavioral timeline + app list + usage summaries leave the device to
   `tv-api.yourhourapp.com` (parental plane) and Firebase Analytics (287 events incl. PII
   on story submissions); ad networks receive device signals + AD_ID.
2. **By weakness**: unencrypted export/backup, plaintext PIN, unencrypted auth token,
   logcat token/header leakage, `allowBackup` ADB extraction.
3. **By platform**: `QUERY_ALL_PACKAGES` gives the app (and anything compromising it) a
   complete installed-app inventory; accessibility grants let it read third-party app windows.
