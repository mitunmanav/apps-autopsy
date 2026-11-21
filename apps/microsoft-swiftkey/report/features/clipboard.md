# Clipboard manager

## Screenshot capture

`screenshots_enable_pref_*` — "Remember screenshots" setting: grants the app **photo access so screenshots are auto-saved into clipboard history** (partial-access and permanently-denied states handled). Lives under clipboard settings.

## Sync trigger

`cloud_clipboard_fcm_sender_id = 973377065179` — dedicated FCM sender id for cloud-clipboard pushes (separate from main `gcm_defaultSenderId = 824710592720`) — cross-device clipboard items arrive via targeted push.

Evidence: `clipboard_*` strings (65), `screenshots_enable_pref_*` (5), `cloud_clipboard_fcm_sender_id`, `clipboard_*.xml` layouts (15), `ClipboardActivity`, `com.touchtype.clipboard.view.ClippedFrameLayout`, `prefs_clipboard_launch_cloud_account_prefs`, deep link `swiftkey://open.swiftkey.com/settings/typing/clipboard`.

## Features

- **Clip store**: copied text items saved locally ("Remember copied items" pref). Grid view default + **single-column view** pref (`clipboard_column_pref_*`, `clipboard_grid_pref_*`).
- **Pinning**: pin/unpin keeps clips permanently (`clipboard_pin_*`); pinned clips + shortcuts sync to account (`pref_account_pinned_clips_*` — "Sync %1$d pinned clips and %2$d shortcuts").
- **Shortcuts**: optional shortcut text per clip — typing the shortcut expands to clip content on the keyboard (`clipboard_edit_dialog_info`). Validation: empty content, dup clip, invalid chars, dup shortcut errors.
- **Search**: `clipboard_fragment_search.xml` + search strings.
- **Images/screenshots**: `clipboard_image_*` layouts + `clipboard_screenshot_upsell` — screenshots can be added to clipboard.
- **Edit/delete/undo**: edit dialog, delete with `clipboard_undo_clip_delete`, reorder via promote/demote (move up/down one slot).
- **Insert**: tap to insert clip at cursor.
- Panel hosts inside keyboard (`keyboard_clipboard_panel_layout.xml`, `keyboard_clipboard_panel_error_notification.xml`); also a settings screen (`ClipboardActivity`, deep-linkable).
- Origin labels: `clipboard_clip_origin_label` "Copied from another device" (cloud-synced items).

## Storage

Local persistence via DataStore/Room stack (clips incl. pinned + shortcuts); cloud-synced pieces flow through Cloud Clipboard (see `cloud-clipboard.md`).

## Accessibility

Full talkback: `clipboard_accessibility_searching_clips`, add/edit/delete announcements, pin/unpin content descriptions, expand/collapse semantics (`ClippedFrameLayout` exposes expand/collapse actions).
