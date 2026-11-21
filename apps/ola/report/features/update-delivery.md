# Feature Module: Update & Code Delivery — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

## Three delivery channels (obs)

### 1. Play in-app update + force upgrade
- `com.google.android.play.core.*` (PlayCoreDialogWrapperActivity) + `com.olacabs.inappupdate` (~18 classes, obs).
- `yoda.rearch.upgrade.ForceUpgradeActivity` — hard gate screen (obs).
- Split config already in use (this artifact set is a split install).

### 2. Play Asset Packs
- `AssetPackExtractionService` (exported) + `ExtractionForegroundService` (fgst=dataSync) → on-demand/dynamic feature/asset delivery (obs components; which packs: unk — none found in base assets listing).

### 3. CodePush OTA (JS)
- `com.microsoft.codepush.react.*` + deployment key string → RN bundle can be replaced without store review (obs classes + key; production enablement unk).

## Versioning artifacts
- `ProfileInstallReceiver` (baseline profiles), `InitializationProvider` (App Startup), `ForceStopRunnable$BroadcastReceiver` (WorkManager).
- `RestartActivity` in `:restart` process — post-crash recovery entry (obs).

## Flow (inf)
Launch → version check (server or Play API) → `ForceUpgradeActivity` if below min version → Play update dialog / direct to store. Independently, CodePush sync can swap the payments JS bundle.

## Unknowns
- Min-version policy endpoint, staged rollout logic.
- Asset pack names/contents.
- CodePush key environment (staging vs production key embedded: unk which).
