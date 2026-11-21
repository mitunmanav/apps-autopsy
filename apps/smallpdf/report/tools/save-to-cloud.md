# Tool: Save to Cloud

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

- Descriptor `q4a.X`: id `"save_to_cloud"`, icon `tool_save_to_cloud`, label `tool_save_to_cloud`, files `1..MAX`, context action `[obs]`.
- Execution `[obs]`: **remote (sync)** — `bp2` SaveToCloud op (`id=`, `selection=`) → upload via `files.smallpdf.com` → `cloud_id`/`sync_status` updated → `DocumentStorageContentSyncWorker` ensures consistency `[inf]`.
- Premium `[inf]`: requires account; possibly pro-only.
- Input→output: local document → cloud-stored document.
