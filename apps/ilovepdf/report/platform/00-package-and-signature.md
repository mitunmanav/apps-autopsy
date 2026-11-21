> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# 00 — Package identity, splits and signature

## Identity

| Field | Value |
|---|---|
| Package | `com.ilovepdf.www` |
| Label | iLovePDF |
| versionName / versionCode | 4.2.3 / 4002003 |
| minSdk / targetSdk / compileSdk | 32 / 36 / 37 |
| Application class | `com.android.ilovepdf.ILovePdfApplication` |
| Base APK | 218,258,959 bytes, SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41` |

## App-bundle splits (Play delivery, `com.android.vending.splits`)

| Split | Size | Contents |
|---|---|---|
| `base.apk` | 208 MiB | All DEX (18 files, ~170 MiB uncompressed), res, assets |
| `split_config.arm64_v8a.apk` | 76 MiB | `lib/arm64-v8a/*.so` (25 native libraries) |
| `split_config.en.apk` | 156 KiB | English `resources.arsc` overlay |
| `split_config.xxhdpi.apk` | 126 KiB | xxhdpi drawables |

`extractNativeLibs="false"` — `.so` files are mapped uncompressed from the split APK.
`largeHeap="true"`, `allowBackup="true"`, `requestLegacyExternalStorage="true"`.

## Signature (REA `inspect_apk_signature`, Evidence `ev_fa762812…`)

| Scheme | Present | Signers |
|---|---|---|
| v1 (JAR) | no | — |
| v2 | yes | 1 |
| v3 | yes | 1 |
| v3.1 | no | — |

- Signer certificate SHA-256: `d36aa4f8780c982853e75476b6740ef10c2bb2cce972b5ff515eb2ea8edf891c` (same cert for v2 and v3)
- Source stamp present (Play Store, cert `3257d599…6d`)
- `self_consistent: true` — declared digests match current bytes; `v1_only: false`;
  `schemes_agree_on_signer: true`; no key-rotation lineage
- Not verified: signatures, chains, revocation, authenticity — analysis is structural only.

## Interpretation

A single-developer Play-signed build with the standard 4-way split delivery.
The source stamp marks it as a Play distribution APK (vs. App Gallery build —
Huawei HMS IAP is also bundled, see `platform/04-third-party-sdks.md`).
