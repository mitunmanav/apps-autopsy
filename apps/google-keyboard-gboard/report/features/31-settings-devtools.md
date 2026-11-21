# Settings, experiment flags & developer tooling

## Settings

- Entry: `com.google.android.apps.inputmethod.latin.preference.SettingsActivity` (the only settings activity in the manifest); sibling screens: `LatinSpellCheckerSettingsActivity`, `StylusSettingsActivity`, `PkSimulator{Toggle,Setting}Activity`.
- Fragments (verified in `latin.preference.*`): `PrivacySettingsFragment`, `VoiceSettingsFragment`, **`JetsonVoiceSettingsFragment`** (Jetson voice settings), `AutoCorrectionSettingsFragment`, `CorrectionSettingsFragment`, `GesturePreferenceSettingsFragment`, `PreferencesSettingsFragment`, `AboutSettingsFragment`, **`OverrideFlagPreference`** (flag override UI), **`SettingsSearchIndexablesProvider`** (settings search provider); language settings under `languageselection.preference.*` (`LanguageSettingFragment`, `AddLanguagePreferenceFragment`, `LanguageSpecificSettingFragment`, `KeyboardLayoutListPreference`, `MorseKeyComboPreference`, `LanguageTagListPreferenceFragment`).
- Category headers observed as `settings_header_*` prefs: `language`, `add_language`, `language_specific`, `clipboard`, `translate`, `pk_simulator`, `stylus`, `voice_typing`, `emoji`, `theme`, `privacy`, `dictionary`, `text_correction`, `glide`, `share`, `advanced`, `search` — a standard Gboard settings tree.
- `libraries.inputmethod.settings` + `preferencewidgets` — the settings framework.
- `FlagEditorFragment` — **experiment flag editor** preference (debug/internal builds or behind developer mode).

## Experiment flag system

- Phenotype-driven: `phenotype` metadata `.binarypb` assets declare flags; the `Phenotype` broadcast receivers sync overrides from Play Services' Phenotype service.
- 526 distinct flag keys found in the earlier scan (1,452 flag-like string keys across the tree — the broader set includes pref keys and config params).
- `libraries.inputmethod.flag` + `staticflag` — flag registry; flags gate essentially every feature in this report.
- Distribution of flag keys by area (from the broader scan): emoji 110, writing_tools 55, suggestion 50, voice 26, expression 26, superpack 20, pk_ 20, inline 20, llm 19, training 18, mozc 18, speech 17, split 13, nwp 13, jarvis 13, sticker 12, crank 11, rambler 10, gif 9, tenor 8, theme 7, mdd 7, proofread 6, handwriting 6, translate 5, autofill 5, signboard 4.
- Full extracted key list: [`reference/experiment-flags.txt`](../reference/experiment-flags.txt).
- Flags are **gates**, not proof of runtime behavior — server-side Phenotype values decide what actually activates per device.

## Swiss Army Knife (internal diagnostics)

`apps.inputmethod.libs.swissarmyknife`:

- `DecoderStateReportActivity` — dumps decoder/LM state.
- `QualityBugReportActivity` — quality bug-report flow.
- `CrashResistantSwissArmyKnifeFileProvider` — exports diagnostic state even during crashes.

## Observability

- `libraries.inputmethod.metrics` — metrics namespace (counters like `LATIN_IME`, `BRELLA`, `EXPRESSION` confirmed).
- `ondevicemetricaggregation` — on-device metrics aggregation before upload.
- `dailyping` — daily liveness ping.
- `tracing` — Perfetto/trace integration (`profiling`, `tracing` manifest components).
- `nativeprofiler` (`libs.nativeprofiler`) — native profiling hooks.
- `flogger` — file logger.
- `webdebugbridge` — **WebView debug bridge** (debug-only tooling for web-backed surfaces).
- `appdoctor` — **app self-diagnosis** module.
- `statusmonitors` — device status monitors (battery/network/etc.).
- `userunlock` — direct-boot handling (keyboard available pre-unlock for PIN entry).
- `strictmode` — StrictMode wrappers.

## Other developer surfaces

- `pksimulator` — physical-keyboard simulator (see [25-physical-keyboard](25-physical-keyboard.md)).
- Dev prefs observed: keyboard height multipliers, split-width, "Default layouts for languages", "Disable languages/layouts", "Key code of dictation key", theme dir/file names.
