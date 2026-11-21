# 08 — Date & time customization

Class: `activity.HorizontalCustomDate` (~100 KB) — horizontal custom date/time picker with many date/time fields and controls.

## Capabilities (from SP keys + strings)

- `date_format` (+ per-template `_classic/_dt/_nc/_qr/_reporting`) — selectable date patterns
- `is_24hr` — 12/24h toggle; `is_hr_min_sec` — seconds display
- `time_format_dt`, `time_zone_index`, `TIME_ZONE`/`is_timezone` — timezone label on stamp
- `is_week` — weekday stamp
- `DATE_TIME_COLOR`, `DATE_TIME_COLOR_*` per template
- `IS_PDF_DATE_TIME`/`pdf_date_time` — PDF report timestamp toggle
- Custom/backdated capture time: `HorizontalCustomDate` implies user-selectable date/time for stamps ("custom date" ad slot `CUSTOM_DATETIME_SCREEN_BANNER`)
- `preference_stamp_dateformat`, `preference_stamp_timeformat`, `preference_save_zulu_time` (Open Camera layer)

## Unknowns

- Whether custom date is per-photo or session-scoped (obfuscated wiring)
