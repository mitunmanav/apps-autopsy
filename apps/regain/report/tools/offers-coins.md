# Offers, Coins & Rewards

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Evidence:** OBS

## What it is
Gamified economy: coins for honoring limits/focus, streak rewards, unlockable offers, reward claims, "why coins removed" transparency screen, creator rewards.

## UI entry (OBS)
`coin_ledger`, `coin_ledger_bs`, `game_reward`, `game_overlay`, `streak_success_overlay`, `reward_bs`, `reward_claim_screen/{P}/{P}`, `unlock_offer_bs`, `offer_claim`, `why_coins_removed_screen`, `creator_rewards`, `regain_commitment_screen/{P}`.

## Params model (OBS)
`CoinLedger` (credit/debit entries), `GameReward`, `GameOverlayData`, `StreakSuccessOverlayData`, `ClaimRewardResponse`, `OfferDetails`, `ClaimOffer*`, `SaveOfferConversion*`, `GroupInviteRewards`.

## Execution path (OBS)
Local accrual: compliance/streak → `CoinLedger` + `game_reward`/`streak_success_overlay`; server offers: `/fg/offers/claim`, `/fg/offers/conversion`; invite rewards `/invite/claim_reward`; spend/unlock → theme/offer unlocks (INF).

## Premium/offline (OBS)
Coins/streaks local; offers + reward claims need `/fg/offers/*`, `/invite/*`.
