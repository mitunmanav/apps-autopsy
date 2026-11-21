# Navigation Map

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

## Entry points `[obs]`

```
LAUNCHER (alias …android.Launcher) ──► HomeActivity
https://smallpdf.com/<tool-path>   ──► HomeActivity  (16 verified app links)
VIEW/SEND (pdf, images, office)    ──► ToolFlowActivity
SEND_MULTIPLE                      ──► ShareMultipleToolFlowActivity (alias)
Auth redirect (Keycloak)           ──► ExternalBrowserAuthActivity
Widgets (Glance)                   ──► tool-scoped deep intents → ToolFlowActivity/HomeActivity [inf]
local_notifications NOTIFICATION_ACTION ──► HomeActivity [inf]
```

## Deep-link → tool resolution `[obs]` — `defpackage.zra`

`/compress-pdf`→`h3a.X` · `/merge-pdf`→`l4a.X` · `/edit-pdf`→`b4a.X` · `/sign-pdf`→`c4a.X` · `/scanner`→`y3a.Z` · `/pdf-converter`&`/pdf-to-word`→`o3a.X` · `/pdf-to-excel`→`k3a.X` · `/pdf-to-ppt`→`m3a.X` · `/pdf-to-jpg`→`l3a.X` · `/jpg-to-pdf`→`r3a.X` · `/word-to-pdf`→`t3a.X` · `/excel-to-pdf`→`q3a.X` · `/ppt-to-pdf`→`s3a.X` · `/add-file`→`w3a.X` · `/add-img`→`x3a.Z`.

`defpackage.w00` `[obs]` resolves `?tool=` query slugs (incl. `pdf-ocr`, `compress-pdf`, `merge-pdf`, `pdf-to-word`…) → same objects.

## Internal routing `[inf]`

- `HomeActivity` → `ToolFlowActivity` with chosen `u4a` Parcelable tool → flow VM (`zl`/siblings) → per-tool branch: remote runner (`qs7`→`b72`) or local editor (`EditorActivity`)/scanner (`ScannerActivity`)/file ops (`gp2` commands).
- Exhausted free tasks or premium tap → `PaywallActivity` → Billing flow → success → `AcknowledgeAccountSubscriptionWorker` → `rv6` pro flag.
- Signed-in docs sync via `DocumentStorage*Worker` chain.

## `[unk]`/partial

- Exact NavHost route strings (obfuscated), transition choreography, and deep-link precedence when multiple intent sources collide — partially reconstructed in `ToolFlowActivity` (JADX switch gaps, see ledger).
