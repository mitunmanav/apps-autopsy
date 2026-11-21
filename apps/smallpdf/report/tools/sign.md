# Tool: Sign PDF

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

- Descriptor `c4a.X`: id `"sign"`, icon `tool_sign_32`, label `tool_edit_sign`, files `1..1`, group `d4a` `[obs]`.
- Deep links: `/sign-pdf`, `?tool=sign-pdf`; e-sign widget `[obs]`.
- Execution `[inf]`: **local** — signature capture UI + PDFTron ink/stamp placement (`EditorActivity`). Remote `SIGN`/`SIGTRACE`/`AUDIT_TRAIL` types exist for the e-sign service flow `[partial]` — whether the in-app "Sign" posts a remote `SIGN` task could not be fully established statically.
- Premium `[inf]`: free-task gated.
- Input→output: PDF → drawn/stored signature → flattened signed PDF → save/share.
