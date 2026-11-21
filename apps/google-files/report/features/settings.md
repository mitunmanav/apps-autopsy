# Feature: Settings & permissions UX

## `SettingsActivity` + `settings` namespace (verified names)

- `settings.SettingsActivity` + `settings.about.AboutActivity` +
  `settings.language.LanguagePickerActivity` (+ `LanguageBroadcastReceiver`
  for per-app-locale changes; `android:localeConfig` declared) +
  `snoozing.settings.SnoozedCardListActivity` (snoozed cards mgmt) +
  `tos.TosActivity` (terms) + `SafeFolderSettingsActivity` (vault prefs).
- Toggle surfaces: hidden files, notification prefs, Safe Folder config
  (change password, biometric unlock), trash auto-empty, sharing prefs,
  storage-assistant opt-ins.
- `permissions` namespace — runtime-permission education + deep-link into
  system settings for `MANAGE_EXTERNAL_STORAGE`, usage stats.
- OSS licenses surfaces: `LicenseActivity`/`LicenseMenuActivity`.

## Quick settings

- `quicksettings` namespace + `StorageAssistantTileService` — QS tile for
  one-tap storage cleanup entry.

## Evidence

Activities, namespaces, tile service, settings strings.

## Unknowns

- Complete preference key map (obfuscated `SharedPreferences` keys — partial
  recovery via `*_pref` strings).
- Which settings are phenotype-overridden (server-forced values possible).
