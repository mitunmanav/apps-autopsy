# Feature: Safe Folder (encrypted vault)

The deepest feature in the APK. All findings static; no vault was exercised.

## Cryptographic architecture

### Master key — Android Keystore

`defpackage.kmo.a()` (evidence `ev_ea9d2483e40ff589aa9f97542368ab4b7dff7772824dbefca2616222e2c4c35b`):

- Lazily creates/retrieves a key under alias
  **`android-keystore://safe_folder_master_key`**
- Synchronized initialization (double-checked style), wrapped by `tix`/`sih`
  (Google internal crypto wrapper — likely Tink-adjacent keyset handling).
- `kmo.g(...)` constructs the vault service object graph.

### Password → key — PBKDF2

`defpackage.kmv.d(String password, byte[] salt)`
(`ev_5c2229b27779179a39c0543961cda01611340332eb1784eff2ba011932730a1f`):

```java
SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1")
    .generateSecret(new PBEKeySpec(password.toCharArray(), salt, 10000, 256))
    .getEncoded();
```

- **PBKDF2-HMAC-SHA1, 10,000 iterations, 256-bit output.** Purpose inferred:
  password verification / KEK derivation for wrapping the master key. Whether
  output wraps the Keystore key or a separate Data-Encryption-Key is unresolved.

### Per-file encryption

`kmv.a(byte[])` delegates to the wrapped provider (AES family; exact
mode/padding inside the obfuscated wrapper). Artifact layout via strings:

- `safe_file_proto_mac` — MAC over a proto header (integrity)
- `safe_file_blob_enc` — encrypted file content blob
- `safe_file_metadata_enc` — encrypted per-file metadata
- `safe_folder_pref` — vault prefs/salt storage

⇒ per-file records = **MAC'd header + encrypted blob + encrypted metadata**;
metadata DB (`safe_folder_db`) maps vault path ↔ original location.

## Metadata DB (`safe_folder_db`, helper `hoz`)

```sql
CREATE TABLE safe_folder_metadata_table(
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  original_file_root_relative_path STRING NOT NULL,
  original_file_storage_location INTEGER NOT NULL,
  file_safe_folder_path STRING NOT NULL UNIQUE,
  file_last_modified_timestamp INTEGER NOT NULL);
```

- `file_safe_folder_path UNIQUE` — vault names unique; originals tracked for
  "move out" restoration.
- DAOs `knh`/`kni`/`knj`; query `WHERE file_safe_folder_path = ?`.

## Auth flow

`SafeFolderAuthActivity.onCreate`
(`ev_059fba0d98b7f541b68ad14387b70c97196512ce9bd060d45596c933de44c3e6`):

```java
getWindow().addFlags(8192);                    // FLAG_SECURE
setContentView(R.layout.safe_folder_auth_activity);
if (dU().d(R.id.auth_fragment) == null) { /* install auth fragment */ }
// lifecycle wiring + elapsed-pause state restore (re-lock after backgrounding)
```

- `FLAG_SECURE` blocks screenshots/recents of the auth UI.
- Biometric option via `USE_BIOMETRIC` + BiometricPrompt classes in
  `safefolder`/`settings` namespace; password path always present.
- Elapsed-pause restore → timed re-lock behavior (durations in prefs).

## Class inventory

Crypto/keystore: `ev_ea48ea0fd880d527493fabf2c2de2c8dc1ece44608190c5eee8d0d961bad9e50`
— `kmo`, `kmv`, `wkz`, `tix`, `sih` + DB layer `hoz`/`kng`/`knh`/`kni`/`knj`/`hzc`.
Added in verification: `hxx` — Safe Folder secret processing
(`FilesSafeFolder_processSecret`, `Old key is wrong.`, `Key has been set
before.` — the password→secret unwrap/verify path).
Manifest surfaces: `SafeFolderAuthActivity`, `SafeFolderBrowserActivity`,
`SafeFolderSettingsActivity` (three-screen vault UX).

## Assessment

- Design is sound-shaped: hardware-backed master key + password KDF + per-file
  AEAD-style records. PBKDF2-HMAC-**SHA1**@10k is below modern guidance
  (SHA-256/Argon2), mitigated if it only gates unwrap of a strong DEK.
- Unresolved: exact cipher mode (AES-GCM assumed from Tink-style wrapping),
  key-wrap relationship, biometric key binding, failed-attempt lockout policy,
  vault directory location, secure-delete on move-out.
