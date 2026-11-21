# Notifications & social features

Evidence: `com.touchtype.social.*`, `NotificationHandlerActivity`, `NotificationDeleteIntentService`, `LockScreenWatcher`, `POST_NOTIFICATIONS` perm, `notification_*`/`social_*` strings, FCM service.

## Notification plumbing

- `SwiftKeyFirebaseMessagingService` — FCM entry; channels route into `NotificationHandlerActivity` (tap → deep link) and `NotificationDeleteIntentService` (dismiss tracking → telemetry).
- `POST_NOTIFICATIONS` (Android 13+) requested; prompt folded into onboarding.
- `LockScreenWatcher` — observes lock-screen state (notification visibility/suppress logic).

## Notification topics observed

- Bing daily theme refresh ("New Bing Image of the Day", opt-in via `bing_theme_notify_me`).
- Cloud clipboard items arriving from other devices.
- Sync/account warnings (re-auth needed).
- Marketing/social nudges via `com.touchtype.social.*` — share prompts, streak/engagement copy, referral-type content.
- In-app update prompts (see `in-app-updates.md`).

## Social share-outs

Achievement cards, theme sharing, **typing heatmap** (`container_stat_heatmap_share`), "tell a friend" and Bing image info share — all via Android share sheet.

Official social presences hardcoded: `fb://page/139252036175050` / `facebook.com/swiftkey`, `twitter.com/swiftkey`; support `https://support.microsoft.com/swiftkey`.

## Status

Which pushes are actually sent is server-side; the client only proves the plumbing.
