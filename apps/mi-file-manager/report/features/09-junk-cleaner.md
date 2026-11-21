# 09 — Junk Cleaner (`com.mi.android.globalFileexplorer.clean`)

The flagship cleaner feature — 113 classes in `com.mi.android.globalFileexplorer.clean` (complete package inventory `ev_c7d5130a…787a4a`) plus the bundled **CleanMaster SDK** engine under `com.xiaomi.*`.

## UI flow

- `CleanActivity` (`ev_f446c290…5c2aa`, exported via `…action.CLEAN`): `start(Context)` entry, `EXTRA_FORCE_CLEAN="force_clean"` skips intro, `startPreloadResultPageData()` warms results, `onBackPressed` guarded by a back-pressed listener during scan; static `sLastCleanTime` shown as "last cleaned" date.
- `CleanResultActivity` (declared, not exported) — result page; `ScanFragment`/`CleaningFragment` show scan progress → per-group checkboxes → clean confirmation.
- Other verified inventory classes: `CleanHelper`, `EmptyDirCleaner`, `BlackWhiteManager`, `SystemCacheCleanHistory`, `TreeNode`, `adapter.*`, `view.*`, `util.*`. Names like `ScanningFragment`/`CleanFinishActivity`/`ImageListActivity`/`ClearDataActivity`/`AuthenticationImeInfoActivity` were **not observed** in the complete package inventory — do not cite them.
- `engine.models.*`, `models.*` incl. `result.ResultNativeAdModel` — grouped junk presentation; **`ResultNativeAdModel` proves native ads are interleaved into clean results**.

## Two engines — `AbsEngine` hierarchy

### MiEngine — native MIUI scanners

`engine.mi.MiEngine` (`ev_80173ec2…976bb`, `startScan` `ev_ff348ddf…8a0468`). `startScan(ScanRequest)` maps a bitmask to scanners on `CleanTaskManager` executor:

| Scan-type bit | Scanner |
|---|---|
| 4 | `SystemCacheScanner` |
| 16 | `ApkScanner` (orphaned .apk files) |
| 32 | `MemoryScannerV2` (memory/RAM junk) |
| 64 | `EmptyDirScanner` |
| 128 | `LargeFileScanner` |
| 256 | `VideoScanner` |
| 512 | `InstallAppScanner` (installed-app leftovers) |
| 1024 | `AdditonDirScanner` (extra dirs) |

`MyScanListener` aggregates `mFinishedScannedCount`/`mScanCount` under `mFinishLock`; `cancelScan()` sets `mIsCanceled` and cancels running scanners; `release()` frees listeners; `update(EngineUpdateListener)` — cloud rule update returning `UPDATE_TYPE_SUCCESS|CHECK_FAILED|UPDATE_FAILED|NO_UPDATE`.

### CmEngine — CleanMaster SDK engine

`engine.xiaomi.CmEngine` (`ev_418210b8…a021b6`): binds service `com.xiaomi.action.sdk.CleanService` (`CLEAN_SERVICE_PACKAGE = com.mi.android.globalFileexplorer` — the in-app `com.xiaomi.CleanService`). Callback set verified in inventory: `xiaomi.callbacks.{CMTypeScanListener,XMTypeScanListener,AdDirScanListener,BigFileScanListener,CacheDirScanListener,ResidualScanListener}` — i.e., callbacks for cache, residual, big-file and **ad-directory** scans. `mServiceConnection`, `mReleaseLock`/`mFinishLock` async coordination, `mEmptyDirModel`. Scan types map to CleanMaster `KCacheQuery`/`KPkgQuery` result models.

### CleanMaster SDK under `com.xiaomi.*`

- `com.xiaomi.CleanService` (declared, filter `com.xiaomi.action.sdk.CleanService`), `com.xiaomi.callactive.CallActiveReceiver` (declared, action `cm.intent.action.xiaomi.callactive` — manifest-verified) — SDK wake/active call.
- `com.xiaomi.mecloud` — junk **cloud DBs**: `KCacheQueryDbOpenHelper`, `KPkgQueryDbOpenHelper`, `CleanCloudReadOnlyHighFreqDB`, `XiaoMiCloudStatisticsDbHelper` (verified names) — downloadable junk-rule databases updated via `MiEngine.update` / `mecloud` fetchers.
- `com.xiaomi.sdk.IXiaomiCleaner` AIDL + privacy-clean callbacks `ISMS/IBrowser/ICall/IAdDir…` (verified `com.xiaomi.sdk` / `com.xiaomi.privacy.cleaner` / `.scanitem` packages) — interfaces for privacy-item scans (SMS, browser history, call log, ad dirs).
- `com.xiaomi.util` natives (a/b/c/e/f) → `libdce-1.1.19-mfr.so` — native junk-scan helpers (file hash/stat) — doc 22.
- `miuiengine.util` natives → `libTmsdk-2.0.13-mfr.so` — Tencent Tmsdk scan engine — doc 22.

### Whitelist & app-cache protection

- `whitelist.*` package + `BlackWhiteManager` (verified) — do-not-delete lists (system pkgs, protected paths); editable via whitelist UI.
- `appcache.AppCacheManager` — per-app cache bookkeeping (what counts as cache vs user data).
- `EmptyDirCleaner`, `CleanTaskManager`, `engine.clean.CleanUpTask(Manager)` — executor + task lifecycle.

## Data & deletion path

- Scan → scan-listener events → group models → user checks groups → `CleanUpTask(Manager)` deletes via `File.delete`/`MediaStore` delete, honoring whitelist; `SystemCacheScanner` can use `DELETE_CACHE_FILES`/`GET_PACKAGE_SIZE` where the signature permission is granted (platform-signed on MIUI — doc 01).
- `recommend.GooglePlayVersionCompat` + `recommend.INativeAdLoadCallback` (verified) — ad-variant gating inside the cleaner (`GooglePlayVersionCompat` suggests a Play-store build disables ad loading).

## Evidence

`ev_c7d5130a…787a4a` (113-class complete inventory), `ev_80173ec2…976bb` (MiEngine), `ev_ff348ddf…8a0468` (startScan bitmask), `ev_418210b8…a021b6` (CmEngine), `ev_f446c290…5c2aa` (CleanActivity), `ev_be453578…9b445` (JNI view → native scan libs), `ev_6298fcc4…deb6b58` (constants), manifest `ev_24480d9e…089c2a7` (CleanService filter, CallActiveReceiver action).

## Unknowns

- Exact junk-rule DB schema/host (`mecloud` DBs downloaded from Xiaomi cloud endpoints — host inside obfuscated fetch code, doc 21).
- CmEngine's per-scan-type mapping (AIDL constants) — service protocol fully inside SDK, not line-decompiled.
- Whether Tmsdk/dce natives run in global builds or only initialize on demand — native-load sites not exhaustively traced.
