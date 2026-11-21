# Feature: Elise — On-Device ML

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

## UI entry [obs]
- No direct UI — inference runs behind other features (chat-safety text checks most likely; consumer features [unk]).

## Param model [obs — decompiled `EliseDownloaderWorker.a()`, ev_d7810059]
- WorkManager `RxWorker` input keys: `PAYLOAD_KEY`, `MODEL_URL`, `MODEL_COMPRESSED`, `VOCABULARY_URL`, `VOCABULARY_COMPRESSED`
- Missing/empty required payload → `Result.failure()`
- Stores assets via `getDir("_elise_assets", 0)` → app-private dir
- `ALLOW_ELISE_INFERENCE` gate string [obs] — flag-controlled enablement

## Execution path [obs names; order inf]
1. Scheduled WorkManager job downloads model + vocabulary (possibly compressed) → `_elise_assets/`
2. Inference loads model via TFLite-GMS dynamite (`libtensorflowlite_jni_gms_client.so`) / LiteRT (`liblitr-jni.so`)
3. Runs on text (vocab → tokenizer/classifier [inf]) — plausibly powers review-before-send; whether it also drives the image-based private detector is [unk]

## Local vs remote
- Remote: asset distribution (model URL) + flag.
- Local: 100% of inference — no user content leaves device for the model [inf].

## Premium/offline
- Offline-capable after download [obs by construction]; not user-sold.

## Input → output
- In: model+vocab URLs → local inference inputs (text) → Out: classification signals consumed by features (which features consume them [unk]).
