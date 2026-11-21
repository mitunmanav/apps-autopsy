# Feature-Level Bypass & Design Flaws

Client-side enforcement means every gate lives on the device — the trust model assumes an
unmodified app on an unmodified device. Each item below is a logic deduction *(inference)*
from decompiled code, not a demonstrated exploit.

## S8 — Paid PIN reset is a client-side boolean (Med)

- `xa3.java:1460` + `cw2.java:49`: `pref_reset_pin` (plain pref boolean) gates the
  **paid "forgot PIN"** flow (`yourhour_reset_pin` SKU).
- With plaintext `parent_lock_pin` (S1) readable, the paid reset is redundant for anyone
  with device access — and the flag itself is a root-modifiable pref. Monetizing the
  lockout relies entirely on the user not knowing the PIN sits in cleartext.

## S9 — Premium gates are client-side (Med — softened)

*Correction:* `GET subscriptions/status` exists on the backend — entitlement can be verified
server-side, so this applies mainly to **offline** operation, where the cached flag still rules.


- Tier checks (`pro`/`adfree`/`lite`/`free`) are local entitlement reads used to gate
  floating timer, mindful pause, reel blocker, categories, custom challenges, export,
  day-start, reports depth, pro icon.
- Standard pattern for Play Billing, but combined with R8-only obfuscation (no runtime
  integrity beyond pairip's license check at start) a patched APK could flip entitlements.
  Server-side features (parental/TV, backups) remain protected by auth.

## S12 — Reel blocker is trivially bypassable (Low-Med)

- Dismiss action grants a **client-side 1-hour pass** (`ob7.v = now + 3600000`) — infinite
  use, just tap through.
- Detection is view-id/label matching per target app; breaks silently on partner updates
  and can't cover modified/alt clients.
- System-package allowlist means no protection applies there (by design).

## S13 — Device admin is cosmetic (Low)

`YourHourAdminReceiver` + `res/xml/device-admin` declares **no policies** — presence in the
device-admin list adds a confirmation dialog on uninstall but provides no real wipe/lock
capability. Strings advertise "Device Admin Activated" as anti-uninstall.

## Enforcement-lag & kill-weakness

- Auto-lock/mindful-pause fire on the polling cycle, not instantly — brief usage windows
  under the poll period go unenforced.
- `KILL_BACKGROUND_PROCESSES`/`REORDER_TASKS` can't overcome OEM task managers;
  the heartbeat/watchdog mesh repairs but can't prevent gaps (acknowledged by the app's own
  `service_fixing_*` analytics family).
- Lock overlays can be bypassed by clearing the app's overlay permission or revoking usage
  access — no remote attestation.

## Parental-plane flaws

- Forget-PIN request_token is logged (S5) and delivered via notification tap — possession
  of the unlocked phone = ability to approve/deny guardian actions.
- Overrides keyed by URL-path tokens; no additional device attestation observed.
- Child can sever supervision by revoking usage access/accessibility/overlay or
  uninstalling (empty-policy device admin doesn't prevent it).
