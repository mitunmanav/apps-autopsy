# Tool: Ola Money (wallet/credit/lending) — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

- **UI entry (obs):** `OlaMoneyActivity` (exported hub) + ~26 sibling activities: load money, send/P2P, merchant pay, BBPS bills, recharge, postpaid, personal loans, KYC, transactions, coupons, auto-recharge.
- **Parameter model (obs):** `olamoneyrest.core.endpoints.Endpoint` builds service URLs from base + service path (ev_47d7635c…): `/olamoney`, `/orchestrationService`, `/stark-consumer`, `/servicepayments`, `/wallet-card-service`, `/kycservice`, `/postpaid`, `/userfeedback`, `/connectservice/v1/connect/*`. `HeaderHelper` supplies headers (partially decompiled).
- **Execution path (obs):** `olamoney/v3/validateAndDebit` (spend), `olamoney/v3/users/refresh`, `olamoney/v3/cancelTransaction`, `olamoney/v3/resendOTP`, `olamoney/v1/beneficiary/add` (P2P). SIM binding flow: `SimBindingActivity` + `SmsSentBroadcastReceiver(SimBinding)` + `SimStateBroadCastReciever` (device-bind via SMS, obs classes).
- **Local vs remote:** remote-only for value movement; local camera flow for KYC (`kyc.{Camera,Crop,Review}Activity` → `/kycservice`).
- **Premium/offline:** lending features (postpaid/personal loan/credit-protect) are KYC-gated premium products (inf); all online.
- **Input→output:** action (load/send/pay/recharge/loan) → REST op → OTP where needed (`resendOTP`, `TwoFactorFromCabsActivity`) → transaction record (`OMTransactionsActivity`).
- **Unknowns:** exact header scheme, limits/KYC tiers, which services are live vs legacy in 7.6.2.
