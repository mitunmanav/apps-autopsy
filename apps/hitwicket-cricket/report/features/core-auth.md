# Module: Core Auth
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

`HW.Superstars.Login.AuthService` + `AuthCoordinator` (80 methods, ev_ae4d75d0…) + `FirebaseAuthAuditTracker` [observation].

- **State machine:** launch resolve → guest identity → Firebase token → recoverable-account gather (`GatherSignals`,`ComputeTokenFuidMatch`,`ResolveTokenState`) → claim/link → session persistence (`WriteSessionTokenFromLogin`,`PersistTeamIdFromLogin`,`RefreshRestoredUserProvidersAsync`) → `OnAuthStateChangedSdk` listener; failure paths `PublishLaunchFault`,`FailSignInAsync`,`CancelRecovery`,`SoftLogoutToLogin` [observation].
- **Providers:** Firebase anonymous/custom token, Google Play Games, Gmail credential link, Game Center (AppleAuth), Facebook login, WhatsApp OTP device proof [observation — method names].
- **Boundary:** auth produces `x-auth-token` consumed by core-network; teamId drives data scoping [inference].
