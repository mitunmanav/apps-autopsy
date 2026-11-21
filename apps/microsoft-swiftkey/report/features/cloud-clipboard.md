# Cloud Clipboard (Windows clipboard sync)

Evidence: `cloud_clipboard_*` strings (26), `cloud_clip_prediction_bar_*`, `clipboard_clip_sync_*`, `clipboard_clip_origin_label`, `clipboard_cloud_*`, FCM plumbing.

## What it is

Clipboard history sync between Android SwiftKey and **Windows Cloud Clipboard** — copy on phone → paste on PC and vice versa.

## Endpoints (hardcoded strings)

- `cloud_clipboard_api_url` = `https://clip.api.swiftkey.com`
- `cloud_clipboard_channel_url` = `https://clip.api.swiftkey.com/channel` — subscription/channel endpoint
- `cloud_clipboard_fcm_sender_id` = `973377065179` — dedicated FCM sender for clipboard push notifications

## Behavior

- Pref title "Sync clipboard history"; subtitle: "Copy and paste text from your other Windows devices. When this is on, Microsoft receives your c[lipboard contents]".
- **Requires Microsoft account sign-in**: `clipboard_sync_modal_text` — "The contents of the clipboard may be personal, so to keep it protected, we need you to sign in…"
- States surfaced in UI: `Syncing ON` / `Syncing PAUSED` / `Syncing ERROR` (+a11y variants, error notice + notification "We're having issues syncing").
- Subscription lifecycle strings: `enable_subscribing` "Subscribing to Cloud Clipboard…", `subscribing_cancelled`, `subscribing_failed`, `subscription_push_pull_error` — a push/pull channel over FCM + HTTPS.
- `clipboard_clip_too_large` — "Item too large to sync" (server-side size cap).
- Windows pairing: `cloud_clipboard_windows` + `clipboard_cloud_post_enable` — "finish setting this up on your Windows device. Settings > System > Clipboard" + support links (`how-to-use-microsoft-swiftkey-keyboard-to-copy-and-paste-te…`); `pref_account_set_up_windows`.
- Prediction-bar integration: last copied item from another device can show as quick-paste chip (`cloud_clip_prediction_bar_pref_*`).
- Account migration error handling: `cloud_clipboard_account_migration_error`, `cloud_clipboard_account_problem`.
- Learn-more: `support.microsoft.com` links.

## Privacy notes

Microsoft receives clipboard contents when enabled (per consent copy); sync pausable without sign-out.
