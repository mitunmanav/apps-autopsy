# Persistence

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

## Room `[obs]`

`DocumentsDatabase` (`…storage.database.DocumentsDatabase_Impl`, open-helper `ls2`) — a single app table plus WorkManager tables created in the same DB file:

```sql
CREATE TABLE IF NOT EXISTS `documents` (
  `id` TEXT NOT NULL PRIMARY KEY,
  `cloud_id` TEXT,
  `document_name` TEXT NOT NULL,
  `document_type` TEXT NOT NULL,
  `size` INTEGER NOT NULL,
  `created_at` INTEGER NOT NULL,
  `updated_at` INTEGER,
  `sync_status` TEXT NOT NULL,
  `location` TEXT NOT NULL,
  `local_path` TEXT)
```

- DAO `al5`: `INSERT OR REPLACE` upserts observed; entity fields map to `jm2` document model `[obs]`.
- `sync_status`/`location`/`cloud_id`/`local_path` → local-vs-cloud document record `[inf]`.
- WorkManager tables (`WorkSpec`, `Dependency`, `WorkTag`, `WorkName`, `WorkProgress`, `SystemIdInfo`, `Preference`) coexist in the same open-helper `[obs]` — documents + work state share the `documents` DB file `[inf]`.

## DataStore / SharedPreferences `[obs]`

- `rv6` user-state prefs (pro/free flag `z12.t(rv6).a` consulted by `m82.a(tool)`).
- `free_task_notifications_enabled` boolean pref; free-task counters bounded by remote config `max_free_tasks` (`pg5` `x47.j("max_free_tasks", true)`) `[obs]`.
- `pva` WorkManager facade (`b(name)` cancels named unique work).

## Content/file storage `[obs]`

- `DocumentsContentProvider` authority `com.smallpdf.app.android.storageprovider.documents` (exported) serves stored documents to other apps/SAF.
- Internal `FileProvider` for share/export URIs.
- Local files under app-private dirs (paths constructed dynamically — exact roots `[unk]`); `local_path` column stores resolved file location.

## Workers `[obs]`

| Worker | Purpose `[inf]` |
|---|---|
| `DocumentStorageContentSyncWorker` | Upload/sync document contents to cloud storage |
| `DocumentStorageDeleteWorker` | Propagate deletes |
| `DocumentStorageRenameWorker` | Propagate renames |
| `RedshiftEventSenderWorker` | Batch analytics event upload (Redshift pipeline) |
| `AcknowledgeAccountSubscriptionWorker` | Server-acknowledge Billing purchases |
| `FreeTaskAvailableNotificationPoster` | Periodic re-engagement when free tasks replenish |

## Backup `[obs]`

- `fullBackupContent`/`dataExtractionRules` = AppsFlyer rules XML — app data largely excluded/restricted (exact rule set decoded: allowlist approach) `[obs]`.
