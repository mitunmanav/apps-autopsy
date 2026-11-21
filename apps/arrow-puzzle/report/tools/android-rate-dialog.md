# Android rating-dialog bridge

> [Observation] Artifact: base.apk
> [Observation] Package: com.easybrain.arrow.puzzle.game
> [Observation] SHA-256: 3e86c708abeb06ae7885f9bdf0d4d4c149f8a7b4a90580eb6e07e5e5540b97f0

## UI entry
- [Unknown] Unity UI caller and prompt schedule are not fully linked.

## Parameter model
- [Observation] RateInit(); RateDialogShow() has zero-argument and one-string overloads, both Boolean outputs.

## Exact execution path
- [Observation] No-arg show checks config-enabled state and rate_is_disabled preference, then increments rate_count in a shown branch; final dialog/store path unknown.

## Premium and offline flags
- [Unknown] No premium flag is evidenced; local preference gate is visible, network/store behavior unknown.

## Input to output
- [Observation] Show call -> Boolean branch result with local config/preferences consulted.

## Evidence
- [Observation] Evidence ev_90354e372e27080c399d596b0d7e10c1d629e4b3824984c75ca6a182aa974ab1 and ev_8dbb596ca9cc6bf31ad27c6c229c57527c580e3ca57e2da57919b66e4a0d38e1.
