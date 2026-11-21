# 15 — Encrypted location backup / import-export

Classes: `helper.CryptoUtils`, `helper.utils` (export at ~line 300+, import at ~565+).

## Format

- JSON payload: `{version:1, app:"GPSMapCamera", timestamp:<ms>, locations:[{loc_*, loc_radius, loc_timestamp…}]}`
- Serialized from the manual-locations SQLite DB, then **AES-GCM encrypted**:
  - `GCM_IV_LENGTH=12`, `GCM_TAG_LENGTH=128`
  - PBKDF2 (`PBEKeySpec`) key from hardcoded passphrase `GMC_Loc_Backup_Secure_Key_2026`, fixed `SALT[16]`
  - File magic `GMCB` + `FILE_VERSION=1`
- Written via MediaStore to `Documents/GPS Map Camera/Backups` (`application/octet-stream`) — the `.gmc` backup files referenced by strings.

## Import path

`utils` decrypts → `DecryptResult` sealed class: `InvalidFormat` → "select_gmc_file" toast, `TamperedOrCorrupted` → "tampered_backup_file" toast, `Success` → parse `locations` array → single SQLite transaction insert. Export failure → `locations_export_failed`.

## Security assessment

- **Hardcoded passphrase + fixed salt** means backups are obfuscation-grade, not user-keyed: any `.gmc` file is decryptable by anyone with this APK. Same-key-everywhere also enables ciphertext forgery of "valid" backups (GCM tag verifies only against the shipped key).
- Correct primitives otherwise (GCM AEAD, PBKDF2, magic+version header).
