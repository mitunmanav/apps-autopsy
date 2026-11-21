# Screen Map

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

Compose UI: screens are composable destinations behind the manifest activities. Mapping below is `[inf]` from activity→composable wiring + string/resources, with `[obs]` anchors.

| Screen | Host | Evidence |
|---|---|---|
| Home / library list (documents, tool groups) | `HomeActivity` | `v4a.d` groups → `e17`/`a5a` list items `[obs]` |
| File picker / intake | `ToolFlowActivity` | SAF + VIEW/SEND intent handling `[obs]` |
| Tool progress ("Compressing…/Converting…/Merging…") | `ToolFlowActivity` | `gl5` composable block, `tool_result_action_in_progress_*` strings `[obs]` |
| Tool result (done/error, save/share actions) | `ToolFlowActivity` | `ao2`/`kn2`/`jm2` results; `bn4.j` surface `[obs]` |
| PDF viewer / read mode | `EditorActivity` (viewer config) | `f4a`/`g4a` tools, `reflow.js` `[obs/inf]` |
| Editor: annotate | `EditorActivity` | PDFTron tools host + `b4a` `[inf]` |
| Editor: sign | `EditorActivity` | `c4a` `[inf]` |
| Organize pages (reorder/delete/rotate/add) | `EditorActivity` or ToolFlow sub-screen | `o4a` group tools `[inf]` |
| Scanner (camera, edge detect, crop) | `ScannerActivity` | CameraX + ORT model `[obs]` |
| Paywall | `PaywallActivity` | Billing client + `b5a` states `[obs]` |
| Sign-in / authorization | `AuthorizationActivity`, `ExternalBrowserAuthActivity` | Credential Manager + Keycloak custom tab `[obs]` |
| Account management | `AccountManagementActivity` | `[obs]` |
| App settings / notifications prefs | `HomeActivity` sub-screen | `free_task_notifications_enabled` pref UI `[inf]` |
| Onboarding/first-run | `HomeActivity`/`App` | startup flow `[partial]` |

## Coverage

Compose destinations lack manifest entries, so the exact route table is `[partial]` — inferred from composable call sites, tool groups, and flow-state classes (`on2`/`mn2`/`jt2`/`ht2`/`it2` states observed in `gl5`).
