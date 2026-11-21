# Feature Module: React Native Payments Shell — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

## Evidence (obs)
- `assets/index.android.bundle` = Hermes bytecode **v96**, ~2,672,760 bytes. Not human-readable source.
- Native runtime: `libhermes.so`, `libhermestooling.so`, `libjsi.so`, `libfbjni.so`, `libreactnative.so`, `librnscreens.so`, `libc++_shared.so` (arm64 only).
- `PaymentReactActivity` (default-export, 1 filter): fields = `ReactRootView`, `Bundle`, `Promise`, `PaymentSdkRequestData`, progress dialog; methods serialize request data into RN props (`j0/k0/l0/O`), `getMainComponentName()="OlaPaymentsReact"` (ev_fafe7873…), `onActivityResult` for external payment app returns.
- `in.juspay.hypersdkreact.ProcessActivity` — HyperSDK RN processing screen.
- `com.microsoft.codepush.react.*` — OTA bundle updates (deployment key embedded, obs).
- `reactnativecommunity.webview.RNCWebViewFileProvider` — RN webview file access.

## Flow (inf, bounded)
Payment action (native) → `PaymentSdkRequestData` → `PaymentReactActivity` → Hermes bundle `OlaPaymentsReact` → JS orchestrates PSP SDKs (Juspay `ProcessActivity`, Razorpay, NPCI) → Promise resolves → native result.

## Versioning
- Bundle is static v96; CodePush can replace it at runtime (unk whether enabled in prod).
- `libhermestooling.so` shipped — debug capability present in release (obs, loading unk).

## Unknowns
- All JS-side screens/routes/business logic (bytecode).
- Native modules registered (`RegisterNatives` runtime).
- CodePush signing/enforcement.
