# Website Blocking

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Module:** `feature_block_website` · **Evidence:** OBS

## What it is
Blocks websites/categories inside any browser via accessibility address-bar scraping; server-assisted domain→category classification.

## UI entry (OBS)
`block_website`/`block_website_setting`/`b_w_overlay`; `BWOrigin` nav arg.

## Params model (OBS)
`BlockedWebsiteConfig` (domains, schedules, per-browser), `BWDetails`, `BlockedDomainDetails`, `BWDomainUIModel`; remote DTOs `BWUrlsDto`, `BWCategoryDto`, `BWSearchResultDto`.

## Execution path (OBS)
1. Configure domains or pick categories → `BlockWebsiteDatabase`; search assisted by `GET /wb/get_website_search_recommendations`, category via `GET /wb/get_website_category`.
2. Accessibility service (`trackDomainChange`, `getForegroundAppType`, `closeCurrentTab`, `handleBrowserTabs`) reads the URL bar of the foreground browser per event.
3. Match → `ContentBlockWindowFactory`/`b_w_overlay` overlay + `performBackPress`/`closeCurrentTab` kills the tab.

## Data flow
Domain list → DB → URL scrape → match → overlay/tab-kill → usage event.

## Premium/offline (OBS)
Local block list works offline; category lookup + recommendations need `api.regainapp.ai/wb/*`. Category bulk-blocking INF premium.
