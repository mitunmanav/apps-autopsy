# Android cross-promotion bridge

> [Observation] Artifact: base.apk
> [Observation] Package: com.easybrain.arrow.puzzle.game
> [Observation] SHA-256: 3e86c708abeb06ae7885f9bdf0d4d4c149f8a7b4a90580eb6e07e5e5540b97f0

## UI entry
- [Unknown] Unity UI caller is not linked to CrossPromoShow in the available static evidence.

## Parameter model
- [Observation] CrossPromoInit, CrossPromoShow(), CrossPromoShowRewarded(); show methods take no arguments and return Boolean.

## Exact execution path
- [Observation] Show obtains manager and Unity activity; returns false if missing; registers shown/closed callbacks and invokes manager display. Rewarded path registers closed/reward callbacks and invokes rewarded manager. Remote creative/network path is unknown.

## Premium and offline flags
- [Unknown] Premium gating and offline/cache behavior are unknown.

## Input to output
- [Observation] No-arg show -> Boolean; callbacks -> Unity messages with observed strings closed, shown, reward.

## Evidence
- [Observation] Evidence ev_4224d41de7a28aa134d09b81327397c0a2da2a4874f02b0566faa631021179a6, ev_58198239e2f1c39ba998fb93a561445c9246ef9ded02bffa2302d2e8bddc0a99, ev_2b386fc5ce64d3d4e136e7100f5ee4070f3038a9096a37ffb142606e9726c02e.
