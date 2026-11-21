# Limitations & Unknowns — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

## Hard limitations
1. **No runtime evidence.** Nothing was installed, executed, proxied, or captured. Every "behavior" statement is a static observation or a bounded inference, never a runtime fact.
2. **Hermes bytecode.** `index.android.bundle` (2.67 MB, v96) is compiled bytecode — the payments RN feature surface inside it is not source-recovered (routes, screens, logic unk).
3. **Encrypted Juspay bundles.** `assets/*.jsa` are encrypted HyperSDK payloads; contents unk.
4. **R8 obfuscation.** Large parts of app + vendored SDKs renamed to single letters; recovered logic only where decompilation succeeded.
5. **JNI matching gap.** 941 `native` declarations, but REA's binding matcher returned no selected-library pairings; only `libtoolChecker` JNI exports verified manually. `RegisterNatives` runtime registration unresolvable statically.
6. **String decode partial.** 3,283 valid entries decoded across 3 pages; 16 entries omitted (unsupported markup/missing names).
7. **Manifest ≠ runtime.** Exported flags, permissions, and deeplinks are declarations; grant/launch behavior unk.
8. **Signature not cryptographically verified.** v2+v3 blocks present with one shared cert SHA-256 (obs); chain validity/authenticity unk.
9. **Application graph not generated.** `project_android_application_graph` rejected supplied evidence shapes repeatedly; replaced by package/class enumeration + targeted tracing.
10. **Room schema partial.** Entities identified but full schema/DAO coverage not extracted.
11. **Reflection/dynamic loading** — any code reached only via reflection, DexClassLoader, or runtime string decryption is invisible to this analysis (unk by definition).

## Key unresolved unknowns (for a follow-up pass)
- Full `DeeplinkActivity` route table.
- `HeaderHelper` complete header construction.
- Room entities `a–f` schemas and all DAO queries.
- Where auth tokens persist (DataStore vs SharedPreferences vs Keystore).
- Whether Chucker interceptor is attached in release networking.
- CodePush bundle override behavior in production.
- Full JNI binding map.
- Per-endpoint request/response schemas.
