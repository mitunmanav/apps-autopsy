# Tool: Anti-Cheat & Integrity
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

- **UI entry:** none (background) [observation].
- **Controls [observation]:**
  - **ACTk** (Anti-Cheat Toolkit) assembly — obscured-type/injection/speed detectors per vendor component names
  - `CodeHashVerification` ApiHelper method — client code hash reported to server
  - Root-package manifest queries: `com.topjohnwu.magisk`, `eu.chainfire.supersu`, `com.noshufou.android.su`, `com.koushikdutta.superuser`, `com.thirdparty.superuser`
  - `libsigner.so` Adjust request signing (fraud-resilient attribution)
  - Play Deku `screencapture` module (Play-managed capture/safety feature [inference: Play screencapture = Play Games recording or integrity capture])
  - `split_config` required ABI + `derived.apk.id` tamper signals; CHECK_LICENSE
- **Execution path:** startup/runtime checks → hash/integrity report via API → server adjudicates [inference].
- **I/O flow:** detect → report (`CodeHashVerification`) → server-side enforcement (unknown statically).
