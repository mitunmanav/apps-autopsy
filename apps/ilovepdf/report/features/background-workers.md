> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Background execution

## How it works
- `ForegroundToolExecutionService`/`ToolExecutionService`
  (`foregroundServiceType=dataSync`, `FOREGROUND_SERVICE_DATA_SYNC` perm) run
  tool tasks w/ `NotificationHandler` progress notifications
  (`notification_tool`, `progressbar`), results broadcast via `ToolTaskReceiver`.
- WorkManager: `IndexFilesWorker` (file index), `RecentFilesWorker`
  (`worker_factory`/`workers` packages) scheduled from `ILovePdfApplication`.
- Cloud services + `CloudUploadStateReceiver` + `SystemReceiver`/`AlarmReceiver`
  (`RECEIVE_BOOT_COMPLETED`) resume queued uploads/downloads.
- `ImageUploadService` handles companion-scanner uploads; `NotificationActionReceiver` handles notification actions (open result/share/delete).
