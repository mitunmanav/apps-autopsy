# Feature: In-app update & dynamic delivery

## In-app update (`kef` + `update` namespace)

- Play Core `AppUpdateManager` flows: `unable to display update prompt`,
  `installation failed`, `Cancel install failed`, `Get active sessions failed`
  — flexible + immediate update support with install-session resumption.
- `update.client.ui.forceupdate.impl.ForceUpdateActivity` (verified) —
  required-update gate; `PlayCoreMissingSplitsActivity` handles missing-split
  repair on partial installs.

## Dynamic feature delivery

- `requestDownloadableFeatureFuture` (`hxz`/`hlr`/`hly`/`hmq` chain) — Play
  Feature Delivery for on-demand modules (ML Kit scan module being the
  visible consumer — `Failed to install MlKit scan module.`).
- `CBVerifier` + phenotype register/commit — flag channels verified on write.

## Split-install specifics

- Delivered as 4-way split (base + arm64 + en + xxhdpi); additional density/
  language splits exist on Play.
- Language-pack reinstall for scanner (`Reinstall language failed`) — ML model
  localization is a dynamic split too.

## Evidence

`kef` strings, update activities, feature-delivery chain in `hxz`/`hlr`,
phenotype metadata.

## Unknowns

- Update staleness thresholds (days-before-force obfuscated).
- Which feature modules are declared beyond the ML Kit scanner.
