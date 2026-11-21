# Android consent bridge

> [Observation] Artifact: base.apk
> [Observation] Package: com.easybrain.arrow.puzzle.game
> [Observation] SHA-256: 3e86c708abeb06ae7885f9bdf0d4d4c149f8a7b4a90580eb6e07e5e5540b97f0

## UI entry
- [Unknown] Unity UI caller is not linked; ConsentActivity is a manifest component and privacy-preferences bridge target.

## Parameter model
- [Observation] ConsentInit, HasConsent, GetApplies, privacy policy/settings/preferences, terms, subscriptions, delete-user-data callback; init/show/query APIs have no parameters.

## Exact execution path
- [Observation] ConsentInit wires Rx-style subscriptions to Unity schedulers. HasConsent returns stored Boolean; GetApplies returns int. ShowPrivacyPreferences selects a ConsentActivity factory route using an internal ordinal.

## Premium and offline flags
- [Unknown] No premium flag is evidenced. Offline behavior and first-consent acquisition are unknown.

## Input to output
- [Observation] No-arg init/query/show -> local consent service/UI route; query output Boolean or int.

## Evidence
- [Observation] Evidence ev_effbc54f910a84825960e0f16286a0d4de44b90e392217c558a1bc90624cb607, ev_a34d8ea7c917c8d7eb32199e6aecbbb07a53450eb3a9a1ca019c6dca89b01379, ev_cdd91c1b10d17541ea47e8bdf6131ec2b6b1e458d55c1fec95c62cb9b8e68a8a, ev_1587abf7b7f91fb7419caa819566d1535b63e25eae15fa230485db64e722270b.
