# Tool: Ride Booking — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

- **UI entry (obs):** `yoda.rearch.core.NewMainActivity` booking shell; server-driven card feed `yoda.oe.prebook.cards.*` (16 Epoxy card templates incl. `InboxTemplate16/17/23Card`).
- **Parameter model (inf):** pickup/drop via `v1/location/places`, category from card config, coupon via `v3/booking/coupon/apply`.
- **Execution path (obs endpoints):** `v3/booking/create` → `v3/booking/get_driver_bids` → `v3/booking/bid_action` — a **driver-bidding flow** (passenger picks/accepts driver bids); outstation variant `v4/ola_outstation/pre_book` + `drop_slots`; status via `v3/rides/info`.
- **Local vs remote:** remote-only (obs). No local booking queue.
- **Premium/offline flags:** premium/vehicle tiers are server-side; offline booking impossible (inf). `ForceUpgradeActivity` can hard-gate the app (obs).
- **Input→output:** locations+fare class → booking id/driver bid list → accepted bid → live ride (`v3/rides/*`) → `v3/booking/feedback` post-ride.
- **Unknowns:** exact request schemas, bidding timeout logic, fare-computation location (likely server, inf).
