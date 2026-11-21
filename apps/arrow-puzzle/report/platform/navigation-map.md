# Navigation map

> [Observation] Artifact: base.apk
> [Observation] Package: com.easybrain.arrow.puzzle.game
> [Observation] SHA-256: 3e86c708abeb06ae7885f9bdf0d4d4c149f8a7b4a90580eb6e07e5e5540b97f0

- [Observation] MAIN/LAUNCHER -> SplashActivity; SplashActivity.onCreate -> WrapperAndroid.OnCreate; SplashActivity.p creates an explicit intent to TemplateActivity; TemplateActivity is a UnityPlayerActivity host and forwards lifecycle/new-intent calls to WrapperAndroid.
- [Observation] ACTION_VIEW matching manifest URI -> SplashActivity; DeeplinkActivityListener stores URL and sends EDeeplinkActivated.
- [Observation] ConsentActivity is declared; privacy preferences bridge has a static path to a ConsentActivity factory.
- [Unknown] Splash transition condition, consent entry/gating, deep-link destination mapping, and Unity scene navigation are unresolved.
- [Observation] See manifest-components.md for the full component and URI-filter inventory.
