# Clipboard

## Features

- `libs.clipboard.{ClipboardKeyboard, ClipboardAddEntryKeyboard, ClipboardContentProvider}` — full clipboard keyboard + provider.
- **1-hour retention**: "Gboard's clipboard lets you copy text and images, keeping them for 1 hour" — unpinned clips auto-expire; pins persist ("Touch and hold a clip to pin it").
- **Text + images**: copies text and image clips; `enable_extended_clipboard_history` for longer history.
- **Screenshot clips**: "Add screenshots to your Gboard clipboard for easier pasting" — auto-detects screenshots (`READ_MEDIA_IMAGES` / visual-user-selected).
- **Paste flows**: "Tap on a clip to paste", pin/add/delete via edit mode, `enable_clip_item_consumers`, `enable_pix_clip_item_consumer`, `enable_system_clipboard_direct_paste_for_quick_paste` — quick-paste chips and consumer callbacks.
- **Clipboard query refactor**: `enable_clipboard_query_refactoring`.
- Settings: `settings_header_clipboard`, on/off toggle strings.
- `ClipboardAddEntryKeyboard` — manually add a clip.
- `ClipboardContentProvider` — app-internal provider (non-exported).

## Notes

Clipboard is local-only (no cloud sync code); `disable_content_suggestion` gates clipboard-driven suggestions. PIN-protected fields refuse clipboard ("This text field does not support clipboard").
