# Feature: Auth & Onboarding

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

## UI entry [obs]
- `BumbleLauncherActivity` → onboarding stack (obfuscated screens) → `Bumble2MainActivity`
- `BumbleOAuthChromeTabsResultActivity`, `WhatsAppOtpReceiverActivity`, Auth0 `RedirectActivity`, `fbconnect` CCT

## Methods [obs]
- Phone OTP (+ WhatsApp-delivered OTP channel)
- Auth0 OAuth — hosts `auth{,-stage,-dev}.cloud.bumble.com` + EU variants (multi-region identity [inf])
- Passkeys: `SERVER_PASSKEY_*` verbs (register/assert)
- Social: Facebook SDK, Google sign-in (`RevocationBoundService`), Apple sign-in action model
- `bumble://oauthimport` — importing OAuth-linked data [inf]
- Biometric login: `ALLOW_BIOMETRIC_LOGIN`, `ACTION_TYPE_BIOMETRIC_LOGIN`, `VERIFICATION_METHOD_BIOMETRIC` + error enums [obs]
- Prove auth / phone-call verification: `MINOR_FEATURE_PROVE_BACKGROUND_AUTH`, `MINOR_FEATURE_PROVE_UNIFIED_AUTH`, `MINOR_FEATURE_PHONE_CALL_VERIFICATION_SUPPORTED` flags + `SERVER_COMPLETE_PROVE_AUTH_FLOW`, `SERVER_CHECK_PHONE_CALL` verbs — carrier/Prove-backed phone verification [obs names; Prove attribution inf]

## Param model [obs]
- `AccountApi`/`HandlesApi`/`StateApi`/`FlowsApi`/`ConfigurationApi` B4F services drive onboarding steps; onboarding state machine in obfuscated `b.*` [unk detail]

## Execution path [inf]
- Credentials → token (BAPI access token + Auth0 JWT) → `SERVER_GET_USER`/account bootstrap → Statsig config → routed to mode home or profile-completion steps
- `SERVER_DELETE_ACCOUNT` exists for account lifecycle [obs]

## Local vs remote
- Remote: all identity; local: token storage (shared-layer auth state), biometrics unlock (`USE_BIOMETRIC`) [inf].

## Premium/offline
- Free; online-only [obs].

## Input → output
- In: OTP/OAuth/passkey/social credentials → Out: session token + bootstrap state → app home.
