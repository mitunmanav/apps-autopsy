# Tool: Beeline (see who liked you)

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

- **UI entry** [obs]: `com.bumble.app.beeline` package — liked-you grid; `LikedYouCard`/`LockedCard` models show blurred upsell
- **Param model** [obs]: B4F `com.bmbl.b4f.discovery.v1.apis.LikedYouApi` (no `SERVER_GET_LIKED_YOU_LIST` verb); `Beeline` appears as consumable product and subscription feature [obs both]
- **Execution path** [inf]: open grid → if entitled → fetch liked-you list → tap profile → normal swipe/match flow; if locked → `LockedCard` grid → paywall
- **Local vs remote**: remote list; local grid rendering.
- **Premium/offline**: subscription feature (Boost/Premium) + consumable unlock variant [obs]; online.
- **Input → output**: open → list of admirers → direct match path.
