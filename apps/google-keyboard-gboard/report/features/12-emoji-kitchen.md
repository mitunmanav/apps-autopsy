# Emoji Kitchen (mashup stickers)

## What it is

Combine two emoji into a mashup sticker — browse, search, and get proactive suggestions. Uses on-device similarity search (**SCAM**) and **Gemma embeddings** for ranking.

## Evidence

- `libs.search.emojikitchenbrowse.{EmojiKitchenBrowseKeyboard, EmojiKitchenBrowseKeyboardTablet, EmojiKitchenBrowseSearchKeyboard}` — dedicated Emoji Kitchen browse/search keyboards (phone + tablet layouts); `enable_emoji_kitchen_browse_entry_point_v2`, `enable_transition_between_emoji_and_emoji_kitchen_browse{,_in_tablet}`.
- `libs.search.emojikitchenranker.EmojiKitchenRankerJni` + `emojikitchen-ranker-jni` — native ranking; `enable_gemma_embedding_emoji_kitchen_ranker` — **Gemma embedding ranker**.
- **SCAM engine**: `com.google.research.scam.android.{Partitioner, Scorer, InMemoryPartition, InMemoryFloatPartition, InMemoryUint8Partition}` + `libscam_{partition,partitioner,scorer}.so` + `DelegatedPartitionLoader` (`libraries/inputmethod/ondevicescam`) — `EmojiKitchenOnDeviceScamEngine{Impl}`: `Initialize`, `FindNearestNeighbors`, `SimilarityScorer`, `EmojiKitchenScamIndexData downloaded` — **on-device nearest-neighbor index for mashup discovery** (`enable_emoji_kitchen_scam_index`). SCAM = Google's on-device similarity-search library (partitions + scorer over float/uint8 indexes).
- `contentsuggestion.contentfetcher.sqlite.{EmojiKitchenDatabase, EmojiKitchenDatabase_Impl, EmojiKitchenDataCleanupWorker}` — a Room SQLite DB of kitchen combinations, with a cleanup worker.
- **Proactive Emoji Kitchen**: `enable_proactive_emoji_kitchen`, `enable_blocklist_for_proactive_emoji_kitchen`, `enable_debug_toast_for_proactive_emoji_kitchen`, `enable_expression_moment_proactive_emoji_kitchen_language_tags`, `show_contextual_emoji_kitchen_in_expression_moment`, `show_emoji_kitchen_mix_in_expression_moment`, `enable_handle_expression_moment_standard_emoji_kitchen`, `enable_play_emoji_kitchen_mix_animation` — mashups suggested inline while typing ("Emoji Kitchen stickers available", "Tap to browse emoji kitchen").
- **Search**: `enable_emoji_kitchen_for_zero_state_emojis`, `disable_refresh_in_result_page_emoji_kitchen_browse_search`, `enable_fallback_for_emoji_kitchen_{gemma_search_engine,search_server}_error`, text/emoji query ("Search Emoji Kitchen with text or emoji").
- `enable_emoji_kitchen_scaling`, `enable_sequential_super_icon_render_jobs` — render/scale tuning.
- Strings: favorites, recents ("You haven't shared any stickers yet"), combos naming ("Emoji Kitchen sticker for %1$s emoji and %2$s emoji").

## Notes

Hybrid retrieval: local SQLite combo DB + SCAM similarity index + Gemma embedding ranker, with server fallback and per-language-tag gating. The "super icon" (`enable_super_icon_*`) renders mashups as animated icons in the suggestion bar.
