# SDK / Third-Party Inventory

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2` (+ splits as stamped in README).

Sources: manifest `<meta-data>`/components [obs], DEX string tables + class packages [obs], assets (`ArkoseLabsAPI.html`, `braze-html-in-app-message-bridge.js`) [obs].

## Confirmed by manifest meta-data or components [obs]
- **Firebase**: Analytics, Messaging (`FirebaseMessagingService` subclasses + `FirebaseInstanceIdReceiver`), Installations, Transport (Crashlytics transport classes)
- **Google Play services**: auth/signin (`RevocationBoundService`), location, maps (`com.google.android.gms.maps`), ads (AdMob `com.google.android.gms.ads.APPLICATION_ID` meta + `android.ext.adservices`), wallet, `tflite` dynamite client, Finsky install-referrer (`BIND_GET_INSTALL_REFERRER_SERVICE` perm)
- **ML Kit** face detection (`com.google.mlkit.vision.face`)
- **Play Billing** (`com.android.vending.BILLING`)
- **Facebook SDK**: `FacebookContentProvider`, `CustomTabActivity`, `fbconnect://` CCT scheme, app-id meta-data
- **AppsFlyer**: `MultipleInstallBroadcastReceiver` (INSTALL_PACKAGES-guarded), OneLink host `bumble.onelink.me`, conversion/install strings
- **Braze**: `sdk.iad-01.braze.com` endpoints, `braze-html-in-app-message-bridge.js`, `braze-html-bridge.js`, `iamcache` paths, `SERVER_GET_BRAZE_AUTH_DATA`
- **Sentry**: `libsentry(-android).so`, DSN string, init + performance ContentProviders
- **Stream Chat** (`io.getstream`): contract models in `com.bumble2`, Stream SDK presence (providers/receiver/`io.getstream` classes — no `stream_chat_*` DDL found in strings), push delegate
- **Veriff**: `libveriffyuv.so`, `magic.veriff.me` session host, signature-level `VERIFF_STATUS_BROADCAST_PERMISSION`, `SERVER_GET_VERIFF_SESSION`
- **Auth0**: `com.auth0.android.provider.RedirectActivity`, multi-env hosts `auth{,-stage,-dev}.cloud.bumble.com` + EU variants
- **Spotify** auth: `RedirectUriReceiverActivity`, `bumble://spotify`, spotify package query
- **Sourcepoint CMP**: consent strings + `SERVER_SOURCEPOINT_INITIALIZE`/`SAVE_SOURCEPOINT_CONSENT`/`RESHOW_CONSENT`
- **Snowplow**: `com-bumble-prod1.collector.snplow.net` collector
- **Statsig**: SDK + `StatsigApi` B4F service (feature flags/experiments) [inf for usage, obs for presence]

## Payment SDKs [obs]
- **Stripe**: `com.bumble2.paywall` Stripe models + `WebViewBridge`, `StripePaymentRoute`
- **Braintree/PayPal**: `BraintreeBrowserSwitchActivity`, `com.bumble.app.braintree` scheme, venmo/paypal package queries, authorization strings
- **dLocal**: `DLocalProfilerParams`, `SERVER_GET_PAYMENT_PROVIDER_BANKS`
- **Google Wallet**: `OrdersGoogleWalletApi` B4F service
- Carrier billing strings (`inappservices_silent` endpoints) [obs strings; activation unk]

## Media/security/misc [obs]
- **WebRTC (org.webrtc)**: `libjingle_peerconnection`, `WebRtcService`, `TextureViewRenderer`
- **Arkose Labs**: `client-api` endpoints, `ArkoseLabsAPI.html` asset, `SERVER_SEND_ARKOSE_TOKEN`/`ENCRYPTED_DATA` — bot defense; generic captcha fallback (`SERVER_GET_CAPTCHA`, `CAPTCHA_CONTEXTS`, `CaptchaActivity`)
- **Play Integrity**: `com.google.android.play.core.integrity.*`, `ExpressIntegrityService`, `IntegrityTokenRequest{nonce=}`
- **Au10tix**: `com.au10tix.sdk.service.LivenessRecordingService` (manifest, mediaProjection FGS) + `SDK_TYPE_AU10TIX` — second IDV/liveness vendor alongside Veriff
- **ThreatMetrix (LexisNexis)**: `MINOR_FEATURE_THREATMETRIX_DEVICE_PROFILING`, `payments.flows.payment.profiling.*` classes, `handshake.probity.io` endpoint, JS fingerprint bridge — payment-time device profiling
- **Contentful** CDN (cms content), **Giphy**, **Glide**, **Lottie**, **CameraX**, **WorkManager**, **DataStore**, **Biometric**, **ProfileInstaller**, **androidx Appyx navigation**, **Huawei ads-identifier** (HMS fallback [inf])
- `logz.io` token string [obs — likely leftover/logging backend, usage unk]

## Notes
- Many SDKs appear only via manifest/strings; actual runtime enablement is flag-gated (Statsig) [unk per-SDK].
- All integration claims are presence-of-shipped-code, not proof of activation.
