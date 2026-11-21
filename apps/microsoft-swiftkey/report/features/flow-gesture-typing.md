# Flow — gesture/swipe typing

Evidence: `fluency_params.json` `continuous-input` target; strings `pref_flow_*`, `onboarding_sheet_welcome_bullet_flow`; Fluency `TouchHistory`/`InputMapper` JNI.

## What it is

SwiftKey's swipe typing — slide finger across keys to form words. In Fluency internals this is **"continuous-input"**.

## Engine surface

- `TouchHistory.addPress(Point, ShiftState, …)` records each touch point; `InputMapper` maps the traced path through `KeyShape`s to candidate letters; predictions come from `PredictorImpl.getPredictions` over the sequence.
- Native exports: `impl_InputMapperImpl_*`, `TouchHistory_*`.

## Tunables (`fluency_params.json`, BiBo-overridable)

| Property | Value | Role |
|---|---|---|
| `start-decay` | 0.36 | path-probability decay at gesture start |
| `end-decay` | 0.50 | decay at gesture end |
| `prefix-probability` | 1e-15 | floor probability for prefix matching |
| `use-scaled-key-proximity` | false | key-proximity weighting off |
| `use-direction-path-similarity` | true | match gesture by path shape/direction |

## Preferences & behavior

- `pref_flow_switch_key` / `pref_flow_gestures_key` — Flow on/off and gesture options in Typing settings.
- `pref_autospace_after_flow_*` — "Show predictions after Flow": auto-insert space + next-word predictions after a gesture completes (default on).
- Onboarding advertises Flow as a marquee feature ("Flow type by sliding between the keys").
- `Swipe on space bar` = layout/language switching gesture (separate from Flow).
- Cursor control uses spacebar long-press+slide — a distinct gesture.

## Unknowns

- Whether Flow is available in every layout is layout/table-driven (some non-Latin layouts disable it [inferred from layout families]).
- Exact beam-search internals remain in native code — not decompiled.
