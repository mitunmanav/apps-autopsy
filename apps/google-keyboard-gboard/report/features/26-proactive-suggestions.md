# Proactive Assistance, Personal Context & autofill

## Proactive Assistance

- `libs.proactivesuggestion.{ProactiveSuggestionsHolderView, ProactiveSuggestionsClippableHolderView}` — SurfaceView-hosted proactive-suggestion cards (Gemini).
- `enable_close_proactive_suggestions_access_point`, `enable_close_proactive_suggestions_access_point` + "With Proactive Assistance, Gemini shows you personalized suggestions right when you need them" (`0x7f1402cb`) — **Proactive Assistance**: contextual suggestion cards.
- `enable_proactive_emoji_kitchen`, `enable_contextual_*` — proactive content.

## Personal Context (ACE)

- Permissions: `PERSONAL_CONTEXT_PUBLISH_HINTS`, `PERSONAL_CONTEXT_RECEIVE_INSIGHTS`, `PERSONAL_CONTEXT_HOST_INSIGHT_SURFACE` — Gboard is a **Personal Context provider and surface host**.
- `com.android.personalcontext.ace.client.prototype.clientaction.{TextPasteParams, SharePhotoParams, ShareLiveLocationParams, ShowCardsParams, FullScreenRequestParams, UnknownParams}` — the insight action types Gboard can render: **paste text, share a photo, share live location, show rich cards, request fullscreen**.
- `ace.common.result.AceActivityResultReceiver`, `ace.client.prototype.richcard.RichCardError` — activity-result + rich-card plumbing.
- `enable_personal_context_energy_shader_animation`, `enable_personal_context_energy_shader_google_colors` — the Personal Context "energy shader" animation on the toolbar.

This is the **App Functions Context Engine** integration: apps/Assistant surface contextual actions inside Gboard (e.g., "share this photo" suggestions driven by Gemini/App Functions).

## Autofill & inline suggestions

- `libraries.inputmethod.inlinesuggestion.InlineSuggestionScrubSpaceMotionEventHandler` + `enable_inline_suggestions_{on_client_side,space_animation_only,space_tooltip}`, `enable_inline_suggestions_with_ac_from_crank_cifg` — **inline autofill-style completions** rendered in the strip.
- `enable_autofill_ime_integration`, `allow_always_on_autofill_in_apps`, `enable_auto_fill_pk_fallback_ui` — Autofill framework integration ("Use Autofill with Google", "Autofill suggestions are now above your keyboard").
- `enable_email_provider_completion` — email completion provider.
- `disable_inline_suggestions` — kill switch.

## SuperInsert

- `libs.superinsert.impl.{SuperInsertKeyboard, SuperInsertKeyboardPanel, SuperInsertKeyboardVk, SuperInsertEditText, SuperInsertExtensionView, FrameLayoutWithHeightRatio, FrameLayoutWithNoOutline, ReversibleFrameLayout}` — **SuperInsert**: a rich insertion keyboard/panel (search-box style edit field inside the keyboard that inserts formatted content into apps).
- "search box is not created yet", `roleDescription`, `getText(...)` — accessibility + text plumbing.

## Edit tracker & keyhound

Covered in [19-text-editing](19-text-editing.md) — `EditTrackingImeWrapper`, `InputActionFileProvider` export typing action records.
