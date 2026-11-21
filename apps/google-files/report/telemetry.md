# Telemetry & logging

## Pipelines present

| Pipeline | Evidence | Scope |
|---|---|---|
| **Clearcut** | device source `com.google.android.apps.nbu.files.device`, log source `45461419` (`hpt`); phenotype channel registered | product events |
| **Streamz** | ~40 `/client_streamz/geller/cache/**` metric defs (`nsh`,`njk`,`nsg`) | latency/count metrics (read/write/delete/update/cleanup/migration/DMA) with `app`,`app_version`,`corpus`,`success` fields |
| **Firebase Analytics** | `AppMeasurementService`/`AppMeasurementJobService`/`AppMeasurementReceiver` in manifest | GA4F events |
| **Primes** | `performance.primes.transmitter.LifeboatReceiver` + phenotype channel `performance.primes` | perf/crash metrics |
| **GNP** (Google Notification Push) | registration in `HomeActivity.onCreate`; entrypoint receivers AccountChanged/LocaleChanged/Restart/TimezoneChanged/Update | push channel |
| **Firebase Messaging** | `FilesFirebaseMessagingService`, `FirebaseInstanceIdReceiver`; `proxy_notification_initialized` delegate (`kru`) | FCM |
| **Phenotype** | 13 registration channels (see manifest.md) + `assets/phenotype/*` | config |
| **Surveys** | `libraries.surveys.internal.view.SurveyActivity` + `surveys` phenotype pkg | in-app surveys |
| **DroidGuard** | `gms.droidguardclient` phenotype channel | anti-abuse attestation |
| **ConsentVerifier** | `libraries.consentverifier` channel + `CBVerifier` logs (`kef`) | consent verification |
| **Privacy ptoken** | `privacy.ptoken.ondevice` phenotype pkg | privacy-token channel |
| **AppDoctor** | `libraries.appdoctor.AppDoctorReceiver` | self-healing telemetry |

## Product events (sampled strings)

- `is_gemini_display_logged` — Gemini entry shown
- `is_first_nearby_share_logging_attempt` — first share attempt
- `PlayPauseButtonClicked`, `PrevButtonClicked`, `NextButtonClicked`,
  `RepeatButtonClicked`, `ShuffleButtonClicked`, `OnScroll`, `On Unzip Dismiss
  Clicked`, `New zip file edit text changed`
- `DeviceInfoEvent` (`hvg`) — device-info event logging
- `UnzipParentDialogFragmentPeer#onBackPressedCallback`
- Failure breadcrumbs: trash stats/restore/move failures, zip read failures,
  donation failures (`Donating to BlobStore failed.` / `AppSearch failed.`)

## DMA-compliance telemetry

Geller DMA metrics (`geller_dma_enforcement_calls_per_read`,
`geller_dma_poe_count`, `…product_id_*`, `dma_evaluation_result`,
`processing_purpose`) — EU Digital-Markets-Act data-purpose accounting built in.

## Notes

- Telemetry is event-counter style (Streamz) + Clearcut protos + AppMeasurement;
  actual proto schemas live in obfuscated generated classes — not enumerated.
- All pipes are Google-internal; no third-party analytics SDKs.
