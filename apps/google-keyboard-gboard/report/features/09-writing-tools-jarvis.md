# Writing Tools — Proofread & Rewrite (Jarvis)

## What it is

Gboard's generative Writing Tools (Proofread, Rewrite with style options) — codename **Jarvis**. Available as a toolbar keyboard (`JarvisKeyboard`) and a prompt composer (`jarvis.prompt.*`).

## UI classes

- `libs.jarvis.JarvisKeyboard` — the Writing-Tools keyboard surface (loads `KeyboardViewDef`, ViewSwitcher streaming UI, `StreamingTextView`, `FadeInTextView`, `MinHeightScrollView`, `ExtendBackgroundView`, `ColorfulScrollbarScrollView`).
- `libs.jarvis.prompt.{JarvisPromptKeyboard, JarvisPromptExtensionView, JarvisPromptDraftEditText, JarvisPromptFunctionView, JarvisPromptNotice, IJarvisPromptExtension}` — a **free-form prompt box**: users can type custom instructions ("make it sound friendly"), not just preset styles.
- `genai.conversational.{ConversationalRewritePrompterImpl, ModularPromptTemplates, InvalidPromptTemplateVersion}` — **conversational rewrite prompter** with modular prompt templates (`prompt_templates_android_jni`).
- "Super icon" in dynamic writing tools (`enable_super_icon_in_dynamic_writing_tools`, `enable_super_icon_in_bar_with_animation`, `enable_super_icon_show_toast`).

## Feature set (strings + flags)

- **Proofread**: "Proofread with Gboard", "Proofread your message", "New! Proofread with on-device AI", `enable_on_device_proofread`, `enable_writing_tools_log_with_proofread`.
- **Rewrite styles**: friendly, professional, elaborate (longer+details), concise, rephrase — strings `0x7f140700-712`; `enable_writing_tools_suggest_style`, `enable_writing_tools_style_view_select_anim`.
- **My Style / custom styles**: `enable_writing_tools_my_style`, `enable_writing_tools_my_style_plus{,_without_screen_context}` — user-defined rewrite personas; "plus" can read screen context.
- **Versions**: `enable_writing_tools_v2`, `enable_writing_tools_v2_on_toolbar`, `enable_writing_tools_v2_tutorial_prompts`, "Writing Tools V1.5 hybrid (PI + on-device) mode" (`enable_writing_tools_v1_training_cache`), "Writing Tools V2 in Gboard Settings or flags" (`0x7f1416e1`).
- **Cooperative mode**: `enable_writing_tools_cooperative_mode`, `…_ja` — collaborate/iterate on the rewrite.
- **Feedback**: `enable_writing_tools_thumb_up_and_down`, `enable_jarvis_thumb_down_feedback_flow`, `enable_unified_feedback_button`.
- **Replace button**: `enable_writing_tools_replace_button`, `…_fade_in_anim`.
- **Compact layout + item animations**: `enable_writing_tools_compact_layout`, `disable_writing_tools_item_move_animation`, `enable_writing_tools_item_view_expand_anim`, `enable_writing_tools_expand_label_animation_on_top_bar`, `enable_writing_tools_scroll_hint_anim`, `enable_writing_tools_decoration_anim`, `enable_writing_tools_style_views_fade_in_anim`.
- **Minors**: `enable_writing_tools_for_minors` — age-gated availability.
- **Guardrails**: "Can't proofread text in this field", "Proofread is not supported, please switch to on-screen keyboard", unsupported-language notices, "To proofread, connect to Wi-Fi" (model download), "Proofread is temporarily unavailable".
- **Voice commands**: `enable_writing_tools_voice_commands` — run Writing Tools by voice.
- **"Notice for calling AI models for Writing Tools"** + Private-AI-Compute notice (`0x7f14055f`) — the disclosure: *"With Google's Private AI Compute, your data is encrypted and processed in a private, dedicated space…"* — Writing Tools run **on-device (Gemma Nano / TF) or via Private AI Compute** depending on `enable_llm_pc*` flags.

## LLM routing

`enable_llm_pc`, `enable_llm_pc_flow_mode`, `enable_llm_pc_smart_retry`, `enable_gen_ai_delegate`, `enable_on_device_proofread` → routes between `GenAiDelegate` (on-device TF/Gemma) and Private AI Compute (confidential cloud), with `llm_pc_trigger_delay_after_nwp` tuning hand-off from the on-device NWP.

## Notes

Jarvis is the same engine family as Muse/Rambler (Gemini-class), surfaced as structured styles rather than free chat. The `prompt.` classes confirm a custom-prompt mode exists. All heavy inference is native-side (`GenAiDelegate.llm/llmInference/proofread`) or AICore PAC.
