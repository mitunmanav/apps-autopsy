> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# 09 — Known limitations & open questions

Static analysis only — the APK was never executed. Anything below needs a
runtime or the source repo to resolve.

1. **REA full-package inspect OOM'd** at ~2.6 GiB heap on the 18-DEX base APK.
   Worked around with a slim-DEX local JADX decompile (9,274 classes). REA's
   own class/method tools were therefore not exercised; evidence is the
   decompiled tree + aapt2/apkanalyzer dumps instead.
2. **~191 JADX decompile errors**; several Kotlin coroutine bodies decompile to
   `UnsupportedOperationException("Method not decompiled")` — exact internal
   control flow of `Task.execute`, `ILovePdfSDK.execute`, some fragments is
   inferred from signatures/metadata, not verified instruction-by-instruction.
3. **Native internals unknown**: `libk1sdk.so`/`libpspdfkit.so` algorithms,
   JNI registration tables, and whether `k1_*` symbols map 1:1 to
   `PDFNativeLib` methods were checked at symbol level only, not traced.
4. **Feature flags**: Remote Config + `experiment`/`ab_testing` mean real UI
   (tool order, paywalls, premium/offline routing) can differ from defaults in
   code.
5. **Server behavior out of scope**: api.ilovepdf.com request/response beyond
   the client-side models (`Params`, `TaskStatus`, `TaskApiModel`) is
   client-inferred, not observed.
6. **Signature authenticity**: v2/v3 blocks are self-consistent with a Play
   source stamp; no cryptographic verification against a known Google/iLovePDF
   cert was performed.
7. **Dex counts**: classes2-11/15-17 are almost entirely third-party
   (firebase, psdfkit, compose, geniusscan, tesseract, etc.); per-class
   inventory was sampled, not exhaustively decompiled (see `dex-packages.txt`).
8. **Strings → features**: a few strings imply features with no found caller
   in the app DEXes (e.g. `html_to_pdf`-style helpers) — likely dead code or
   server-driven; flagged individually where relevant.
