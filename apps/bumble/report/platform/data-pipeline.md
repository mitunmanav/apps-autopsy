# Data Pipeline

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

How data moves, per static evidence. All flows are code-observed shape; runtime ordering [unk].

## Inbound [obs]
1. **User identity**: phone OTP (+ WhatsApp OTP receiver), Auth0 OAuth (multi-region), passkeys (`SERVER_PASSKEY_*`), Facebook/Google/Apple sign-in actions → BAPI access token → stored in shared-layer auth state [inf for storage loc].
2. **Discovery**: `LocationApi`/`SERVER_UPDATE_LOCATION_AND_GET_ENCOUNTERS` → encounter decks (`EncountersApi`/`VotesApi` or `SERVER_GET_ENCOUNTERS`) → card-stack UI (`CardStackView`, `voting.e` sealed variants).
3. **Match state**: match list via B4F `ConnectApi`/Stream (no `SERVER_GET_MATCHES` verb) + `SSEApi` push → match rows → chat unlock.
4. **Server push**: `SSEApi` v2 (`sseV2GetStream`) channel + FCM (`FirebaseMessagingService`) → notification payloads → `ModalNotificationsApi`/`NotificationsApi`.
5. **Feature flags/config**: `StatsigApi` + `SDKConfigApi` + `StateApi`/`FlowsApi`/`ConfigurationApi` → gate every premium surface [inf].
6. **CMS content**: Contentful CDN + `ContentCardsApi` (Braze cards) → dating-hub/help content.

## In-app state [obs]
- Room: `SpiderwebDatabase` offline command queue (`command_inner_entity`), Stream chat store, WorkManager jobs.
- DataStore + shared-counter native lib for cross-process counters; Settings/SP for prefs & consent.
- Appyx route models + sealed `voting.e` variants carry UI state in-memory.

## Outbound [obs]
1. **Votes/actions**: vote → `VotesApi`/`SERVER_ENCOUNTERS_VOTE` (+ `SERVER_MULTIPLE_ENCOUNTERS_VOTES` batch) → spiderweb queue if offline [inf].
2. **Chat**: legacy `chatoff` `SERVER_SEND_CHAT_MESSAGE` and/or Stream channel send [obs both stacks; which is live per-chat unk].
3. **Media upload**: `PhotoVerificationUploadService`, chat image upload services, profile photo upload — HTTP multipart to upload endpoints [inf].
4. **Purchases**: `OrdersApi`/`OrdersAlternativeApi`/`OrdersGoogleWalletApi` + `SERVER_VALIDATE_PURCHASE` → Play/Stripe/Braintree/dLocal/Wallet → receipt → server validation.
5. **Telemetry** (always-on, flag-gated): Snowplow collector, Firebase Analytics, Braze events, AppsFlyer attribution/conversion, Sentry crashes, Google DataTransport `offline_signal_*` buffer, Statsig exposure events, `datapoint` analytics buffer [obs presence; volume unk].
6. **Trust signals**: `requestExpressIntegrityToken` → `SERVER_SEND_ARKOSE_TOKEN`/`ENCRYPTED_DATA`; Play Integrity verdict → server [inf order].
7. **Elise ML**: WorkManager downloads model+vocab → local inference (no image/text leaves device for the model itself [inf]; inference-result telemetry separate).

## Key pipeline shapes
- **Vote → match → chat**: swipe vote posted (batch-capable); server returns match → chat entry unlocked → Stream/chatoff message loop; unread badges via OEM badge perms.
- **Paywall → purchase → entitlement**: trigger → `PaywallsApi`/`SERVER_GET_CONTEXTUAL_PAYWALL` → provider checkout → `SERVER_VALIDATE_PURCHASE`/`OrdersApi` → entitlement flag → feature unlock [inf chain; all parts obs].
- **Verify**: `SERVER_START_*` → capture (ML Kit face / Veriff SDK) → upload → `SERVER_CHECK_*` polling → badge.
