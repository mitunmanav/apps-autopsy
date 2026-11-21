# 23 — Stories & In-App Feed

## Stories (community addiction stories)

| Component | Role |
|---|---|
| `ManageStoryActivity` (`stories`, `story_bookmarks`) | story browser + bookmarks; extras `launched_from_settings`; ads `native_ad_story_1/2` |
| `ReadStoryActivity` (`story_opened`) | reader — "<name>'s Story", vote up/down (`story_upvoted`, `story_downvoted`), `arg_addiction_story` parcel |
| `StoryFilterActivity` | filter feed by tag/country |
| `CreateStoryActivity` | submit your own: title + 500–5000 char body ("Story should have minimum 500 characters", max counter), `Enter your name!`, tag list (`stories_pref.story_tag_list`, `####` separated), Google identity for auth ("Authentication Failed!", `param_email_type`, `Google User Email:`) |

- `model/Story` + `table_story` Room table (cache/bookmarks) — **full columns**: `userName`,
  `userEmail`, `country`, `installDate`, `storyTitle`, `storyContent`, `publishDate`,
  `submissionDate`, `profilePicRef`, `coverPicRef`, `status`, `twitterLink`, `facebookLink`,
  `instagramLink`, `userDetails`, `tags`, `age`, `profession` — social links + PII persisted locally.
  `Story` model adds `loginType`, `readCount`, `upvoteCount` — engagement metrics tracked
  server-side.
- Moderation: submissions go server-side; feedback notifications on `storyChannel`.
- `storyIdentityGateway` — Google-sign-in identity for authors/voters.
- Country/tag filtering supported (filter classes under story/filter).

## In-app feed (`FeedActivity`, `feed`)

- Card stream rendered from `feed` Room table (items with text/subText/actionIds — cross-sell
  challenges, reports, iOS launch, premium).
- Can launch challenges inline (`fast_challenge_taken`, `diet_challenge_started`,
  `no_phone_challenge_taken`; error toast routes to challenges screen).
- Report shortcuts post `day_statistics`/`week_statistics`/`month_statistics` with
  `report_interstitial` ads.
- `settingsPreference.feedCount` tracks unread/seen count.

## Analytics

`stories`, `story_bookmarks`, `story_opened`, `story_upvoted`, `story_downvoted`,
`feed`, challenge-start events from feed.
