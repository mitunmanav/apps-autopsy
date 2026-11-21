# Navigation Map — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

## Entry routes (obs)
```
[launcher]   NewSplashActivity ──► NewMainActivity          (logged-in shell, inf)
                              └─► BaseLoginSignUpActivity   (auth tree)
[deeplink]   DeeplinkActivity ──► internal route resolver (7 intent filters)
[push tap]   Xiaomi NotificationClickedActivity / ConnectNotificationActionReceiver
[pay intent] olamoneyrest.inapp.PayActivity / OlaMoneyActivity (exported)
[juspay ret] juspay://, juspayexternalapp:// → CustomtabResult / RedirectResponseActivity
[fb auth]    fbconnect://cct.com.olacabs.customer → CustomTabActivity
[amazon]     amzn://com.olacabs.customer → RedirectUriReceiverActivity
```

## Deeplink host table (obs)
| Host/scheme | Purpose (inf) |
|---|---|
| `olacabs.onelink.me` | AppsFlyer OneLink marketing installs/links |
| `www.olacabs.com`, `olacabs.com` | web → app |
| `book.olacabs.com` | booking links |
| `webapps.olacabs.com` | webapp content |
| `olacabs://app`, `Olacabs://app` | app-internal deep links (`/launch` seen in strings) |
| `juspay://` , `juspayexternalapp://` | payment SDK return |
| `fbconnect://cct...` | FB auth return |
| `amzn://` | Amazon Pay return |

## Hub structure (inf)
- `NewMainActivity` = single-activity host for home/bookings/wallet/cards feed; `yoda.oe.prebook.cards.*` Epoxy models imply server-driven card layout (obs classes).
- Ola Money is a parallel activity stack under `OlaMoneyActivity` (own hub, 25+ screens).
- `PaymentReactActivity` = RN surface for payment SDK flows.
- Web surfaces: `OlaWebViewActivity`, `CommonWebViewActivity`, `OlaElectricWebActivity`, OM `WebViewActivity` (exported) — 6 `addJavascriptInterface`/`setJavaScriptEnabled` call sites in DEX (obs); per-site JS exposure scope unk.

## Inter-feature navigation (inf, bounded)
Ride complete → feedback/complaint (`TransactionComplaintActivity`, `v3/booking/feedback`) → payment (`v3/payment/*`) → receipt share (FileProvider). SOS accessible from active ride → `yoda.sos.ui` chain → `v3/sos/*`.

## Unknowns
- `DeeplinkActivity` route table (decompiled only partially; full path→destination mapping unk).
- Fragment graph inside NewMainActivity.
- Juspay/RN internal navigation (encrypted/bytecode).
