# Blocking features (focus_timer, app_limit, block_shorts, block_website, distracting_apps, zen_mode, productive_mode, c68)

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`

All OBS from decompile; every module = `data.data_source` (Room+_Impl) + `data.remote` (DTOs) + `domain.model` + `domain.use_case` + `presentation.*`.

## feature_focus_timer (387 classes)
Models: `FocusTimerSessionV7→V34`, `FocusTimerSessionStats(V20)`, `FocusTimerConfigV9→V34`, `FocusTimerAppRestriction`, `FocusTimerAllowedApps(V13)`, `FocusTimerEventData(V19)`, `FocusTimerSessionAppUsage`, `FocusTimerSessionDistractingAppUsage`, `FTUserTag`, `FtSessionWithTag`, `FTTagSummary`, `FocusStatsHeartBeatData`, `FocusStatsTodayAndWeeklyDTO`/`Weekly`, `FocusCompletedCumSumDateWise`, `FocusMilestoneData`, `FocusGuiltTripNotification`, `FocusPreview*`, `FocusWithOthersGroupInfo`, `FocusTimerSessionStats`, `OneDayFTStats(WithTags)`, `MusicFileLastPlayed`, `CacheInfo`, `CategoryImage*`, `FTReportShareData`, `FTSessionUIModel`, `FTWeeklyComparison`. Group models: `GroupMeta(Create|Edit|UIModel)`, `GroupMember(s)Response`, `GroupSearch*`, `GroupCategory(ExamDate)`, `GroupTheme`, `GroupPreference`, `GroupWeekLeaderboard(Stats|Response)`, `GroupTopCurrentFocusingMembers`, `GroupLiveFocusData`, `GroupNudgeEntity`, `GroupReactionEntity`, `GroupsPinned`, `InactiveMember*`, `KickMemberResponse`, `GenerateInviteLinkResponse`, `InviteDetails`, `League(Details|Tier)`, `MockGroupMeta`, `PreviewMember`. Presentation: `after_session_groups_nudge`, `create_group_bs`, `join_invite_bs`, `worker` + all `focus_*`/`group_*`/`league_*` routes. APIs `/fg/*` (~25 endpoints). Workers `SyncGroupRankWorker`, `NotificationAndWidgetUpdateWorker`, `FocusTimerSessionEndReceiver`. MediaPlayerService = session music.

## feature_app_limit
`AppLimit(V10/V11/V12)`, `AppLimitChange`, `AddAppLimitReminder`, `AppReminderSetting`, `CoinLedger`, `GameReward`, `GameOverlayData`, `StreakSuccessOverlayData`, `SettingsOrigin`. DB `AppLimitDatabase`. Execution via `AppLimitWindowFactory` overlay + `b_l_nudge_screen`.

## feature_block_shorts
`BlockFeatureSetting`, `BlockFeatureUIDetails`, `BlockFeaturePostNavigationAction(Adapter)`, `a…g` per-feed configs; `BlockShortsOverlayActivity`; detection in monitor service (see monitoring-engine).

## feature_block_website
`BlockedWebsiteConfig`, `BWDetails`, `BlockedDomainDetails`, `BWDomainUIModel`, `BWOrigin`; DTOs `BWUrlsDto`, `BWCategoryDto`, `BWSearchResultDto`; `/wb/*` APIs; `ContentBlockWindowFactory` + `b_w_overlay`.

## feature_distracting_apps
`DistractingApps` entity + `DistractingAppsDatabase`; picker routes; feeds every blocking feature.

## feature_zen_mode
`ZenModeConfigV7`, `ZenModeConfigOld`, `ZenModeDayWiseOld`, `ZenModeUIModel`, `ZenModeDatabase`; `ZenModeAlarmReceiver`; `checkZenMode`/`startZenMode`/`stopZenMode` on monitor.

## feature_productive_mode
`ProductiveModeDataBase` + all PM/YT models + `/pm/*` APIs + `PMTagOverlayActivity`/`PMFloatingButtonService`/`PMYTOrigin`; scrape methods in monitor.

## feature_c68
`C68AlarmActivity`/`Service`/`Receiver`/`SnoozeReceiver`/`RestoreReceiver`, `C68AlarmMediaRestoreWorker`, `EndTesterProPassWorker`, `PassExpiryNotificationReceiver`, `ProPassClaimResponse`, `/fg/pro_pass/*`; `suppressC68Notification` in listener.
