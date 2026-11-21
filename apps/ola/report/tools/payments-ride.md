# Tool: Ride Payments — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

- **UI entry (obs):** `yoda.rearch.payment.sidemenu.AddInstrumentActivity`, `payments.ui.cards.ChooseYourBankActivity`, `com.olacabs.paymentsreact.ui.PaymentReactActivity` (RN shell, `getMainComponentName()="OlaPaymentsReact"`, ev_fafe7873…).
- **Parameter model (obs):** `PaymentSdkRequestData` (appcontract.request) serialized into RN `Bundle`; `Promise` bridge for async results; `onActivityResult` for external app returns.
- **Execution path (obs):**
  1. `v4/payment/instrument_list` (list saved instruments) → `v4/payment/initiate_purchase` → `v4/payment/purchase_status`.
  2. Ride-level: `v3/payment/initiate_payment` → `v3/payment/status` → `v3/payment/outstanding`.
  3. Rails dispatch to Juspay HyperSDK (`ProcessActivity`), Razorpay, UPI Turbo, NPCI `GetCredential` PIN.
- **Local vs remote:** remote authorize (all rails) + local RN UI orchestration.
- **Premium/offline:** online-only. `v3/payment/outstanding` implies dues-collection flow (obs path).
- **Input→output:** instrument/bank pick → purchase init → PSP SDK → status poll → receipt.
- **Unknowns:** per-rail routing rules, RN bundle internals, tokenization storage (likely server, inf).
