# Coverage ledger and limitations

> [Observation] Artifact: base.apk
> [Observation] Package: com.easybrain.arrow.puzzle.game
> [Observation] SHA-256: 3e86c708abeb06ae7885f9bdf0d4d4c149f8a7b4a90580eb6e07e5e5540b97f0

## Counts

| [Observation] Area | Count/status |
|---|---:|
| [Observation] Base artifact | 150,317,416 bytes; one selected artifact |
| [Observation] Package | 55,442 classes; 2,998 resources; 17 permissions; 185 components |
| [Observation] Components | 132 activities; 17 providers; 17 services; 19 receivers |
| [Observation] Artifact graph | 2,799 nodes; 2,999 occurrences; 2,998 edges; 0 contradictions |
| [Observation] DEX/JNI | 15 root DEX; 89,298 classes; 570,683 methods; 341 native declarations; 0 candidates/bindings |
| [Observation] IL2CPP metadata | 31 sections; 92 images; 14,755 types; 96,746 methods |
| [Observation] App-code images/pages | 36: Assembly-CSharp plus 35 Easybrain images |
| [Observation] Tool pages | 15: 12 Android bridges and 3 gameplay tool families |
| [Observation] Unknown ledger | 3 open Unknowns |
| [Observation] Markdown report | 63 files: README 1 + platform 11 + tools 15 + features 36 |

## Failures and omissions

- [Observation] Static package, artifact, JADX, signature, JNI, graph, IL2CPP, reference and unknown-ledger operations returned usable evidence; no target-analysis tool error is recorded.
- [Observation] inspect_apktool_client reported apktool 2.7.0-dirty, evidence ev_610077f56e641ee6f183ccff5f3e80a281ddd6f962d49d0f480e83df58f6f67b.
- [Inference] Patch provenance for that build was not verified; decode_android_resources was not run.
- [Observation] Resource-decoder omission leaves XML/string/layout extraction beyond the manifest and raw inventory absent, reducing UI-label/screen coverage.
- [Observation] Exact lookup com.easybrain.billing.web.BaseRequest did not resolve; search found com.easybrain.web.request.BaseRequest used in the billing path. Corrected lookup impact: none for the described request path.
- [Unknown] IL2CPP bodies, screen graph, game-save semantics, Room schemas, complete SDK endpoints, premium gates and runtime behavior remain unknown.

## Open Unknown ledger

- [Unknown] unk_89c179b552f70e4eb7a67f87b93e189e540b02cd569ea9a5412b7d84b18fba11: gameplay/booster bodies, UI call paths, parameters and offline rules.
- [Unknown] unk_b0d089194aa55c6b970f96929677e497d6ff7eaaffb9acd2481e87618125d262: Unity screens and transition rules after Android entry.
- [Unknown] unk_bb2ecceb026309c3f100a8b07050fc6db24f29871d50c0e68deeb10870ba94ea: store/server response to premium and no-ads state.

- [Observation] Static only: no APK execution, UI automation, network call, or capture.
- [Observation] Names, permissions, endpoints, and declarations are reported as artifact evidence; behavior claims require corroborating code or manifest relations.
