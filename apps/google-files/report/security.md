# Security analysis

## Cryptography inventory (static)

| Primitive | Location | Detail |
|---|---|---|
| Android Keystore AES master key | `kmo.a()` | alias `android-keystore://safe_folder_master_key`, lazy synchronized init, wrapped in `tix`/`sih` (Google crypto wrapper) — `ev_ea9d2483e40ff589aa9f97542368ab4b7dff7772824dbefca2616222e2c4c35b` |
| PBKDF2-HMAC-SHA1 | `kmv.d(String, byte[])` | `SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1")`, `PBEKeySpec(password, salt, 10_000, 256)` — `ev_5c2229b27779179a39c0543961cda01611340332eb1784eff2ba011932730a1f` |
| Wrapped symmetric ops | `kmv.a(byte[])` | delegates to provider wrapper, catches `IOException`/`GeneralSecurityException` |
| Per-file format | strings | `safe_file_proto_mac`, `safe_file_blob_enc`, `safe_file_metadata_enc` — MAC'd header + encrypted blob + encrypted metadata |

See `features/safe-folder.md` for the full vault analysis.

## Screen / UI protections

- `FLAG_SECURE` (8192) on `SafeFolderAuthActivity` — blocks screenshots/recents
  thumbnail of the auth surface (`ev_059fba0d98b7f541b68ad14387b70c97196512ce9bd060d45596c933de44c3e6`).
- `excludeFromRecents="true"` on a sensitive manifest surface.
- `USE_BIOMETRIC` declared; BiometricPrompt path exists in settings/safefolder
  namespaces (static presence only).

## Build-level hardening (manifest-verified)

- `android:gwpAsanMode="always"` — **GWP-ASan** native heap-error detection
  enabled for all users.
- `android:usesCleartextTraffic="false"` + `network_security_config`.
- `DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` — signature permission guarding
  dynamically registered receivers.
- DroidGuard client channel (`gms.droidguardclient` phenotype pkg) —
  anti-abuse attestation plumbing.

## Path-safety

- Zip-slip defense: `Invalid zip file canonical path` in `qdr` — canonical-path
  containment check on extraction.
- `.trashed-*` rename keeps trash inside origin volume (no cross-volume copy).

## Native hardening (`libgeller_jni_lite_lib.so`)

NX + full RELRO (`BIND_NOW`) + stack protector + fortify + stripped + no
RPATH/RUNPATH. Missing: AArch64 BTI/PAC property (no pointer-auth/branch-target
hardening). `ev_cbe509f4a124c45b7c09f4cdd1bb82463f427454af3697ed6cc1070b5a50661c`

## Network security

- `network_security_config` XML present (decoded resources) — Google default
  posture; no user-cert trust declared in the config seen.
- Cleartext handling per config; endpoints are Google TLS services.

## Isolation

- PDF rendering in `isolatedProcess` service — untrusted-document parsing is
  sandboxed away from app permissions.
- Exported surface concentrated on gateway aliases; internal activities
  not exported.

## Release exposure audit

`ev_45c543e907d05af02c056152163225fffe26c6bd833c2c914a79dc67fa14bdd6` — **no
high/medium/low findings in assessed checks**. Scopes: exposed components,
secrets-in-resources scan limits, JS/source-map checks N/A (not a web bundle).
This is a coverage-bounded static statement, **not** a security certification.

## Residual risks / unknowns

- PBKDF2-HMAC-**SHA1** @10k iterations is dated (vs SHA-256/Argon2) — acceptable
  for a mobile vault but below modern guidance. Whether it gates key unwrap or
  just verification is unresolved (see safe-folder.md).
- Keystore key properties (attestation, biometric-binding, validity window)
  not recoverable from `kmo.a()` decompile alone.
- No runtime verification: certificate pinning behavior, root checks,
  debugger detection — none observable statically; may exist in obfuscated init.
- `MANAGE_EXTERNAL_STORAGE` + `REQUEST_INSTALL_PACKAGES` are high-capability
  permissions; exposure audit found no abuse-prone exported path but runtime
  consent UX governs real risk.
- No `v1` signature → minSdk 32 makes that moot; v3 rotation block is sound.
