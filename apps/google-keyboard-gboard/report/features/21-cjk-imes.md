# CJK & language-specific IMEs

## Japanese — Mozc

- `libs.mozc.ime.{SimpleJapaneseIme, JapaneseKanaKeyEventInterpreter}`, `libs.mozc.session.MozcJni`, `libs.mozc.motioneventhandler.JapaneseKeyboardLayoutHandler`, `libs.mozc.ime.handwriting.JapaneseHandwritingIme` — **Mozc** (Google Japanese IME, open-source core) embedded via JNI.
- Native: `mozc` and `mozc_without_supplemental_model` (two build variants); `googleclient/ime/mozc/nsc/*`, `i18n/cjk/ja/i18n_mozc/*` inside monolith.
- `japanese.keyboard.widget.*` (6 classes) — Japanese keyboard widgets (12-key/flick, godan, qwerty).
- Flags (verified in source): `enable_mozc_stats`, `enable_voice_in_japanese`, `mozc_enable_nwp_on_selection_changed`, `mozc_fst_decoder_{mode,nwp_penalty}`, `mozc_neural_rescoring_{mode,interpolation_weight}_for_nwp`, `mozc_ngram_enable_nwp`, `mozc_enable_multi_segment_candidate`, `mozc_enable_search_query_suggestion_learning`, `mozc_disable_legacy_rewriter_{mode,in_all_conversion_mode}`, `mozc_disable_zero_query_suffix_prediction`, `mozc_candidate_consistency_cost_max_diff`, `mozc_disabled_supplemental_model_ids`, `mozc_dictionary_version`, `ja_enable_smart_emoji_nwp`, `ja_candidate_ux_v2` (+6 `ja_candidate_ux_v2_*` tuning params — new candidate UX), `ja_handwriting_score_temperature`, `ja_physical_keyboard_stop_bypassing_decoder`, `ja_show_composition_mode_switch_indicator`, `ja_shift_lock_hint_*`, `ja_surrounding_text_chars_length`, `enable_writing_tools_cooperative_mode_ja` — Mozc has its own n-gram/FST + neural-rescoring + NWP + emoji pipeline and a v2 candidate-UX revamp in flight.
- "Japanese layout setup flow" flag — 12-key vs qwerty onboarding choice.

## Chinese — Pinyin / Zhuyin / Cangjie / Stroke / Cantonese / HMM

- `libs.pinyin.*` (10) + `libs.pinyin.fragment` — Pinyin IME + layout fragments.
- `libs.zhuyin.*` (6) — Zhuyin (Bopomofo) IME.
- `libs.cangjie.ime` — Cangjie shape-based IME.
- `libs.stroke.ime` — stroke-order IME.
- `libs.cantonese` — Cantonese support.
- `libs.chinese.ime` + `libs.chinese.ime.hmm` (4) + `libs.hmm` (11) + `latin.hmm` (8) + `libs.hmmgesture`, `libs.hmmvoice.*`, `libs.hmmhandwriting` — the shared **HMM engine** for CJK decoding, gestures, voice, handwriting; `hmm` native lib.
- `ZawgyiWrappedLatinIme` — Myanmar Zawgyi↔Unicode bridging.
- `HindiDynamicKeyboardGestureMotionEventHandler`, `Latin9KeyGestureMotionEventHandler` — Hindi dynamic keyboard, 9-key layouts.
- `enable_hebrew_qwerty_layout`, `enable_hi_10key_layout{,_b}` — Hebrew/Hindi layouts.

## Korean

- `libs.korean.*` (14 classes) — Korean IME (Hangul jamo assembly, dubeolsik).

## Notes

All CJK decoding runs in native code inside `libintegrated_shared_object.so` (Mozc + HMM + Delight hybrid). `enable_hmm_user_history_backup` — CJK user history backs up with account.
