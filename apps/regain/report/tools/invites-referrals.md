# Invites & Referrals

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Module:** `feature_invite_flow` · **Evidence:** OBS

## What it is
Referral engine: personal invite links, group-invite rewards, successful-referral tracking, reward claims — the growth loop.

## UI entry (OBS)
`invite_details_screen`, `generate_invite_link`, `join_invite_bs`, `reward_claim_screen/{P}/{P}`, deep links `join/gift/invite.regainapp.ai`.

## Params model (OBS)
`InviteFlowDatabase`: `InviteLink`, `InviteSuccessfulMapping`, `CreateLinkResponse`, `ReferralCountResponse`, `GroupInviteCount`/`GroupInviteReferralCountResponse`, `GroupInviteRewards(Only)`, `ClaimRewardResponse`, `RegisterReferralResponse`, `SetUserDeviceLoginResponse`.

## Execution path (OBS)
1. `POST /invite/create_link` → shareable `join.regainapp.ai` URL → system share.
2. Install via link → Play-referrer + `/invite/register_successful_referral`; `set_user_device_login` binds device.
3. Counts → `/invite/referral_count`, `/invite/group_invite_referral_count_without_auth`; rewards → `/invite/claim_reward`, `get_group_invite_rewards`.
4. Workers `UpdateReferralCountWorker`, `UpdateGroupReferralCountWorker` keep counts fresh.

## Premium/offline (OBS)
Network-only.
