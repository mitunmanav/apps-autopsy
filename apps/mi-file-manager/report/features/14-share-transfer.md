# 14 — Share, QR Share & File Transfer

## Share-out

- `ShareActivity` (declared, not exported) — builds `ACTION_SEND`/`ACTION_SEND_MULTIPLE` intents from selected `FileInfo`s; URIs minted via `FileExplorerFileProvider` (`com.mi.android.globalFileexplorer.myprovider`, `res/xml/file_paths.xml`, `grantUriPermissions=true`) so recipients get `content://` access without storage perms.
- `ShareViaQRCodeActivity` (declared, not exported) — shows a QR encoding a local HTTP/hotspot transfer endpoint (peer scans → downloads directly); typical Mi Drop-style flow. **No ZXing classes in dex** (verified — `ev_754d2af9…b11be5e`); QR generation must come from another bundled source or the ad SDK's own renderer — pairs with `OtaTransferService`.

## Share-in

- `CopyFileActivity`/`MoveFileActivity` — **activity-aliases** → `FileActivity`; receive `SEND`/`SEND_MULTIPLE`, let user pick a destination, then copy/move via `FileOperationManager` (doc 04).

## OtaTransferService

- `ota.OtaTransferService` (`ev_20abd63c…a3bee`) — `IntentService` with helpers `a/b/c/d(Context)` (build intent / is-running / start): hosts a local HTTP server or hotspot receiver transferring selected files (paired with `ShareViaQRCodeActivity`; also used by Mi Drop-like flows). 1 field (`Context a`), `onHandleIntent` performs the transfer loop.

## FileProvider

- `FileExplorerFileProvider` — androidx `FileProvider` over `file_paths.xml` (external-path roots), feeds `content://` URIs to share/open-with intents (`FLAG_GRANT_READ_URI_PERMISSION`).
- `provider` mirror sub-provider (dao `MirrorManager`/`MiuiSynergySdk` — Xiaomi "synergy" device-to-device file surface for tablets/foldables sharing the file tree).

## Evidence

`ev_20abd63c…a3bee` (OtaTransferService), manifest (`ev_24480d9e…089c2a7`: SEND filters via aliases, fileprovider, shortcuts), class inventory (`ev_c7d5130a…787a4a`: Share/QR/mirror classes), `ev_754d2af9…b11be5e` (ZXing absent).

## Unknowns

- Exact QR payload format + HTTP port + which QR generator it uses (inside `ShareViaQRCodeActivity` — not decompiled here; ZXing confirmed absent).
- Whether Mi Drop interoperability exists with other Xiaomi devices (`OtaTransferService` name suggests OTA-style P2P; protocol not verified).
- Mirror/synergy scope (foldable/PC cross-device listing) — `MirrorManager`/`MiuiSynergySdk` classes present; depth not traced.
