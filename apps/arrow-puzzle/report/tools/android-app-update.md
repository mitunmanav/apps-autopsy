# Android app-update bridge

> [Observation] Artifact: base.apk
> [Observation] Package: com.easybrain.arrow.puzzle.game
> [Observation] SHA-256: 3e86c708abeb06ae7885f9bdf0d4d4c149f8a7b4a90580eb6e07e5e5540b97f0

## UI entry
- [Unknown] Unity UI caller is not linked to the app-update methods.

## Parameter model
- [Observation] InstallUpdate() and IsUpdateReadyToInstall() take no arguments; both return Boolean.

## Exact execution path
- [Observation] InstallUpdate returns false if internal ready flag is false; otherwise calls update manager completeUpdate(), clears flag, returns true. Flag source/check sequence unknown.

## Premium and offline flags
- [Unknown] No premium flag is evidenced; offline check/update behavior is unknown.

## Input to output
- [Observation] No args -> Boolean; accepted install branch -> completeUpdate manager call.

## Evidence
- [Observation] Evidence ev_913bd63e150430ec336e0abbf2c88ca18f80fb421a35b441dce013d9b3a83841 and ev_d6eee1a2925fc060fd3ef618cd50f077803b45f447a4f28b3f77e8b4bd25e463.
