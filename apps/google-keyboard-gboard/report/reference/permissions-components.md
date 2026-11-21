# Declared surface: permissions, components, providers

Evidence: `inspect_android_package` complete record `ev_696dba11…` (manifest text retained), `decode_android_resources` `ev_ef4b3ce0…`.

## Permissions

| Permission | Used for |
|---|---|
| `INTERNET`, `ACCESS_NETWORK_STATE`, `ACCESS_WIFI_STATE` | Tenor/GIF, sticker packs, superpacks/MDD downloads, NGA/S3 voice, Rambler/Muse Gemini calls, emoji search, translate |
| `GET_ACCOUNTS` | Account-aware features (voice typing personalization, backups, NGA) |
| `READ_CONTACTS` | Dictation contact biasing ("Allowing access to contacts … will make dictations more precise") |
| `READ_USER_DICTIONARY`, `WRITE_USER_DICTIONARY` | Personal dictionary + learned words |
| `RECEIVE_BOOT_COMPLETED` | WorkManager reschedule, daily ping |
| `VIBRATE` | Key-press haptics |
| `GET_PACKAGE_SIZE` | Swiss-army-knife / diagnostics |
| `WAKE_LOCK` | Voice capture, training |
| `READ_GSERVICES` | GServices flags |
| `READ_MEDIA_IMAGES`, `READ_MEDIA_VISUAL_USER_SELECTED`, `READ_EXTERNAL_STORAGE` (≤32) | Embedded photo picker, clipboard screenshots, theme-from-photo |
| `RECORD_AUDIO` | Voice typing / dictation |
| `FOREGROUND_SERVICE` | Superpacks foreground task, speech pack downloads |
| `INTERACT_ACROSS_PROFILES` | Work-profile keyboard continuity |
| `CAMERA` | Scan Text OCR, Sign-to-text, theme builder |
| `READ_DEVICE_ORIGIN_FIRST_PARTY` | First-party device detection (Pixel features) |
| `com.google.android.apps.aicore.service.BIND_SERVICE` | **Bind to AICore — Gemini Nano service** |
| `INJECT_KEY_EVENTS` | **Inject key events — physical-keyboard/dictation-key event injection** |
| `PERSONAL_CONTEXT_PUBLISH_HINTS`, `…RECEIVE_INSIGHTS`, `…HOST_INSIGHT_SURFACE` | **Personal Context (ACE): Gboard both publishes hints and hosts an insight surface** |

Declared (signature-level) custom permissions: `pixelbundle.RECEIVER` (knownSigner|signature), `DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` (signature).

Dangerous permissions are declared via `<uses-permission-sdk-23>` (`RECORD_AUDIO`, `CAMERA`, `READ_MEDIA_IMAGES`, `READ_MEDIA_VISUAL_USER_SELECTED`, `INTERACT_ACROSS_PROFILES`, `READ_EXTERNAL_STORAGE` with `maxSdkVersion="32"`) — 19 normal + 6 sdk-23 = **25 permission declarations**.

`<uses-feature>` (7): `android.hardware.faketouch` **required**; optional: `screen.portrait`, `microphone`, `wifi`, `camera`, `camera.any`, `camera.autofocus` — installs anywhere but feature-gates mic/camera paths.

`<uses-native-library>` (application-level, all `required="false"`): `libedgetpu_util.so`, `libedgetpu_client.google.so` — **optional EdgeTPU (Google Tensor NPU)**; `libOpenCL.so`, `libOpenCL-car.so`, `libOpenCL-pixel.so` — **optional OpenCL GPU delegates** (generic + car + Pixel vendor variants, i.e. TF-Lite/MediaPipe GPU inference paths).

## `<queries>` — apps Gboard looks for

`com.google.android.apps.inputmethod.datahound.app` (Gboard dev DataHound), `keyboarddevutils`, `com.google.android.as` + `com.google.android.as.oss` (Android System Intelligence / PCC), `com.google.android.apps.village.boond`, `com.google.android.apps.pixel.customizationbundle` (Pixel theme bundle), `com.google.android.apps.pixel.creativeassistant` (**Creative Assistant — custom sticker source**), `com.google.android.googlequicksearchbox` (Google app), `com.google.android.apps.bard` (**Gemini app**), `com.google.android.apps.internal.betterbug` (internal bug tool), TalkBack packages, `com.google.android.aicore` (**AICore**), embedded photopicker service, `EngagementModeService` (desktop windowing).

## Headline components (73 total)

| Component | Kind | Notes |
|---|---|---|
| `LatinIME` | service, exported | `BIND_INPUT_METHOD`, `directBootAware`, `@xml/method` |
| `LauncherActivity` | activity | LAUNCHER, gated by `@bool/show_launcher_icon` |
| `SettingsActivity` | activity, exported | Settings UI (activity-embedding splits enabled) |
| `SettingsSearchIndexablesProvider` | provider, exported | `READ_SEARCH_INDEXABLES` — settings appear in system search |
| `AndroidSpellCheckerService` | service, exported | `BIND_TEXT_SERVICE` — Gboard doubles as the device spell checker |
| `ClipboardContentProvider` | provider | internal clipboard store |
| `InputDeviceReceiver` | receiver, exported | `QUERY_KEYBOARD_LAYOUTS` — physical-keyboard layout service |
| `InAppTrainingService`, `InAppJobService` | service, `:train` | federated learning |
| `ExampleStoreServiceMultiplexer`, `SpeechPrecomputedFeatureExampleStoreService`, `NwpSanityCheckEvalExampleStoreService` | services | gms.learning `EXAMPLE_STORE`/`_V2` |
| `LocalComputationResultHandlingService`, `FederatedResultHandlingService` | services | `COMPUTATION_RESULT` |
| `SuperpacksForegroundTaskService`, `SuperpacksBackgroundJobService` | services | model/pack downloads |
| `MainProcessInitializationProvider` | provider | app startup |
| `CrashResistantFileProvider`, `InputActionFileProvider`, `CrashResistantSwissArmyKnifeFileProvider` | providers | file sharing / input-action export |
| `WebDebugBridgeContentProvider` | **provider, exported** | web debug bridge (see security doc) |
| `PixelBundleBroadcastReceiver` | receiver, exported | signature-gated Pixel bundle API |
| `AppDoctorReceiver` | receiver, exported (perm-gated) | self-repair framework |
| `PhenotypeUpdateBackgroundBroadcastReceiver`, `AccountRemovedBroadcastReceiver` | receivers | experiment flags, account hygiene |
| `FeatureSplitMultiprocessMetricsService`, `ConfirmationActivity`, `FeatureSplitDebugActivity` | feature-split | on-demand module delivery |
| `PlayCoreMissingSplitsActivity`, `PlayCoreDialogWrapperActivity` | activity | Play Core |
| `InAppTrainingService`, `ComponentDiscoveryService`, `MlKitInitProvider`, `MlKitComponentDiscoveryService` | ML stack | FL + ML Kit |
| `PhysicalKeyboardShortcutsActivity`, `PkSimulatorToggleActivity`, `PkSimulatorSettingActivity` | activities | physical keyboard companion |
| `ThemeBuilderActivity`, `ThemeEditorActivity` | activities | theme builder |
| `StickerPacksManagementActivity`, `StickerFavoritePacksReorderActivity` | activities | sticker management |
| `DecoderStateReportActivity`, `QualityBugReportActivity` | activities | internal quality tools |
| `PermissionsActivity`, `BlankActivity`, `TrampolineActivity`, `EmptyActivity`, `KeyboardActivityResultTrampolineActivity` | activities | flows/infra |
| `CanInteractAcrossProfilesBroadcastReceiver` | receiver | work-profile |
| `CrossProfileConnector_Service` | service | cross-profile connector |
| `SystemForegroundService`, `SystemJobService`, `MultiInstanceInvalidationService`, `MetadataHolderService` | androidx infra | WorkManager, Room, CameraX |
| `LicenseActivity`, `LicenseMenuActivity` | activities | OSS licenses |
| `LatinFirstRunActivity`, `LinkReceivingLauncherActivity`, `SharingLinkReceiveActivity`, `StylusSettingsActivity`, `LatinSpellCheckerSettingsActivity`, `ImageFeedbackActivity`, `StartActivityForResult` | activities | feature entry points |
| `ApkUpdatedReceiver` | receiver | `MY_PACKAGE_REPLACED` |
| `LifeboatReceiver` | receiver, `:primes_lifeboat` | Primes crash/lifecycle metrics |

## Application-level metadata

- `backupAgent` = `…inputmethod.backup.BackupAgent`; `allowBackup`, `restoreAnyVersion`, `killAfterRestore=false`, `crossProfile=true`.
- `android:name` = `HiltLatinApp` (Hilt DI).
- `PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED=true` — two-pane settings on tablets.
- `profileable shell=true` — profilable for perf tooling.
- `com.google.android.backup.api_key` present; `RLZ_BOUNTY_ACCESS_POINT=y0,yg` — install-referrer attribution.
