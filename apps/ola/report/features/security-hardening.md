# Feature Module: Security & Hardening — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

## Certificate pinning (obs, code-verified)
`SSLUtil.a()` → OkHttp `CertificatePinner` over `AppVariant.b()` map (ev_0907ee1e…/ev_283a9f3f…):
- `apps2.olacabs.com` → pins `sha256/r/mIkG3eEpVdm+u/ko/cwxzOMo1bk4TyHIlByibiA5E=`, `sha256/Ko8tivDrEjiY90yGasP6ZpBU4jwXvHqVvQI0GS3GNdA=`.
Coverage beyond this host: only what `AppVariant.b()` maps (2 pins on 1 host observed). Whether pinner is installed app-wide: unk.

## Root detection (obs)
`com.scottyab.rootbeer.*` + `libtoolChecker.so` exports `checkForRoot`, `setLogDebugMessages`, native `exists(const char*)` (ev_0deebffa…). Invocation timing/response: unk.

## APK signing (obs, ev_07f5e966…)
v2 + v3 signing blocks, identical cert SHA-256 in both, source stamp present, no v1. **Verification not performed** — authenticity unk.

## Native hardening (obs, ev_97686d34…)
`libmaplibre.so`: NX, full RELRO, SSP, FORTIFY, stripped, no rpath/runpath; no BTI/PAC. (Other libs not individually hardened-checked — partial coverage.)

## Obfuscation (obs)
R8 renames across app + vendor code; Juspay `.jsa` encrypted; Hermes bytecode (not plain JS); `ConnectUrls`/endpoint strings recoverable via clinit decompile (no string encryption observed on URL table — obs).

## Surface concerns (inf, not exploited)
- Exported `olamoneyrest WebViewActivity` + `RazorpayPaymentActivity` with no filters/permissions.
- Exported `SmsSentBroadcastReceiver(SimBinding)` — SMS state tracking exposed.
- `addJavascriptInterface` ×6 — JS bridge attack surface inside WebViews.
- Staging host strings in release build.
- `libhermestooling.so` + `rn_dev_preferences` — debug plumbing shipped.
- Embedded third-party keys (client config, obs) — standard for SDKs, listed in sdks.md.

## Unknowns
- Device fingerprint/anti-fraud beyond reCAPTCHA (Watson NetworkModel hints at device reporting, inf).
- Integrity/Play Protect calls, emulator checks beyond RootBeer.
