# Evidence index

All REA evidence IDs cited across the report. Artifact digests are the
integrity anchors — verify before reusing conclusions on a modified APK.

## Artifact digests

| Artifact | SHA-256 |
|---|---|
| `base.apk` | `9c1abf53edb2b3d4374b5c4262170d11ff815e4f6a89d519a096ca15ab036877` |
| `split_config.arm64_v8a.apk` | `68ba1d1482a278044f5bfdd99ed95d09476b5a9d4c0ab3966d8c344cae8aa42b` |
| `split_config.en.apk` | `79d8d7a0beb25039496620991ffdb13566d585f0a90b760de3d62f2768eee60a` |
| `split_config.xxhdpi.apk` | `cd5a5f2daf947ac288e50d1811cfba4bef36b6681944186970e970c6b5422926` |

## REA evidence

| ID | Subject |
|---|---|
| `ev_0f1611bb…940576` | Package + manifest inspection (100 components) |
| `ev_f5e42aec…219bc5` | APK signature (v2/v3, certs, rotation, stamp) |
| `ev_84c506d0…7d0287` | Full class inventory (17,602 classes) |
| `ev_3f5ed051…7810238` | base.apk archive inventory (1,648 occ / 1,576 nodes) |
| `ev_3c4389bf…ffd7d4` | base resource decode (1,757 files, partial) |
| `ev_7d4d2281…0ca2c45e8` | en-split resource decode (locales only) |
| `ev_d0bba971…a6aad9c` | Android application graph projection |
| `ev_b482f31e…34651da` | JNI inventory (25 natives / 93,543 methods) |
| `ev_acdadf7a…be2ff66` | `libgeller_jni_lite_lib.so` ELF layout |
| `ev_ef096b35…a8c06e2ee` | `libimageutilsjni.so` ELF layout |
| `ev_cbe509f4…50661c` | Geller hardening (NX/RELRO/BIND_NOW/strip) |
| `ev_e80b834f…e3ae34` | image-utils exports (5 `Java_*` fns) |
| `ev_ea9d2483…e4c35b` | `kmo.a()` — Safe Folder master key init |
| `ev_5c2229b2…2730a1f` | `kmv.d()` — PBKDF2-HMAC-SHA1 10k/256 |
| `ev_ea48ea0f…ad9e50` | Safe Folder keystore/crypto class inventory |
| `ev_059fba0d…e44c3e6` | `SafeFolderAuthActivity.onCreate` (FLAG_SECURE) |
| `ev_45c543e9…a14bdd6` | Release exposure audit (no findings) |
| `ev_8cae83a8…b7e091` | arm64 split signature (v2/v3 identical to base) |
| `ev_009681ea…efea915` | en split signature (v2/v3 identical to base) |
| `ev_3ca47903…ae2c5e7` | xxhdpi split signature (v2/v3 identical to base) |

## Local (non-REA) artifacts

| Path | Contents |
|---|---|
| `/tmp/fbg/jadx-src/sources/` | JADX 1.5.6 full decompile (17,595 entries, 178 errs) |
| `/tmp/fbg/libs/` | 4 extracted `.so` files |
| `/tmp/stridx.txt` | 2,839 interesting const strings → class index |
| `/tmp/manifest.xml`, `/tmp/strings.json` | decoded manifest + strings scratch |
| `/tmp/devin-overflows-1000/` | full tool outputs (truncated-call archives) |

## Coverage notes

- JNI base-APK pass selected 0 libs (libs live in the split) — resolved by
  direct split inspection.
- Local JADX 178 decompile errors — synthetic/desugar edges, ~1.6% of units.
- Apktool decode = **partial** coverage; 1,116 strings decoded.
- Only base.apk signature-inspected; splits unverified.
