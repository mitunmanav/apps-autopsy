# Feature: Storage management

## Surfaces

- `ManageSpaceActivity` — system "Manage space" target
  (storage-breakdown gateway alias also routes Settings → app storage screens).
- Storage breakdown UI: per-category bars (Apps/Images/Videos/Audio/Docs/
  System/Other) — strings + `managespace` namespace.
- Storage-volume gateway: external-intent trampoline into per-volume views.

## Multi-volume

- Internal + SD + USB OTG enumeration; `storage_location` tags every doc;
  SD-card access uses SAF/`WRITE` flows + legacy paths per API level.
- `MountService`/`StorageVolume` queries (hidden-API exemptions for volume
  introspection typical of this app).

## Stats

- `StorageStatsManager` on 26+/32+ for app sizes; used-space labels cached;
  breakdown recomputed on scan jobs.

## Evidence

Manifest activities/gateways, `managespace` classes, storage strings,
`storage_location` field usage across schemas.

## Unknowns

- "Other/Files" bucket attribution rules.
- Whether clearing system-cache paths attempts privileged ops (likely no-ops
  silently without system grant).
