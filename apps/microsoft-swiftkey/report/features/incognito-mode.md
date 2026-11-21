# Incognito mode

Evidence: strings `toolbar_incognito_*`, `theme_error_incognito_mode`; code refs in `w90/h0.java`, `ej0/l.java`, `ya0/t.java`, `mj0/m.java`, `e20/q.java`, `gi0/m.java`, `md0/k*.java`, `qz/a7.java`.

## What it is

A toolbar toggle that **completely stops personal learning**: string `toolbar_incognito_on` — "Incognito mode is on\n%1$s will completely stop learning your words".

## Behavior

- Toolbar button (`toolbar_incognito_mode_caption` "Incognito"); states: on/off/non-actionable ("Incognito not available" — e.g. in fields where it can't apply).
- While on: no words/phrases are learned into the dynamic model; predictions still work from static+existing models.
- **Theme changes blocked**: `theme_error_incognito_mode` — "You cannot change theme while in incognito mode."
- Privacy messaging: app advertises it does not learn "from your private information like passwords and credit [cards]" (`enable_keyboard_privacy_message`) — password/sensitive fields are already excluded; incognito extends that to all learning.
- Implementation spreads across many obfuscated classes (`w90.h0`, `md0.k`, `qz.a7`…) — flag consulted at learning/commit points [inferred from usage spread].

## Unknowns

- Whether incognito auto-disables per field type or persists globally until toggled — code refs suggest session/global flag semantics; exact reset triggers not isolated.
