#!/usr/bin/env bash
# Lint teardown reports against the report contract.
# Usage: tools/check-report.sh [--strict] [apps/<name>/report ...]
# Without arguments it checks every apps/*/report directory.
set -u
strict=0
[ "${1:-}" = "--strict" ] && { strict=1; shift; }

dirs=("$@")
[ ${#dirs[@]} -eq 0 ] && dirs=(apps/*/report)

REPORT_DIRS="$(printf '%s\n' "${dirs[@]}")" STRICT="$strict" python3 - <<'PY'
import os, re, sys, pathlib

FIELDS = ['Target', 'Version', 'SHA-256', 'Platform', 'Method',
          'Analyzed', 'Tools', 'Obtained', 'Analyst']
SECTIONS = ['What this is', 'Findings', 'Layout of this report',
            'Coverage', 'Limitations']
COVERAGE = ['Identity & signing', 'Components & exported surface',
            'Permissions', 'Network & API surface', 'SDKs, ads & trackers',
            'Native code & JNI', 'Persistence & local data',
            'Protection & obfuscation', 'Embedded config & shipped secrets',
            'Monetization', 'Feature inventory',
            'Updates & dynamic delivery', 'Privacy']

strict = os.environ.get('STRICT') == '1'
fail = 0
for d in os.environ['REPORT_DIRS'].splitlines():
    p = pathlib.Path(d)
    if not p.is_dir():
        continue
    app = p.parent.name
    if app.startswith('_'):
        continue
    f = p / 'README.md'
    if not f.is_file():
        print(f'MISSING  {app}: report/ has no README.md')
        fail = 1
        continue
    t = f.read_text(errors='replace')
    problems = []

    if not re.search(r'^# \S.* — teardown report\s*$', t, re.M):
        problems.append('title must be "# <App name> — teardown report"')

    for name in FIELDS:
        if not re.search(r'\|\s*\*\*' + name + r'\*\*\s*\|\s*\S', t):
            problems.append(f'identity table missing non-empty **{name}** row')

    if not re.search(r'[0-9a-fA-F]{64}', t):
        problems.append('no 64-hex SHA-256 of the analyzed artifact')

    for s in SECTIONS:
        if not re.search(r'^## ' + re.escape(s) + r'\s*$', t, re.M):
            problems.append(f'missing "## {s}" section')

    for c in COVERAGE:
        if not re.search(r'^\|\s*' + re.escape(c) + r'\s*\|\s*\S', t, re.M):
            problems.append(f'coverage row missing or empty: "{c}"')

    for prob in problems:
        print(f'{"FAIL" if strict else "WARN"}     {app}: {prob}')
    if problems and strict:
        fail = 1

sys.exit(fail)
PY
