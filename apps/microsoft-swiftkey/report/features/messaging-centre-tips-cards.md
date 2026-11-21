# Messaging centre, tips & cards

Evidence: `assets/card*.json` (card, card_1…card_N), `com.touchtype.messaging*`/`notice_board*` classes/strings, `card_talkback` fields, Tips settings entry.

## What it is

In-app message/tip delivery — "cards" shown in a notice-board/messaging-centre surface (settings tips section, toolbar entry, possibly overlays).

## Card format (`assets/card*.json`)

Self-contained **declarative UI** per card:
- `id` (uuid), `name` (internal, e.g. "Long-press symbols", "Themes - new users - ANDROID", "In App Update - existing users"),
- `card_talkback` — localized a11y description,
- `assets` — images with per-density resolutions + sha1 + `fallback_color`,
- `palette` — accent/background/main_text/transparent/gray/blue/white colors,
- `text_styles` — Normal/Button label/gray/blue/white (bold/italic/light + palette ref),
- `layout` — background asset/color, foreground, left/middle/right span widths,
- `content[]` — ordered cells: `text` (localized ~80 locales each), `action` (button label → deep link like settings), `drawable`, `span`, `anchoring`, `invert_for_accessibility`.

The keyboard renders these without native layout code — a generic card renderer + downloader (remote cards likely fetched too).

## Observed topics

Long-press symbols education, theme change, in-app update, languages onboarding — all fully localized in-file (each string carries ~80 translations inline, which makes the files huge).

## Tips

`pref_home_launch_tips_prefs` — Tips settings section re-showing dismissed education cards; `notice_board_*` infra for the messaging inbox.
