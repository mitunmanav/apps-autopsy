# Limitations, Tool Failures & Unknowns

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`

## Tool failures (documented, per task)

| Failure | Impact |
|---|---|
| REA `inspect_android_package` initially failed — bundled `jadx-headless-mcp-0.7.1-all.jar` corrupt (truncated ZIP). Fixed by re-downloading the pinned release (SHA-256 `6e5eacf5…ff75`) into `~/.local/share/rea/android/`; provider then healthy. | Delayed start only; no coverage loss. |
| Local full-APK `jadx` died twice (silent kill, likely OOM under 6–9 GB WSL heap) before reaching `ai/` packages. | Mitigated: baksmali all 4 dexes (32,534 classes) + jadx on `classes.dex`+`classes3.dex` only → full app coverage. |
| jadx reported **423 method errors** (of ~29,572 classes) — typical for R8 output (invalid catch blocks, Kotlin metadata). | Per-method decompile gaps; mitigated by smali fallback for those methods. |
| `--workers` flag invalid on this jadx CLI (correct flag `-j`). | Command retried correctly; no impact. |
| REA `inspect_artifact` later reported `target_unavailable "No app is open"` | Transient session release; retained Evidence unaffected. |
| 6 of ~4,506 string-table entries unparsed (obfuscated arsc). | Negligible; strings re-extracted from smali/decompile instead. |
| `strings.xml` resources.arsc obfuscation → some resource names unreadable in apktool pass. | Values still readable; routes/URLs recovered from dex. |

## Structural unknowns (UNK — stated, not guessed)

- **Per-method coverage:** 423 jadx method errors + R8 inlining mean a few use-case bodies are only partially readable; behavior inferred from signatures/callers where bodies failed (marked INF).
- **Runtime-only facts unverifiable statically:** actual RemoteConfig flag values, feature-flag gating, experiment variants (`/auth/auth/experiment/enroll`), Jitsu/Mixpanel event taxonomies beyond enum names, FCM payload routes, actual paywall product IDs/SKUs (fetched at runtime), exact Pro-feature matrix per call site.
- **Server-side logic:** API endpoints reveal contracts, not server behavior (e.g., how `/tier/get_tier` classifies devices, how groups compute leaderboards).
- **Split APKs** out of scope by task (`base.apk` only analyzed); xxhdpi/arm64 splits inventoried but not deep-analyzed — their payloads are androidx libs + drawables only (OBS).
- **Signature authenticity** — v2/v3 present & self-consistent; REA does not verify certificate provenance → UNK.
- **Reflection/dynamic dispatch:** some monitor-service dispatch uses method-name strings (`z3` fields) — call graph partially reconstructed; INF where only string evidence exists.
- **`ai.regainapp.showcase`** MainActivity is a Showkase browser — its component gallery is generated code, not app features.
- **`resources.arsc` theme/style values** partially obfuscated; visual theming described at class level only.
- **Health Connect classes** bundled but no HC permission — dormant/unused (INF: transitive dep).
- **`ob_hammer/scene.html`** — animation scene asset, rendered inside a WebView during onboarding (INF; no runtime proof).

## Claims discipline

Every claim in this report is tagged OBS / INF / UNK. Where a mechanism rests on a single source (e.g., a constant string), it is marked INF even when plausible.
