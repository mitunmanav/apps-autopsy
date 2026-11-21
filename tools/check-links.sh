#!/usr/bin/env bash
# Find dead internal links in markdown under apps/ and categories/.
# Validates against git-tracked paths, not the local filesystem — a link
# to a dir that only holds gitignored work files is dead in a clean clone.
# Usage: tools/check-links.sh
set -u
cd "$(dirname "$0")/.."
python3 - <<'PY'
import re, sys, pathlib, subprocess

root = pathlib.Path('.').resolve()
tracked = subprocess.check_output(['git', 'ls-files'], text=True).splitlines()
dirs = {str(pathlib.PurePath(t).parent) for t in tracked}

def has_target(md, target):
    p = (md.parent / target).resolve()
    try:
        rel = str(p.relative_to(root))
    except ValueError:
        return False
    return rel in tracked or rel in dirs or any(d.startswith(rel + '/') for d in dirs)

bad = 0
md_files = [root / t for t in tracked
            if t.endswith('.md') and (t.startswith('apps/') or t.startswith('categories/'))]
for md in md_files:
    for i, line in enumerate(md.read_text(errors='replace').splitlines(), 1):
        for target in re.findall(r'\]\(([^)\s]+)\)', line):
            if re.match(r'^[a-z]+:|#', target):
                continue
            target = target.split('#')[0].split('?')[0]
            if not target:
                continue
            if not has_target(md, target):
                print(f"DEAD {md}:{i}: {target}")
                bad += 1
sys.exit(1 if bad else 0)
PY
