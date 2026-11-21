# Android billing bridge

> [Observation] Artifact: base.apk
> [Observation] Package: com.easybrain.arrow.puzzle.game
> [Observation] SHA-256: 3e86c708abeb06ae7885f9bdf0d4d4c149f8a7b4a90580eb6e07e5e5540b97f0

## UI entry
- [Unknown] Unity UI/caller is not linked; observed Android entry methods are static bridge methods.

## Parameter model
- [Observation] EasyStoreInit/Load/Buy/Consume/AddProducts each accept JSON strings. Init reads logs/appKey; Buy reads offerToken and productId. Other JSON schemas remain unknown.

## Exact execution path
- [Observation] Bridge parses JSON and dispatches async manager/coroutine operations. Report path selects validator URL in bi.b, creates bi.d, serializes device info plus purchases, sends application/json; charset=utf-8 POST by OkHttp, then callback. URL is test-store.easybrain.com/validator or store.easybrain.com/validator, selected by e.a(application).

## Premium and offline flags
- [Unknown] Entitlement/premium decisions and offline store fallback are unknown; BILLING permission and purchase methods do not prove product ownership.

## Input to output
- [Observation] Operation JSON -> billing manager/coroutine; purchase records -> validator POST -> callback.

## Evidence
- [Observation] Evidence ev_4739612d8381fee798dc7190fcd05f24cb4f3ead1dd6a238a025ccde98835301, ev_bb5964b8812eb9688232e137fde9805a248f1f1ba96327140ff14d3be87a54db, ev_6729953d31fbc37fad4b8ca021dcbe727a9dfc21162b54694e9e2ea9d41dbaa3.
