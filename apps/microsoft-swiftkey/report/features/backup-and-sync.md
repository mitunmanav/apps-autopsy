# Backup & sync

Evidence: `com.touchtype.cloud.sync.SyncService` (manifest service), `SyncScheduledJob`, `com.swiftkey.webservices.accessstack.*`, `assets/appconfig/backup_and_sync/behaviour/models/backup_and_sync_behaviour.json`, `pref_account_*` strings, OneDrive `onedrive_*` strings, sign-in carousel.

## What syncs (per strings + service names)

- **Typing data / language model** — "typing & word predictions" sync (personal dictionary + stats).
- **Cloud clipboard** — see `cloud-clipboard.md`.
- **Account/preferences** — settings carried between devices [inferred from account sections].

## Architecture

- `SyncService` + `SyncScheduledJob` — sync runs in a service plus scheduled jobs (JobScheduler); periodic, network-state-aware (`ACCESS_NETWORK_STATE`, `WAKE_LOCK` perms).
- `backup_and_sync_behaviour.json` appconfig — server-tunable sync behavior.
- Endpoints: `https://sk-connect.api.swiftkey.com/api/` (SwiftKey connect API), `https://clip.api.swiftkey.com` (clipboard), `https://bibo.api.swiftkey.com` (model/config delivery).

## OneDrive backups

- `pref_account_onedrive_*` — "Back up now", "Backed up %1$s", **Wi-Fi-only** toggle; OneDrive `onedrive_*` strings + Rewards migration offer (1,000 pts for enabling OneDrive backup — see `achievements-rewards.md`).
- Backup file lands in the user's OneDrive; restore path used by reinstall/new-device flows [inferred].

## Account migration

`accessstack.accountmanagement` — `StartAsyncMigration`/`CheckAsyncMigrationStatus`/`RequestMigrationIdResponse`/`AccountMigrationError`/`SetMarketingPreference`: legacy SwiftKey-account → Microsoft-account migration with async status polling and marketing-consent capture.

## Failure/UX

Re-auth banner when tokens expire; "device no longer connected" error; delete-data-only vs delete-account options (see `microsoft-account.md`).
