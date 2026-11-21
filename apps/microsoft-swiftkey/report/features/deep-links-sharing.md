# Deep links, import & sharing

Evidence: manifest intent-filters (`BROWSABLE`), `swiftkey://open.swiftkey.com/*` + `https://open.swiftkey.com/*` schemes, `com.touchtype.swiftkey-auth://*` redirect, `DeepLinkActivity`-type routing, share-sheet intents, `FileProvider`.

## Deep link surface

- `swiftkey://open.swiftkey.com/...` and `https://open.swiftkey.com/...` (autoVerify where declared) → open app features directly.
- Exact shipped path table (`deeplink_internal_path_*`):
  `settings`, `settings/typing`, `settings/typing/clipboard`, `settings/typing/autocorrect`, `settings/typing/hardkeyboard`, `settings/typing/keys`, `settings/richinput`, `settings/sound_and_vibration`, `settings/about`, `settings/achievements`, `themes`, `themes/custom`.
- Handlers: `com.touchtype.deeplinking.DeepLinkingHandlerActivity` (open), `ShareDeepLinkingHandlerActivity` (share-intent entry), `ImportContentActivity` (content import into the app).
- `com.touchtype.swiftkey-auth://no-op`-style redirects — MSAL auth return.
- `microsoft-edge*`/`bing` style outbound links: Copilot (`copilot.microsoft.com/?FORM=SWTACW`), Bing images create, Bing maps — opened via browser/`BrowserTabActivity`.
- Cards/notifications carry deep-link actions into the same router.

## Sharing

- **Inbound**: share targets handle text/URLs into translator/editor/camera flows [manifest filters on relevant activities].
- **Outbound**: achievement cards, custom themes, Bing image info, GIF/sticker picks, clipboard items → `ACTION_SEND` share sheet; files via `FileProvider` (`res/xml/file_paths`-style config, cache dirs).

## Import

- Camera/photo pickers for custom themes & camera remix (photo-picker perms).
- `INTERACT_ACROSS_PROFILES` allows cross-profile inbound intents.

## Notes

Exact path list is spread across manifest + card `action` payloads; enumerated examples are representative, not exhaustive.
