# Manifest analysis — `AndroidManifest.xml` (base.apk)

Evidence: `ev_0f1611bb7e2908ede179a1c190db8ea464c53a4c3d1f5b8aa6ec7bc74940576`
(100 components). Verified line-by-line against the decoded manifest
(`/tmp/fbg/decoded/base/AndroidManifest.xml`, 49 KB). Declarations are static —
export/intent-filter presence does not prove runtime reachability.

## Application attributes (verbatim)

```xml
<application
  android:name="com.google.android.apps.nbu.files.Files_Application"
  android:appComponentFactory="androidx.core.app.CoreComponentFactory"
  android:allowBackup="true"
  android:backupAgent="com.google.android.apps.nbu.files.backup.FilesBackupAgent"
  android:restoreAnyVersion="true" android:fullBackupOnly="false"
  android:requestLegacyExternalStorage="true"
  android:usesCleartextTraffic="false"
  android:networkSecurityConfig="@xml/network_security_config"
  android:extractNativeLibs="true"
  android:gwpAsanMode="always"
  android:enableOnBackInvokedCallback="true"
  android:localeConfig="@xml/locale_config"
  android:manageSpaceActivity="…managespace.ManageSpaceActivity"
  android:label="@string/files_by_google" android:icon="@mipmap/ic_launcher_folder"
  android:theme="@style/HomeScreenTheme" android:supportsRtl="true">
```

Notable: **GWP-ASan `always`** (native heap-overflow detection on for all users),
cleartext off, legacy storage requested, `enableOnBackInvokedCallback`,
per-app-locale config, `manageSpaceActivity` wired to Settings → app storage.

## Permissions requested (verbatim list)

Platform: `ACCESS_MEDIA_LOCATION`, `ACCESS_NETWORK_STATE`, `ACCESS_WIFI_STATE`,
`FOREGROUND_SERVICE`, `FOREGROUND_SERVICE_DATA_SYNC`,
`FOREGROUND_SERVICE_MEDIA_PLAYBACK`, `GET_PACKAGE_SIZE`, `INTERNET`,
`MANAGE_EXTERNAL_STORAGE`, `PACKAGE_USAGE_STATS`, `POST_NOTIFICATIONS`,
`QUERY_ALL_PACKAGES`, `READ_EXTERNAL_STORAGE`, `RECEIVE_BOOT_COMPLETED`,
`REQUEST_DELETE_PACKAGES`, `REQUEST_INSTALL_PACKAGES`, `USE_BIOMETRIC`,
`USE_FINGERPRINT` (legacy), `WAKE_LOCK`, `WRITE_EXTERNAL_STORAGE`, `WRITE_SETTINGS`

Google/custom: `com.google.android.c2dm.permission.RECEIVE` (C2DM/GCM),
`com.google.android.providers.gsf.permission.READ_GSERVICES`,
`com.google.android.apps.search.omnient.permission.LAUNCH_FROM_EXTERNAL_APP`
(Google app / Omnient surface integration),
`com.android.vending.p2p.APP_INSTALL_API` (Play P2P app install),
`com.google.android.apps.nbu.files.permission.C2D_MESSAGE`,
`com.google.android.apps.nbu.files.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION`
(app-defined signature permission guarding dynamic receivers)

**Not present** (correcting an earlier draft): `READ_MEDIA_IMAGES/VIDEO/AUDIO`,
`CAMERA`, `BLUETOOTH*`, `VIBRATE`, `ACCESS_FINE_LOCATION`. The build relies on
`MANAGE_EXTERNAL_STORAGE` + legacy read/write rather than scoped media grants.

## uses-feature / uses-library / queries

- `uses-feature`: `android.hardware.npu` (required=false — optional NPU
  acceleration for ML), `screen.portrait` (optional), `glEsVersion 0x20000` required.
- `uses-library`: `android.ext.adservices` (optional — Privacy Sandbox API
  surface), `androidx.window.extensions`, `androidx.window.sidecar`
  (foldable/activity-embedding extensions, optional).
- `<queries>` block present (package-visibility declarations).
- `com.google.mlkit.vision.DEPENDENCIES` meta-data value:
  **`document_ui,custom_ica,ica,tflite_dynamite`** — dynamite modules.
- `com.google.android.gms.version` meta-data; Play `com.android.vending` stamps.

## Firebase component registrars (meta-data)

`CommonComponentRegistrar`, `VisionCommonRegistrar`, **`TextRegistrar`**
(text OCR), **`ThinLabelRegistrar`** + **`CustomLabelRegistrar`** (image
labeling), `FilesFirebaseMessagingService`, `FirebaseInitProvider`,
`MlKitInitProvider` + `MlKitComponentDiscoveryService`, and
`AppMeasurement*` service/receiver/job service (Firebase Analytics present).

## Phenotype channels (meta-data, ~13)

`com.google.android.apps.nbu.files.device` (app channel; Clearcut device source
`45461419` seen in `hpt`), `geller`, `gms.auth_account_client`,
`gms.clearcut_client`, `gms.droidguardclient` (DroidGuard attestation),
`gms.gcm`, `gms.icing.mdd` (Mobile Data Download), `gms.measurement`,
`gms.setupservices`, `gms.usagereporting`, `libraries.consentverifier`
(CBVerifier — consent verification), `libraries.notifications.platform` (GNP),
plus `assets/phenotype/*` packages for `performance.primes` (Primes),
`surveys`, `privacy.ptoken.ondevice`, `tiktok_device`, `tiktok_directboot`.

## Activities (all real names)

Core: `home.HomeActivity` (launcher), `home.placeholder.PlaceholderActivity`
(activity-embedding placeholder for split layout),
`documentbrowser.filebrowser.FileBrowserRegularActivity`,
`documentbrowser.filebrowser.SearchActivity`,
`documentbrowser.filebrowser.junkfilesreview.JunkFilesReviewActivity`,
`documentbrowser.filebrowser.reviewbrowser.CardReviewActivity`,
`documentbrowser.fileinfoscreen.FileInfoActivity`,
`documentbrowser.filepreview.FilePreviewActivity` (internal preview incl.
video/audio surfaces — **there is no dedicated MediaPlaybackActivity**),
`documentbrowser.folderinfoscreen.FolderInfoActivity`,
`documentbrowser.browselanding.documentsprovider.DocumentsProviderBrowserActivity`,
`advancedbrowsing.browser.AdvancedBrowsingActivity`,
`advancedbrowsing.picker.AdvancedBrowsingPickerActivity`,
`favorites.browser.FavoritesActivity`, `trash.ui.TrashActivity`,
`managespace.ManageSpaceActivity`, `cards.ui.CardListActivity`,
`snoozing.settings.SnoozedCardListActivity`,
`settings.SettingsActivity` + `settings.about.AboutActivity` +
`settings.language.LanguagePickerActivity`,
`safefolder.auth.SafeFolderAuthActivity` +
`safefolder.browser.SafeFolderBrowserActivity` +
`safefolder.settings.SafeFolderSettingsActivity`,
`tos.TosActivity`, `update.client.ui.forceupdate.impl.ForceUpdateActivity`,
`com.google.mlkit.vision.documentscanner.internal.GmsDocumentScanningDelegateActivity`
(GMS-hosted scanner UI)

Gateways (TikTok nav-gateway pattern + enable-gated preview receivers):
`com.google.apps.tiktok.nav.gateway.GatewayActivity`,
`…AnimatedGatewayActivity`, `gateway.browse.BrowseGatewayHandler`,
`gateway.deeplink.FilesGoDeepLink`,
`gateway.pdf.PdfPreviewIntentGatewayHandler` + `EnablePdfPreviewActivityReceiver`,
`gateway.preview.PreviewActivity` + `EnablePreviewActivityReceiver`,
`gateway.txt.EnableTextPreviewActivityReceiver`,
`gateway.zip.EnableZipPreviewActivityReceiver`,
`gateway.downloads.DownloadsActivity`,
`gateway.savetodownloads.SaveToDownloadsActivity`,
`gateway.storagebreakdown.StorageBreakdownActivity`,
`gateway.storagevolume.StorageVolumeActivity`

Library-host activities: `LicenseActivity`, `LicenseMenuActivity`,
`surveys.internal.view.SurveyActivity` (Google Surveys),
`PlayCoreDialogWrapperActivity`, `PlayCoreMissingSplitsActivity`,
`GoogleApiActivity` (GMS)

Custom intent actions: `…ACTION_SEARCH`, `…LAUNCH_CLEAN_TAB`,
`…LAUNCH_STORAGE_CARDS`, `…VIEW_STORAGE_BREAKDOWN`

Deep links: schemes `fbg-app`, `https`, `content`, `package`; hosts
`files.google.com`, `filesgo.google.com`, `com.google.android.apps.nbu.files`,
`com.android.apps.nbu.files.storagevolume`.
*(Earlier draft said `filesgo://` — wrong; `filesgo` appears only as an https
host and the `FilesGoDeepLink` class name.)*

Notable activity attrs: `excludeFromRecents` on a sensitive surface,
`launchMode` singleInstance/singleTask/singleTop across entries,
`knownActivityEmbeddingCerts` allowlist for split embedding,
`PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED`.

## Services

`mediaconsumption.audio.service.AudioService`
(`foregroundServiceType="mediaPlayback"`, label `@string/audio_service_description`),
`firebase.messaging.FilesFirebaseMessagingService`,
`androidx.pdf.service.PdfDocumentService` + `PdfDocumentServiceImpl`
(**`isolatedProcess="true"`** — sandboxed render) +
`libraries.documents.common.service.PdfRendererService`,
`quicksettings.StorageAssistantTileService` (`QS_TILE` action),
`androidx.work.impl.*` (SystemJobService, SystemForegroundService,
RescheduleReceiver, DiagnosticsReceiver, ForceStopRunnable receiver),
`androidx.room.MultiInstanceInvalidationService` (`directBootAware`),
`apps.tiktok.concurrent.AndroidFuturesService` + `InternalForegroundService`,
`androidx.window.extensions.layout.EngagementModeService`,
`libraries.directboot.DirectBootHelperService`,
`AppMeasurementJobService`/`AppMeasurementService`,
`support.v7.app.AppLocalesMetadataHolderService`,
`PhenotypeMetadataHolderService`, `PropertiesServiceHolder`,
`com.google.firebase.messaging.FirebaseMessagingService` (GMS base)

## Providers

`libraries.safestorage.SafeContentProvider`,
`offlinesharing.foldersharing.FolderSharingContentProvider`
(`content://com.google.android.apps.nbu.files.offlinesharing.foldersharing.provider`,
projection `file_uri|file_dir|file_mime_type`),
`googleguide.GoogleGuideContentProvider`,
`androidx.core.content.FileProvider` + `libraries.storage.storagelib.FileProvider`
(two file providers), `FirebaseInitProvider`, `MlKitInitProvider`
*(no `androidx.startup.InitializationProvider` — corrected)*

## Receivers (app-owned)

`documentbrowser.browselanding.rootcontainerlist.receiver.PackageChangeReceiver`
(PACKAGE_ADDED etc.),
`mediastore.receiver.ContentChangeListenerReceiver` (MediaStore change events),
`trash.manager.impl.TrashDbMigrationBootCompleteReceiver`
(**boot receiver exists specifically for trash DB migration**),
`notifications.receiver.ClearAllNotificationsOnAppUpdateReceiver`,
`offlinesharing.receiver.ShareSheetBroadcastReceiver`
(action `…INTENT_ACTION_SHARESHEET_CHOOSER_RESULT`),
`settings.language.LanguageBroadcastReceiver`,
`toastintegration.receiver.ToastDonationReceiver`,
the four `Enable*PreviewActivityReceiver` gateway gates.
Library receivers: GNP entrypoints (AccountChanged/LocaleChanged/Restart/
TimezoneChanged/Update), `performance.primes.transmitter.LifeboatReceiver`
(Primes), phenotype update/account-removed, tiktok
`experiments.phenotype.ConfigurationUpdatedReceiver`,
`libraries.appdoctor.AppDoctorReceiver`, `FirebaseInstanceIdReceiver`,
`AppMeasurementReceiver`, GrowthKit `TestingToolsBroadcastReceiver`.
*(Earlier draft claimed a media-button receiver — none declared; media buttons
go through MediaSession.)*

## Corrections vs first draft

Fixed: permission list (removed READ_MEDIA_*, CAMERA, BLUETOOTH, VIBRATE),
removed appCategory/largeHeap/usesNonSdkApi/InitializationProvider/media-button
receiver, added ~30 real component names, `fbg-app` scheme, GWP-ASan,
adservices/omnient/p2p surface, DYNAMIC_RECEIVER permission, ML Kit registrar
list, full phenotype channel map, FileBrowserRegularActivity, no dedicated
video activity, boot receiver is trash-migration-specific.
