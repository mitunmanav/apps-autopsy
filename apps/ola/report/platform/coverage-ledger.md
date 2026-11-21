# Coverage Ledger & Verification — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

## Tool runs (REA + local)

| Operation | Target | Result | Coverage |
|---|---|---|---|
| `inspect_android_package` | base.apk | OK (ev_cfbd1d6e…) | full manifest, 180 components |
| `inspect_signature` (apk) | base.apk | OK (ev_07f5e966…) | v2+v3 blocks, shared cert sha256; verification not_performed |
| `open_binary` + `inspect_artifact` | base.apk | OK (ev_c14cbc5e…) | complete central directory: 5,413 entries / 5,189 nodes / 5,412 edges |
| `decode_android_resources` | base.apk | partial | 3,283/3,299 string entries over 3 pages; 16 omitted |
| `search_android_classes` | base.apk | OK | 32,228 classes; multiple paged queries |
| `inspect_android_class` ×~20 | various | OK | class summaries (methods+fields) |
| `inspect_android_method` ×~10 | various | OK | decompiled bodies incl. clinit URL/pin maps |
| `trace_android_references` | `Stetho`, `ChuckerInterceptor` | partial | Stetho: 0 xrefs (dead code). ChuckerInterceptor: exact-name lookup failed — class obfuscated (`com.chuckerteam.chucker.api.a`), wiring unresolved |
| `inspect_android_jni_bindings` | base.apk | partial (ev_e9f761f6…) | 941 native decls scanned; no auto-matched lib pairs |
| `open_binary` + exports | libtoolChecker.so | OK (ev_0deebffa…) | 3 exports |
| `inspect_binary_hardening` | libmaplibre.so | OK (ev_97686d34…) | NX/RELRO/SSP/FORTIFY/strip confirmed |
| `project_android_application_graph` | base.apk | **FAILED ×3** | evidence-shape errors; substituted by class enumeration |
| `inspect_analysis_view` | several | OK | summary projections |
| Local: `unzip`/strings/`fd` | extracted DEX+libs | OK | host/path/prefs/mining of raw strings |

## Failed/blocked items and impact
| Item | Impact |
|---|---|
| Application graph | no global call-graph; per-class tracing used instead — reduced cross-module completeness |
| JNI auto-binding | binding map incomplete; manual spot-check only (libtoolChecker) |
| Chucker xref | obfuscated name → unresolved whether interceptor attached |
| Hermes bundle | RN-internal features unenumerated |
| `.jsa` assets | Juspay flow internals unknown |
| Room schema | entity list only, no full schema |

## Verification checklist (real numbers)

| Check | Expected | Measured |
|---|---|---|
| APKs hashed | 4 | 4 ✓ |
| DEX files | 6 | 6 ✓ |
| Loaded classes | — | 32,228 ✓ |
| Scanned method records | — | 335,109 / 59,475 class records ✓ |
| Resources | — | 5,412 ✓ |
| Manifest components | — | 113 A / 31 S / 29 R / 7 P = 180 ✓ |
| Native libs | 13 | 13 ✓ |
| JNI native decls | — | 941 ✓ |
| Decoded strings | — | 3,283 valid, 16 omitted ✓ |
| Distinct URL hosts in report | — | ~25 documented ✓ |
| API path families | — | ~60 paths, 15 families ✓ |
| Report files | 31 | 31 ✓ |
| Documented tool failures | — | 6 ✓ |
| Unknowns recorded | — | 12 in limitations.md ✓ |
| Runtime evidence collected | 0 | 0 ✓ |

## Session evidence IDs (retained)
Package `ev_cfbd1d6e…` · signature `ev_07f5e966…` · archive `ev_c14cbc5e…` · JNI `ev_e9f761f6…` · SSLUtil `ev_0907ee1e…`/`ev_3def7b51…` · pins `ev_283a9f3f…` · live-loc `ev_dbcd9d76…`/`ev_bc16b700…` · OlaMoney endpoints `ev_47d7635c…`/`ev_73ee3d7e…` · auth `ev_91f87327…`/`ev_340407fd…` · PaymentReact `ev_ff9192c3…`/`ev_fafe7873…` · RootBeer exports `ev_0deebffa…` · maplibre hardening `ev_97686d34…` · Stetho xrefs `ev_374cde95…` · InboxEntity `ev_c80a0e53…` · OlaDiskBasedCache `ev_15b43aa3…` · OlaService `ev_2b0b31ae…`.
