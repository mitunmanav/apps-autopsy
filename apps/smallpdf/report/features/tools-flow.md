# Feature: Tool Flow Orchestration

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

- `ToolFlowActivity` `[obs]` + `ShareMultipleToolFlowActivity` alias: entry for VIEW/SEND/SEND_MULTIPLE intents (PDFs, images, office docs) and for tools launched internally.
- Flow states `[obs]` (`jt2` sealed: `ht2` progress-ambient, `it2` task-running) drive `in2`/`jn2`/`kn2` composables; in-progress title chosen by group membership (`j3a` compress / `v3a` convert / `l4a` merge / generic) — `gl5`:296-309.
- Commands `[obs]` (`gp2` ops): `vo2` Import, `oo2` Convert(`outputFormat`,`tool`), `po2` Delete, `xo2` Rename, `yo2` ReplaceContent, `fp2` Share, `ep2` SaveToDevice, `bp2` SaveToCloud, `no2` (compress options holder), `wo2`.
- Remote ops → `qs7`/`dk1` runners → `b72.i()` upload + `nu7` task create/poll `[obs]`; results `ao2` errors / `kn2` success surfaces.
- JADX switch-decompile gaps inside intent parsing → a few intent branches `[partial]` (recorded in ledger).
