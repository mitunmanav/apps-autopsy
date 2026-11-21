# Smart card / YubiKey sign-in

Evidence: `smartcard_*` strings (34), `yubikit_*` strings (10 — YubiKit SDK bundled), `broker_helper_*` (6), `yubikey_dialog*.xml` (2), manifest perms `android.hardware.usb.host`, `android.hardware.nfc` (optional uses-features), `NFC` permission.

## What it is

Hardware-security-key sign-in for the Microsoft account — aimed at enterprise/managed devices that forbid password auth. Two layers: **PIV smart-card auth** (MSAL CertBasedAuth) and the bundled **YubiKit SDK** (`yubikit_*` strings: OTP activity, "touch the gold sensor", plug-in/tap prompts, NFC enable) for YubiKey NFC+USB.

## Flow (34 `smartcard_*` strings)

1. `user_choice_dialog_smartcard_name` — "Physical smart card" option in the auth-method chooser.
2. `smartcard_prompt_dialog` — "Plug in or hold a smart card to the back of your phone" / NFC-only variant "Hold a smart card to the back of your phone".
3. `smartcard_nfc_reminder` — NFC off → "Turn on NFC in device settings".
4. `smartcard_nfc_loading` — "Reading your smart card — keep in place".
5. `smartcard_cert_dialog` — "Select a certificate to sign in" (multiple PIV certs); `smartcard_no_cert_dialog` — "No applicable certificates found… correctly provisioned".
6. `smartcard_pin_dialog` — "Enter the smart card PIN to access the certificate and sign in" → Unlock; wrong-PIN error; `smartcard_max_attempt_dialog` — too many failed attempts.
7. `smartcard_early_unplug` — card removed mid-flow → reinsert retry.
8. `smartcard_nfc_diff_connected` — "You can only use one smart card at a time" (different card than original).
9. `smartcard_removal_prompt` — "You can now remove your smart card"; `smartcard_general_error` fallback.
10. `smartcard_plugin_unavailable_dialog` — required plugin/driver app missing.

- Transports: **USB host** + **NFC** (optional uses-features).
- `broker_helper_*` strings — MSAL broker helper UI (redirect URI/package/signature info for registering the app).

## Status

Static evidence only; the actual PIV/CBAC implementation likely lives inside the bundled `com.microsoft.identity` stack (CertBasedAuth) + a smart-card plugin app. Not runtime-verified.
