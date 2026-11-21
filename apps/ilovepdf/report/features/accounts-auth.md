> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Account — login / register / SSO / profile / delete

## How it works
- `LoginActivity`/`SignUpActivity` + `login.*`/`register.*` packages: email
  login against `mobile.iloveapi.com/v1`; social login via Google
  (`google-services`), Facebook (`fb127502793959418`, auto-init disabled),
  Microsoft (MSAL `msal_config`), Apple-style web SSO (`WebViewActivity`,
  `service.iloveapi.com/v1/mobile_redirect_sso`, `ssoilovepdf` scheme).
- `LoginViewModel`/`AuthenticationApiService` issue tokens; `user.UserManager`
  (`UserDBModel`) stores profile; passkey support via
  androidx.credentials (`res/raw/passkey*` assets, Credential Manager).
- Profile: `MyAccountActivity`, `SettingsFragment` user section,
  `DeleteAccountActivity` (`delete_account` strings + `account_deletion` flow
  calls mobile service delete endpoint), `account_data` screens.
- Premium state tied to `subscriptionmodel`/`usermodel` fetched via
  `mobileservices` API + `ILovePDFUser`.

## OTP & verification
`OtpActivity` (`otp`/`verification_code`/`resend_code` strings) verifies
email/2FA during register/password flows against the mobile service;
`EnableServiceActivity`/`SignInHubActivity` centralize provider sign-in.
