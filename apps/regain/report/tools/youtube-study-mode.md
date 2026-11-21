# Productive Mode (YouTube study mode + browser whitelist)

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Module:** `feature_productive_mode` · **Evidence:** OBS

## What it is
"Study mode" that leaves YouTube/browsers usable but only allows whitelisted channels, sites, and search keywords — everything else gets blocked with a tag/nudge overlay.

## UI entry (OBS)
`pm_settings`/`pm_allowed_channels`/`pm_allowed_websites`/`pm_allowed_keywords`/`pm_yt_search`; `PMTagOverlayActivity`, `PMFloatingButtonService`, `PMYTOrigin`.

## Params model (OBS)
`ProductiveModeDataBase`: `PMAllowedChannelUIModel`/`PMChannelMetaData`/`YTChannelData` (allowed channels), `PMAllowedWebsites`/`WebsiteMetaData`, `ProductiveModeAllowedKeyWords`/`PMWhitelistedKeywords`, `ProductiveModeTagData`, `PMSuggestedChannel*` (server suggestions), `PMBlockScreenData`, `PMChannelEventData`, `ProductiveModeAppUsage`.

## Execution path (OBS)
1. Add channels via in-app search → `GET /pm/get_yt_search_results_from_regain_api`, `get_yt_channel_meta*` (server-proxied YouTube — no YT API key shipped).
2. Runtime: accessibility service `dumpChannelNameText`/`dumpTitleText`/`dumpVideoText` scrapes the current video's channel/title from the YouTube UI; browser URL scraping via `trackDomainChange`.
3. Whitelist match → allowed; else `PMTagOverlayActivity`/`PMFloatingButtonService` overlay ("tag"/block screen `PMBlockScreenData`) + back/tab-close.
4. Keyword check `isSearchValid`/`isBrowserDomainValid` gates YouTube/browser search.

## Data flow
Whitelist → DB → scrape current channel/URL/keywords → allow or overlay → `PMChannelEventData` usage log.

## Premium/offline (OBS)
Enforcement local; channel search/meta + suggested channels need `/pm/*`. INF premium-gated module.
