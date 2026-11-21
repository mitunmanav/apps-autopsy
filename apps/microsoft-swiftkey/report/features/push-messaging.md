# Push messaging (FCM)

Evidence: `com.touchtype.cloudmessaging.SwiftKeyFirebaseMessagingService` (manifest service, `com.google.firebase.MESSAGING_EVENT`), `com.google.firebase.*` on classpath, `google_app_id`/`gcm_defaultSenderId` strings, `POST_NOTIFICATIONS`, `WAKE_LOCK`.

## Setup

- `SwiftKeyFirebaseMessagingService` extends FCM messaging service; Firebase init via `FirebaseInitProvider`-style provider chain + `google-services`-embedded strings (`google_app_id`, `gcm_defaultSenderId`, `google_api_key`, `firebase_database_url`/`project_id` variants).
- Token refresh → registered with SwiftKey cloud (`sk-connect`/Bing messaging backend presumably) to route pushes per account+device.

## Handled push types (inferred from consumers)

- Cloud clipboard delivery (cross-device copy arrives as push → `NotificationHandlerActivity`/silent sync).
- Bing daily theme refresh notification.
- Re-auth/account notices, marketing/social campaigns, in-app update nudges, experiment/config invalidation (silent data pushes that wake `SyncService`/`BiBo` refresh).

## Delivery path

Message → service → either silent data handling (sync triggers) or user-visible notification (`NotificationHandlerActivity` for taps, `NotificationDeleteIntentService` for dismiss metrics).

## Limits

Server decides what is actually pushed; channel ids/payload schemas not in resources — client plumbing only.
