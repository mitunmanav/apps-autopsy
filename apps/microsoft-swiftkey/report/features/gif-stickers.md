# GIFs & sticker packs

Evidence: `gif_*` strings (41), `sticker_*` strings (31), `rich_content_gif_panel.xml`, `rich_content_sticker_panel.xml`, `gif_tile.xml`, `sticker_tile.xml`, `sticker_pack_list_item.xml`, `sticker_promo_banner.xml`, `appconfig/tenor_gifs/`, `gifprovider.*` BiBo models, `KlipyAdFrameLayout`.

## GIFs

- **Providers**: three providers in code — **Tenor** (`tenor-` tag prefixes, `tenor_gifs` config + BiBo `GifProviderApiKeyModel` — API key remotely rotatable), **Klipy** (`api.klipy.com`, `klipy:`/`klipy-` ids, `klipyAnalyticsHelper`, `klipyDataHolder`, Klipy ad frame), **Giphy** (`api.giphy.com`, `giphy_gifs`). Active provider is remotely switchable (`GifProviderModel`).
- Categories (`gif_category_*`): ~30 reaction categories (angry, animals, bored, celebrating, congratulations, cool, embarrassed, food, goodbye, happy, hello, highfive, hugs, hungry, laughing, nature, no, oops, party, random, relieved, sad, scared, shocked, sleepy, sports, thankyou, thumbsup, yes).
- Search + recents; error states (no internet, no recents, no results, generic).
- `rich_content_insertion_not_supported_error_message` — "%1$s doesn't support image insertion here" (some input fields reject GIF commit).
- **Ads**: `com.touchtype.keyboard.view.richcontent.gif.klipy.ads.KlipyAdFrameLayout` — Klipy-native ad slots inside GIF panel.

## Sticker packs

- Downloadable **sticker packs** (`sticker_pack_list_item.xml`, `sticker_gallery_*`): pack gallery, per-pack download with size warning (`sticker_gallery_wifi_dialog_text` — "Downloading %1$s will use %2$s of your data"), re-download anytime, "You've got all the stickers" completion state.
- CDN base: `https://assets.swiftkey.com/stickers/`.
- Recents; animated stickers (`sticker_tile_animated_content_description`).
- `sticker_promo_banner.xml` — promo surface.
- `sticker_collection_migration_upsell_banner_*` — "Our photo sticker tool has been updated… Your starred items have been moved" — photo-sticker feature migrated under the camera icon (see `camera.md`).
- AI sticker generation covered in `ai-creation.md`.
