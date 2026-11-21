# Sign-in, Backup & Account

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Module:** `feature_user_signin` · **Evidence:** OBS

## What it is
Google sign-in, JWT session, multi-device account, cloud backup/restore/migrate/delete, device list, account deletion.

## UI entry (OBS)
`signup_screen/{P}?showBackButton=`, `sign_in_bs`, `device_selection`, `backup_options`, `restore_backup`, `reauth_backup`, `backup_restore_dialog`, `migration_backup`, `logout_confirmation_bs`, `user_device_list`, `delete_user_confirmation_bs*`, `first_seen_settings`; `RestoreBackupService` (FGS).

## Params model (OBS)
`UserProfile`, `UserProfileInfo`, `UserMetaData`, `UserDataResponse`, `RefreshToken*`, `DeviceMeta*`/`LinkedDeviceIdsMetaWithStatus`, `BackupAvailabilityResponse`, `BackupRestoreArgs`, `CheckAndMigrateGoogleAccountResponse`, `MigrationResponse`, `UserFirstSeen*`, `UserGoogleInfoPreferencesDto`, `TableChangeEvent` (+`ConvertJsonToTableChangeEvents`).

## Execution path (OBS)
1. `GET /auth/google_sign_in` → JWT + refresh (`/auth/refresh_token`).
2. Backup: `get_backup_meta_data` → `save_backup`/`migrate_backup`/`delete_backup`; `OnDemandBackupWorker`/`BackupDBWorker` serialize `TableChangeEvent`s; `RestoreBackupService` restores post-install.
3. Device: `save_device_meta`/`get_device_meta` → `user_device_list`; `set_user_device_login` referral binding.
4. Lifecycle: `mark_user_deleted`/`mark_user_restored`, `delete_user_data`, `delete_user`; first-seen `save_user_first_seen_version_and_time`; prefs `google-info-preferences`, `update-user-name`, `update_user_time_zone`, `update_user_locale`, `user-satisfied`.

## Premium/offline (OBS)
Network-only.
