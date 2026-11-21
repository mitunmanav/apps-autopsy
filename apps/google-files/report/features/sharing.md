# Feature: Nearby / offline sharing

## Architecture — delegation to Google Play Services

Files does **not** implement the transfer protocol itself. `hro` builds intents
targeting GMS Nearby Share:

- Extras: `com.google.android.gms.nearby.FILE_COUNT`,
  `com.google.android.gms.nearby.SEND_FOLDER`,
  `com.google.android.gms.nearby.SEND_FOLDER_CONTENT_URI`
- Launch targets (`mdp`,`kbz`):
  `com.google.android.gms.nearby.sharing.ShareSheetActivity`,
  `com.google.android.gms.nearby.sharing.ReceiveSurfaceActivity`
- Selection→intent bridge: `hrg`
  (`Unable to prepare the selection set for nearby sharing`),
  folder-share path `kvt` (`Null values … for nearby sharing file`),
  context proto `hro` (`Failed to deserialize the context proto for nearby
  share dialog`).

## Folder sharing provider

`offlinesharing.foldersharing.FolderSharingContentProvider` (manifest) backed
by `kvk`:

```java
Uri.parse("content://com.google.android.apps.nbu.files.offlinesharing.foldersharing.provider")
String[] { "file_uri", "file_dir", "file_mime_type" }
```

A `ContentProvider` serving shared-folder enumeration to the GMS share flow
(so GMS can stream a whole folder's contents).

## Share-sheet result loop

`offlinesharing.receiver.ShareSheetBroadcastReceiver` (peer `lmz`) — action
`…offlinesharing.receiver.INTENT_ACTION_SHARESHEET_CHOOSER_RESULT`
returns the share outcome for logging/UX.

## App P2P install

`com.android.vending.p2p.APP_INSTALL_API` uses-permission — Play P2P app-sharing
install API (share apps device-to-device via Play).

## Maintenance & flags

- Phenotype: `enable_android_file_sharing`,
  `enable_android_file_sharing_data_clean_up`,
  `enable_android_sharing_daily_maintenance` — daily WorkManager job cleans
  share temp state.
- Telemetry: `is_first_nearby_share_logging_attempt` (`ixj`).

## Evidence

Manifest receivers/providers, `hro`/`hrg`/`mdp`/`kbz`/`kvk`/`kvt`/`lmz`/`ixj`,
GMS intent-const strings. No `quickshare`-named classes (Nearby Share branding
predates Quick Share rename in this build).

## Unknowns

- Whether Files still ships a standalone receiver when GMS is absent — the
  launch is an explicit package intent; fallback behavior unresolved.
- Actual protocol (BLE/WiFi-Direct) is GMS internals, not in this APK.
