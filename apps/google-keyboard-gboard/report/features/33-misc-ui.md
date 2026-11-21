# Misc UI features — Morse, search, voice IME & NGA

## Morse code

- `latin.keyboard.MorseKeyboard` + `latin.keyboard.widget.LatinMorseFixedCountCandidatesHolderView` — **Morse code keyboard** (dot/dash keys → candidate list).
- `languageselection.preference.MorseKeyComboPreference` — Morse key-combo accessibility setting.
- Known Gboard accessibility feature; dit/dah entry with timing-based character decode.

## Search keyboard

- `apps.inputmethod.libs.search` — the in-keyboard search/expression surfaces: `GifSearchKeyboard`, `GifKeyboardTablet`, `GifKeyboardM2`, `CustomStickerTabKeyboard`, `AccessorySymbolKeyboard`, `RichSymbol{Simplified,RecyclerView,KeyboardTablet}` — GIF search, sticker tabs, rich-symbol keyboards (see [13-stickers-gif-tenor](13-stickers-gif-tenor.md)).

## Voice IME & universal dictation

- `libs.voiceime.OnDevicePackDownloadWorker` — on-device voice-pack downloads (ties to [29-downloads](29-downloads-splits.md)).
- `libs.universaldictation.StartActivityForResult` — **universal dictation** surface (dictation available across keyboard types).
- `libs.genaivoice.{RewriteCommands, MobileBertIntentClassifier, Interpreter}` — **GenAI voice**: voice-driven rewrite commands classified by a MobileBERT intent model (native: `mobilebert_classifier_android_jni`, `rewrite_commands_android_jni`, `interpreter_android_jni`) — the voice twin of [09-writing-tools](09-writing-tools-jarvis.md).
- `libs.nga.{NgaInputManager, CorrectionsControllerNative, impl.preference.VoiceCommandsListFragment}` — **NGA (Next-Gen Assistant)**: assistant input manager + native corrections controller + settings list of voice commands.

## Gesture UI

- `libs.gestureui.{AbstractKeyboardLayoutHandler, AbstractGestureMotionEventHandler, GestureOverlayView}` — gesture UI base classes (spacebar cursor scrub lives in `motioneventhandler.scrubmove.*`, free cursor in [19-text-editing](19-text-editing.md)).
- `libs.correctiontransition.BeamTransitionView` — animated beam transition for suggestion corrections.
- `libs.dvrnn.BrellaReadinessChecker` — **DVRNN (deep variational RNN)** gated on Brella TF-runtime readiness — the neural decoder needs `libtensorflow_jni.so` (see [29-downloads](29-downloads-splits.md), [03-glide](03-glide-typing.md)).

## Embedded photo picker

- `embeddedphotopicker` — system photo picker embedded in keyboard surfaces (theme builder backgrounds, sticker creation, content paste).

## Widgets & skeleton UI

- `libraries.inputmethod.widgets`, `recyclerview`, `preferencewidgets`, `appcompat` — shared UI toolkit.
- `animatedview` — animated surfaces (onboarding GIFs `oscillating_ghost.gif`, `interstitial_*` assets).
- `popup` — key-popup/preview system (`enable_*_popup`, popup-in-popup-window flags).
- `lens` — Lens-style surfaces (see [15-scan-text-ocr](15-scan-text-ocr.md)).

## Small features confirmed via strings/flags

- **Access points toolbar** — `accesspoint.*` + `customized_order_*` — user-reorderable toolbar chips.
- **Rate us** — `rateus` module.
- **Onboarding** — `libs.onboardingflow` + `launcher.firstrun.*` pages + onboarding GIF assets.
- **Hints/education** — `hint.CentralizedHintManager` (one manager coordinates all hint bubbles), `stylus.education`, `enable_desktop_windowing_app_to_web_education`.
- **Sharing** — `libs.sharing.{SharingLinkReceiveActivity, GboardSharingSetupDonePage}` — Gboard link-receive + setup-done flows (see [32-workprofile-platform](32-workprofile-platform.md)).
- **Japanese prime keyboard** — `libs.japanese.{JapanesePrimeKeyboard, MonolithicCandidatesRecyclerView, FloatingMonolithicCandidatesRecyclerView, HorizontalCompressionTextView, MultiLabelPopupView, DragDetectionLayer}` — the full-screen Japanese candidate-strip keyboard.
- **Composing-text keyboard** — `composingtext.ComposingTextKeyboard` — keyboard bound to in-flight composing text.
- **Accessory indicator** — `accessory.indicator.BitmapTextView` — indicator glyph for accessory state.
- **WebP codec** — `webp.WebPJni` + encode/decode/timeout/file-too-large exceptions — native WebP for sticker/emoticon assets.
- **Module plumbing** — `module.ModuleManager`, `cache.module`, `accounts.checker`, `permissions.PermissionsActivity`, `metadata` package (40 `*Def`/JSON-adapter classes: `KeyboardDef`, `ImeDef`, `SoftKeyDef`, `KeyboardViewDef`, `KeyMappingDef`, `ActionDef`, `ProcessorsDef`… — the keyboard/IME **metadata deserialization** layer behind layout XMLs).
- **Keyhound input actions** — see [19-text-editing](19-text-editing.md).
- **Morse mic disabled** — voice input unavailable on Morse layout.
