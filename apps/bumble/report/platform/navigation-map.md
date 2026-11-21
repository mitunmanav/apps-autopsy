# Navigation Map (static)

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

Edges marked **[obs]** = declared in manifest (intent filters) or route classes; **[inf]** = inferred from package/route names + call-site strings; **[unk]** = resolved inside obfuscated router.

## External → app entries [obs]
```
Android launcher ──> BumbleLauncherActivity ──> (routes) ──> Bumble2MainActivity / feature screens
https://bumble.com|m.bumble.com/u/* ──> DeeplinkLandingActivity ──> landto router ──> profile/screen
https://t.cloud.bumble.com/f/open-in-app ──> DeeplinkLandingActivity
bumble://landto/* , bumble_sib:// , bumbleads:// , bumblesib:// ──> internal router
bumble://oauthimport ──> OAuth import flow          bumble://spotify ──> Spotify link flow
bumble2ads://campaign ──> AdsDeeplinkActivity        fbconnect://cct.com.bumble.app ──> Facebook CCT
auth*.cloud.bumble.com ──> Auth0 RedirectActivity    com.bumble.app.braintree:// ──> Braintree return
spotify auth return ──> RedirectUriReceiverActivity  GoogleAds links ──> GoogleAdsDeeplinkLandingActivity
whatsapp otp ──> WhatsAppOtpReceiverActivity
```

## In-app primary flow [inf]
```
Launcher ──> mode root (Dating hub / Encounters)
   Encounters ──> person profile ──> chat / report / share
              ──> match boom (matchscreen) ──> chat
   Chat list ──> conversation ──> video/voice call (WebRtcService)
            ──> private-detector warning ──> review-before-send
   Beeline grid ──> profile ──> swipe
   Paywall (contextual/instant/route) ──> provider checkout ──> back with entitlement
   Settings ──> filters / travel / incognito / snooze / verification / blockers / support
   Verification prompts ──> photo-verification │ Veriff ID │ student email
   Speed dating lobby ──> session ──> matches
   BFF collective ──> hive feed ──> post/comment/video room
```

## Mechanism [obs]
- Deep links funnel through `landto` router → typed `Route` models (Appyx) → Compose screens, or legacy Activity intents.
- `Bumble2MainActivity` delegates entirely to injected route graph [obs — decompile shows only lifecycle/dispatch methods].
- Internal deep links also reachable via notifications (`ModalNotificationsApi`) and promo blocks.

## Unknowns
- The `landto` router's table is obfuscated → specific URL→screen bindings [unk].
- Backstack/tab structure of `Bumble2MainActivity` [unk].
