# APK signature analysis — base.apk

Evidence: `ev_f5e42aecb8d51fa12df682034ead0f7edce6fe500605195c1ccfb417ef219bc5`

## Declared schemes

| Scheme | Present | Cert SHA-256 |
|---|---|---|
| v1 (JAR) | **no** | — |
| v2 | yes | `207af9a133a630c4246a06c79c09946a70840f4702ee5baa53f3791b537b0f14` |
| v3 | yes | `1c817cae3628ed5726f8020b71483511036213691f7c615c6f974a70a15674f3` |
| v4 (`.idsig`) | not present in artifact | — |

- **v3 > v2** — v3 carries the rotated signing key; the two certs differ because
  v3 includes the rotation lineage (Google rotated the Files signing key).
- **Key rotation proof block**: present in v3.
- **Source stamp** (`stamp-type-source-stamp` v2 block): present — Play-added
  attribution; consistent with a Play-delivered build.
- Structural checks (block ordering, digests structurally consistent) reported
  **consistent**.

## What was NOT verified

- Cryptographic signature verification against the digests (structural parse
  only in this pass).
- Certificate chain → root, expiry, revocation.
- Whether the cert matches Google's published release cert for this package
  (authenticity against an external reference — needs a known-good comparator).
- v4 incremental signature.

## Split-APK signature consistency — VERIFIED

All three splits inspected (`inspect_apk_signature`, summary view):

| Split | SHA-256 | v2 | v3 | Evidence |
|---|---|---|---|---|
| arm64_v8a | `68ba1d14…a42b` | `207af9a1…0f14` | `1c817cae…74f3` | `ev_8cae83a805ca2ba638a5ad764c574b61c8d6f5e79da081c3edce1127fab7e091` |
| en | `79d8d7a0…e60a` | `207af9a1…0f14` | `1c817cae…74f3` | `ev_009681eadeaa74213bfe2a2a1e5d65c1513790fff7ec1cb2c16e56b88efea915` |
| xxhdpi | `cd5a5f2d…2926` | `207af9a1…0f14` | `1c817cae…74f3` | `ev_3ca479038af1bf0ea4eefae153d42d9e236e52e74e6ddd2b645b17083ae2c5e7` |

- **All four APKs declare identical v2 and v3 certificates** — a single
  consistent signing identity across the split set. `self_consistent: true`
  on every member (declared content digest matches current bytes).
- **Source stamp identical** on all four: cert SHA-256
  `3257d599a49d2c961a471ca9843f59d341a405884583fc087df4237b733bbd6d` —
  same Play-attribution stamp, consistent with a single Play delivery.
- `signer_change_declared_by_rotation: true` — the v2→v3 cert difference is a
  declared key rotation, not a re-sign anomaly.
- `v1_only: false`, no v3.1, 1 signer per scheme, lineage count 2.

## Digest inventory

- `base.apk`: `9c1abf53edb2b3d4374b5c4262170d11ff815e4f6a89d519a096ca15ab036877` (19,789,612 B)
- `split_config.arm64_v8a.apk`: `68ba1d1482a278044f5bfdd99ed95d09476b5a9d4c0ab3966d8c344cae8aa42b` (610,800 B)
- `split_config.en.apk`: `79d8d7a0beb25039496620991ffdb13566d585f0a90b760de3d62f2768eee60a` (274,642 B)
- `split_config.xxhdpi.apk`: `cd5a5f2daf947ac288e50d1811cfba4bef36b6681944186970e970c6b5422926` (149,666 B)
