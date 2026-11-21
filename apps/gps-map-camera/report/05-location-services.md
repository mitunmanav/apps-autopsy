# 05 — Location services

Classes: `helper.LocationSupplier`, `helper.EGM96`, `helper.DeviceUtils`, `CameraActivity` (location consumers), fused-location provider (Play Services `LocationRequest` observed in `LocationActivity`/`AddLocationActivity`).

## Acquisition

- `LocationSupplier` (`ev_56c7bd68…`): wraps `Context`, holds `mLocation`, `getLocation()`, `setLocation(Location)`, `locationToDMS(double)` — DMS conversion for stamps/file names
- Fused location via Google Play Services (`LocationRequest` fields in map activities)
- `Geocoder` used for address resolution (`Address`/`Geocoder` imports in `CameraActivity`)
- Current-location cache keys: `loc_address_line_1`, `loc_city`, `loc_state`, `loc_country`, `loc_pincode`, `loc_CountryCode`, `latitude_1`, `longitude_1`, `selected_Location/LATITUDE/LONGITUDE`

## Coordinate formats on stamps

- Decimal degrees, DMS (`locationToDMS`), `lat_lng_type_1` variants
- **Plus Code** (`plus_code_index`, `plusCodeType`)
- **MGRS, USNG** and **UTM** strings — grid/military reference formatting present
- GPS direction/compass (`preference_gps_direction`, azimuth)

## Altitude correction — EGM96

`helper.EGM96`: singleton; `LoadEGM96Grid` runnable loads `R.raw.ww15mgh` (WW15MGH EGM96 geoid-undulation grid) into `filesDir`; `EGM96_VALUE_INVALID=-10000`. Converts GPS ellipsoid height → mean-sea-level altitude for the `Altitude`/`is_elevation` stamps. Fallback/supplement: Open-Meteo elevation API call in `CameraActivity` (`api.open-meteo.com/v1/elevation`, keyless).

## Integrity / anti-spoof signals

- Mock-location detection → `detect_fake_gps` analytics event + user warning (mock-location strings)
- VPN detection → `vpn_title`/`vpn_desc` dialog in `CameraActivity` (`detect_vpn` event)
- `compass_found`, `compass_value`, `magnetic_field_value` — sensor availability flags

## Sensor inputs feeding stamps

GPS (lat/lng/accuracy/altitude), compass/azimuth (rotation sensors), magnetic field (µT), pressure (barometer), plus network-derived weather/AQI (see 03) and sound level (microphone).

## Unknowns

- Update interval/priority of `LocationRequest` (obfuscated constants)
- Whether geocoding runs on-device (`Geocoder` present → likely) or via a web service — no geocode HTTP URL found, so platform `Geocoder`
