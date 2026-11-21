# 07 — Remote Connections (FTP server & client, SMB)

Three remote capabilities: (a) run an FTP **server** on the phone, (b) connect to FTP servers as a **client**, (c) connect to **SMB** (Windows) shares.

## FTP Server — phone → PC ("Connect to PC")

`com.android.fileexplorer.service.FTPServerService` (class evidence `ev_743231ea…eaf3616`, 29 methods — **runs in the main process**; the manifest declares no `android:process` for it, correcting an earlier draft):

- Wraps embedded `org.swiftp` (open-source swiftp FTP daemon): fields `ServerSocket b`, `TcpListener g`, `ProxyConnector h`, `List<SessionThread> i`.
- Holds `WifiManager.WifiLock s` + `PowerManager.WakeLock j` while serving; reads port/credentials from `SharedPreferences t`; `HashSet l/m` for allowed roots/networks; broadcast receiver `k` for state.
- `run()`/`onStartCommand` → `run()` starts `TcpListener`; sessions tracked in `i`; `onEventMainThread(j0.j)` handles UI state events.
- swiftp implements commands `CmdAPPE, CmdCDUP, CmdCWD, CmdDELE, CmdFEAT, CmdLIST, CmdMKD, CmdNLST, CmdOPTS, CmdPASS, CmdPASV, CmdPORT, CmdPWD, CmdQUIT, CmdRETR, CmdRMD, CmdRNFR, CmdRNTO, CmdSTOR, CmdSYST, CmdTYPE, CmdUSER` — i.e., anonymous or user/pass login (`ANONYMOUS_USERNAME="anonymous"` constant), passive+active data connections.
- UI side: `ServerControlActivity` (exported, action `SERVER_CONTROL`) + `ServerControlPreference` — start/stop toggle, shows `ftp://<ip>:<port>` address.

## FTP Client — browse FTP servers

- `org.apache.commons.net.ftp` bundled (class-search verified, doc 24) — FTPClient/FTPSClient.
- `FTPFileFragment` + `FTPRemoteHelper` (sibling of SMBRemoteHelper, verified under `.remote`) — remote listing through `RemoteVolumesFragment`; FTP/ChooseFTP-type dialog helpers under `.view` — server credentials add/edit (host, port, user, pass, anonymous).
- Remote items modeled as `com.xiaomi.globalmiuiapp.common.RemoteItem` (TYPE ftp/smb), persisted via DAO layer.

## SMB — Windows shares

- `com.hierynomus.smbj` + `com.rapid7` (class-search verified, doc 24) — SMBJ protocol implementation (SMB2/3).
- `SMBRemoteHelper` (`ev_f064cdbd…fba02d3`, 35 methods): connection list (`RemoteItem` `ArrayList j`), add/edit dialogs (`EditText m,n,p,q,r,v` for host/user/pass/share/domain, `CheckBox t` anonymous), `RefreshListView h`, `adapter.z` list adapter; inner classes for connect tasks (`a`–`f` async).
- `SMBFileFragment` browses `smb://host/share` trees; file ops proxied through remote-helper calls (`c()`/`b()` methods performing list/open).

## Process & plumbing

- `RemoteService` (process `:RemoteService`, `ev_c2792d17…a1f623`) — 7-method stub service keeping remote connection state alive; `onBind` exposes binder for `RemoteHelper.d` callbacks.
- `RemoteActivity`/`RemoteConfigActivity` — remote-section host/config screens.
- `RemoteVolumesFragment` aggregates FTP+SMB servers with local volumes.

## Evidence

FTPServerService `ev_743231ea…eaf3616`; RemoteService `ev_c2792d17…a1f623`; SMBRemoteHelper `ev_f064cdbd…fba02d3`; dex package inventory: `org.swiftp`, `org.apache.commons.net` (incl. `FTPSClient`), `com.hierynomus`/`com.rapid7` (smbj) — verified by class-prefix search (doc 24); manifest `ev_24480d9e…089c2a7`.

## Unknowns

- FTP server auth default (anonymous vs. generated password) — `ANONYMOUS_USERNAME` exists; whether ServerControl surfaces a password prompt is not fully traced.
- SMBJ dialect negotiation parameters (SMB1 allowed?) — not decompiled.
- TLS/FTPS support — `FTPSClient` is present in commons-net; whether UI enables it is unresolved.
