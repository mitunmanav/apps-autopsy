# Tool: Corporate Rides — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

- **UI entry (obs):** `com.olacabs.customer.corporate.ui.{CorporateRideReason,CorporateExpenseCode}Activity` (internal).
- **Parameter model (inf):** ride reason + expense code attached to a booking for corporate billing.
- **Execution path (inf):** expense metadata → attached to `v3/booking/create` payload or profile-level corporate account (no dedicated corporate endpoint path was recovered in string scan — unk whether separate API family exists).
- **Local vs remote:** remote billing (inf); tagging UI local.
- **Premium/offline:** account-gated feature (inf — corporate profile required); online-only.
- **Input→output:** reason+code pick → attached to booking → corporate invoicing server-side.
- **Unknowns:** corporate endpoint paths, approval flow, expense-export integration. Lowest-evidence tool in this report — marked accordingly.
