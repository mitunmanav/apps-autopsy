# Tool: Travel mode

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

- **UI entry** [obs]: `com.bumble.app.travel` package, `[TravelMode] loadScreen failed:` error string
- **Param model** [obs]: `REQUEST_SET_TRAVEL_LOCATION` param + `LocationApi` B4F; city picker + `LocationApi`
- **Execution path** [inf]: settings → Travel → pick city → `SET_TRAVEL_LOCATION` → encounter deck for target city; real GPS overridden by travel pin while active
- **Local vs remote**: location state server-held; local city search UI + map (GMS maps).
- **Premium/offline**: Premium-tier feature [inf — gated settings entry]; online.
- **Input → output**: city pick → foreign deck + location badge.
