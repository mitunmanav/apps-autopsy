# 26 — Import / Export & Backup

## `ExportDataActivity` (`export_data`)

- `CREATE_DOCUMENT` SAF flow; default name `yourhour.db`; MIME `*/*`; fallback toast
  "No file manager found on this device to save the file."
- Export formats: **full Room DB** (`yourhour.db`) and **XLS** usage spreadsheets.
- `export_file_uri` + `android.intent.action.VIEW` to share the result.
- **Google Drive upload**: scope `https://www.googleapis.com/auth/drive.metadata.readonly`
  + "two different server client ids provided" (Google sign-in config) — Drive-appdata backup.
- Premium-gated (`settings_premium_export_data_selected` at hub).

## `ImportDataActivity` (`import_data`)

- `OPEN_DOCUMENT`/`OPENABLE` picker (`*/*`), "No file manager found on this device to open files."
- Reads `/backups` + `/yourhour.db` (local paths and server `backups` endpoint for cloud restore),
  `Path:` logging; restores Room contents.

## Server side

`backups` + `delete` endpoints — cloud backup tied to account (same auth as parental).

## Notes

- `allowBackup`/`fullBackupOnly` also permit platform backup of the whole sandbox.
- DB export is unencrypted SQLite — full usage history readable offline.
