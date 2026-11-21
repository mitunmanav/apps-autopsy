# Files by Google — teardown report

| | |
| --- | --- |
| **Target** | `com.google.android.apps.nbu.files` (split APK set, 4 APKs) |
| **Version** | 1.12735.987346843.0-release (versionCode 2027683, minSdk 32, targetSdk 37) |
| **SHA-256** | `9c1abf53edb2b3d4374b5c4262170d11ff815e4f6a89d519a096ca15ab036877` (base.apk) |
| **Platform** | Android |
| **Method** | static |
| **Analyzed** | unknown |
| **Tools** | REA · JADX headless 0.7.1 · JADX 1.5.6 |
| **Obtained** | local archive |
| **Analyst** | @mitunmanav |

## What this is

Google's file manager for Android — browse/clean/share files, with a Safe
Folder and an "Ask Gemini" PDF Q&A surface. Split APK set; the app was never
executed.

## Artifact set

| Field | Value |
|---|---|
| Package | `com.google.android.apps.nbu.files` |
| Version | `1.12735.987346843.0-release` |
| Version code | `2027683` |
| Min SDK | 32 (Android 12L) |
| Target SDK | 37 (Android 16) |
| base.apk SHA-256 | `9c1abf53edb2b3d4374b5c4262170d11ff815e4f6a89d519a096ca15ab036877` |
| base.apk size | 19,789,612 bytes |
| Signing | APK Signature Scheme v2 + v3 (no v1); key rotation + source stamp present |
| v2 cert SHA-256 | `207af9a133a630c4246a06c79c09946a70840f4702ee5baa53f3791b537b0f14` |
| v3 cert SHA-256 | `1c817cae3628ed5726f8020b71483511036213691f7c615c6f974a70a15674f3` |

The v2/v3 certificates differ — expected, v3 carries the rotated signing key lineage
(`ev_f5e42aecb8d51fa12df682034ead0f7edce6fe500605195c1ccfb417ef219bc5`).

## Methodology

Static analysis only. The APK was **never executed**. Findings come from:

1. **REA MCP** — `inspect_android_package`, `inspect_apk_signature`, `open_binary`/`inspect_artifact`,
   `search_android_classes`, `inspect_android_class`, `inspect_android_method`,
   `project_android_application_graph`, `decode_android_resources`,
   `inspect_android_jni_bindings`, `audit_release_exposure`, ELF inspection of extracted `.so` files.
2. **JADX** — REA's JADX headless 0.7.1 for evidence-cited decompilation, plus local JADX 1.5.6
   over the full base APK for broad feature search (11,184 units, 178 errors, 17,595 outputs).
3. **Apktool 2.7.0-dirty** — full resource decode (1,757 files). *Caveat: this build predates the
   upstream CVE-2024-21633 fix; decoded resource paths were treated as untrusted.*
4. **String-index fingerprinting** — all `defpackage/*.java` const strings (2,839 interesting
   literals across 1,270 classes) indexed to map obfuscated classes to features.

JEB was unavailable (`REA_JEB_MCP_URL` endpoint not running) — a provider limitation,
not an APK error.

## Layout of this report

Every feature gets its own exhaustive file under `features/`. Cross-cutting analysis
sits at the top level.

### Feature files (`features/`)

| File | Feature |
|---|---|
| [file-browser.md](features/file-browser.md) | Core browsing UI, categories, grid/list |
| [file-operations.md](features/file-operations.md) | Copy/move/rename/delete, batch ops, conflicts |
| [search.md](features/search.md) | In-app search, filters, history DB (FTS4) |
| [safe-folder.md](features/safe-folder.md) | Encrypted vault — Keystore master key, PBKDF2, AES |
| [trash.md](features/trash.md) | `.trashed-*` rename scheme, 30-day expiry, restore |
| [zip-archives.md](features/zip-archives.md) | ZIP create/browse/extract, zip-slip protection |
| [sharing.md](features/sharing.md) | Offline/nearby sharing via GMS, folder provider |
| [audio-player.md](features/audio-player.md) | ExoPlayer service, MediaSession, speed control |
| [video-player.md](features/video-player.md) | Video playback, gestures |
| [cast.md](features/cast.md) | Chromecast / Google Cast framework |
| [pdf.md](features/pdf.md) | PDF preview, annotation (pen/highlighter), AndroidX PDF |
| [gemini.md](features/gemini.md) | "Ask Gemini" PDF Q&A bottom sheet |
| [document-scanner.md](features/document-scanner.md) | GMS ML Kit scan delegation, OCR assets |
| [image-tools.md](features/image-tools.md) | Blur detection, YUV↔ARGB native utils, image viewer |
| [cleanup.md](features/cleanup.md) | Junk cards, duplicates, unused apps, large files |
| [storage-management.md](features/storage-management.md) | Storage breakdown, SD card, USB OTG, Manage Space |
| [downloads.md](features/downloads.md) | Downloads tab, Save-to-Downloads gateway, MDD |
| [app-management.md](features/app-management.md) | APK install/uninstall, app info, cache clear |
| [hidden-files.md](features/hidden-files.md) | Dotfile visibility, hidden file handling |
| [favorites.md](features/favorites.md) | Starred/favorite files |
| [advanced-browsing.md](features/advanced-browsing.md) | SAF pickers, DocumentsProvider, advanced browse |
| [smart-search.md](features/smart-search.md) | JAM AppSearch/BlobStore donation, on-device index |
| [ai-features.md](features/ai-features.md) | SmartDescription, AI summaries, entity extraction |
| [home-cards.md](features/home-cards.md) | Home feed, card surfaces, snooze |
| [update-framework.md](features/update-framework.md) | In-app update, Play feature delivery |
| [settings.md](features/settings.md) | Settings surface, quick settings, permissions UI |
| [backup.md](features/backup.md) | Android backup agent, Auto Restore |
| [notifications-widgets.md](features/notifications-widgets.md) | Channels, QS tile, shortcuts, deep links |
| [onboarding.md](features/onboarding.md) | First-run, permissions flow, guide provider |

### Cross-cutting analysis

| File | Subject |
|---|---|
| [manifest.md](manifest.md) | All 100 manifest components, permissions, providers, gateways |
| [architecture.md](architecture.md) | TikTok framework, DI graph, event bus, library map |
| [class-inventory.md](class-inventory.md) | 17,602 classes, taxonomy, obfuscation census |
| [resources.md](resources.md) | Resource tree, layouts, strings, locales, drawables |
| [native.md](native.md) | All 4 ARM64 `.so` files: ELF layout, hardening, exports |
| [jni.md](jni.md) | 25 native declarations, bindings, RegisterNatives status |
| [signature.md](signature.md) | v2/v3 schemes, cert digests, rotation, stamp |
| [databases.md](databases.md) | Every SQLite/Room/Geller/ProtoStore schema found |
| [network.md](network.md) | Endpoints, Clearcut, Cronet, network security config |
| [security.md](security.md) | Crypto inventory, keystore, exposure audit, hardening |
| [feature-flags.md](feature-flags.md) | Phenotype flags, `vxs` flag table |
| [telemetry.md](telemetry.md) | Streamz, Clearcut, GNP, event logging |
| [evidence/index.md](evidence/index.md) | All evidence IDs + artifact digests + coverage notes |
| [limitations.md](limitations.md) | What static analysis did NOT establish |

## Findings

- **Architecture:** Google's internal "TikTok" Android framework (mixin/peer
  fragments, event buses, generated DI). ~93% of classes are obfuscated under
  `defpackage.*` (16,401 of 17,602). App code = 133 named classes in
  `com.google.android.apps.nbu.files.*` plus obfuscated peers.
- **Safe Folder** uses Android Keystore master key
  (`android-keystore://safe_folder_master_key`) + PBKDF2-HMAC-SHA1
  (10,000 iters, 256-bit) for a password-verification path; per-file AES via a
  wrapped Google crypto provider. See [features/safe-folder.md](features/safe-folder.md).
- **Trash** is a rename-based scheme (`.trashed-<id>-<name>.trash`) + `trash_table`
  with `expiry_date_s` and WorkManager auto-deletion. See [features/trash.md](features/trash.md).
- **Document scanning is delegated to GMS ML Kit** (`com.google.android.gms.mlkit.ACTION_SCAN_DOCUMENT`),
  gated on ≥1.7 GB RAM and dynamic module install. Bundled OCR models (taser detector,
  GOCR ConvNeXt Latin, script-ID, layout analysis) back on-device text features.
- **Nearby/offline sharing delegates to Play Services** (`com.google.android.gms.nearby.sharing.*`)
  — Files supplies intents + a folder-sharing `ContentProvider`.
- **"Smart" search** = JAM donation pipeline pushing file metadata into on-device
  **AppSearch + BlobStore** corpora, all behind Phenotype flags.
- **Gemini** integration is a PDF-preview bottom sheet ("Ask Gemini", support link
  `support.google.com/gemini/answer/13594961`) — the model itself is not in the APK.
- **Security posture:** full RELRO + BIND_NOW + NX + stack protector + fortify on
  native libs; stripped symbols; network-security-config present; exposure audit
  found no high/medium findings in assessed checks. `FLAG_SECURE` on Safe Folder UI.

## Limitations

Static analysis only — the APK was never executed; Phenotype/feature-flag
state and server-side behavior are unknown unless marked. Full list:
[limitations.md](limitations.md); coverage notes:
[evidence/index.md](evidence/index.md).

## Coverage

Every surface of the artifact, and where this report covers it.
A `n/a` or `gap` here is a statement about this report, not about
the app.

| Surface | Covered in |
| --- | --- |
| Identity & signing | signature.md |
| Components & exported surface | manifest.md |
| Permissions | manifest.md |
| Network & API surface | network.md |
| SDKs, ads & trackers | telemetry.md |
| Native code & JNI | native.md, jni.md |
| Persistence & local data | databases.md |
| Protection & obfuscation | security.md |
| Embedded config & shipped secrets | security.md, network.md |
| Monetization | n/a — no monetization surface found |
| Feature inventory | features/ (29 files) |
| Updates & dynamic delivery | features/update-framework.md |
| Privacy | features/safe-folder.md, security.md |
