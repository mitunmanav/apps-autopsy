# Tool: Profile & Settings
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

- **UI entry:** profile popup, settings page (`HapticsToggleController`, audio toggles, notification prefs) [observation].
- **Parameter model:** `user_details`/`profile_pic` catalogs; `changeCountry`, `changeUsername` flows; linked providers (Google/Gmail/GameCenter/Facebook/WhatsApp) [observation].
- **Execution path:** local prefs via `DataStoreService`/PlayerPrefs (haptics `MatchSceneHaptics`, audio `MainSceneAudioStorage`); server mutations via ApiHelper profile calls; logout `SoftLogoutToLogin`/`LogoutProviderSdks`/`SignOutFirebase` [observation].
- **Premium/offline flags:** settings = local (offline); identity fields = server-validated (online) [observation].
- **I/O flow:** edits → local store or `ApiHelper` call → profile sync → reflects in chat/match UI (`ChatUserData`, `ChatTeamData`).
