# Architecture — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

## Top-level shape (obs)

```
base.apk (75 MB, 6 DEX, 32,228 classes)
├─ Kotlin/Java app core — partially R8-obfuscated (a/b/c method names, numeric field ids)
│   ├─ com.olacabs.customer.*        legacy app, app scaffolding, auth, Room, Watson
│   ├─ yoda.*                       newer UI/arch ("rearch"), booking, SOS, referral, profile
│   │   └─ yoda.oe.prebook.cards    server-driven Epoxy card feed (pre-booking)
│   ├─ com.olacabs.olamoneyrest.*   Ola Money wallet/lending stack (~full feature set)
│   ├─ com.olacabs.upi.*            UPI module
│   ├─ com.olacabs.paymentsreact.*  RN payment bridge
│   ├─ com.olacabs.connect.*        push/inbox ("Connect") notification stack
│   ├─ com.olacabs.tracker.*        live location service + MQTT
│   ├─ com.olacabs.ads / chatsdk / batcher / inappupdate
│   └─ com.ola.maps* / com.olaelectric.ola_finance / com.ola.progressdialog
├─ Third-party SDK DEX (see sdks.md)
├─ assets/index.android.bundle    Hermes bytecode v96, ~2.67 MB (NOT source-readable)
├─ assets/*.jsa                   encrypted Juspay HyperSDK bundles
└─ split_config.arm64_v8a.apk → 13 native libs (React Native core + map + image + rootcheck)
```

## Runtime engines present (obs)
- **Hermes VM** (`libhermes.so`, `libhermestooling.so`, bytecode v96) — runs `index.android.bundle` for the payments RN surface; `PaymentReactActivity.getMainComponentName()` returns `"OlaPaymentsReact"` (ev_fafe7873…, obs).
- **MapLibre native** (`libmaplibre.so`, 13.1 MB) — Ola's map renderer; `com.ola.maps.navigation.v5` nav service.
- **Juspay HyperSDK** — `.jsa` encrypted bundles + `in.juspay.hypersdk*` classes drive payment orchestration web/native hybrid flows.
- **Kotlin coroutines / Jetpack** — WorkManager, Room, DataStore, Lifecycle, Startup (`InitializationProvider`).

## Layering (inf, from class/package structure)
- **UI:** Activities per flow (auth ~10 screens, wallet ~25 screens, SOS 4, UPI 4, KYC 3); Epoxy-style generated card classes (`*Card_`, `UiModelData`) indicate Airbnb Epoxy server-driven UI in `yoda.oe.prebook`.
- **Domain/service:** `yoda.rearch.*` feature packages; `olamoneyrest` has its own `core.endpoints.Endpoint` + `HeaderHelper` networking layer.
- **Network:** OkHttp + Retrofit-style annotations + Volley (`OlaDiskBasedCache` implements `com.android.volley.Cache`) — **two HTTP stacks coexist** (obs).
- **Persistence:** Room (`AppDatabase`, `AppDatabase_Impl`), Volley disk cache, Proto DataStore (`datastore_preferences_core`, `preferences_pb`), SharedPreferences.
- **Events:** `watson` request/response log models → Sherlock event pipeline → `com.olacabs.batcher` JobService batch upload (inf from names + service binding, partial decompile).

## Obfuscation (obs)
- ProGuard/R8: single-letter classes/methods throughout `com.olacabs.customer.app`, `chuckerteam.chucker.*`, `moengage.*`, `xiaomi.*`.
- String obfuscation: `ConnectUrls` URL map recovered only via clinit decompile; many endpoint paths appear as plain strings in DEX (not encrypted).
- Juspay assets are encrypted blobs — unrecoverable statically (unk content).

## Entry graph (obs)
```
LAUNCHER → NewSplashActivity → (auth check) → NewMainActivity | BaseLoginSignUpActivity tree
deeplinks → DeeplinkActivity (7 filters) → internal routes
push taps  → NotificationClickedActivity / ConnectNotificationActionReceiver → routes
```

## Processes (obs): default, `:restart` (post-crash re-entry), `:pushservice` (Xiaomi).

## Structural unknowns
- Which RN bundle version/feature set is live vs CodePush-patched at runtime (unk — CodePush present, deployment key embedded).
- Whether `yoda.oe` is "Ola Experience" rollout shell — naming inference only.
- Extent of Juspay flows (`.jsa` encrypted).
- Actual GraphQL/REST wire protocol per endpoint family (paths recovered; request/response schemas not fully extracted).
