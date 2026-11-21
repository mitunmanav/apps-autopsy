# Core: Application, DI, Analytics

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Covers modules:** `ai.blox100.MyApplication`, `core`, `core_analytics`, `data`, `network`, `notification_service`, `util`, `share_message` infra · **Evidence:** `ev_874183c3…` (MyApplication), decompile OBS

## MyApplication (OBS)
`MyApplication extends G implements InterfaceC0086a, u` — the DI root + manual service-locator. `onCreate()` sequence (verified decompile):
1. `BasicLogcatConfigurator.configureDefaultContext()` (logback→logcat/file)
2. `c68Experience.c()` — alarm module first
3. `ot.f.g(this)` — app-instance-ID helper → `appInstanceIdHelper.a()` yields `(new_id, old_id)` pair
4. Jitsu identify (`jitsuStaging.c(id)`) once, gated by `IS_JITSU_USER_IDENTIFIED_DUAL_WRITE_V1` SharedPref
5. FirebaseRemoteConfig: XML defaults (res `2132148242`) + fetch-interval `REMOTE_CONFIG_FETCH_INTERVAL_IN_SECS` + `activate()`
6. `LoggerFactory` (slf4j) → default uncaught-exception handler → serializes `{class, message, thread, stack≤4000}` → Jitsu
7. Every step emits `logAnalyticsEvent(EnumC3608a.*, {time_taken_ms…})`
DI getters (OBS): `a()`→`p117ep.t`, `d()`→`E.C0326d`, `e()`→focus_timer `use_case.V`, `f()`→`p397r0.r` logAnalyticsEvent, `g()`→`r0.u` logUserProperty, `i()`→`p397r0? C1188x`, `j()`→event logger; ~30 injected use-case fields (`f37197Y`…`f37226y0`).

## `core` / `core_analytics` / `util` (OBS)
Base classes `H`/`I`/`L` (component+injection bases), `AbstractC2667f0` service base, coroutine scopes `C.c(o0.v(C.f(), M.a))`; analytics event enum `EnumC3608a` (hundreds of `f60xxx` event ids) + `EnumC3664i` (user-property ids); `logback.xml` file-appender config; crash/log pipelines.

## `network` (OBS)
Retrofit factory providers `p509w.a`, `U0.a` (baseUrl `api.regainapp.ai`; second client `puraa.regainapp.ai` CDN); OkHttp interceptors + auth token store; `ResponseCacheDatabase` (ai.regainapp.cache) for offline responses; network-logs Room + `UploadLogWorker`→`/send_feedback/logs`; `AnalyticsScreenshotPreviewActivity`+`/event_screenshots` for telemetry screenshots.

## `data` (OBS)
`BloxDatabase` master Room DB + cross-feature DAOs; SharedPref wrappers (`K0.a()`, `secure_prefs`), DataStore/protobuf, model mappers, migration helpers (V7→V34 chains).

## `notification_service` (OBS)
`NotificationListener extends NotificationListenerService` — scope `Sw.z`, injected `logAnalyticsEvent`, `notificationBatchingUseCases`, `permissionUseCases`, `shouldBlockNotificationForFocus`, `suppressC68Notification`; `onListenerConnected`/`onNotificationPosted`/`onNotificationRemoved` async; `onDestroy` cancels scope.

## share_message infra (OBS)
`M0.a` → `POST /app_share/generate_message`; `ShareReceiver`/`ShareDismissReceiver` broadcasts; `regain_share_cards` cache dir.
