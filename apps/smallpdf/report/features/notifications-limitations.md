# Feature: Notifications & Free-Task Limitations

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

- `LimitationsService` `[obs]` = interface `sg5`, impl `m82`; per-tool limit `a(u4a)→h30`; `isPremiumTool(u4a)→bool` drives premium badges (`yr5`) and gating.
- Free quota `[obs]`: remote config `max_free_tasks` (default 1); user type `lu7` free/pro sent on every task; pro unlock → `kg5.k` unlimited.
- Re-engagement `[obs]`: `FreeTaskAvailableNotificationPoster` worker — gated by `free_task_notifications_enabled` pref + POST_NOTIFICATIONS + remaining-free-tasks>0 + !canUsePro; periodic work (≥15 min enforced by `zz6`/`cwa` builder, flex ≥5 min), action `…local_notifications.NOTIFICATION_ACTION`, extra `free_task`.
- `[partial]`: where the counter decrements (task-runner `qs7`/`dk1` path `[inf]`); exact `h30` limit descriptors per tool `[unk]`.
