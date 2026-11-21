# Debug & internal tooling shipped in the APK

Evidence: activity classes below + debug prefs + `notice_board_dev_cloud` strings + `TestingReceiver` + `TestFullScreenActivity` + `RefreshLanguagesScheduledJob` + `msal_ppe_default_config.json` + mock package queries.

## Dev screens present

- `BiboSelectorActivity` — force/preview BiBo model variants.
- `DynamicFeatureListActivity` — inspect Play dynamic modules state.
- `DynamicModelWordsActivity` — dump learned-word model.
- `VoiceDebugOptionsActivity` — voice/Whisper diagnostics.
- `TestFullScreenActivity`, `DeltaBlocklist`/`typeface` test pieces, IME split-test activities.
- `RefreshLanguagesScheduledJob` — manual model-refresh trigger.
- `TestingReceiver` — broadcast receiver for test hooks.
- `notice_board_dev_cloud` — dev-cloud notice-board target.
- Debug prefs: "Debug Info", Fresco debugging toggle, support-dialog "manage data"/support options.

## Environments

- `msal_ppe_default_config.json` — Microsoft PPE cloud.
- Mock apps queried: `mockauthapp`, `mockcp`, `mockltw`, `identity.testuserapp` (auth stubs for dogfood).
- Dogfood signer chains kept in `ts_configuration.jwt`/`signature_config.json` (designer_mobile_dogfood, oneauth_testapp, surface_duo…self_host, launcher daily/rc).
- `experiment_config_*` empty in prod build; populated internally.

## Note

These are dormant for regular users (no launcher entries/gates observed opening them); presence in the retail APK is itself a finding.
