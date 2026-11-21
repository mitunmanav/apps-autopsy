# Manifest and component inventory
> [Observation] Artifact: base.apk
> [Observation] Package: com.easybrain.arrow.puzzle.game
> [Observation] SHA-256: 3e86c708abeb06ae7885f9bdf0d4d4c149f8a7b4a90580eb6e07e5e5540b97f0

## Manifest facts
- [Observation] The parsed manifest has complete source coverage for 185 components: 132 activities, 17 providers, 17 services and 19 receivers.
- [Observation] SplashActivity has three complete intent filters: MAIN/LAUNCHER; VIEW with custom scheme easybrainarrowpuzzlegame; and VIEW with scheme easybrain and hosts launch_com.easybrain.arrow.puzzle.game, sandbox_com.easybrain.arrow.puzzle.game, and analyticscheck_com.easybrain.arrow.puzzle.game.
- [Observation] TemplateActivity is exported with a MAIN filter and Unity metadata unityplayer.UnityActivity and android.notch_support.
- [Unknown] exported=null is retained as unknown; no value is inferred from manifest defaults.
- [Observation] Evidence: ev_eb75665b4fbe44e9f940251b4656910f0a5dd0cfdcea556f86796884a300fc72; component page ev_384e911dc14c55bd8f239f6b0da1cfd74ce55182582aeae00d6d0a1fd42bfbbe.

## All declared components (185)

| [Observation] Kind | [Observation] Name | [Observation] exported | [Observation] default | [Observation] actions | [Observation] categories | [Observation] authorities | [Observation] permission | [Observation] filters/data | [Observation] declaration coverage |
|---|---|---:|---:|---|---|---|---|---|---|
| [Observation] activity | com.easybrain.template.TemplateActivity | true | true | android.intent.action.MAIN | — | — | — | act=android.intent.action.MAIN | complete |
| [Observation] activity | com.easybrain.template.SplashActivity | true | true | android.intent.action.MAIN, android.intent.action.VIEW | android.intent.category.LAUNCHER, android.intent.category.DEFAULT, android.intent.category.BROWSABLE | — | — | act=android.intent.action.MAIN; cat=android.intent.category.LAUNCHER<br>act=android.intent.action.VIEW; cat=android.intent.category.DEFAULT,android.intent.category.BROWSABLE; data=easybrainarrowpuzzlegame<br>act=android.intent.action.VIEW; cat=android.intent.category.DEFAULT,android.intent.category.BROWSABLE; data=easybrain://launch_com.easybrain.arrow.puzzle.game,easybrain://sandbox_com.easybrain.arrow.puzzle.game,easybrain://analyticscheck_com.easybrain.arrow.puzzle.game | complete |
| [Observation] activity | zendesk.support.guide.HelpCenterActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | zendesk.support.guide.ViewArticleActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | zendesk.support.request.RequestActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | zendesk.support.requestlist.RequestListActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.amazon.device.ads.DTBInterstitialActivity | true | false | — | — | — | — | — | complete |
| [Observation] activity | com.amazon.device.ads.DTBAdActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.inmobi.ads.rendering.InMobiAdActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.google.android.gms.ads.AdActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | io.bidmachine.nativead.view.VideoPlayerActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.explorestack.iab.mraid.MraidActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.explorestack.iab.vast.activity.VastActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | io.bidmachine.rendering.ad.fullscreen.FullScreenActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.applovin.adview.AppLovinFullscreenActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.facebook.ads.AudienceNetworkActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.ironsource.sdk.controller.ControllerActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.ironsource.sdk.controller.InterstitialActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.mbridge.msdk.reward.player.MBRewardVideoActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.applovin.mediation.hybridAds.MaxHybridMRecAdActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.applovin.mediation.hybridAds.MaxHybridNativeAdActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.google.android.gms.ads.NotificationHandlerActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.google.android.gms.common.api.GoogleApiActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.bytedance.sdk.openadsdk.activity.TTDelegateActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.ironsource.sdk.controller.OpenUrlActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.ironsource.mediationsdk.testSuite.TestSuiteActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.mbridge.msdk.newreward.player.MBRewardVideoActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | sg.bigo.ads.ad.splash.AdSplashActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | sg.bigo.ads.ad.splash.LandscapeAdSplashActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | sg.bigo.ads.api.AdActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | sg.bigo.ads.api.LandingStyleableActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | sg.bigo.ads.api.LandscapeAdActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | sg.bigo.ads.api.CompanionAdActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | sg.bigo.ads.api.LandscapeCompanionAdActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | sg.bigo.ads.core.mraid.MraidVideoActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.chartboost.sdk.view.CBImpressionActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.chartboost.sdk.internal.clickthrough.EmbeddedBrowserActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.chartboost.sdk.view.FullscreenAdActivity | false | false | — | — | — | — | — | complete |
| [Observation] provider | com.easybrain.modules.ModulesInitializer | false | false | — | — | com.easybrain.arrow.puzzle.game.IdentificationInitializer | — | — | complete |
| [Observation] activity | com.android.billingclient.api.ProxyBillingActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.easybrain.rate.ui.RateActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] service | com.easybrain.fcm.FcmMessagingService | false | true | com.google.firebase.MESSAGING_EVENT | — | — | — | act=com.google.firebase.MESSAGING_EVENT | complete |
| [Observation] activity | com.easybrain.crosspromo.ui.CrossPromoActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.easybrain.consent2.ui.consent.ConsentActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] service | com.easybrain.lifecycle.session.SessionService | false | false | — | — | — | — | — | complete |
| [Observation] receiver | com.easybrain.AppVisibilityReceiver | true | true | com.easybrain.APP_VISIBILITY_ACTION | — | — | — | act=com.easybrain.APP_VISIBILITY_ACTION | complete |
| [Observation] receiver | zendesk.support.DeepLinkingBroadcastReceiver | false | true | zendesk.support | — | — | — | act=zendesk.support | complete |
| [Observation] provider | zendesk.support.SupportSdkStartupProvider | false | false | — | — | com.easybrain.arrow.puzzle.game.zendesk.support.SupportSdkStartupProvider | — | — | complete |
| [Observation] activity | com.adsurge.adn.ads.activity.AdActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.adsurge.adn.ads.activity.PortraitAdActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.adsurge.adn.ads.activity.LandscapeAdActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.adsurge.adn.ads.activity.TranslucentAdActivity | false | false | — | — | — | — | — | complete |
| [Observation] service | com.chartboost.sdk.internal.video.repository.exoplayer.VideoRepositoryDownloadService | false | true | com.google.android.exoplayer.downloadService.action.RESTART | android.intent.category.DEFAULT | — | — | act=com.google.android.exoplayer.downloadService.action.RESTART; cat=android.intent.category.DEFAULT | complete |
| [Observation] provider | zendesk.support.guide.GuideSdkStartupProvider | false | false | — | — | com.easybrain.arrow.puzzle.game.zendesk.support.GuideSdkStartupProvider | — | — | complete |
| [Observation] activity | zendesk.classic.messaging.MessagingActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.inmobi.ads.rendering.InMobiInAppBrowserActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.unity3d.services.ads.adunit.AdUnitActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.unity3d.services.ads.adunit.AdUnitTransparentActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.unity3d.services.ads.adunit.AdUnitTransparentSoftwareActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.unity3d.services.ads.adunit.AdUnitSoftwareActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.unity3d.ads.adplayer.FullScreenWebViewDisplay | false | false | — | — | — | — | — | complete |
| [Observation] provider | androidx.startup.InitializationProvider | false | false | — | — | com.easybrain.arrow.puzzle.game.androidx-startup | — | — | complete |
| [Observation] provider | com.google.android.gms.ads.MobileAdsInitProvider | false | false | — | — | com.easybrain.arrow.puzzle.game.mobileadsinitprovider | — | — | complete |
| [Observation] service | com.google.android.gms.ads.AdService | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.google.android.gms.ads.OutOfContextTestingActivity | false | false | — | — | — | — | — | complete |
| [Observation] service | com.google.firebase.components.ComponentDiscoveryService | false | false | — | — | — | — | — | complete |
| [Observation] service | com.google.firebase.sessions.SessionLifecycleService | false | false | — | — | — | — | — | complete |
| [Observation] receiver | com.google.firebase.iid.FirebaseInstanceIdReceiver | true | true | com.google.android.c2dm.intent.RECEIVE | — | — | com.google.android.c2dm.permission.SEND | act=com.google.android.c2dm.intent.RECEIVE | complete |
| [Observation] service | com.google.firebase.messaging.FirebaseMessagingService | false | true | com.google.firebase.MESSAGING_EVENT | — | — | — | act=com.google.firebase.MESSAGING_EVENT | complete |
| [Observation] provider | com.facebook.ads.AudienceNetworkContentProvider | false | false | — | — | com.easybrain.arrow.puzzle.game.AudienceNetworkContentProvider | — | — | complete |
| [Observation] provider | com.google.android.gms.games.provider.PlayGamesInitProvider | false | false | — | — | com.easybrain.arrow.puzzle.game.playgamesinitprovider | — | — | complete |
| [Observation] activity | com.google.android.gms.games.internal.v2.resolution.GamesResolutionActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.google.android.gms.games.internal.v2.appshortcuts.PlayGamesAppShortcutsActivity | true | false | — | — | — | — | — | complete |
| [Observation] activity | com.android.billingclient.api.ProxyBillingActivityV2 | false | false | — | — | — | — | — | complete |
| [Observation] provider | com.applovin.sdk.AppLovinInitProvider | false | false | — | — | com.easybrain.arrow.puzzle.game.applovininitprovider | — | — | complete |
| [Observation] activity | com.applovin.adview.AppLovinFullscreenImmersiveActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.applovin.sdk.AppLovinWebViewActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.applovin.mediation.MaxDebuggerActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.applovin.mediation.MaxDebuggerDetailActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.applovin.mediation.MaxDebuggerMultiAdActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.applovin.mediation.MaxDebuggerAdUnitsListActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.applovin.mediation.MaxDebuggerAdUnitDetailActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.applovin.mediation.MaxDebuggerCmpNetworksListActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.applovin.mediation.MaxDebuggerTcfInfoListActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.applovin.mediation.MaxDebuggerTcfStringActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.applovin.mediation.MaxDebuggerTestModeNetworkActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.applovin.mediation.MaxDebuggerUnifiedFlowActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.applovin.mediation.MaxDebuggerWaterfallSegmentsActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.applovin.mediation.MaxDebuggerAxonEventsListActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.applovin.creative.MaxCreativeDebuggerActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] service | com.applovin.impl.adview.activity.FullscreenAdService | false | false | — | — | — | — | — | complete |
| [Observation] service | com.applovin.impl.adview.activity.AppRestartDuringAdDetectionService | false | false | — | — | — | — | — | complete |
| [Observation] receiver | com.google.android.gms.measurement.AppMeasurementReceiver | false | false | — | — | — | — | — | complete |
| [Observation] service | com.google.android.gms.measurement.AppMeasurementService | false | false | — | — | — | — | — | complete |
| [Observation] service | com.google.android.gms.measurement.AppMeasurementJobService | false | false | — | — | — | android.permission.BIND_JOB_SERVICE | — | complete |
| [Observation] provider | io.bidmachine.BidMachineInitProvider | false | false | — | — | com.easybrain.arrow.puzzle.game.bidmachineinitprovider | — | — | complete |
| [Observation] receiver | com.facebook.CurrentAccessTokenExpirationBroadcastReceiver | false | true | com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED | — | — | — | act=com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED | complete |
| [Observation] receiver | com.facebook.AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver | false | true | com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED | — | — | — | act=com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED | complete |
| [Observation] provider | zendesk.core.MediaFileProvider | false | false | — | — | com.easybrain.arrow.puzzle.game.zendesk.sdk.user.attachments | — | — | complete |
| [Observation] service | androidx.work.impl.background.systemalarm.SystemAlarmService | false | false | — | — | — | — | — | complete |
| [Observation] service | androidx.work.impl.background.systemjob.SystemJobService | true | false | — | — | — | android.permission.BIND_JOB_SERVICE | — | complete |
| [Observation] service | androidx.work.impl.foreground.SystemForegroundService | false | false | — | — | — | — | — | complete |
| [Observation] receiver | androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver | false | false | — | — | — | — | — | complete |
| [Observation] receiver | androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy | false | true | android.intent.action.ACTION_POWER_CONNECTED, android.intent.action.ACTION_POWER_DISCONNECTED | — | — | — | act=android.intent.action.ACTION_POWER_CONNECTED,android.intent.action.ACTION_POWER_DISCONNECTED | complete |
| [Observation] receiver | androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy | false | true | android.intent.action.BATTERY_OKAY, android.intent.action.BATTERY_LOW | — | — | — | act=android.intent.action.BATTERY_OKAY,android.intent.action.BATTERY_LOW | complete |
| [Observation] receiver | androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy | false | true | android.intent.action.DEVICE_STORAGE_LOW, android.intent.action.DEVICE_STORAGE_OK | — | — | — | act=android.intent.action.DEVICE_STORAGE_LOW,android.intent.action.DEVICE_STORAGE_OK | complete |
| [Observation] receiver | androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy | false | true | android.net.conn.CONNECTIVITY_CHANGE | — | — | — | act=android.net.conn.CONNECTIVITY_CHANGE | complete |
| [Observation] receiver | androidx.work.impl.background.systemalarm.RescheduleReceiver | false | true | android.intent.action.BOOT_COMPLETED, android.intent.action.TIME_SET, android.intent.action.TIMEZONE_CHANGED | — | — | — | act=android.intent.action.BOOT_COMPLETED,android.intent.action.TIME_SET,android.intent.action.TIMEZONE_CHANGED | complete |
| [Observation] receiver | androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver | false | true | androidx.work.impl.background.systemalarm.UpdateProxies | — | — | — | act=androidx.work.impl.background.systemalarm.UpdateProxies | complete |
| [Observation] receiver | androidx.work.impl.diagnostics.DiagnosticsReceiver | true | true | androidx.work.diagnostics.REQUEST_DIAGNOSTICS | — | — | android.permission.DUMP | act=androidx.work.diagnostics.REQUEST_DIAGNOSTICS | complete |
| [Observation] activity | com.vungle.ads.internal.ui.VungleActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] provider | com.vungle.ads.VungleProvider | false | false | — | — | com.easybrain.arrow.puzzle.game.vungle-provider | — | — | complete |
| [Observation] activity | com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdTransActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.bytedance.sdk.openadsdk.activity.TTRewardWebActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.bytedance.sdk.openadsdk.activity.TTFullWebActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.bytedance.sdk.openadsdk.activity.single.TTRewardExpressVideoActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.bytedance.sdk.openadsdk.activity.single.TTFullScreenExpressVideoActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.bytedance.sdk.openadsdk.activity.single.TTAdActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | io.bidmachine.rendering.ad.view.ExpandActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | io.bidmachine.iab.mraid.MraidActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | io.bidmachine.iab.vast.activity.VastActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] service | androidx.room.MultiInstanceInvalidationService | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.unity3d.ironsourceads.internal.services.InlineStoreActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] provider | com.ironsource.lifecycle.IronsourceLifecycleProvider | false | false | — | — | com.easybrain.arrow.puzzle.game.IronsourceLifecycleProvider | — | — | complete |
| [Observation] provider | com.ironsource.lifecycle.LevelPlayActivityLifecycleProvider | false | false | — | — | com.easybrain.arrow.puzzle.game.LevelPlayActivityLifecycleProvider | — | — | complete |
| [Observation] provider | com.squareup.picasso.PicassoProvider | false | false | — | — | com.easybrain.arrow.puzzle.game.com.squareup.picasso | — | — | complete |
| [Observation] activity | net.pubnative.lite.sdk.consent.UserConsentActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | net.pubnative.lite.sdk.interstitial.activity.MraidInterstitialActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | net.pubnative.lite.sdk.interstitial.activity.VastInterstitialActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | net.pubnative.lite.sdk.rewarded.activity.MraidRewardedActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | net.pubnative.lite.sdk.rewarded.activity.VastRewardedActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | net.pubnative.lite.sdk.contentinfo.AdFeedbackActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | net.pubnative.lite.sdk.utils.browser.BrowserActivity | false | false | — | — | — | — | — | complete |
| [Observation] service | com.google.android.datatransport.runtime.backends.TransportBackendDiscovery | false | false | — | — | — | — | — | complete |
| [Observation] receiver | androidx.profileinstaller.ProfileInstallReceiver | true | true | androidx.profileinstaller.action.INSTALL_PROFILE, androidx.profileinstaller.action.SKIP_FILE, androidx.profileinstaller.action.SAVE_PROFILE, androidx.profileinstaller.action.BENCHMARK_OPERATION | — | — | android.permission.DUMP | act=androidx.profileinstaller.action.INSTALL_PROFILE<br>act=androidx.profileinstaller.action.SKIP_FILE<br>act=androidx.profileinstaller.action.SAVE_PROFILE<br>act=androidx.profileinstaller.action.BENCHMARK_OPERATION | complete |
| [Observation] activity | com.smaato.sdk.ng.consent.UserConsentActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.smaato.sdk.ng.interstitial.activity.MraidInterstitialActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.smaato.sdk.ng.interstitial.activity.VastInterstitialActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.smaato.sdk.ng.rewarded.activity.MraidRewardedActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.smaato.sdk.ng.rewarded.activity.VastRewardedActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.smaato.sdk.ng.contentinfo.AdFeedbackActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.smaato.sdk.ng.utils.browser.BrowserActivity | false | false | — | — | — | — | — | complete |
| [Observation] service | com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService | false | false | — | — | — | android.permission.BIND_JOB_SERVICE | — | complete |
| [Observation] receiver | com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.fyber.inneractive.sdk.activities.InternalStoreWebpageActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.fyber.inneractive.sdk.activities.FyberReportAdActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | com.amazon.aps.ads.activity.ApsInterstitialActivity | true | false | — | — | — | — | — | complete |
| [Observation] provider | sg.bigo.ads.controller.provider.BigoAdsProvider | false | false | — | — | com.easybrain.arrow.puzzle.game.BigoAdsProvider | — | — | complete |
| [Observation] activity | sg.bigo.ads.controller.form.AdFormActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] activity | sg.bigo.ads.api.PopupAdActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] receiver | com.unity.androidnotifications.UnityNotificationManager | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.google.games.bridge.GenericResolutionActivity | false | false | — | — | — | — | — | complete |
| [Observation] provider | com.adjust.sdk.SystemLifecycleContentProvider | false | false | — | — | com.easybrain.arrow.puzzle.game.adjust-lifecycle-provider | — | — | complete |
| [Observation] provider | com.mbridge.msdk.config.component.status.MBComponentLifecycleProvider | false | false | — | — | com.easybrain.arrow.puzzle.game.mbcomponentlifcycleprovider | — | — | complete |
| [Observation] activity | com.mbridge.msdk.config.activity.MBRewardVideoActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.mbridge.msdk.activity.MBCommonActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.mbridge.msdk.out.LoadingActivity | unknown | false | — | — | — | — | — | complete |
| [Observation] receiver | com.mbridge.msdk.foundation.same.broadcast.NetWorkChangeReceiver | true | true | android.net.conn.CONNECTIVITY_CHANGE | — | — | — | act=android.net.conn.CONNECTIVITY_CHANGE | complete |
| [Observation] activity | com.ogury.ad.interstitial.ui.InterstitialActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.ogury.ad.interstitial.ui.InterstitialAndroid8TransparentActivity | false | false | — | — | — | — | — | complete |
| [Observation] activity | com.ogury.ad.interstitial.ui.InterstitialAndroid8RotableActivity | false | false | — | — | — | — | — | complete |
| [Observation] receiver | com.ogury.core.internal.LogEnablerReceiver | true | true | com.ogury.sdk.intent.ENABLE_LOGS | — | — | — | act=com.ogury.sdk.intent.ENABLE_LOGS | complete |
| [Observation] activity | com.google.android.play.core.common.PlayCoreDialogWrapperActivity | false | false | — | — | — | — | — | complete |
