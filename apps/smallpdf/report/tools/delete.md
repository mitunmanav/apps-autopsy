# Tool: Delete (document action)

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

- Descriptor `a4a.X`: id `"delete"`, icon `tool_delete`, label `tool_delete`, files `1..MAX`, ungrouped context action `[obs]`.
- Execution `[obs]`: **local** — `po2` Delete op (`documents=`, `id=`) removes local records/files; `DocumentStorageDeleteWorker` propagates to cloud when synced `[obs]`.
- Premium: no `[inf]`.
- Input→output: document(s) → removed from library (+ remote deletion).
