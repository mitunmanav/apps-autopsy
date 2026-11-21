# Feature: Document Storage & Sync

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

- Room `documents` table `[obs]` (10 cols: id, cloud_id, document_name, document_type, size, created_at, updated_at, sync_status, location, local_path) + DAO `al5` upserts.
- `DocumentsContentProvider` `[obs]` (exported, `…storageprovider.documents`) — serves docs to SAF/other apps; `FileProvider` for share URIs.
- Sync workers `[obs]`: `ContentSyncWorker`, `DeleteWorker`, `RenameWorker` reconcile `sync_status`/`cloud_id` against `files.smallpdf.com`/`filestorage.smallpdf.com` `[inf]` (R2 object store paths `/v1/r2/files/`, `/v2/files/r2/`).
- Import/export ops `[obs]`: `vo2` Import, `ep2` SaveToDevice, `bp2` SaveToCloud, `yo2` ReplaceContent.
- Filesystem layout `[partial]`: private dirs resolved at runtime; `local_path` persisted per row.
