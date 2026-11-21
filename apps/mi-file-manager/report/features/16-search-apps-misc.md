# 16 — Search, App Management, Recent Apps & Misc Features

## Search

- `SearchDetailActivity` — custom action `com.mi.android.globalFileexplorer.action.SEARCH` (exported); system `android.intent.action.SEARCH` + `res/xml/searchable.xml` is wired on `FileExplorerTabActivity` (manifest-verified). `SearchFragment` shows results; `SearchExportProvider` (exported provider `searchexport` — doc 17) exports search results to other apps/launcher.
- Index sources: FileContentProvider DB (`FileItem`, `FileGroup`), `SearchExportProvider` cursor over the same DAO; suggestion columns from `searchable.xml`.
- Global search reaches categories + filenames; scope filter chips in `SearchFragment`.

## Installed-apps management

- `RecentAppsAndFoldersActivity` (`action.Apps` launcher entry) — recent apps + folders.
- `AppTagActivity`, `AppTagFragment`, `WhatsAppTabAppTagFragment` — per-app tag views (files by owning app); backed by `AppTagDao`/`AppTagSubProvider`/`AppScanConfig`.
- `InstalledAppsActivity` (deep clean) — uninstall flow class exists in dex but is **not declared** (dead code, doc 10); `InstallAppScanner` ranks unused apps; `PackageSizeUtil` (`GET_PACKAGE_SIZE` privilege → reflect `PackageManager.getPackageSizeInfo`) computes app footprint; `PackageManagerUtils`, `QUERY_ALL_PACKAGES` for visibility.
- APK install — `REQUEST_INSTALL_PACKAGES` + `FileExplorerFileProvider` URI to system installer.

## Locale & settings

- `LocaleListActivity`, `localepicker` package — in-app language override (88 locales shipped, doc 25).
- `SettingPreferenceActivity`, `SettingAboutPreferenceActivity`, `SettingVersionPreferenceActivity` — settings/about/version screens; `MyCheckBoxPreference`, `ServerControlPreference`, custom preference classes; `SettingManager` façade.
- `UiModeManager`-style dark/theme helpers; `Theme.*` attrs per-activity (PrivateFolder translucent, dialog themes).

## Notification & shortcuts

- `res/xml/shortcuts` — Clean/Recent launcher shortcuts (manifest-verified meta-data on TabActivity); `SCHEDULE_EXACT_ALARM` permission declared. The app ships **no app-defined broadcast receivers** — all 12 declared receivers are library plumbing (WorkManager, gms, FCM — doc 02); no `NotificationDeleteReceiver`/`ScheduleJobService` was observed.

## Misc services

- `service.NullService` — exported=false no-op placeholder.
- `com.miui.zeus.monitor.crash.CrashMonitorService` (`:crash`, Zeus SDK — doc 19).
- `whatsapp.job.WhatsAppStatusSaveService` + `ota.OtaTransferService` IntentServices (docs 13/14); `PrivateFolderActivity.mTryTransformTask` + DAO version upgrades handle legacy migrations.

## Evidence

Component inventory `ev_24480d9e…089c2a7`, class inventory `ev_c7d5130a…787a4a`; DAO list doc 17.

## Unknowns

- `SearchExportProvider` consumers (launcher search integration target — likely POCO/MIUI launcher via `searchexport` authority, undocumented).
