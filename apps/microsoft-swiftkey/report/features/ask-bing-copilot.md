# Ask Bing / Copilot

Evidence: `com.touchtype.bing.askbing.AskBingActivity` (+`AskBingAlias`), `assets/bing_hub/*`, `js-bridge.js`, `bing_chat_temp.html`, `bing_*` strings (71), PROCESS_TEXT intent filter, `cm_copilot` coachmark, `copilot.upsell.chip.CopilotUpsellActionChipConfiguration`.

## Entry points

- **PROCESS_TEXT alias**: `com.touchtype.AskBingAlias` — exported `android.intent.action.PROCESS_TEXT` `text/plain` → "Ask Copilot" appears in any app's selected-text context menu.
- Toolbar Copilot chip (`cm_copilot` — "Tap here to ask Copilot for help when you need it"), Copilot upsell action chip (BiBo `CopilotUpsellActionChipConfiguration`), emoji-panel "Get the Copilot app" upsell → `copilot.microsoft.com/?FORM=SWTACW` / Play `com.microsoft.bing`.
- `com.touchtype.bing.askbing.AskBingActivity` — the chat surface.

## Architecture

- **WebView-hosted Bing chat**: `assets/bing_chat_temp.html` + `assets/bing_hub/` (local error pages: `error_not_found.html`, `error_no_network.html`, `error_server_fault.html`, `error_loading_fault.html`) + `bing_override_clipboard_behaviour.js` — JS override that injects Bing chat's copy/paste integration with SwiftKey's clipboard.
- `assets/js-bridge.js` — the JavaScript bridge between Bing web content and native (insert text into field, copy to clipboard, share).
- Sign-in via `bing.com/fd/auth/signin/v2?action=header` inside the web surface.
- Errors: `bing_generic_error`, `bing_limit_reached_error` (daily cap), `bing_not_signed_in_daily_limit_exceeded` — anonymous quota → forces sign-in.

## Copilot upsell paths

`emoji_panel_copilot_upsell_*` (banner "Get the Copilot app"), `bing_app_promotion_*` (Get Bing App / rewards / wallpapers / "AI powered search answers" cards; `bing.go.link/jAyDK` referral link; `bing.com/rewards/panelflyout?partnerid=swiftkey`).

## Consent & limits

- `bing_feature_consent_message` + `bing_features_consent_accepted` pref; Terms/Privacy links (`go.microsoft.com/fwlink` ids 2245947/2258933).
- Range limits: `bing_out_of_range_error` / `bing_out_of_word_range_error` — min/max chars/words per request.
- `bing_unsupported_language_error` — English-only features noted.
