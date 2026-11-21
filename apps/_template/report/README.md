# <App name> — teardown report

| | |
| --- | --- |
| **Target** | `com.example.app` |
| **Version** | 1.2.3 (build 123) |
| **SHA-256** | `<64 hex chars>` |
| **Platform** | Android |
| **Method** | static / dynamic / both |
| **Analyzed** | YYYY-MM-DD |
| **Tools** | apktool, jadx, frida, ... |
| **Obtained** | Play Store / vendor site / device pull |
| **Analyst** | @you |

## What this is

Two to four sentences: what the target does, its core loop, and the one
thing worth knowing that the store page doesn't tell you.

## Findings

Tag what each claim rests on:

- `obs` — observed directly in the artifact
- `inf` — inferred from code evidence
- `unk` — unknown, could not verify

## Layout of this report

- `platform/` — architecture, manifest and permissions, network surface,
  persistence, bundled SDKs, native code
- `features/` — one file per feature area
- `tools/` — one file per user-facing tool (utility apps)
- `limitations.md` — what you could not verify or decode
- `evidence-bundle.json` — machine-extracted facts backing the claims
  (optional)

## Coverage

Every row must link to where the surface is covered, or say
`n/a — <why>`. A row may not be left blank: if you didn't look, write
`not examined` — that is honest and tells the next analyst what is missing.

| Surface | Covered in |
| --- | --- |
| Identity & signing | |
| Components & exported surface | |
| Permissions | |
| Network & API surface | |
| SDKs, ads & trackers | |
| Native code & JNI | |
| Persistence & local data | |
| Protection & obfuscation | |
| Embedded config & shipped secrets | |
| Monetization | |
| Feature inventory | |
| Updates & dynamic delivery | |
| Privacy | |

## Limitations

What this analysis could not establish — runtime behavior never observed,
undecoded blobs, tool failures, unchecked claims. Anything marked `unk`
belongs here too.
