# Feature: Settings, Travel & Snooze

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

## UI entry [obs]
- `com.bumble.app.settings2` + `travel` packages; `ConsentManagementToolActivity` (Sourcepoint reshow), blockers/security/support entries

## Param model [obs]
- `SERVER_GET_APP_SETTINGS`/`SERVER_GET_USER_AND_APP_SETTINGS`, `SERVER_SAVE_APP_SETTINGS`, `SERVER_GET_SEARCH_SETTINGS`, `SERVER_SAVE_SEARCH_SETTINGS`
- Travel: `REQUEST_SET_TRAVEL_LOCATION` param + `LocationApi` B4F
- Snooze: `SnoozeActionReasonOptionsInner` model + pause-state strings
- Incognito: `bumble_settings_incognito_tooltip`, `INCOGNITO` product, badge-suppression string
- Consent: `SERVER_SOURCEPOINT_INITIALIZE`, `SERVER_SAVE_SOURCEPOINT_CONSENT`, `SERVER_SOURCEPOINT_RESHOW_CONSENT`

## Execution path [obs names]
- Settings read/write via server-verbs; search filters feed `EncountersApi`/`SERVER_GET_ENCOUNTERS`
- Travel sets a virtual location → deck for that location
- Snooze pauses account visibility (server-side flag [inf])
- Blockers: blocked-users list management (safety feature)

## Local vs remote
- Remote: all state truth; local: prefs caches, consent record copy [inf].

## Premium gates [obs]
- Travel + incognito = subscription features (see `tools/`); filters advanced-tier gated [inf].

## Input → output
- In: preference edits → Out: server-persisted state affecting decks, visibility, notifications.
