# Text editing, free cursor & edit tracking

## Text Editing keyboard

- `libs.textediting.TextEditingKeyboard` — the **text-editing panel** (cursor move, select, cut/copy/paste, undo) — the "text editing" toolbar mode.
- Undo/redo strings ("Undo", "Undo the last 'Clear' or 'Delete' action", "redo", "undo is disabled") — in-keyboard undo for destructive actions.
- `enable_markup_mode_entry_point` — markup mode entry (annotate?).
- `enable_text_preview`, `enable_text_appearance_info_support_apps` — preview before commit.

## Free cursor

- `libraries.inputmethod.freecursor.{FreeCursorKeyboard, FreeCursorMotionEventHandler, TriggerFreeCursorMotionEventHandler}` — **free-cursor mode**: turn the keyboard surface into a trackpad for precise cursor placement.
- `motioneventhandler.scrubmove.*` — spacebar scrub cursor control.

## Edit tracker

- `libs.edittracker.EditTrackingImeWrapper` + `pref_key_latin_enable_ac_revert`, `use_highlight_text_color_for_diff` — an IME wrapper that tracks field edits (for post-correction revert, diff highlighting, and the "edited" badge).
- `ExternalEditsInfo{action, offset, textLength, originalTextLength, hasEdits}` — external-edit detection (app changed text behind the keyboard).

## Keyhound (input actions)

- `libs.keyhound.InputActionFileProvider` + `use_input_actions_processor_params_v2` — **Input Actions**: structured records of typing actions exported via FileProvider — used by Pixel/system "input action" reporting and internal quality tooling.
