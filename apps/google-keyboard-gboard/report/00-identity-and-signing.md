# Artifact identity & signing

Evidence: `inspect_apk_signature` (`ev_28f2d64c…`), `inspect_android_package` (`ev_696dba11…`), `inspect_artifact` (`ev_9c495326…`).

## Identity

| Field | Value |
|---|---|
| Package | `com.google.android.inputmethod.latin` |
| Original package | `com.android.inputmethod.latin` (AOSP lineage preserved via `<original-package>`) |
| versionName | `18.5.4.993608717-release-arm64-v8a` |
| versionCode | `176049702` |
| minSdk | 32 (Android 12L) |
| targetSdk | 37 (Android 17) |
| compileSdk | 37 / `DEV` codename — built against a pre-release SDK |
| coreApp | `true` |
| `extractNativeLibs` | `false` (libs are loaded from inside the APK, uncompressed) |
| `usesCleartextTraffic` | `false` |
| `gwpAsanMode` | `always` (GWP-ASan memory-safety telemetry enabled) |
| `multiArch` | `false` (arm64-only build) |

## Signing posture (declared, not verified)

| Scheme | Present | Signers | Certificate SHA-256 |
|---|---|---|---|
| v1 (JAR) | no | 0 | — |
| v2 | yes | 1 | `f0fd6c5b410f25cb25c3b53346c8972fae30f8ee7411df910480ad6b2d60db83` |
| v3 | yes | 1 | `f0fd6c5b…db83` (same key) |
| v3.1 | yes | 1 | `7ce83c1b71f3d572fed04c8d40c5cb10ff75e6d87d9df6fbd53f0468c2905053` |

- **Key rotation declared**: v2/v3 use one certificate, the v3.1 block a different one with a lineage of 2 — Google rotated its Gboard signing key and uses v3.1's rotation to keep update compatibility.
- **Play source stamp present**: certificate `3257d599…b6d` — distributed through Google Play.
- `self_consistent: true` — declared content digests match the shipped bytes. This is integrity, **not** authenticity: REA does not verify the signatures.
- Two custom permissions: `…latin.pixelbundle.RECEIVER` (`knownSigner|signature`) and `…latin.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` (`signature`) — both restrict components to Google-signed callers.

## Split APKs

| Split | Declared purpose | Contents |
|---|---|---|
| `split_brella_feature_split` | Feature module "brella" (TensorFlow on-device inference delivery) | `lib/arm64-v8a/libtensorflow_jni.so` only; 0 classes |
| `split_tenoranimation_feature_split` | Feature module "tenoranimation" (Tenor animated-image decode) | `lib/arm64-v8a/libtenoranimation_jni.so` only; 0 classes |
| `split_config.xxhdpi` | Density config | resources only |

Both feature splits are **native-library delivery vehicles**: Google ships the heavy ML/image codecs on demand via Play Feature Delivery. Strings confirm a *Dictation* additional-module label too (`split_N1675184395 = "Additional module (Dictation)"`).

## Size & shape

- 9,145 ZIP entries, 8,719 content nodes — dominated by 8,972 `res/` entries (all resource names R8-shrunk).
- 4 DEX files ≈ 20.7 MB total; **21,810 top-level classes**, 118,230 examined methods.
- `assets/dexopt/baseline.prof` + `.profm` — ships a Baseline Profile for AOT/JIT warmup.
- `stamp-cert-sha256` — Play's per-split stamp.
