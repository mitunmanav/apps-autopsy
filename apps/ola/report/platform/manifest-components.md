# Manifest & Components — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`
Source: decoded `AndroidManifest.xml` via REA `inspect_android_package` (ev_cfbd1d6e…). Counts: **113 activities, 31 services, 29 receivers, 7 providers** (obs).

## Application
`com.olacabs.customer.app.OlaApp` — application class (obs).

## Exported components (attack surface, obs)

### Activities
| Class | Filters | Notes |
|---|---|---|
| `com.olacabs.customer.ui.NewSplashActivity` | 1 | Launcher (MAIN/LAUNCHER) |
| `com.olacabs.customer.ui.DeeplinkActivity` | 7 | All deep-link routing |
| `com.olacabs.olamoneyrest.core.inapp.PayActivity` | 1 | in-app pay intent |
| `com.olacabs.olamoneyrest.core.activities.WebViewActivity` | 0 | **exported with no filter** — noteworthy: exported activities without filters are still launchable via explicit intent by other apps |
| `com.olacabs.olamoneyrest.core.activities.OlaMoneyActivity` | 1 | wallet entry |
| `com.olacabs.olamoney.activities.RazorpayPaymentActivity` | 0 | exported, no filter |
| `com.olacabs.paymentsreact.ui.PaymentReactActivity` | 1 | RN payment shell (default-export) |
| `com.xiaomi.mipush.sdk.NotificationClickedActivity` | — | MiPush |
| `in.juspay.hypersdk.core.CustomtabResult`, `RedirectResponseActivity` | 1 each | juspay://, juspayexternalapp:// |
| `in.juspay.hypernfc.NfcActivity` | 1 | NFC payments |
| `com.facebook.CustomTabActivity` | 1 | fbconnect://cct.com.olacabs.customer |
| `com.amazon.identity.auth.device.workflow.WorkflowActivity`, `apay…RedirectUriReceiverActivity` | 1 each | Amazon Pay auth |
| `com.razorpay.upi.turbo_view.LinkedAccountsActivity`, `BottomSheetTransparentActivity` | 0 each | exported UPI Turbo screens |
| `com.amazon.android.apay…RedirectUriReceiverActivity` | 1 | amzn://com.olacabs.customer |
| `yoda.rearch.core.NewMainActivity` | internal | **the main app screen** |
| `org.npci.upi.security.pinactivitycomponent.GetCredential` | 1 | NPCI UPI PIN entry (default-export) |

### Deeplink hosts (DeeplinkActivity, obs)
- `https://olacabs.onelink.me` (AppsFlyer OneLink)
- `http(s)://www.olacabs.com`, `http(s)://olacabs.com`, `http(s)://book.olacabs.com`, `http(s)://webapps.olacabs.com`
- `olacabs://app`, `Olacabs://app` (custom scheme; code also references `olacabs://app/launch`)

### Services (exported or notable)
| Class | Notes |
|---|---|
| `com.olacabs.tracker.ShareLiveLocationService` | `foregroundServiceType="location"` (obs) — MQTT trip sharing |
| `com.ola.maps.navigation.v5.navigation.NavigationService` | FGS location, needs FOREGROUND_SERVICE perm — turn-by-turn nav |
| `com.google.firebase.messaging.FirebaseMessagingService` | FCM handler (default-export) |
| `com.google.firebase.iid.FirebaseInstanceIdReceiver` | exported, guarded by `c2dm.permission.SEND` |
| `com.xiaomi.push.service.XMPushService` / `XMJobService` | run in `:pushservice` process |
| `com.xiaomi.mipush.sdk.PushMessageHandler` | exported, `MIPUSH_RECEIVE` perm |
| `org.npci.upi…CLRemoteServiceImpl` | NPCI common-library remote service (default-export) |
| `com.google.android.play.core.assetpacks.AssetPackExtractionService` | exported, Play asset packs |
| `ExtractionForegroundService` | fgst=dataSync |
| `androidx.work.*` system job/alarm/foreground services | WorkManager |
| `androidx.room.MultiInstanceInvalidationService` | Room multi-instance |
| `com.olacabs.customer.app.OlaService` | `BIND_JOB_SERVICE`; tiny dispatcher (g(Intent), j(Context,Intent)) |

### Receivers
- `com.olacabs.customer.app.OlaReceiver` (default-export, 1 filter)
- `com.olacabs.olamoneyrest.utils.SmsSentBroadcastReceiver` + `SmsSentBroadcastReceiverSimBinding` — **exported** SMS-sent trackers
- `SimStateBroadCastReciever` (default-export)
- `com.moengage.push.amp.plus.MiPushReceiver` (exported, 3 filters — MoEngage↔MiPush bridge)
- `com.xiaomi.push.service.receivers.NetworkStatusReceiver` (exported), `PingReceiver` (`:pushservice`)
- WorkManager constraint proxies (5, default-export), `DiagnosticsReceiver` (DUMP perm), `ProfileInstallReceiver` (DUMP perm)

### Providers
`androidx.core.content.FileProvider`, `androidx.startup.InitializationProvider`, `ChuckerFileProvider`, `RNCWebViewFileProvider`, `MIPushProvider` (custom perm `com.olacabs.customer.permission.MIPUSH_RECEIVE`), `FirebaseInitProvider`, `FacebookInitProvider` — all non-exported.

### Processes
`:restart` — `RestartActivity`, `MobileVerificationActivity` (separate crash-restart process)
`:pushservice` — Xiaomi push stack
All other components default process (inf).

## Observations flagged
- Two exported OlaMoney screens lack intent filters + permission guards (`WebViewActivity`, `RazorpayPaymentActivity`) — static exposure only; exploitability unverified (unk).
- Chucker (HTTP inspector) UI + provider shipped in release build — internal-only activities; whether the interceptor is attached is **unk** (interceptor class is obfuscated `com.chuckerteam.chucker.api.a`; Stetho has **zero** inbound references — dead code, obs).
