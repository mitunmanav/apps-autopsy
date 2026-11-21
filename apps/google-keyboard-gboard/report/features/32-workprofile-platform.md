# Work profile, backup & platform integration

## Cross-profile / work profile

- `com.google.android.enterprise.connectedapps.CrossProfileConnector_Service` + `internal.CrossProfileBundleCallSender` — **Connected Apps** SDK: calls between personal and work profiles.
- `libraries.inputmethod.workprofile.{CanInteractAcrossProfilesBroadcastReceiver, TrampolineActivity, EmptyActivity}` — detects cross-profile capability, trampolines requests across the profile boundary, empty activity stub.
- `libraries.inputmethod.personaldictionary.preference.CrossProfileDictionaryPreference` — **cross-profile personal dictionary** (share learned words between profiles when policy allows).
- Manifest declares `INTERACT_ACROSS_PROFILES`-family permissions; "Work profile" strings limit some features (voice typing work-profile restrictions).
- "Work profile" gating strings: several features (voice, personalization) disable or degrade inside a work profile per device policy.

## Backup & restore

- `libraries.inputmethod.backup.BackupAgent` — Android backup agent.
- `enable_backup_delight5_personalized_data`, `enable_hmm_user_history_backup` — the flagged-backupable stores (Delight5 personalization + CJK user history).
- `restore_default_shared_preference`, `migrate`/`restore` keys — restore/migration handling.

## Background work

- `libraries.inputmethod.work` — WorkManager wrappers; workers seen: `MddMetadataCleanupWorker`, `ForegroundDownloadTaskWorker`, `MaintenanceTaskWorker`, `SuperpacksGcWorker`, `InputMetricsPeriodicTask`.
- Manifest `WorkManager`-related component (initializer/provider) is part of the 73-component list.

## Sharing & links

- `apps.inputmethod.libs.sharing` + manifest share/link receivers — "Share" entry points let users share stickers/links, and `link_type`/`image_feedback_result` keys feed the image-feedback receiver.
- `libraries.inputmethod.embeddedphotopicker` — **embedded photo picker** for inserting photos (theme builder, sticker creation, content sharing).

## Notifications & engagement

- `rateus` — rate-us prompt module.
- `hint` (`libraries.inputmethod.hint` + `libs.hint`) — in-keyboard hint/education bubbles (`enable_floating_dock_hint_v2` etc.).
- `activitytransition`, `animatedview`, `popup` — transition/popup UI infra.
- `accesspoint` — toolbar access-point framework (feature entry chips: voice, clipboard, translate, OCR, signboard, Jarvis, Rambler…).

## Startup & lifecycle

- `appstart`/`startup` — startup task framework.
- `userunlock` — direct-boot (pre-unlock) support so the IME works on the lock screen.
- `blankactivity`, `launcher.firstrun.*` — first-run flow pages: `EnableStepPage`, `SelectInputMethodStepPage`, `PermissionStepPage`, `UserMetricsStepPage` (enable IME → select it → optional permissions → metrics consent).
- `keyboardmode`, `inputview`, `ime.AbstractIme` — IME framework base classes.
