# Monetization & settings features (subscription, user_theme, language, creator_mode, permission, service_fixing, regain_launcher)

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`

All OBS.

## feature_subscription
`SubscriptionState`, `PackageUIModel`, `RegainPaymentMethod`, `InHouseAdConfig`, `PaywallVariantInfo`, `OfferForPackage`, `OfferDetails`; remote `ClaimOfferRequest`, `SaveOfferConversionRequest`, `ExperimentEnrollmentDto`, `ClaimOfferResponse`, `SaveOfferConversionResponse`; `presentation.in_house_ad`, `unlock_offer_bs`; APIs `/payments/*`, `/fg/offers/*`, `/auth/auth/experiment/enroll`.

## feature_user_theme
`UserAvailableTheme`, `UserThemeCategory`, `UserThemesResponse`; `GET /auth/user/get_user_available_themes_without_auth_v1`.

## feature_language
`LanguageItem`; `autoStoreLocales` + `update_user_locale`; 30+ locales.

## feature_creator_mode
`GoalSnapshotEntry`, `CreatorDemoToggleActivity`, `creator_rewards`/`creator_demo_toggle` routes (INF: influencer/demo mode).

## feature_permission
`PermissionLogs`; `PermissionStepsOverlayActivity`, `AccessibilityPermissionActivity`; permission coach-mark routes (`accessibility_permission`, `usage_permission_settings`, `overlay_permission_settings`, `exact_alarm_permission_settings`, `battery_optimization_settings`, `auto_start_permission_settings`, `background_permission_settings`, `vivo_background_permission_settings`, `default_launcher_settings`, `device_admin_settings`, `notification_permission_settings`).

## feature_service_fixing
`CheckNBServiceFixingWorker`, `CheckServiceFixingWorker`; `service_fixing` route — detect/repair killed accessibility+monitor services.

## feature_regain_launcher
`UserSelectedLauncherEntity`; `ProxyLauncherActivity` forward logic (OBS decompiled); `default_launcher_settings`, `launcher_settings`, `user_selected_launcher` routes.
