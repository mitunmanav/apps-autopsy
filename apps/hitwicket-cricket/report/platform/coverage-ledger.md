# Coverage Ledger

**Artifact:** `base.apk` — `cricketgames.hitwicket.strategy` v12.43.0 (205957) — sha256 `bf72c61943132322460557c81f14b5ed7f17e9c31b6c46403dbff6456f38153d`

All rows below are **[observation]** of tool-reported coverage; unanalyzed areas are marked **[unknown]**.

## Artifact coverage
| Item | Coverage | Evidence |
|---|---|---|
| base.apk manifest/permissions/components | Full parse | ev_53eae69d…, ev_f622a3eb… |
| base.apk ZIP inventory | Full (1,156 occurrences, 1,061 nodes, 0 contradictions) | ev_ab10b336… |
| base.apk signature | Parsed, unverified | ev_39282c91… |
| base.apk DEX classes | Full index (32,783); targeted decompiles | ev_53eae69d…, class ev_* |
| base.apk resources | Full decode (Apktool; 229 en strings, 92 locales) | ev_3d9c8b90… |
| base.apk JNI declarations | Full scan (293) | ev_fe36f40a… |
| base.apk IL2CPP metadata | Full parse (210 images, 38,819 types, 221,447 methods, 51,541 literals) | ev_1f2c2253… |
| base.apk release exposure | Audited (0 exposed) | ev_326af4dc… |
| base.apk application graph | Projected (manifests, dex, JS, runtimes) | ev_ca2e86eb… |
| split_config.arm64_v8a.apk | Manifest+classes+resources counted | ev_e2dddf74… |
| split_gpdeku.apk | Manifest + all 106 classes listed | ev_bc489617…, ev_e366d652… |
| Native lib exports | signer, coherence, lofelt, gpdeku (4 of 25 total .so) | ev_577ae7cb…, ev_ce9b55d3…, ev_2ae30ecb…, ev_3fe6b1fa… |
| Other asset-pack splits | Member listing only | local unzip on same verified files |
| libil2cpp.so machine code | **Not analyzed** | — |

## Class/method deep-dives (evidence IDs)
`HitwicketUnityPlayerActivity` ev_e7367d9d… · `CustomFirebaseMessageService` ev_93a02fe6… · `WhatsAppAuthenticator` ev_7fefddb0… · `AppMonitorService` ev_9b35a52f… · `PnTrackerFlusher` ev_40137731… · `ApiHelper` methods ev_d428a27a… · `APIService` ev_cdc241c5… · `WebSocketContext` ev_23701200… · `AuthCoordinator` ev_ae4d75d0… · key type indices ev_4a0dbc73…

## What was deliberately not done
- No runtime/dynamic analysis, no network capture, no signing verification, no IL2CPP native decompile, no Unity asset deserialization, no credential scan (tool skipped).
- No claims on another APK: every hash cited belongs to this artifact set.
