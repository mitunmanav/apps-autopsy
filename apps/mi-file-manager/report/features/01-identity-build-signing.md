# 01 — Identity, Build & Signing

## Package identity

| Property | Value | Source |
|---|---|---|
| Package name | `com.mi.android.globalFileexplorer` | manifest |
| versionName | `V1-210601` | manifest |
| versionCode | `20210601` (June 2021 build) | manifest |
| Application label | `@string/app_name` ("File Manager") | manifest |
| minSdkVersion | 21 (Android 5.0) | manifest |
| targetSdkVersion | 33 (Android 13) | manifest |
| compileSdkVersion | 33 | decoded manifest |
| `largeHeap` / `hardwareAccelerated` / `allowBackup` | true / true / true | manifest application attrs |
| `requestLegacyExternalStorage` / `preserveLegacyExternalStorage` / `requestRawExternalStorageAccess` | true / true / true | manifest |
| `networkSecurityConfig` | `@xml/network_security_config` | manifest |
| `uiOptions` | `splitActionBarWhenNarrow` | manifest |
| `uses-library` | `org.apache.http.legacy`, `androidx.window.extensions`, `androidx.window.sidecar` (all optional) | manifest — foldable/window support |
| `supportsRtl` | true | manifest |
| Application class | `com.android.fileexplorer.FileExplorerApplication` | manifest |
| `appComponentFactory` | `androidx.core.app.CoreComponentFactory` | manifest |

Evidence: `ev_24480d9e…089c2a7` (inspect_android_package), `ev_13cc3da3…49d31e6d` (decode_android_resources).

This is the **Global (non-CN) build** of Xiaomi's Mi File Manager: package `globalFileexplorer`, GlobalBrowser references, Google/Firebase backends, GDPR-style consent via the **Zeus Columbus SDK's own `cmpLib.CMPLib`** (not Google UMP — verified `ev_e9665481…d570f5`), separate `PrivacyKRFragment` for Korea.

## Build artifacts

- `classes.dex`, `classes2.dex`, `classes3.dex` — app code, multidex (`androidx.multidex` via `MultiDex.install` in `attachBaseContext`).
- `assets/audience_network.dex` — Facebook Audience Network SDK shipped as a *separate dex file*, loaded dynamically at runtime rather than packaged in the main dex. Dynamic loading bypasses static reference coverage.
- 19,080 classes total (all dexes). App code is partially obfuscated (`a`, `b`, `c`… single-letter names across `com.android.fileexplorer` service/controller internals and `com.xiaomi` glue). No `mapping.txt` is shipped.
- `META-INF/PLATFORM.RSA` — signed with Xiaomi's platform certificate (consistent with the privileged signature permissions it requests; see doc 02).

## Signature

Evidence: `ev_1eb71f69…45f3ef` (inspect_apk_signature).

- Signing schemes present: **v1 (JAR), v2, v3**. v3.1 absent.
- Exactly **one signer**, identical across all three schemes — cert SHA-256 `c9009d01ebf9f5d0302bc71b2fe9aa9a47a432bba17308a3111b75d7b2149025`.
- Self-consistent (all schemes agree on the signer). Structural inspection only — the tool does not cryptographically verify signatures, certificate chains, or revocation. Authenticity beyond self-consistency is **unknown** (not verified).
- Platform signature explains why the manifest can request signature-level permissions (`WRITE_SECURE_SETTINGS`, `MANAGE_USERS`, `DELETE_CACHE_FILES`, etc.) — they grant only when the app is signed with the device platform key (i.e., on MIUI builds where Xiaomi's platform cert matches) or pre-installed.

## Archive composition

Evidence: `ev_fec9a360…57e179f` (archive inventory projection — 2,352 entries).

- `res/` resources, `res/` obfuscated paths (e.g., `res/aB.xml`), `resources.arsc`, `AndroidManifest.xml` (binary).
- `lib/arm64-v8a/` + `lib/armeabi/` — see doc 22.
- `assets/` — `bspatch` binary, `audience_network.dex`, ad SDK assets (`migd/`, `cands/`…), `crashanalysis`/`system_image` files, `X-AG-*.crt` certs, `functions/`, `fonts`, `terrain/`, `worldmap` (Zeus/Columbus assets), `x-metadata.properties`.
- `META-INF/` — `PLATFORM.SF`, `PLATFORM.RSA`, `MANIFEST.MF`, version files.

## Dex composition (approximate, from class search)

- ~19,080 classes: AndroidX, Kotlin stdlib, Google Play Services / Firebase, **OkHttp/Okio + Moshi** (verified), **Glide** w/ custom `FE*` modules (verified), **BouncyCastle** (verified), junrar, commons-net FTP, SMBJ, libaums, zeus/gmc + columbus ads (several hundred), xiaomi ad/analytics glue (623), plus the app's own ~700 classes under `com.android.fileexplorer*` and `com.mi.android.globalFileexplorer*`. Full confirmed/not-found inventory in doc 24.

## Unknowns / limits

- Signature not cryptographically verified — self-consistency only.
- ProGuard mapping unavailable; obfuscated names (`a`, `b0`, `x0`…) cannot be mapped to original identifiers.
- `audience_network.dex` content only visible at archive level; its classes are not in JADX's main class index.
- Build system artifacts (BUCK/Gradle metadata) not retained beyond `x-metadata.properties`.
