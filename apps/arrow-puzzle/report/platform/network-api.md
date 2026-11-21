# Network and API paths

> [Observation] Artifact: base.apk
> [Observation] Package: com.easybrain.arrow.puzzle.game
> [Observation] SHA-256: 3e86c708abeb06ae7885f9bdf0d4d4c149f8a7b4a90580eb6e07e5e5540b97f0

- [Observation] HostUtils.getInterstitialMlUrl returns https://cfg-test.easybrain.com/api/v1/personalization when obfuscated predicate e.a(context) is true, else https://cfg.easybrain.com/api/v1/personalization.
- [Observation] Caller checks IDs/config/event state, builds a request with URL, EasyApp ID, EUID, event data and augmentation callbacks, then dispatches through a DEX network executor.
- [Observation] y6.f.invokeSuspend builds an OkHttp POST with x-easy-eaid and x-easy-euid headers, request cache-control, and application/json body containing payload plus callback-added JSON fields. It closes any body and returns a success/failure wrapper with HTTP code and failure message; it does not parse the response body.
- [Observation] bi.b chooses https://test-store.easybrain.com/validator or https://store.easybrain.com/validator using e.a(application). bi.d serializes device info plus purchases JSON, POSTs application/json; charset=utf-8 through OkHttp and enqueues a callback.
- [Unknown] Predicate meaning, validator response schema, retries, TLS pinning, and entitlement propagation are unresolved.
- [Inference] These are online-capable code paths; no endpoint was contacted.
- [Observation] Two Easybrain endpoints are traced; third-party ad/consent/analytics endpoints are not exhaustively resolved.
