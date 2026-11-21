# AI creation — Bing Image Creator & AI stickers

## Feedback form

`materialsettingsx.BingImageCreatorFeedbackFormFragment` — a dedicated **feedback form** for Bing Image Creator lives inside settings (report/rate generated images).

Evidence: `bing_image_creator_*` strings, `sticker_generation_*` strings, `BingImageCreatorParametersModel`, `camera_remix.json`, `emoji_panel_copilot_upsell_*`, `rich_content_section_ai_images`, `bing_service_agreement`/terms URLs.

## Bing Image Creator

- Entry: toolbar "Bing image creator" + emoji-panel Copilot upsell; web surface at `https://www.bing.com/images/create/ai-image-generator?partner=swftkey&FORM=bicswk` (+ template variants like `…/template/new-year-doodle`, `anime-style` for camera remix).
- Auth: `https://www.bing.com/fd/auth/signin`, `…/signin/v2?action=header` — Bing-side sign-in flow inside WebView/custom tab.
- Guard rails/errors: `bing_image_creator_blocked_prompt_error` (content policy block), `language_not_supported`, `too_many_requests`, `unsupported_region`, `user_banned`, `bing_limit_reached_error` (daily cap), `bing_not_signed_in_daily_limit_exceeded` (anon cap → sign-in).
- Referral: `app_referral_text_message_bing_image_creator` — share-SwiftKey onboarding to "receive images created by your friends".
- Achievements track creations (`achievement_card_images_created`).

## AI sticker generation

- `sticker_generation_*`: prompt box "Describe a sticker to create"; loading "Your stickers are being created by AI"; example prompts (cactus dancing pixel art, carrot sunbathing, chicken in top hat, cycling panda, dog with flowers claymation, roller-skating raccoon, t-rex drinking tea, unicorn cake, vegetables listening to music, bored walrus).
- **History** vs **Saved** sections: generated stickers list; press-and-hold to save (persist) or delete.
- Referral string `sticker_generation_app_referral_onboarding_title`.
- Backend is Bing Image Creator family (shared consent/terms: `bing_feature_consent_message`, `bing_terms_of_use`, `bing_service_agreement`, `bing_learn_more_url`).

## Consent & policy

`bing_feature_consent_message` — "By continuing you agree to the Terms of Use and confirm you have read our Privacy Statement…"; `bing_feature_title` "Copilot, %1$s and Bing powered by AI"; RAI guard: `improve_rai_error`, `bing_query_disclaimer_error`, `bing_response_disclaimer_error`, `bing_server_disclaimer_error` (harmful-content rewrite refusals).
