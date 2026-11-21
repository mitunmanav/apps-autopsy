# Resources — base + en + xxhdpi splits

Evidence: base decode `ev_3c4389bf95b6f1e343dc0e04e0b6aabecec69c0ada281141bf45a351beffd7d4`
(1,757 decoded files, **partial** coverage, 1,116 strings), en split decode
`ev_7d4d2281253e5cd329837a85b8e63061ef7f14ccfb5cb1831826f2e0ca2c45e8`,
base archive inventory `ev_3f5ed051ad3908b86d2fa4700c502fcb93929bbf2cbfd614465d3c38d7810238`
(1,648 occurrences, 1,576 nodes, 1,647 edges, complete container-entry coverage).

## Archive composition

| APK | Contents |
|---|---|
| `base.apk` | 1,647 archive entries total; 4 DEX, **1,597 `res/` entries**, `resources.arsc`, ML Kit OCR assets, `assets/phenotype/*`, `assets/dexopt/baseline.prof`+`.profm`, `assets/decision_rules.bin`, `assets/source` |
| `split_config.arm64_v8a.apk` | 4 native libraries only |
| `split_config.en.apk` | locale resources only — **no default `values/strings.xml`**; variants `en-rAU, en-rCA, en-rGB, en-rIE, en-rIN, en-rSG, en-rZA` |
| `split_config.xxhdpi.apk` | 181 density resources |

## `assets/` inventory highlights

- `document_detection.tflite` — on-device document boundary detection
- `mlkit-google-ocr-models/` tree (18 files): **taser** mbv2 detectors
  (`rpn_text_detector_mobile_space_to_depth_quantized_mbv2_v1.tflite` +
  region-proposal bincfg + `rpn_text_detection_tflite_mobile_mbv2.binarypb`),
  **GOCR** Latin ConvNeXt recognizer (`line_recognition_mobile_convnext/
  Latn_ctc/optical/model.fb` + `LabelMap.pb` + `Latn_ctc_cpu.binarypb`),
  `tflite_langid.tflite` (language ID), script-ID dir/style models,
  layout `cluster_sort` + `line_splitting` custom-ops models,
  **aksara** page-layout-analysis RPN models (Indic-script layout!),
  combined engine configs `taser_tflite_gocrlatinconvnext_mbv2_gocrscriptid_
  aksara_layout_gro_mobile_{engine,engine_ti,recognizer,runner,runner_ti}.binarypb`
- `decision_rules.bin` — cleanup-card heuristics binary (opaque format)
- `phenotype/*_package_metadata.binarypb` — 12 channel registrations:
  nbu_files_device, geller, auth_account_client, clearcut_client,
  **droidguardclient**, **icing.mdd**, consentverifier, notifications_platform,
  **performance.primes**, **surveys**, **privacy.ptoken.ondevice**,
  tiktok_device, tiktok_directboot
- `dexopt/baseline.prof` + `.profm` — baseline profiles for AOT/dexopt
- `empty_asset_generated_by_bazel`, `source` — build plumbing

## Strings → feature surface (1,116 base strings)

App name `Files`. Confirmed feature language for:
file ops (edit/rename/move/copy/delete/restore), favorites/starred, folders;
storage management (breakdown, cache cleanup, junk, unused apps, SD card, USB,
downloads); media (images/videos/audio, album/artist metadata, playback speed,
volume); documents (PDF, text, Markdown, preview, annotation tools:
pen/highlighter/eraser/undo/redo); ZIP (compress, name validation, extract,
delete-after-extract, unreadable entries); apps (APK install, uninstall, app info,
cache clear, install errors); Safe Folder (password, biometrics, protected files,
encryption terms); search (categories, date filters, top results); trash
(restore window, expiry); nearby/offline sharing; Google-Photos backup card;
storage assistant.

## Layouts of note

- `safe_folder_auth_activity.xml` (+ `auth_fragment`)
- `pdf_preview_item_host_fragment.xml` — contains **`gemini_button`** FAB
  (Ask-Gemini entry point inside PDF preview)
- `bottomsheet_pdf*` — PDF bottom sheets
- split-rule XMLs for activity embedding; `hidden_file_view`; manage-space,
  trash, junk-review, card-review, file-info layouts

## Locale coverage

Default strings live in **base** (en); regional English overrides in the en
split; other languages are separate Play splits not present here.

## Decode caveats

- Base decode coverage = **partial** (some resource types undecoded).
- Apktool 2.7.0-dirty predates CVE-2024-21633 fix — decoded paths treated
  as untrusted; no path traversal observed but not a guarantee.
