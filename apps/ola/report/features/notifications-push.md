# Feature Module: Notifications & Push (Connect) — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

## Channels (obs)
| Channel | Components |
|---|---|
| FCM | `FirebaseMessagingService` (default-export), `FirebaseInstanceIdReceiver` (exported, `c2dm.permission.SEND`), `OlaInstanceIDListenerService`, `ConnectGcmListenerService` (default-export) |
| MiPush | `XMPushService`/`XMJobService` (`:pushservice`), `PushMessageHandler` (MIPUSH_RECEIVE perm), `NotificationClickedActivity`, `MIPushProvider`, `NetworkStatusReceiver`, `PingReceiver`; app key `5181756299289` |
| MoEngage | `MoEActivity`, `MoEPushReceiver`, `MoERichPush*`, `PushTracker`, `PushClickDialogTracker`, `MoEPushWorker`, `MiPushReceiver` (bridge), RTT services (`RttIntentService`, `RttReceiver`, `RttSyncJob`) |
| App inbox | `com.olacabs.connect.inbox.InboxEntity` (Room: 2 String + 2 Long + String, ev_c80a0e53…), `ConnectNotificationActionReceiver`, `TTLBroadcastReceiver` |

## Pipeline (inf, bounded)
FCM/MiPush payload → Connect listener services → notification posted (`POST_NOTIFICATIONS`) → `InboxEntity` row persisted (title/body/timestamps inf) → tap routes via `ConnectNotificationActionReceiver`/`NotificationClickedActivity` → `TTLBroadcastReceiver` handles expiry.

## Config (obs)
Firebase RTDB `olacabs-gcm.firebaseio.com`, storage `olacabs-gcm.appspot.com`; MoEngage `9OWELA5U9CHR1O1MCZWRCF55`; POST_NOTIFICATIONS + badge perms.

## Unknowns
- Payload schema/routing keys, inbox sync endpoint, per-channel selection logic (MiPush vs FCM likely region-based, inf).
- Rich-push image/action handling details.
