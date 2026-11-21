# Feature: Chromecast / Google Cast

## Presence

- Cast framework classes: `fcj`,`fck`,`fci`,`fch`,`fcf`,`fce`,`fcd` +
  `jms`, `xgc` — session manager wrappers, route controllers, expanded
  controller UI peers.
- GMS Cast SDK referenced (`com.google.android.gms.cast*` present in the
  merged-lib class census).

## Behavior (static)

- Cast button in media surfaces (audio/video/image viewers); media queue over
  Cast `RemoteMediaClient`; `mediaconsumption` hosts cast-aware player peers.
- `optionsProvider`/discovery wiring through manifest metadata
  (`CastOptionsProvider`-style registration typical; exact class name obfuscated).

## Evidence

Class census cast packages + peer classes above; media strings include
cast-device strings.

## Unknowns

- Whether cast supports folder-queue or single-item only.
- Codec remuxing (Cast-supported formats) policy — not observable.
