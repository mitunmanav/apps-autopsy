# Fluency prediction engine

Evidence: REA `inspect_android_class` `ev_20c3f81a…` (FluencyServiceImpl); `ev_c3fb12ef…`/`ev_dcfcff00…` (JNI); `_work/jadx-base/sources/com/microsoft/fluency/`; `assets/appconfig/fluency/params/models/fluency_params.json`; bundled `lp.zip` models.

## What it is

Microsoft **Fluency** — the C++ text-prediction/auto-correction engine behind SwiftKey. Java API lives in `com.microsoft.fluency.*`, bound by JNI to `libfluency-java-internal.so` (arm64). Licensed component (`Fluency.getVersion`, `Fluency.getExpiry`, `LicenseException`).

## Service layer

`com.touchtype_fluency.service.FluencyServiceImpl` — non-exported bound Service wrapping the engine:

- `getInputMapper()` → `InputMapper` — touch→character mapping (key geometry)
- `getTokenizer()` → `Tokenizer` — text tokenization
- `getPunctuator()` → `Punctuator` — punctuation/sentence boundary
- `getParameterSet()` / `getLearnedParameters()` → `ParameterSet` — engine parameters incl. learned values
- `getMostLikelyCharacter(Sequence, TouchHistory, Point, String)` → `m40.w` — key-press disambiguation from touch point
- `c()` → `DynamicModelMetadata` — user/dynamic model metadata
- `a(as.f, String, q50.b): boolean` — model/language-pack registration [inferred]
- listener registration: `b(k0, Executor)`, `g(t0)`, `j(t0, Executor)`, `k/n(ek0.r)` — model-loaded / prediction listeners
- `f()→m40.m`, `l()→wj0.f`, `m()→at.b`, `h(String):boolean`, `i():Integer`

`FluencyServiceProxy` + `a…z0` classes are the in-process/async facades around the binder.

## Engine Java API (57 classes)

Core: `Session`, `Predictor`, `Predictions`, `Prediction`, `Term`, `TermPosition`, `Sequence`, `SequenceTermMap`.
Input side: `InputMapper`, `KeyPress`, `KeyPressModel`, `KeyShape`, `Point`, `TouchHistory`, `LayoutFilter`, `ResultsFilter`.
Text side: `Tokenizer`, `Punctuator`, `SentenceSegmenter`, `TagSelector`/`TagSelectors`.
Models: `ModelSetDescription` (+`verify`), `ModelMerger` (merge downloaded + user models, `serialize`), `DynamicModelMetadata`.
Config: `Parameter`/`ParameterSet`/`ParameterTargetAndProperty`, `FloatRange`, `IntegerRange`, `Range`, `CharacterWidth`, `CodepointRange`.
Script helpers: `Chonjiin`, `Hangul`, `NaratGeul` (Korean), `Japanese`, `Telex` (Vietnamese).
Learning: `Trainer` — user-word learning.
Errors: `LicenseException`, `DependencyNotFoundException`, `FileCorruptException`, `InvalidDataException`, `CountOverflowException`, `SystemException`, `TermMergeFailedException`, `ParameterOutOfRangeException`.
Callbacks: `LoggingListener`, `Task`.

## Model pack format (`lp.zip`)

See `04-dynamic-modules-and-splits.md` — `.lm`/`.lm1`/`.lm2`/`.lm3` model files + `charactermap.json` + `punctuation.json` + `ime.json` + `.config` + `extra.dat`. `ModelMerger` merges static packs with the dynamic (user) model.

## Tunable parameters (bundled defaults, BiBo-overridable)

`fluency_params.json` — grouped by engine target:

| Target | Parameter | Value |
|---|---|---|
| input-model | `space-skip-probability` | 4.1e-08 |
| input-model | `replace-probability` | 3e-06 |
| results | `exact-match-threshold` | 0.005 |
| results | `layout-filter-dynamic` | true |
| results | `num-close-match-limit` | 1 |
| results | `verbatim-backoff` | 0.02 |
| results | `verbatim-probability` | 2e-07 |
| extended-predictions | `frequency-threshold` | 3 |
| extended-predictions | `rank-limit` | 1 |
| continuous-input (Flow) | `start-decay` | 0.36 |
| continuous-input | `end-decay` | 0.50 |
| continuous-input | `prefix-probability` | 1e-15 |
| continuous-input | `use-scaled-key-proximity` | false |
| continuous-input | `use-direction-path-similarity` | true |
| most-likely-character | `kpm-scaling-factor` | 6.0 (key-press model) |
| most-likely-character | `use-wildcards` | true |
| parameter-learning | `adaptive-wildcards-limit` | 1,000,000 |
| parameter-learning | `enable-adaptive-wildcards` | false |
| dynamic-term-model | `language-weighting-strength` | 0.33 |
| language-detection | `power` | 0.4 |
| close-match | `confidence-factor` | 0.5 |
| close-match | `infer-space-probability` | 0.0006 |

## Native capabilities (JNI exports)

`createHybridSession` (mixed on-device/remote sessions), `setNativeCrashDetectionEnabled`, `NetworkRequest.{getBody,setError}` — **the engine exposes a network bridge** (server-assisted prediction/content retrieval) [inferred from exported names], `batchUnload` (model memory management), `setEnabledModels`, `getBlocklist`, `getDynamicModelMetadata`, `LayoutFilter`, async `PredictionsPromiseImpl`.

## Related BiBo-delivered configs

`correctasyoutype.CorrectAsYouTypeModel` — "correct as you type" rollout config; `quickcharacter.QuickCharacterParametersModel` — quick-character ribbon; `typingsampling.TypingSamplingParametersModel` — typing telemetry sampling; `keyboard_preferences.KeyboardPreferencesExperimentModel`; `multimodal.MultimodalBiboParams`; `postures.*`, `keyboardsizing.*`.
