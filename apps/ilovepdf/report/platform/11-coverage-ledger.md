> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e1…ad41`. Static analysis; no runtime evidence.

# 11 — Coverage ledger (REA checklist closeout)

Every question → evidence file → status. `✔` answered (static evidence),
`~` partially answered (bounds noted), `✘` unresolved (needs runtime/source).

## Artifact & platform
| Question | Answer location | Status |
|---|---|---|
| Identity/signing/splits | platform/00 | ✔ |
| All 125 manifest components & filters | platform/01 + components-table | ✔ |
| Permissions/security config | platform/05 | ✔ |
| Native libs & JNI bridge | platform/03 | ~ (k1 internals unknown) |
| Architecture/engines/DI | platform/02 | ✔ |
| API surface & task lifecycle | platform/07 | ~ (server side inferred) |
| Room schema/workers/prefs | platform/06 | ✔ |
| Data processing pipeline | platform/08 | ✔ |
| Offline/online classification | platform/10 | ✔ |

## 27 tools — each has `tools/<name>.md` (UI, params, engine, I/O)
merge, split, rotate, protect, unlock, repair, image-to-pdf, ocr, ocr-pdf,
create-pdf, compress, organize, annotate, sign, watermark, page-numbers,
pdf-to-image, pdf-to-word, pdf-to-excel, pdf-to-powerpoint, word-to-pdf,
powerpoint-to-pdf, excel-to-pdf, compress-image, convert-to-jpg,
convert-from-jpg, resize-image — all ✔ static; engine-internals ~
(K1/Nutrient native code not decompiled).

## 20 app modules — each has `features/<name>.md`
home-tools, scanner, companion-scanner, file-manager, cloud-providers,
accounts-auth (+OTP), premium-billing, pdf-reader, image-viewer-editor,
widgets, intents-sharing, settings, analytics-onboarding, support-helpdesk,
background-workers, qr-codes, downloads, language-i18n, crash-handling,
promo-news — all ✔ static.

## Unresolved (bounded negatives)
- Exact control flow inside ~191 JADX-failed coroutine bodies — decompiler
  limit; signatures/metadata used instead.
- k1_sdk algorithm internals, JNI registration tables, pspdfkit native core.
- Remote Config flag values at runtime; server-side processing.
- Whether `Unlock`/`CreatePdf` default to local vs remote at runtime
  (local tasks exist; `offlineSupport` flag null — documented per-file).
- Feature implied by strings with no found caller (dead code vs
  remote-driven) — flagged where relevant.
