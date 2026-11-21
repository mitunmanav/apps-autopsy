# Themes

Evidence: `assets/themes/*/style.json` (11 entries), `themes_*`/`theme_*` strings, `ThemesActivity`, `bibomodels.themesfeaturedbanner.*`, `appconfig/themes/featured_banner/`, `notice_board_theme_reverted*`, `com.touchtype.keyboard.theme.bing.*`, `com.touchtype.themes.receivers.*`.

## Theme engine

- A theme = a directory `assets/themes/<uuid>/` with **`style.json`** + `material_resources/<dpi>/*.png`.
- `style.json` declares **layered assets** keyed by numeric element ids (e.g. `"182344"`), each entry = `layers[]` of shaped/positioned tiles: `shape RECTANGLE`, `corners` radii, `solid` colors (ARGB hex like `CCF5F5F5`), `padding`, `text_padding`, `asset` references (`e6351af`), `fallback_color`, `resolutions` (ldpi→xxxhdpi paths + sha1). The renderer composites these layers into key backgrounds, borders, icons, toolbar, panels.
- Themes are thus **declarative style sheets** — colors, corner radii, iconography, spacing — not layout XML.

## Bundled set

| Dir | Name |
|---|---|
| `7c610bde-6840-4f22-824f-c3d71efffb61` | **Fluent Adaptive** (default, `pref_default_themeid`; also `pref_accessibility_themeid`) |
| `43ffed79-…` | Light |
| `c9161612-…` | Dark |
| `82f54162-…` | Adaptive |
| `85b5d0c6-…` | High Contrast |
| `high_contrast` | High Contrast Minimal |
| `49452771-…` | Huawei |
| `8f73b09e-…` | Sony Alt |
| `custom_theme_base` | Theme Customiser (base for user designs) |
| `incognito` | New incognito — **distinct keyboard skin while incognito is on** |

OEM presets (Huawei, Sony Alt) ship for partner devices.

## Theme store/UX

- `ThemesActivity` + `themes_*` strings — theme browser with preview; `theme_editor_*` (pinch zoom preview); theme packs downloadable from CDN (jenson/assets hosts); featured banner (`themes_featured_banner_v2.zip` → aquamarine/sports/bing_daily banner images + `FeaturedBannerEntry/Metadata/TargetType` BiBo model).
- `notice_board_theme_reverted*` — if a theme fails/corrupts after upgrade ("We have enhanced our themes under the hood…"), app reverts + offers restore link.
- `theme_error_incognito_mode` — theme locked while incognito.
- `com.touchtype.themes.receivers.*` — theme-related broadcast receivers (download/apply events).
- Dark-aware resources: `drawable-night`, `color-night` trees + adaptive theme "Adaptive"/"Fluent Adaptive" follow system dark mode [inferred].

## Bing daily theme — see `bing-daily-theme.md`. Custom themes — see `custom-themes.md`.
