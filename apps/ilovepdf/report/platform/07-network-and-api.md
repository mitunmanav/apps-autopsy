> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# 07 — Network and the iLovePDF API

## Endpoints (static observations)

| Base | Use |
|---|---|
| `https://api.ilovepdf.com/v1/` | Tool API (Retrofit `ILovePDFApiService`, `ApiModuleKt`) |
| `https://api.ilovepdf.com/v1/auth` | JWT auth (`AuthDataSourceImpl.AUTH_URL`, `AuthTokenBody` → `TokenApiModel`) |
| `https://<server>/v1/<task>` | per-task ops URL; `<server>` comes from the `start` response (`UrlUtils`) |
| `https://<server>/v1/download/<task>` | result download (`UrlUtils`) |
| `https://mobile.iloveapi.com/v1/` | Mobile service (`BuildConfig.MOBILE_SERVICE_BASE_URL`) — user/subscription/features |
| `https://service.iloveapi.com/v1/mobile_redirect_sso` | SSO redirect (`WebViewActivity`) |
| `https://ilovepdf.freshdesk.com` | Support portal |

Cleartext HTTP is allowed only for `*-stagingws.ilovepdf.com` (networkSecurityConfig).

## API call flow (remote tools)

`ILovePDF.getInstance(context, publicKey, secretKey)` → `ILovePdfSDK` (Koin).

1. `POST /v1/auth` → bearer token (`TokenManager` caches it;
   `AuthHeaderInterceptor` injects it, `ServerAuthenticator` refreshes on 401
   via `RefreshAccessToken`).
2. `GET /v1/start/{tool}` → `TaskApiModel{ task, server, workerId… }`.
3. `POST https://<server>/v1/upload` — multipart (`UploadWithProgressRequestBody`,
   emits upload progress), or JSON `UploadCloudFileParams` for cloud-stored files.
4. `POST https://<server>/v1/process` — body = tool `Params` (Gson
   `ParamsSerializer`); returns `TaskStatus{status, download_file_name}`.
   `Task` polls until processed (steps: STARTED/UPLOADING/UPLOADED/PROCESSING/
   PROCESSED/DOWNLOADING/DOWNLOADED of `NUMBER_OF_STEPS=8`).
5. `GET https://<server>/v1/download/<task>` → file stream
   (`DownloadManagerImpl`, progress emission; `ZipExtensionsKt` unzips
   multi-file results; `FileNameUtil` resolves collisions).

Errors map to `ApiError`/`ErrorBody`; `PasswordNeededException`,
`NoTokenException`, `ProcessErrorException(trace)` are the typed failures.
Cloud files can bypass upload: `UploadCloudFileParams{server_filename}` reuses
files already on the API (Dropbox/Drive/OneDrive imported files).

## Remote task → tool params

`params.*` holds every tool's request model: `Merge`, `Split` (ranges),
`Compress(level)`, `PdfToOffice(word/excel/powerpoint)`, `OfficeToPdf`,
`PdfToImage(mode: pages/extract)`, `NumberPages(position/format/typing)`,
`WaterMark(mode text|image, position, font, layer, rotation, transparency)`,
`Protect`, `Unlock`, `Rotate`, `RepairPdf`, `ImageToPdf`,
`CompressImage`, `ConvertImage`, `ResizeImage` (+ `Tool` enum incl. TESTING).
