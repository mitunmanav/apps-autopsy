# 20 — Settings & persistence

## Screens

`SettingActivity` (main toggles incl. `video_quality` mapping), `SubSettingActivity` (per-camera/template drill-downs, image/video quality pickers 0–3), `FileName_Activity`, `EmailSettingActivity`, `BefAftSettingActivity`, `PDFSettingActivity`, `TempletSettingActivity`, `StampColorActivity`, `HorizontalCustomDate`.

## App-level settings

- `App Theme` / `Dark Mode` strings + `APP_THEME_SCREEN_BANNER` remote ad slot — light/dark theme option
- `Open share options after each capture` — auto-share prompt toggle
- `save_original_photos` ("Auto Save Original Photos — Save two photos - stamped and original") ↔ `is_original_image` key
- Image quality / video quality pickers (0–3)
- `Rate us`, `Choose the shining stars and tap on 'RATE!'.`, `Rate on Google Play` — rating prompts

## Persistence layers

| Layer | Class | Scope |
|---|---|---|
| `helper.SP` | 561 fields; 552 extracted string keys | All app prefs — camera, 6 stamp template variants, reports, PDF, onboarding, storage, premium (full key list: `_evidence/SP_keys.txt`) |
| `helper.SharePref` | `ev_b5641887…` | App-level + template/report values |
| `helper.PreferenceKeys` | `ev_78d3026e…`, 156 keys | Open Camera engine prefs (`_evidence/PreferenceKeys.txt`) |
| `helper.Default` | constants | Defaults: `DEFAULT_FOLDER_NAME`, `DEFAULT.LANGUAGE` |
| `helper.DynamicUnitUtils` | — | Metric/imperial conversions (`temprature_type`, wind, pressure selects) |
| `helper.CamelCaseConverter`, `helper.KotlinHelper`, `helper.CommonFunction`, `helper.GeneralUtils`, `helper.HelperClass` (`showSnackBar`), `helper.HandleSystemKeys`, `helper.CPD`(progress dialog), `helper.a/b/c/d` | utilities |
| Room + DataStore + WorkManager | bundled | DB/prefs/jobs (DataStore `libdatastore_shared_counter.so`) |

## Cross-references

- Every stamp element/color/position → see 04 key table
- Engagement counters & alarms → see 18
- Storage/SAF → see 10

## Unknowns

- `RVWV`, `ent_image_uri`, `open_time`, `m_pdf_bef_aft_logo` semantics partially inferred
