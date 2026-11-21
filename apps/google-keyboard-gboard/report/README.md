# Gboard — teardown report

| | |
| --- | --- |
| **Target** | `com.google.android.inputmethod.latin` (arm64-v8a release) |
| **Version** | 18.5.4.993608717-release-arm64-v8a (versionCode 176049702) |
| **SHA-256** | `e440c844770cc5d5a22afbf8e909478bb565596e52dd01c22a974fa1235b285e` (base.apk) |
| **Platform** | Android |
| **Method** | static |
| **Analyzed** | unknown |
| **Tools** | REA · JADX 1.5.6 · aapt2 · apktool |
| **Obtained** | local archive |
| **Analyst** | @mitunmanav |

## What this is

Google's keyboard — prediction/correction engine, glide typing, voice
typing, stickers/GIF/clipboard, and on-device ML features. Four APKs
analyzed; never executed.

## Artifact set

| File | Bytes | SHA-256 (prefix) | Role |
|---|---|---|---|
| `base.apk` | 89,295,756 | `e440c844…` | Main application: 4 DEX, 15 .so, 9,145 entries |
| `split_brella_feature_split.apk` | 37,232,870 | `b153cafd…` | Dynamic feature "brella": `libtensorflow_jni.so` |
| `split_tenoranimation_feature_split.apk` | 11,456,746 | `a976a776…` | Dynamic feature "tenoranimation": `libtenoranimation_jni.so` |
| `split_config.xxhdpi.apk` | 117,466 | `3c4ad598…` | xxhdpi density resources |

**Method:** Static analysis only. The APK was never executed. Tooling: REA `inspect_android_package`, `inspect_artifact`, `inspect_apk_signature`, `inspect_android_jni_bindings`, `decode_android_resources`, `search_android_classes`, `inspect_android_class`, plus local `aapt2`, `apktool`, and a full JADX 1.5.6 decompile (21,804 classes → `_analysis/jadx-out`). Class names below are the names shipped in the binary; the app is R8-repackaged so most internal classes appear as `defpackage.*`. Obfuscated identifiers are marked "obf".

**Evidence ledger:** each doc cites the REA Evidence ID (`ev_…`) backing its core claims. Top-level IDs:

- `ev_696dba11…` — `inspect_android_package` complete record (package/manifest)
- `ev_28f2d64c…` — `inspect_apk_signature` complete record
- `ev_9c495326…` — `inspect_artifact` complete inventory (9,145 members, hashed)
- `ev_3aef26c1…` — class inventory (21,810 top-level classes)
- `ev_1f0e9ae1…` — `inspect_android_jni_bindings` (668 native declarations, 15 libs)

---

## Findings

- **[obs]** R8-repackaged: ~all app code appears as `defpackage.*`; only manifest-declared classes keep names.
- **[obs]** On-device ML ships as two dynamic features — "brella" (`libtensorflow_jni.so`, TensorFlow Lite) and "tenoranimation" (`libtenoranimation_jni.so`).
- **[obs]** 668 JNI `native` declarations across 15 `.so` libraries; a 1,452-key experiment-flag system gates most behavior (server-side state unknown `[unk]`).
- **[obs]** Voice typing, universal dictation and "NGA" assistant command surfaces are present; what is enabled at runtime is flag-gated `[unk]`.

## Layout of this report

### Core typing

| Doc | Feature |
|---|---|
| [features/01-core-ime-latin5-delight5.md](features/01-core-ime-latin5-delight5.md) | LatinIME → LatinIME 5 rewrite, Delight5 decoder, IME framework |
| [features/02-decoding-suggestions.md](features/02-decoding-suggestions.md) | Autocorrect, next-word prediction (NWP/crank), neural rescoring, post-correction, concept prediction, multiword |
| [features/03-glide-typing.md](features/03-glide-typing.md) | Glide/gesture typing, DVRNN, TNT continuous decoding |
| [features/04-spellcheck-dictionary.md](features/04-spellcheck-dictionary.md) | Android spell-checker service, personal dictionary, learned words |

### AI & voice

| Doc | Feature |
|---|---|
| [features/05-voice-typing.md](features/05-voice-typing.md) | Voice typing: SODA on-device ASR, online S3, dictation modes, voice packs, seamless dictation, dictation key |
| [features/06-jetson-smartedit.md](features/06-jetson-smartedit.md) | Jetson voice-editing engine + SmartEdit voice commands + MobileBERT intent classifier |
| [features/07-agentic-dictation.md](features/07-agentic-dictation.md) | Agentic dictation IME |
| [features/08-rambler-muse.md](features/08-rambler-muse.md) | Rambler voice personalization, Rambler AL toolbar widget, Muse Gemini editing |
| [features/09-writing-tools-jarvis.md](features/09-writing-tools-jarvis.md) | Writing Tools: Proofread, Rewrite (Jarvis), conversational rewrite, v1.5/v2 pipelines |
| [features/10-ondevice-genai.md](features/10-ondevice-genai.md) | On-device GenAI: Gemma ODML, GenAiDelegate, AICore/Private-AI-Compute, brella TF split, LLM grammar checker |

### Expression & media

| Doc | Feature |
|---|---|
| [features/11-emoji.md](features/11-emoji.md) | Emoji picker, emoji search (incl. Gemma semantic), emoji prediction, variants, animated emoji |
| [features/12-emoji-kitchen.md](features/12-emoji-kitchen.md) | Emoji Kitchen mashups, SCAM nearest-neighbor engine, Gemma embedding ranker, proactive kitchen |
| [features/13-stickers-gif-tenor.md](features/13-stickers-gif-tenor.md) | Sticker packs, custom/photo stickers (Pixel Studio), GIF search, Tenor, emoticons |
| [features/14-expression-moments.md](features/14-expression-moments.md) | Expression Moment, Dynamic Art, content suggestion, expressive concepts, emojify |
| [features/15-scan-text-ocr.md](features/15-scan-text-ocr.md) | Scan Text (OCR), Lens-style text selection, extract-text view |
| [features/16-signboard-sign-to-text.md](features/16-signboard-sign-to-text.md) | Sign-to-text: sign-language → text via camera + MediaPipe |

### Text & language

| Doc | Feature |
|---|---|
| [features/17-clipboard.md](features/17-clipboard.md) | Clipboard (1-hr history, pin, screenshot clips, provider) |
| [features/18-translate.md](features/18-translate.md) | In-keyboard Translate + auto-translate of replies |
| [features/19-text-editing.md](features/19-text-editing.md) | Text-editing panel, free cursor, undo/redo, edit tracker |
| [features/20-handwriting.md](features/20-handwriting.md) | Handwriting: Scribe + LSTM recognizers, hybrid, stylus support |
| [features/21-cjk-imes.md](features/21-cjk-imes.md) | Japanese (Mozc), Pinyin, Zhuyin, Cangjie, Cantonese, Stroke, Korean, HMM engine, 9-key |
| [features/22-multilingual.md](features/22-multilingual.md) | Language packs, multilingual typing, language picker, superpacks |

### Layout & hardware

| Doc | Feature |
|---|---|
| [features/23-themes.md](features/23-themes.md) | Themes: bundled style sheets, Theme Builder (photo → theme), dynamic color, XR/foldable themes |
| [features/24-keyboard-modes.md](features/24-keyboard-modes.md) | One-handed, floating, split, resize, tablet/foldable/desktop keyboard modes |
| [features/25-physical-keyboard.md](features/25-physical-keyboard.md) | Physical keyboard: KCM maps, companion widget, shortcuts activity, dictation key, PK autocorrect/spatial model |

### Smart assistance & privacy

| Doc | Feature |
|---|---|
| [features/26-proactive-suggestions.md](features/26-proactive-suggestions.md) | Proactive Assistance, Personal Context (ACE) insight surface, autofill/inline suggestions, SuperInsert, keyhound input actions |
| [features/27-personalization.md](features/27-personalization.md) | Personalization: learn from usage/corrections, personalized dicts, contact biasing, per-conversation context |
| [features/28-federated-learning.md](features/28-federated-learning.md) | Federated learning & training cache: example stores, dynamic trainer, Nebulae materializer, local computation |

### Platform & infrastructure

| Doc | Feature |
|---|---|
| [features/29-downloads-splits.md](features/29-downloads-splits.md) | MDD/MobStore, superpacks, language packs, feature splits (brella TF / tenoranimation / xxhdpi) |
| [features/30-privacy-incognito.md](features/30-privacy-incognito.md) | Privacy model: incognito, Lethe scrubber, bad-word checker, data lifecycle, security hardening, sensitive-value note |
| [features/31-settings-devtools.md](features/31-settings-devtools.md) | Settings tree, Phenotype experiment flags, Swiss Army Knife, metrics/tracing/profiling, developer surfaces |
| [features/32-workprofile-platform.md](features/32-workprofile-platform.md) | Work profile cross-profile, backup/restore, WorkManager, sharing links, notifications, startup/direct-boot |
| [features/33-misc-ui.md](features/33-misc-ui.md) | Morse keyboard, search surface, voice IME/universal dictation, NGA commands, gesture UI, photo picker, toolbar access points |

### Reference

| Doc | Content |
|---|---|
| [reference/permissions-components.md](reference/permissions-components.md) | Every permission, component, provider, query, meta-data |
| [reference/archive-inventory.md](reference/archive-inventory.md) | Per-APK contents: DEX, native libs, assets, resources, splits, class distribution |
| [reference/native-libraries.md](reference/native-libraries.md) | All 15 .so + 30 logical native modules + JNI binding summary |
| [reference/experiment-flags.md](reference/experiment-flags.md) | Flag system + area distribution; full 1,452-key list in [experiment-flags.txt](reference/experiment-flags.txt) |
| [99-limitations.md](99-limitations.md) | Methodology, structural limitations, unresolved items, evidence ledger |

## Limitations

Static analysis only — the APK was never executed; experiment-flag and
server-side state are unknown. Full write-up, unresolved items and the
evidence ledger: [99-limitations.md](99-limitations.md).

## Coverage

Every surface of the artifact, and where this report covers it.
A `n/a` or `gap` here is a statement about this report, not about
the app.

| Surface | Covered in |
| --- | --- |
| Identity & signing | 00-identity-and-signing.md |
| Components & exported surface | reference/permissions-components.md |
| Permissions | reference/permissions-components.md |
| Network & API surface | features/ (per-feature); no consolidated map — gap |
| SDKs, ads & trackers | features/ per-feature; reference/archive-inventory.md |
| Native code & JNI | reference/native-libraries.md |
| Persistence & local data | features/ per-feature (clipboard, personalization, dictionaries) |
| Protection & obfuscation | README Method (R8 repackage); 00-identity-and-signing.md |
| Embedded config & shipped secrets | reference/experiment-flags.md (1,452 keys) |
| Monetization | n/a — no monetization surface found |
| Feature inventory | features/ (33 files) |
| Updates & dynamic delivery | features/29-downloads-splits.md |
| Privacy | features/30-privacy-incognito.md, features/28-federated-learning.md |
