# Accessibility

Evidence: `content_description`/`card_talkback` fields everywhere, `accessibility_*`/`talkback_*` strings, `high_contrast` + `Adaptive` themes, `pref_accessibility_themeid` (Fluent Adaptive default), TalkBack-specific layouts (`*_talkback*.xml`), `explore_by_touch` attrs, media `caption`-style keys.

## Coverage

- **TalkBack/announcements**: virtually every interactive control ships `contentDescription`; custom announcements built via `announceForAccessibility` (custom-theme editor announces image moved/zoomed/boundary; toolbar announces modes; candidates announce selection).
- **Cards**: every messaging card carries a dedicated `card_talkback` localized blurb (~80 locales) plus per-button `content_description`.
- **High-contrast + adaptive themes**: `high_contrast`, `High Contrast Minimal`, `Adaptive`, `Fluent Adaptive` (`pref_accessibility_themeid`) themes target visibility/system dark-mode.
- **Scaled UI**: resizable keyboard + `custom_theme` slider announcements with percentages; large candidate text is theme-driven.
- **Switch/touch accommodations**: `explore_by_touch`, TalkBack-aware layouts (`*_talkback*.xml` variants), long-press symbol hints card ("Long-press symbols").
- **Voice typing** serves as an a11y input path; **hard keyboard** support aids switch users.

## Gaps/unknowns

- IME itself isn't an `AccessibilityService` — it can't read screen content; accessibility = its own UI being accessible.
- Whether emoji/GIF grids expose full a11y labels per item is runtime-dependent on provider metadata (GIPHY/Klipy alt text).
