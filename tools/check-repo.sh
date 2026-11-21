#!/usr/bin/env bash
# Fail if forbidden content is tracked in git:
# binaries, decompiled output, or files inside gitignored work dirs.
cd "$(dirname "$0")/.."
bad=$(git ls-files | grep -nE 'apps/[^/]+/(apks|analysis|artifacts)/|\.(apk|apks|aab|ipa|exe|dll|elf|bin|dmg|img|dex|so)$' || true)
if [ -n "$bad" ]; then
  echo "$bad" | sed 's/^/FORBIDDEN /'
  echo "Reports only — remove these files and add them to .gitignore paths instead."
  exit 1
fi
echo "repo clean"
