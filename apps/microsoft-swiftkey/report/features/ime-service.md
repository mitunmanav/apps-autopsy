# Keyboard IME core — `com.touchtype.KeyboardService`

Evidence: REA `inspect_android_class` `ev_b97d4dc6…`; decompile `_work/jadx-base/sources/com/touchtype/KeyboardService.java`; `j70/r3.java`; manifest `BIND_INPUT_METHOD` service; `res/xml/method.xml`.

## Wiring

- `KeyboardService extends Hilt_KeyboardService` → Dagger-Hilt injection point; `InputMethodService` subclass.
- `method.xml` declares it as the device IME: `isDefault=@bool/im_is_default`, `settingsActivity=com.touchtype.LauncherActivityFromSystemSettings`, `supportsInlineSuggestions="true"`, `suppressesSpellChecker="true"`.
- `onCreate()` sets theme `R.style.InputMethodNoForceDarkTheme` (opts out of force-dark), installs a Jetpack **LifecycleRegistry** (`f2`) + **SavedStateRegistry** (`xa.e`), and tags the window decor view with `ViewTreeLifecycleOwner`/`ViewTreeSavedStateRegistryOwner` (`z1.p`, `kg.a.F`) so **Compose can run inside the IME window**.
- `g3` (`j70.g3`) wraps window/decor access; `ta0.c` field named `directBootModel` — **Direct Boot support**: the keyboard can run before first unlock (consistent with `coreApp="true"` and `LockScreenWatcher`).

## Delegate pattern

All lifecycle/input calls forward to `delegate = j70.r3`, which itself forwards to an `h3` implementation (`f19537e`) selected at runtime:

| Service hook | Forwarded to |
|---|---|
| `onComputeInsets` | `r3.j()` — controls visible/touchable inset region |
| `onCreateInputView` | `r3.w()` — builds the keyboard view tree |
| `onCreateExtractTextView` | `r3.m()` — fullscreen extract view |
| `onCreateCandidatesView` | returns `null` — **candidate bar lives inside the input view**, not the IMS candidates API |
| `onCreateInlineSuggestionsRequest` / `onInlineSuggestionsResponse` | `r3.i()` / `r3.f()` — Android 11+ **inline autofill suggestions** strip |
| `onCurrentInputMethodSubtypeChanged` | `r3.q()` — language/layout switching |
| `onEvaluateFullscreenMode` / `onEvaluateInputViewShown` / `onShowInputRequested` | delegate — landscape fullscreen extraction policy |
| `onKeyDown`/`onKeyUp`/`j(int,boolean)` | delegate — **hard-keyboard key events** |
| `onUpdateCursorAnchorInfo` (`g(CursorAnchorInfo)`) | delegate — cursor/composition tracking for prediction |
| `onExtractedDeleteText` | `r3.l()` — extracted-text deletion |
| `onBindInput`/`onFinishInput`/`onFinishInputView`/`onWindowShown`/`onTrimMemory`/`onConfigurationChanged`/`onConfigureWindow`/`onUnbindInput`/`onUpdateSelection`/`onViewClicked`/`onUpdateCursor` | delegate — full IMS surface |

Inside `r3.e()` the delegate factory wires, among others: `PostureDefinitionModel` (BiBo posture definitions — full/one-hand/thumb/float postures), `KeyboardSizingParametersModel` (BiBo sizing params), Fluency service binding, `wj0.o` (posture wiring), `ob0.l1` (sizing), `fj0.j`.

## Supporting classes

- `com.touchtype.keyboard.service.LockScreenWatcher` — BroadcastReceiver on `ACTION_USER_PRESENT`/screen state; on unlock calls `b0Var.p0("onScreenUnlock", …)` — keyboard re-renders/notifies when device unlocks (toolbar shows "Unlock your device to view" padlock while locked).
- `com.touchtype.keyboard.view.frames.*` — `KeyboardFrame`, `BackgroundFrame`, `ImageFrame`, `NavigationBarBackgroundView`, `PerformanceMeasuringFrameLayout` — the measured frame tree that renders keyboard + nav-bar background.
- `getCandidatesHiddenVisibility() = 8` (GONE).
- `onEvaluateInputViewShown` is delegated — SwiftKey controls when the input view counts as visible (candidate/emoji panels).

## Notes & unknowns

- No custom `onEvaluateInputViewShown` override semantics observed beyond delegate forwarding.
- Inline suggestions: declared support only; which provider (Google autofill) renders slices is runtime-determined.
- Direct-boot model class `ta0.c` is injected — device-protected storage handling for predictions before unlock is [inferred] from naming + `coreApp`.
