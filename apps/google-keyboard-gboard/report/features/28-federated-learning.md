# Federated learning & training cache

## Architecture

Gboard participates in Google's **federated learning** — on-device training where only model updates (not data) leave the device. The whole pipeline ships in `libraries.inputmethod.trainingcache.*` + `apps.inputmethod.libs.trainingcache.*`.

### Components

| Component | Role |
|---|---|
| `trainingcache.impls.nativeutils.{InputProcessUtils, NebulaeUtils, TfRunner}` | JNI/TF glue — a **TensorFlow runner** (`tensorflow_jni` via the brella split) executes local training on device |
| `trainingcache.impls.nebulaematerializer.NebulaeMaterializerV2` | "Nebulae" = the on-device FL materialization layer (prepares training examples into materialized form) |
| `trainingcache.impls.inputmetrics.InputMetricsPeriodicTask` | periodic input-metrics collection for FL |
| `trainingcache.localcomputation.LocalComputationResultHandlingService` | **local computation** results (not federated upload — on-device compute only) |
| `trainingcache.maintenance.maintainer.MaintenanceTaskWorker` | WorkManager maintenance for the cache |
| `trainingcache.trainer.dynamictrainer.FederatedResultHandlingService` | handles results of the **federated trainer** — the actual FL upload path |
| `libs.trainingcache.examplestoreservice.ExampleStoreServiceMultiplexer` | multiplexes multiple example stores behind one service |
| `libs.trainingcache.replaycache.precomputedfeature.speech.examplestoreservice.SpeechPrecomputedFeatureExampleStoreService` | **speech** example store with precomputed features (voice typing FL) |
| `libs.trainingcache.replaycache.sanitycheckeval.nwpp13n.examplestoreservice.NwpSanityCheckEvalExampleStoreService` | NWP personalization **sanity-check evaluation** store |

### Related plumbing

- `libs.dataservice` + MDD deliver FL plans/models as downloadable packs (see [29-downloads](29-downloads-splits.md)).
- `manifest`: `com.google.android.apps.inputmethod.libs.trainingcache.*` service components + phenotype sync (`Phenotype` components register flag updates from the server).
- `enable_conversation_id_in_training_cache` — conversation-scoped examples.
- `enable_handwriting_training_cache`, `enable_hybrid_handwriting_training_cache` — handwriting recognizer personalizes via FL too.
- `use_input_process_utils_v2` — v2 of the native input-processing JNI.
- `enable_mdd_metadata_cleanup`, `enable_sqlite_release_memory` — cache hygiene.
- `enable_personalized_neural_rescoring_model_loader` — the personalized NWP rescorer produced by this pipeline (see [27-personalization](27-personalization.md)).

### User-facing

Settings string: "Federated learning" / learns "on this device" — data "will be saved on this device" and can be deleted ("Delete learned words and data"). No raw text leaves the device for training; the federated trainer uploads only aggregated model deltas via Google's FL infrastructure.

### Notes

`NwpSanityCheckEval` shows Google runs **on-device A/B sanity evals** of personalized NWP models — a quality gate before a personalized rescorer goes live.
