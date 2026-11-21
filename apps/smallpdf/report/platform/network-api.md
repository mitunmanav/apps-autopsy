# Network & API Surface

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`. Hosts `[obs]` from string resources/decompiled constants; call wiring `[obs]` from `nu7`/`b72`/`zl`.

## Hosts `[obs]`

| Host | Role `[inf]` |
|---|---|
| `task.smallpdf.com` | Task API (`nu7`) |
| `files.smallpdf.com` → `/v1/r2/files/` | Upload staging (R2-backed) |
| `filestorage.smallpdf.com` → `/v2/files/r2/` | Stored-file fetch/download |
| `keycloak.smallpdf.com` | OIDC issuer (auth tokens) |
| `analytics.smallpdf.com` | First-party analytics (Redshift pipeline) |
| `smallpdf-ee0cd.firebaseio.com`, `…appspot.com` | Firebase DB/storage config |
| `smallpdf-mobile.onelink.me` | AppsFlyer deep links |
| `smallpdf.com` | App-link domain (autoVerify) |

## Task API `[obs]` — `defpackage.nu7` (Retrofit-style)

```java
@POST("/v1/tasks/external")        ws7 a(mu7 request);      // create external task
@GET ("/v1/tasks/{taskId}")        ts7 b(String taskId);    // poll task status
```

- Request `mu7` fields `[obs]`: `id` (UUID), `type` (`ju7`), `files` (`List<ns7>` file tokens), `options` (`nt7`/`xt7`/`hu7` union), `priority` int, `parentTaskId?`, `userType` (`lu7` free/pro), `timeout` (`400` seen for compress), platform/version metadata.
- Response `ws7` → `taskId`; poll `ts7` → status + output file refs (`bt7` outputs list).
- `dt7` is the model assembler (`mu7(...)` factory incl. `hu7Var` options and string fields `strO`).

### `ju7` Task.Type — 28 `[obs]`

`COMPRESS MERGE DELETE SPLIT SPLIT_BURST ROTATE PDF_TO_JPG JPG_TO_PDF THUMBNAIL UNLOCK PROTECT ZIP NOOP SIGN SIGTRACE EDIT VALIDATE_PDF PDF_TO_WORD PDF_TO_EXCEL PDF_TO_PPT PDF_TO_PDFA WORD_TO_PDF EXCEL_TO_PDF PPT_TO_PDF FLATTEN AUDIT_TRAIL AUDIT_TRAIL_SEAL PDF_TO_PDF`

### UserType `lu7` `[obs]`: `free` (`e`), `pro` (`i`).

## Upload/convert sequence `[obs]` (`b72.i(...)`)

1. `i(path, onProgress)` uploads local file → returns `jm2` with remote file id `d` (storage token).
2. `mu7 = new mu7(uuid, ju7Type, [ns7(token)], options, 0, null, null, 496)` — packed defaults.
3. `zt1.n(nu7, mu7, retries=5, backoff=xz7.a, cb)` → `ws7`.
4. Poll `b(taskId)` → `bt7` outputs; first output → `ns7` → download → saved locally → `documents` row `[inf]`.

Format→type map in `b72` `[obs]`: `as2`→`WORD_TO_PDF`, `hr2`→`EXCEL_TO_PDF`, `ur2`→`PPT_TO_PDF`, `pr2`→`JPG_TO_PDF` (`pr2` also gets an `xt7` image-options block).

## Auth `[obs/inf]`

- Keycloak OIDC via `ExternalBrowserAuthActivity` (Custom Tabs); tokens gate task API `[inf]` (header wiring is inside obfuscated OkHttp interceptor — exact header name `[unk]`).
- Account repository `DefaultAccountRepository` + `AuthApiError` types; `AndroidAuthenticatorService` exposes account to AccountManager.

## Analytics `[obs]`

- Firebase Analytics/Crashlytics/RemoteConfig/Sessions + `analytics.smallpdf.com` first-party endpoint + `RedshiftEventSenderWorker` batched sender.
- AppsFlyer conversion/deep-link SDK.

## Unknowns

- Exact request headers, TLS pins (Pairip may add integrity tokens), full per-tool `options` schemas, error/SLA semantics, and the complete download endpoint path template: `[unk]`/`[partial]` statically.
