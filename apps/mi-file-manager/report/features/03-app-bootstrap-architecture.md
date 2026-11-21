# 03 — Application Bootstrap & Architecture

## Application startup

`com.android.fileexplorer.FileExplorerApplication` (evidence `ev_616ecd25…1ffece` attachBaseContext, `ev_6336079a…82308f` onCreate).

`attachBaseContext(Context)`:
1. Stores static `mApplication`/`mContext`, mirrors context into `com.xiaomi.globalmiuiapp.Application.mApplicationContext` (shared SDK context).
2. `a()` — internal early setup.
3. `AbsApplicationProxy.attachBaseContext` (proxy split — see below).
4. Submits async work on `ExecutorManager.singleExecutor()`.
5. `super.attachBaseContext` → `MultiDex.install` → `WebViewUtil.handleWebViewDir` (works around Android P+ per-process WebView data dir).

`onCreate()`:
1. Sets static refs, `super.onCreate`.
2. **Main-process gate** `r0.b(this)` — real init only runs in the main process (clean/remote/crash/selfupdate processes skip it).
3. `System.setProperty("rx2.purge-period-seconds","90")` — RxJava2 worker tuning.
4. `this.f5881b.init(ctx)` — `ApplicationProxyImpl` (subclass of `AbsApplicationProxy`) — bulk of SDK/feature init.
5. Registers `ActivityLifecycleCallbacks` `com.android.fileexplorer.a` (global activity tracking, stored `a.f5915h`).

`AbsApplicationProxy` methods: `init(Context)`, `initAd`, `initComponent`, `initLocalSdk`, `initSDKConfig`, `threadInitSDKConfig` — separates immediate init from `threadInitSDKConfig` (background-thread SDK config, keeping startup light).

## Process model (manifest-verified)

Only two components declare `android:process`: `service.RemoteService` → `:RemoteService`, and `com.miui.zeus.monitor.crash.CrashMonitorService` (Zeus SDK) → `:crash`. Everything else — including `FTPServerService` (no `process` attr) — runs in the main process. `NullService` is an exported=false no-op.

Main-process gating (`r0.b`) in `onCreate` still prevents heavy init in auxiliary processes — a single Application class guards by process name.

## Package map (app code)

```
com.android.fileexplorer          root: Application, TabActivity, RemoteActivity, proxy impl, helper class `a` (lifecycle callbacks)
  .activity                       24 declared + bases (BaseActivity/BaseAppCompatActivity/BasePreferenceActivity) + obfuscated `a`
  .adapter                        File*/Pick*/ViewLarge/DrawerMenu/Category* adapters, BannerAdGroupController, base.BaseQuickAdapter tree + obfuscated a–z/a0–e0
  .controller                     FileViewInteractionHub + ModeCallBack family (Private/Remote/AppTag/Category/Favorite/BaseFileOperation)
  .fragment                       24 real fragments: Category/Docs*/Picture*/Video* (Tab + group/category variants), File, Recent, Search,
                                  Storage/Remote volumes, Usb, FTPFile, SMBFile, GDriveFile, AppTag, DeepClean, FavoriteController
  .view                           ~80 widgets: FileListView, RefreshListView(+Header/Footer), ABMediaView/MiMediaView/FBMediaView/ResizeMediaView,
                                  PathGallery, NavigationLayout, dialog.AlertDialog tree, menu.*, gif.*, viewlarge.* (HackyViewPager,
                                  SubsamplingScaleImageView, decoder.SkiaImageDecoder), ArchiveDialogHelper, FTP/ChooseFTP dialog helpers, prefs
  .remote                         RemoteHelper, FTPRemoteHelper, SMBRemoteHelper (+2 obfuscated) — *no other remote classes*
  .provider                       AbsCommonProvider + FileContent/FileExplorerFile/SearchExport/SystemAd + 15 *SubProvider classes + dao.* tree
                                  (AppTag, CategorySort, ContentTag, FileGroup, FileItem, PhoneFileItem, Sticker×3, parse.DirParseDao,
                                  scan.{AppInfo,AppScanConfig,BlackDirInfo,VersionInfo}, video.{ResponseCache,UploadItem,VideoItem},
                                  videoposition.VideoPositionBeanDao)
  .service                        DirParse/FTPServer/Null/Remote + obfuscated a–f helpers
  .listener                       ScreenOrientationListener
  .localepicker                   LocaleListActivity + helpers
  .manager                        ConstantManager, UsbManagerHelper
  .model                          all obfuscated a–y (no named classes)
  .ota                            OtaTransferService
  .privacy                        PrivacyActivity + consent/permission fragments + RevokeAuth/NetDisabled dialogs
  .recommend                      NativeAdViewHelper + 13 obfuscated
  .selfupdate                     SelfUpgradeChecker, UpgradeConfirmDialog ONLY — no DownloadInstall* classes exist
  .stability                      FabricHelper
  .whatsapp                       WhatsApp{Status,Tag}*Fragments + item.*GridItem + job.WhatsAppStatusSaveService
  .ftp / .gdrive / .smb           **R$ resources only — fragments live under .fragment**
com.mi.android.globalFileexplorer.clean        Cleaner feature — 113 classes (evidence ev_c7d5130a…787a4a):
  CleanActivity, CleanResultActivity, CleanHelper, CleanTaskManager, EmptyDirCleaner, ScanFragment, CleaningFragment,
  BlackWhiteManager, SystemCacheCleanHistory, TreeNode, adapter.*, appcache.AppCacheManager, engine.AbsEngine +
  engine.mi.MiEngine + engine.mi.scanner.{8 mapped + MediaScanner/StorageHelper} + engine.xiaomi.CmEngine +
  xiaomi.callbacks.{CMType,XMType}ScanListener + AdDir/BigFile/CacheDir/Residual callbacks, engine.clean.CleanUpTask(Manager),
  engine.scan.{ScanRequest,ScanTask,SScanTaskManager,listeners}, engine.models.*, enums.*, models.* incl.
  result.ResultNativeAdModel, recommend.{GooglePlayVersionCompat,INativeAdLoadCallback}, whitelist.*, view.*, util.*
com.xiaomi.*                        vendor glue (623 classes): globalmiuiapp.Application + globalmiuiapp.common.*
                                  (SettingManager, HttpManager, ExecutorManager, SchedulerManager, UiModeManager,
                                  GlobalConsts, Urls, CommonConstant, MiEncryptHelper, AdvertisingIdHelper,
                                  CleanMasterIntentHelper, PackageSizeUtil, FileUtils, RemoteItem, LogUtils),
                                  .CleanService, .callactive, .mecloud (KCacheQueryDbOpenHelper, KPkgQueryDbOpenHelper,
                                  CleanCloudReadOnlyHighFreqDB, XiaoMiCloudStatisticsDbHelper), .sdk (IXiaomiCleaner AIDL +
                                  privacy-clean callbacks ISMS/IBrowser/ICall/IAdDir…), .privacy.cleaner/.scanitem,
                                  .miglobaladsdk, .mobileads.{admob,columbus,facebook}, .ad.feedback.DislikeManagerV2,
                                  .mirror (+ .synergy opensdk), .junk, .filter, .func.cache, .util natives, .utils
org.swiftp / org.apache.commons.net / com.hierynomus(+com.rapid7) / com.github.mjdev.libaums
                                  FTP server / FTP client / SMBJ / USB-OTG (see doc 07/06)
com.zeus.gmc.sdk.mobileads.columbus + msa + cmpLib   Zeus/Columbus ad SDK incl. its own consent lib `cmpLib.CMPLib`
net.openid.appauth / com.bumptech.glide / okhttp3 / com.squareup.moshi / org.bouncycastle / com.iab.omid.library.xiaomi /
com.github.junrar / androidx.room+work / gms / firebase
```

## Global helpers worth noting

- `Utils.startPrivacy(ctx, requestCode)` — consent gate (doc 12).
- `CMPLib.onCreate` — `com.zeus.gmc.sdk.mobileads.columbus.cmpLib.CMPLib`, the **Zeus/Columbus ad SDK's consent library** (verified `ev_e9665481…d570f5` — *not* Google UMP, which is absent), gated by `e0.c()`.
- `ExecutorManager`, `SettingManager`, `HttpManager`, `SchedulerManager`, `UiModeManager`, `GlobalConsts`, `Urls`, `CommonConstant`, `MiEncryptHelper`, `AdvertisingIdHelper`, `CleanMasterIntentHelper`, `PackageSizeUtil`, `FileUtils`, `LogUtils`, `RemoteItem` — all live under **`com.xiaomi.globalmiuiapp.common.*`** (shared Xiaomi app library), not `com.android.fileexplorer.util`.
- `ExecutorService`/`AsyncTask`/`CleanTaskManager` mixed concurrency; `onEventMainThread(j0.j)` callbacks use a custom event mechanism in obfuscated root package `j0` — no greenrobot/EventBus package present (verified `ev_1323fca1…9b9b067`).
- Room — DAO layer under `provider.dao.*` (doc 17).

## Startup/UI flow

`FileExplorerTabActivity.onCreate` (`ev_f082a1db…e02f72`):
- restores `TAG_RECREATE`/`TAG_DRAWER_OPEN`, clears fullscreen flag;
- privacy gates: `d0.d()` → `Utils.startPrivacy(..., REQUEST_CODE_ASK_SET_PERMISSIONS_ME=4101)`; `!h0.c() && d0.g(this)` or `d0.f(this)` → `Utils.startPrivacy(..., 128)`;
- `asyncLayoutInflater()` — off-main inflation; `mainIdleHandler` defers init to first idle;
- `CMPLib.onCreate(this)` when `e0.c()` (consent region check).

This shows the deliberate cold-start pattern: consent decision first, then async layout, then idle-time feature init.

## Unknowns

- Exact obfuscated-class→feature mapping where names are stripped (inferred from usage, noted per-doc).
- Dynamic loading of `audience_network.dex` load path/loader (ClassLoader insertion point not traced).
- `threadInitSDKConfig` content (which SDKs defer) — inferred ordering only.
