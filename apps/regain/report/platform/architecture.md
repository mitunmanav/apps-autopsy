# Architecture

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`

## Stack (OBS)

- **Language/UI:** Kotlin + Jetpack Compose throughout (screens are Compose; overlay activities host `ComposeView`/`C4455g0` wrappers). Some legacy `Activity` shells; Airbnb **Showkase** present (`showkase.ui.ShowkaseBrowserActivity`) for a Compose component gallery (INF: dev/design-system showcase, `ai.regainapp.showcase.*`).
- **Async:** Kotlin coroutines + flows everywhere (`Sw.*` dispatcher aliases, `ww.e` continuations); `Sw.z` service scopes.
- **DI:** manual service-locator on `MyApplication` — dozens of injected use-case singletons exposed via `getXxxUseCases()`/`setXxx` (OBS: fields `getFocusTimerUseCases`, `getBlockWebsiteUseCases`, `getZenModeUseCases`, `getProductiveModeUseCases`, `getAppUsageStatsUseCases`, `getNotificationBatchingUseCases`, `getPermissionUseCases`, `getMonitorServiceUseCases`, `getC68PendingAlarmGuard`, `getDistractingAppsUseCases`, `getBlockFeatureUseCases`, etc.). Components extend obfuscated base classes (`H`, `I`, `L`) that perform injection.
- **Clean-ish modules:** every `feature_*` package = `data.data_source` (Room + DAOs), `data.remote` (Retrofit DTOs), `domain.model` (entities, versioned `V7…V34` schema-evolution classes), `domain.use_case` (heavily R8-obfuscated single-letter names), `presentation.*` (Compose screens/bottomsheets/workers). Versioned models (e.g. `FocusTimerConfigV9→V34`, `FocusTimerSessionV7→V34`, `AppLimitV10→V12`, `ZenModeConfigV7`, `FeatureStatusV11`) show long-running schema migration history.
- **Persistence:** Room (`*_Database`/`_Impl`) — 17+ databases (see `persistence.md`); SharedPreferences incl. `secure_prefs` excluded from backup; WorkManager for all background jobs (36 `ai.blox100.workers.*` + per-feature workers).
- **Networking:** Retrofit + OkHttp + Gson (`@SerializedName`) → `api.regainapp.ai`; kotlinx.serialization also present. Coil/Coil3 for images, ExoPlayer (Media3) for video, Lottie + Rive for animation, Glance for widgets.
- **Navigation:** deep-link router — Compose destinations addressed by `link.regainapp.ai/<path>` URLs with typed query params (165 routes extracted; see `navigation-map.md`). `NavigationReceiver` broadcast + `sendUpdateBroadcast` drive internal navigation.
- **Analytics:** self-hosted **Jitsu** (`jitsuStaging`, event enum `EnumC3608a`, `analytics.regainapp.ai`), **Mixpanel** references (`logHeartBeatInMixPanel`, `LastLoggedInMixPanelBS`), Firebase Analytics/Crashlytics/Perf/RemoteConfig, **OpenTelemetry** (`otel.regainapp.ai/v1/traces`, deployment.environment staging|production, embedded API-key string), Facebook SDK events, `logback`/`slf4j` file logging (assets/logback.xml), `feature_network_logs` DB.

## Two-namespace app (OBS)

`ai.blox100.*` = the full product (a reusable "blox" codebase — component names, feature packages, all screens). `ai.regainapp.*` = thin brand shell: `R`, `showcase.MainActivity`/`CustomBrowserActivity`, `payments.*` (CheckoutActivity, PaymentsFileProvider, order/subscription models), `cache.ResponseCacheDatabase`. INF: same codebase probably builds other branded apps.

## Boot flow (OBS, `MyApplication.onCreate`)

logback → c68 experience init → app-instance-ID roll (`appInstanceIdHelper`) → Jitsu identify (one-time `IS_JITSU_USER_IDENTIFIED_DUAL_WRITE_V1`) → FirebaseRemoteConfig defaults+fetch (`REMOTE_CONFIG_FETCH_INTERVAL_IN_SECS`) → uncaught-exception → Jitsu crash reporter → DI graph warmup. Each step emits a `time_taken_ms` analytics event.

## Obfuscation (OBS)

R8: app `feature_*`/`data`/`domain.model` keep names (`@Keep` + Gson); `domain.use_case`, DI, overlay-window, and monitor internals → letter/short names (`z3`, `f41174q1`, `Sw.C`). `resources.arsc`/layouts obfuscated. No control-flow/string-encryption packer observed; logback + `BuildConfig`-style flags left readable.

## Process/threading (OBS)

Coroutines on `Dispatchers` aliases + coroutine scopes per service; WorkManager (SystemForegroundService/SystemJobService/SystemAlarmService/RescheduleReceiver + Constraint proxies); foreground services: `MyMonitorService`, `C68AlarmService`(mediaPlayback), `FocusTimerNotificationService`, `MediaPlayerService`, 3 floating-bubble services, `RestoreBackupService`; `taskAffinity=ai.regainapp.c68alarm`, `excludeFromRecents`, `showWhenLocked` on the alarm activity.
