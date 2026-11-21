> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Analytics, experiments & onboarding

## How it works
- Firebase (`google-services.json` project `ilovepdfmobile`, app id
  `1:1097893236988:android:af0b21d5d62a25c4` — metadata `com.google.firebase.*`)
  + `analytics` package: `Events`, `Screens`, `ToolName` enums; wrapped by
  `Analytics`/`AnalyticsManager` implementations emitting to Firebase + the
  mobile service.
- `experiment`/`ab_testing`/`abtesting_experiment`/`firebase_experiment`:
  Remote Config flags gate UI variants (tool order, paywall copy, banners).
- Onboarding: `OnboardingActivity`/`OnboardingFragment` (`onboarding` strings),
  `SplashActivity` (`SplashScreen` lib) gating first-run; `walkthrough` assets.
- Promos/NPS: `marketing`/`banner`/`campaign`/`nps`/`nps_survey`
  (`NpsActivity`, `nps_*` strings) driven by Remote Config + mobile service.
