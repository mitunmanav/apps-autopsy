# Settings app (home, screens, navigation)

## Container surface (the launcher "home")

`ContainerActivity` family (`materialsettings.ContainerActivity`, `ContainerEditTextLayout`, `ContainerOpenKeyboardActivity`, `ResizeContainerActivity`, `TrackedContainerActivity`) — the standalone app window behind the launcher icon. It contains:

- **"Try out your setup"** edit box (`container_edittext_hint`) — a sandbox where the keyboard is opened to test configuration.
- **Typing stats & heatmap** — `container_stat_heatmap` "Where you tap most on the keyboard" + `TouchTypeStats` class; the heatmap is **shareable** ("%1$s made this heatmap of how I type").
- **Share the app** — `container_home_menu_share` ("I'm using %1$s, the keyboard that learns from you"), `container_home_menu_show_app_icon`.
- Resize UI host (`container_home_resize_title`) and battery-saver error guard.
- Languages list expand/collapse headers.

## Keys settings (`prefs_keys.xml`)

`pref_arrows_key` (arrow keys — paired with `prefs_extended_layout_*` "Extended layout: show left and right arrow keys"), `pref_number_row_key` + `pref_number_display_key`, `pref_key_press_popup_key` (popups), `pref_keyboard_show_all_accents_key` (accented variants), `pref_pc_keyboard_key` (**PC keyboard layout** option), `pref_display_url_specific_keys` (URL keys like .com//), dedicated emoji key, adaptive enter key.

## Model diagnostics

`prefs_model_metrics.xml` + `ModelMetricsPreferenceFragment` + `materialsettings.fluencysettings` — **model metrics screen**: last write, loads, load failures, writes, write failures, size, stores-on-internal, **sync merges**, updates. Feeds the support-data copy dialog (`support_dialog_option_*`: personal language model, key press model, language packs list, app log, account-migration log → "Log copied to external storage").


Evidence: `prefsx_*` + `prefs_*` xml trees, `com.touchtype.materialsettings.*`, `NavigationActivity`, `LauncherActivity(FromSystemSettings)`, `home_pref_*`/`pref_home_launch_*` strings.

## Two generations

- `prefs_*` + `materialsettings` = legacy screens; `prefsx_*` = redesigned settings (NavigationActivity host, card-style home). Both shipped; runtime picks by config/experiment.

## Home screen (`prefsx_home_screen.xml`)

Entries: Typing, Layout & keys, Rich input, Emoji, Languages, Themes, Sound & vibration, Clipboard (via rich input), Account ("cloud account"), Cross profile sync, Privacy, Tips, Help & feedback, Achievements, Microsoft Rewards, About SwiftKey, notice/information row.

## Screen map (keys observed)

- **Typing** (`prefsx_typing`): auto caps, auto correct, auto insert, auto space, Chinese input (fuzzy pinyin), clear typing data, cursor control, **Editor** enable + candidate bar mode, flick/cycle mode, Flow gestures, physical keyboards, quick character, quick delete, quick period, autospace-after-flow, transliteration, undo-autocorrect-on-backspace, smart punctuation.
- **Layout & keys** (`prefsx_layout_and_keys`): size/mode (resize/floating/one-handed/split), layouts per language, arrow keys, number row, long-press symbols, key popups.
- **Rich input** (`prefsx_rich_input_screen`): clipboard, voice input, **Whisper** toggle, compact mode, **multimodal** toggle, Bing suggestions bar + recommender history (+clear history).
- **Emoji** (`prefsx_emoji_screen`): emoji predictions, dedicated emoji key, emoji font, adaptive IME-go key.
- **Sound & vibration**: keypress sound profile, sound feedback, vibration, system vibration fallback.
- **Emoji/Hard keyboard/Cross-profile/Consent** screens likewise pref-key driven.

## Entry points

`LauncherActivity` (app icon) & `LauncherActivityFromSystemSettings` (IME `settingsActivity` in `method.xml`) → settings hub; deep links open specific screens (`swiftkey://open.swiftkey.com/...`).

## Discovery

Settings items are `bibomodels`-style remote-config friendly (ordering/hiding) — e.g. `toolbarItemsOrdering` config pattern and home notice row.
