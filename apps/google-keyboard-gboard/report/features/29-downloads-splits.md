# On-demand downloads — MDD, superpacks & feature splits

## MDD (Mobile Data Download)

`libraries.inputmethod.mdd.*` + `apps.inputmethod.libs.dataservice.*` — Google Play Services' **MDD** delivers models/packs over the air:

- `mdd.ForegroundDownloadTaskWorker` + `MDDTaskScheduler$Worker` — WorkManager-driven downloads.
- `mdd.cleanup.MddMetadataCleanupWorker` — cleanup (`enable_mdd_metadata_cleanup`).
- `libs.dataservice.superpacks.{SuperpacksBackgroundJobService, SuperpacksForegroundTaskService, SuperpacksGcWorker}` — **Superpacks**: named language/feature packs managed on top of MDD.
- `use_mdd_for_superpack` — superpacks routed through MDD.
- ~20 superpack flags (`enable_superpack_*`, `superpack_*`) — version/priority/config per pack.
- `enable_language_pack_for_*`, `force_speech_language_pack_updates` — language-model packs (Delight5 LMs, voice packs) arrive via superpacks rather than the APK.
- `assets/emoji_superpacks_manifest_20250115185814.json` — emoji data ships as a superpack manifest (the `emoji_en_us_20250115185814.zip` asset is the bundled seed).
- `main_en_us_d3` raw resource — bundled English Delight LM bootstrap so the keyboard works offline before packs land.

## Feature splits (this artifact set)

| Split | Contents | Purpose |
|---|---|---|
| `split_brella_feature_split.apk` (SHA-256 `b153ca…f541556`) | `lib/arm64-v8a/libtensorflow_jni.so`, manifest, stamp cert | **Brella** — Google Play's dynamic AI module. Delivers the TensorFlow runtime on demand for devices that use on-device FL/TF features |
| `split_tenoranimation_feature_split.apk` (`a976a7…29a4c86`) | `lib/arm64-v8a/libtenoranimation_jni.so`, manifest, stamp cert | Animated sticker/GIF decode — only downloaded when sticker/GIF features are used |
| `split_config.xxhdpi.apk` (`3c4ad5…a3ed77f`) | `resources.arsc`, manifest, stamp cert | xxhdpi density resources — pure resource split |

Both feature splits contain **zero DEX** — pure native delivery. `libraries.inputmethod.featuresplit` in the base manages dynamic delivery (install/defer/status). The stamp certs in each split match Play's source-stamp mechanism (see [00-identity](../00-identity-and-signing.md)).

## Notes

Feature splits mean the base APK stays lean: the TF runtime (~tens of MB) only downloads when FL/on-device-AI features activate; Tenor animation only when the user opens sticker/GIF surfaces.
