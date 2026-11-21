# Whisper — on-device AI voice typing

Evidence: strings `whisper_*` (23); `_work/jadx-base/sources/af0/e.java` (module provider loading); `assets/appconfig/` entries; ONNX Runtime libs; Play dynamic-module plumbing.

## What it is

OpenAI-Whisper-style on-device speech recognition, shipped as an **on-demand Play dynamic feature module** ("Whisper"). Replaces the platform recognizer when installed+enabled — better accuracy, formatting and punctuation per marketing strings ("latest AI voice typing for better accuracy, formatting and punctuation").

## Delivery & loading

- `af0/e.java`: `Class.forName("com.swiftkey.whisper.DefaultWhisperModuleProvider")` → cast to `com.touchtype.whisper.WhisperModuleProvider`. If class lookup fails → "Whisper module not installed" → trigger SplitInstall download. Log tag `WhisperContract`.
- Download UX strings: `whisper_download_title` "Setting up AI voice", `whisper_download_message` ("Downloading AI voice %1$s of %2$s"), `whisper_download_pending`, `whisper_download_installing` "Installing AI voice…", `whisper_download_interrupted`, `whisper_download_failed`, `whisper_download_cancel`.
- Model runs through **ONNX Runtime** (`libonnxruntime.so` + `ai.onnxruntime` JNI) on-device [inferred — Whisper inference needs the bundled runtime; no other bundled model consumer observed].
- `whisper_module_title` "Whisper"; `whisper_limited_preview` "Limited preview" — gated/flagged rollout.

## UX

- `whisper_voice_typing_setting_title` "AI voice typing" / subtitle "Use on-device AI for voice typing" — user toggle in voice settings.
- Walkthrough steps: tap mic → speak → refine → review transcript → tap tick to transcribe (`whisper_voice_typing_walkthrough_*`).
- `ai_voice_onboarding_animation.json` (res/raw Lottie) — onboarding animation.
- Multi-modal: keyboard stays usable while mic is on (`multi_modal_voice_layout.xml`).

## Privacy angle

On-device — speech does not leave the device (contrast with "regular voice" via platform recognizer). The model download is the only network step [inferred].

## Unknowns

- Exact model variant/size — downloaded at install time, not in the APK.
- Whether NPU/GPU acceleration is used — `OnnxRuntime.getAvailableProviders` is queried at runtime.
