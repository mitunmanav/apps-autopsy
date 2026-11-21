# UI infra & shell modules (widget, floating_bubble, broadcastReceivers, workers, services, regainapp-shell)

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`

All OBS.

## widget
9 receivers (`AppUsage`, `FocusTimer`, `StudyGoal`, `RegaGoal`, `StudyCalendar`, `ProPass`, `PhoneUnlockCount`, `ProPassWidgetRestore`, `NotificationAndWidgetUpdate`) + `GlanceRemoteViewsService` + 9 `@xml/*_widget_info`; Glance compositions deep-link to routes.

## floating_bubble
`FTOverlayService`, `PMFloatingButtonService`, `ActiveBlocksFloatingButtonService` — SYSTEM_ALERT_WINDOW compose bubbles.

## broadcastReceivers
`RegainDeviceAdminReceiver` (force-lock), `BootCompletedReceiver`, `AppStartReceiver`, `AppRemovedReceiver`, `PackageChangeReceiver`, `ScreenOnOffReceiver`, `UserPresentReceiver`, `NotificationAndWidgetUpdateReceiver`, `NavigationReceiver`, `ShareReceiver`, `ShareDismissReceiver`, `DiagnosticsReceiver`, `FocusTimerSessionEndReceiver`, `C68Alarm*` receivers, `HandleEducationAppNotification`, `ZenModeAlarmReceiver`, `PassExpiryNotificationReceiver`, `ProPassWidgetRestoreReceiver`, `StudyStamp*`, `AppLimit*` receivers, `PhoneUnlock*` — ~33 app receivers; all guarded by `DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` where custom.

## workers
`ai.blox100.workers.*` (36): `DailyUsageSaveToDbWorker`, `CheckUsageEventWorker`, `SendAppUsageEventToServerWorker`, `SyncAppCategoryToDBWorker`, `SyncGroupRankWorker`, `UpdateReferralCountWorker`, `UpdateGroupReferralCountWorker`, `NotificationAndWidgetUpdateWorker`, `NetworkLogsCleanupWorker`, `CheckNBServiceFixingWorker`, `CheckServiceFixingWorker`, `AutoStartPermissionWorker`, `BackupDBWorker`, `OnDemandBackupWorker`, `UploadLogWorker`, `StudyStampSyncWorker`, `RatingFeedbackWorker`, `C68AlarmMediaRestoreWorker`, `EndTesterProPassWorker`, `C68AlarmRestoreWorker`(+RestoreReceiver), `ZenMode*`, `AppLimit*`, `FocusSchedule*`, `ProPassWidget*`, `WeeklyReport*`, `ImpactBanner*`, `ThemeSync*`, `CoinLedger*`, `Diagnostics*`, `InAppSurvey*`, `ExperimentEnroll*` + WorkManager infra (SystemForegroundService/SystemJobService/SystemAlarmService/RescheduleReceiver + Constraint proxies).

## services
`MyMonitorService`, `MyMonitorInAppBlockService`, `NotificationListener`, `MyFirebaseMessagingService`, `FocusTimerNotificationService`, `C68AlarmService`, `MediaPlayerService`, `RestoreBackupService`, `FTOverlayService`, `PMFloatingButtonService`, `ActiveBlocksFloatingButtonService`, `GlanceRemoteViewsService` — the 11 app services (rest = library FGS).

## regainapp-shell (`ai.regainapp.*`, 23 classes)
`R`, `showcase.MainActivity` (Showkase browser), `showcase.CustomBrowserActivity`, `cache.ResponseCacheDatabase`, `payments.*` (`CheckoutActivity`, `PaymentsFileProvider`, order/subscription/invoice models) — thin brand shell over `ai.blox100`.
