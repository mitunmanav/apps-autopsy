# 20 — Self-Update, Feedback & Web Flows

## Self-update — `com.android.fileexplorer.selfupdate`

`SelfUpgradeChecker.requestCloudState` (`ev_4ef9f594…73bdf29` — full body decompiled):

- Dedupes concurrent checks; pulls a `MarketUpgradeData`-shaped JSON via an obfuscated data-source call (`e1.b.B().A()` — market/update provider).
- Parses Google Play-style result payloads; persists market version metadata (versionCode/name/channel) via `SettingManager`-style store.
- **Update condition**: remote `versionCode > 20210601` (current) *and* "fitness==0" (device-fit flag).
- Checkbox/default-update logic weighs: Google Play usage, region, metered-network flag, `SystemSettings.getAutoUpdateState` (MIUI auto-update toggle).
- `startDownloadApk` — downloads delta or full APK and triggers install (`REQUEST_INSTALL_PACKAGES` + FileProvider URI). Note: **no `DownloadInstall*` classes exist in dex** (verified `ev_3548f7c0…69931f`) — the download/install path lives inside the two real selfupdate classes (`SelfUpgradeChecker`, `UpgradeConfirmDialog`) or obfuscated helpers.
- `UpgradeConfirmDialog` — UI gate; `getMiuiBigBuildVersion` selects channel.
- **`assets/bspatch`** — native bsdiff/bspatch binary for **delta updates** (patch old→new APK, saving bandwidth) — consistent with the "fitness" gate.
- Permission `com.android.fileexplorer.permission.ota` guards update IPC.

## Feedback & web (manifest-verified)

- `activity.FeedbackActivity` — exported via `…action.FEEDBACK` (real declared activity; issue-report screen).
- `activity.ScoreWebActivity` — `action.SCORE`, `singleTask`, not exported — app "score"/rating web page.
- `activity.AuthWebActivity` — `action.AUTH`, `singleTask`, not exported — generic auth web host.
- `fe://` custom scheme + `https://fe.miui.com` browsable links → deep links into `FileExplorerTabActivity`; `fe://security.fe.miui.com` browsable → `FileCategoryActivity`.
- Feedback/self-update endpoints assembled via `Urls`/`HttpManager` (doc 21).

## Evidence

`ev_4ef9f594…73bdf29` (requestCloudState body), `ev_69b718d8…925e702` (SelfUpgradeChecker class), `ev_e33d20c6…cb0e5` (HttpManager), `ev_fec9a360…57e179f` (bspatch asset), manifest `ev_24480d9e…089c2a7` (filters `fe://`, `fe.miui.com`, `security.fe.miui.com`; Feedback/AuthWeb/ScoreWeb activities), `ev_3548f7c0…69931f` (no DownloadInstall* classes).

## Unknowns

- Exact update-check endpoint(s) — URL built inside obfuscated code from config; only the Google Play/Market *shape* verified, literal hosts unresolved (doc 21).
- Delta-patch fallback (full APK if bspatch fails) — code path exists (`bspatch` + full download both present) but selection logic not fully traced.
- Whether self-update is disabled on Play-distributed builds — region logic suggests it's Xiaomi-channel only.
