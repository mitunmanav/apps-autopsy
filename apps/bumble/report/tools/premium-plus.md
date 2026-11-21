# Tool: Premium+ (top subscription tier)

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

- **UI entry** [obs]: `PremiumPlusOnboardingActivity`, `SCREEN_NAME_PREMIUM_PLUS_PAYMENT_WIZARD`, `SCREEN_NAME_PREMIUM_PLUS_REPEATED_PURCHASES_WIZARD`, `PREMIUM_PREMIUM_PLUS_TABBED_PAYWALL`, `bumble_premium_plus_*` strings, `bumble_myplan_*`
- **Param model** [obs]: product `payment_product_premium_plus`, `PAYWALL_TYPE_REPEATED_PURCHASE_PREMIUM_PLUS`, `TRANSACTION_SERVICE_LEVEL_{BOOST,SPP}_PREMIUM_PLUS`
- **Perk bundles** [obs — feature-named promo blocks]: `READ_RECEIPTS_..._PREMIUM_PLUS`, `TOP_CHAT_..._PREMIUM_PLUS`, `COMPLIMENTS_PREMIUM_PLUS`, `ELEVATED_LIKES_PREMIUM_PLUS`, `VISIBILITY_PREMIUM_PLUS`, `INSIGHTS_PREMIUM_PLUS`, crush/extra-shows variants — i.e., Premium+ stacks: read receipts, top-chat placement, elevated likes, extra visibility, insights + consumable allotments [inf on bundle composition; strings obs]
- **Execution path** [inf]: paywall (tabbed with Premium) → wizard → provider checkout → validate → tier perks
- **Local vs remote**: entitlements server-held.
- **Premium/offline**: highest tier [obs]; online.
- **Input → output**: top-tier payment → maximum feature bundle.
