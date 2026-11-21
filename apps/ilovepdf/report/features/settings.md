> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Settings

## How it works
`SettingsFragment`/`SettingsActivity` (+ `settings` nav): account section
(profile, subscription `subscriptionmodel`, delete), **storage** (default
output folder `default_output_location`, external-path picker
`ChooseExternalPathFragment`, `ChoosePathFragment`), **tools** defaults
(`reset_all_tools_defaults` → `StoreToolsParamsInterface` clear),
language/theme (`LanguageUtils`, `dark_theme` prefs), OCR language packs,
legal (`WebViewActivity` → `ilovepdf.com/{terms,privacy,legal-notice,cookies}`),
contact (Freshdesk), version (`versionName 4.2.3`, `check_app_version` updates
via mobile service). State in `SettingsDBModel` + DataStore.
