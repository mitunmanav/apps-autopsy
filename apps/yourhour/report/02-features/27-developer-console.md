# 27 — Developer Console & Debug Surface

## `DeveloperConsoleActivity` (home/devConsole)

- Internal QA screen; token `pro_member_pro` (simulate premium entitlement).
- Presumably hidden behind a gesture/version-tap; no exported intent filter.

## `BadgeTestingActivity` (home/devConsole)

- `badge_test_pref` + `badge_testing_mode` — force-award any badge for UI testing,
  bypassing `badge_history` rules.

## Debug instrumentation

- `u83` registry: global uncaught-exception → Crashlytics + a structured debug-event sink
  (`bs1.e(pq1(timestamp, uptimeDiff, "msg", flags))`) — lines like "Refresh Usage job executing".
- Verbose `Log.e/…` calls in services ("ReelDetector", "BootCompletedReceiver error:",
  "ServiceHeartbeatWatchdogWorker error:", "Failed to show instant overlay:").
- OkHttp **BASIC** logging (headers) on the API client.
- jadx `JADX INFO: loaded from: classes.dex` shows standard release dex — debug flag off in manifest.

## Beta / feedback surface

- Beta-program join link + `native_onboarding_viewed` (strings).
- `force_update_analytics` pending-state prefs for update funnel QA.
