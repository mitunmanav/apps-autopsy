# Keyboard modes, resize & cursor control

Evidence: `bibomodels.postures.*`, `toolbar_*_mode_*` strings, `resize_*` strings, `ResizeContainerActivity`, `prefsx_layout_and_keys_preference.xml`, `CursorKeyboardView`, `FloatingKeyboardPaddle`, `cm_cursor_control`.

## Postures / modes

Toolbar "Modes" (`toolbar_mode_switcher_caption`, `mode_switcher_toolbar_panel_views.xml`, `ModeSwitcherItemView`) switches between postures delivered by `bibomodels.postures.PostureDefinitionModel` (`PostureDefinition`, `PostureGroupDefinition`, `SizePreferences`):

| Mode | String |
|---|---|
| Full | `toolbar_full_mode_caption` |
| One-Hand | `toolbar_one_hand_mode_caption` |
| Thumb | `toolbar_thumb_mode_caption` (split thumb layout) |
| Float | `toolbar_float_mode_caption` (floating window; `FloatingKeyboardPaddle` is the drag handle) |

Posture definitions + sizing parameters are **BiBo-deliverable** (can be tuned/added remotely without an app update).

## Resize

- `ResizeContainerActivity` + `resize_*` strings — drag keyboard edges to resize; announcements in millimetres (`resize_state_announcement` = "%1$s millimetres tall by %2$s millimetres wide"), `resize_limit_reached_announcement`, move handles (`resize_move_*`, `resize_*_content_description`), save/reset announcements.
- `SizePreferences` model stores per-posture size prefs.
- Onboarding sheet offers resize during personalization (`onboarding_sheet_personalisation_resize`).

## Cursor control

- `com.touchtype.keyboard.cursorcontrol.CursorKeyboardView` + coachmark `cm_cursor_control`: "Press and hold, then slide across the space bar to move the cursor".
- Card asset `cursor_control.png` used in tips/messaging cards.

## Other keys/layout prefs (`prefsx_layout_and_keys_preference.xml`, `prefs_keys.xml`)

- `pref_arrows_key` — arrow-key row toggle (key lists contain `icon_upArrow`/`icon_leftArrow`/`icon_rightArrow`).
- `pref_dedicated_emoji_key`, number row (`onboarding_sheet_personalisation_number_row`), long-press accents (`onboarding_sheet_personalisation_accents` — "Enable all accents").
- `pref_compact_mode_enabled`, `bing_recommender_compact_mode` — compact keyboard mode experiment.
- `pref_android_layout_key` (hard keyboard layout), `pref_adaptive_imegokey_key`, `pref_display_url_specific_keys` (URL-mode keys like `/`, `.com`).
- `ime_go_key_*` — adaptive action key: done/enter/go/next/previous/search/send/smiley(emoji) per EditorInfo imeOptions.
