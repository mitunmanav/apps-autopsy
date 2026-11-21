# Stickers, GIF & Tenor

## Stickers

- `libs.search.sticker.*` — sticker search keyboard; `StickerPacksManagementActivity`, `StickerFavoritePacksReorderActivity` — pack management + favorites reorder.
- `libs.expression.sticker.*` — sticker insertion.
- `enable_header_featured_pack`, `enable_browse_featured_pack`, `enable_sticker_share_usage_histogram` — featured packs + usage metrics.
- WebP decode: `libraries.inputmethod.webp.*` + `jni_webp`.
- `ImageFeedbackActivity` — sticker/image feedback flow.

## Custom & photo stickers (Creative Assistant / Pixel Studio)

- `libs.search.customsticker.ui.CustomStickerTabKeyboard` + `enable_custom_sticker_tab`, `enable_custom_sticker_tab_loading_indicator` — **Custom Sticker tab** (AI-made stickers, e.g. Pixel Studio).
- `allow_u18_for_custom_sticker` — under-18 gating.
- `enable_custom_sticker_lol_fix`, `enable_custom_sticker_naive_prompt_expander` — prompt expansion + fixes.
- `enable_my_stickers_option_for_expression_candidates` — "My stickers" in candidates.
- Queries `com.google.android.apps.pixel.creativeassistant` — Pixel Creative Assistant app is the sticker generator; "Sticker can be deleted in Pixel Studio"; "Photo sticker" + `READ_MEDIA_*` — make stickers from photos.
- `libs.expression.image.storage.*` + `enable_image_file_database_backup` — sticker DB + backup.

## GIF / Tenor

- `libs.search.gif.*` — GIF search keyboard ("Search for GIFs", "Failed to fetch GIFs").
- `enable_tenor_trending_categories`, `enable_tenor_trending_gifs`, `enable_tenor_trending_term_v2_for_language_tags` — **Tenor** (Google's GIF service) trending terms/categories, v2 locale-aware terms.
- `enable_custom_gif_categories`, `enable_gif_peer`, `enable_prioritize_recent_gifs`, `enable_contextual_gif_search_query_suggestion` — categories, share-sheet GIF peer, recents, contextual query suggestions.
- `split_tenoranimation_feature_split` → `libtenoranimation_jni.so` + `NativeLibHelper.c("tenoranimation_jni")` + `libs.expression.tenoranimation` — **Tenor animated-image codec as an on-demand feature split** (animated WebP/APNG rendering).
- `enable_animated_emoji_content_suggestions`, `enable_add_punctuation_into_{prod_,}dynamic_art_sticker` — animated suggestions.

## Emoticons

- `libs.search.emoticon.*` — emoticon keyboard ("Emoticon keyboard", "Recent Emoticons"); `use_non_breaking_emoticon`.

## Notes

GIF/sticker content is network-backed (INTERNET) via Tenor; the tenoranimation split delivers the decoder. Stickers merge pack stores, custom/AI stickers, and Emoji Kitchen output in one expression surface (`expression.contentcache`, `enable_expression_content_cache`).
