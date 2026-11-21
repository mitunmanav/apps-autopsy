# Android ads bridge

> [Observation] Artifact: base.apk
> [Observation] Package: com.easybrain.arrow.puzzle.game
> [Observation] SHA-256: 3e86c708abeb06ae7885f9bdf0d4d4c149f8a7b4a90580eb6e07e5e5540b97f0

## UI entry
- [Unknown] The Unity gameplay/UI caller is not linked to these Java methods in the available static evidence.

## Parameter model
- [Observation] AdsInit(String JSON) reads optional logs; ShowInterstitial(String placement), ShowRewarded(String placement), SetRemoveAdsPurchased(boolean); additional enable/disable and cached/ready methods.

## Exact execution path
- [Observation] AdsInit parses parameters and starts a coroutine. ShowInterstitial(placement) calls manager t(placement) and returns Boolean; ShowRewarded calls manager A(placement) and returns Boolean; SetRemoveAdsPurchased forwards a boolean to manager w. Downstream manager/SDK/network sequence is unknown.

## Premium and offline flags
- [Unknown] Premium removal semantics and rewarded entitlement are unknown; offline/cache behavior is unknown although cached/ready queries exist.

## Input to output
- [Observation] JSON init -> async dispatch; placement -> Boolean manager result; purchased Boolean -> void manager call.

## Evidence
- [Observation] Evidence ev_086f6c3e8341d89a82a11b1c6f5947fc3b5ce970b1a4d4dc318333980358fd92; methods ev_054deb0c03fe5eb9c4e8d138e6da994bb9efd3bff0f706327e5145eed706ac6f, ev_14da9babd4be490121273bcc03cdb3abd5e2a83c2000e5f9a712f84c7023ca29, ev_0d613c16e6e146abfc195a522da9bfddb082a3639260460d9d89dfd9995d6dc4, ev_2eafeabd4c273f53c0d4a93b55585c52f80dd82af295ec4f46ef31f53fbe31a.
