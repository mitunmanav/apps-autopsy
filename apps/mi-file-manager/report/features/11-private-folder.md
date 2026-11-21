# 11 — Private Folder (hidden file vault)

`com.android.fileexplorer.activity.PrivateFolderActivity` (`ev_765777d1…abed1972`, 52 methods, `excludeFromRecents`, `Theme.PrivateFolder` — **exported=true**, no intent filter: launchable by explicit component name from other apps, see doc 23).

## Behavior (static)

- Constants: `EXTRA_TAB`, `KEY_ENABLE_PRIVATE_FOLDER` (SettingManager pref — feature toggle).
- State: `mUnlocked` gate, `mIsFirstEnter`, `mTryTransform` + `mTryTransformTask` (one-time migration — transforms previously hidden files into the vault layout).
- Model: `mFileNameList : ArrayList<i0.d>` (`FileInfo`-type items), `mRefreshSdcardFileTask : AsyncTask<Void,Void,Pair<Integer,List<FileInfo>>>` — scans a private directory on SD card.
- `mFileOperationManager : l0.a` — same FileOperationManager as normal browsing: move-in/move-out/rename/delete inside the vault.
- `PrivateModeCallBack mCallBack` + `PrivateListItem` + `PrivateGrid`/`PrivateListItemAdapter`-style `adapter.y` — private-mode list UI with unlock dialog.
- `MiEncryptHelper` — encryption/naming helper; private files historically stored in a dot-folder under `MIUI/` or `Android/data` with `.fs`/no-MediaStore-visibility (exact directory constant inside obfuscated `Util`/`FileUtil` — see unknowns).

## Unlock

- Gate code in `PrivateModeCallBack` + activity `mUnlocked` — pattern/PIN handled via MIUI security (`AuthenticationImeInfoActivity`-style screens exist for cleaner IME data; private-folder unlock leverages `SecurityCenter`/pattern or the app's own PIN — exact authenticator class not fully decompiled).
- `KEY_ENABLE_PRIVATE_FOLDER` master switch in settings.

## Evidence

`ev_765777d1…abed1972` (class structure: fields/tasks/callbacks), manifest (activity decl + theme + excludeFromRecents + exported), `ev_c7d5130a…787a4a` (PrivateModeCallBack, PrivateListItem, MiEncryptHelper presence).

## Unknowns

- **Exact vault directory** — path constant lives in an obfuscated util class; not resolved to a literal in available evidence.
- Whether contents are merely dot-hidden/relocated or content-encrypted — `MiEncryptHelper` exists but its cipher ops not decompiled here; treat as obfuscation/renaming + optional encryption, unverified.
- Whether a password is stored hashed/encrypted — unresolved.
