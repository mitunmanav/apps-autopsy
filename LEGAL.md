# Legal posture

This repo publishes **analysis reports about software**, not the software
itself. What that means in practice:

- Reports are original commentary written by the analysts who did the work.
  Facts about how an app behaves (endpoints, permissions, SDKs, file names)
  are not copyrightable; our write-ups of those facts are licensed
  [CC BY-SA 4.0](LICENSE).
- We never commit binaries, decompiled source, or extracted proprietary
  assets. `artifacts/` and `analysis/` are gitignored by design, and CI
  rejects PRs that include them.
- We believe this is legitimate security research: static analysis of
  software you lawfully obtained, documented for interoperability,
  education, and security evaluation.

## If you're a rights holder

Open an issue or contact the repo owner via GitHub. We take concerns
seriously: we'll discuss scope, correct anything that's wrong, and remove
material that shouldn't be there. A report that describes your app
accurately is not an attack on it — but we'd rather talk than fight.

## If a report contains leaked secrets or personal data

That's a bug, not a feature. Open an issue titled `TAKEDOWN:` or contact the
owner directly — it gets priority, including history rewrites if needed.
