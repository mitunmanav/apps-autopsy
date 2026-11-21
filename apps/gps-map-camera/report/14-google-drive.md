# 14 — Google Drive sync

## What exists

- **Sign-in**: `MyFilesActivity` (~lines 668–720) builds `GoogleSignInOptions` with scope `https://www.googleapis.com/auth/drive.file` and launches the Play-Services sign-in intent (`APPAUTH_SIGN_IN`/`NO_IMPL` fallback). `GoogleSignInAccount` field `E`; `login_email`/`user_name` keys store identity.
- **Folder picker**: `GDFolderActivity` — displays `Google Drive/GPS Map Camera/<folder>`; `model.DriveFolder(id,name)`; persists `GD_FOLDER_PATH` (default `Default.DEFAULT_FOLDER_NAME`).
- **Toggle**: `IS_UPLOAD_ON_GOOGLE_DRIVE` switch in `MyFilesActivity` (line ~461).
- **Re-entry**: `Splash_Screen` handles `auto_connect_drive` intent extra (deep-link/notification → Drive connect flow); `feature_connected_drive` analytics (`GOOGLE_DRIVE_CONNECTED`).
- **Promo campaign**: `drive_promo_notif_sent`, `drive_promo_v1..v4_sent`, `drive_promo_variation_index` — notification variants pushing the Drive feature.
- UI strings advertise "Auto Upload to Google Drive": `Your photos will automatically sync to the selected folder.`, `Photos will no longer sync to your Google Drive account.`

## What does NOT exist (static)

- **No `com.google.api.services.drive` client classes** in the APK (`ev_4f95cb29…` — zero matches).
- No `drive` classes at all (`ev_0beaa957…`), no `googleapis` upload endpoints in DEX strings, no multipart/`uploadType`/`Bearer` upload code in decompiled app sources.
- `CameraActivity` field `M3` (`GoogleSignInAccount`) is declared but **never referenced** — dead scaffolding.

## Conclusion

This build implements Drive **sign-in, folder selection and an enable-flag**, but no upload code path is reachable from decompiled Java. The upload either lives in a Pairip VM-protected method, was removed, or is a stub behind the marketing UI. Treat "auto-upload to Google Drive" as **unverified at best, likely non-functional scaffolding** in 1.9.40.

## Unknowns

- VM-protected method bodies (could contain REST upload)
- Server-side handling if any token is sent elsewhere (no evidence found)
