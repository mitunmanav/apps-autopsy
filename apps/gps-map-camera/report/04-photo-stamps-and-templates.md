# 04 — Photo stamps & templates

Core classes: `TempletSelectionActivity`, `TempletSettingActivity`, `StampColorActivity`, `HorizontalCustomDate`, `sticker.StickerView`, `sticker.CJbv.PwHGfuszkTw` (obfuscated), `dragView.DragLinearLayout`, `helper.BitmapRefectore`, `helper.RoundImageView`, `helper.RoundedCornerLayout`, `model.TemplateModel`, `model.ColorModel`, `helper.ColorDiffCallback`.

## Template families — 6 variants

`SP` keys are suffixed per template: default (advance), `_classic`, `_nc` (navigation/compass), `_dt` (date-time), `_qr`, `_reporting`. Analytics names (`FBEventUtils`): `default_phototemp_advanced/classic/date_time/navigation/reporting/sacnlocation`(typo in binary) and matching `default_videotemp_*` — each template has a photo and video variant. Strings: `Classic template`, `Advance Template`, plus QR/location-scan and reporting templates.

## Stamp data elements (each has show/hide `is_*`, `*_COLOR`, and format `*_select`/`*_index` keys)

| Element | Keys | Notes |
|---|---|---|
| Address | `is_address` + `is_address_city/state/country/pincode`, `is_main_address`, `is_short_address`, `ADDRESS_COLOR`, `SHORT_ADDRESS_COLOR`, `address_index`, `is_line_1..4` | Multi-line granularity + per-part colors |
| Coordinates | `is_lat_lng_template`, `lat_lng_type_1`, `LAT_LNG_COLOR`, `lat_lng_index`, `is_dms_file` | Lat/lng formats incl. DMS (`LocationSupplier.locationToDMS`) |
| Plus code | `is_plus_code`, `plusCodeType`, `plus_code_index` | Google Plus Codes |
| Altitude/elevation | `is_altitude`, `is_elevation`, `ALTITUDE_COLOR`, `altitude_select` | EGM96-corrected + Open-Meteo elevation |
| Accuracy | `is_accuracy`, `ACCURACY_COLOR`, `accuracy_select` | GPS accuracy |
| Compass/azimuth | `is_compass`, `is_azimuth_nc`, `COMPASS_COLOR`, `compass_value`, `compass_found` | |
| Magnetic field | `is_magnetic_field`, `magnetic_field_value` | µT sensor |
| Date/time | `is_date_time`, `DATE_TIME_COLOR`, `date_format`, `is_24hr`, `is_hr_min_sec`, `time_format_dt` | See 08 |
| Timezone | `is_timezone`, `TIME_ZONE`, `time_zone_index` | |
| Weather | `is_weather`, `WEATHER_COLOR`, `temprature_type` (°C/°F), `temprature_value`, `weather_icon`, `is_weather_once` | OpenWeatherMap |
| AQI | `is_aqi_level_nc`, `is_call_aqi_once` | air_pollution endpoint |
| Humidity | `is_humidity` | from weather payload |
| Pressure | `is_pressure`, `PRESSURE_COLOR`, `pressure_select`, `Pressure_value` | |
| Wind | `is_wind`, `WIND_COLOR`, `wind_select` | |
| Sound level | `is_soundlevel`, `SOUNDLEVEL_COLOR`, `SOUND_VALUE`, `sound_level` | `SoundLevelMeter` |
| Notes/hashtags | `is_notes`, `notes_hashtag`, `NOTES_HASHTAG_COLOR`, `notes_index`, `ask_note_every_time` | See 11 |
| Person/contact | `is_personname`, `PERSON_NAME`, `is_contact_number`, `CONTACT_NUMBER`, `user_name` | |
| Sequence/numbering | `is_sequence`, `is_numbering`, `SEQUENCE`, `sequence_value`, `is_increment`, `sn_index`, `PREFIX`, `SUFFIX` | Auto-incrementing file/stamp counter |
| Custom fields | `is_cus_1..3`, `cus_1..3_value/index` | 3 user-defined fields |
| Logo | `is_logo`, `logo_uri`, `m_pdf_bef_aft_logo` | `Show App Logo` toggle |
| Map thumbnail | `is_map`, `map_type_template`, `map_zoom_scale`, `map_pos`/`map_pos_type`, `Map_Type_Clustering` | See 07 |
| Week | `is_week` | Weekday on stamp |
| Watermark/header | `is_water_mark`, `header_show` | |
| Reporting extras | `REPORT_TAG_REPORTING`, `REPORT_COLOR_REPORTING`, `REPORT_BACKGROUND_COLOR_REPORTING`, `is_orientation_label_nc` | |

## Styling controls

- `stamp_font_name`/`stamp_font_style` (bundled TTF assets), `stamp_size`, `stamp_pos` (9-position grid typical), `stamp_pos_type`
- `StampColorActivity` — RecyclerView + `ColorModel`/`ColorDiffCallback` list picker per element color
- `TempletSettingActivity` — many get/set-style methods for template config
- `StickerView` — `FrameLayout` with touch matrix transforms (drag/scale/rotate stamps on preview); `DragLinearLayout` — draggable stamp positioning
- `BACKGROUND_COLOR`, `TEXT_COLOR`, `BACKGROUND_BORDER_COLOR` theme keys

## QR / Scan Location Template

- `QR Code Detection`, `Scan Location Template` strings + `_qr` template family + `default_*temp_sacnlocation`[sic] events: templates can be **shared/applied via QR code** (ML Kit Barhopper scanner bundled, `Barcode128` generation via iText). A user can scan a code to clone a location-stamp template.
- `Share Media`, `Share Photo`, `Location Share`, `Open share options after each capture` — share flows incl. template/media sharing.

## Analytics

`feature_addtext`, `feature_manual_location`, `feature_share_capture`, `feature_share_preview`, `feature_share_imgonmap_preview` — share/save of stamped previews tracked.

## Unknowns

- Exact per-template default layouts (resources hold layouts; obfuscated mapping)
- Video-frame stamping implementation detail (video templates exist per analytics)
