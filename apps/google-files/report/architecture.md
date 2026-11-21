# Architecture — frameworks, DI, event flow

## Framework: Google "TikTok" Android app framework — CONFIRMED

The manifest literally declares `com.google.apps.tiktok.*` components:
`nav.gateway.GatewayActivity`, `nav.gateway.AnimatedGatewayActivity`,
`concurrent.AndroidFuturesService`, `concurrent.InternalForegroundService`,
`experiments.phenotype.ConfigurationUpdatedReceiver` — plus phenotype channels
`tiktok_device`, `tiktok_directboot`, and `TIKTOK_FRAGMENT_ARGUMENT`
injection (`hpj`, a fragment-wrapper host implementing ~100 event interfaces).

Activities/fragments are thin shells; logic lives in generated **peer/mixin**
classes. Evidence from `HomeActivity.onCreate` (REA `inspect_android_method`):

- Bases: `kbi`/`hxd`/`pth` mixin host hierarchy
- `WindowManager` (Jetpack) activity-embedding: registers **SplitPlaceholder**
  rules (v3/v4) for large screens/foldables
- MediaStore warm-up on launch, FCM `setAutoInitEnabled` for non-China devices,
  GNP (Google Notification Push) registration, edge-to-edge window coloring
- Browser fragment peer `itt`, preview fragment peer `jha`, audio hub `hpt`

`hpt` is the central UI event/state hub — a single class implementing ~200
observer interfaces (`hpy…vvk`) routing events like `PlayPauseButtonClicked`,
`PrevButtonClicked`, `NextButtonClicked`, `RepeatButtonClicked`,
`ShuffleButtonClicked`, `AudioPreviewOnGlobalLayoutListener`, `OnScroll`,
clipboard ops. Clearcut device source `com.google.android.apps.nbu.files.device`,
log source `45461419`.

## Layering observed in decompiled code

```
UI shell (named app classes)      com.google.android.apps.nbu.files.*
  └─ TikTok peers/mixins          defpackage.* (obfuscated)
       └─ Feature modules         documentbrowser, managespace, safefolder,
                                  trash, offlinesharing, mediaconsumption, …
            └─ Storage lib        "storagelib" document/collection abstraction
                  (ubiq*, qaw*, pye*, kpu*, storage roots, pre-R/R+ branches)
                       └─ Platform APIs / GMS / native libs
```

- **Storagelib**: uniform document model over MediaStore + SAF + raw files;
  zip entries are `storagelib-zip-document` URIs (class `qdr.c()`).
- **Async**: `tgw`/`sik.V/U` fluent futures (Google's `fluentfuture`-style)
  threaded through an executor registry; Room + hand-rolled `SQLiteOpenHelper`s.
- **Event bus**: per-screen event interfaces (the `hpt` interface explosion) +
  BroadcastReceivers for cross-process (share-sheet result, package changes).
- **DI**: generated TikTok object graph — `SafeFolderAuthActivity.onCreate`
  shows `.dU()` dependency accessor building peer + fragment injection.

## Third-party / Google library map (from class census + package names)

| Library | Presence |
|---|---|
| AndroidX (appcompat, room, work, startup, graphics.path, pdf, media3/exoplayer, window/activity-embedding, biometric) | yes |
| ExoPlayer/Media3 | media playback core |
| Google Cast framework | `com.google.android.gms.cast*` + app `cast` receivers |
| ML Kit (document scanner UI, custom ICA, tflite dynamite) | manifest deps + `assets/` models |
| GMS Nearby Share | intent-based delegation |
| Firebase Messaging | push service |
| GNP (Google Notifications Push) | registration in HomeActivity |
| Geller | on-device corpus store, `libgeller_jni_lite_lib.so` (1 MB) |
| ProtoStore | `MappedCounterCacheVersion` JNI + `libmappedcountercacheversionjni.so` |
| Phenotype | server-driven flags (`vxs` table, `phenotype_metadata`) |
| Clearcut + Streamz | telemetry (`/client_streamz/geller/…` metrics) |
| Cronet | bundled via dynamite modules (network stack) |
| Jam / AppSearch libs | `com.google.android.libraries.appintegration.jam.*` |
| MDD (Mobile Data Download) | `DownloaderCallbackImpl`, zip transform |
| Room, WorkManager | DB + job scheduling |
| Firebase Analytics | `AppMeasurement*` components |
| Primes | `LifeboatReceiver` + channel |
| Surveys, AppDoctor, GrowthKit | `SurveyActivity`, `AppDoctorReceiver`, `TestingToolsBroadcastReceiver` |
| DirectBoot | `DirectBootHelperService` + `tiktok_directboot` channel |
| Kotlin coroutines, j$ desugaring | `j$` (514 files), `kotlinx` |

## Obfuscation census

17,602 classes total; **16,401 under `defpackage.*`** (~93%). The named
`com.google.android.apps.nbu.files` app surface is 133 classes — entry points,
then everything interesting is obfuscated peers. Feature attribution was done by
string fingerprinting (see `class-inventory.md`).

## Process model

- Main process: all UI + storagelib.
- `:isolated` PDF render service (`isolatedProcess="true"`) — PDFium/AndroidX
  PDF runs sandboxed, untrusted document parsing isolated from app context.
- GMS dynamite modules (ML Kit scanner, Cronet) run in GMS processes.
