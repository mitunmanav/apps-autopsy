# Feature Module: Auth & Identity — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

## Evidence (obs)
- ~12 auth activities (see screen-map): mobile verify → OTP → password set/create → email verify; `IvrActivity` = IVR OTP fallback; `TwoStepVerificationActivity` + `VerifyPasswordActivity`; `AccountBlockedActivity`/`AccountReactivateActivity`.
- `com.olacabs.customer.auth.impl.AuthRunnable.run()` → `new b(OlaApp.u).r()` — auth init delegates to obfuscated helper `b` (ev_91f87327…/ev_340407fd…, obs).
- Endpoints: `v4/user/initiate_login_signup`, `v4/user/verify_login_signup_otp`, `v4/user/create_user_account`, `v4/user/resetPassword`, `v4/user/change_password`; `v3/user/login`, `getProfile`, `signout`, `updateProfile`, `call_user`; `v1/tokens/initialize`, `v1/tokens/refresh`.
- `com.nimbusds.jose.*` → JWT parse/verify for session tokens (obs).
- SMS stack: READ/RECEIVE_SMS (OTP autofill, inf) + SEND_SMS for SIM binding.

## Execution path (inf, bounded)
Launch → token refresh (`v1/tokens/refresh`) → if invalid → `initiate_login_signup` → OTP (SMS autofill or IVR fallback) → `verify_login_signup_otp` → `create_user_account`/login → session tokens → `getProfile`. Password path: `login` + `change_password`/`resetPassword`. Optional 2-step verification.

## Storage (unk)
Token persistence mechanism not traced (DataStore/prefs/Keystore candidates all present).

## Biometric
USE_BIOMETRIC + `TwoStepVerificationActivity` → biometric unlock/login (inf).

## Unknowns
- Helper `b(OlaApp.u).r()` internals (obfuscated).
- JWT validation: signature-checked locally or decode-only (unk).
- Session expiry/refresh cadence.
