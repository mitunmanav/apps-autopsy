# 11 — Notes & hashtags

- `NoteActivity` — note editor; `model.NotesModal` — note entity (import/export covered by strings + `helper/utils` backup path)
- Stamp fields: `is_notes`, `notes_hashtag` (+ per-template variants), `NOTES_HASHTAG_COLOR`, `notes_index`
- `ask_note_every_time` (+ per-template) — prompt for a note on each capture
- `is_notes_file` — include note text in filename (see 10)
- Import/export of notes alongside locations in backup strings
- `feature_addtext` analytics — custom text on stamps

## Unknowns

- Notes persistence store (likely same SQLite helper as locations — unverified)
