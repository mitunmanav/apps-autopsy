# Limitations / Freemium Gating

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

## Mechanism `[obs]`

- `LimitationsService` (interface `sg5`, impl `m82`):
  - `m82.a(u4a tool) → h30` returns the tool's limit descriptor: if `z12.t(rv6).a` (user-can-use-pro flag) → `kg5.k` (unlimited); else `og5.a(tool)` = free-tier limits `[obs]`.
  - `isPremiumTool(tool)` function reference (`t09` bound to `sg5`, owner `gl5`) marks premium tools in the tool-list UI (`yr5(tool, isPremium)`) `[obs]`.
- Remote config: `max_free_tasks` (apktool-decoded `remote_config_defaults.xml`: **default 1**), `scanner_detection_kill_switch` `[obs]`.
- Free-task accounting: remaining-free-task counter read by `FreeTaskAvailableNotificationPoster` before posting "free task available" notifications `[obs]`; decrement site = task-execution path in `qs7`/`dk1` runners `[inf]` (exact decrement call `[partial]`).
- `PaywallActivity` is launched when free quota is exhausted / premium tool tapped `[inf]` (navigation call sites in flow VM + `b5a` screen state).

## Gated surface `[inf]`

- `isPremiumTool` is consulted for every tool rendered in home groups (except excluded `i4a` AddPages) — premium badges per tool `[obs]`; the concrete per-tool boolean table lives inside `og5`/`gl5` impl details `[partial]`.
- `lu7` userType (`free`/`pro`) is sent on every `mu7` task request `[obs]` — server enforces quota independently.

## Notification loop `[obs]`

`FreeTaskAvailableNotificationPoster`: checks `free_task_notifications_enabled` pref → canUsePro → remaining free tasks → POST_NOTIFICATIONS granted → posts action `…local_notifications.NOTIFICATION_ACTION`, extra `free_task`; scheduled as periodic WorkManager (≥15 min floor enforced) with flex ≥5 min, computed delay `jD` from `og5.e()` timing `[obs]`.

## Kill switches `[obs]`

- `scanner_detection_kill_switch` remote flag gates ONNX detection in scanner `[obs]` (consumer `em2`-adjacent `[inf]`).
