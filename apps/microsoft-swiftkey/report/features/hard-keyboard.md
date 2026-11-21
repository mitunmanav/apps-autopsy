# Physical (hard) keyboard support

Evidence: `prefsx_hard_keyboard.xml`, `prefs_typing*` strings `pref_hardkb_*`, `deeplink_internal_path_prefs_hard_keyboard`, `KeyboardService.onKeyDown/onKeyUp` delegation, `HIGH_SAMPLING_RATE_SENSORS` permission (touch side).

## What it is

Full Bluetooth/USB keyboard support — SwiftKey intercepts hardware `KeyEvent`s inside `KeyboardService` and routes them through the same delegate (`r3.onKeyDown/onKeyUp`) as soft keys.

## Settings surface (`prefsx_hard_keyboard.xml` + strings)

- `pref_hardkb_auto_caps_key`, `pref_hardkb_auto_correct_key`, `pref_hardkb_auto_insert_key` — auto-capitalization, auto-correct, auto-insert behaviors for physical keys.
- `pref_android_layout_key` — physical layout mapping selection.
- `pref_hardkb_prefs_page_title_tip`, `pref_hardkb_go_to_support_key` — help links.
- Deep link: `swiftkey://open.swiftkey.com/settings/typing/hardkeyboard`.

## Details

- `INTERACT_ACROSS_PROFILES` + hard keyboard prefs suggest ChromeOS/laptop/tablet support is a maintained surface.
- `uses-feature android.hardware.usb.host required=false` — USB keyboards allowed.
- Candidate selection and shortcuts handled in delegate; exact keymap tables are in obfuscated code — not enumerated here.
