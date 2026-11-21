# Tool: SOS / Safety — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

- **UI entry (obs):** `yoda.sos.ui.SosActivity` → `SosCountdownActivity` → `SosAlertActivity`; `AddEmergencyContactActivity` manages contacts.
- **Parameter model (inf):** ride context + user contacts; countdown before alert.
- **Execution path (obs endpoints):** `v3/sos/signal` (raise), `v3/sos/deactivate_sos_signal` (cancel), `v3/sos/inform_police` (escalate), `v3/user/call_user` (call bridge).
- **Local vs remote:** all remote REST (obs). CALL_PHONE permission supports direct-dial escalation (inf).
- **Premium/offline:** not premium (inf); online-only — no offline SMS fallback found in evidence (unk but none observed).
- **Input→output:** SOS trigger → countdown → signal POST → police/contact actions → deactivate on resolve.
- **Unknowns:** payload fields, whether location piggybacks on signal, regional police-routing logic.
