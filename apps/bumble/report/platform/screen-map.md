# Screen Map (static)

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

Built from: 222 manifest activities + route/NavTarget classes + screen-named classes. [inf] grouping; exact in-app reachability [unk].

## Entry / shell
- `BumbleLauncherActivity` (launcher) → `Bumble2MainActivity` (exported shell hosting route-driven UI) — [obs both exported]
- `DeeplinkLandingActivity`, `GoogleAdsDeeplinkLandingActivity`, `AdsDeeplinkActivity` — external entry routers
- `com.bumble.app.ui.oauth.BumbleOAuthChromeTabsResultActivity` — OAuth return
- `ConsentManagementToolActivity` — CMP screen

## Core modes (activities, [obs])
- **Encounters/discovery**: `DiscoveryScreenFeature`, `CardStackView`, `voting.e` variants, `encounters` package screens, `InstantMatch`, `SuperCompatible`, `ScratchCard`, `Spotlight` screens
- **Dating hub**: `DatingHubActivity` + experiences/share classes
- **Chat**: chat activities + `SendComplimentFeature`, `PrivateDetectorSender/Receiver` screens, `ReviewBeforeSend` route, `QuestionGame` screens, video-call UI (`IncomingCallActivity`, call screen with `TextureViewRenderer`s)
- **Profile**: `profile_editor` screens, `ProfileViewer`, prompts, `screenstories`
- **Matches**: `matchscreen` (com.bumble2), connections/`connections` list, beeline (`beeline` pkg = liked-you grid), beemail
- **Verification**: photo-verification screens, Veriff SDK screens (SDK-internal), student-email verification
- **Settings**: `settings2` screens — search settings/filters, notifications, incognito, snooze, travel, blockers, security, support
- **Paywall/promo**: `com.bumble2.paywall` + `StripePaymentRoute`, contextual/instant paywall screens, flash-sale/promo blocks
- **Speed dating**: `speeddating` package screens + opt-in/out
- **BFF**: collective/hive screens, discovery-home, join requests
- **Support/safety**: `support`, `reportuser`, content-moderation/ban screens, help hub

## Route model layer [obs]
`*.Route`/`NoteInternalRoute`/`StripePaymentRoute` + Appyx navmodel classes → typed in-app navigation for newer screens; legacy screens reached via Activity intents.

## Notes
- Compose `PreviewActivity` exported = dev tooling shipped (harmless) [obs].
- Screen↔screen transitions live in obfuscated nav delegates — edges are [inf] from package proximity + route names, not proven flows.
- Full 222-activity list: `.work/activitys.txt` (working artifact, kept outside report per evidence-keeping).
