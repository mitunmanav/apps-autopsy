# Tool: Authentication & Account Recovery
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

- **UI entry:** first-launch login gate; settings "linked accounts"; recovery prompt on launch [inference: screens drive AuthCoordinator].
- **Parameter model:** Firebase ID token, Google Play Games / Game Center / Gmail credentials, WhatsApp OTP code, guest identity [observation — method names].
- **Execution path:** `AuthCoordinator` (80 methods, ev_ae4d75d0…): `ResolveOnLaunch` → `EnsureGuestIdentityAsync` → `EnsureFirebaseIdTokenAsync` → `FetchRecoverableAccountsAsync` → `Resolve`/`GatherSignals`/`ComputeTokenFuidMatch`/`ResolveTokenState` → `ClaimAndProceed` | `LoginWithLinkedAccount` | `StartGuestAsync` → `WriteSessionTokenFromLogin` + `PersistTeamIdFromLogin`. Provider calls: `SignInWithCredentialAsync`, `LinkWithCredentialAsync`, `SignInWithCustomTokenAsync`, `MintAnonymousAsync`, `AdoptExternalAuthTokenAsync`, `SignInGmailAndLinkPlayGames`, `TryLink{GooglePlay,Gmail,GameCenter}*`. Remote: `userLogin`, `GetActiveNewAuth` REST; `x-auth-token`+`device-id` headers thereafter.
- **SDK path (local):** Firebase Auth, Play Games native bridge, AppleAuth (GameCenter), WhatsApp OTP (`WhatsAppAuthenticator.initWhatsapp`→`onReceive` OTP_RETRIEVED→`validateCode`, ev_7fefddb0…).
- **Premium/offline flags:** no premium gate; guest mode requires server-issued anonymous identity (online) [inference]; `HasRealHitwicketAccount` distinguishes guest vs linked [observation].
- **I/O flow:** credentials → token mint/verify → recoverable list → claim/link → session token + teamId persisted → all API calls authorized.
