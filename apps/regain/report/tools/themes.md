# Themes & Language

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Modules:** `feature_user_theme`, `feature_language` · **Evidence:** OBS

## What it is
Unlockable app themes (reward/premium cosmetics) + 30+ language localization.

## UI entry (OBS)
`theme_selection`, `theme_settings`, `language_settings`, `app_language_bs`.

## Params model (OBS)
`UserAvailableTheme`/`UserThemeCategory`/`UserThemesResponse` (remote: `GET /auth/user/get_user_available_themes_without_auth_v1`); `LanguageItem`; `GroupTheme` for focus groups.

## Execution path (OBS)
Theme list fetched (pre-login variant exists) → apply → Compose theme switch; unlocks tied to achievements/subscription (INF); language → `autoStoreLocales` + per-app locale picker → `update_user_locale` API.

## Premium/offline (OBS)
List fetch needs network; applied theme + bundled locales local.
