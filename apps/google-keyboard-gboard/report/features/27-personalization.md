# Personalization — learning from usage

## What it learns

> "Improve typing and voice typing based on your Gboard usage patterns and corrections. Transcripts of what you say and type will be saved on this device. You can delete them anytime…" (`0x7f140c3a`)

- **Personalization toggle** — Settings → Privacy → "Personalize for you" (`pref_key_use_personalized_dicts`, `settings_header_privacy`).
- **Delight5 personalized data** — `enable_backup_delight5_personalized_data`: learned LM backed up.
- **Learned corrections** — `correction_learning_jni`, `enable_biasing_for_past_corrections`, `enable_biasing_for_contacts_learned_from_past_corrections` — autocorrect & dictation learn from your fixes.
- **Contact biasing** — `enable_biasing_for_contacts*`, `enable_learn_name_biasing`, `enable_user_contact_biasing`, `enable_p13n_contact_phone` — contact names bias dictation/prediction.
- **Punctuation/casing personalization** — `enable_p13n_{post_processing,punctuation_case}`.
- **Personalized neural rescoring** — `enable_personalized_neural_rescoring_model_loader` — a per-user rescorer.
- **User feature cache** — `libraries.inputmethod.userfeaturecache` + `enable_user_feature_cache`, `enable_ufc_for_{offset,speed}`, `enable_export_ufc` — the on-device feature store.
- **Top-bar banner** — `enable_personalize_top_bar{,_for_customized_user}`, `personalize_top_bar_{banner_shown_times,last_check_time}` — prompt to opt in.
- **Conversation-aware** — `enable_conversation_id_module`, `enable_persist_language_for_conversation_id`, `use_dominating_conv_id`, `enable_conversation_id_in_training_cache` — per-conversation context/language.
- **Customized order** — `customized_order_personalize_*` — toolbar order personalization.
- **Voice personalization (Rambler)** — see rambler doc.

## Data lifecycle

- "Delete learned words and data" — wipes Delight5 dynamic LM, user history, personalization store (typed-number confirm).
- `disable_correction_storage` — stop storing corrections.
- Incognito mode suspends learning (`shouldEnableLearning=%s` decoder arg).
- `enable_delete_user_dictionary_typos` — periodic typo cleanup.
- Account removal clears account-keyed stores (`AccountRemovedBroadcastReceiver`).
- `enable_expression_data_pruning`, `enable_mdd_metadata_cleanup`, `enable_sqlite_release_memory` — retention hygiene.
