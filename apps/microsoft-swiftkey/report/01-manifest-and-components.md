# 01 — Manifest, components & permissions

Decoded manifest: `_work/manifest.xml` (39,616 B). Evidence `ev_09555907…` (`inspect_android_package`).

## Permissions (19 requested, 1 defined)

Defined signature permission: `com.touchtype.swiftkey.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` (`signature` level — gates dynamic receivers).

Requested:

| Permission | Purpose in app |
|---|---|
| `INTERNET`, `ACCESS_NETWORK_STATE`, `ACCESS_WIFI_STATE` | all cloud features |
| `WAKE_LOCK`, `VIBRATE` | sync/telemetry, key haptics |
| `READ_EXTERNAL_STORAGE` (maxSdk 32), `WRITE_EXTERNAL_STORAGE` | legacy media/save-model exports |
| `READ_MEDIA_IMAGES`, `READ_MEDIA_VISUAL_USER_SELECTED` | photo picker for custom themes/photo stickers |
| `POST_NOTIFICATIONS` | tips/upgrades/cloud-clipboard notices |
| `RECEIVE_BOOT_COMPLETED` | reschedule jobs at boot (`BootReceiver`) |
| `RECORD_AUDIO` | voice typing |
| `CAMERA` | keyboard camera panel |
| `NFC` + `HIGH_SAMPLING_RATE_SENSORS` | smart-card/YubiKey NFC sign-in; high-rate touch sampling for typing geometry |
| `INTERACT_ACROSS_PROFILES` | work-profile sync (`crossProfile="true"`) |
| `com.google.android.c2dm.permission.RECEIVE` | FCM push |
| `com.google.android.gms.permission.AD_ID` | ads/attribution ID |
| `com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE` | Play install referrer (Adjust) |
| `com.swiftkey.languageprovider.READLANG`, `com.swiftkey.swiftkeyconfigurator.READCONFIG` | OEM language-provider/configurator apps |

`uses-feature` (optional): `telephony`, `usb.host`, `nfc`.

## Exported surface (attack surface)

**Exported=true components**:

| Component | Filter | Notes |
|---|---|---|
| `com.touchtype.KeyboardService` (service) | `android.view.InputMethod`, perm `BIND_INPUT_METHOD` | the IME itself — required exported |
| `com.touchtype.LauncherActivity` (+aliases `LauncherActivityIcon`, `LauncherActivityFromSystemSettings`) | MAIN / LAUNCHER | settings entry |
| `com.touchtype.deeplinking.DeepLinkingHandlerActivity` | VIEW BROWSABLE `swiftkey://*` and `com.touchtype.swiftkey://*` | deep links |
| `…ShareDeepLinkingHandlerActivity` | VIEW BROWSABLE `https://share.swiftkey.com` | share sheet |
| `com.touchtype.AskBingAlias` (alias) | `android.intent.action.PROCESS_TEXT` `text/plain` | "Ask Copilot" from any app's selected-text menu |
| `com.touchtype.BootReceiver` | `BOOT_COMPLETED` | |
| `com.touchtype.LocaleChangeReceiver` | `LOCALE_CHANGED` | |
| `com.touchtype.TestingReceiver`, `…$TelemetryExposeDoneReceiver` | `com.touchtype.action.EXPOSE_TELEMETRY_DONE` (scheme `@string/telemetry_expose_done_data_scheme`) | **exported test/debug receivers ship in the market build** |
| `com.microsoft.tokenshare.AccountChangeReceiver` | `com.microsoft.tokenshare.SIGNIN_COMPLETED` data `scheme=package` | MS SSO broadcast |
| `com.microsoft.tokenshare.TokenSharingService` | action `com.microsoft.tokenshare.TokenSharingService` | bound SSO service; access controlled by signature checks in `ts_configuration.jwt` allowlist |
| `com.google.firebase.iid.FirebaseInstanceIdReceiver` | `c2dm.intent.RECEIVE` perm `c2dm.SEND` | FCM |
| `com.microsoft.identity.client.BrowserTabActivity`, `CurrentTaskBrowserTabActivity` | VIEW BROWSABLE `com.touchtype.swiftkey-auth://*` | MSAL auth redirect |
| `com.google.android.gms.auth.api.signin.RevocationBoundService` | perm `REVOCATION_NOTIFICATION` | Google sign-in revocation |
| `androidx.profileinstaller.ProfileInstallReceiver` | profileinstaller actions, perm `DUMP` | baseline profile install |

All other components are non-exported.

## App-declared components (functional roles)

- **IME**: `KeyboardService` (Hilt) — declared via `method.xml` with `settingsActivity=LauncherActivityFromSystemSettings`, 156 subtypes.
- **Prediction**: `FluencyServiceImpl` (bound service, non-exported).
- **Sync/telemetry/jobs**: `SyncService`, `SyncScheduledJob`, `SwiftKeyJobService`, `TelemetryService`, `TelemetryJobIntentService`, `PaperBoyAvroService`, `RefreshLanguagesScheduledJob`, `FederatedExperimentationService` (+`WorkerService`), `IMEEnabledDetectorService`.
- **Push**: `SwiftKeyFirebaseMessagingService` on `com.google.firebase.MESSAGING_EVENT`.
- **Settings UI**: `SwiftKeyPreferencesActivity`, `NavigationActivity`, `AccountSettingsActivity`, `LanguagesActivity`, `ThemesActivity`, `CustomThemeDesignActivity`, `BackgroundImageEditorActivity`, `ClipboardActivity`, `ResizeContainerActivity`, `RewardsActivity`, `AchievementsActivity`, `HelpImproveActivity`, `AboutLibrariesActivity`, `TipsActivity`, `CrowdsourcingLauncherActivity`.
- **Feature activities**: `CameraActivity`, `AskBingActivity`, `VoiceInputHelperActivity`, `VoiceDebugOptionsActivity`, `GetRuntimePermissionActivity`, `DialogActivity`, `SafeIntentStartingActivity`, `ImportContentActivity`, `NotificationHandlerActivity`, `NoInstaller`, `BiboSelectorActivity`, `DynamicFeatureListActivity`, `DynamicModelWordsActivity`, `CustomTabLauncherActivity`.
- **Enterprise**: `CrossProfileConnector_Service` (Google ConnectedApps).
- **Providers**: `androidx.core.content.FileProvider` (authorities in `image_share_filepaths.xml`), `InitializationProvider` (androidx startup), `FirebaseInitProvider`, `adjust SystemLifecycleContentProvider`. No custom exported ContentProvider; OEM config comes via the external `com.swiftkey.swiftkeyconfigurator` provider read with `READCONFIG` perm.

## `<queries>` — what the app can see/call

Packages: `com.touchtype.swiftkey.cesar` (dogfood sibling), `com.swiftkey.swiftkeyconfigurator(.debug)`, `com.swiftkey.languageprovider`, `com.microsoft.translator`, `com.microsoft.todos`, `com.microsoft.bing`, `com.microsoft.bingintl`, `com.microsoft.amp.apps.bingnews`, `com.microsoft.office.officehubrow`, `com.azure.authenticator`, `com.microsoft.windowsintune.companyportal` (Intune broker), `com.microsoft.identity.testuserapp`, `com.microsoft.appmanager`, mock auth apps (`mockauthapp`, `mockcp`, `mockltw` — internal test hooks left in manifest), `com.google.android.webview`, `androidx.test.orchestrator` (test hook).

Intents: speech `RecognitionService` (voice), `market://` VIEW, `https://share.swiftkey.com` VIEW, `com.touchtype.swiftkey-auth` VIEW, generic `https` BROWSABLE VIEW, `SEND text/plain`, generic `VIEW`/`EDIT`, `android.support.customtabs.action.CustomTabsService` (custom tabs), `com.microsoft.tokenshare.TokenSharingService` (SSO discovery).
