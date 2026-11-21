# Module: UI Framework
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

- **Architecture:** Zenject DI (867 types) + `*Signal` event buses + `*Page`/`*PageController`/`*View`/`*Controller`/`*Popup`/`Data` MVVM-ish layering (e.g. `DCCoopPageController`, `UniversalChatPopupController`, `LiveMatchView`) [observation].
- **Reactive:** R3 + UniTask async (`<...>d__` coroutine/state-machine types throughout); `IDataStoreObserver` pushes [observation].
- **Rendering:** uGUI/UIElements + TextMeshPro + OSA optimized scroll + LeTai.TranslucentImage + Coffee.UIParticle + UIEffect + EasyTextEffects + DOTween Pro + Spine skeletal + Cinemachine + VFX Graph + EpicLootBox/Victory/ErbGameArt/ParticleIngredient packs + OpenVATRuntime vertex anim + AnimatedFlags + Beardy grid layout [observation].
- **Feedback:** Lofelt haptics (`MatchSceneHaptics`, `HapticsToggleController`), adaptive performance (Google.Android), HDR off, gfx-threading-mode=4 [observation].
