#!/usr/bin/env bash
# Minimal toolchain for producing a teardown report.
# Installs: apktool, jadx, plus the JRE they need.
set -euo pipefail

if command -v apt-get >/dev/null; then
  sudo apt-get update
  sudo apt-get install -y apktool default-jre-headless unzip curl
else
  echo "No apt-get — install apktool and jadx manually." >&2
  exit 1
fi

if ! command -v jadx >/dev/null && [ ! -x "$HOME/tools/jadx/bin/jadx" ]; then
  ver=$(curl -s https://api.github.com/repos/skylot/jadx/releases/latest \
        | grep -oP '"tag_name":\s*"v?\K[^"]+')
  curl -sL "https://github.com/skylot/jadx/releases/download/v${ver}/jadx-${ver}.zip" -o /tmp/jadx.zip
  mkdir -p "$HOME/tools"
  unzip -q /tmp/jadx.zip -d "$HOME/tools/jadx"
  rm /tmp/jadx.zip
fi

echo "Done. jadx: ~/tools/jadx/bin/jadx · apktool: $(command -v apktool)"
