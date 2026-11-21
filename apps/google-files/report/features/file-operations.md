# Feature: File Operations (copy / move / rename / delete)

## Operations model

- Fluent-future pipelines (`tgw`/`sik.V/U`) — each op returns a chained future
  on a storagelib executor (`hxz.a(Object)` dispatches op-kind via `this.e` int
  switch; visible branches: rename, move-to-trash, restore, download-feature ops).
- Batch ops: selection sets iterate per-document with partial-failure logging
  (`Failure in batch trashing operation.` `jhi`,`isz`,`hqv`,`jbu`,`ikl`,`ilc`).

## Rename / move / copy

- Rename: `pye` document `.j()` name accessor + `ltq`/`ltr` rename op records
  (visible inside `hxz` trash-rename path: `String.format(".trashed-%d-%s.trash", …)`).
- Move/copy: storagelib transfer ops with progress callbacks; cross-volume moves
  stream bytes (no `renameTo` shortcut assumed — storage roots are abstracted).
- Conflict handling: `kpu`/`pyh` collision records; UI strings confirm
  overwrite/skip dialog flow.

## Delete vs trash

- Regular delete → MediaStore/`DocumentsContract` delete.
- Trash (R+) → MediaStore `createTrashRequest` path in `qbw`
  (`Failed to update MediaStore to trash or restore files!`), pre-R →
  storagelib rename scheme (see `trash.md`).

## Safety rails observed

- `Move to trash being called on USB files!` (`jfr`) — USB/OTG docs rejected
  from trash (no trash semantics on FAT/OTG volumes).
- `Operation not supported for trash.` (`luf`) — op-whitelisting per doc type.
- `Index for selected file to trash was invalid.` (`jhz`) — selection guard.
- Zip entries reject mutation (`filtering not supported`, read-only container).

## Progress UX

- Progress bars + dismiss events logged (`failed to dismiss trash operation
  progressbar` `hrn`); WorkManager for long/migratory ops (trash sync, sharing
  maintenance).

## Evidence

Classes: `hxz` (op dispatcher), `qbw` (MediaStore bridge), `lub`/`knh` (trash DB),
`ltq`/`ltr`/`pye`/`kpu` (doc ops), `omz` (download transform). Strings: op
success/failure strings across decoded resources.

## Unknowns

- Whole-copy checksum/verification — not observed statically.
- Exact MediaStore vs SAF branch conditions per volume type.
