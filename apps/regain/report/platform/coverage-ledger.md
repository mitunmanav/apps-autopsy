# Coverage Ledger

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`

## Inventory completeness

| Item | Total | Covered | Method |
|---|---|---|---|
| Declared components | 121 | 121 (inventoried, mapped) | manifest decode `ev_1637201f…` |
| App `ai.blox100` top-level classes | 766 | 766 listed + module-mapped | `search_android_classes` `ev_22aacaf4…` + jadx |
| `ai.regainapp` classes | 23 | 23 | same |
| All classes in APK | 29,572 | inventoried; app classes analyzed, library classes identified by package | jadx + smali |
| Deep-link routes | 165 | 165 extracted | `analysis/deeplinks.txt` |
| Retrofit endpoints | ~70 | ~70 extracted | interface decompiles |
| Strings | ~4,500 | all pages captured | `ev_7950cc0c…` |
| Room databases | 17 | 17 | decompile |
| Feature modules | 37 `feature_*` dirs | 37 files in `features/` | dir inventory |
| Tools/capabilities | 25 | 25 files in `tools/` | route+class+API mapping |
| JNI natives | 13 | 13 mapped (all androidx) | `ev_a2a89ba2…` |
| DEX files | 4 | 4 disassembled (baksmali) + 2 app dexes fully decompiled | `analysis/smali/` |
| Assets | ~880 entries | enumerated; key ones inspected (AICoach.db 732 rows, onboarding JSONs, logback.xml, ob_hammer) | zip + sqlite3 |
| Manifest XML configs | 12 | decoded (`accessibility_service_config`, `device_admin_policies`, `network_security_config`, `backup_rules`, `data_extraction_rules`, `ad_services_config`, `file_paths`, 9× widget `*_info`, `provider_paths`, `locales_config`, `remote_config_defaults`, `ga_services`) | apktool decode |
| Locales | 30+ | enumerated (`locales_config` + values-*) | resources |

## Per-module status

Every `feature_*` package and infra dir has a `features/<module>.md` (OBS-mapped classes, DBs, workers, routes, APIs). Modules with full body-level mechanism confirmation: monitoring-engine, focus-timer, app-limit, block-website, block-shorts, productive-mode, notification-batching, c68, zen-mode, invites, subscription, signin-backup, launcher, widgets, floating-bubbles. Modules documented at signature+route+API level (bodies partially obfuscated): ai-coach (DB proven), creator-mode, service-fixing, in-app-survey, network-logs, regain-api, control-apps, impact-banner, profile-stats, play-store-rating, education-app-notifications (inside `HandleEducationAppNotification`).

## Not claimed

Runtime verification, server internals, RemoteConfig values, paid-SKU catalog, per-call-site Pro matrix, signature authenticity, split-APK contents beyond inventory.
