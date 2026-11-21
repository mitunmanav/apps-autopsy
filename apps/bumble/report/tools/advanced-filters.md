# Tool: Advanced Filters

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

- **UI entry** [obs]: search-settings screens (`settings2`), `SERVER_GET_SEARCH_SETTINGS`, `SERVER_SAVE_SEARCH_SETTINGS`, `FiltersApi` B4F (no `SERVER_GET_FILTERS` verb); `FilterCardListComponent` discovery model
- **Param model** [obs]: filter set = height/age/habits/intent etc. [inf from filter-model fields]; basic set free, advanced set gated [obs premium-filter strings in settings]
- **Execution path** [inf]: filters screen → edit → `SERVER_SAVE_SEARCH_SETTINGS`/`FiltersApi` → next deck respects filters (`SERVER_GET_ENCOUNTERS` carries them)
- **Local vs remote**: filter state server-persisted; deck filtering server-side [inf].
- **Premium/offline**: advanced filters = paid tier [obs gating]; online.
- **Input → output**: criteria → narrower, higher-intent deck.
