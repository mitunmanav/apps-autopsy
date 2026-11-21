# Monitoring Engine (the enforcement core)

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Covers:** `services.MyMonitorService`, `services.MyMonitorInAppBlockService` · **Evidence:** `ev_afb349ab…` (class), `ev_b68dbf0c…` (monitor), decompile OBS

## MyMonitorService (OBS)
`Service implements b` (base `AbstractC2667f0`); coroutine scope `o0.v(C.f(), M.a)`; static state `f39221P0`(running), `Q0`, `f39222R0`, `f39223S0`, `f39224T0`, `f39225U0`, `f39226V0`; injected use-cases `f39227A0`…`f39260n0` (~30). Exported; FGS; orchestrator with ~40 event handlers: `handleAppLimitWindow`, `handleAppUsageEvent`, `handleAppBlockProtection`, `checkAppBlockProtection`, `onFocusSessionStarted/Ended`, `sendWeeklyFocusStats`, `sendAppUsageEvents`, `checkZenMode`, `checkC68Alarm`, `onAppInstalledEvent`, `onScreenTimeUpdate`, `onUserUnlocked`, `handleFloatingWindow`, `onAppLimitReached`, `onSessionTimeUpdate`, `notifyFocusSession`, `handleNotificationAndWidgetUpdate`, `updateAppWidget`, `checkNBServiceFixing`, `logHeartBeatInMixPanel`, `checkAutoStartPermission`…; receivers `NotificationAndWidgetUpdateReceiver`, `AppStartReceiver`, `AppRemovedReceiver`, `PackageChangeReceiver`, `ScreenOnOffReceiver`, `UserPresentReceiver` feed it.

## MyMonitorInAppBlockService (OBS — the blocker)
`AccessibilityService` (`typeAllMask`, `canRetrieveWindowContent`, `reportViewIds`, `retrieveInteractiveWindows`, 500ms). Dual sensing: accessibility events + `UsageStats` merged via `getBestEvent(AccessibilityEvent, UsageEvents$Event)`; `computeUsageStatsExpiry` = now+60 000 refresh. ~200 methods:
- **Foreground resolution:** `getForegroundPackageDetails`, `getForegroundAppType`, `getCurrentTopPackage`, `resolveTopPackage`, `getBestEvent`
- **App blocking:** `checkAppLevelBlocking`, `handleAppLevelBlocking`, `getAppLevelBlocking`, `performAppLevelBlocking`, `onAppLevelBlocking`
- **Limits:** `handleAppLimitWindow`, `getAppLimitWindowData`, `checkAppLimitReached`
- **Shorts/reels:** `getIsShortsFeedVisible`, `getIsReelsScrollCountLimitReached`, `checkReelsScrollCount`, `getReelsScrollCount`, `performScrollActions`, `handleShortsFeed`, `handleInstagramFeed`, `getIsInstagramReelsFeedVisible`, `getIsInstagramSearchFeedVisible`, `isAccessibilityGestureDetected`, `computeScrollCount*`
- **Websites/browser:** `trackDomainChange`, `handleBrowserTabs`, `closeCurrentTab`, `isBrowserDomainValid`, `getCurrentBrowserPackage`
- **Productive/YouTube:** `dumpChannelNameText`, `dumpTitleText`, `dumpVideoText`, `isSearchValid`, `getIsYoutubeStudyMode`
- **Anti-evasion:** `checkSplitScreenWindow`, `isSplitScreenWindow`, `isFloatingWindow`, `handleFloatingWindow`, `performBackPress`, `performClickAction`, `performGlobalAction`, `closeCurrentTab`
- **C68/uninstall guards:** `handleC68AlarmGuard`, `checkC68PendingAlarmGuard`, `handleAppBlockProtection`
Overlay outputs: `AppLimitWindowFactory`, `BlockProtectionWindowFactory`, `ContentBlockWindowFactory` → `OverlayActivity*`, `BlockShortsOverlayActivity`, `PMTagOverlayActivity`, `BlockProtectionActivity`.
INF: per-feed selectors and block rules are bundled constants (no remote signature feed observed).

## Data flow
Event → merge best event → route to per-feature handler → overlay/back/tab-close OR record EventData/AppUsage → analytics + DB.
