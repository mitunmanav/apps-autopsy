# Personalization & typing-data management

Evidence: `pref_clear_typing_data*` prefs, `DynamicModelWordsActivity` (debug), `com.touchtype.settings.Personalization*`, dynamic-term-model Fluency params, support-dialog "manage data" strings, account "View and manage your data".

## Learned language model

- The Fluency engine maintains a **personal dynamic model** alongside shipped LMs — `dynamic-term-model.language-weighting-strength = 0.33`, `parameter-learning.*` (adaptive wildcards, 1M limit, disabled by default) in `fluency_params.json`.
- Learned words feed predictions across all layouts/languages; stored per-profile in app data (paths under Fluency service storage).

## User controls

- **View & manage data** (`pref_account_manage_data*` → "View and manage your data") — inspect learned words, delete individual entries.
- **Clear typing data** (`pref_clear_typing_data_prefs`) — wipe the personal model.
- **Delete data only** (account screen) — delete personalized dictionary **cloud backup** while keeping the account.
- Incognito mode stops learning (see `incognito-mode.md`).
- Per-language learned models ride language sync to other devices.

## Debug surface

`DynamicModelWordsActivity` — internal screen listing dynamic-model words (dev tool, still shipped).

## Remote influence

`dynamic-term-model.language-weighting-strength`, `language-detection.power=0.4` and `parameter-learning` flags are server-overridable through appconfig → Microsoft can tune learning behavior remotely.
