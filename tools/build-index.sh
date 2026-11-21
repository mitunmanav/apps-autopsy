#!/usr/bin/env bash
# Rebuild the README index table from categories/*.md.
# Category pages are the source of truth; the README table is generated.
# Usage: tools/build-index.sh [--check]   (--check: fail if README is stale)
set -euo pipefail
cd "$(dirname "$0")/.."

tmp=$(mktemp)
{
  echo "| Category | Reports | Pending |"
  echo "| --- | --- | --- |"
  for f in categories/*.md; do
    title=$(grep -m1 '^# ' "$f" | sed 's/^# //')
    reports=$(grep -cE '^\|.*(Autopsy done|Verified)' "$f" || true)
    waiting=$(grep -cE '^\|.*(Planned|In progress)' "$f" || true)
    [ "$waiting" = 0 ] && waiting="—"
    echo "| [$title]($f) | $reports | $waiting |"
  done
} > "$tmp"

start='<!-- index:start -->'
end='<!-- index:end -->'

if [ "${1:-}" = "--check" ]; then
  current=$(sed -n "/$start/,/$end/p" README.md | sed '1d;$d' | sed '/^$/d')
  if [ "$current" = "$(cat "$tmp")" ]; then
    echo "index in sync"; exit 0
  else
    echo "index STALE — run tools/build-index.sh"; exit 1
  fi
fi

awk -v s="$start" -v e="$end" -v tbl="$(cat "$tmp")" '
  $0 ~ s {print; print tbl; skip=1; next}
  $0 ~ e {skip=0; print; next}
  !skip' README.md > README.md.tmp && mv README.md.tmp README.md
echo "README index rebuilt"
