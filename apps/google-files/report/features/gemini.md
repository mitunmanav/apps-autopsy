# Feature: Gemini — "Ask Gemini" PDF Q&A

## Integration shape

- `jld` — bottom-sheet peer (`extends jkz implements rri, sfl`) hosting the
  Ask-Gemini surface inside PDF preview; siblings `jlg`,`jov`,`jot`,`jou`.
- Entry: `gemini_button` FAB in `pdf_preview_item_host_fragment.xml`.
- Session state: `session_id` saved/restored across config changes
  (`h()`/`k(Bundle)`), `is_pdf_locked` gates availability.
- Telemetry: `is_gemini_display_logged` pref — display event logging.
- Help: `https://support.google.com/gemini/answer/13594961?rd=1#files` (`hpa`)
  — Google's "Ask Gemini about PDFs in Files" support article.

## What it is / isn't

- **Not** an on-device model — the APK ships no Gemini weights; the sheet is a
  bridge into system Gemini (assistant surface) carrying the PDF context.
  The model executes outside this APK (Google app / Gemini app / server).
- Gated by locked-PDF state; likely feature-flagged + device-capability gated
  (exact flag name not located — `vxs` has no explicit gemini flag; may ride
  the Gemini app's own capability check).

## Evidence

`jld` decompile (session/lock state), `gemini_button` layout id, support URL
string, log pref.

## Unknowns

- Exact IPC to Gemini (app-search `digitalDocument` donation may carry the PDF;
  or `ACTION`/assist-context handoff).
- Server-side doc handling — out of APK scope entirely.
