# Feature: Auth & Account

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

- `AuthorizationActivity` `[obs]`: sign-in UI; Google sign-in via AndroidX Credentials `[obs]`; social/external-browser flow via `ExternalBrowserAuthActivity` (exported, catches OIDC redirect) `[obs]`.
- OIDC issuer `keycloak.smallpdf.com` `[obs]` — tokens consumed by task API `[inf]` (interceptor detail `[unk]`).
- `AndroidAuthenticatorService` `[obs]` (`AUTHENTICATE_ACCOUNTS`) exposes the Smallpdf account to Android AccountManager.
- `AccountManagementActivity` `[obs]`: profile, subscription status, deletion/sign-out `[inf]`; `DefaultAccountRepository$AuthApiError` typed errors `[obs]`.
- Biometric gate `[inf]` from `USE_BIOMETRIC`/`USE_FINGERPRINT` perms.
- `AcknowledgeAccountSubscriptionWorker` `[obs]` posts Billing purchases to backend for acknowledgment.
