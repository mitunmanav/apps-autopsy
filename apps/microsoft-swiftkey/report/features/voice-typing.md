# Voice typing (standard + multi-modal)

Evidence: manifest `RECORD_AUDIO`, `<queries>` on `android.speech.RecognitionService`; `com.swiftkey.voice.*`; layouts `multi_modal_voice_layout.xml`, `keyboard_voice_*`; strings `voice_*`; `VoiceDebugOptionsActivity`.

## Components

- `com.swiftkey.voice.VoiceInputServiceHelper` — bound service; binder `x50.y`; used by the keyboard to host/manage speech sessions.
- `com.swiftkey.voice.VoiceInputHelperActivity` — helper activity (permission prompts, fallback UI).
- `com.swiftkey.voice.VoiceDebugOptionsActivity` — internal debug options for voice.
- `com.swiftkey.ui.component.BottomSheetLottieVoiceAnimationView`, `com.swiftkey.voice.LottieVoiceMicrophoneView` — Lottie-animated mic UI.
- `res/layout/multi_modal_voice_layout.xml` — **multi-modal voice** UI: you can keep typing with the keyboard while the mic listens (`whisper_voice_typing_walkthrough_message`: "Keep typing anytime while the mic is on").

## Behavior (from strings)

- `voice_input` "Voice typing"; `voice_tap_to_speak`, `voice_speak_now`, `voice_listening`, `voice_loading`.
- Per-language support: `voice_language_button_content_description`, `voice_no_languages_enabled`, `voice_language_not_available`/`_not_supported_toast`.
- Permission gate: `voice_typing_no_permission` — RECORD_AUDIO required; `GetRuntimePermissionActivity` handles the runtime request.
- Provider: `<queries>` targets `android.speech.RecognitionService` → uses the platform speech recognizer (Google Speech Services on most devices) for "regular voice" [inferred from `whisper_voice_typing_regular_voice` label].
- `multimodal_google_consented` — user consent flag for multi-modal (Google-powered) voice.
- `voice_toolbar_education_message` — "Try the new voice experience" upsell to AI voice.
- Voice toggle on keyboard: `voice_toggle_content_description`, mic key in themes (`icon_microphone`).

## Two voice modes

1. **Regular voice** — platform `RecognitionService` (network-backed speech-to-text).
2. **AI voice (Whisper)** — on-device; see `whisper-ai-voice.md`.
