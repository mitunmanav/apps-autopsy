# AI Coach

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Module:** `feature_ai_coach` · **Evidence:** OBS (bundled `AICoach.db` inspected — 732 rows)

## What it is
Snarky/motivational "AI coach" nudges shown when you open a distracting app or drift during focus — largely canned, not live AI.

## UI entry (OBS)
Block/nudge overlays + `ai_coach` strings (OBS: model fields `gpt_model`, `app_id`, `app_type`, `usage_minutes_bucket`, `time_of_day_bucket`, `ai_response`, tone `casual`, language).

## Params model (OBS)
`AICoachResponseData` entity in `AICoachDataBase`/`_Impl`; seeded from bundled `assets/AICoach.db` (732 canned lines keyed by app, usage bucket, time-of-day bucket, tone, language — e.g. "Please close it, or I'll start to cry!").

## Execution path (OBS)
Distraction event → match (app_id, usage bucket, time bucket, tone) → pick canned `ai_response` → overlay/nudge text; `gpt_model` field INF: server-generated corpus shipped offline.

## Premium/offline (OBS)
Fully offline (bundled corpus); INF some remote refresh possible but not evidenced.
