# Microsoft account sign-in & management

Evidence: `res/raw/msal_config.json`, `msal_default_config.json`, `msal_native_auth_default_config.json`, `msal_ppe_default_config.json`; `com.swiftkey.signin.CloudSignInActivity`; `com.swiftkey.di.MSALClientManager$signOut$2$1`; `com.swiftkey.webservices.accessstack.*`; `com.microsoft.identity.*` (536 classes — MSAL + common4j); `AccountSettingsActivity`; `pref_account_*` strings; manifest queries (authenticator, companyportal, mock* auth apps).

## Auth stack

- **MSAL** (`com.microsoft.identity.client`) — `msal_config.json`: `client_id=1934ccbf-f8a2-4b50-8a79-479ecdeea216`, audience `PersonalMicrosoftAccount` (tenant `consumers`), `authorization_user_agent=WEBVIEW`, `account_mode=SINGLE`, `redirect_uri=sk-unused-…://no-op`.
- Default MSAL config adds **broker auth** (`broker_redirect_uri_registered=true`, min broker protocol 3.0, `account_mode=MULTIPLE`, environment Production, `webauthn_capable=false`, browser safelist incl. Edge `com.microsoft.emmx`, Chrome). Broker candidates are the declared queries: `com.azure.authenticator`, `com.microsoft.windowsintune.companyportal` (Authenticator/Intune), plus internal mocks (`mockauthapp`, `mockcp`, `mockltw`, `identity.testuserapp`) for dogfood.
- `msal_native_auth_default_config.json` — MSAL **native authentication** (email+OTP sign-up/sign-in without web).
- `msal_ppe_default_config.json` — PPE (internal Microsoft) environment for dogfood builds.
- Redirect: `BrowserTabActivity`/`CurrentTaskBrowserTabActivity` handle `com.touchtype.swiftkey-auth://*` (manifest BROWSABLE filter) → returns tokens to MSAL.
- `SwiftKey di.MSALClientManager` — app-side MSAL wrapper (sign-out flow `signOut$2$1`).

## App account layer

- `com.swiftkey.webservices.accessstack.*` — "AccessStack" client: `accountmanagement` (`LoginRequestGson`, `RequestMigrationIdResponse`, `StartAsyncMigration`, `CheckAsyncMigrationStatus`, `AccountMigrationError`, `SetMarketingPreference`) + `auth` (`RefreshResponseGson`, `GatingResponseGson`) + `model` (`AccountMigration`, `LoginGate`). → account migration path (legacy SwiftKey account → Microsoft account) and **feature gating by account**.
- `com.swiftkey.signin.CloudSignInActivity` — cloud sign-in UI.
- Sign-in carousel (Lottie `lottie/sign-in-carousel/bu_and_s` images): backup & sync, cloud clipboard, earn Rewards points, data-safety notice (`cloud_setup_*` strings).

## Account settings (`pref_account_*`)

- Sections: **Account services** (typing & word predictions sync, clipboard sync "Instantly share what you copy"), **OneDrive backups** ("Back up now", "Backed up %1$s", Wi-Fi-only `pref_account_wifi_only_subtitle`), **Account data** ("View and manage your data" → learned words view/delete).
- Sign out (`pref_account_logout_*`), **delete data only** (delete personalized dictionary backup), **delete Microsoft account** entirely (`pref_account_delete_*` — loss warnings).
- Re-auth banner (`pref_account_reauth_*`) when tokens expire; `pref_account_error_unauthorized` — "Your device is no longer connected to this account".
- `pref_account_account_id_title` exposes the account id.
- Account-change broadcast: `com.microsoft.tokenshare.AccountChangeReceiver` on `SIGNIN_COMPLETED`.

## Passkeys / Credential Manager

`androidx.credentials.*` (50 classes incl. `CreatePublicKeyCredential`, `BeginSignIn`, `GetSignInIntent`, `CreatePassword`, `CredentialProviderService`) + `com.google.android.gms.fido` — Android **Credential Manager** integration: passkey creation/sign-in and password save/get via Play Services FIDO2. Note `msal_default_config.json` sets `webauthn_capable=false`, so this surface is the platform Credential-Manager path (e.g. autofill/inline-suggestion credentials), not MSAL WebAuthn.

## Notable

- `broker_helper_*` strings — MSAL broker helper UI exposing package/redirect/signature info for manual broker registration.
- `INTERACT_ACROSS_PROFILES` + `crossProfile=true` lets work-profile SwiftKey share account state (see `work-profile.md`).
- Smart-card/YubiKey sign-in for enterprise — see `smartcard-yubikey.md`.
