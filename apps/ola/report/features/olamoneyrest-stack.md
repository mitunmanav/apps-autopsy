# Feature Module: olamoneyrest Stack — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

Self-contained wallet/lending subsystem under `com.olacabs.olamoneyrest.*` + `com.olacabs.olamoney.*`.

## Evidence (obs)
- `Endpoint.<clinit>` (partial smali, ev_47d7635c…/ev_73ee3d7e…): base URL + `/olamoney`, service prefixes `/orchestrationService`, `/stark-consumer`, `/servicepayments`, `/wallet-card-service`, `/kycservice`, `/postpaid`, `/userfeedback`, `/connectservice/v1/connect/(public/)event`, `/fullkyc/insurance/dashboard`. Prod base `https://apps.olacabs.com`; staging `http(s)://stg-consumer-proxyapi.olacabs-dev.in` present in build strings.
- `HeaderHelper.<clinit>` → helper object; header map not fully decompiled (unk contents).
- ~26 activities: wallet hub (exported), load/send/P2P/merchant/BBPS/recharge/postpaid/loan/KYC/transactions/coupons/auto-recharge/SI/screens.
- SIM binding: `SimBindingActivity`, `SmsSentBroadcastReceiver`, `SmsSentBroadcastReceiverSimBinding` (**exported**), `SimStateBroadCastReciever` → device↔wallet binding via SMS + phone-state perms (inf).
- Entities: `EntityOptions`, Razorpay `UpiEntity`, transaction models; `PaymentDetailsInbox`, `PreferredInstrumentInbox` (communication_hub models).
- `TwoFactorFromCabsActivity` — 2FA bridge between cabs app and wallet (obs).
- Exported components: `OlaMoneyActivity`, `inapp.PayActivity`, `WebViewActivity` (no filter), `RazorpayPaymentActivity` (no filter), SMS receivers ×2.

## Operations (obs paths)
`v1/beneficiary/add`, `v3/cancelTransaction`, `v3/resendOTP`, `v3/users/refresh`, `v3/validateAndDebit` under `olamoney/` prefix.

## Rails (obs)
PayU (`RechargePayUActivity` + merchant key string), Razorpay, UPI, Juspay.

## Unknowns
- HeaderHelper exact header set (auth token name, device id).
- Which of the 26 screens are reachable in current build (feature flags unk).
- FullKYC insurance dashboard wiring.
- Postpaid/loan underwriting endpoints beyond service prefixes.
