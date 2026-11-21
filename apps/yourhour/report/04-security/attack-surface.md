# Attack Surface

## Exported components (REA `ev_7580c011…f834` — 21 explicit, 13 unprotected)

| Component | Permission guard | Risk |
|---|---|---|
| `SplashActivity` | **none** | LAUNCHER + `mobilepe://shortcut/*` deep links — params parsed in obfuscated code, input validation unverified |
| `UsageTimerService` | **none** | any app can start/bind the tracking FGS — wasteful; startable from outside at will |
| `RefreshUsageDataReceiver` | **none** | any app can forge a usage-refresh broadcast |
| `BootCompletedReceiver` | none | system action, but forgeable by any app (spurious re-init — low impact) |
| `UnlockWidgetProvider` / `TodayUsageWidgetProvider` / `DailySummaryWidgetProvider` | none | normal for appwidget hosts; also receive non-system widget intents |
| `DefaultAlias` / `AlternateAlias` | none | launcher icon swap |
| `CustomTabActivity` (Facebook), `CropImageActivity` (cropper) | **none** | third-party exported — UI/data-flow surface callable cross-app |
| `GenericIdpActivity`, `RecaptchaActivity` (Firebase auth) | none | `genericidp://firebase.auth/` deep link — auth-flow surface |
| `ReelDetectorAccessibilityService` | `BIND_ACCESSIBILITY_SERVICE` | system-bound — safe |
| `YourHourAdminReceiver` | `BIND_DEVICE_ADMIN` | system-bound; policies.xml empty anyway |
| `GlanceRemoteViewsService` | `BIND_REMOTEVIEWS` | widget-bound — safe |
| `SystemJobService` | `BIND_JOB_SERVICE` | framework-bound — safe |
| `FirebaseInstanceIdReceiver` | `c2dm.SEND` | Google-signed only — safe |
| `RevocationBoundService` | GMS `REVOCATION_NOTIFICATION` | Google-signed only — safe |
| `DiagnosticsReceiver`, `ProfileInstallReceiver` | `android.permission.DUMP` | signature-level — safe |
| `ParentalSettingActivity`, `EnterPinActivity`, `SetPinActivity`, `ChangePinActivity`, `ForgetPinActivity`, `ParentalControlActivity`, `NotificationReceiver`, `WidgetSystemReceiver`, `SocialMediaOverlayService`, `DailyReportJobService`, `MyJobService`, `MyPackageReplacedReceiver` | `exported=false` | internal-only (correction: ParentalSetting + WidgetSystemReceiver are NOT exported) |
| Internal receivers | — | custom signature-level `DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` + `exported=false` — good |

## Deep links & intents

- `mobilepe://shortcut/{daily_report, reel_blocker, write_ceo, share}` via `shortcurts.xml`
  → SplashActivity. Parsing code is obfuscated — input validation **unverified**.
- `arg_url` → BlogActivity WebView (JS enabled) — internal-only but shows the pattern.
- Parental intents carry `extra_request_token`, `extra_device_name`, `extra_requested_at`.

## WebView surface (Med)

`setJavaScriptEnabled(true)` found in several classes (`c2a:32`, `hsa:40`, `q3:1002`,
`un0`, `u2a`); `s84:185` does `loadUrl("javascript: " + str)`; `oaa:498` adds a JS
interface `gmaSdk` (Google Mobile Ads). Some are ad-SDK webviews (expected), but any
app-owned webview loading remote or intent-supplied content with JS enabled expands
script-injection surface.

## Dynamic code loading (Info)

- Meta Audience Network ships as **DEX inside `assets/audience_network/`** — loaded at
  runtime (typical FAN packaging; still an executable-content asset).
- pairip uses `usesNonSdkApi` + reflection — integrity wrapper, not a vuln itself.

## Broadest permissions (impact if compromised)

`QUERY_ALL_PACKAGES` · accessibility (window content) · `SYSTEM_ALERT_WINDOW` ·
`PACKAGE_USAGE_STATS` · `GET_TASKS`/`KILL_BACKGROUND_PROCESSES`/`REORDER_TASKS` ·
`READ_PHONE_STATE` · storage (`requestLegacyExternalStorage`) · notifications ·
`FOREGROUND_SERVICE_SPECIAL_USE` · `BIND_DEVICE_ADMIN` (empty policies) ·
`REQUEST_IGNORE_BATTERY_OPTIMIZATIONS` · Android Ad Services + `AD_ID`.

A trojanized build of this app is effectively spyware-capable — the permission set alone
can read other apps' screens and inventory. Distribution is Play-signed + pairip, which
constrains this to sideload/mod scenarios.

## Providers

FileProvider (`provider_paths.xml`) grants **root-level paths**: `external-path "."`,
`cache-path "."`, `external-cache-path "."`, `files-path "."` — a content URI can be minted
for *any* file in app-private and external storage. Cropper provider
(`library_file_paths.xml`) is narrower (`cropper-internal/` + external `/` + cache `.`).
Exploitation needs a granted share intent (or a share-target confusion bug), but the
grant surface is maximal — an over-permissive pattern vs scoped per-directory paths.
