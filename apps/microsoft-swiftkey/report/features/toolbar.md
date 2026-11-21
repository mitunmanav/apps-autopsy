# Toolbar system

Evidence: `com.touchtype.keyboard.toolbar.*`, `toolbar_*` strings (52), `appconfig/toolbarItemsOrdering/params/models/*.json`, `bibomodels.contextualizedtoolbarordering.*`, layouts `toolbar_*`, `mode_switcher_toolbar_panel_views.xml`, `prefsx_*` strings `extended_customiser_*`.

## Structure

- `com.touchtype.keyboard.toolbar.Toolbar` — toolbar widget.
- `ToolbarTextField` (`keyboardtextfield.KeyboardTextFieldEditText`) — text field inside toolbar panels (search box).
- `ModeSwitcherItemView` + `mode_switcher_toolbar_panel_views.xml` — Modes panel (Full/One-Hand/Thumb/Float).
- Panel system (`toolbar_panel_layout.xml`, `toolbar_panel_bottom_bar.xml`) — toolbar hosts swappable panels: emoji, GIF, stickers, clipboard, translator, Editor, Tone, resize, languages/layouts, camera, search, messaging centre, improve panel, toolgrid ("more options" menu).
- Banners/messaging: `SwiftKeyBanner`, `toolbar_banner_messaging_view.xml`, `toolbar_messaging_centre.xml`, `toolbar_dialog_messaging_view.xml` — in-toolbar announcements/tips.
- Lock screen state: `toolbar_lock_screen.xml` + `toolbar_lock_screen` string — padlock UI while device locked (works with `LockScreenWatcher`).

## Toolbar items (from strings)

Autocorrect toggle, Bing Image Creator, Camera, Clipboard, Editor, Emoji, GIF, Incognito, Resize, Languages & layouts, Messaging centre (tips), Mode switcher, Rewards, Rich media, Bing Search, Stickers, Tone, Toolgrid (options), Writing assistance hub, Copilot, Settings/account entry.

## Ordering & customisation

- **Toolbar customiser**: `extended_customiser_*` strings + `customiser.OverrideExploreByTouchGridLayoutManager` — drag-to-reorder toolbar/toolgrid items with full a11y announcements (`…_moved_promote/demote_announcement_with_position`, slot/row/column positions).
- `toolbar_toolgrid_reorder_button_text` — reorder UI inside toolgrid.
- **Remote ordering**: `appconfig/toolbarItemsOrdering/params/models/toolbarItemsOrdering_params.json` + `bibomodels.contextualizedtoolbarordering.{ToolbarOrderModifier,ToolbarOrderingModifier,ToolbarOrderingModifierCriteria,ToolbarOrderingParametersModel}` — server can add/remove/reposition icons by criteria (sample: for "users who haven't edited the toolbar" and "without an OEM ordering", remove icons 47 & 17 then re-add at positions 5 & 8).
- OEM ordering exists ("users without an OEM ordering" criterion) — `swiftkeyconfigurator` provider supplies OEM preset toolbars.

## Coach marks

`cm_*` strings — onboarding hints pinned to toolbar features: Copilot, emoji, search, clipboard, cursor control, prediction bar, punctuation swipe.
