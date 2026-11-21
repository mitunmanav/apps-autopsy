# Architecture

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

## Obfuscation & code layout `[obs]`

- R8/ProGuard full obfuscation: ~36 named `com.smallpdf.app.android.*` classes (manifest-pinned components, Room DB, workers with manifest/work-name references, auth errors) survive; ~11,880 descriptors live under `defpackage` with 2-4 char names.
- Kotlin everywhere; Compose UI (`androidx.compose.*` usage throughout named activities, `fh1`/`l5b` composable factories).
- `classes2.dex` is a small 4.7 KB desugar/pairip stub `[obs]`; logic split across `classes.dex` (9.2 MB) + `classes3.dex` (5.8 MB) `[obs]`.

## Application bootstrap `[obs/inf]`

- Manifest `android:name="com.pairip.application.Application"` — Google **Pairip** app-integrity wrapper loads before app code; the true app class `com.smallpdf.app.android.App` `[obs]` performs DI + SDK init. Pairip's protected loading makes init order partially `[unk]` statically.
- `androidx.startup.InitializationProvider` chains initializers (WorkManager, Firebase, etc.) `[inf]`.

## Layering `[inf]` (from decompiled structure)

| Layer | Evidence |
|---|---|
| UI (Compose) | Activities + `fh1` composable lambdas; `ToolFlowActivity`, `HomeActivity`, `PaywallActivity`, editor/scanner screens |
| Flow ops (command objects) | `gp2` sealed base with concrete ops: `vo2` Import, `oo2` Convert, `po2` Delete, `xo2` Rename, `yo2` ReplaceContent, `fp2` Share, `ep2` SaveToDevice, `bp2` SaveToCloud, `no2`/`wo2` compress/params `[obs]` |
| Tool registry | `v4a` Parcelable base → `u4a` tool descriptors (27) → `e4a` groups (7); registry sets exposed as `v4a.d/e/i/v` lazy sets `[obs]` |
| Domain services | `sg5`/`m82` LimitationsService, `b72` remote-tasks repository, `cl5` file/source model (`as2/hr2/ur2/pr2` = word/excel/ppt/image), repositories behind `ua2`, `og5`, `in5` `[obs]` |
| Network | Retrofit `nu7` (tasks) + OkHttp/ktor clients; models `mu7` request, `ws7`/`ts7` responses, `ns7` file ref, `xt7` options `[obs]` |
| Persistence | Room `DocumentsDatabase` (table `documents`, DAO `al5`), DataStore prefs (`rv6`, `pva`), WorkManager workers `[obs]` |
| Native | PDFTron `PDFNet`/`libPDFNetC`, ORT `ai.onnxruntime` + `onnxruntime4j_jni`, CameraX `image_processing_util_jni`, `surface_util_jni`, `androidx.graphics.path`, `datastore_shared_counter` `[obs]` |

## Dependency injection `[inf]`

- Factory/DI classes wire Retrofit services per host and repositories (e.g., `b72` takes `nu7` + upload client + user-type provider `dk1`). Pattern matches Koin/Dagger-generated factories; the exact DI framework identity is `[unk]` statically (annotations stripped).

## Execution model `[obs]`

- Coroutines throughout (`Continuation`, `d0b` dispatchers, `wj.L` launches); `qs7`/`dk1`/`cr1` are the task-runner pipeline for remote ops.
- WorkManager workers: `DocumentStorageContentSyncWorker`, `…DeleteWorker`, `…RenameWorker`, `RedshiftEventSenderWorker`, `AcknowledgeAccountSubscriptionWorker`, `FreeTaskAvailableNotificationPoster` `[obs]`.

## Known gaps

- `project_android_application_graph` was not run before report freeze → whole-app call graph is `[unk]`; per-path evidence used instead.
- Pairip-protected init and any reflection/registration-only call sites are `[unk]`.
