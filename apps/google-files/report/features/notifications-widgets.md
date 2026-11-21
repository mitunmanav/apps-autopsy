# Feature: Notifications, QS tile, shortcuts & deep links

## Notifications

- `POST_NOTIFICATIONS` + notification channels (channel-id strings in
  resources; media channel for `AudioService`, cleanup/share/update channels).
- **GNP** registration in `HomeActivity.onCreate`; entrypoint receivers
  `AccountChanged/LocaleChanged/Restart/TimezoneChanged/UpdateReceiver`
  (`libraries.notifications.platform.entrypoints.*`); `kru`
  `proxy_notification_initialized` delegates config to GMS.
- `notifications.receiver.ClearAllNotificationsOnAppUpdateReceiver` —
  clears stale notifications on app update.
- `FilesFirebaseMessagingService` for server pushes (promo/update/backup
  nudges) + `firebase.messaging.default_notification_icon` meta-data.

## Quick Settings tile

- `StorageAssistantTileService` — QS tile: storage status at a glance,
  tap → `ManageSpace`/cleanup entry.

## Shortcuts & deep links

- Launcher shortcuts + `fbg-app` deep-link scheme (+ `https` hosts
  `files.google.com`, `filesgo.google.com`, `com.google.android.apps.nbu.files`);
  `gateway.deeplink.FilesGoDeepLink` + gateway handlers normalize external
  routes into internal screens (search, safe folder, downloads, storage
  breakdown).

## Evidence

Manifest components (tile service, gateways, messaging service), `kru` GNP
strings, shortcut/deep-link resources.

## Unknowns

- Complete channel list + importance levels (some channels created at runtime).
- Whether QS tile shows live bytes or a static entry (likely refresh-on-tap).
