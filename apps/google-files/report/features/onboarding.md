# Feature: Onboarding & first-run

- First-run experience: permission ramp (storage/notifications), Safe-Folder
  promo, share intro; first-run flags in prefs.
- **`googleguide.GoogleGuideContentProvider`** (verified name) — tooltip/
  coachmark system for feature discovery.
- `tos.TosActivity` — terms-of-service surface.
- Per-app-locale: `LanguagePickerActivity` + `LanguageBroadcastReceiver` +
  `android:localeConfig` + `AppLocalesMetadataHolderService` — in-app language
  picker is a first-class feature.
- `is_first_nearby_share_logging_attempt` (`ixj`) — first-use instrumentation.
- China-device branch: FCM `setAutoInitEnabled` gated on non-China builds
  (`HomeActivity.onCreate`).

## Evidence

Guide provider, first-run prefs, HomeActivity init branches, onboarding strings.

## Unknowns

- Step order/skip rules (server-configurable via phenotype).
- Safe-Folder onboarding trigger conditions (usage-based or card-driven).
