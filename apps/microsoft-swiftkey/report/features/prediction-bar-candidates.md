# Candidate / prediction bar

## Expanded candidates

`com.touchtype.keyboard.expandedcandidate` + `expanded_candidate_layout.xml` — an **expanded candidate panel** (wider/fuller suggestion view) alongside the strip.

## Learn/unlearn UX

`cm_prediction_bar` — "tap words to teach SwiftKey, press and hold to unlearn": the bar doubles as the **dynamic-model editing surface** (long-press removes a learned word).

Evidence: `com.touchtype.keyboard.candidates.view.*`, `res/layout/candidate_container_layout.xml`, `sequential_candidate_bar_with_ecw_button_layout.xml`, `expanded_candidate_layout.xml`, `res/layout/emoji_prediction_layout.xml`, strings `cm_prediction_bar`, `cloud_clip_prediction_bar_pref_*`, `EllipsizedCandidate`.

## Structure

- `SequentialCandidatesRecyclerView` — RecyclerView-based candidate strip (not the old static 3-button bar).
- `SequentialCandidateBarLayoutWithECWButton` — candidate bar with an **ECW** button (ECW = "expand candidates window" — opens the expanded candidate overlay).
- `ExpandedResultsOverlayOpenButton` / `ExpandedResultsCloseButton` + `expanded_candidate_layout.xml` — expanded predictions overlay ("more suggestions" pane).
- `candidate_container_layout.xml` — hosts candidates inside keyboard frame.
- `EllipsizedCandidate` — truncation handling for long predictions.

## Behaviors

- Coachmark text (`cm_prediction_bar`): "Your personal suggestions are here, tap words to teach SwiftKey, press and hold to unlearn them" — **tap-to-learn / long-press-to-unlearn** personal dictionary interaction.
- `cloud_clip_prediction_bar_pref_*` — "Show last copied item as quick paste option on prediction bar": cross-device clipboard item appears as a prediction chip.
- Emoji predictions surface here too (`emoji_prediction_layout.xml`, `EmojiPredictionCaption`, `emoji_predictions_coachmark` "Fast emoji from what you just typed").
- `quick_paste_*`, `quickImagePasteRibbonState`, `quickResultsBarLayout` — quick-paste/search candidate chips (Bing growth features).
- `emoji_magic_caption` "Quick emoji" — quick-emoji row mode.
- Editor/AI candidates: `pref_editor_candidate_enabled_key` — Editor suggestions can appear in the bar.
- Theme keys `icon_space_openbox`, adaptive IME action key (`pref_adaptive_imegokey_key`) with go/enter/done/next/previous/search/send/smiley states (`ime_go_key_*` strings).

## Interaction wiring

Prediction tap → commit + learn; long-press → unlearn/remove (`emoji_variant_selector_remove_prediction_*`); ECW button expands to `expanded_candidate_layout`.
