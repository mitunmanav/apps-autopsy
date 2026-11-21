# 25 — Resources & Internationalization

Evidence: `ev_13cc3da3…49d31e6d` (decode_android_resources — partial string page: 880 strings, 88 locales), `ev_fec9a360…57e179f` (archive — 2,352 entries; 2,595 decoded files).

## Locales — 88

Full Xiaomi global set: `af am ar as az be bg bn bo bs ca cs da de el en en-AU en-GB en-IN en-rUS es es-ES es-MX et eu fa fi fil fr fr-CA ga gl gu he hi hr hu hy id in is it iw ja jv ka kk km kn ko ku ky lo lt lv mk ml mn mr ms mt my nb ne nl nn or pa pl pt pt-BR pt-PT ro ru si sk sl sq sr sv sw ta te th tl tr uk ur uz vi zh zh-CN zh-HK zh-TW zu` (+ variant qualifiers) — evidence of a true global SKU; `PrivacyKRFragment` for Korea-specific legal text.

## Key resource surfaces

- `res/values*/strings.xml` — 2,000+ strings: category names, cleaner copy (`RF_DalvikCacheLeftovers`=""-style CN-originated ids), settings labels, consent text, FTP/SMB dialogs, WhatsApp status copy, update dialogs.
- `res/xml/`: `file_paths.xml` (FileProvider — manifest meta-data verified), `searchable.xml`, `shortcuts.xml`, `functionindex.xml` (MIME/function map), `network_security_config.xml` (manifest attr verified).
- `res/layout*` — activity/fragment layouts incl. `activity_file_explorer_tab`, `dialog` variants, cleaner result layouts.
- `res/drawable*/mipmap*` — icons incl. category icons, `ic_launcher`.
- `res/raw` — ad SDK blobs, `cand` configs, `kdz`?, fonts; `assets/` — `X-AG-*.crt`, `migd`, `cands`, `terrain`, `worldmap`, `crashanalysis`, `system_image`, `x-metadata.properties`, `functions`, `fonts`, `bspatch`, `audience_network.dex`, `res_merges`, `sensors` configs.

## Notable strings/config

- `app_name`="File Manager"; category labels; `xiaomi_privacy_policy_new`, `eula` URLs; `default_web_client_id`, `firebase_database_url`, `google_storage_bucket`, `gcm_sender_id`, `google_api_key`; ad `APP_KEY/APP_SECRET`; `ACTION_PRIVACY`, `SERVER_CONTROL` actions.
- Cleaner strings carry both EN and CN-origin keys — global build inherits CN feature set.

## Unknowns

- Full string page — only 880 fetched (bounded page); remaining strings retrievable via retained evidence paging if needed.
- `network_security_config.xml` declared in manifest (verified) but literal content not extracted.
- Per-locale completeness (some locales may be partially translated) — not diffed.
