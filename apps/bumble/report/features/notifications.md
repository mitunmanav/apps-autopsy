# Feature: Notifications & Push

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

## Channels [obs]
- FCM: `FirebaseMessagingService` subclass + `FirebaseInstanceIdReceiver` (`com.google.android.c2dm.permission.RECEIVE` per manifest)
- Stream Chat push delegate for message notifications
- `SSEApi` v2 (`sseV2GetStream`) channel for in-app live events
- `NotificationsApi` + `ModalNotificationsApi` B4F services (in-app/modal surfaces)

## UX elements [obs]
- `USE_FULL_SCREEN_INTENT` + `DISABLE_KEYGUARD` — incoming calls ring over lockscreen
- OEM badge permissions (~15 badge-related `uses-permission`s declared — see permissions.md) → unread counts on launcher icons
- `POST_NOTIFICATIONS`, `VIBRATE`, `WAKE_LOCK`
- `NOTIFICATION_BADGE_TYPE_INCOGNITO` string — an incognito badge-type exists; behavior (suppression vs icon variant) [inf]

## Param model [obs]
- Notification types in strings (match, message, like, promo, modal), Braze push/in-app messages (`braze-html-bridge.js` rendered IAM)

## Execution path [inf]
- Server event → FCM/SSE → local notification or deep-link into `landto` router → target screen; badge counters via DataStore shared counter + OEM APIs

## Premium/offline
- Free; push and modals require connectivity + session.

## Plumbing [obs]
- `push.ipc.{MainProcess,LightProcess}MessengerService` — push handling split across main/`:light` processes with IPC messengers
- `NotificationUrlLoader*` services, delete/dismiss/flush receivers — notification lifecycle is component-managed

## Input → output
- In: server events + Braze campaigns → Out: system notifications, badges, in-app modals, deep-link routes.
