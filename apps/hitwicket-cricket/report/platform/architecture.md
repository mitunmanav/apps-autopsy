# Architecture

**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 (205957) — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

## Layered architecture [observation]

```
┌─ Java/DEX shell (8 dex, 32,783 classes) ─────────────────────────┐
│ SafeDKApplication (app wrapper) → HitwicketUnityPlayerActivity    │
│ cricketgames.* services: FCM handler, PN tracker, alarm,          │
│ WhatsApp OTP, perf bridge, quick actions, ringtone                │
│ SDKs: AppLovin MAX, AdMob, FAN, InMobi, ironSource, Mintegral,    │
│ Firebase, Adjust, Facebook, Play Billing/Games/AssetDelivery      │
└────────────────────── JNI / UnityPlayerActivity ─────────────────┘
┌─ Unity engine (libunity.so 27 MB) ───────────────────────────────┐
│ UnityPlayerActivity → Unity runtime, URP, TMP, Addressables       │
└────────────────────────── IL2CPP ────────────────────────────────┘
┌─ Game code (libil2cpp.so 196 MB, metadata v31) ──────────────────┐
│ Hitwicket.dll 17,517 types — game+UI+network                      │
│ Hitwicket.MatchEngine.dll — cricket simulation                    │
│ Hitwicket.{Store,Chat,IPL,RoadToIPL,LiveMatches,Spectate,...}.dll │
│ Netcode: WebSocketContext (ws/wss), BestHTTP, protobuf Hwsproto   │
└──────────────────────────────────────────────────────────────────┘
```

- **Split delivery [observation]:** base (dex+manifest+IL2CPP metadata+managed resources), `config.arm64_v8a` (24 native libs, 29 resources, 0 classes), `gpdeku` + `gpdeku.config.arm64_v8a` (Play Deku module), `UnityDataAssetPack`, `UnityStreamingAssetsPack`, `AddressablesAssetPack`, `UnityTextureCompressionsAssetPack` (each: stub manifest + `.config.astc` payload variant). `com.android.vending.splits.required=true`.
- **SafeDK wrap [observation]:** Application class `com.safedk.android.SafeDKApplication` intercepts SDK/ad behavior; `custom_notification_android_activity` points back to the Unity activity.
- **Process model [observation]:** several app services/receivers declare `process=":pn"` (push/notification process): AppMonitorService, CustomFirebaseMessageService, AndroidAlarmReceiver, FirebaseInstanceIdReceiver, UnityNotificationManager.
- **Screen rendering [inference]:** all game UI is Unity-rendered (uGUI/UIToolkit + TMP); Android layouts are only SDK/ad containers. `resizeableActivity=false`, `screenOrientation=userLandscape`.
- **Startup [observation]:** boot.config `gfx-threading-mode=4`, `androidStartInFullscreen=1`, `adaptive-performance-google-boost-launch=1`, `gc-max-time-slice=3`; androidx.startup initializers + Firebase ComponentDiscovery.

## Build artifacts [observation]
IL2CPP `global-metadata.dat` 30,278,412 B unencrypted (sha256 `6bf0de97fd7064336b593f92ab0bf0fb63fd2ebff87091b3245e6700e6efb9e5`); `ScriptingAssemblies.json`, `RuntimeInitializeOnLoads.json`, `unity_builtin_extra`, `sharedassets0.resource` in `assets/bin/Data/`; baseline profile (`assets/dexopt/baseline.prof`); FAN dex bundles inside `assets/audience_network/` (dynamic dex loading by AudienceNetwork — noteworthy surface).

## Trust boundaries [inference]
1. Java↔Unity: UnityPlayer messaging + UnitySendMessage bridges.
2. Managed↔native: IL2CPP icalls + 4 Java JNI libs (webrtc, lofelt, coherence, signer) + awrtc native wrap.
3. Client↔server: HTTPS REST (`/api`), WSS game socket, WS room/chat/signaling sockets; auth tokens via Firebase ID token → `x-auth-token`/`device-id` headers (string literal: "server resolves via device-id + x-auth-token headers").
