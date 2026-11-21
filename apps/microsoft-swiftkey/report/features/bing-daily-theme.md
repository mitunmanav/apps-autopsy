# Bing daily theme

Evidence: `bing_theme_*` strings (28), `com.touchtype.keyboard.theme.bing.*` (26 obfuscated classes), `bing_daily_*` banner assets, `bing_app_promotion_*`.

## What it is

A theme that auto-refreshes from **Bing's daily image** — your keyboard gets a new Bing wallpaper theme every day.

## UX

- `bing_theme_daily` "Daily Bing", `bing_theme_powered_by` "Bing powered theme for SwiftKey".
- Browse/apply: `bing_theme_apply`/`download`/`downloaded`/`next`/`previous` (+content descriptions), `bing_theme_loading` "Preparing preview…", `bing_theme_preview`, `bing_theme_working` "Saving theme…".
- Image info: `bing_theme_image_information[_today]` "Discover more about this image" → opens Bing image info (error → install a browser).
- **Notifications opt-in**: `bing_theme_notify_me`/`bing_theme_notify_description` "Get notified about daily theme refreshes"; `bing_daily_notice_title` "New Bing Image of the Day" push/notification.
- `bing_theme_saved_explanation` — Download keeps a fixed copy in "Yours"; keyboard only changes on Apply.
- Errors: `bing_theme_error` (theme unchanged), `bing_theme_unavailable`.
- Explore actions: `bing_theme_explore_image`/`explore_today`.
- `bing_app_promotion_wallpapers_*` — cross-sells Bing app wallpapers ("A new look for your device, every day").

## Implementation

`com.touchtype.keyboard.theme.bing.*` — 26 classes (fetch daily image → synthesize a theme from image palette → apply/notify). Featured banner `bing_daily_*` images promote it in the theme gallery.
