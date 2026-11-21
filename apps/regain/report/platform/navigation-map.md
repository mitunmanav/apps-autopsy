# Navigation Map

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`

## Routing mechanism (OBS)

- Compose destinations registered as **`link.regainapp.ai/<route>` URLs** (constants extracted from `U0.a`, `p509w.a`, screen builders — `analysis/deeplinks.txt`, 165 routes). `{P}` = positional path param; `?k={P}` = query param.
- External entry: `HomePageActivity` has VIEW intent filters for `https` on `link/join/gift/invite.regainapp.ai` + custom scheme `regainapp://internal` → the same route table resolves in-app and web links (deferred deep links through the Play-referrer flow).
- Overlay screens: exported overlay activities declare `regainapp://overlay*` VIEW filters — monitor service launches them directly (no link host needed).
- Internal nav broadcasts: `NavigationReceiver` + `sendUpdateBroadcast` (guarded by `DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION`) let services/workers push routes into the running UI.
- Widgets: Glance `actionStartActivity` deep links (e.g. widget tap → `focus_timer_screen`, `study_progress_calendar`).

## Entry-point → destination graph (OBS+INF)

- **Cold start** → `HomePageActivity` → onboarding chain (if first run: `intro_video`→`exam_selection`→`goal_setup`→`educational_screens`→`signup_screen`→permission stack `accessibility_permission`→`usage_permission_settings`→`overlay_permission_settings`→`exact_alarm_permission_settings`→`battery_optimization_settings`→`default_launcher_settings`) else `home_page_screen`.
- **HOME press (as launcher)** → `ProxyLauncherActivity.onCreate` → `forwardToRealLauncher()` → resolves user's saved launcher via `feature_regain_launcher.UserSelectedLauncherEntity` → forwards intent + `finish()` (OBS, verified in `ProxyLauncherActivity.java`).
- **Block event** (monitor service) → `OverlayActivity`/`BlockShortsOverlayActivity`/`BlockProtectionActivity` over target app; “nudge” variants → `b_l_nudge_screen`/`block_shorts_nudge_screen` links.
- **Notification shade** → notification listener batches; taps → `notification_*` review screens.
- **FCM** → `MyFirebaseMessagingService` → route payload → HomePageActivity deep link (INF from receiver+route structure).
- **Alarm** → `C68AlarmReceiver` → `C68AlarmService` → `C68AlarmActivity` (own taskAffinity, `excludeFromRecents`); snooze → `C68AlarmSnoozeReceiver` → re-arm; reboot → `C68AlarmRestoreReceiver`.
- **Share/report flows** → `focus_report_share_bs`, `shareable_cards`, `impact_share` → `ShareReceiver`/`ShareDismissReceiver` → system share sheet + `/app_share/generate_message`.
- **Payments** → `subscription_paywall_screen`/`SubscriptionActivity` → Play Billing/RevenueCat or `CheckoutActivity` (Razorpay UPI) → `payment_status` → `invoices_screen` (`PaymentsFileProvider` for PDFs/QR).
- **Invite links** → `join/invite/gift.regainapp.ai` VIEW → `join_invite_bs`/`invite_details_screen` → `/invite/*` claim flow → `reward_claim_screen/{P}/{P}`.

## Overlay/host relationships (OBS)

`OverlayActivity(SupportsLandscape)` = generic Compose overlay host; `BlockShortsOverlayActivity` (shorts/reels block), `FTOverlayActivity` (focus-timer block/nudge), `PMTagOverlayActivity` (productive-mode tag UI), `BlockProtectionActivity` (anti-uninstall/settings guard), `PermissionStepsOverlayActivity` (permission coach marks). `FTOverlayService`, `PMFloatingButtonService`, `ActiveBlocksFloatingButtonService` = persistent SYSTEM_ALERT_WINDOW bubbles.

## Guard rails (OBS)

Deep links resolve against a route table — unknown routes fall back to `home_page_screen` (INF from default-branch pattern in nav host code). `exported` overlay activities accept external `regainapp://` links — a third-party app can trigger Regain's overlay UI (INF: intentional for testability; no permission gate).
