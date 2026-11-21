# Architecture

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2` (all four split SHA-256s apply to code+resources as a set).

Evidence: class search ev sets, application graph `ev_b454821a`, method decompiles (`ev_d7810059` Elise worker, `ev_a65092f7` WebRtcService, `ev_1ca207c0` Bumble2MainActivity).

## Layers [obs]
The DEX contains three coexisting app-code generations plus a shared layer:

1. **Legacy Badoo platform** — `com.badoo.mobile.*` ≈2,336 classes. `com.badoo.mobile.model` alone has 1,389 classes (heavily R8-obfuscated entity/API models). Subsystems: `chatoff` (legacy chat), `payments`, `webrtc`, `upload`, photo verification, location, push, `lexem` (i18n), `redirects`.
2. **Current app** — `com.bumble.app.*` ≈797 classes. Feature packages: `beeline`, `beemail`, `chat`, `datinghub`, `discovery`, `encounters`, `instantmatch`, `spotlight`, `supercompatible`, `settings2`, `profile_editor`, `questiongame`, `speeddating`, `verification`, `webrtc`, `payments`, `subscriptions_plan`, `support`, `screenstories`, `prompts`, `reportuser`, `travel`, `connections`, `votecap`, `firstmovequestions`, `sharedate`, `languages`, `recommendtofriend` (the `beeline` name appears twice in the package listing — once as a feature package and once as a container namespace). Sibling `com.bumble.*` packages: `coaching` (+`easyvideoplayer`), `profileinsights`, `helphub`, `firstmovepromoscreen`, `shared` (KMP), `spiderweb.database`. Application class wires telemetry/auth events in `onCreate` [obs, decompiled].
3. **Next-gen modules** — `com.bumble2.*` ≈140 classes: `app.Bumble2MainActivity`, `ads`, `paywall` (incl. Stripe models + `WebViewBridge`), `matchscreen`, Stream-chat contract models, encounters/discovery contracts, liked-you, profile viewer/editor, reporting, settings, spotlight, verification, blockers/content-moderation. Route/NavTarget classes indicate a typed navigation DSL.
4. **Shared KMP layer** — `com.bumble.shared.*` (Kotlin Multiplatform; `com.bumble.shared.comms` = 31 transport classes, `com.bumble.shared.*` auth/telemetry events referenced by app `onCreate`), `com.bumble.spiderweb.database` (Room), `com.bmbl.b4f.*` (1,363 dotted names in strings: 39 protobuf API services in 18 package domains, generated `*Req/*Resp` models marked kotlinx ProtoBuf).
5. **Obfuscated core** — flat `b.*`, `a.*` packages (R8 output) hold much of the wiring [obs; internals not reconstructable statically].

## UI + navigation [obs/inf]
- Mix of classic Activities (222) and a newer route-based system: `*.Route`, `NoteInternalRoute`, `StripePaymentRoute`, `PrivateDetectorReceiverWarningMenu` models, Appyx navmodel classes (`com.bumble.app` Appyx usage in search results). [inf: new flows are Compose+Appyx; legacy flows are Activity-based]
- `Bumble2MainActivity` is a thin exported shell (decompiled: `dispatchTouchEvent`, `onCreate`, `onResume` only — content resolved via injected routes, fields obfuscated) [obs].

## DI / app bootstrap [inf]
- `BumbleAppComponentFactory` + androidx-startup providers + `BumbleMainApplication.onCreate` (initializes `com.bumble.shared.*` auth telemetry, then feature graphs). Dagger/Hilt-style component names appear in class lists [obs strings; exact graph shape unk due to R8].

## Build signals [obs]
- Kotlin-first codebase (kotlinx-serialization, kotlinx-protobuf, coroutines), RxJava3 worker (`EliseDownloaderWorker extends RxWorker`), Compose (PreviewActivity, androidx.compose.ui tooling classes), Baseline Profile shipped (`baseline.prof`), Lottie, Glide.
- `mapping.txt` absent → public/proguard map not shipped; `b.*` names are final [obs].

## Structural takeaways
- Two API transports coexist: legacy `SERVER_*` string-verb RPC (640 verbs) and `com.bmbl.b4f` gRPC/protobuf + SSE channel [obs]. Migration is incomplete [inf].
- Two chat stacks coexist: GetStream SDK (contract+Room schema) and `com.badoo.mobile.chatoff` [obs].
- Feature silos mirror product surface: each premium tool has its own package + promo/paywall plumbing [obs].
