# Feature: Hidden files

- `hidden_file_view.xml` layout — dedicated hidden-files surface.
- Dotfiles shown/hidden via settings toggle; `.nomedia` handling strings present.
- Trash leverages the same mechanism — `.trashed-*` names hide trashed files
  from gallery/browser without moving them.
- Hidden-file listing walks the FS directly (storagelib raw-file branch) rather
  than MediaStore (which skips dotfiles).

## Evidence

Layout name, settings/hidden strings, trash naming reuse.

## Unknowns

- Whether "show hidden" persists per-folder (pref not located).
- `.nomedia` creation UI — strings suggest yes, flow unconfirmed.
