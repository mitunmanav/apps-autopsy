# 19 — Onboarding, permissions & language

## Flow

`Splash_Screen` (LAUNCHER; `onCreate` is **Pairip VM-protected**) → `LanguageSelectionActivity` (first run) → `OnBoardingActivity` (`IS_SHOW_ONBOARDING`) → `Permission_Activity` (`all-permisiion_access` key [sic]) → `CameraActivity`.

Native ads embedded in onboarding (`ONBOARDING_NATIVE`), permission (`PERMISSION_BANNER`), language (`LANGUAGE_*`) screens. `click_drive_promo_notif` / `auto_connect_drive` intent extras deep-link from notifications.

## Languages (19)

`model.LanguageItem` list in `LanguageSelectionActivity` — 19 `new LanguageItem(...)` entries: English(default) + Hindi, Kannada, Tamil, Marathi, Gujarati, Bengali (type-2 group) and Indonesian, Vietnamese, Thai, Portuguese, Russian, French, Korean, German, Chinese, Italian, Spanish, Malay (type-0). `selected_language`, `language_pos`, `language_count` keys; per-language analytics events (see 18).

## Permissions rationale

Runtime-request flow strings (camera, location, media, mic, notifications); `IS_VISIT_STORAGE`, SAF SD-card prompt (`saf_gmc_uri`, `IS_SDCARD_PERMISSION*`).
