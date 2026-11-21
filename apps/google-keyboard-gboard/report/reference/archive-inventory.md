# Archive inventory

## base.apk — SHA-256 `e440c844770cc5d5a22afbf8e909478bb565596e52dd01c22a974fa1235b285e`

| Metric | Value |
|---|---|
| ZIP entries | 9,145 (8,719 unique nodes, 9,144 edges) |
| DEX files | 4 — `classes.dex` ≈7.86 MB, `classes2.dex` ≈8.47 MB, `classes3.dex` ≈3.68 MB, `classes4.dex` ≈680 KB |
| Top-level classes | 21,810 |
| `defpackage.*` (R8-repackaged) | ≈19,898 (91%) |
| Native libs | 15 entries under `lib/arm64-v8a/` |
| `res/` entries | 8,972 |
| `assets/` entries | 142 |
| String resources | 5,447 |
| UI locales | 99 locale dirs (+16 layout/API qualifier sets) |
| Manifest components | 73 |

### Notable assets

- `assets/decision_rules.bin` — feature-gating rules.
- `assets/emoji_en_us_20250115185814.zip` + `assets/emoji_superpacks_manifest_20250115185814.json` — bundled emoji pack + manifest (2025-01-15 build).
- `assets/dexopt/baseline.prof` + `baseline.profm` — **baseline profile** for AOT/JIT warmup.
- Phenotype metadata `.binarypb` files — experiment-flag declarations.
- 124 `assets/theme/*.binarypb` stylesheets (see [23-themes](../features/23-themes.md)).
- Onboarding GIFs: `oscillating_ghost.gif`, `no_suggestions_background_ghost.gif`, `interstitial_foreground_beaker.gif`, `interstitial_background_bubbles.gif`.
- `res/raw/main_en_us_d3*` — bundled English Delight LM bootstrap.

### Class distribution (non-obfuscated highlights)

- `com.google.android.apps.inputmethod.libs.*` — feature packages (agenticdictation, autotranslate, badwordchecker, cangjie, cantonese, chinese, clipboard, correctiontransition, dataservice, delight5, dvrnn, edittracker, expression, genaivoice, gestureui, handwriting, hint, hmm{,gesture,handwriting,voice}, japanese, jarvis, kcm, keyhound, korean, languageselection, latin5, mozc, nativeprofiler, nga, onboardingflow, ondevicegenai, ondevicesmallllm, pinyin, proactivesuggestion, search, sharing, stroke, stylus, superinsert, swissarmyknife, textediting, theme, trainingcache, translate, universaldictation, voiceime, zhuyin).
- `com.google.android.libraries.inputmethod.*` — framework (accessory, accesspoint, accounts, appdoctor, appstart, backup, cache, companionwidget, contentsuggestion, dailyping, embeddedphotopicker, emoji, extracttextview, featuresplit, fileprovider, flag, flogger, freecursor, genai, hint, ime, inlinesuggestion, inputview, keyboard, keyboardmode, keyevent, launcher, lens, lethe, mdd, metrics, motioneventhandler, nativelib, ondevicemetricaggregation, permissions, personaldictionary, pixelbundle, pksimulator, popup, preferencewidgets, rateus, settings, startup, staticflag, statusmonitors, strictmode, stylus, tracing, trainingcache, userfeaturecache, userunlock, voice, webdebugbridge, webp, widgets, work, workprofile + more).
- `com.android.inputmethod.latin.*` — original-package legacy classes (LatinIME, R, firstrun, keyboard, spellcheck).
- `com.google.android.keyboard.client.delight5.LanguageIdentifier` — language ID client.

## split_brella_feature_split.apk — SHA-256 `b153cafd0e090c9043fa01c2c09ad378ba076ae7fb1c9f641665cf297f541556`

Entries: `AndroidManifest.xml`, `lib/arm64-v8a/libtensorflow_jni.so`, `stamp-cert-sha256`. **Zero DEX.** On-demand TensorFlow runtime (Brella AI module).

## split_tenoranimation_feature_split.apk — SHA-256 `a976a776e9b8e6fc5ee5818ad643b887a3a4cbed97a24d8cea64c18db29a4c86`

Entries: `AndroidManifest.xml`, `lib/arm64-v8a/libtenoranimation_jni.so`, `stamp-cert-sha256`. **Zero DEX.** On-demand animated-sticker decoder.

## split_config.xxhdpi.apk — SHA-256 `3c4ad598fbf97ac226d7a1a2f28ec0c327c9174f8a9a20d5b3a43f5cda3ed77f`

Entries: `AndroidManifest.xml`, `resources.arsc`, `stamp-cert-sha256`. **Zero DEX, zero libs.** Density resource split — xxhdpi drawables merged into the base resource table at install.

## Evidence

Complete records (parent IDs) and their summary views:

- Artifact inventory (base): `ev_9c4953261b57067ae228de6942425467d99cfd74efc9f280674d6b97df0f7802`
- Package record (base): `ev_696dba112f9716a68ba3a5efe6b98e546d179154abbbc7e6a2d96c9cb289fd6c` → summary `ev_70c0dbaaa2a146d6b6a08f62d5723a160cb9890b0800cc0ea289ef9d34671021`
- Class inventory: `ev_3aef26c19ab7293154afa127de58abb4ad226d71d0c0e94a87449c1956892533`
- Resource decode: `ev_ef4b3ce0ca1638b412672007f8c38271b341bf58b662f593ee1a70c318cbbb27`
- Brella split record: `ev_5cf34d2609f30839c2b5d18f3186e27d1eea413f795fec257a3e393b9f938f37` → summary `ev_8b5efba59ca2cc16ecc22e17ff3a89c90b8b2c58dca8a119bc8e4aa01464292a`
- Tenor split record: `ev_64ff50ab4a8c3b5193d30213e64dac67494716c2011f97f6b6ce7f5f0926e9bd` → summary `ev_4f9916e467b6a380de5592d3a91a125be8ac92d281eb9a27673e623fde01c8a7`
- Local artifacts: `_analysis/jadx-out/` (21,804 decompiled files), `/tmp/classes.txt`, `/tmp/base_files.txt`, `/tmp/string_values.txt`, `/tmp/aapt2_res.txt`.
