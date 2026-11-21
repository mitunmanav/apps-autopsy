# Custom themes (theme designer)

Evidence: `CustomThemeDesignActivity`, `BackgroundImageEditorActivity`, `custom_theme_design*.xml` (5), `custom_themes_*` strings (35), `custom_theme_base` theme, `READ_MEDIA_IMAGES` + `READ_MEDIA_VISUAL_USER_SELECTED` perms, deep link `swiftkey://open.swiftkey.com/themes/custom`.

## Designer flow

- `CustomThemeDesignActivity` + `custom_theme_design{,_content,_controls}.xml` — design canvas over the `custom_theme_base` theme ("Theme Customiser").
- `custom_themes_design_new_theme` "Design new theme"; `custom_themes_start` "Start".
- Controls: background image add/edit (`custom_theme_add_image.xml`, `custom_themes_add_image`), **background darkness** slider, key borders toggle (`custom_themes_key_borders_setting`), colors.
- `custom_themes_custom_theme_name` "Custom"; save dialog (`custom_themes_save_*`) with unsaved-changes guard; can't save without background image (`custom_themes_save_without_background`).

## Background image editor

`BackgroundImageEditorActivity` — photo picker (needs `READ_MEDIA_IMAGES`/picker perms; unsupported-type error) → crop stage: pinch-to-scale, drag-to-move (`custom_themes_crop_hint`), separate horizontal/vertical sliders with per-direction disable states, zoom announcements (`image_zoomed_in/out`), move-boundary a11y (`image_cannot_move_further_to_the_%1$s`).

## Storage

User themes saved as generated theme directories (same style.json model); preview container `custom_theme_preview_container.xml`; "Theme saved and selected" on save.

## Accessibility

Fully announced: image moved/zoomed/direction limits, scale/position slider labels with percentages.
