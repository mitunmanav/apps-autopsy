# Physical keyboard & companion widget

## Core

- `libs.kcm.InputDeviceReceiver` — exported `QUERY_KEYBOARD_LAYOUTS` receiver: Gboard serves **key character maps** to the system. `res/*.kcm` files — bundled `.kcm` layouts.
- `keyevent.interpreters.*` (15: e.g. `BengaliKeyEventInterpreter`) — per-language physical-key interpretation.
- `libraries.inputmethod.companionwidget.*` — **Companion widget**: the on-screen toolbar shown with a physical keyboard attached (`WidgetSoftKeyboardView`, `WidgetAccessPointsPanel`, `WidgetPopupMenu*`, `WidgetDragToMoveMotionEventHandler`, `WidgetTooltipView`, `WidgetInnerHolder`, and the AI variants `RamblerAlWidgetSoftKeyboardView`, `WidgetInnerHolderForAlRambler`).
- `companionwidget.accesspoint.PhysicalKeyboardShortcutsActivity` — the "physical keyboard shortcuts" helper screen (system shortcut catalog).

## Capabilities (flags)

- `INJECT_KEY_EVENTS` permission + "Key code of dictation key" — **dedicated dictation key** on physical keyboards injects key events.
- `enable_hid_api_input_reports` — raw HID input reports (low-level key handling).
- `enable_modifier_key_handler` — modifier (Ctrl/Alt/Meta) handling.
- `enable_pk_*`: `enable_pk_indicator` (PK status indicator), `enable_pk_spatial_model_features` (PK spatial model), `enable_pk_user_detection`, `enable_pk_auto_correction_{trigger_predictor,locales}` (autocorrect on physical keys), `disable_nwp_in_pk_vertical_mode`, `show_vk_devices_names` (show device names on virtual keyboard UI).
- `support_send_meta_key_events_to_app`, `enable_new_*_keycodes` — richer key event passthrough.
- `enable_revert_auto_correct_on_pk` — revert chips for PK autocorrect.
- Virtual/remote devices: `allow_pk_event_from_virtual_device`, `disable_pk_when_virtual_device_present` — DeX/remote-desktop/virtual-device key handling.
- `enable_use_bluetooth_setting` — Bluetooth keyboard option.
- `enable_full_physical_keyboard_keys` — "Show full physical keyboard keys in QWERTY, QWERTZ, and AZERTY layouts".
- `enable_pksimulator` / `PkSimulator{Toggle,Setting}Activity`, `settings_header_pk_simulator` — **PK Simulator** dev tool simulating physical keyboards.
- `enable_system_globe_key` (`disable_…`) — globe-key behavior.
- `enable_si_shortcut_keys` — system shortcut keys.

## Notes

Physical-keyboard mode keeps a suggestion/companion bar on screen; the Rambler AL widget can occupy it. Dictation key works via `INJECT_KEY_EVENTS` (signature-level permission — Gboard is a Google-signed system partner).
