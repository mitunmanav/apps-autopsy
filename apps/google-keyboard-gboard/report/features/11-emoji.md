# Emoji — picker, search, prediction

## Picker & browse

- `libraries.inputmethod.emoji.picker.*`, `emoji.widget.*`, `emoji.view.*` — the emoji picker UI; `EmojiFabView` floating button.
- `libs.search.emoji.standard.*`, `search.emoji.search.*` — emoji search keyboard.
- `search.emoji.blocklist` — regional/safety emoji blocklist.
- **Variants**: `enable_emoji_variant_mapping_for_emoji_candidates`, `enable_emoji_variant_preferences_backup`, `enable_variants_indicator_in_emoji_search_{filter_view,result}`, `enable_variants_popup_in_emoji_search_{filter_view,result}`, `show_emoji_variant_candidate_allowlist`, `enable_3d_couple_emojis` — emoji skin-tone/gender/couple variants incl. 3-D couples.
- `enable_emoji_mistap` — mis-tap tolerance.
- `enable_emoji_group_candidate_ui` — grouped candidates.

## Emoji prediction & semantic search

- **On-device**: `enable_emoji_predictor_tflite_engine`, `enable_lite_emoji_prediction_engine` (two engine tiers) + `emoji` + `expressive_concepts` native modules.
- **Semantic/Gemma search**: `enable_semantic_emoji`, `enable_emoji_embedding_index`, `enable_ai_core_embedding_gemma`, `enable_fallback_for_emoji_search_{gemma_engine_error,server_error}`, `enable_fallback_from_server_for_emoji_search_gemma_engine_error`, `enable_prewarming_for_emoji_gemma_search_engine_activation`, `show_error_status_for_emoji_search_{gemma,server}_error` — **embedding-based emoji search via Gemma** (AICore) with on-device index + server fallback.
- `enable_emoji_search_engine_debug_toast`, `disable_emoji_search_server_engine_when_no_network`, `enable_logging_for_emoji_search_query`, `disable_individual_word_search_for_hybrid_engine`, `require_exact_match_for_filtering_in_hybrid_engine`, `additional_emojis_require_jni_filtering_in_hybrid_engine`, `emoji_search_gemma_engine_requires_query_rewrite`, `emoji_search_{gemma,server,gemma_embedding}_engine_timeout_millis`, `supported_languages_for_emoji_search_from_server`, `failures_to_disable_primary_engine_in_emoji_search_with_fallback_engine`, `display_loading_status_for_emoji_search_{,gemma_}delay` — hybrid engine = local index + Gemma + server, with per-engine timeouts, query rewrite for Gemma, and auto-disable after N failures.
- `search.emoji.blocklist.SafetyViolationCheckerJni` — emoji-search results filtered through `safety_violation_checker_jni`.
- `enable_query_candidate` — surface the typed query as a candidate.
- `enable_predictions_from_emoji_shortcuts`, `enable_ngram_emoji_shortcuts_{by_spans,for_prediction}` — type-a-shortcut → emoji.
- `enable_emoji_for_dynamic_art_template_candidate`, `enable_emoji_suggestion_from_top_candidate`.
- `enable_emoji_loader_migration` — emoji font/asset loader migration.
- `enable_animated_emoji_content_suggestions`, `show_animated_emoji_in_expression_moment` — animated emoji in suggestions.
- Bundled `assets/emoji_en_us_20250115185814.zip` + `emoji_superpacks_manifest_20250115185814.json` — English emoji data pack + downloadable "emoji superpacks" manifest.

## Notes

The "expressive concepts" native lib (`libexpressive_concepts_model_less_predictor_jni_native.so`, `learning.expander.pod.inferenceapi.expressiveconcepts.{Base,}ExpressiveConcepts*Predictor`) predicts *concepts* (e.g. "celebration") to expand emoji/GIF/sticker suggestions — see expression-moment doc.
