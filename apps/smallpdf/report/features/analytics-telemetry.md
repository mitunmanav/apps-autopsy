# Feature: Analytics & Telemetry

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

- Firebase `[obs]`: Analytics, Crashlytics, Remote Config (`max_free_tasks`, `scanner_detection_kill_switch` defaults in `remote_config_defaults.xml`), Sessions, Installations, DataTransport — project `smallpdf-ee0cd`, app id `1:850993444664:android:84e197cb85342415e873cd`, GCM sender `850993444664`.
- First-party `[obs]`: `analytics.smallpdf.com` endpoint + `RedshiftEventSenderWorker` — batched event upload to a Redshift-backed pipeline `[inf]`.
- Attribution `[obs]`: AppsFlyer SDK (`onelink.me` smart banner `smallpdf-mobile.onelink.me`, default URL `…/LaDa`), Play install-referrer (`BIND_GET_INSTALL_REFERRER_SERVICE`), Samsung/Huawei referrer perms, `AD_ID`/`ACCESS_ADSERVICES_*`.
- Event schema `[unk]`: event names/fields are inside obfuscated emitters; `ts7`/`bt7` task telemetry fields only partially recovered.
