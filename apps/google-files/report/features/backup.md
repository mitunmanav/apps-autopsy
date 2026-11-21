# Feature: Android backup

- **`com.google.android.apps.nbu.files.backup.FilesBackupAgent`** — a named
  `backupAgent` is declared (verified in manifest); `allowBackup="true"`,
  `fullBackupOnly="false"`, `restoreAnyVersion="true"`,
  `requestLegacyExternalStorage="true"`.
- Backed-up scope: app prefs/databases per the agent's rules — Safe-Folder
  crypto material is **Keystore-backed and non-exportable** by design (vault
  contents encrypted, key never leaves hardware).
- `restoreAnyVersion` allows restore onto older app versions — migration
  code must tolerate down-level restores.

## Google-Photos backup card

Separate feature: home-feed card promoting Google Photos backup (strings) —
a cross-sell surface, not a backup mechanism in Files itself.

## Evidence

`FilesBackupAgent` manifest attr, Keystore design, backup-card strings.

## Unknowns

- Agent's per-key include/exclude logic (obfuscated `BackupAgentHelper`
  subclass body not decompiled for this pass).
- Whether `safe_folder_db` is excluded from backup (should be — verify).
