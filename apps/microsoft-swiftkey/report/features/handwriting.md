# Handwriting recognition

Evidence: `libhwr_jni.so` exports (`readelf`), `_work/jadx-base/sources/com/microsoft/hwr/` classes, `pref_handwriting_timeout_key`, `pref_chinese_input_handwriting_timeout_key`, `key_education_handwriting_quick_switch_key`.

## What it is

On-device handwriting input (write characters with finger/stylus; they convert to text). Primarily surfaced for CJK input — the education string says "Press and hold the bottom left button to switch to handwriting mode" and the timeout pref lives under `prefs_typing_chinese_input`.

## JNI surface (`libhwr_jni.so`, arm64)

| Export | Role |
|---|---|
| `Java_com_microsoft_hwr_LibHwrLoader_init` | library init |
| `Java_com_microsoft_hwr_Recognizer_init` / `createContext` / `close` | recognizer lifecycle; creates a recognition context |
| `Java_com_microsoft_hwr_Context_addStroke` | feed a stroke (sequence of points) |
| `Java_com_microsoft_hwr_Context_setGuide` | set guide/baseline geometry for the writing area |
| `Java_com_microsoft_hwr_Context_process` | run recognition |
| `Java_com_microsoft_hwr_Context_getResults` | fetch candidate strings |
| `Java_com_microsoft_hwr_Context_reset` / `close` | session cleanup |

Java classes: `com.microsoft.hwr.{Recognizer, Context, Result, Point, LibHwrLoader, ModelCorruptException}` — `ModelCorruptException` implies model files validated on load (model assets ship per-language; Chinese handwriting models download with the pack [inferred]).

## Behavior details

- Timeout preference (`pref_handwriting_timeout_key`, `pref_chinese_input_handwriting_timeout_key`) — how long after the last stroke before auto-recognition commits.
- `setGuide` indicates lined-guide rendering on the writing surface.
- Results feed the same candidate bar as typed predictions [inferred].

## Unknowns

- Which languages get handwriting — models ship inside language packs; the manifest layout list suggests CJK (Chinese zh, and possibly Japanese).
- Whether recognition is fully on-device: `libhwr_jni` is the only engine; no handwriting network endpoint was observed → on-device.
