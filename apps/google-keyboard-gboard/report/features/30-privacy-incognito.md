# Privacy, incognito & on-device data handling

## Incognito mode

- `LatinIme` checks `shouldEnableLearning=%s` when configuring the decoder — in **incognito/private mode** (per-app request, e.g. Chrome Incognito, Signal disappearing-message fields via `IME_FLAG_NO_PERSONALIZED_LEARNING`) the keyboard suspends learning and personalized suggestions.
- Incognito handling lives in `LatinIme` + obfuscated `defpackage.{pjs,grk,grm,grl,grj,oyd,stb,iov}` (the input-session/privacy state classes).

## Content filtering

- `libs.badwordchecker` + native `bad_word_checker_jni` — offensive-word filtering for suggestions.
- `safety_violation_checker_jni` — safety-violation check for AI outputs (see [10-ondevice-genai](10-ondevice-genai.md)).
- `disable_content_suggestion` — clipboard/content suggestion kill switch.

## Crash resilience — "lethe"

- `libraries.inputmethod.lethe` — **not privacy-related**: it's Gboard's crash-protection module (`lethe.impl.{CrashProtector, CrashDataStore, CrashDataUtils, UncaughtExceptionHandler}`, `lethe.anr.AnrDetector`, `lethe.notification.{CrashRecoveryNotification, CrashUtils}`, `lethe.initializer.CrashProtectorInitializer`). Metric counters `CrashProtector.{Init, InitOnVersionChange, ReadData, ReadNativeAnr, SaveNativeCrash}` — installs an uncaught-exception handler, detects ANRs and **native** crashes, persists crash data across restarts, and posts a "Gboard recovered" notification. Works together with `libnative_crash_handler_jni.so` and the `CrashResistantSwissArmyKnifeFileProvider` (see [31-settings-devtools](31-settings-devtools.md)).

## Declared posture (manifest)

- `android:usesCleartextTraffic="false"` — no plaintext HTTP.
- `android:gwpAsanMode="always"` — **GWP-ASan** heap-error detection always on (native memory safety in production).
- `android:extractNativeLibs="false"` — libs run directly from the APK (page-aligned).
- `android:allowBackup` + `libraries.inputmethod.backup.BackupAgent` — backup enabled with an agent deciding what's portable (e.g. `enable_backup_delight5_personalized_data`, `enable_hmm_user_history_backup` are the flagged portable stores).
- Permissions are capability-scoped: `RECORD_AUDIO` (voice), `CAMERA` (Scan Text/Signboard/Theme Builder), `READ_MEDIA_IMAGES` (clipboard screenshots, theme images), contacts permissions (contact biasing), `INJECT_KEY_EVENTS` + specialized Google permissions (signature-level).

## Data lifecycle controls

- "Delete learned words and data" — wipes Delight5 dynamic LM + personalization + history.
- `disable_correction_storage` — stop recording corrections.
- `AccountRemovedBroadcastReceiver` — account-keyed stores cleared on account removal.
- `enable_expression_data_pruning`, `enable_mdd_metadata_cleanup`, `enable_sqlite_release_memory`, `enable_delete_user_dictionary_typos` — retention/pruning hygiene.
- Federated path uploads **model deltas only** — see [28-federated-learning](28-federated-learning.md).
- Signboard hybrid disclosure: video stays on device; landmark points go to Google and are deleted after translation — see [16-signboard](16-signboard-sign-to-text.md).
- Writing tools on-device path claims Private AI Compute / encrypted processing for cloud fallbacks — see [10-ondevice-genai](10-ondevice-genai.md).

## Sensitive values note

Resource extraction surfaced a Google API key string in the default resource table. It is a client key (common in shipped Google apps, restricted by package name + signature); this report does not reproduce it. Treat as a shipped artifact value, not a validated credential.

## Security hardening observed

- GWP-ASan always on; native crash handler `libnative_crash_handler_jni.so`.
- Signature lineage + source stamp (Play distribution integrity).
- No `extractNativeLibs` unpacking — reduces tamper surface.
- Exported components are permission-gated (e.g. `BIND_INPUT_METHOD` on `LatinIME`, signature checks on `PixelBundleBroadcastReceiver`, `InputDeviceReceiver`).

## Unknowns

Whether every network path is TLS-pinned; exact contents of FL uploads; server-side retention — all require runtime/network evidence, not available from static analysis.
