# Decoding, suggestions & autocorrect

## Subsystems

| Subsystem | Classes / flags | Notes |
|---|---|---|
| **Delight5 n-gram LM** | `delight5.Decoder`, `DynamicLm`, `DecoderConfiguration` | On-device personalized n-gram + neural decode; `enable_dynamic_lm_noise_filter`, `enable_dynamic_lm_unigram_continuation_scoring` |
| **NWP — next-word prediction (TFLite)** | `crank.nextwordpredictor.NwpModelManager`, `enable_nwp_tflite_engine`, `disable_nwp_in_pk_vertical_mode`, `disable_nwp_result_cache`, `ja_enable_smart_emoji_nwp` | Transformer/NN next-word predictor shipped via Superpacks (`gstatic.com/.../next_word_predictor/prod/superpacks-manifest-…json`) |
| **Two-stage decoder** | `enable_two_stage_decoder` | Decode then rescore |
| **Neural rescoring** | `enable_neural_otf_rescoring` (on-the-fly), `enable_nss_rescoring`, `enable_personalized_neural_rescoring_model_loader`, `mozc_neural_rescoring_mode_for_nwp` | Personalized neural rescorer downloaded per-user |
| **Concept prediction** | `crank.conceptpredictor.{ConceptPredictorEngineLoader, ConceptPredictorModelManager}`, `enable_concept_prediction_engine`, `enable_rule_based_concept_prediction`, `enable_last_word_rule_based_concept_prediction`, `enable_suffix_rule_based_concept_prediction` | Predicts emoji/entities/concepts from context |
| **Multiword suggestions** | `enable_multiword_predictions_as_inline_from_crank_cifg`, `enable_multiword_suggestions_as_inline_from_crank_cifg`, `enable_multiword_predictions_from_user_history`, `enable_multiword_suggestions_from_user_history`, `multiword_candidate_language_tags`, `threshold_for_candidates_from_user_history`, `enable_single_word_predictions_as_inline_from_crank_cifg` | Whole-phrase suggestions from crank "CIFG" + user history |
| **Post-correction (auto-correct after commit)** | `enable_post_correction_trigger_predictor`, `enable_pk_auto_correction_trigger_predictor`, `enable_space_transposition_post_correction`, `enable_standalone_post_correction_literal_generation`, `support_reject_post_correction`, `enable_export_pcv2_revert_history`, `pref_key_latin_enable_ac_revert` | Predicts when to fix committed text; supports reverting |
| **Autocorrect UX** | `correctiontransition.BeamTransitionView`, `enable_correction_commit_animation`, `show_auto_correction_floating_candidates_delay_ms`, `enable_revert_auto_correct_on_pk` | Visual transition + revert chips |
| **Key correction (spatial model)** | `enable_kc_threshold`, `enable_load_key_correction_model_from_klp`, `enable_key_correction_debug_visualizer`, `enable_pk_spatial_model_features`, `enable_smartkeys_heatmaps`, `enable_tflite_smartkeys_model`, `use_tflite_smartkeys_baseline` | TFLite "smartkeys" spatial mistouch model |
| **Compound words** | `enable_compound_word_support_language`, `enable_compound_word_suffix_prediction_language` | Germanic/compound languages |
| **Crank engine** | `libs.crank.CrankFacilitator`, `crank/modelmanager/*`, `CrankSlicingStrategy`, `CrankEngineLocales`, `crank_inline_suggestion_language_tags`, `crank_max_char_num_limit`, `crank_engine_timeout_millis` | The on-device TFLite inference orchestrator for NWP/concept/expression models; supports model slicing |
| **Transformer expression engine** | `crank.transformerexpression.*`, `enable_transformer_expression_engine` | Transformer-based expression prediction |
| **Triggering model** | `enable_tflite_triggering_model{,_on_all_keys,_on_function,_on_latin}`, `enable_triggering_model` | TFLite model deciding when to show smart suggestions |
| **Auxiliary neural decoder** | `disable_auxiliary_neural_decoder`, `use_transformer_model` | Optional second decoder |
| **Sentence-piece LM** | `disable_hypotheses_sentence_piece_lm_predictions`, `enable_sentence_piece_eos_prediction` | SentencePiece tokenized LM hypotheses |
| **OOV dedup** | `enable_oov_deduplication` | Out-of-vocab dedup |
| **TNT continuous decoding** | `enable_tnt_continuous_decoding` | Continuous decode during typing |
| **Inline suggestions (decoder-side)** | `enable_inline_suggestions_on_decoder_side`, `enable_inline_suggestions_with_ac_from_crank_cifg` | Autofill-styled inline completions |
| **Punctuation spacing** | `enable_punctuation_spacing_normalization` | |
| **Bad-word checker** | `libs.badwordchecker.AhoCorasickBadWordChecker`, `bad_word_checker_jni` | Aho-Corasick profanity/blocklist filter |
| **Safety violation checker** | `safety_violation_checker_jni` | Checks output for safety violations |

## Notes

- "crank" is Gboard's umbrella for the TFLite-powered predictive stack (NWP, concept predictor, expressive concepts, transformer expression). Locale-gated (`CrankEngineLocales`, per-language-tag flags).
- `enable_kc_threshold`/`enable_ac_threshold` — autocorrect/key-correction thresholding.
- `enable_proactive_*`, contextual GIF/emoji suggestions documented in expression docs.
- All of this is flag-gated server-side via Phenotype (`enable_*`/`disable_*`), so shipped ≠ enabled.

## Limitations

Model formats/weights ship via Superpacks/MDD, not in the APK — only loaders and JNI shells are in the binary. Exact model architecture is not recoverable from DEX.
