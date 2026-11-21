# Reference — Binary Contents & Assets

## DEX files

| File | Size | Contents |
|---|---|---|
| `classes.dex` | 11,845,616 | app + most libraries |
| `classes2.dex` | 46,976 | spillover |
| `classes3.dex` | 7,550,676 | libraries |
| `classes4.dex` | 3,953,216 | libraries |
| `assets/audience_network/classes{,2}.dex` | 57 KB + 5.2 MB | Meta FAN runtime dex (dynamic code loading) |

## Native libraries — **lives in the split, not base**

`base.apk` has **no `lib/`** (extractNativeLibs=false but no .so files bundled).
`split_config.arm64_v8a.apk` (53 KB) contains:
- `lib/arm64-v8a/libandroidx.graphics.path.so` (10,096 B)
- `lib/arm64-v8a/libdatastore_shared_counter.so` (7,112 B)
- `stamp-cert-sha256` (Play source stamp)

**Correction to ../01-overview/00-identity-packaging.md:** the split is *not* a manifest stub — it carries the two
real .so files plus the Play stamp. App ships almost no native code (Compose/DataStore libs only).

## Assets (18)

| Asset | Purpose |
|---|---|
| `assets/ad-viewer/omid-session-client-v1.js`, `omsdk-v1.js` | **IAB Open Measurement SDK** — ad-viewability measurement JS injected into ad webviews |
| `assets/audience_network/classes{,2}.dex` | FAN dynamic dex |
| `assets/dexopt/baseline.prof` + `baseline.profm` | baseline profile (AOT optimization hints) |
| `assets/fonts/LobsterTwoBold.otf` | bundled font |
| Lottie JSON ×11 | `bronze_cup`, `silver_cup`, `gold_cup` (badge animations), `hand_jump`, `pin_lock`, `pro_look`, `pro_lottie`, `stay_home_stay_safe`, `story_intro`, `story_submit`, `usage_pattern`, `usage_warning` |

## res/raw

- `bg_audio.mp3` (161 KB) — background audio (onboarding/mindful/celebration cue)
- `keep_cronet_api.xml` — keep-rule for Cronet networking

## Fonts (16) — `res/font/`

`abrakatebra.otf`, Inter (bold/light/medium/regular/semibold), `lobster_two_bold.otf`,
Montserrat (bold/medium/regular/semibold), OpenSans (bold/light/regular/semibold),
Raleway (black, extra_bold).

## res/xml (9)

| File | Role |
|---|---|
| `reel_detector_accessibility_config.xml` | a11y service config (canRetrieveWindowContent, gestures, filter key events) |
| `shortcurts.xml` | 4 launcher shortcuts → `mobilepe://shortcut/*` |
| `widget_{summary,unlocks,usage}_info.xml` | 3 Glance widget providers, `updatePeriodMillis=0` |
| `device-admin` *(in `policies.xml`? — name `device-admin` seen)* | YourHourAdminReceiver, **empty policies** |
| `provider_paths.xml`, `library_file_paths.xml` | FileProvider paths (app/cache/external) |
| `splits0.xml` | Play split-install metadata |

## Resource buckets

530 `layout/` + 319 `layout-v33/` + 150 `layout-v31/` — but **nearly all v-dirs are Glance
widget framework grids** (`box_*`, `row_*`, `column_*`, `radio_*`, `enter_*`, `top_*`).
App-own layouts (~50 incl. libs filtered):

- **Notifications (rich)**: `notification_custom_layout`, `notification_picture_layout`,
  `notification_challenges_layout`, `notification_usage_alert_layout`,
  `notification_offer_countdown` + `_expanded` — custom RemoteViews incl. an
  **offer-countdown** layout (real-time countdown in the notification)
- **Widgets**: `widget_{summary,unlocks,usage}` + `_compact` + `_preview` (+ `_short` for summary)
- **Ads**: `native_ad_medium`, `native_ad_small`, `ads_dialog`
- **Lock/PIN**: `lock_display`, `lock_display_divider`, `lock_period_toggle`
- **Other**: `activity_layout` (generic), `item_checkbox/icon/icons_2line/radio/layout/material`,
  `dialog_item`, `view_group`, `overlay_action_mode`, `tooltip_bubble`, `content_include`

Everything else is Compose — consistent with `*ComposeActivity` naming and the view-id-based
Compose overlay in the reel blocker.

## Other resources

356 `drawable/` (+8 `-v21`,5 `-v23`,3 `-night-v8`), 158 `color/` (+21 `-v31`,7 `-v23`,3 night),
38 `anim` + 24 `animator` + 14 `interpolator`, 1 `menu`, ~90 `values-*` locale dirs, mipmaps
in `mipmap-anydpi-v26`.
