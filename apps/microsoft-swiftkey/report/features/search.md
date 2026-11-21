# In-keyboard search (Bing)

Evidence: `bing_recommender_*`, `bing_suggestions_bar_*`, `toolbar_search_*`, `cm_search`, `com.swiftkey.web.search.autosuggest.*` (SuggestionLayout, UserHistoryDatabase), `web_search/` assets, `BingSuggestionsBarConfiguration`, `BingGrowthModel.*`.

## Features

- **Bing Search toolbar item** (`toolbar_search_caption` "Bing Search", `toolbar_search_coach_mark` "Try Copilot Search") — opens a web-search surface in the keyboard (`web_search/` error pages, `search_suggestion.xml`).
- **Autosuggest webview**: `bing_suggestions_bar_webview_url` = `https://services.bingapis.com/swiftkeyautosuggest/autosuggest.html` — Bing-hosted autosuggest UI rendered in a WebView; setting `pref_bing_suggestions_bar_enabled` "Enable Microsoft search recommendations"; config `bibomodels.bingsuggestionsbar.BingSuggestionsBarConfiguration`.
- **Search history**: `com.swiftkey.web.search.autosuggest.data.history.database.UserHistoryDatabase` (Room) — local search-history store; `bing_recommender_history_enabled_preference_*` toggle + `bing_recommender_clear_history_*` (clear-history dialog, "%1$s history" where %1$s is branded "Microsoft Copilot Search" — `bing_recommender_deep_search_title`).
- **Compact mode**: `bing_recommender_compact_mode_dialog_*` — "%1$s has a compact mode that takes less space on your screen" experiment.
- Coachmark `cm_search` — "Search the web quickly straight from your chat".

## Bing surfaces used

`bing.com/search?`, `bing.com/images/search?`, `bing.com/maps/?` (Bing Maps `bing_maps_title_short`), `bing.com/api/swiftkey/`, `bing.com/copilotsearch?` (Copilot search), `bing.com/DefaultSearchEngine/swiftkey` — set-Bing-as-default funnel.

## BingGrowthModel (BiBo)

Growth experiments: `SearchCandidate`, `ContextMenuAction`, `ClipboardTextSearch`, `ClipboardImageSearch`, `QuickPasteTextSearch`, `QuickPasteImageSearch` — search suggestions contextual to clipboard content ("quick paste" + "search what you copied").
