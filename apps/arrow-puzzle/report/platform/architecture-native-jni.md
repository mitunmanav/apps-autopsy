# Architecture, native libraries, and JNI

> [Observation] Artifact: base.apk
> [Observation] Package: com.easybrain.arrow.puzzle.game
> [Observation] SHA-256: 3e86c708abeb06ae7885f9bdf0d4d4c149f8a7b4a90580eb6e07e5e5540b97f0

- [Observation] Package inventory: 55,442 Java/Dex classes; 2,998 Android resources; 17 DEX paths (15 root, two under assets/audience_network/).
- [Observation] Unity data includes global-metadata.dat (11,322,184 bytes; SHA-256 49d88c6cf17958c8f7dc5926cd4338a89ebe87a02f4ac2c357cc4735ec9e72bf), data.unity3d (10,743,395 bytes), RuntimeInitializeOnLoads.json, ScriptingAssemblies.json, and boot.config.
- [Observation] IL2CPP metadata v39: 31 sections, 92 images, 14,755 types, 96,746 methods, 63,191 fields, 17,278 properties, 732 events, 98,745 parameters, 16,349 string literals.
- [Observation] The image set includes Assembly-CSharp.dll (1,411 types) and 35 Easybrain.* images; per-image ledger is under features/.
- [Observation] No .so path occurs in the 2,998-entry base inventory. JNI scan covered 15 root DEX files, 89,298 classes, 570,683 methods; 341 ACC_NATIVE declarations, zero selected native libraries, zero JNI candidates and zero bindings.
- [Inference] The 341 native declarations cannot be mapped to implementations from this APK because its inventory has no native library payload.
- [Unknown] Whether an ABI split supplies native code is outside scope; Unity version and scene inventory are unknown.
- [Observation] Evidence: artifact ev_2a2b4545f692180a41aa9ff9ae8b04a5572f7faa06d65414cc12c775b449d911; JNI ev_f7c3c5bbaff738f52ad453670577a3ba6a0c42497a8750b04af69fcf0c00ca8a; metadata ev_b426b0d22b18ad13c4ed727b7ed9e36c8a90dda387e0e0c0a9bf1054e294a218.
