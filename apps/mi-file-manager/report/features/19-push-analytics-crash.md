# 19 — Push, Analytics & Crash Reporting

## Push

- `com.google.firebase.messaging.FirebaseMessagingService` — declared with `MESSAGING_EVENT` filter, `exported=false` (manifest-verified). It is the **stock gms class** — no app-side subclass is declared; message handling (if any) would run inside the gms/firebase internals.
- `FirebaseInstanceIdReceiver` (IID, exported, gated by `c2dm.SEND`), `com.google.android.c2dm.permission.RECEIVE` + `c2dm.intent.RECEIVE` filters.
- Mi Push? — `com.xiaomi.push`/`mipush` packages **not** observed in the class inventory of this global build (FCM is the push channel).

## Analytics

- Google `AppMeasurement` (`com.google.android.gms.measurement`, `AppMeasurementReceiver` + `AppMeasurement{Service,JobService}` — manifest-verified), `firebase_analytics_collection_enabled` meta-data **`false`** — analytics disabled by default until consent flips the flag (doc 12).
- `com.xiaomi.globalmiuiapp.analytics`/onetrack-style Xiaomi analytics glue + `stat/analytics` helpers — events for feature usage (`FeatureEvents`-style).
- `com.google.android.datatransport.cct` — Transport/CCT pipeline (analytics backend transport).

## Crash reporting

- `com.miui.zeus.monitor.crash.CrashMonitorService` (process `:crash`, `exported=false` — **Zeus SDK** class, not app code; manifest-verified) — watchdog: monitors app crashes in a separate process and reports.
- `stability.FabricHelper` (`com.crashlytics`-style helpers present via `Fabric`/`crashanalysis` assets: `assets/crashanalysis`, `system_image` crash params) — Crashlytics/Firebase Crashlytics path present; `crashlytics_collection_enabled` meta-data `false` pending consent.
- `x-metadata.properties` — build stamps bundled for crash attribution.

## Device/identity signals

- `AdvertisingIdHelper` (GAID, `globalmiuiapp.common`), `OAID`-style helpers inside columbus (doc 18); `READ_PRIVILEGED_PHONE_STATE` for device ID on MIUI (privileged-only).
- Install referrer via Play `BIND_GET_INSTALL_REFERRER_SERVICE` permission (declared; a dedicated receiver is not in the manifest).

## Evidence

Manifest receivers/meta-data (`ev_24480d9e…089c2a7`), class inventories (`ev_c7d5130a…787a4a`), archive assets (`ev_fec9a360…57e179f`), `ev_6336079a…82308f` (init ordering; consent gating).

## Unknowns

- Which analytics backend actually receives events (onetrack/MARS vs. pure Firebase) — endpoint config obfuscated (doc 21).
- CrashMonitorService upload destination and trigger conditions — service internals not fully decompiled.
