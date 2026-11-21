# Android metrics bridge

> [Observation] Artifact: base.apk
> [Observation] Package: com.easybrain.arrow.puzzle.game
> [Observation] SHA-256: 3e86c708abeb06ae7885f9bdf0d4d4c149f8a7b4a90580eb6e07e5e5540b97f0

## UI entry
- [Unknown] Unity UI/caller is not linked to these static methods.

## Parameter model
- [Observation] RegisterMetrics(JSON), IncMetric/SetMetric(key,value), ResetMetrics(), UnregisterMetric(name), UpdateConfig(); exact JSON schema unknown.

## Exact execution path
- [Observation] RegisterMetrics forwards JSON to registerProductMetrics; UpdateConfig calls service updateConfig. Other methods are exposed in class inventory; complete internal sequence unknown.

## Premium and offline flags
- [Unknown] Premium gates, local persistence, and offline config refresh behavior are unknown.

## Input to output
- [Observation] JSON/key/value -> metrics service methods; outputs are void.

## Evidence
- [Observation] Evidence ev_13f747dccad93df359758d1866c92b2ec3b2de82d4fd6178b47c0c1416bf192f, ev_33e4aa9b25dc3a6080b3982b542b7a3549bddf3047362ca84aea149e6e76001e, ev_ffb66c0bcf6d4acb138b2db93e87fedb7acd0e1633cbb3a279c4148500cba2de.
