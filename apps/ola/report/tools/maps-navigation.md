# Tool: Maps & Navigation — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

- **UI entry (obs):** map surfaces inside `NewMainActivity` + `com.ola.mapsorchestrator.showcase.ShowCaseActivity`; background nav via `com.ola.maps.navigation.v5.navigation.NavigationService` (FGS location, obs).
- **Parameter model (inf):** `v1/location/places` geocoding/autocomplete; route polylines over MapLibre GL.
- **Execution path (obs):** `libmaplibre.so` (13.1 MB native GL renderer, hardened: NX+RELRO+SSP+FORTIFY) renders Ola Maps tiles (`maps.olaelectric.com` host string); `NavigationService` provides turn-by-turn FGS.
- **Local vs remote:** hybrid — rendering local (native), tiles/routes remote (inf); offline tile bundle not found (unk).
- **Premium/offline:** map features not premium-gated in evidence; degraded offline to cached tiles only (inf).
- **Input→output:** geo query → place list → selected lat/lng → map camera/route → navigation session (FGS).
- **Unknowns:** tile URL templates, traffic/routing endpoint family, MapLibre style JSON source (asset vs remote).
