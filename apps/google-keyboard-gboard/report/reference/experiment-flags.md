# Experiment flag reference

## Mechanism

Gboard is almost entirely **flag-gated**. Flags are declared as Phenotype metadata (`.binarypb` assets) and synced at runtime via Phenotype broadcast receivers — the server decides what each device enables. `libraries.inputmethod.flag` + `staticflag` provide the registry; `FlagEditorFragment` gives an editor UI.

## Scan results

- **526** distinct canonical flag keys in the strict scan (Phenotype-declared).
- **1,452** flag-like keys in the broad decompiled-source scan (includes pref keys, numeric tuning params, thresholds, timeouts, tag lists). Full list: [`experiment-flags.txt`](experiment-flags.txt).

## Area distribution (broad scan)

| Area | Keys | Examples |
|---|---|---|
| Emoji | 110 | `enable_emoji_*`, `emoji_*` |
| Writing tools | 55 | `enable_writing_tools_*`, `writing_tools_*` |
| Suggestions | 50 | `enable_*_suggestion*` |
| Voice | 26 | `enable_voice_*`, `voice_*` |
| Expression | 26 | `enable_expression_*` |
| Superpacks | 20 | `enable_superpack_*` |
| Physical keyboard | 20 | `enable_pk_*`, `disable_nwp_in_pk_vertical_mode` |
| Inline suggestions | 20 | `enable_inline_suggestions_*` |
| LLM | 19 | `enable_llm_*` |
| Training cache | 18 | `enable_*_training_cache` |
| Mozc/Japanese | 18 | `mozc_*`, `ja_*` |
| Speech | 17 | `enable_*_speech*`, `force_speech_language_pack_updates` |
| Split keyboard | 13 | `enable_split_*` |
| NWP | 13 | `enable_nwp_tflite_engine`, `enable_two_stage_decoder` |
| Jarvis | 13 | `enable_jarvis*` |
| Stickers | 12 | `enable_*sticker*` |
| Crank | 11 | `crank_engine_timeout_millis`, `enable_crank_for_*` |
| Rambler | 10 | `pref_key_rambler_lite_model_name`, `enable_rambler*` |
| GIF | 9 | `enable_*gif*` |
| Tenor | 8 | `enable_tenor*` |
| Themes | 7 | `enable_gm3_*`, `enable_theme_*` |
| MDD | 7 | `enable_mdd_*`, `use_mdd_for_superpack` |
| Proofread | 6 | `enable_proofread*` |
| Handwriting | 6 | `enable_handwriting_*` |
| Translate | 5 | `enable_*translate*` |
| Autofill | 5 | `enable_autofill_ime_integration` |
| Signboard | 4 | `enable_signboard`, `use_4c_in_signboard` |

## Caveat

A flag's presence proves the feature code path exists and is gated — it does **not** prove the feature is live on any given device. Server Phenotype values, device capability checks (e.g. Edge TPU, locale, RAM), and Play feature-split delivery all gate actual availability. Several flags have explicit `disable_*` kill-switch counterparts.
