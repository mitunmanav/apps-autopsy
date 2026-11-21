# 17 — Reel / Shorts Blocker

## `ReelDetectorAccessibilityService`

Manifest-declared `AccessibilityService` (exported, `BIND_ACCESSIBILITY_SERVICE`,
config `res/xml/reel_detector_accessibility_config.xml`: `canRetrieveWindowContent`,
`canRequestFilterKeyEvents`, `canPerformGestures`, interactive inspection, view IDs,
non-important views). Description: "detects Reels, Shorts or Spotlight".

### Watched targets (static map `e`)

| Package(s) | Label |
|---|---|
| `com.google.android.youtube` | YouTube |
| `com.instagram.android`, `com.instagram.lite` | Instagram |
| `com.snapchat.android`, `com.snap.android` | Snapchat |
| `com.facebook.katana`, `com.facebook.lite` | Facebook |
| `com.zhiliaoapp.musically`, `com.zhiliaoapp.musically.go` | TikTok / TikTok Lite |

### Detection (per-app heuristics over the node tree)

- **Event filter**: handles types `32` (window state changed), `2048` (content changed),
  `1`, `4`, `4194304`; 500 ms debounce (`f2.b`), 1 s block throttle (`ob7.w`).
- **Instagram** (`b()`): looks for tab labels (`Home`/`Feed`, `Reels`/`clips_tab`/`reels_tab`,
  `Search`/`Explore`, `Profile`, `Messages`/`Direct`) + view-ids
  `clips_viewer_container`, `clips_video_container`, `clips_video_view_pager`;
  excluded when `layout_comment_thread_edittext` present.
- **Facebook** (`a()`): skips when main tabs (`Home`,`Feed`,`Marketplace`,`Groups`,
  `Notifications`,`Menu`,`Watch`,`Gaming`,`Friends`) visible; matches `Reels` label or
  `reels_viewer`/`reels_screen` ids.
- **YouTube** (`c()`): full heuristic — collects visible action labels; hard-excludes when
  "stop ads","clip","dislike this video","share","remix","download","thanks","save","report"
  appear; checks `reel_player_page_container`/`reels_viewer_container`/`shorts_main_container`;
  requires ≥75% of screen height occupied by the player region (`s2VarB.c * 0.75`).
- Snapchat/TikTok detectors in `n48.d/e` (same shape).
- Localized: label sets built per configured locale (`rja.I("explore")`, `o48` maps).

### Block action (`d(pkg)`)

- `performGlobalAction(GLOBAL_ACTION_BACK)` to exit the section, then a **full-screen
  accessibility overlay** (`WindowManager` type `2032`, `gravity=TOP|START`,
  `layoutInDisplayCutoutMode=1`) showing a Compose "Reels Blocked" card with app name +
  **"Go Back"** action and a dismiss that grants a **1-hour pass**
  (`ob7.v = now + 3600000`).
- Never fires on system packages (`android`, `systemui`, `settings`, inputmethods, Samsung/
  MIUI/Huawei/Oppo/OnePlus system packages — `i30.S0` allowlist).
- Session tracking (`ob7.u`): distinguishes entering/leaving a watched app; clears pass on exit.

### Counters & gating

- Per-target prefs: `{youtube_shorts|instagram_reels|snapchat_spotlight|facebook_reels|tiktok}_enabled`
  (master per-app switches), `…_blocked_today`, `…_blocked_total`, `…_blocked_date`
  (daily reset keyed on `xo0.i()` date string).
- `nv.W()` checks an additional gate — premium entitlement / the 8-hour ad-reactivation
  session (watch-a-reward-ad to re-enable expired sessions per strings).
- Optional "allow first reel, block from second" mode (`zA`/`rq9Var.A(pkg)` check).

### Enable flow

`ReelBlockerSettingActivity` (`reel_blocker`) per-app toggles → checks overlay +
accessibility grants (`reel_blocker_enable_blocked`, `missing_permission=overlay|accessibility`,
`reel_blocker_permission_settings_opened`) → writes `pending_blocker_enable_target` → on
`onServiceConnected` the service applies the pending target, logs
`reel_blocker_toggle_changed{target,enabled,source=pending_after_accessibility_service}` +
`reel_blocker_<app>_enabled`, then relaunches `SplashActivity`.

### Limitations

Static detection relies on **hard-coded view-ids/labels** — breaks silently when the target
apps change their UI trees; the 1-hour dismiss pass is client-side only.
