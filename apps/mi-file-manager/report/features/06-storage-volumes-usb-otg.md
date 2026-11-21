# 06 — Storage Volumes, StorageInfo & USB OTG

## Volume discovery

- `StorageVolumesFragment` — lists internal storage + SD card + USB OTG + remote volumes (`RemoteVolumesFragment` sibling for FTP/SMB).
- Volume detection via `StorageManager`/mount-point utilities (`Util.getVolumeList`-style), with MIUI-specific fallbacks. Mount events (`MEDIA_MOUNTED`/`MEDIA_UNMOUNTED`) are delivered through **`activity.FileActivity`'s intent filters** — there is no declared app broadcast receiver for mounts (manifest-verified, doc 02).
- `StorageInfoActivity` (declared, not exported) — per-volume usage breakdown screen (total/used/free by category: images, video, audio, docs, apks, other), typical of MIUI's storage manager UI.

## USB OTG (libaums)

Bundled `com.github.mjdev.libaums` (USB mass-storage for Android):

- `UsbManagerHelper` — watches `UsbManager` attach/detach, requests `USB_PERMISSION` via PendingIntent broadcast, exposes device list to `UsbFileFragment`.
- `libaums` drives SCSI/BulkOnly over `UsbDeviceConnection` to mount FAT32/NTFS (read) filesystems — no root required.
- JNI: `libaums.ErrNo` → `liberrno-lib.so` — native `errno` translation helper (JNI evidence `ev_be453578…9b445`, parent `ev_d1029b99…dff318`).
- `UsbFileFragment` — browses the mounted mass-storage partition through libaums's `UsbFile`/`FileSystem` abstractions (list, copy-in/copy-out to internal storage through `FileOperationManager`).

## DocumentsUI / SAF bridging

- `DocumentsUIActivity` — class present in dex but **not declared in the manifest** (dead/disabled code path — doc 02); intent was presumably to forward into system DocumentsUI (SAF) under scoped storage.
- `RequestManageExternalStoragePermissionFragment` — the Android 11+ "All files access" onboarding (doc 12), matching `MANAGE_EXTERNAL_STORAGE` + `requestRawExternalStorageAccess`-style helpers.
- Legacy flags `requestLegacyExternalStorage`/`preserveLegacyExternalStorage`/`requestRawExternalStorageAccess` (all true, manifest-verified) keep pre-Android-10 semantics where possible.

## Internal/external volumes

- Primary volume via `Environment.getExternalStorageDirectory()`; secondary via `StorageManager.getVolumeList`/`Context.getExternalFilesDirs` fallbacks.
- Mount/unmount events flow through `FileActivity` intent filters (see above); rescan plumbing exists in `engine.mi.scanner.MediaScanner`/`StorageHelper` (verified clean-package classes).

## Evidence

`ev_be453578…9b445` (JNI view; `ErrNo`→errno-lib binding), class inventory `ev_c7d5130a…787a4a` (StorageVolumesFragment, `manager.UsbManagerHelper`, `UsbFileFragment`), libaums package listing (doc 24), manifest (`ev_24480d9e…089c2a7`).

## Unknowns

- libaums filesystem write support (NTFS write? exFAT?) — the bundled version's exact feature matrix not exhaustively verified; upstream libaums is primarily FAT32 read/write.
- Whether USB browsing uses SAF fallback on devices without direct USB access — code paths exist for both but selection logic not fully traced.
