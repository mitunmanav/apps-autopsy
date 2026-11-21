# 26 — Analysis Checklist & Confidence Ledger

Legend: ✅ answered · 🟡 partial · ⬜ unresolved

| # | Question | Status | Where |
|---|---|---|---|
| 1 | Package identity & version | ✅ | doc 01 |
| 2 | Signing schemes & signer | ✅ (cryptographic verification ⬜) | doc 01 |
| 3 | Manifest components | ✅ (86 enumerated) | doc 02 |
| 4 | Permission posture | ✅ (grant-status runtime ⬜) | doc 02/23 |
| 5 | App bootstrap/init order | ✅ | doc 03 |
| 6 | Process model | ✅ | doc 03 |
| 7 | Core browsing/ops | 🟡 (operation impl obfuscated) | doc 04 |
| 8 | Category system | ✅ | doc 05 |
| 9 | Volumes/USB OTG | 🟡 (libaums matrix ⬜) | doc 06 |
| 10 | FTP server/client | ✅ (auth default 🟡) | doc 07 |
| 11 | SMB | 🟡 (dialects ⬜) | doc 07 |
| 12 | Cloud drive/OAuth | ✅ (Drive API depth 🟡) | doc 08 |
| 13 | Junk cleaner engines | ✅ (CmEngine AIDL internals 🟡) | doc 09 |
| 14 | Deep clean | ✅ | doc 10 |
| 15 | Private folder | 🟡 (vault dir/cipher ⬜) | doc 11 |
| 16 | Consent/permission onboarding | ✅ | doc 12 |
| 17 | WhatsApp features | 🟡 (paths inferred) | doc 13 |
| 18 | Share/QR/transfer | 🟡 (QR payload ⬜) | doc 14 |
| 19 | Media viewers | 🟡 (gesture set ⬜) | doc 15 |
| 20 | Search/export | 🟡 (export consumer ⬜) | doc 16 |
| 21 | App management | ✅ | doc 16 |
| 22 | Providers/DB/IPC | ✅ (schema 🟡) | doc 17 |
| 23 | Ads (3 stacks + mediation) | ✅ (placements 🟡) | doc 18 |
| 24 | Push/analytics/crash | ✅ (upload dest 🟡) | doc 19 |
| 25 | Self-update/bspatch | ✅ (endpoint literal 🟡) | doc 20 |
| 26 | Network/endpoints | 🟡 (literal hosts partly ⬜) | doc 21 |
| 27 | Native/JNI | ✅ (per-lib exports 🟡) | doc 22 |
| 28 | Security findings | ✅ static | doc 23 |
| 29 | Third-party inventory | 🟡 (versions ⬜) | doc 24 |
| 30 | Resources/i18n | 🟡 (page bounded) | doc 25 |

## Coverage caveats (global)

- **Static only** — nothing executed; all "behavior" is decompiled-code reading.
- **Obfuscation** — significant single-letter renaming in service/controller/util classes; unnamed package → feature attribution is by usage.
- **Dynamic loading** — `audience_network.dex` + reflection not in JADX's static call graph; incoming-reference searches undercount those edges.
- **Endpoint literals** — ad/telemetry/update hosts assembled at runtime; only template shapes verified.
- **Bounded paging** — string page (880) and some class lists truncated inline; retained evidence holds full sets (REA evidence IDs in README ledger).
- **Signature** — self-consistent, not cryptographically verified.
- **Class-search absence** — prefix-match "not observed" ≠ feature absent (doc 24).
- **JNI matching** — 48 matched bindings do not establish `loadLibrary`/`RegisterNatives`/invocation; 50 remain unattributed (doc 22).
- **Undeclared classes** — 5 deep-clean activities + DocumentsUIActivity exist in dex but not the manifest (dead code, doc 02/10).

## Verification corrections applied (final audit)

Early-draft claims corrected after complete-inventory checks: `ExtractFileActivity`/`CopyFileActivity`/`MoveFileActivity`/pickers are **aliases** not activities; `:FTPServer` process didn't exist (main process); `FeedbackActivity` was missed; `Google CMP/UMP` → Zeus `cmpLib.CMPLib`; Glide+OkHttp+Moshi+BouncyCastle+junrar+OMID confirmed, ZXing/Picasso/EventBus/SpongyCastle/XStream/UMP/DownloadInstall* not observed; JNI evidence re-cited (`ev_be453578…9b445`); `CallActiveReceiver` action is `cm.intent.action.xiaomi.callactive`; no app-declared receivers at all; `crash` service is Zeus SDK, not app code.

## Confidence

High: identity, manifest, component map, cleaner architecture, remote stacks, JNI map, ad stack composition, self-update flow.
Medium: private-folder internals, exact network hosts, per-lib symbol attribution, export-provider code guards.
Low/none: runtime enforcement, reflection/dynamic-load edges, actual grant status of signature permissions.
