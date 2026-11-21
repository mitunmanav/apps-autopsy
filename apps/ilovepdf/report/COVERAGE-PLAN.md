# What "A to Z" means — coverage definition, prompt, and proof

## 1. The exhaustive coverage space (definition of "literally everything")

An APK reverse analysis is "A→Z complete" iff ALL of these dimensions are
documented, each with class/method-level "how it works" evidence:

| # | Dimension | Complete means |
|---|---|---|
| 1 | Artifact | package, versionName/Code, SDK levels, SHA-256, splits, signing schemes, cert, sizes |
| 2 | Manifest | EVERY activity/service/receiver/provider, every intent-filter action+mime+scheme, metadata, permissions, exported flags |
| 3 | Screens | every screen (Activity, Fragment, Compose), grouped by package, each mapped to its feature |
| 4 | Navigation | every nav graph, tool→graph routing table, global flow, EVERY deep link, share targets, widget entries |
| 5 | Features | EVERY user-facing tool & module: name, UI entry, options/params, execution engine, I/O, limits |
| 6 | Execution | local engines (native JNI, SDK processors) AND remote pipeline (auth→start→upload→process→download) with exact classes |
| 7 | Native | every .so inventoried, JNI bridge methods, exported symbols, result codes |
| 8 | SDKs | every third-party SDK: purpose, key classes, where used |
| 9 | Data | Room entities, DataStore, file layout, queues, workers |
| 10 | Network | every endpoint, auth flow, request/response models, cleartext rules |
| 11 | Monetization | billing managers (all stores), premium flags, free-tier counters |
| 12 | Integrations | login providers, cloud providers, SSO callbacks, hardware keys |
| 13 | Classification | offline vs online count for every feature |
| 14 | Provenance | every claim cites THIS artifact's digest; zero foreign-APK data |
| 15 | Unknowns | explicit ledger of what static analysis cannot prove |

## 2. Generic reusable prompt

> Reverse-engineer the APK at <APK_PATH> exhaustively, A to Z — nothing missed.
> Produce a structured Markdown report in <APK_DIR>/report/:
>
> - `README.md` index: artifact identity (package, version, SHA-256), method,
>   counts, and links to every file.
> - `platform/NN-*.md`: manifest & every component; architecture; native libs &
>   JNI bridge; every third-party SDK; permissions & security config;
>   persistence (Room/DataStore/files); every network endpoint & API flow;
>   end-to-end data-processing pipeline; offline/online feature
>   classification; a limitations file; a coverage-ledger file; a complete
>   screen map; a complete navigation map (nav graphs + deep links).
> - `tools/<feature>.md`: ONE file per user-facing tool. For each: UI entry
>   (activity/fragment/nav graph), params model, execution path (local engine
>   with exact JNI/SDK calls OR remote API task with endpoint sequence),
>   premium/offline flags, input→output flow. HOW it is implemented, not just
>   what it is.
> - `features/<module>.md`: ONE file per app module (home, scanner, file
>   manager, cloud, accounts, billing, readers, widgets, intents, settings,
>   analytics, support, background services, etc.) — same "how it works" depth.
>
> Rules: analyze ONLY this artifact — stamp its package+SHA-256 on every file
> and never cite another APK. Static analysis only: mark every claim as
> observation/inference/unknown; never claim runtime behavior. Do not infer
> features from filenames/strings alone — corroborate with classes, methods,
> references, resources. Use decompilation tooling (JADX/REA) for method-level
> evidence; document any tool failure and its coverage impact. Finish with the
> verification checklist and report its real numbers.

## 3. Proof / self-verification (run these, print the numbers)

| Check | Method | Pass criterion | This report |
|---|---|---|---|
| Components | count `<activity|service|receiver|provider` in decoded manifest vs listed in screen map | all names present | 75/23/18/9 — 0 missing |
| Tools | `Tools` sealed-class constants vs `tools/*.md` | count equal | 27 = 27 |
| Features | feature packages (manifest+code) vs `features/*.md` | count equal | 20 = 20 |
| Nav graphs | `R.navigation.*` refs in decompiled code vs navigation map | 0 missing | 21/21, 0 missing |
| Provenance | every `.md` contains artifact name/digest | 0 files lacking | 0 lacking |
| Contamination | grep report for other APK names/paths | 0 hits | 0 hits |
| Ledger | every question has ✔/~ /✘ status | no unlisted questions | platform/11 |
| Unknowns | limitations file exists, bounds stated | present | platform/09 |
