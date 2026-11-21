# 07 — Maps integration

## SDK

**Google Maps SDK for Android** bundled (`ev_5532500e…`): `GoogleMapOptions`, `MapView`, `SupportMapFragment`, `CameraPosition`, `LatLng`, `LatLngBounds`. No `osmdroid` classes (`ev_e3573e6b…`). API key (shipped resource value, validity unverified): `AIzaSyD741…[redacted]`.

## Map features on stamps ("Image on Map")

Per-template keys: `is_map`, `map_type_template` (normal/satellite/hybrid/terrain typical), `map_zoom_scale` (zoom level), `map_pos` + `map_pos_type` (thumbnail placement: `Map Position` string), `Map Scale` string, `Map_Type_Clustering` (clustered markers when stamping many saved locations — `ImageClusterActivity` + "Cluster" in `clusterImage` package name).

## Map-driven screens

- `LocationActivity`/`AddLocationActivity`: `SupportMapFragment` + fused `LocationRequest` — browse/pick/save manual locations
- `ImageClusterActivity` (`clusterImage.activity`): renders photo thumbnails clustered on a map (cluster map of captures)
- `MediaViewerActivity` (~line 1331): opens `https://maps.google.com/?q=<lat>,<lng>` — tap photo location → external Google Maps
- `maps.google.com` / `www.google.com/maps/place/` share links in strings

## Settings

`map_type`, `map_pos`, `map_pos_type`, `map_zoom_scale`, `is_map_tooltip_shown`, `alarm_time_map_open_time` (engagement), `FILE_FOLDER_MAP_TEMPLATE_COUNT` (remote config — file/folder/map template counter for ad cadence).

## Unknowns

- Whether map thumbnails render via Maps SDK lite/static snapshot or `MapView` screenshot (no `mapsstatic` URL found → SDK snapshot likely)
- Clustering library identity (strings only)
