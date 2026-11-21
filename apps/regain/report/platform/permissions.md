# Permissions (declared → used-for)

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`

| Permission | Evidence for purpose |
|---|---|
| `PACKAGE_USAGE_STATS` | OBS: usage-stats tracking; `getAppUsageStatsUseCases`, `DailyUsageSaveToDbWorker`, `/usage/submit`. Settings screen `usage_permission_settings`. |
| `SYSTEM_ALERT_WINDOW` | OBS: overlay blocking (`AppLimitWindowFactory`, `BlockProtectionWindowFactory`, `ContentBlockWindowFactory`) + floating bubbles. `display_over_other_apps_title`. |
| Accessibility service (not a perm, declared) | OBS: `MyMonitorInAppBlockService` — full UI scraping + actions (`performClickAction`, `performBackPress`, `closeCurrentTab`), window-content retrieval. This is the enforcement core. |
| Notification listener | OBS: `NotificationListener` service — blocks/intercepts notifications during focus, batches them. |
| `USE_EXACT_ALARM` + `SCHEDULE_EXACT_ALARM`(≤32) | OBS: C68 alarm, zen-mode schedule, focus schedules, reminders. |
| `QUERY_ALL_PACKAGES` | OBS: installed-app inventory for distracting-app picker, app limits, `InstalledAppDto` sync. |
| `RECEIVE_BOOT_COMPLETED` | OBS: BootCompletedReceiver, C68AlarmRestoreReceiver, ProPassWidgetRestoreReceiver, WorkManager RescheduleReceiver — restore alarms/schedules after reboot. |
| `FOREGROUND_SERVICE` + `_MEDIA_PLAYBACK` + `_SPECIAL_USE` | OBS: monitor/alarm/focus-notification/media-player/bubble services; 8× `PROPERTY_SPECIAL_USE_FGS_SUBTYPE`. |
| `POST_NOTIFICATIONS`, `VIBRATE`, `WAKE_LOCK`, `USE_FULL_SCREEN_INTENT` | OBS: reminders/nudges; `USE_FULL_SCREEN_INTENT` → alarm wake screen (C68AlarmActivity `showWhenLocked`). |
| `REQUEST_IGNORE_BATTERY_OPTIMIZATIONS` | OBS: keep monitor service alive; OEM autostart/background-permission settings screens (`auto_start_permission_settings`, `background_permission_settings`, `vivo_background_permission_settings`). |
| `CAMERA` (+camera features optional) | OBS: `com.canhub.cropper.CropImageActivity`, CameraX — profile-photo capture/crop (`/auth/user/upload-profile-picture`), study-stamp photos. |
| `READ/WRITE_EXTERNAL_STORAGE` (WRITE≤28) | OBS: legacy media/file ops. |
| `READ_BASIC_PHONE_STATE` | OBS: device tier/meta (sent with `/tier/get_tier` → `phone_ram_gb`). |
| `com.android.vending.BILLING` | OBS: Play Billing 8.0.0. |
| `com.google.android.c2dm.permission.RECEIVE`, `finsky.BIND_GET_INSTALL_REFERRER_SERVICE` | OBS: FCM + Play install referrer (attribution). |
| `AD_ID`, `ACCESS_ADSERVICES_*` | OBS: Google Ads/Attribution SDK (`ad_services_config.xml` allows all). |
| `DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` | OBS: app-defined permission for its internal broadcast receivers (guards `sendUpdateBroadcast` family). |
| `INTERNET`, `ACCESS_NETWORK_STATE` | OBS: API + connectivity gates. |
| Device admin | OBS: `RegainDeviceAdminReceiver` + `@xml/device_admin_policies` = `<force-lock/>` only — screen-lock enforcement (uninstall-protection/zen flows). |

**INF:** no `RECORD_AUDIO`, `LOCATION`, `CONTACTS`, `SMS`, `CALL_LOG`, `BLUETOOTH` — the app's surveillance surface is screen-content + notifications + usage stats, not hardware sensors.
