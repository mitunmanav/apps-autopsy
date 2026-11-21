# Feature: AI-assisted descriptions & entity extraction

## SmartDescription — AI file descriptions

- `htv` state class: `SmartDescriptionState(isEnabled=…, isNoticeShown=…)`
  — a per-file "smart description" surface with an enablement gate and a
  one-time notice.
- Peers `hpt`, `igk`, `hvi` participate in the state/render path.
- Description content likely comes from the bundled OCR pipeline
  (`taser`/`GOCR`/layout models — see `document-scanner.md`) + on-device
  document understanding, not a cloud LLM (no LLM endpoint strings found).

## Structured entity extraction — `ffz`

A `wzh`/`xge` spec table ships **regex-based address/entity extraction**:

- `streetAddress`: `apt|flat|suite|room (number|num|no)`, `street`, `house.?name`,
  `(shipping|billing) address`…
- `dependentLocality`: `area|locality|colony|sector|village|district|
  neighbo(u)rhood`
- `addressLocality`: `city|town|suburb` · `addressRegion`: `state|region|
  province|county`
- `addressCountry`: `country|nation` · `postalCode`: `post.*code|(pin|zip).?code`
- `postalAddress`: full-address patterns; `aptNumber` sub-pattern.

⇒ a structured-form parser (mail/address block extraction from
scanned/received documents) — feeds smart-description cards & possibly
fill-form suggestions.

## OCR consumption

Bundled models (document detection, taser detector, GOCR Latin recognizer,
script-ID, layout) power text extraction for descriptions + entity regexes
above; `libimageutilsjni` supports image conditioning.

## Evidence

`htv`/`hpt`/`igk`/`hvi` classes, `ffz` regex table, `assets/` model list,
`is_gemini_display_logged` (adjacent AI surface).

## Unknowns

- Whether descriptions are generated on-demand or indexed into AppSearch
  (probably both, via `smart-search.md` donation).
- Which model produces the summary prose (script/layout models suggest
  template-based summaries, not generative).
