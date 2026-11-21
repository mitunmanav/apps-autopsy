# Android analytics bridge

> [Observation] Artifact: base.apk
> [Observation] Package: com.easybrain.arrow.puzzle.game
> [Observation] SHA-256: 3e86c708abeb06ae7885f9bdf0d4d4c149f8a7b4a90580eb6e07e5e5540b97f0

## UI entry
- [Unknown] Unity UI/event caller is not linked to the Java bridge method.

## Parameter model
- [Observation] AnalyticsSendEvent(eventName, params), AnalyticsSetProperty(name,value), AnalyticsRemoveProperty(name); params is a JSON string.

## Exact execution path
- [Observation] SendEvent parses JSON, constructs an internal event and copies string-valued members into Android Bundle before forwarding into analytics implementation. Sink/network path is unknown.

## Premium and offline flags
- [Unknown] Premium gating and offline buffering/delivery are unknown.

## Input to output
- [Observation] Event name + JSON -> internal event/Bundle; property string pairs -> service calls; void outputs.

## Evidence
- [Observation] Evidence ev_f01f1d5d5fc464b1e9c8df99878c2289b0bc7a341623f0dd54eb7b4fb35ff969 and ev_7081d724e2bde04cf20fad6e1f61070760249a3f8b69fe784c68603f2dd24733.
