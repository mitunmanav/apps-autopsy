# 22 — Native Code & JNI

Evidence: JNI analysis view `ev_be453578…9b445` (parent `ev_d1029b99…dff318`), archive `ev_fec9a360…57e179f`.

**JNI summary (verified counts):** APK-root DEX scan covering **all 3 root DEX entries** — 26,688 classes / 155,659 methods examined → **62 native declarations**, **124 ABI bindings** (62 × 2 ABIs): **48 matched, 26 ambiguous, 50 unknown** to the 9 shipped libraries. Matched = name-compatible candidates only — it does **not** establish `loadLibrary`, `RegisterNatives`, or actual invocation; dynamic registration and runtime-loaded dex (`audience_network.dex`) are outside this view.

## .so inventory

| Library | ABIs | JNI decls | Role |
|---|---|---|---|
| `libTmsdk-2.0.13-mfr.so` | arm64-v8a, armeabi | ~30 | Tencent Tmsdk scan engine — `miuiengine.util.a` (23 natives), `.e` (5), `.f` (2): native junk-scan/file-stat for cleaner |
| `libdce-1.1.19-mfr.so` | arm64-v8a, armeabi | ~18 | CleanMaster `com.xiaomi.util.{a,b,c,e,f}` — native scan/hash helpers |
| `liberrno-lib.so` | arm64-v8a, armeabi | 2 | `com.github.mjdev.libaums.ErrNo` → errno bridge for USB OTG |
| `libixiaomifileu.so` | arm64-v8a, armeabi | few | Xiaomi file util (fast stat/copy?) — `com.xiaomi.util`-adjacent |
| `libixiaomifileuext.so` | arm64-v8a, armeabi | few | extended file util natives |
| `assets/bspatch` | ELF binary | — | bsdiff patcher for delta self-updates (doc 20) |
| `assets/audience_network.dex` | dex | — | dynamically loaded FB AN dex (doc 18) |

## JNI bindings (grouped)

- **`com.github.mjdev.libaums.ErrNo`** → `liberrno-lib.so`: `getErrno`/`getErr` style natives translating libaums USB I/O failures.
- **`miuiengine.util.{a,e,f}`** → `libTmsdk-*.so`: ~30 native declarations — init/version/scan-file/stat-hash entry points used by cleaner scanners (SystemCache/MemoryScannerV2 paths).
- **`com.xiaomi.util.{a,b,c,e,f}`** → `libdce-*.so` + `libixiaomifileu{ext}.so`: file walk/hash/dir-stat natives.
- **`ndk_lzma.UnLzma`** → LZMA decode (`unLzma`, `unLzmaDirectly`) for 7z/lzma archives (doc 04) — implementation embedded in one of the file-util libs or an unnamed static lib.
- **`com.google.android.gms` NativeOnCompleteListener-ish decls** — gms native hooks (minor).

## Loading

- `System.loadLibrary` calls inside `Util`/engine init (obfuscated `com.xiaomi.util`/`miuiengine` static blocks).
- `assets/bspatch` is an **executable copied out and exec'd** (not loadLibrary) — delta patch application spawns the binary.

## Security notes

- Native libs expose raw file-walk primitives — used by cleaner (doc 09) under whitelist protection.
- `bspatch` exec surface: writes patched APK to files dir before install intent — exec'd with `Process`/`Runtime` (inferred from asset-shipping pattern; exec site not fully traced).
- No network natives observed (HTTP stays Java-side).

## Unknowns

- Exact per-library exported symbol lists (binding table from REA only; nm-level export list not dumped).
- Whether Tmsdk/DCE natives run on global builds at all (load may be gated to MIUI devices) — load-gate not fully traced.
- LZMA lib home (which .so carries UnLzma) — binding shows the JNI class; library attribution approximate.
