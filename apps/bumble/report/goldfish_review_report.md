# Goldfish Review Report — Bumble APK Report

Target: `/home/mitun/apks/Bumble/report/` (full file set). Reviewers: codebase-details, comprehension, design, structural, style, zoom-out. Context: `.work/` evidence files.

## Round 1

| Reviewer | Status |
|---|---|
| structural | completed |
| zoom-out | completed |
| comprehension | completed |
| style | completed |
| design | completed |
| codebase-details | completed (late return; findings folded into the same fix pass) |

### Findings — PROPOSE FIX (applied)

| ID | Sev | File(s) | Issue | Resolution |
|---|---|---|---|---|
| F-verb | 🔴 | 15 files | Stray `verb)` backticks + duplicated phrases from mechanical pass-2 sed | Removed all stray backticks/duplicates; verified via grep |
| F-webrtc | 🔴 | video-calls.md | 6 fabricated `SERVER_WEBRTC_*` verbs shown as [obs] | Replaced with real catalog verbs; payload semantics marked [inf] |
| F-sentry | 🔴 | offline-online.md, sdks.md, data-pipeline.md, README.md | `offline_signal_*` still attributed to Sentry (4 sites) | Reassigned to Google DataTransport everywhere |
| F-link | 🔴 | navigation-map.md | Stale `s.bumble.com/f/open-in-app` host | Corrected to `t.cloud.bumble.com` |
| F-readme | 🔴 | README.md | Index had no links; stale counts (13 tools/16 features) | Full linked index; counts corrected (14/24/13) |
| F-domains | 🟡 | README.md, coverage-ledger.md | B4F domain count said 19 | Unified to 18 |
| F-subs | 🟡 | coverage-ledger.md, paywall-promo-engine.md, boost file | "3 subs" stale; Premium+ missing from catalog | Unified to 4 tiers; Premium+ added |
| F-blur | 🔴 | matchmaking-mechanics.md | "No client trick can reveal them [obs]" — unproven negative; counter-evidence (`BeelineUser(avatarUrl=`, `LikedYouCard(userId=`, `unboxedPictureUrl=`) unexamined | Rewritten: blur is obs, unblur-bypass is [unk] with counter-evidence cited |
| F-funnel | 🔴 | matchmaking-mechanics.md | "like → invisible" wrong model (admirer badge exists); free Opening-Moves path omitted | Funnel rewritten; Opening Moves free path added |
| F-thresh | 🟡 | matchmaking-mechanics.md | Invented ≥10-admirer blocker threshold | Bounded to "two blocker elements; thresholds [unk]" |
| F-badoo | 🟡 | matchmaking-mechanics.md, gifts.md | BADOO_* flags used as live evidence without dormancy caveat | Caveats added per-line |
| F-copyrule | 🟡 | matchmaking-mechanics.md, bizz-mode.md | Copy coverage presented as proof of adaptive opener rule | Retagged [inf] with the alternative reading stated |
| F-extend | 🟡 | matchmaking-mechanics.md | "Extend sells mostly to men" — symmetric `prolongated_by_me_female` strings unweighed | Both-sides evidence added; buyer distribution [unk] |
| F-migration | 🟡 | README.md | "Chat mid-migration" overclaims coexistence | "Coexist; direction [unk]" |
| F-rails | 🟡 | README.md | All payment rails presented as live | Shipped-vs-live distinction + dormancy note added |
| F-elise | 🟡 | README.md, elise.md | Elise→NSFW-image attribution as fact; "ranking hints" invented | Bounded to text pipeline; consumers [unk] |
| F-tier | 🟡 | profile-visitors.md, extend.md, beeline/rematch | Tier/quota claims from product lore tagged [obs]/[inf] | Retagged [unk] |
| F-gloss | 🟡 | README.md | B4F/BAPI/REA/ev_*/.work/prematch/string-taxonomy undefined | "How to read" glossary added |
| F-misc | 🟡 | permissions.md, ads.md, safety-moderation.md, opening-moves.md, question-game.md, notifications.md, video-calls.md | Samsung perm mislabeled, MoPub live claim, India flag misclassified, sponsored-moves ad claim, QUICK_HELLO dormancy, "(duh)" tone, c2dm "+SEND", call-match precondition | All corrected/bounded |
| F-conv | 🟡 | network-api.md | "no such verb" convention unexplained; meta-tag in heading | Convention footnote added; heading cleaned |
| F-dup | 🟡 | profile-enrichment.md | Verification bullet duplicated verification.md verbatim | Replaced with link |

### Findings — CONTEST (recorded, not applied)

| ID | Sev | Scope | Why contested |
|---|---|---|---|
| C-merge-tools | 🟡 | tools/ all | Zoom-out: merge 14 thin tools files into a table. Contested: spec mandates one file per tool; files now carry evidence-only bullets. Boilerplate is tax but required. |
| C-merge-maps | 🟡 | screen-map + navigation-map | Zoom-out: merge. Contested: spec requires both files (different views: screens vs flows). Duplication is index-level, acceptable. |
| C-merge-thin | 🟡 | dating-hub/question-game/speed-dating/bizz | Zoom-out: merge into secondary-modes.md. Contested: spec granularity; files are honest about thin evidence. |
| C-matching-merge | 🟡 | matching.md vs matchmaking-mechanics.md | Partial fix applied (matching.md keeps match-list scope); full merge contested — different audiences. |
| C-stamps | 🟢 | all 52 files | Zoom-out: stamp once in README. Contested: spec requires every file stamped (standalone reads). |

### Findings — codebase-details (late return, all applied)

| Sev | File(s) | Issue | Resolution |
|---|---|---|---|
| 🟡 | notifications.md / permissions.md | "8 OEM badge perms" not reproducible; manifest has ~15 | Reconciled to ~15 with representative enumeration |
| 🟡 | manifest-components.md | "171 app-owned" wrong — 159 by stated prefixes | Corrected + ~12 wider `com.bumble.*` noted |
| 🟡 | manifest-components.md, persistence.md | `ACCESS_CACHE_PROVIDER` called signature-level — never declared | Reworded: referenced via android:permission, level [unk] |
| 🟡 | auth-onboarding.md | Prove flag names cited without `MINOR_FEATURE_` prefix | Full shipped names restored |
| 🟢 | 4 files | Missing `SERVER_`/`MINOR_FEATURE_` prefixes on cited names | Restored (ENCOUNTERS verbs, JAPAN_IDV_V2, THREATMETRIX, SAVE_APP_SETTINGS) |
| 🟢 | matchmaking-mechanics.md | bff pair claimed to have `about_*` axis — it doesn't | Corrected (bff set has no about-axis) |
| 🟢 | manifest-components.md | `mlink.bumble.com`, `us.auth*` hosts omitted; `/u/` pattern misattributed | Hosts added; shared-filter note added |
| 🟢 | bizz-mode.md | `gamemodeswitch_bizz` not a verbatim string | Real `bumble_gamemodeswitch_*` names cited |
| 🟢 | coverage-ledger.md, architecture.md | Off-by-one class counts (797/2336/1361) | Aligned to .work listing counts (796/2335/1363) |
| 🟢 | manifest-components.md | `Bumble2MainActivity` called "launcher-side" unevidenced | Reworded: exported, no intent filters |

### Nits recorded (not all applied)
Em-dash consistency, "literally"/informal adverbs mostly removed where touched, `supertokens`→SuperSwipe terminology fixed, `(activitys:101)` reference clarified, "Honest unknowns"→"Unknowns" done, evidence bundles noted as report-root artifacts (kept: they are deliverables, not working files).

### Round-1 verdict
Not clean — Blockers and Majors were found and fixed. Per protocol, a second round with fresh reviewers is required.
