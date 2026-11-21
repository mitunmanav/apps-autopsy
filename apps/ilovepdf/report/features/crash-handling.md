> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e1…ad41`. Static analysis; no runtime evidence.

# Crash handling

## How it works
- `UnhandlerCrashActivity` is the manifest-declared crash dialog (registered
  activity; `crash_handler`, `unhandler_*` strings) — shows a friendly "the
  app crashed" screen with restart/report actions instead of the system
  dialog; wired through `ILovePdfApplication` + `crash.*`/`Thread.UncaughtExceptionHandler` wrappers.
- Firebase Crashlytics (`com.crashlytics.*`, `FirebaseSessions`,
  `SessionLifecycleService` components) captures stack traces + session
  context; `ilovepdflogger` package writes local log files attachable to
  Freshdesk reports.
