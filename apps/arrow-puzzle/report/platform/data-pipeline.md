# Data pipeline

> [Observation] Artifact: base.apk
> [Observation] Package: com.easybrain.arrow.puzzle.game
> [Observation] SHA-256: 3e86c708abeb06ae7885f9bdf0d4d4c149f8a7b4a90580eb6e07e5e5540b97f0

- [Observation] Static sequence: manifest intent -> SplashActivity -> WrapperAndroid.OnCreate -> EasyUtils and DeeplinkActivityListener -> SplashActivity.p explicit intent to TemplateActivity -> UnityPlayerActivity host -> SetUnityMessageHandler initializes WrapperMessageSender and UnityPlugin.UnityInit.
- [Observation] DeeplinkActivityListener handles ACTION_VIEW plus a non-null data string, stores the URL, clears intent data, and sends EDeeplinkActivated through WrapperMessageSender.
- [Observation] Unity-facing Java bridge modules cover ads, billing, consent, cross-promo, analytics, metrics, app update, identity, lifecycle, rating and stability; see tools/.
- [Observation] Two DEX network paths are traced: personalization POST and purchase validation POST.
- [Unknown] Exact IL2CPP-to-Java callsites and the complete UI-to-storage/network pipeline are unavailable without native method bodies and SDK internals.
