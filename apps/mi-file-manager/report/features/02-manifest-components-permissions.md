# 02 — Manifest, Components & Permissions

Evidence: `ev_24480d9e…089c2a7` (inspect_android_package — 86 components), decoded manifest `data/AndroidManifest.decoded.xml` (line-verified), `ev_07e4b7fc…f8f832d` (application graph).

## Component inventory — 86 declared

**41 activities, 19 services, 12 receivers, 8 providers, 6 activity-alias** (manifest line-verified below; counts match REA's component projection).

### App activities (declared)

| Activity | Exported | Notes |
|---|---|---|
| `FileExplorerTabActivity` | yes | LAUNCHER + `START_KUAIPAN` + `android.intent.action.SEARCH` + `FORCE_TOUCH_CLEAN`(×2) + browsable `https://fe.miui.com` and `fe://fe.miui.com`; meta-data `@xml/searchable`, `@xml/functionindex`, `@xml/shortcuts`; `singleTask` |
| `privacy.PrivacyActivity` | **no** | action `fe.intent.action.PRIVACY`, `singleTask`, Fullscreen theme |
| `activity.FileActivity` | yes | `singleTask`; `PICK` (file/content/*\*/media), `GET_CONTENT` openable, `MEDIA_MOUNTED`/`UNMOUNTED` (file+content schemes — mount events enter through an *activity*, not a receiver), `miui.intent.action.{PICK_FOLDER,PICK_MULTIPLE,OPEN}` |
| `activity.FileCategoryActivity` | yes | `PICK_INSTALLED_APPS`, `RINGTONE_PICKER`, `action.FILE_CATEGORY`, browsable `fe://security.fe.miui.com` |
| `activity.ServerControlActivity` | yes | action `…action.SERVER_CONTROL` (FTP server control) |
| `activity.ServerControlPreference` | no | FTP-server settings screen (it is an *activity*, Theme.Gray) |
| `activity.RemoteConfigActivity` | no | `singleTask` |
| `activity.SettingPreferenceActivity` / `SettingAboutPreferenceActivity` / `SettingVersionPreferenceActivity` | no | settings/about/version |
| `activity.RecentAppsAndFoldersActivity` | yes | action `…action.Apps` |
| `activity.AdDetailActivity` | no | ad landing page, blank label |
| `activity.AppTagActivity` | yes | no intent filter (exported class-launch surface) |
| `activity.SearchDetailActivity` | yes | action `com.mi.android.globalFileexplorer.action.SEARCH` (custom, not `android.intent.action.SEARCH` — that one is on TabActivity) |
| `activity.PrivateFolderActivity` | **yes** | `excludeFromRecents`, label `@string/private_folder` — exported vault activity (see doc 23) |
| `activity.StorageInfoActivity` / `ViewLargeActivity` / `VideoPlayerActivity` | no | storage breakdown, image viewer, video player |
| `activity.FeedbackActivity` | yes | action `…action.FEEDBACK` |
| `activity.ShareActivity` / `ShareViaQRCodeActivity` | no | share + QR transfer |
| `activity.AuthWebActivity` / `ScoreWebActivity` | **no** | `singleTask`; `action.AUTH` / `action.SCORE` |
| `activity.CloudConfigActivity` | yes | `singleTask`; action `com.mi.android.globalFileexplorer.appauth.HANDLE_AUTHORIZATION_RESPONSE` |
| `RemoteActivity` | no | remote-section host |
| `clean.CleanActivity` | yes | action `…action.CLEAN` |
| `clean.CleanResultActivity` | no | cleaner results |
| `deepclean.appdata.AppDataActivity` / `.largefile.LargeFilesActivity` / `.video.VideoListActivity` / `.apk.ApkListActivity` | no | the only deep-clean activities **declared** (see "undeclared classes" below) |
| `net.openid.appauth.RedirectUriReceiverActivity` | yes | browsable scheme `com.mi.android.globalfileexplorer` (OAuth redirect) |
| `com.facebook.ads.AudienceNetworkActivity` | no | FB ad surface |
| `com.google.android.gms.ads.AdActivity` / `OutOfContextTestingActivity` / `common.api.GoogleApiActivity` | no | gms ads plumbing |
| `com.xiaomi.miglobaladsdk.appopenad.OpenNativeAdActivity` | no | app-open ad |
| `com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.GMCAdActivity` / `.interstitialad.ColumbusActivity` / `msa.adjump.AdJumperLoadingActivity` | no | Columbus ad activities |

App-level meta-data: `android.app.default_searchable = .FileExplorerTabActivity`.

### Activity-alias (6) — all exported

| Alias → target | Label/icon | Filters |
|---|---|---|
| `ExtractFileActivity` → `FileActivity` | `@string/decompress_to` | `VIEW` on `application/{zip,rar,x-rar-compressed}` (file+content) |
| `CopyFileActivity` → `FileActivity` | `@string/copy_to` | `VIEW` image/video/zip/rar + `SEND` (app/audio/image/video/text) + `SEND_MULTIPLE` |
| `MoveFileActivity` → `FileActivity` | `@string/move_to` | `VIEW` image/video/zip/rar incl. `content://…myprovider` hosts |
| `PickImageActivity` → `FileCategoryActivity` | `@string/local_image`, `ic_pick_image` | `PICK_MULTIPLE` image/* |
| `PickVideoActivity` → `FileCategoryActivity` | `@string/local_video` | `PICK`/`GET_CONTENT`/`PICK_MULTIPLE` video/* |
| `PickAudioActivity` → `FileCategoryActivity` | `@string/local_music` | `PICK`/`GET_CONTENT`/`PICK_MULTIPLE` audio/* |

### Services (19)

| Service | Exported / process | Role |
|---|---|---|
| `service.FTPServerService` | default (no filter) — **main process** (no `process` attr — earlier draft's `:FTPServer` was wrong) | org.swiftp FTP server |
| `service.RemoteService` | `exported=false`, `:RemoteService` | remote-connections helper process |
| `service.NullService` | `exported=false` | no-op placeholder |
| `whatsapp.job.WhatsAppStatusSaveService` | default | IntentService status sync |
| `service.DirParseService` | **yes** + `permission=…permission.DIRPARSE` | bound dir-indexer, action `com.mi.android.globalFileexplorer.DirParseService` |
| `ota.OtaTransferService` | `exported=false` | IntentService file transfer |
| `com.xiaomi.CleanService` | filter `com.xiaomi.action.sdk.CleanService` | bundled CleanMaster SDK service (CmEngine's bind target) |
| `com.google.firebase.messaging.FirebaseMessagingService` | `exported=false`, `MESSAGING_EVENT` | **stock gms class** — no app subclass declared |
| `com.google.firebase.components.ComponentDiscoveryService` | `directBootAware`, `exported=false` | registrars: crashlytics, remoteconfig, messaging, analytics-connector, abt, iid, installations, datatransport |
| `androidx.work.impl.background.systemjob.SystemJobService` / `.systemalarm.SystemAlarmService` / `.foreground.SystemForegroundService` | JobService perm-gated | WorkManager |
| `com.google.android.gms.ads.AdService` / `measurement.AppMeasurementService` / `AppMeasurementJobService` | `exported=false` | gms |
| `com.google.android.datatransport.runtime.backends.TransportBackendDiscovery` / `.jobscheduling.JobInfoSchedulerService` | `exported=false` | CCT backend |
| `com.miui.zeus.monitor.crash.CrashMonitorService` | `exported=false`, **`:crash`** | **Zeus SDK** crash monitor (not a file-explorer class) |
| `androidx.room.MultiInstanceInvalidationService` | `exported=false` | Room |

### Receivers (12 — mostly library plumbing, no app-defined receivers)

`androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver`, `work` constraint proxies ×4 (`BatteryCharging`, `BatteryNotLow`, `StorageNotLow`, `NetworkState`), `RescheduleReceiver` (BOOT_COMPLETED/TIME_SET/TIMEZONE), `ConstraintProxyUpdateReceiver`, `DiagnosticsReceiver` (exported, `DUMP` perm), `gms.measurement.AppMeasurementReceiver`, `firebase.iid.FirebaseInstanceIdReceiver` (exported, `c2dm.SEND` perm, `c2dm.RECEIVE`), `datatransport AlarmManagerSchedulerBroadcastReceiver`, `com.xiaomi.callactive.CallActiveReceiver` (action `cm.intent.action.xiaomi.callactive`).

> There is **no statically-declared boot/mount/package-replaced receiver for the app itself** — `RECEIVE_BOOT_COMPLETED` is requested but boot work goes through WorkManager/registered receivers; media-mount events enter via `FileActivity` intent filters.

### Providers (8)

| Provider | Authority | Exported | Gate |
|---|---|---|---|
| `provider.FileContentProvider` | `…dao.filecontent.provider` | **yes** | `ACCESS_FILE_CONTENT` (`signatureOrSystem`) ✓ |
| `provider.SearchExportProvider` | `…provider.searchexport` | **yes** | **none** ⚠ |
| `provider.SystemAdContentProvider` | `…systemAd.splashAd` | **yes** | **none** ⚠ |
| `provider.FileExplorerFileProvider` | `…myprovider` | no | `grantUriPermissions`, `@xml/file_paths` ✓ |
| `gms.ads.MobileAdsInitProvider` | `…mobileadsinitprovider` | no | initOrder=100 |
| `androidx.startup.InitializationProvider` | `…androidx-startup` | no | WorkManager init |
| `com.facebook.ads.AudienceNetworkContentProvider` | `…AudienceNetworkContentProvider` | no | — |
| `xiaomi.miglobaladsdk.SdkInitProvider` | `…miglobaladsdk.SdkInitProvider` | no | — |

### Undeclared-but-present feature classes

These Activity **classes exist in dex but are NOT in the manifest** — unreachable as activities (dead/disabled code or launch paths removed in this build): `activity.DocumentsUIActivity`, `deepclean.installedapp.InstalledAppsActivity`, `deepclean.appclean.{facebook.FacebookCleanerActivity, whatsapp.WhatsappCleanerActivity, detail.GroupDetailActivity, detail.ViewImageAndGifActivity}`. See doc 10.

### Declared permissions (custom, both `signatureOrSystem`)

`com.mi.android.globalFileexplorer.permission.DIRPARSE`, `…ACCESS_FILE_CONTENT`.

## uses-permission (70 entries — line-verified)

- **Launcher settings (~38 read/write pairs)**: `com.android.launcher{,2,3}`, `com.mi.android.globallauncher`, yulong, meizu, bbk, oppo, htc, qiku, huawei(×3), zte(×2), lenovo, google, adw(×3), qihoo360, lge, fede, sec.twlauncher, tencent, ebproductions, nd, mylauncher, ztemt, nubia.
- **Storage**: `READ/WRITE_EXTERNAL_STORAGE`, `MANAGE_EXTERNAL_STORAGE`, `READ_MEDIA_{IMAGES,AUDIO,VIDEO}`, `WRITE_MEDIA_STORAGE`, `ACCESS_ALL_EXTERNAL_STORAGE`; app-attr `requestRawExternalStorageAccess="true"`.
- **Privileged/signature-level**: `WRITE_SECURE_SETTINGS`, `READ_PRIVILEGED_PHONE_STATE`, `MOUNT_UNMOUNT_FILESYSTEMS`, `MANAGE_USERS`, `INTERACT_ACROSS_USERS`, `ACCESS_KEYGUARD_SECURE_STORAGE`, `DELETE_CACHE_FILES`, `GET_PACKAGE_SIZE`, `SET_PREFERRED_APPLICATIONS`, `miui.permission.USE_INTERNAL_GENERAL_API`, `com.android.settings.permission.CLOUD_SETTINGS_PROVIDER` (sigOrSystem).
- **Network/jobs**: `INTERNET`, `ACCESS_NETWORK_STATE`, `ACCESS_WIFI_STATE`, `CHANGE_WIFI_STATE`, `WAKE_LOCK`, `VIBRATE`, `RECEIVE_BOOT_COMPLETED`, `FOREGROUND_SERVICE`, `SCHEDULE_EXACT_ALARM`, `POST_NOTIFICATIONS`, `GET_TASKS`, `GET_APP_GRANTED_URI_PERMISSIONS`.
- **Accounts**: `USE_CREDENTIALS`, `MANAGE_ACCOUNTS` (no GET_ACCOUNTS).
- **Packages**: `QUERY_ALL_PACKAGES`, `REQUEST_INSTALL_PACKAGES`.
- **Vendor/commercial**: `com.xiaomi.permission.AUTH_SERVICE`, `com.xiaomi.gallery.permission.CLOUD`, `com.miui.gallery.permission.USE_API`, `com.cleanmaster.permission.sdk.clean`, `com.miui.cleanmaster.permission.InstallCleanMaster`, `com.miui.systemAdSolution.adSwitch.PROVIDER`, `com.miui.systemAdSolution.LOCAL_AD_PROVIDER`, `com.android.fileexplorer.permission.ota`, `cn.wps.moffice.lite.permission.BIND_SNAPSHOT_SERVICE`, `com.google.android.gms.permission.AD_ID`, `com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE`, `com.google.android.c2dm.permission.RECEIVE`, `WRITE_SETTINGS`.
- Self-use of custom perms: `DIRPARSE`, `ACCESS_FILE_CONTENT`.

## queries

Package `cn.wps.xiaomi.abroad.lite` (WPS lite), package `com.facebook.katana`, intent `VIEW`+BROWSABLE+https, intent `android.support.customtabs.action.CustomTabsService`. **No `com.whatsapp` query** (status access is filesystem-level, not package-introspection).

## uses-library / meta-data

`org.apache.http.legacy` (required=false), `androidx.window.extensions`, `androidx.window.sidecar` (foldables). Meta-data: `firebase_{crashlytics,analytics,crash,performance}_collection_enabled=false`, `firebase_performance_logcat_enabled=false`, `global_app_hide_enable`/`app_hide_enable`/`disable_notifications_when_app_hide` (MIUI hidden-app feature), `app_description_{title,content}` + `app_remove_icon_description_*` (`@string/ic_remove_*`), `notch.config=portrait`, `android.max_aspect=2.2`, columbus `APP_KEY=FILE_EXPLORER`/`APP_SECRET=6a75640c…1a2eb`, `gms.ads.APPLICATION_ID=ca-app-pub-4062377952200160~8017942393`, `gms.version`, ads flags `OPTIMIZE_AD_LOADING`/`OPTIMIZE_INITIALIZATION=true`, `devicebaseinfo=1.0`, `FILE_PROVIDER_PATHS=@xml/file_paths`, `WorkManagerInitializer`.

## Unknowns

- Grant status of signature permissions on a given device (platform-cert dependent).
- Whether code-level caller checks compensate the two unguarded providers (doc 23).
- Why deep-clean activity classes ship undeclared (dead code vs. alternative launch) — static analysis can't distinguish.
