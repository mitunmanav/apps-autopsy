# Module: gpdeku (Google Play Deku feature module)
**Artifact:** `split_gpdeku.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `25ca35411deef4cc5eb2ce15e5630b98ae013740fb5be8285e34edb5aaf5850b`; native in `split_gpdeku.config.arm64_v8a.apk`

- **Identity [observation]:** Play-delivered **on-demand feature module** "gpdeku" (Google Play Deku), 106 classes under `com.google.android.play.deku.*`; bundletool-signed (`META-INF/BNDLTOOL.*`); isolated provider `IsolatedDekuContentProvider` with 6 isolated processes (`$Process0-5`) [observation — ev_bc489617…, ev_e366d652…].
- **Function [observation]:** `deku.screencapture.NativeBridge` + `libgpdeku.so` exports `native{Initialize,GetSurfaceControl,GetMirrorSurfaceControl,ReleaseSurfaceControl}` → screen-surface capture through Android SurfaceControl; `JniZero` glue (Chromium JNI zero pattern); `DekuFeatureFlags`, `DekuLifecycleManager` config [observation — ev_3fe6b1fa…].
- **Purpose [inference]:** Play Games / Play Store screen-capture capability (recording/remote-play/Play integrity capture) delivered as separate module — not authored by Hitwicket; Google Play component.
- **Trust notes:** runs in isolated processes; communicates via provider; shipped inside the app's split set but is Google's code [observation].
