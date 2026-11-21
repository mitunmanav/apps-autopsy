# Manifest + Components

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2` (splits: arm64 `7b3846b4…de34`, en `75a6ab29…d9d97`, xxhdpi `97df5cdb…0d70`).

Evidence: manifest view `ev_76c7945b…`, package inspection `ev_05529772da47bbe20a7e7c5f44259efbb42d0acfde150df3c45b14dbded54789`, full decoded XML `.work/manifest.xml` + `.work/components.json`.

## Package identity [obs]
- package `com.bumble.app`, versionName `5.492.0`, versionCode `4139`
- minSdk 32, targetSdk 36, platform/compile build 37 (Android 17)
- `android:requiredSplitTypes="base__abi,base__density"` — split install required
- `android:extractNativeLibs="false"`, `android:allowBackup="false"`, `android:largeHeap="true"`, `android:supportsRtl="true"`
- application class `com.bumble.app.application.BumbleMainApplication`; `android:appComponentFactory` present
- backup rules referenced: `backup_rules` + `backup_rules_android11_and_below` XMLs (contents generic)

## Component counts [obs]
| Kind | Declared | Exported |
|---|---|---|
| Activity | 222 | 12 (incl. SDK redirect activities) |
| Service | 33 | 2 (JobService, RevocationBoundService) |
| Receiver | 23 | 4 |
| Provider | 18 | 1 (FacebookContentProvider) |
| **Total** | **296** | **19** |

159 of 296 are app-owned by exact prefix (`com.bumble.app` 120, `com.bumble2` 7, `com.badoo` 32); ~12 more ship under wider `com.bumble.*` (coaching, profileinsights, shared…); remainder are SDK/framework components.

## Key application components [obs]
- Launcher: `com.bumble.app.ui.launcher.BumbleLauncherActivity` (MAIN/LAUNCHER)
- Also exported with no intent filters: `com.bumble2.app.Bumble2MainActivity`
- Deep-link entries: `DeeplinkLandingActivity`, `GoogleAdsDeeplinkLandingActivity`, `BumbleOAuthChromeTabsResultActivity`, `com.bumble2.ads.navigation.impl.AdsDeeplinkActivity`, `com.facebook.CustomTabActivity`, `com.auth0.android.provider.RedirectActivity`, `com.spotify.sdk.android.auth.browser.RedirectUriReceiverActivity`, `com.badoo.mobile.whatsappotp.WhatsAppOtpReceiverActivity`
- Services of note: `com.badoo.mobile.webrtc.call.WebRtcService` (call foreground service), WorkManager `SystemJobService`, several `:light` process components (`android:process=":light"` on 6 declarations — a lightweight secondary process [inf: for media/push light work])
- Providers: androidx-startup init, downloader cache (`ACCESS_CACHE_PROVIDER` referenced via `android:permission` — the permission itself is never declared; protection level [unk]), FileProviders (chat share, temp photos), Sentry init/perf, Facebook content
- Signature-level permissions defined: `com.bumble.app.VERIFF_STATUS_BROADCAST_PERMISSION`, `com.bumble.app.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` [obs]

## Deep links [obs]
45 intent filters / 41 `<data>` declarations. Schemes: `bumble`, `bumble2ads`, `bumble_sib`, `bumbleads`, `bumblesib`, `com.bumble.app`, `com.bumble.app.braintree`, `fbconnect`, `http`, `https`, `mailto`, `sms`.
Hosts: `bumble.com`, `m.bumble.com`, `mqa.bumble.com`, `mlink.bumble.com`, `t.cloud.bumble.com` (`/f/open-in-app/`); `s.bumble.com` host also declared, `bumble.onelink.me` (AppsFlyer OneLink), `bumbl.ai`, `campaign`, `landto` (internal router), `oauthimport`, `spotify`, `cct.com.bumble.app`, Auth0 `auth{,-stage,-dev}.cloud.bumble.com` + `us.auth{,-stage,-dev}.cloud.bumble.com` + EU region variants. The `/u/.*` pathPattern sits in one intent-filter shared by the bumble.com family hosts, so it matches each of them, not only `m.bumble.com`.
Notable: `bumble://landto/`, `bumble://oauthimport`, `bumble://spotify`, `bumble2ads://campaign`, `fbconnect://cct.com.bumble.app`.

## App queries (package visibility) [obs]
`whatsapp`, `spotify`, `venmo`, `paypal`, `facebook`, `instagram`, `telegram` — used for OTP-share/social integrations [inf].

## uses-feature [obs]
5: camera, camera.front, camera.autofocus, sensor.light (all `required=false`), GLES 2.0 (`required=true`).

## Unknowns
- Runtime gating of exported-but-internal activities [unk]
- Which `:light`-process components run when (no runtime capture) [unk]
