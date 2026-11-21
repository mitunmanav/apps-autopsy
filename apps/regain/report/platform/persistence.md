# Persistence Layer

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`

## Room databases (OBS — `*_Database.java` + `_Impl` in decompile)

| Database | Entities / purpose |
|---|---|
| `BloxDatabase` | master DB: focus sessions, session stats, app usage, limits, configs — the largest; entities under `ai.blox100.data.db.*` |
| `AppUsageDatabase` | `AppUsage`, `AppUsageToday`, `HourlyAppUsage`, `BeforeRegainUsage`, `EventData`, `InstalledAppMeta`, `ProductiveModeEventData`, `UserTotalUsage`, `WeeklyUsageStats`, `UserAppCategory`, `RegainAppCategory` |
| `FocusTimerDatabase` | sessions `FocusTimerSessionV7…V34`, `FocusTimerSessionStats(V20)`, `FocusTimerConfigV*`, `FocusTimerAppRestriction`, `FocusTimerAllowedApps(V13)`, `FocusTimerEventData(V19)`, `GroupNudgeEntity`, `GroupReactionEntity`, `GroupsPinned`, `MusicFileLastPlayed`, tags `FTUserTag`/`FtSessionWithTag` |
| `AppLimitDatabase` | `AppLimit`(+V10/V11/V12 history), `AppLimitChange`, `AddAppLimitReminder`, `AppReminderSetting`, `CoinLedger`, `GameReward`, `GameOverlayData`, `StreakSuccessOverlayData` |
| `BlockWebsiteDatabase` | `BlockedWebsiteConfig`, `BWDetails`, `BlockedDomainDetails`, `BWDomainUIModel` |
| `ZenModeDatabase` | `ZenModeConfigOld`, `ZenModeConfigV7`, `ZenModeDayWiseOld` |
| `ProductiveModeDataBase` | allowed channels/keywords/websites: `ProductiveModeAllowedKeyWords`, `PMWhitelistedKeywords`, `PMAllowedWebsites`, `ProductiveModeTagData`, `ProductiveModeAppUsage` |
| `NotificationBatchingDatabase` | `NotificationMetaData`, `NotificationHistoryData`, `NotificationChannelMetaData`, `NotificationUserTagData`, `NotificationCurrentTagData`, `AppNotificationCount`, `AppNotificationStats`, `WeeklyNotificationStats` |
| `DistractingAppsDatabase` | `DistractingApps` |
| `InviteFlowDatabase` | `InviteLink`, `InviteSuccessfulMapping`, `CreateLinkResponse`, referral counts |
| `AICoachDataBase` | `AICoachResponseData` (+bundled seed `assets/AICoach.db`, 732 canned rows) |
| `NetworkLogsDatabase` | request logs; `NetworkLogsCleanupWorker` prunes |
| `PhoneLockUnlockEventDatabase` | `PhoneLockUnlockEvent` (unlock counter) |
| `ResponseCacheDatabase` (`ai.regainapp.cache`) | API response cache |
| `SharedPreferences` | many files incl. `secure_prefs.xml` (excluded from backup rules) + RemoteConfig cache |

## Versioned model chain (OBS)

Config/session entities are re-versioned per schema change (`FocusTimerSessionV7→V34`, `FocusTimerConfigV9→V34`, `AppLimitV10→V12`, `ZenModeConfigV7`, `FeatureStatusV11`, `ProductiveModeEventDataOld`, `ZenModeDayWiseOld`). INF: migration code carries old→new converters; ~34 generations of the focus-timer schema.

## Backup policy (OBS)

`allowBackup=false` + `fullBackupContent`/`dataExtractionRules` both exclude only `sharedpref/secure_prefs.xml`; cloud backup is app-managed: `/auth/user/get_backup_meta_data`, `/auth/user/save_backup`, `/auth/user/migrate_backup`, `/auth/user/delete_backup` + `OnDemandBackupWorker`/`BackupDBWorker`/`RestoreBackupService` (see `tools/signin-backup.md`).

## Files/media

- `cache/` dir: `regain_share_cards`, `focus_report_images`, `temp_files` (file-paths xml OBS).
- `files/`: `regain_certificates`, `regain_invoices` (PDF downloads via `/payments/invoices/{id}/pdf` → `PaymentsFileProvider` share).
- `ob_hammer/scene.html` asset (onboarding hammer animation).
- Bundled `AICoach.db` seed (732 canned coach lines) + onboarding JSON assets (`exam_search_in`, `exam_story_reviews`, `exam_story_stats`, `exam_story_voice`, `reinstall_v1_pictures`, `reinstall_v1_voice`).
