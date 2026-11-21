# Weekly Reports & Share Cards

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Evidence:** OBS

## What it is
Weekly focus/usage report + shareable cards (streaks, saved-time "impact", focus report) + AI-generated share caption.

## UI entry (OBS)
`weekly_report_screen/{P}?fromDate=`, `progress_report_card_bs`, `shareable_cards`, `focus_report(_share*)`, `impact_share`, `impact_metrics_bs`, `app_share_message`.

## Params model (OBS)
`FTReportShareData`, `FTWeeklyComparison`, `FocusStatsWeeklyDTO`, `WeeklyUsageStats`, `WeeklyNotificationStats`, `BeforeAfterRegainUsageStats`, `AiGeneratedShareRequest/ResponseDto`.

## Execution path (OBS)
Weekly roll-up (Room) → report screen/cards → share → `ShareReceiver`/`ShareDismissReceiver` → `POST /app_share/generate_message` (server AI caption) + image from `regain_share_cards`/`focus_report_images` cache → system share sheet.

## Premium/offline (OBS)
Report render local; AI caption needs `/app_share/generate_message`.
