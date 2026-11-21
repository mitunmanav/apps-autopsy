# Offline / Online Feature Classification

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`

## Fully local (OBS: no network in path)

- Accessibility blocking engine (`MyMonitorInAppBlockService`), app limits, shorts/reels detection, website blocking on device, zen mode, focus timer (session mechanics), notification listener/batching, widgets, bubbles, launcher, uninstall protection (device admin), usage recording, study calendar/heatmap, C68 alarm mechanics, themes application, AI Coach **canned replies** (bundled `AICoach.db`, 732 rows), focus music playback (bundled/media3), onboarding content (bundled JSON), paywall variants (RemoteConfig), coins ledger (`CoinLedger` Room).

## Hybrid: local first, server enriches (OBS)

- **App categorization** — local `UserAppCategory` + `RegainAppCategory` tables, synced to `/app_category/*` (server-curated categories arrive back; INF: offline falls back to local categories).
- **Website category lookup** — local block works offline; `/wb/get_website_category` enriches unknown domains.
- **Productive YouTube** — local channel whitelist enforced offline; search/meta via `/pm/*` needs network.
- **Notification channel meta** — local tags work; `/notification/*` syncs server-side meta.
- **Response caching** — `ai.regainapp.cache.ResponseCacheDatabase` + RemoteConfig defaults keep paywall/experiments working offline.
- **Usage sync** — local DB authoritative; `/usage/submit` uploads in background; offline = queued workers (WorkManager network constraint).

## Network-required (OBS: server is source of truth)

- **Sign-in / account** (`/auth/*`), backup/restore/migrate/delete.
- **Subscription state** (`/payments/*`, RevenueCat, Razorpay) — purchase, claim, invoices, offers claim/conversion.
- **Focus groups / leagues** (`/fg/*`) — all group create/join/edit/kick/leaderboard/reactions/nudges; Pro pass.
- **Referrals** (`/invite/*`) — links, counts, rewards.
- **AI share message** (`/app_share/generate_message`) — server-side generation.
- **Wall of Love** posts + AI rewrite.
- **Weekly reports** (`weekly_report_screen`) — INF: aggregated from synced usage; offline shows local partial data.
- **YT channel search** (`/pm/get_yt_search_results_from_regain_api`) — proxied server-side (no YouTube API key in app).
- **`/event_screenshots`** upload — analytics screenshot pipeline needs network.
- FCM push delivery (nudges/guilt trips), experiment enrollment, theme list (pre-login fetch).

## Premium gating (OBS)

`SubscriptionState`/`SubscriptionUseCases` consulted across monitor/feature code; Pro surface: focus timer advanced modes, groups>?, zen schedules, website categories, ProPassWidget (`/fg/pro_pass/*`), offers. UNK: exact per-feature pro map (strings confirm `premium_*` keys exist; full matrix needs per-call-site tracing — see coverage ledger).
