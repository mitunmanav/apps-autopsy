# Tool: UPI — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

- **UI entry (obs):** `com.olacabs.upi.core.{AddVPA,ReAuth,VpaDetail}Activity`; Razorpay Turbo `turbo_view.*` (LinkedAccounts, BankSelection, CardDetails, ManageAccount, Success, RewardSuccess, BottomSheetTransparent — two exported); NPCI `UserAuthInfoActivity`, `GetCredential` (default-export).
- **Parameter model (inf):** VPA handle, bank/account pick, device binding; `v1/upi/*` paths on Ola side.
- **Execution path (obs):** VPA add/detail/re-auth screens → Razorpay Turbo account-linking → NPCI `CLRemoteServiceImpl`/`GetCredential` for PIN capture; `UpiEntity` Room row persists handle state (obs class).
- **Local vs remote:** remote for account ops; PIN collection via NPCI common-lib (local UI + remote APDU, inf).
- **Premium/offline:** online-only; no premium flag evidence (unk).
- **Input→output:** VPA/bank input → link → pay via turbo sheet → status → `UpiEntity` update.
- **Unknowns:** `v1/upi/*` sub-paths not enumerated; Turbo order-id creation site; NPCI CL version quirks.
