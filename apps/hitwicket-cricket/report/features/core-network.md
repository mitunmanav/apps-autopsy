# Module: Core Network
**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

`Hitwicket.Core.NetworkModule` + `ApiHelper` (227 methods, ev_d428a27a…) + `APIService` (15, ev_cdc241c5…) + `GameAPIService` + `WebSocketContext` (27, ev_23701200…) + `APIConfigSO`/`APIEnvironmentConfig`/`LocalEnvEndpoints` [observation].

- **REST pipeline:** `CreateAPIRequest`→`BuildApiUrl`→`BuildBaseUrl`→`AttachApiUrlValues`→`AttachApiParametersToUrl`→`AttachDefaultParametersToUrl`→`getHeader`(`x-auth-token`,`device-id`)→`CallApi`/`CallApiSync`/`CallApiAndDispose`→`CreateFromUnityResponse`; retries `CanRetry`+`GetWaitTimeInMS`; offline gate `IsOffline`; env switching `OnEnvironmentSwitch{,ToLocalHost}`, `SetDefaultEvn`, `SetBestHttpFlag` (BestHTTP selectable) [observation].
- **WS pipeline:** `WebSocketContext` Connect/Reconnect/disconnect matrix + `WatchConnectionTimeout` + `UpdateRoundTripTime` + tracker sends [observation].
- **Wire:** protobuf `Hwsproto`/`Superstars.Proto.*` + JSON; Unity colyseus.nativewebsocket + BestHTTP websocket clients ship [observation].
- **Environments:** prod/staging/preproduction/stg5/localhost endpoints compiled in [observation].
