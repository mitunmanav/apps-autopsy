> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e1…ad41`. Static analysis; no runtime evidence.

# 12 — Complete component & screen map (A→Z)

Every manifest-declared component, grouped by its own package. `[E]` = exported.

## Activities — all 75 declared

### `(root)` (4)
- `MainActivity` — E; VIEW
- `fb:CustomTabActivity` — E; VIEW
- `fb:CustomTabMainActivity`
- `fb:FacebookActivity`

### `androidx:credentials.playservices.controllers.identityauth` (1)
- `HiddenActivity`

### `androidx:credentials.playservices.controllers.identitycredentials` (1)
- `IdentityCredentialApiHiddenActivity`

### `androidx:glance.appwidget.action` (2)
- `ActionTrampolineActivity`
- `InvisibleActionTrampolineActivity`

### `billing:.api` (2)
- `ProxyBillingActivity`
- `ProxyBillingActivityV2`

### `crash_handler` (1)
- `UnhandlerCrashActivity`

### `dropbox:core.android` (1)
- `AuthActivity` — E; scheme:db-xntw8za866940lz

### `genius:readablecodeflow` (1)
- `ReadableCodeScanActivity`

### `genius:scanflow` (1)
- `ScanActivity`

### `google:android.gms.auth.api.signin.internal` (1)
- `SignInHubActivity`

### `google:android.gms.common.api` (1)
- `GoogleApiActivity`

### `google:android.play.core.common` (1)
- `PlayCoreDialogWrapperActivity`

### `hms:hms.activity` (2)
- `BridgeActivity`
- `EnableServiceActivity`

### `ilovepdf-sdk:dropboxsdk` (1)
- `DropboxXiLovePDFAuthActivity`

### `ilovepdf-sdk:signaturekit` (1)
- `SignatureActivity`

### `msal:identity.client` (2)
- `BrowserTabActivity` — E; VIEW
- `CurrentTaskBrowserTabActivity` — E

### `msal:identity.client.helper` (1)
- `BrokerHelperActivity`

### `msal:identity.common.internal.broker` (2)
- `BrokerActivity`
- `InstallCertActivityLauncher`

### `msal:identity.common.internal.providers.oauth2` (3)
- `AuthorizationActivity`
- `CurrentTaskAuthorizationActivity`
- `SilentAuthorizationActivity`

### `nutrient:document.printing` (1)
- `PrintActivity`

### `nutrient:ui` (1)
- `PdfActivity`

### `ui.activity` (31)
- `BinFilesActivity`
- `BlocksDemoActivity`
- `ChangePreferencesTransitionActivity`
- `CloudFilePickerActivity`
- `ContactFormActivity` — E
- `CreatePdfActivity`
- `CreditsActivity` — E
- `DebugActivity` — E
- `DeleteAccountInfoActivity`
- `DriveSignInActivity`
- `DropboxSignInActivity`
- `EditProfileActivity` — E
- `FileSelectionActivity`
- `InAppPromoActivity`
- `InterstitialActivity`
- `LoginActivity`
- `MSGraphSignInActivity`
- `NPSActivity`
- `NewDebugActivity`
- `NewsDetailActivity`
- `OcrLanguageActivity`
- `PdfReaderActivity`
- `PremiumCategoriesActivity`
- `PurchasesActivity` — E
- `QueryFilesActivity`
- `SSODeepLinkActivity` — E; VIEW
- `ShowcaseActivity`
- `SplashScreenActivity` — E; MAIN
- `SubscriptionDoneActivity` — E
- `TxtReaderActivity` — E; VIEW
- `WebViewActivity` — E

### `ui.activity.companion_scanner` (3)
- `CompanionScannerActivity` — E
- `CompanionScannerErrorActivity`
- `DiscoverAppActivity`

### `ui.activity.imageViewer` (1)
- `ImageActivityCompose` — E; VIEW

### `ui.activity.intent_filters` (2)
- `IntentFilterToolActivity` — E; SEND
- `ReadPdfActivity` — E; VIEW

### `ui.activity.new_scanner` (1)
- `ScannerActivity`

### `ui.activity.scanner` (1)
- `ScannerActivity`

### `ui.activity.scanner.enhancement` (1)
- `PageEnhancementActivity`

### `ui.activity.tools` (2)
- `SingleChoiceActivity`
- `ToolsExecutionActivity`

### `yubico:yubikit.android.ui` (2)
- `OtpActivity`
- `YubiKeyPromptActivity`

## Services — 23 declared
- `androidx.camera.core.impl.MetadataHolderService`
- `androidx.core.widget.RemoteViewsCompatService`
- `androidx.credentials.playservices.CredentialProviderMetadataHolder`
- `androidx.glance.appwidget.GlanceRemoteViewsService` — E
- `androidx.room.MultiInstanceInvalidationService`
- `androidx.work.impl.background.systemjob.SystemJobService` — E
- `androidx.work.impl.foreground.SystemForegroundService`
- `com.android.ilovepdf.service.ToolExecutionService` — E
- `com.android.ilovepdf.service.cloud.DownloadCloudFileService`
- `com.android.ilovepdf.service.cloud.SaveCloudFileAsCopyService`
- `com.android.ilovepdf.service.cloud.UpdateCloudFileService`
- `com.android.ilovepdf.service.cloud.UploadFileToCloudService`
- `com.android.ilovepdf.service.companion.scanner.ImageUploadService`
- `com.android.ilovepdf.service.tools.ForegroundToolExecutionService`
- `com.google.android.datatransport.runtime.backends.TransportBackendDiscovery`
- `com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService`
- `com.google.android.gms.auth.api.signin.RevocationBoundService` — E
- `com.google.android.gms.measurement.AppMeasurementJobService`
- `com.google.android.gms.measurement.AppMeasurementService`
- `com.google.firebase.components.ComponentDiscoveryService`
- `com.google.firebase.sessions.SessionLifecycleService`
- `com.google.mlkit.common.internal.MlKitComponentDiscoveryService`
- `com.huawei.agconnect.core.ServiceDiscovery`

## Receivers — 18 declared
- `androidx.glance.appwidget.MyPackageReplacedReceiver` — MY_PACKAGE_REPLACED
- `androidx.glance.appwidget.UnmanagedSessionReceiver`
- `androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver`
- `androidx.profileinstaller.ProfileInstallReceiver` — E
- `androidx.work.impl.background.systemalarm.RescheduleReceiver` — BOOT_COMPLETED
- `androidx.work.impl.diagnostics.DiagnosticsReceiver` — E
- `androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver`
- `com.android.ilovepdf.service.broadcast.TabsBroadcastReceiver` — E; BOOT_COMPLETED
- `com.android.ilovepdf.service.cloud.CloudActionsReceiver` — E; BOOT_COMPLETED
- `com.android.ilovepdf.service.cloud.CloudUploadStateReceiver` — E; BOOT_COMPLETED
- `com.android.ilovepdf.service.tools.ToolTaskReceiver` — E; BOOT_COMPLETED
- `com.android.ilovepdf.widgets.receiver.WidgetPinnedReceiver`
- `com.android.ilovepdf.widgets.receiver.WidgetRecentToolsReceiver` — E
- `com.android.ilovepdf.widgets.receiver.WidgetScanReceiver` — E
- `com.facebook.AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver`
- `com.facebook.CurrentAccessTokenExpirationBroadcastReceiver`
- `com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver`
- `com.google.android.gms.measurement.AppMeasurementReceiver`

## Providers — 9 declared
- `androidx.core.content.FileProvider`
- `androidx.startup.InitializationProvider`
- `com.facebook.internal.FacebookInitProvider`
- `com.google.firebase.provider.FirebaseInitProvider`
- `com.google.mlkit.common.internal.MlKitInitProvider`
- `com.huawei.agconnect.core.provider.AGConnectInitializeProvider`
- `com.pspdfkit.document.sharing.DocumentSharingProvider`
- `com.pspdfkit.initialization.InitializationProvider`
- `com.pspdfkit.media.AssetsContentProvider`
