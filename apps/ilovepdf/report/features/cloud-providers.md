> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Cloud storage — Google Drive, Dropbox, OneDrive/SharePoint

## How it works
- Provider implementations under `cloud/`:
  `DriveCloudFileManager`/`DriveAccountSession` (Google Drive,
  `android-auth` OAuth in `DriveAuthActivity`), `DropboxCloudFileManager`
  (custom `com.ilovepdf.dropboxsdk` + `DropboxXiLovePDFAuthActivity`),
  `MSGraphCloudFileManager`/`SharePointProviderImpl` (MSAL +
  `com.ilovepdf.msgraphsdk`, client `6c9d79a9-…`, redirect
  `msauth://com.ilovepdf.msgraphsdk/authcallback`).
- Browsing: `CloudFilesActivity`/`CloudFilesFragment` list remote trees;
  account state in `CloudTypeDBModel`/`*CloudAccountsManager`.
- Transfer services (`service.cloud`): `UploadFileToCloudService`,
  `DownloadCloudFileService`, `UpdateCloudFileService`,
  `SaveCloudFileAsCopyService`, `CloudUploadStateReceiver` +
  `CloudQueueManagerImpl` (Room-backed queue `UploadCloudFileQueueDBModel` /
  `UpdateCloudFileQueueDBModel`, resumable across reboots via
  BOOT_COMPLETED receivers).
- Tool integration: cloud files can be sent straight to the API as
  `server_filename` (`UploadCloudFileParams`) skipping re-upload; results can
  be saved back to the provider. `LaunchCloudOnClickOrPremium` +
  `RemoteCloudPremiumStrategyImpl` gate premium-only cloud actions.
