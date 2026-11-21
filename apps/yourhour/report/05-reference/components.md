# Reference — Complete Component Inventory

**162 declared components** (REA `ev_7580c011…f834`): 104 activities + **2 activity-alias**
+ 21 services + 28 receivers + 7 providers. (Earlier count of 160 folded the aliases into
activities.)

## Export & permission map (REA-verified)

21 components are explicitly `exported=true`. Permission-guarded (8):
`ReelDetectorAccessibilityService` (`BIND_ACCESSIBILITY_SERVICE`), `YourHourAdminReceiver`
(`BIND_DEVICE_ADMIN`), `GlanceRemoteViewsService` (`BIND_REMOTEVIEWS`),
`RevocationBoundService` (GMS `REVOCATION_NOTIFICATION`), `FirebaseInstanceIdReceiver`
(`c2dm.SEND`), `SystemJobService` (`BIND_JOB_SERVICE`), `DiagnosticsReceiver` +
`ProfileInstallReceiver` (`android.permission.DUMP`, signature-level).

**Unprotected exported (13)**: `SplashActivity`, `DefaultAlias`, `AlternateAlias`,
`BootCompletedReceiver`, `UnlockWidgetProvider`, `TodayUsageWidgetProvider`,
`DailySummaryWidgetProvider`, **`RefreshUsageDataReceiver`**, **`UsageTimerService`**,
`CustomTabActivity` (Facebook), **`CropImageActivity`** (cropper), `GenericIdpActivity`,
`RecaptchaActivity` (Firebase auth). See `04-security/attack-surface.md`.

Non-exported with intent filters: `NotificationReceiver` (FCM), `WidgetSystemReceiver` (6
actions: boot/pkg-replaced/time/date/tz/locale), `MyPackageReplacedReceiver`,
`FirebaseMessagingService`, `RescheduleReceiver`,
Facebook `CurrentAccessTokenExpirationBroadcastReceiver` +
`AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver`.

## App activities (80) — `com.mindefy.phoneaddiction.mobilepe.*`

| Feature | Activities |
|---|---|
| Core | `YourHour` (app class), `dashboard.DashboardActivity`, `home.HomeActivity`, `home.BaseActivity`, `home.splash.SplashActivity`*, `home.todayUsage.TodayUsageActivity`, `home.topApps.TopAppActivity`, `home.addictionLevel.compose.AddictionLevelComposeActivity`, `home.feed.FeedActivity` |
| Apps | `apps.report.AppUsageReportActivity`, `apps.settings.AppSettingsActivity` |
| Categories | `category.{create,custom,report,settings,update}.*Activity` (5) |
| Challenges | `challenge.BaseChallengeActivity`, `challenge.{create,custom,manage,update}.{CreateChallenge,CreateCustomChallenge,ManageChallenge,UpdateCustomChallenge,UpdateScheduleChallenge}Activity` (6) |
| Reports | `report.{daily.{DailyReport,DailyUsageReport},daily.statistics.DayStatistics,daily.pdf.compose.DailyReportPdfCompose*,weekly.{WeeklyUsageReport},weekly.statistics.WeekStatistic,weekly.pdf.compose.WeeklyReportCapturablePdf*,monthly.statistics.MonthStatistics,monthly.pdf.compose.MonthlyReportCapturablePdf,timeline.compose.TimelineCompose,manage.Statistic,carbonFootprint.CarbonFootprint}Activity` + `BaseStatisticsActivity` (13) |
| Profile/badges | `profile.{manage.ManageProfile,update.{ProfileIcon,UpdateProfile},badge.{AppChallengeBadge,BadgeInfo,ChallengeBadge,HappyWeekMonthInfo},share.ShareBadge}Activity` (7) |
| Stories | `story.{create.CreateStory,filter.StoryFilter,manage.ManageStory,read.ReadStory}Activity` (4) |
| Parental | `parentalControl.ui.{ParentalControl*,ParentalControlOnboarding*,ParentalPremium*,ParentalSetting*,ForgetPin*}Activity` + `settings.parentalControl.{SetPin,ChangePin,EnterPin,PinLockInstruction,PinLockSettings}Activity` (10) |
| Settings | `settings.{aboutUs.AboutUs,alertSettings.AlertSettings,appearance.AppearanceSettings,blog.Blog,faq.{Faq,FaqCategory,GrantPermission},floatingTimer.FloatingTimerSettings,goal.GoalSettings,importExport.{ExportData,ImportData},language.LanguageSettings,manage.ManageSetting,manageApp.ManageApp,notification.NotificationSetting,overlay.{ChooseMindfulStyle,MindfulPauseSetting},purchases.PurchasesAndSubscriptions*,reelblocker.ReelBlockerSetting,translationCredit.TranslatorCredit}Activity` (19) |
| Intro/lifecycle | `intro.{NewIntro,Welcome}Activity`, `forceupdate.ForceUpdateActivity*` |
| Misc | `usagePattern.UsagePatternActivity`, `widget.WidgetEntryActivity`, `home.devConsole.{DeveloperConsole,BadgeTesting}Activity`, `offer` (worker, not activity) |

\* = exported. Aliases `DefaultAlias`/`AlternateAlias` = launcher icons.

**Previously undocumented**: `ParentalPremiumActivity` (dedicated TV-plan paywall),
`ShareBadgeActivity`, `UpdateProfileActivity`, `HappyWeekMonthInfoActivity`,
`GrantPermissionActivity` (re-permission flow), `PinLockInstructionActivity`,
`PinLockSettingsActivity` (PIN-lock hub), `TranslatorCreditActivity`,
`StoryFilterActivity`, `WidgetEntryActivity`, `AppearanceSettingsActivity`.

## App services (6) + jobs

`UsageTimerService` (exported FGS specialUse) · `SocialMediaOverlayService` ·
`ReelDetectorAccessibilityService` (exported, BIND_ACCESSIBILITY_SERVICE) ·
`DailyReportJobService` + `MyJobService` (BIND_JOB_SERVICE) · `NotificationReceiver` (FCM).

Workers: `ServiceHeartbeatWatchdogWorker`, `OnboardingMonitoringWorker`,
`SubscriptionOfferSyncWorker` (server offer sync), `MainEntitlementExpiryWorker`
(entitlement expiry), `WidgetRefreshWorker`, `WidgetDayBoundaryWorker`.

## App receivers (12) + 3 widget providers

`BootCompletedReceiver` · `ChallengeAlarmReminderReceiver` · `ChallengeReminderReceiver` ·
`DailyReportReceiver` · `WeeklyReportReceiver` · `OfferReceiver` · `OfferReminderReceiver` ·
`RefreshUsageAlertReceiver` · `RefreshUsageDataReceiver` · `ServiceHealthNotificationClickReceiver` ·
`ServiceHeartbeatReceiver` · `YourHourAdminReceiver` (BIND_DEVICE_ADMIN, empty policies) ·
`DailySummaryWidgetProvider`/`TodayUsageWidgetProvider`/`UnlockWidgetProvider` · `WidgetSystemReceiver`.

## App providers — none of its own; all 7 non-exported, authorities:

`mobilepe.provider` (androidx FileProvider) · `mobilepe.cropper.fileprovider` (CropFileProvider)
· `mobilepe.androidx-startup` (InitializationProvider) · `mobilepe.mobileadsinitprovider`
(MobileAdsInitProvider) · `mobilepe.AudienceNetworkContentProvider` (FAN) ·
`mobilepe.firebaseinitprovider` (FirebaseInitProvider) · `mobilepe.FacebookInitProvider`
(FacebookInitProvider)

## Third-party activities (24)

Billing `ProxyBilling{,V2}` · `CropImageActivity` · Facebook `CustomTab{,Main}`,`Facebook` ·
FAN `AudienceNetworkActivity` · GMS ads `AdActivity`, `NotificationHandlerActivity`,
`OutOfContextTestingActivity` · `SignInHubActivity`, `GoogleApiActivity` · Play Core
`PlayCoreDialogWrapperActivity` (in-app update dialog) · Firebase auth `GenericIdpActivity`,
`RecaptchaActivity` · credentials `HiddenActivity` · Glance `ActionTrampoline`,
`InvisibleActionTrampoline` · Unity `AdUnit{,Software,Transparent,TransparentSoftware}`,
`FullScreenWebViewDisplay` · `LicenseActivity` (pairip).

## Third-party services (15) + receivers (16) + providers (7)

WorkManager `SystemJobService`, `SystemForegroundService`, `RescheduleReceiver`,
`ForceStopRunnable`, `DiagnosticsReceiver` · Glance `RemoteViewsService`,
`MyPackageReplacedReceiver`, `UnmanagedSessionReceiver`, `ActionCallback` · Room
`MultiInstanceInvalidationService` · Firebase `MessagingService`, `SessionLifecycleService`,
`ComponentDiscoveryService`, `InstanceIdReceiver`, `InitProvider` · GMS `Measurement{Service,
JobService,Receiver}`, `AdService`, `AdService`-adjacent, `RevocationBoundService`,
datatransport `JobInfoScheduler`, `AlarmManagerScheduler`, `TransportBackendDiscovery` ·
credentials `CredentialProviderMetadataHolder` · profileinstaller `ProfileInstallReceiver` ·
Facebook `AuthenticationTokenManager`, `CurrentAccessTokenExpiration` receivers,
`FacebookInitProvider` · FAN `AudienceNetworkContentProvider` · GMS `MobileAdsInitProvider` ·
androidx `FileProvider`, `InitializationProvider` · `RemoteViewsCompatService`.
