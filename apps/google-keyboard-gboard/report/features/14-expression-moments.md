# Expression Moment, Dynamic Art, content suggestion & emojify

## Expression Moment

Inline **expression suggestions that appear while you type** — the suggestion bar offers emoji/GIF/sticker/kitchen content contextually.

- `libs.expression.expressionmoment.*` + `enable_expression_moment`, `enable_expression_moment_language_tags`, `enable_expression_moment_push_up_animation`, `enable_expression_moment_push_up_animation_close_extension_early`, `show_animated_emoji_in_expression_moment`, `show_contextual_emoji_kitchen_in_expression_moment`, `show_emoji_kitchen_mix_in_expression_moment`, `enable_handle_expression_moment_standard_emoji_kitchen` — pushes up a suggestion card animated from the suggestion strip.
- `libs.expression.navbar`, `expression.header`, `expression.expandableheader`, `expression.keyboard`, `expression.extension`, `expression.history`, `expression.contentcache`, `expression.imagefeedback`, `expression.image.storage`, `expression.emojisearch`, `expression.emojify`, `expression.tenoranimation` — the expression subsystem (navigation bar, headers, history, caches, per-type extensions).
- `enable_expression_candidates_debug_toast`, `enable_future_expression_candidates_debug_toast`, `enable_expression_training_cache_candidates_logging`, `enable_handle_emoji_for_expression_candidates`, `enable_handle_emoticon_for_expression_candidates`, `enable_expression_ime_options` — expression candidate plumbing + training-cache logging.
- `enable_expression_data_pruning` — retention pruning.

## Content suggestion (browse)

- `libraries.inputmethod.contentsuggestion.*` — a **content-browse surface** in the keyboard (`CategoryViewPager`, `ExtendedFabBehavior`, `EmojiFabView`, `browse.resource.*`, `contentfetcher.sqlite.*`, `disable_content_suggestion`, `use_local_index_for_content_suggestion_only`) — browsable categories backed by a local index/SQLite fetcher.
- `enable_contextual_search_desktop_entrypoints` — contextual search entries on desktop.

## Dynamic Art

- `enable_dynamic_art`, `enable_dynamic_art_debug_toast`, `enable_dynamic_art_language_tags`, `enable_emoji_for_dynamic_art_template_candidate`, `enable_add_punctuation_into_{prod_,}dynamic_art_sticker` — **Dynamic Art**: generated/animated sticker templates (emoji+punctuation composited into art).

## Expressive Concepts

- `libs.search.expressiveconcepts.BlocklistManager` + `libexpressive_concepts_model_less_predictor_jni_native.so` + `expressive_concepts{,_blocklist}` + `enable_expressive_concept_model`, `enable_expressive_concept_triggering_engine` + `crank.expressiveconcept{,triggering}.*` — a **model that predicts expressive concepts** (moods/intents like "birthday", "congrats") to trigger richer content suggestions; includes a blocklist.
- `enable_triggering_model`, `enable_tflite_triggering_model*` — when to fire expression candidates.

## Emojify

- `libs.expression.emojify.impl.EmojifyModelApi` + `emojify-jni` + `enable_emojify_model`, `enable_emojify_model_language_tags`, `enable_emojify_language_tags`, `enable_emojify_settings_option`, `enable_emojify_shortcut_when_followed_by_emoji` — **"Emojify"**: replace/augment text with emoji on demand (a settings option + model).

## History & recents

- `expression.history`, `enable_extended_clipboard_history`, `enable_prioritize_recent_gifs` — recents feed the top of each surface.
