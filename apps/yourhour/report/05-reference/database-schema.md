# Reference — Complete Room Schema

Real `CREATE TABLE` statements recovered from the generated `AppUsageDatabase_Impl`
migration classes (`defpackage/xy.java`, `zy.java`). This replaces the inferred columns in
`../01-overview/02-data-layer.md`.

## app_usages — raw usage rows
`id` INTEGER PK AUTOINCREMENT · `startTime` INTEGER · `pName` TEXT · `usageTime` INTEGER

## app_digest — daily per-app digest
`id` INTEGER PK AUTOINCREMENT · `visitCount` INTEGER · `pName` TEXT · `usageTime` INTEGER · `date` TEXT

**Key find: `visitCount` — the app counts launches per app per day, not just minutes.**

## app_settings — per-app rule row (PK `packageName`)
`floatingClockFlag` · `monitorFlag` · `mindfulPause` · `ignore_nophone` · `autoLockFlag` ·
`usageLimit` · `usageAlertFlag` · `isSystemApp` · `appCategory` · `lockSettings` · `snoozeUntil`

All 12 toggles confirmed: floating clock, monitor, mindful pause, ignore-for-no-phone,
auto-lock, usage limit (min), usage alert, system-app flag, category id, lock-settings flag,
snooze-until timestamp.

## fasting_challenge — "Fast" challenge
`id` PK · `packageName` · `duration` · `startTime` · `scheduleDays` · `remindAt` ·
`status` · `isBadgeCompatible` · `lockAppFlag` · `quitFlag`

## limit_challenge — "Diet"/per-app limit challenge
`id` PK · `packageName` · `duration` · `startTime` · `status` · `type` · `scheduleDays` ·
`remindAt` · `lockAppFlag` · `countdownFlag`

## techno_camping_challenge — legacy challenge table
`id` PK · `duration` · `startTime` · `status` · `scheduleDays` · `remindAt` · `quitFlag`

## phone_unlock
`id` PK AUTOINCREMENT · `timeStamp` INTEGER — one row per unlock.

## feed — dashboard feed cards
`id` PK · `text` · `subText` · `pName` · `tableId` · `moduleId` · `actionId1` · `actionId2` · `createdAt`

`tableId`/`moduleId`/`actionId{1,2}` = server-side actionable routing (cards deep-link to
../02-features — feed is a remote-driven engagement surface).

## category_model (2 schema versions — migrated to add `isProductive`)
v1: `id` PK · `name` · `resId` → current: + `isProductive` INTEGER

## app_detail — installed-app cache
`pName` TEXT PK · `name` TEXT — label cache only; no icon/system flags (those live in app_settings).

## badge_history
`id` PK · `badgeId` TEXT · `winFlag` INTEGER · `createdAt` INTEGER · `notifyFlag` INTEGER
— badge won + whether the user was notified.

## time_slice — timeline buckets
`id` PK · `name` · `timeStamp` · `startTime` TEXT · `endTime` TEXT · `pName` ·
`scheduledDays` INTEGER · `notifyFlag` INTEGER · `updatedAt` TEXT

**`scheduledDays` + `notifyFlag` imply scheduled-usage windows/alarms, not just timeline rendering.**

## table_story — community story (PII-heavy)
`id` TEXT PK · `userName` · `userEmail` · `country` · `installDate` · `storyTitle` ·
`storyContent` · `publishDate` · `submissionDate` · `profilePicRef` · `status` ·
`twitterLink` · `facebookLink` · `instagramLink` · `userDetails` · `coverPicRef` ·
`tags` · `age` INTEGER · `profession`

**Adds social links (twitter/facebook/instagram), userDetails, coverPicRef, installDate —
more PII than the analytics fields alone suggested.**

## app_heartbeat — service heartbeat
`id` PK · `name` · `timestamp` INTEGER · `trusted_timestamp` INTEGER (nullable) · `created_at`

**`trusted_timestamp` — anti-tamper field: the service keeps a server-or-play-integrity
trusted time alongside device time to detect clock manipulation.**

## usage_query_checkpoint — incremental event-replay progress
`id` INTEGER PK · `generation` TEXT · `payload` TEXT (serialized `UsageQueryState`)

## generated_digest_state — digest engine state (PK `pName`,`date`)
`digestId` · `usageTime` · `visitCount` · `windowStart` · `windowEnd` · `dayOffset` ·
`timeZone` · `resetDate` · **`rawFingerprint`** (integrity fingerprint of source rows) ·
**`adjustHappyTime`** (the "Happy Time" goal-window adjustment flag)

## action_notifications — parental action log
`id` TEXT PK · `deviceId` · `actionType` · `appName` · `packageName` · `iconUrl` ·
`usedDurationMs` · `limitDurationMs` · `occurredAt` · `createdAt` · `receivedAt` · `isRead`

Confirms: paired TV pushes **named app actions with icons and usage/limit context** —
the guardian sees *which app* and *how long it's been used vs its limit*.
