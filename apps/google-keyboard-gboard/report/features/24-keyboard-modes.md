# Keyboard modes & adaptive layouts

## Modes

| Mode | Evidence |
|---|---|
| **One-handed** | `enable_one_handed_dialog`, "Exiting one handed keyboard" |
| **Floating** | `enable_auto_float_keyboard_in_{landscape,freeform,multi_window}`, `support_auto_float_in_landscape_in_apps`, `enable_floating_dock_hint_v2`, "Floating"/"Exit floating keyboard" — draggable floating keyboard |
| **Split** | `enable_split_keyboard_on_tablet_large`, `enable_split_layout_promo`, `show_split_confirmation_toast`, `enable_auto_split_for_android_messenger`, split-width dev prefs + `style_sheet_default_split_tablet_*` themes — split for tablets/foldables/Messenger |
| **Resize** | "Keyboard Resize is disabled in tabletop mode", resize edge/corner strings — drag-resize |
| **Tabletop/fold** | "Exiting tabletop layout", `foldable_keyboard_width_large{,_portrait}` themes, `support_tracking_folding_feature` — foldable posture handling |
| **Tablet** | `tablet_keyboard_width_{small…extra_large}` themes, `enable_settings_two_pane_display`, EmojiKitchenBrowseKeyboardTablet — tablet layouts |
| **Landscape** | `landscape_user_image*_override`, auto-float landscape prefs, height multipliers for landscape |
| **Desktop/freeform** | `enable_auto_float_keyboard_in_freeform`, `enable_desktop_windowing_app_to_web_education`, `enable_docked_desk`, `DockStateModule`, `Enable full physical keyboard keys` — desktop-mode keyboard |
| **Number row** | `enable_number_row` |
| **Adjustable height** | portrait/landscape height-multiplier dev prefs (0.5–2.0), `enable_adjust_default_keyboard_height` |
| **Accessibility layout** | "Show accessibility layout", `enable_slide_actions_in_a11y_mode` |
| **Special mode** | `enable_special_mode_fragment`, `enable_ios_switcher_detector` (iOS-style switcher detection) |
| **Morse** | `morse` keyboard (mic disabled on it) — see misc doc |
| **PK (physical keyboard) companion** | `disable_nwp_in_pk_vertical_mode`, `enable_pk_indicator` — on-screen companion in PK mode |
| **Full-screen extract** | `extracttextview.*` + `enable_fullscreen_in_new_task_preference` — landscape fullscreen editor |
| **Popup/IME windows** | `disable_popup_view_outside_touch`, `allow_show_toast_in_popup_ime_window`, `show_all_popup_views_in_popupwindow` |
| **PiP** | `enable_interactive_picture_in_picture`, `SignboardPiPFrame` |
| **Window APIs** | `enable_window_repositioning_api`, `enable_is_input_view_started_check_in_on_compute_insets`, `enable_navigation_on_vk` — window management |

## Notes

Keyboard sizing is data-driven (`KeyboardViewDef`, theme stylesheets per width bucket sw400/600/768 + tablet/fold widths); "KeyboardDef"/"ImeDef" metadata objects select the right layout per context.
