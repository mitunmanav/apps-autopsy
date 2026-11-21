# Android lifecycle/session bridge

> [Observation] Artifact: base.apk
> [Observation] Package: com.easybrain.arrow.puzzle.game
> [Observation] SHA-256: 3e86c708abeb06ae7885f9bdf0d4d4c149f8a7b4a90580eb6e07e5e5540b97f0

## UI entry
- [Unknown] Unity UI caller is not linked; Android lifecycle forwarding is separately documented in android-bridge-deeplink.md.

## Parameter model
- [Observation] LifecycleInit() and no-arg current-session ID/nanosecond getters.

## Exact execution path
- [Observation] Init subscribes to internal lifecycle/session flow and maps integer-valued flow to string-valued Unity emissions. Session boundaries and event content unknown.

## Premium and offline flags
- [Unknown] No premium flag is evidenced; offline session behavior is unknown.

## Input to output
- [Observation] No-arg init -> subscription; getters -> integer fields.

## Evidence
- [Observation] Evidence ev_5528a339caa91624f9e38428f379c2bb22f49ca6247c5f415f6a33d21351e1ce and ev_28392f68af36340a548a63a390c30050ad3c243206b344351a5eb42f80375ab3.
