# Onboarding & installer

Evidence: `com.touchtype.installer.*` / `com.touchtype.onboarding*` classes, `assets/appconfig/onboarding/steps/models/*`, `onboarding_*`/`social_proof_*` strings, `experiment_config_new_user.json`, `experiment_config_upgrade_user.json`, `splits0.xml` required splits, `BaseSplitActivity`.

## Flow (static map)

- `BaseSplitActivity` — verifies required config splits (SplitCompat) before UI; missing split → recovery path.
- Step sequence is **server-tunable**: `appconfig/onboarding/steps/models/*.json` define ordered steps; `experiment_config_new_user.json` / `experiment_config_upgrade_user.json` (empty in build → assignments come from BiBo) select variants.
- Steps observed: enable-IME picker → select SwiftKey as active IME → sign-in prompt (skippable) → language/theme pickers → permission asks (mic/notifications) → social-proof screen (ratings/testimonial Lottie, `social_proof_*`) → "done".

## Mechanics

- `com.touchtype.installer.*` — first-run detection, upgrade vs fresh-install branching, resumable onboarding (re-entry finishes unfinished steps).
- Education assets: `assets/*.mp4` how-to videos (toolbar customise, cursor control) + `tone-02.webm`.
- Post-onboarding: tips/cards pipeline takes over (see `messaging-centre-tips-cards.md`).

## Incomplete-evidence

Exact step order/variants are config-driven; runtime ordering depends on BiBo delivery.
