# 00 — Identity, Packaging & Protection

## Identity

| Field | Value |
|---|---|
| Package | `com.mindefy.phoneaddiction.mobilepe` |
| Label | `@string/system_app_name` ("YourHour") |
| Version | 4.5.6 (versionCode 458) |
| minSdk / targetSdk | 32 / 36 |
| Install location | internalOnly |
| App category | `productivity` · supportsRTL · `configChanges=locale` |
| Application class | `com.pairip.application.Application` → delegates to `com.mindefy.phoneaddiction.mobilepe.YourHour` |

## Artifact set (split APKs)

| File | Size | Contents |
|---|---|---|
| `base.apk` | 36.9 MB | code (4 dex), all resources, assets, manifest |
| `split_config.arm64_v8a.apk` | 53 KB | `lib/arm64-v8a/libandroidx.graphics.path.so` + `libdatastore_shared_counter.so` + `stamp-cert-sha256` — the app's only native code (both androidx libs; **base.apk has no `lib/`**) |
| `split_config.xxhdpi.apk` | 136 KB | xxhdpi density resources, config `en,xxhdpi` |

## DEX layout

| DEX | Size | Contents |
|---|---|---|
| classes.dex | 11.8 MB | app + most libraries (~10.5k `com.google`, 2.5k Unity, 228 `com.mindefy` raw-DEX refs) |
| classes2.dex | 47 KB | small spillover |
| classes3.dex | 7.6 MB | libraries |
| classes4.dex | 4.0 MB | libraries |
| `assets/audience_network/classes{,2}.dex` | — | Meta Audience Network SDK shipped as embedded dex assets (loads at runtime) |

## Signing (ev_47f937ee)

- **v2 + v3** signature schemes, single signer; **v1 absent** (minSdk 32 makes v1 unnecessary).
- Signer cert SHA-256 `3682aca223005107d4b98160c8ea06161f09f6b43cc56f950944aca8d39584f6`.
- **Google Play source stamp** present (cert `3257d599…bbd6d`) → Play-distributed build.
- *Limitation:* signature blocks parsed, not cryptographically re-verified.

## Google Play Integrity Protection (pairip)

- Manifest `android:name="com.pairip.application.Application"`; real app is `YourHour`.
- `com.pairip.licensecheck.LicenseActivity` (exported) + `com.android.vending.CHECK_LICENSE`
  permission → Play-licensing / integrity checks gate app start on unlicensed installs.
- `application_init_class` meta-data points pairip at the real `YourHour` class.

## Obfuscation map

- Manifest-kept names: **136 named classes** (all activities/services/receivers/providers, models, Room impl).
- Everything else (~800 app classes: ViewModels, repositories, Compose screens, helpers, ad
  loaders) is **R8-repackaged to `defpackage.*`**, interleaved with ~10.6k obfuscated
  ad-SDK/library classes. Recovered via 667 surviving Kotlin `toString()` templates
  (exact field names for every data class), string literals, Room SQL and analytics names.
- Two source roots in decompiled tree: `com/mindefy/phoneaddiction/mobilepe/` (135 files,
  20.7 KLOC) and `com/mindefy/mobilepe/` (1 legacy file).

## Localization

~90 locale folders (`values-af` … `values-zu`), RTL supported. App ships its own locale
picker (`LanguageSettingsActivity`); accessibility + overlay UIs re-wrap resources via
`createConfigurationContext` with the chosen locale (seen in `ReelDetectorAccessibilityService.d()`).

## Notable manifest flags

`largeHeap=true`, `allowBackup=true`, `fullBackupOnly=true`, `extractNativeLibs=false`,
`requestLegacyExternalStorage=true`, `usesNonSdkApi=true` (pairip),
`android:enableOnBackInvokedCallback` absent.

## Launcher aliases

Two `activity-alias` launcher icons — `DefaultAlias` and `AlternateAlias` — both MAIN/LAUNCHER.
The **Pro icon** is an entitlement reward (`pro_icon` string seen in purchase flow): premium
users can switch the launcher icon via `PackageManager.setComponentEnabledSetting`.

## Manifest internals (previously undocumented)

- **`<queries>`** package visibility: `IMAGE_CAPTURE` (camera), `GET_CONTENT image/*`
  (gallery — profile pic/crop), `DIAL tel:` (dialer). No `<package>`-level queries.
- **`<uses-library>`**: `org.apache.http.legacy` (required=false — legacy HTTP client for
  old ad SDK paths), `android.ext.adservices` (required=false — Privacy Sandbox).
- **Meta-data**: `com.google.android.gms.ads.APPLICATION_ID` =
  `ca-app-pub-3128150064662905~2818055092` (full AdMob app id),
  `NATIVE_AD_DEBUGGER_ENABLED=false`, `com.facebook.sdk.ApplicationId`,
  `com.facebook.sdk.ClientToken`, `com.google.android.play.billingclient.version`=`9.1.0`,
  `android.app.shortcuts`→`shortcurts.xml` (×2 references), `androidx.startup` initializers
  (ProcessLifecycle, AdsSdkInitializer(unity), WorkManager, EmojiCompat, ProfileInstaller),
  Firebase `ComponentRegistrar`s for **Auth, RTDB, Firestore, Messaging, Storage,
  RemoteConfig, A/B testing, Crashlytics, Sessions, Installations, Analytics connector**
  — Remote Config + A/B test + Storage were unlisted in the earlier integrations file (fixed).
- `policies.xml` decoded: `<device-admin><uses-policies/></device-admin>` — **empty policy
  set confirmed at XML level** (S13 stands).
- **No `uses-feature`** declarations — no hardware restrictions (works without camera/
  sensors/telephony); `uses-sdk` only sets min/target. `hardwareAccelerated` true on most
  activities, false on a couple (rendering-sensitive overlays).
- **Dark mode shipped**: `color-night-v8`, `drawable-night-v8` (splash bg, widget previews),
  `drawable-night-nodpi-v8` widget preview PNGs — night variants exist, not just a toggle.
- Legacy `com.mindefy.mobilepe/DataBinderMapperImpl` — generated databinding leftover in
  the second source root; no functional code.
