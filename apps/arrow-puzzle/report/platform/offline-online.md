# Offline and online classification

> [Observation] Artifact: base.apk
> [Observation] Package: com.easybrain.arrow.puzzle.game
> [Observation] SHA-256: 3e86c708abeb06ae7885f9bdf0d4d4c149f8a7b4a90580eb6e07e5e5540b97f0

| [Observation]/[Inference]/[Unknown] Surface | Classification | Evidence/limit |
|---|---|---|
| Network permissions and OkHttp request code | [Inference] Online-capable | INTERNET/network-state declarations and two POST builders; no actual connectivity claim. |
| Billing and personalization | [Observation] Network paths encoded | URLs, request construction and callback/execute paths are visible; no server result claim. |
| Game mechanics and booster tools | [Unknown] Offline behavior | IL2CPP metadata only; no runtime state or native bodies. |
| SharedPreferences and Room code | [Observation] Local persistence APIs present | Code exists; successful persistence during a session is untested. |
| App-wide offline-first behavior | [Unknown] | Queuing, retry, gameplay availability and screens without connectivity are unresolved. |

- [Observation] No runtime or network test was performed.
- [Inference] Local state APIs and online-capable integrations coexist; that does not establish app-wide offline behavior.
