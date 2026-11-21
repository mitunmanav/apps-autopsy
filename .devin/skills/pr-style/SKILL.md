---
name: pr-style
description: Write professional commit messages and PR bodies for this repo — conventional commits plus the Summary/Evidence/Merge-Danger PR format.
---

# Commit and PR style

## Commit messages

Format: `type(scope): imperative subject` — subject ≤ 72 chars, no period.

Types: `add` `change` `fix` `remove` `docs` `ci` `tools`

Scopes: `reports`, `categories`, `tools`, `ci`, `docs`, `assets`, an app name.

```
add(reports): teardown of smallpdf 3.7.0
fix(tools): count only table rows in build-index
change(reports): redact shipped vendor API keys
```

Body (optional): the *why*, wrapped at 72 chars. Never what the diff already
shows. No "Generated with" lines, no AI/bot co-authors — the repo's
CLAUDE.md forbids them.

Squash-merge is the only merge mode: the PR title becomes the commit
subject, so write PR titles in the same format.

## PR body

```markdown
## Summary

<diagram, diff-sketch, or tree — smallest view that makes the point>

## Evidence

- **Before:** <output/failing check>
  **After:** <output/passing check>

## Merge Danger

**Door:** <one-way or two-way>

**Blast Radius:** <one-word: report/README/CI/index>
```

### Summary — pick the smallest view

File-layout change → tree or diff tree:

```diff
 apps/
 ├── ola/report/
+└── uber/report/          # new teardown
 categories/
 └── ride-hailing.md       # +1 row
```

Logic/control flow → pseudocode or a diff of the flow:

```diff
 check-report
   identity table
   required sections
+  coverage rows            # 13 surfaces, none blank
```

Component/data flow → short mermaid only when prose can't carry it.
Show only what the change touches — a reader should get the shape in
5 seconds.

### Evidence

Execution proof over description: paste the actual check output before
and after (`tools/check-report.sh --strict` failures → passes, CI red →
green). For report PRs: the identity table + one tagged finding is the
evidence.

### Merge Danger

**Door** — two-way = cheap to revert (docs, new reports, tool tweaks).
One-way = hard to reverse (history rewrite, key disclosure, deleting
reports, rights-holder-visible claims).

**Blast Radius** — one word on worst-case spread: `README`, `categories`,
`CI-blocking`, `single-report`, `legal`.

### Checklist (report PRs only)

- [ ] Identity table complete (unknown values allowed, blanks are not)
- [ ] All 13 coverage rows linked or marked `n/a` / `not examined`
- [ ] `obs` / `inf` / `unk` tags on claims
- [ ] No binaries, decompiled source, secrets, personal data
- [ ] `tools/build-index.sh` run after the category row
