# Themes & Theme Builder

## Bundled theme system

124 `assets/theme/*.binarypb` — a compiled stylesheet system (`style_sheet_*.binarypb` + `theme_package_metadata_*.binarypb`):

| Family | Assets |
|---|---|
| Default | `style_sheet_default*` + variants: `_border`, `_bottom_row_bottom_gap_4dp`, `_foldable_keyboard_width_large{,_portrait}`, `_split_tablet_keyboard_width_{small…}`, `_sw400/600/768`, `_tablet_keyboard_width_{small,medium,large,extra_large}` — layout-aware theme variants for foldables/tablets/landscape |
| Material | `style_sheet_material_{light,dark}{,_border}` + `material_rules` |
| Material 3 | `style_sheet_material3_{light,dark}{,_border}` |
| Dynamic color | `style_sheet_dynamic_color_{light,dark}{,_border}` + `rules` + `dynamic_compatible_themes_color_rules` — Material You |
| Google Blue | `style_sheet_google_blue_{light,dark}{,_border}` + rules |
| Holo | `style_sheet_holo_{blue,white}{,_border}` + rules — legacy |
| Colors | `style_sheet_color_{black,blue,blue_grey,brown,cyan,deep_purple,green,light_pink,pink,red,sand,teal}{,_border}` + `color_rules` + `color_common` + `expression_{dark,light}` + `label_{black,white}` |
| Android XR | `style_sheet_android_xr_{dark,light}{,_border}` + `android_xr_rules{,_border}` — **XR headset keyboard themes** |
| Special | `no_background`, `non_dynamic_color`, `landscape_user_image{,_border}_override`, `gradient_{dark,light}{,_border}_override`, OEM overrides: `oppo_override`, `xiaomi{,_border}_override` |
| Extra-small | `enable_extra_small_width_portrait_theme`, "extra small screen theme" |

Flags: `enable_gm3_color_token_overrides`, `disable_gm3_{color_token_overrides,energy_colors_in_legacy_themes}`, `enable_theme_overlay_wrapping`, `enable_key_border_by_default_new_user_timestamp`, `enable_rounded_key_by_default`, `enable_transparent_side`, `enable_full_width_layout_promo`, `enable_display_cutout_customization`, `support_custom_dim_color`, `use_system_font`, `enable_gboard_focus_ring`, `enable_text_appearance_info_support_apps`.

## Theme Builder

- `libs.theme.builder.{ThemeBuilderActivity, ThemeEditorActivity}` + `libs.theme.listing.ThemeListingFragment` — **Theme Builder**: "Create Keyboard Theme"/"Edit Keyboard Theme" — user themes from photos (camera/photos → palette + background image; `landscape_user_image*_override` stylesheets are the user-image themes).
- `Default theme(s) directory`/`file name` dev flags — where generated themes persist.
- Pixel integration: queries `com.google.android.apps.pixel.customizationbundle` + `PixelBundleBroadcastReceiver` (signature-gated) — Pixel customization bundles push themes/wallpaper-based theming.

## Notes

Themes are declarative binary-protobuf stylesheets — the same engine renders every keyboard (main, emoji, clipboard, Jarvis, signboard). Border/no-border variants exist per theme. GM3 = Google Material 3 token system.
