# Work profile / cross-profile support

Evidence: `INTERACT_ACROSS_PROFILES` permission, manifest `crossProfile="true"` attributes, `cross_profile_*` strings, `prefsx_cross_profile_sync_screen.xml`, home entry `pref_home_launch_cross_profile_sync_prefs`.

## What it is

On devices with an Android **work profile**, SwiftKey installed in both profiles can share/sync state so the personal learned model & settings follow you into work apps.

## Evidence

- `android.permission.INTERACT_ACROSS_PROFILES` + `crossProfile` declarations on components — enables profile-to-profile intents for the same app.
- Settings home entry "Cross profile sync" → dedicated screen (`prefsx_cross_profile_sync_screen.xml`) — toggle whether data syncs across the profile boundary.
- `cross_profile_*` strings — consent/explanation copy (enterprise-managed profile may restrict).
- TokenShare/`SIGNIN_COMPLETED` receivers respect profile boundaries (per-app `scheme=package` data).

## Notes

- The whole feature is enterprise-oriented: a work-profile SwiftKey can't reach personal files without this bridge, so predictions stay consistent.
- Effective behavior is policy-gated by the work-profile admin — static evidence can't confirm a given deployment allows it.
