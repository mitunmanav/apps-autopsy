# 06 — Manual / saved locations

Classes: `activity.LocationActivity` (166 KB decompiled), `activity.AddLocationActivity` (1.42 MB — the largest class in the app package), `model.LoctionModel` (sic), `model.LocationSearchResult`, `helper.utils` (backup export/import), SQLite helper (`gc1` writable database in `helper/utils.java`).

## Purpose

User-curated location list reusable on stamps ("Manual Location" feature string; `feature_manual_location` event). Saved entries stored in a local SQLite database — `helper/utils.java` export code reads cursor columns incl. `loc_radius`, `loc_timestamp` (radius → geo-fence/proximity semantics possible), plus name/address/coords.

## LocationActivity (`ev_2a8fb35f…`)

- `SupportMapFragment` + `LatLng` + fused `LocationRequest` + `LocationSupplier` + RecyclerView of saved places + native ad slot
- Map-based browsing/picking of saved locations; import/export entry points

## AddLocationActivity (`ev_de217966…`)

- Map + search UI for creating/editing manual locations; `LocationSearchResult` model for geocoded search hits

## Import/export (see 15 for crypto detail)

- `helper/utils.java`: export serializes DB rows → JSON `{version:1, app:"GPSMapCamera", timestamp, locations:[…]}` → `CryptoUtils.encrypt` → `.gmc` file to `Documents/GPS Map Camera/Backups` via MediaStore (API≥29)
- Import: file pick → `decrypt` → `InvalidFormat`/`TamperedOrCorrupted`/`Success` → bulk insert in one transaction; toasts `select_gmc_file` / `tampered_backup_file` / `locations_export_failed`

## Constraints

- **Out-of-range limit**: FAQ strings `Why can't I select an Out of Range Manual Location?` — saved locations carry a proximity/range constraint (consistent with `loc_radius` column)
- `Update Manual Location`, `Edit Location Name`, `Edit the location "Line 1"`, `Delete location` — full CRUD; `No new locations to import (all already exist)` — dedupe on import

## Notifications tie-in

`selected_Location`, `location_type` keys drive which manual location is active on stamps; `Map_Type_Clustering` suggests clustered rendering of many saved points.

## Unknowns

- Exact DB schema beyond observed columns (obfuscated `gc1` helper)
- Whether `loc_radius` drives proximity alerts or is just stored metadata
