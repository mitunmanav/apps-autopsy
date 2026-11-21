# Limitations, unknowns & checklist status

## Global limitations (apply to every file in this report)

1. **No runtime evidence.** The APK was never installed or executed. Every
   statement about behavior is static inference: manifests, DDL, string
   literals, decompiled control flow, ELF structure. Runtime-only facts
   (actual permission grants, server responses, enabled flags, encrypted
   vault operation, donation volume) are **unknown**.
2. **Signatures unverified cryptographically.** Structural parse only —
   `self_consistent` means declared digest == computed digest; anyone can
   recompute both. Authenticity requires chain verification + known-good
   comparator. Not performed.
3. **Obfuscation.** 93% of classes are `defpackage.*` (build-specific names).
   Class names cited (`kmo`, `kmv`, `hpt`…) are stable only for this build —
   cite via role + evidence string, not name alone.
4. **Decompile gaps.** Local JADX: 178 errors / 11,184 units (~1.6%) —
   synthetic/desugar edges. Missing method bodies = coverage holes, not absent
   code.
5. **Apktool 2.7.0-dirty** predates CVE-2024-21633 fix — decoded resource
   paths treated as untrusted data.
6. **JEB unavailable** — no `REA_JEB_MCP_URL` endpoint; JADX+native tools used
   instead. No DEX-level cross-check of selected decompiles.
7. **Partial decodes.** Base resources: partial coverage, 1,116 strings.
   En split: locale variants only (no default table — expected, defaults are
   in base).
8. **Split coverage.** Only 4 of the Play split set present (arm64, en,
   xxhdpi). Other ABIs/locales/densities exist but weren't analyzed.
   arm64 analysis applies to that ABI only.
9. **Reflection/dynamic dispatch.** Generated TikTok DI + reflection paths
   mean call graphs are under-approximated; `trace_android_references` finds
   static refs only.
10. **Phenotype/flags.** Server-side values unknown; presence ≠ enabled.

## Unresolved questions worth a follow-up pass

- Safe Folder: cipher mode (AES-GCM?), key-wrap relationship between
  Keystore master key and PBKDF2 output, lockout policy, vault dir path,
  secure-delete on move-out.
- Exact `file_hash` algorithm in `duplicates_alias`.
- `full_backup_content`/`dataExtractionRules` include/exclude lists.
- `DocumentsProvider` full contract surface.
- Geller JNI binding mechanism (`RegisterNatives` vs symbol exports —
  stripped lib prevents static confirmation).
- Whether bundled OCR models feed in-app text search or only descriptions.
- Load-order/`System.loadLibrary` call sites for the 4 `.so` files.
- BTI/PAC absence on geller lib — verify on other ABI splits.

## Checklist status

| # | Task | Status |
|---|---|---|
| 1 | Package identity + manifest | **done** — 100 components, `ev_0f1611bb…` |
| 2 | Provider readiness | **done** — JADX 0.7.1 + apktool + local JADX 1.5.6; JEB unavailable (recorded) |
| 3 | APK signature | **done** — base + all 3 splits; identical signers; `ev_f5e42aec…`, `ev_8cae83a8…`, `ev_009681ea…`, `ev_3ca47903…` |
| 4 | Archive inventory (4 APKs) | **done** — base via REA `ev_3f5ed051…`; splits via extraction + decode (`arm64` = 4 libs; `en` = locales; `xxhdpi` = 181 res) |
| 5 | Class inventory → feature map | **done** — `ev_84c506d0…` + string-index map in `class-inventory.md` |
| 6 | Resource/string decode | **done** — `ev_3c4389bf…` (base, partial), `ev_7d4d2281…` (en) |
| 7 | App graph projection | **done** — `ev_d0bba971…` |
| 8 | JNI + native libs | **done** — `ev_b482f31e…` + per-lib ELF/hardening/exports |
| 9 | Exposure audit | **done** — `ev_45c543e9…` no findings |
| 10 | Per-feature deep dives | **done** — 28 feature files; Safe Folder/crypto/trash/zip/share/search/scanner/Gemini decompiled |
| 11 | Structured report | **done** — this tree |
| 12 | Evidence export + reset | **done** — `evidence/rea-evidence-bundle.json` (51 records, 6.19 MB); `close_binary` + `reset_investigation` executed |

## Verification pass (post-write audit)

A full line-by-line re-verification against the decoded manifest, JADX
sources, string index, archive listings and the exported bundle was run after
the first draft. Corrections applied in-place (each file notes what changed):

- **manifest.md** — rewritten: removed non-existent permissions
  (`READ_MEDIA_*`, `CAMERA`, `BLUETOOTH`, `VIBRATE`), non-existent attributes
  (`appCategory`, `largeHeap`, `usesNonSdkApi`), wrong component names
  (`FileBrowserActivity`→`FileBrowserRegularActivity`, invented
  `MediaPlaybackActivity` deleted, media-button receiver removed,
  `InitializationProvider` removed), wrong scheme (`filesgo://`→`fbg-app`);
  added ~30 verified component names, GWP-ASan, adservices/omnient/p2p
  permissions, DYNAMIC_RECEIVER signature perm, ML Kit registrars, 13
  phenotype channels, real boot receiver (`TrashDbMigration…`).
- **Class-role fixes** — `hxx`→Safe Folder secret (not audio), `hya`→blur
  card (not audio), `kse`/`lqp`→AudioSequenceManager (real audio impl),
  `kru`→FCM delegate, `tvc`/`sce`/`rmd`→dropped (cronet/trace), `niz`/`niy`/
  `niq`/`niu`→`nio`/`nix`/`njb` (real AppSearch classes), `hvz`/`pke`→
  `hvg`/`hwa`/`huh`/`hvv`, `lpx` identified as `FileDatabaseAsyncDocumentCollection`.
- **Counts** — base `res/` entries 1,597 (was 1,253); total archive 1,647.
- **Newly confirmed** — `nix` AppSearch consumer allowlist (deskclock +
  googlequicksearchbox + cert digests), `assets/decision_rules.bin`, aksara
  layout models, `TextRegistrar`/`ThinLabelRegistrar`/`CustomLabelRegistrar`,
  `GmsDocumentScanningDelegateActivity`, Primes/Surveys/AppMeasurement/
  DroidGuard/privacy-ptoken channels, `huh`=`app_usage_database` helper.
- **All 20 cited evidence IDs** verified present in the exported bundle.
- **All 4 APK digests** recorded; all 4 signatures verified consistent.

## Remaining partials

- Application-graph interpretation: projected but edge-level walk per
  component is summarized, not enumerated node-by-node (volume: 1,576 nodes).
- `libandroidx.graphics.path.so` + `libmappedcountercacheversionjni.so`:
  identified + JNI-bound; no per-function disassembly (low value — shim libs).
- Per-method `inspect_android_method` coverage: key security paths done
  (master key, PBKDF2, auth activity, HomeActivity); long-tail feature methods
  covered via local JADX instead of REA evidence calls.
