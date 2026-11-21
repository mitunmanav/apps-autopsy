# 24 — Third-Party Library & SDK Inventory

Class-prefix inventory via `search_android_classes` — each row individually searched (prefix/literal matching). App packages: `com.android.fileexplorer*` + `com.mi.android.globalFileexplorer` (`ev_c7d5130a…787a4a`); `com.xiaomi.*` = 623 classes.

## Confirmed present (class-prefix match found)

| Package / lib | Evidence | Purpose |
|---|---|---|
| `okhttp3` + `okio` | `ev_b3e4fe2a…8ad243` | HTTP client |
| `com.squareup.moshi` | `ev_5c04b8b8…6064c9a` | JSON (not Retrofit/Gson) |
| `com.bumptech.glide` + generated `FE*` integrations | `ev_8026c380…9c075c` | image loading — custom `FEAppGlideModule`-style setup |
| `org.bouncycastle` | `ev_31c89ab4…98a2bf` | crypto — **BouncyCastle, NOT SpongyCastle** |
| `com.github.junrar` | `ev_31c89ab4…98a2bf` | RAR extraction |
| `com.iab.omid.library.xiaomi` | `ev_31c89ab4…98a2bf` | IAB Open Measurement (ad viewability) |
| `com.zeus.gmc.sdk.mobileads.columbus` (+`msa`, `cmpLib`) | `ev_e9665481…d570f5` | Xiaomi Zeus/Columbus ad SDK ~371 classes incl. its own consent lib `cmpLib.CMPLib` |
| `com.xiaomi.miglobaladsdk`, `mobileads.{admob,columbus,facebook}` | pkg inventory | Xiaomi ad mediation + network adapters |
| `com.facebook.ads` + `assets/audience_network.dex` | archive | FB Audience Network (dynamic dex) |
| `com.google.android.gms.ads`, `firebase.*` | manifest/classes | AdMob, FCM, AppMeasurement, Crashlytics, RemoteConfig |
| `net.openid.appauth` | manifest/classes | OAuth2/AppAuth (Drive auth) |
| `com.github.mjdev.libaums` | classes | USB OTG mass storage |
| `org.swiftp` | classes | FTP server |
| `org.apache.commons.net` | classes | FTP client |
| `com.hierynomus`, `com.rapid7` | classes | SMBJ SMB client |
| `androidx.*` (room, work, startup, multidex, browser…) | manifest/classes | jetpack stack |
| `ndk_lzma` | JNI `ev_be453578…9b445` | LZMA/7z decompression |
| `miui.*`, `miuix.*` | classes | MIUI widgets/theme |
| `com.xiaomi.mecloud`, `.mirror`, `.synergy`, `.metoknlp`, `.junk`, `.filter`, `.func.cache`, `.util` natives, `globalmiuiapp.*` | pkg inventory | Xiaomi vendor glue (623 classes) |
| `com.xiaomi.sdk.IXiaomiCleaner` + `privacy.cleaner` | pkg inventory | CleanMaster AIDL + privacy-clean callbacks |
| `org.apache.http.legacy` | uses-library | legacy HTTP compat |
| `androidx.window.extensions`/`sidecar` | uses-library | foldable support |

## Searched — NOT observed (no matching class names in complete inventory)

| Library | Evidence |
|---|---|
| ZXing (`zxing`) | `ev_9645568f…f69c075c` |
| Picasso | `ev_b2fec63b…886266` |
| Greenrobot EventBus | `ev_1323fca1…9b9b067` |
| SpongyCastle | `ev_4d4e2f15…a14df` |
| XStream | `ev_d65ee482…4ed357` |
| `com.google.android.ump` (Google UMP) | ump prefix search — no matches |
| `DownloadInstall*` classes | `ev_3548f7c0…69931f` |

> "Not observed" = no class names matched the prefix query — it is not absolute proof that equivalent functionality is absent (e.g., QR generation still exists in `ShareViaQRCodeActivity` via a different implementation).

## Corrections vs. earlier draft

- ~~Picasso~~ → **Glide** is the loader (with custom `FE*` modules).
- ~~SpongyCastle~~ → **BouncyCastle** (`org.bouncycastle`).
- ~~Retrofit/Gson/XStream~~ → **OkHttp + Moshi** is the network/JSON stack.
- ~~greenrobot EventBus~~ → custom event mechanism in obfuscated `j0.*` (`onEventMainThread(j0.j)` callbacks).
- ~~Google UMP~~ → Zeus `cmpLib.CMPLib`.
- ~~ZXing~~ → absent; QR rendering comes from elsewhere.
- ~~DownloadInstallService/Receiver~~ → no such classes; update flow inside `SelfUpgradeChecker`/`UpgradeConfirmDialog`.

## Unknowns

- Exact library versions (no POM/manifest metadata retained).
- Small utility deps hidden inside single-letter obfuscated packages.
