# 00 — Package identity & signing

## Identity

| Field | Value | Source |
|---|---|---|
| Package name | `com.touchtype.swiftkey` | manifest |
| versionName | `9.13.20.4` | manifest |
| versionCode | `1236533312` | manifest |
| minSdk / targetSdk / compileSdk | 26 / 36 / 36 (codename "16") | manifest |
| Label | `@string/app_name_market` = "Microsoft SwiftKey Keyboard" | resources |
| Variant labels in resources | `app_name_beta` "Microsoft SwiftKey Beta Keyboard", `app_name_cesar` "Microsoft SwiftKey Cesar Keyboard" | strings.xml — internal/dogfood flavors ship in one binary |
| App category | `productivity` | manifest |
| `coreApp` | `true` | manifest — keyboard must run in direct-boot/lockdown contexts |
| `extractNativeLibs` | `false` | libs stay page-aligned inside the abi split APK |
| `allowBackup` | `true`, `backupAgent=com.touchtype.app_backup.EmptyBackupAgent` | manifest — agent is a stub (backup content is a no-op; real backup is server-side OneDrive) |
| `resizeableActivity`, `supportsRtl`, `crossProfile` | `true` | manifest |
| `<profileable android:shell="true"/>` | present | manifest — allows shell-side profiling |
| `android:localeConfig` | `@xml/locales_config` | per-app locale support |
| `android:networkSecurityConfig` | `@xml/network_security_config` → cleartext **disabled** | manifest |
| `com.android.vending.splits.required` | `true`; `derived.apk.id = 4` | Play split delivery |

## Digests

| Item | SHA-256 |
|---|---|
| `base.apk` | `d7fb9545fc5fec1e7b3fa78573ccb16d0ce30ae47d7c2b1f357360f97ec169c2` |
| `libfluency-java-internal.so` (arm64) | `11c7514fa1e977d911ea4cdf582d44e3c0a069b381f64356041b4c156c3bbe7a` |
| Signer certificate | `0ad0088dfb347a8a515f2d13b17a561d5c3f9773438a207241bae7483c99b76f` |
| Play source stamp | `3257d599a49d2c961a471ca9843f59d341a405884583fc087df4237b733bbd6d` |

## Signing posture (REA `inspect_apk_signature`, evidence `ev_ab7e202e…`)

- Schemes: **v2 + v3 present**, v1 JAR signing absent, v3.1 absent.
- **One signer**; v2 and v3 agree on the same certificate.
- **No key-rotation lineage** declared.
- **Source stamp present** (Google Play's stamp block) — consistent with a Play-distributed build.
- `self_consistent = true`: declared content digests match the shipped bytes.
- 4 bytes outside known signing fields were not interpreted (benign).
- Signatures are **not cryptographically verified** by this analysis; authenticity remains unverified by inspection. `matches_apk` only proves declared digest == actual bytes.
- `stamp-cert-sha256` files exist inside each split APK (Play stamps every split).

## Distribution facts

- Two DEX files (`classes.dex`, `classes2.dex`) — multidex.
- `META-INF/com/android/build/gradle/app-metadata.properties` — built with Android Gradle Plugin (Groovy/Kotlin build).
- `dexopt/baseline.prof` + `baseline.profm` — shipped **Baseline Profiles** for AOT compile of startup paths.
- `token_share_build_version`, `token_share_parcelable_version`, `token_share_sdk_version` meta-data — bundled Microsoft TokenShare SDK version markers.
- `duosdk.dualScreenAware` + `to.dualscreen` meta-data and `uses-library androidx.window.extensions|sidecar` — Surface Duo dual-screen awareness.
