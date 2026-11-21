# Contributing

This repo collects reverse-engineering reports. Each report is a set of
markdown files under `apps/<app-name>/report/`.

## Ground rules

- **Reports only.** Never commit binaries, decompiled source (jadx/apktool
  output), or extracted proprietary assets. `artifacts/` and `analysis/` are
  gitignored. Keep them that way.
- **Your own analysis.** Write reports from work you actually did. Don't
  paste scanner output or someone else's write-up.
- **Evidence over claims.** If you state an app sends data to an endpoint,
  name the class, URL, or manifest entry that shows it. Mark anything you
  couldn't verify as unverified.
- **No secrets or personal data.** Don't commit tokens, keys, credentials,
  or user data found inside an app.
- **No weaponization.** Documenting a vulnerability or weak spot is fine.
  Publishing step-by-step bypasses for payments, DRM, or authentication is
  not.

## Adding an app

1. Create `apps/<app-name>/`, lowercase with hyphens (`mi-file-manager`).
2. Put the write-up in `apps/<app-name>/report/` with a `README.md` as the
   entry point. `apps/_template/report/README.md` is a starter skeleton —
   copy it and fill it in.
3. Add a row to the matching category page under `categories/`. That's the
   only index edit needed — `tools/build-index.sh` regenerates the README
   counts and CI checks they're in sync.
4. Open a PR titled `Add <app-name>`.

An app whose artifacts are collected but not analyzed yet doesn't need a folder.
Just add it to its category page as `Planned` so others know it's claimed.

## Updating a report

Reports document a specific version of the target (state it in the identity
table). When a new version ships and someone re-analyzes it, update the
report and add a `## Revisions` line at the bottom of its README noting the
version, date, and what changed.

## Verification

A report is only useful if a reader can check it. Three layers:

1. **Artifact identity.** Every report README states the package or binary
   name, version, SHA-256 of the analyzed artifact, analysis date, method
   (static / dynamic / both), and tools used. Anyone pulling the same build
   can reproduce your findings.
   `tools/check-report.sh` lints for these fields and CI runs it on PRs.
2. **Claim tags.** Mark what each statement rests on:
   - `obs` — observed directly in the artifact
   - `inf` — inferred from code evidence
   - `unk` — unknown / could not verify
3. **Peer verification.** A report becomes **Verified** when a second
   analyst reproduces its key findings from the same artifact hash.
   The index tracks the status.

## Report layout

The report README follows a contract — CI enforces it with
`tools/check-report.sh --strict`. Start from
[`apps/_template/report/README.md`](apps/_template/report/README.md):

- Title `# <App name> — teardown report`
- An identity table with every row filled (use `unknown` where you don't
  know — an honest `unknown` beats a missing row): Target, Version,
  SHA-256, Platform, Method, Analyzed, Tools, Obtained, Analyst
- Sections: `## What this is`, `## Findings`, `## Layout of this report`,
  `## Coverage`, `## Limitations`

**Coverage is the "reveal everything" rule.** The `## Coverage` table lists
the surfaces a teardown can have — signing, components, permissions,
network, SDKs/trackers, native code, persistence, protection, shipped
secrets, monetization, features, updates, privacy. Every row must either
link to where it's covered or say `n/a — <why>` / `not examined`. A row
may never be blank: silence means the report skipped the question, which
is exactly what this contract exists to prevent.

Deeper docs sit under the report dir however fits:

```
report/
  README.md     contract above + findings + coverage map
  platform/     cross-cutting topics: architecture, manifest and permissions,
                network/API surface, persistence, native code, bundled SDKs,
                screen and navigation maps
  features/     one file per feature area
  tools/        one file per user-facing tool (for utility apps)
  limitations   what you could not verify or decode
```

If your tooling emits an evidence bundle (JSON of extracted facts), commit
it next to the report. It's what backs the claims.

## Style

Write for someone who will never run the tools themselves. Name real class
names, file paths inside the artifact, endpoints, and SDK versions. Short
sections beat long ones. If a section doesn't apply to this app, drop it
rather than padding it.

## License

Reports are licensed [CC BY-SA 4.0](LICENSE). By opening a PR you agree
your contribution ships under the same license.

## Releases

Maintainers tag a release (`vYYYY.MM`) when a batch of autopsies lands —
a dated snapshot of the corpus, not a software version. Release notes list
which reports landed and which targets were claimed since the last tag. Contributors
don't need to do anything; releases are cut from `main`.
