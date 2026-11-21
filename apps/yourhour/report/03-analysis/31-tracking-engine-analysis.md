# 31 — How Screen Time Is Tracked (and where it goes wrong)

## The naive way — what most screen-time apps do

`UsageStatsManager.queryUsageStats(BEST, start, end)` returns per-package aggregate buckets.
Apps that just sum `totalTimeInForeground` get it **wrong** in well-known ways:

- Buckets are calendar-interval, not session-true: a session spanning an interval edge is
  split or dropped; midnight/day-start boundaries corrupt totals.
- `timeRange` ≠ actual foreground time (includes paused/background-residual states).
- Events are missed during service death, deep doze, and reboots — naive sums drift.
- Timezone changes, clock changes, reinstalls invalidate baselines silently.
- No reliable "unlock" signal from aggregates.

## What YourHour actually does — an event-replay engine

This app implements the **correct, harder approach**, visible in the `util` package and
`UsageTimerService`:

1. **Raw event stream**: polls `UsageStatsManager.queryEvents` for MOVE_TO_FOREGROUND /
   MOVE_TO_BACKGROUND / activity-resumed/paused events (`UsageEventModel(eventType,
   className, packageName, timeStamp)`).
2. **Session reconstruction**: `UsageEventSessionTracker` builds `OwnerSegment`s
   (package + start + `revived` flag) and `PendingActivityStop`s — a real session state
   machine that handles screen-off preemption, `screenInteractiveAt`, `missingStartupRecovered`.
3. **Reconciliation**: `UsageReplayComponent(expected, baseline, replay)` compares replayed
   sessions against aggregate `queryUsageStats` totals and fixes drift — neither source is
   blindly trusted.
4. **Incremental checkpointing**: `usage_query_checkpoint` table + `UsageQueryState`
   (`replayStart`, `wall`, `elapsed`, `format`, `ownership`, `repair`) so polls resume
   where they stopped instead of re-scanning.
5. **Identity invalidation**: `UsageQueryIdentity(resetDate, dayOffset, timeZone,
   installation, boot)` — a **boot count and timezone are part of the key**, so clock/
   timezone changes and reboots correctly invalidate cached checkpoints (the #1 silent bug
   in naive trackers).
6. **Gap repair**: `UsageHistoryRepair(source, start, target, scan, remaining,
   protectedDays, observed)` back-fills missed periods (service killed/doze) from later
   events, protecting recent days from rewrite.
7. **Unlock counting**: `USER_PRESENT` broadcast + `setLastProcessedUnlockEventTime`
   dedupe — unlocks are real keyguard-dismissal events, not foreground-app heuristics.
8. **Day boundary**: user-configurable **day-start hour** (not midnight); rollover finalizes
   rows under the current `UsageQueryIdentity`.
9. **Digest layer**: `app_digest`/`generated_digest_state` pre-aggregate for reports — UI
   never re-derives history from raw events.
10. **Self-healing ops**: `usage_visit_repair_completed` analytics + heartbeat/watchdog
    restart paths acknowledge that the pipeline *will* miss data and must repair.

## Where it still goes wrong (residual limits)

- **Death-gap floor**: events generated while the service was dead between boot and restart
  are reconstructed but can't recover *why* the phone was used — only that apps were used.
- **Overlay enforcement lag**: polling cadence + Android's event delivery latency means
  auto-lock/mindful-pause fire ~1 poll behind the real violation (throttle constants
  500 ms/1 s seen in the reel path show the tradeoff vs. battery).
- **Reel-blocker is UI-fragile**: view-id/label heuristics per target app silently break on
  partner-app updates — detection coverage is best-effort, and the 1-hour dismiss pass is
  trivially client-side.
- **Usage access is binary**: once granted, the app sees everything incl. system/keyboard
  packages (allowlist exists, but collection precedes filtering).
- **Not real-time accounting**: `time_slice` 30-min granularity for the timeline means
  sub-30-min precision is aggregated away in visualization.
- Static analysis only — actual runtime accuracy on any given OEM build (MIUI/ColorOS
  UsageStats quirks are notorious) is unverified.

## Verdict

YourHour's tracking core is **materially better engineered than the naive aggregate-sum
approach** the category is known for: replay + reconciliation + boot/timezone-keyed
checkpointing + repair is the architecture a correct implementation requires. The residual
weaknesses are the unavoidable ones (service kill on aggressive OEMs, enforcement latency)
plus product-level fragility (reel heuristics), not accounting errors.
