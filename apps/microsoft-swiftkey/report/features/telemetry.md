# Telemetry & experimentation

Evidence: `com.touchtype.telemetry*`/`com.touchtype.analytics*` packages, `SwiftKeyTelemetryService`/`TelemetryService` + scheduled jobs, `TelemetryExposeDoneReceiver`, `houston.services.swiftkey.com`/`activity.windows.com` URLs, `federatedexperimentation` service, `typessampling`/`event_forwarding` configs, `experiment_config_*.json`, Avro schemas on classpath.

## Pipeline

- Event producers across features → telemetry service → batched upload to `houston.services.swiftkey.com/phone` (SwiftKey telemetry) and `https://activity.windows.com` (Microsoft activity/Rewards).
- Auto-tracking base classes: `com.swiftkey.telemetry.TrackedAppCompatActivity`, `com.touchtype.telemetry.TrackedPreferenceFragmentCompat`, `TrackedContainerActivity` — screens report views by inheritance.
- Scheduled jobs flush queues (`TelemetryJobIntentService`); `TelemetryExposeDoneReceiver` re-arms after exposure events.
- `typessampling` config — per-event sampling rates; `event_forwarding` config — which events forward where.
- Avro — `com.swiftkey.avro.telemetry` + `org.apache.avro` schemas serialize events.
- **Google Tag Manager** (`com.google.android.gms.tagmanager`, 37 classes) + `gms.analytics` + `com.google.android.datatransport` — a second, Google-side analytics pipeline is bundled alongside SwiftKey's own.
- `net.swiftkey.androidlibs.paperboy` — internal network layer used for sends.

## Experimentation

- `com.touchtype.federatedexperimentation.*` — federated experimentation service (device-side assignment, possibly federated-learning flavored — name implies on-device).
- `experiment_config_new_user.json`/`experiment_config_upgrade_user.json` — shipped empty `[]`; assignments arrive via BiBo and bucket by install type.
- Variant keys seen: `dynamicFeatures`, `cesar`/`android_cesar` (Copilot/AI surface experiments), `toolbarItemsOrdering`, `compact_mode`, `multimodal` toggles.

## Privacy surface

- `ads_data_consent` pref + privacy settings screen — consent state gates ad/analytics data.
- Incognito suppresses learning; telemetry suppression incognito is NOT verified — unknown.

## Notable

Telemetry volume is heavy (IME typing stats) — static evidence shows the machinery, not the event catalog; event schemas are server-side.
