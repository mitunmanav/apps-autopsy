# Emoji

Evidence: `emoji_*` strings (37), `emoji_*.xml` layouts, `com.touchtype.keyboard.view.richcontent.emoji.*`, `emoji_search/*.lm` models in `lp.zip`, `prefsx_emoji_screen.xml`.

## Panel

- `rich_content_emoji_panel.xml`, `EmojiRecyclerView`, `emoji_page_container.xml`, `emoji_recycler_view_container.xml` — emoji grid panel.
- Categories (`emoji_category_*`): Smileys & people, Animals & nature, Food & drink, Activities, Travel & places, Objects, Symbols, Flags, Emoticons.
- Recents (`emoji_panel_no_recents_message`), variant selector (`emoji_variant_selector.xml` + long-press for skin-tone/gender variants; `emoji_button_tap_and_hold_description`).
- **Search**: `emoji_search_box_edit_text_hint` "Search emojis" + dedicated search models in language packs (`emoji_search/<locale>_emoji_search.lm` + `_flags.lm`) — on-device emoji keyword search.
- Font choice (`prefsx_emoji_screen.xml`): `emoji_font_preference_system_font_title` "%1$s Default Emoji" vs `emoji_font_preference_google_noto_font_title` "Latest Google Emoji" — downloadable Google Noto emoji font.
- `emoji_warm_welcome_title` — new-emoji announcement surface.

## Predictions

- `emoji_prediction_layout.xml`, `EmojiPredictionCaption`, `emoji_predictions_coachmark` — emoji predicted on the candidate bar from typed text; models: `emoji_bg_c.lm2`, `emoji_intercept.bin`, `emoji_coefficients.zlib` (per-language).
- `emoji_variant_selector_remove_prediction_*` — remove emoji from predictions.
- `emoji_magic_caption` "Quick emoji" — quick-emoji mode.
- `containsEmoji`/`emojiExpansion`/`emojiCompat`/`emojiVariantModel` — emoji detection, expansion, compat fallback, variant data in code.

## Copilot upsell + ads

- `emoji_panel_copilot_upsell_banner.xml` — "Get the Copilot app — It's the easiest way to create images on your phone" banner inside emoji panel.
- `emoji_ads_xandr_dynamic_module_title` + `emojipanelbannerad.EmojiPanelBannerAdConfiguration` + `view.richcontent.emoji.ads.EmojiNativeAdProvider` — Xandr native ads injected into the emoji panel (see `ads.md`).

## Quick access

Dedicated emoji key pref (`pref_dedicated_emoji_key`), emoji as adaptive enter-key state (`ime_go_key_smiley_state`), long-press emoji variants.
