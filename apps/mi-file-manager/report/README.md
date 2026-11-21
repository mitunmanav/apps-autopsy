# Mi File Manager — teardown report

| | |
| --- | --- |
| **Target** | `com.mi.android.globalFileexplorer` (`base.apk`, 20.3 MiB) |
| **Version** | V1-210601 (versionCode 20210601, minSdk 21, targetSdk 33) |
| **SHA-256** | `5c220e4bb13492712148f3fc298872088e11fab9b67d93c181b721e6fdc3fa3d` |
| **Platform** | Android |
| **Method** | static |
| **Analyzed** | unknown |
| **Tools** | REA · JADX headless 0.7.1 · apktool 2.7.0 |
| **Obtained** | local archive |
| **Analyst** | @mitunmanav |

## What this is

Xiaomi's Mi File Manager, global/international build — file browsing, a
clean/junk-scan engine, WhatsApp status saver and a self-upgrade checker.
Never executed.

## Artifact set

| Field | Value |
|---|---|
| Package | `com.mi.android.globalFileexplorer` |
| App | Xiaomi **Mi File Manager — Global** (international build) |
| versionName / versionCode | `V1-210601` / `20210601` (June 2021) |
| minSdk / targetSdk / compileSdk | 21 / 33 / 33 |
| Signer | v1+v2+v3, one signer (cert `c9009d01…29025`), `META-INF/PLATFORM.RSA` |
| Code | 3 DEX + `assets/audience_network.dex`, 19,080 classes, partially obfuscated |
| Native | 9 .so entries (arm64-v8a + armeabi) + `assets/bspatch` ELF |
| Locales | 88 |
| Archive entries | 2,352 (2,595 decoded resources) |

## Layout of this report

| # | Doc | Contents |
|---|---|---|
| 01 | [identity-build-signing](features/01-identity-build-signing.md) | Package, version, signature schemes, DEX layout |
| 02 | [manifest-components-permissions](features/02-manifest-components-permissions.md) | All 86 components, permission posture, queries |
| 03 | [app-bootstrap-architecture](features/03-app-bootstrap-architecture.md) | Application/proxy init, process model, code organization |
| 04 | [file-browsing-operations](features/04-file-browsing-operations.md) | Main UI, file lists, operations hub, pickers |
| 05 | [categories-media-docs](features/05-categories-media-docs.md) | Category browse: docs/images/video/audio/favorites |
| 06 | [storage-volumes-usb-otg](features/06-storage-volumes-usb-otg.md) | Volumes, StorageInfo, USB OTG (libaums), DocumentsUI |
| 07 | [remote-ftp-smb](features/07-remote-ftp-smb.md) | FTP server (swiftp), FTP client (commons-net), SMB (smbj) |
| 08 | [cloud-drive-auth](features/08-cloud-drive-auth.md) | Cloud drive, OAuth/AppAuth, Google sign-in |
| 09 | [junk-cleaner](features/09-junk-cleaner.md) | CleanActivity, MiEngine scanners, CleanMaster engine, whitelist |
| 10 | [deep-clean](features/10-deep-clean.md) | Deep clean UI: cache, large files, videos, APKs, app cleaners |
| 11 | [private-folder](features/11-private-folder.md) | PrivateFolder hidden-file vault |
| 12 | [privacy-consent](features/12-privacy-consent.md) | Privacy activity, consent fragments, permission onboarding |
| 13 | [whatsapp-status](features/13-whatsapp-status.md) | WhatsApp status saver + cleaner |
| 14 | [share-transfer](features/14-share-transfer.md) | ShareActivity, QR share, OtaTransferService, FileProvider |
| 15 | [media-viewers](features/15-media-viewers.md) | Video player, large-image viewer, GIF views |
| 16 | [search-apps-misc](features/16-search-apps-misc.md) | Search, app management, recent apps, locale/settings screens |
| 17 | [providers-database](features/17-providers-database.md) | FileContentProvider + 16 sub-providers, Room DAOs, DirParse |
| 18 | [ads-monetization](features/18-ads-monetization.md) | MiAd SDK, Columbus/Zeus GMC, AdMob, Facebook AN, mediation |
| 19 | [push-analytics-crash](features/19-push-analytics-crash.md) | FCM/GCM, AppMeasurement, Zeus crash monitor |
| 20 | [self-update-feedback](features/20-self-update-feedback.md) | SelfUpgradeChecker, bspatch, feedback, score/auth web |
| 21 | [network-endpoints](features/21-network-endpoints.md) | HTTP stack, endpoints, network security config, secrets |
| 22 | [native-code](features/22-native-code.md) | .so inventory, JNI bindings (62 decls), bspatch |
| 23 | [security-assessment](features/23-security-assessment.md) | Exported surface, dangerous permissions, findings |
| 24 | [third-party-inventory](features/24-third-party-inventory.md) | All bundled libraries/SDKs |
| 25 | [resources-i18n](features/25-resources-i18n.md) | Resources, 88 locales, strings, layouts |
| 26 | [checklist](features/26-checklist.md) | Question-by-question status + confidence ledger |

## Evidence ledger

| Evidence ID | Operation | Scope |
|---|---|---|
| `ev_24480d9e…089c2a7` | inspect_android_package | Manifest, permissions, 86 components |
| `ev_1eb71f69…45f3ef` | inspect_apk_signature | v1/v2/v3 signers, self-consistency |
| `ev_13cc3da3…49d31e6d` | decode_android_resources | Manifest text, strings, locales |
| `ev_fec9a360…57e179f` | archive inventory projection | 2,352-entry archive inventory |
| `ev_07e4b7fc…f8f832d` | project_android_application_graph | component + bridge projection |
| `ev_be453578…9b445` (parent `ev_d1029b99…dff318`) | JNI analysis view | 62 decls / 124 bindings → 48 matched, 26 ambiguous, 50 unknown |
| `ev_c7d5130a…787a4a` | search_android_classes | complete app-package class inventory |
| `ev_e9665481…d570f5` | search_android_classes | `columbus.cmpLib.CMPLib` (Zeus consent lib) |
| `ev_b3e4fe2a…8ad243` / `ev_5c04b8b8…6064c9a` / `ev_8026c380…9c075c` | search_android_classes | okhttp3 / moshi / glide confirmed |
| `ev_9645568f…f69c075c` / `ev_b2fec63b…886266` / `ev_1323fca1…9b9b067` / `ev_4d4e2f15…a14df` / `ev_d65ee482…4ed357` | search_android_classes | zxing / picasso / eventbus / spongycastle / xstream — NOT observed |
| `ev_31c89ab4…98a2bf` | search_android_classes | junrar + bouncycastle + OMID confirmed |
| `ev_3548f7c0…69931f` | search_android_classes | no `DownloadInstall*` classes |
| `ev_743231ea…eaf3616` | class analysis | FTPServerService |
| `ev_c2792d17…a1f623` | class analysis | RemoteService |
| `ev_f064cdbd…fba02d3` | class analysis | SMBRemoteHelper |
| `ev_765777d1…abed1972` | class analysis | PrivateFolderActivity |
| `ev_20abd63c…a3bee` | class analysis | OtaTransferService |
| `ev_a3a0d9fd…b7cc6f` | class analysis | SystemAdContentProvider |
| `ev_1ae31731…c7d767` | class analysis | FileContentProvider |
| `ev_542f2e23…052882` | class analysis | DirParseService |
| `ev_6336079a…82308f` | inspect_android_method | FileExplorerApplication.onCreate |
| `ev_f082a1db…e02f72` | inspect_android_method | FileExplorerTabActivity.onCreate |
| `ev_ff348ddf…8a0468` | inspect_android_method | MiEngine.startScan |
| `ev_418210b8…a021b6` | class analysis | CmEngine |
| `ev_f446c290…5c2aa` | class analysis | CleanActivity |
| `ev_4ef9f594…73bdf29` | inspect_android_method | SelfUpgradeChecker.requestCloudState |
| `ev_f5ff8a5b…f0c4d` | inspect_android_method | WhatsAppStatusSaveService.onHandleIntent |
| `ev_e33d20c6…cb0e5` | class analysis | HttpManager |
| `ev_6298fcc4…deb6b58` | class analysis | GlobalConsts |
| `ev_616ecd25…1ffece` | inspect_android_method | attachBaseContext |

Full method/class evidence IDs are cited inline in each feature doc.

## Findings

- **[obs]** Beyond browsing it ships a junk-scan engine (`MiEngine`, `CleanActivity`), a WhatsApp status-saver service, and a self-upgrade checker (`SelfUpgradeChecker`).
- **[obs]** 3 DEX + an extra `assets/audience_network.dex` (Meta Audience Network ads); 19,080 classes, partially obfuscated; 88 locales.
- **[obs]** Signed v1+v2+v3 with a `PLATFORM.RSA` signer — unusual for a third-party store build.

## Limitations

Static analysis only — no runtime observation; decompiled names are
partially obfuscated and no `mapping.txt` ships in the APK, so some semantic
names are inferred.

## Coverage

Every surface of the artifact, and where this report covers it.
A `n/a` or `gap` here is a statement about this report, not about
the app.

| Surface | Covered in |
| --- | --- |
| Identity & signing | features/01-identity-build-signing.md |
| Components & exported surface | features/02-manifest-components-permissions.md |
| Permissions | features/02-manifest-components-permissions.md |
| Network & API surface | features/21-network-endpoints.md |
| SDKs, ads & trackers | features/24-third-party-inventory.md |
| Native code & JNI | features/22-native-code.md |
| Persistence & local data | features/17-providers-database.md |
| Protection & obfuscation | features/23-security-assessment.md |
| Embedded config & shipped secrets | features/21-network-endpoints.md |
| Monetization | features/18-ads-monetization.md |
| Feature inventory | features/ docs 03–16 above |
| Updates & dynamic delivery | features/20-self-update-feedback.md |
| Privacy | features/12-privacy-consent.md |
