# Rich content panel (unified media search)

Evidence: `rich_content_*` strings (25), `rich_content_emoji_panel.xml`, `rich_content_gif_panel.xml`, `rich_content_sticker_panel.xml`, `com.swiftkey.richcontent.imagepanel.database.RichContentDatabase`, `toolbar_rich_media_panel_caption`.

## What it is

A unified media surface in the toolbar ("Rich media") with an **"All" tab** that searches across every content type at once: `rich_content_all_search_hint` — "Search emoji, stickers, GIFs and images".

## Sections (`rich_content_section_*`)

- `ai_images` — "AI images" (Bing Image Creator results)
- `camera` — Camera
- `emoji` — Emoji
- `gif` — GIF
- `image` — "Web images" (Bing image search; `rich_content_all_show_all_images` "See more web images on Bing")
- `stickers` — Stickers
- `show_all` — "Show all %1$s" per-section drill-down
- `recents` — unified recents across types (`rich_content_panel_recents_caption`)

## Creation shortcuts

`rich_content_all_create_image` / `…_create_sticker` — jump into AI creation flows from search.

## Storage

`RichContentDatabase` (Room) + `RichContentDatabase_Impl` — recents/saved image-panel items; `imagepanel` package.

## Feedback & moderation

Per-item `Leave feedback` and `Delete` actions (`rich_content_image_panel_item_*`); upsell dialog `rich_content_upsell_dialog_title` "Transform ideas into reality with AI creations".
