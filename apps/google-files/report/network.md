# Network surface (static)

## HTTP client stack

- Full HTTP/1.1 model shipped in-class (`wxm`/`wxp` constants: methods,
  status codes, ~70 header names, `strict-transport-security`, content-range…) —
  a vendored OkHttp/Cronet-compatible stack.
- **Cronet** delivered via dynamite modules (manifest deps) — QUIC/HTTP3 capable.

## Identified endpoints / URL constants

| URL | Use |
|---|---|
| `https://support.google.com/gemini/answer/13594961?rd=1#files` | Gemini-in-Files help article (`hpa`) |
| `content://com.google.android.apps.nbu.files.offlinesharing.foldersharing.provider` | folder-sharing provider base URI |
| `content://…SafeContentProvider` | internal content serving |
| GMS package URIs | `com.google.android.gms.nearby.sharing.ShareSheetActivity`, `ReceiveSurfaceActivity`, `com.google.android.gms.mlkit.ACTION_SCAN_DOCUMENT` |

## Telemetry endpoints (metric names only)

`/client_streamz/geller/cache/**` — ~40 Streamz metric paths for Geller
cache access/cleanup/migration/DMA (class `nsh`/`njk`/`nsg`). Clearcut device
source `com.google.android.apps.nbu.files.device`, log source `45461419`.

## Push

Firebase Messaging service + GNP registration; `proxy_notification_initialized`
delegate config (`kru`).

## Feature-download channels

- Play Feature Delivery (`requestDownloadableFeatureFuture`, split install
  sessions in `kef`/`hxz`): ML Kit scan module, language packs.
- MDD (Mobile Data Download): `DownloaderCallbackImpl` + zip-transform for
  model/asset bundles.

## Security config

`network_security_config` declared in manifest (decoded XML present).
No hardcoded credentials/tokens observed in string index.
