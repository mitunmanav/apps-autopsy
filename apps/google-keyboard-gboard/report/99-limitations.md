# Methodology, limitations & unknowns

## What was analyzed

| Artifact | Method | Result |
|---|---|---|
| `base.apk` | `inspect_android_package`, archive inventory, `decode_android_resources`, `search_android_classes`, `inspect_android_class`/method decompilation, `inspect_android_jni_bindings`, local JADX full decompile (21,804 files), local aapt2/apktool | Full static coverage |
| `split_brella_feature_split.apk` | `inspect_android_package`, archive listing | Manifest + single native lib |
| `split_tenoranimation_feature_split.apk` | `inspect_android_package`, archive listing | Manifest + single native lib |
| `split_config.xxhdpi.apk` | `inspect_android_package` + archive listing + SHA-256 | Resource split confirmed |

## Static-only analysis

**No APK was executed.** No emulator, no device install, no network capture, no runtime flag evaluation. Every "feature" claim in this report derives from: manifest declarations, decompiled DEX, string resources, native library SONAMEs/strings/JNI declarations, experiment-flag names, and packaged assets. Presence of code ≠ runtime activation — see [experiment-flags](reference/experiment-flags.md).

## Structural limitations

| Limitation | Impact |
|---|---|
| **R8 obfuscation** | 91% of classes (19,898) live under `defpackage.*` with stripped names. Feature attribution used preserved Google package names, string references, JNI decls, and manifest components. Exact class ownership/semantics for obfuscated code is approximate. |
| **Native code** | `libintegrated_shared_object.so` internals were identified via strings/symbols/headers paths, not full decompilation. Delight3 decoder, Mozc, Scribe, OCR, speech pipeline internals remain largely unmapped. |
| **Dynamic loading** | Feature splits, superpacks, MDD packs, LoRA adapters, and models download at runtime — their content is not in these artifacts. |
| **Reflection/dynamic registration** | Dagger/Hilt wiring, reflection, and runtime-bound calls are not traceable statically; 440 of 668 native decls lack a static lib match. |
| **Server-side config** | Phenotype flag values, experiment cohorts, server-driven strings — all unknown without runtime. |
| **Signatures not verified** | Signing blocks were parsed structurally (v2/v3/v3.1, source stamp, rotation). Certificate-chain validity, revocation, and cryptographic signature verification were **not** performed — declared signer ≠ verified authentic. |
| **Localized coverage** | 5,447 default strings analyzed; ~95 locale tables were enumerated but not exhaustively reviewed per locale. |

## Specific unresolved items

- Exact SCAM scoring algorithm (partitioner/scorer libs identified; internals native).
- Whether Private AI Compute is actually invoked for writing-tools cloud paths vs. always-on-device (strings claim both paths exist).
- Voice model internals (SODA/Jetson run inside the monolith; runtime models download via superpacks).
- Full Brella module contents on a live device (split carries only `libtensorflow_jni.so`; models arrive via MDD).
- The Google API key found in resources: present in the artifact, purpose unconfirmed, treated as shipped data not a credential.
- Runtime availability of AI features per device class (GWP/TPU/RAM gates unknown).
- Exact flag defaults — Phenotype metadata is binary; flag names were extracted but default values were not fully decoded.

## Checklist status vs. original request

| Request | Status |
|---|---|
| Package identity/SDK/permissions/components | Answered |
| Archive/DEX/native/assets inventory | Answered |
| Strings/locales | Answered (default table exhaustive; locales enumerated) |
| Class inventory + feature map | Answered (with obfuscation caveat) |
| Split-by-split contents | Answered |
| Signing posture | Answered (structural; not cryptographically verified) |
| Per-feature deep dive | Answered at static-evidence level for all identified features |
| Runtime behavior | Not performed — out of scope of static analysis |
| Evidence export + investigation reset | Done — bundle at `_analysis/rea-evidence-bundle` (24 records, 24.2 MB); investigation reset, 24 records cleared |

## REA evidence retained

Complete records (parent evidence IDs):

| Operation | Evidence ID |
|---|---|
| `inspect_android_package` (base) | `ev_696dba112f9716a68ba3a5efe6b98e546d179154abbbc7e6a2d96c9cb289fd6c` |
| `inspect_apk_signature` (base) | `ev_28f2d64c252f906f9a43a5270195ad1c4005c6393746974a7c412d0e125d7569` |
| `inspect_artifact` inventory (base) | `ev_9c4953261b57067ae228de6942425467d99cfd74efc9f280674d6b97df0f7802` |
| `search_android_classes` / `list_classes` | `ev_3aef26c19ab7293154afa127de58abb4ad226d71d0c0e94a87449c1956892533` |
| `inspect_android_jni_bindings` | `ev_1f0e9ae182e5f1a0b78bae505acf90716cfc4e035a9f79a651336c4de6c4f68c` |
| Brella split record | `ev_5cf34d2609f30839c2b5d18f3186e27d1eea413f795fec257a3e393b9f938f37` |
| Tenor split record | `ev_64ff50ab4a8c3b5193d30213e64dac67494716c2011f97f6b6ce7f5f0926e9bd` |

Derived summary views and additional retained evidence: `ev_70c0dbaa…` (package summary), `ev_d09a7128…` (signature summary), `ev_8b5efba5…` (brella summary), `ev_4f9916e4…` (tenor summary), `ev_ef4b3ce0…` (resource decode), `ev_92a27b00…` / `ev_e2dc74b4…` (JNI views), `ev_c8aace65…`, `ev_00c17117…`, `ev_82f297ba…`, `ev_aabf6159…`, `ev_3d59f7b9…`, `ev_ac3df163…`, `ev_900b0d18…`, `ev_e9a450a8…`, `ev_ad006d8d…`, `ev_8c0d8aff…`.
