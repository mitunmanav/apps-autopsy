# Tool: Share Live Location — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

- **UI entry (inf):** invoked during active trip; implementation = `com.olacabs.tracker.ShareLiveLocationService` (manifest FGS, `foregroundServiceType="location"`, obs).
- **Parameter model (obs, ev_dbcd9d76…/ev_bc16b700…):** `MqttBrokerModel` (server-supplied broker config), `BookingDetailsShareModel`, `FusedLocationProviderClient`, `MqttConnectionConfig`, `MqttSdk`.
- **Execution path (obs decompile of `B()`):**
  1. Service `onCreate`/`onStartCommand` → `B()` builds `MqttConnectionConfig` from broker model.
  2. Defaults when model fields absent: autoReconnect `true`, cleanSession `false`, publish QoS `1`, subscribe QoS `1`, keepAlive `60s`, connectTimeout `30s`.
  3. Fused location updates → MQTT publish to broker topic (topic string not statically recovered, unk).
- **Local vs remote:** remote transport (MQTT), local sensing (FusedLocation). Stop path via `onDestroy`.
- **Premium/offline:** not premium-gated (inf); requires connectivity — no store-and-forward in evidence (unk).
- **Input→output:** GPS fixes → MQTT broker → (server relays to share recipients, inf).
- **Unknowns:** topic scheme, TLS on MQTT, cadence, whether broker = Ola-hosted or third-party.
