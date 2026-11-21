# Limitations

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2` (+3 splits).

Everything below bounds confidence across this report.

## Method limits
- **Static only.** No execution, no traffic capture, no runtime state. Every runtime claim is explicitly [inf]/[unk].
- **R8 obfuscation**: core wiring lives in `b.*`/`a.*` classes; no `mapping.txt` shipped. Call chains across obfuscated boundaries are often dead ends [obs].
- **Split boundary**: native libs sit in `split_config.arm64_v8a.apk`; the JNI binding scan matched **0 of 322** declarations — libs vs decls correlation is by name/vendor only [obs limitation].
- The `en` and `xxhdpi` splits carry only localized strings + density assets [obs]; behavior lives in base.

## Tool limits [obs]
- **JEB MCP unavailable** (`http://127.0.0.1:8425/mcp`, `capability_unavailable`) — no second decompiler cross-check; JADX-only.
- **jadx-headless-mcp 0.7.1**: decompiled output is provider display types; synthetic members may be dropped; reference totals count JADX using-nodes only, missing reflective/dynamic invokes.
- **apktool 2.7.0-dirty** — predates CVE-2024-21633 fix; resource decode succeeded but treat malformed-resource edge cases as possible [obs].
- Large REA responses truncated client-side; recovered from overflow files where noted — possible missed tail items in very long lists.
- Class-name lookups are exact: `*.apis.*Api` identifiers are routing names, not classes — searching them as classes fails (that's a naming-convention artifact, not missing code) [obs].

## Unverifiable by construction [unk]
- Cryptographic signature verification (structure-only check; cert `e29e741a…` self-consistent, Play stamp `3257d599…` present — authenticity not proven).
- Effective TLS/cleartext policy (manifest `false` vs NSC `true` conflict unresolved).
- Endpoint base-URL selection at runtime; auth token construction; request serialization details behind obfuscation.
- Feature-flag (Statsig) states → which surfaces actually reach users.
- Premium prices, eligibility rules, rate limits — all server-computed.
- JNI `RegisterNatives` tables, `dlopen` of embedded/extracted libs, reflection targets.
- Screen transitions as executed (static map only); which of two chat stacks serves a given conversation.
- 3,000-string decode preview vs full table — `strings` fallback used for catalogs; per-string counts differ between views.

## Coverage gaps carried into report
- No per-`.so` decompilation (split libs not opened individually — scope/priority).
- Obfuscated `com.badoo.mobile.model` entities (1,389 classes) inventoried, not per-class decoded.
- Deep-link → route resolution partially obfuscated behind `landto` router internals.

## Dead/dormant code shipped [obs — verified pass]
- **Whitelabel residue**: `CHAPPY_*`, `LUMEN_*`, `HON_WHITELABEL_OF_BADOO` flags — sibling-app (Chappy, Lumen) feature flags dormant in Bumble; many `MINOR_FEATURE_BADOO_*` flags are Badoo-app features, not live Bumble.
- **Livestream**: `*LIVESTREAM*` verbs + `MINOR_FEATURE_LIVESTREAM_*` (cash-out, tokens, gifts, following tab), `BALANCE_TYPE_LIVESTREAM_TOKENS`, `BVB_STREAMER_WEB_PORTAL`, `SERVER_VIDEO_CONFERENCE_*` — Badoo live/video residue; no Bumble UI surface found [inf: dormant].
- Restricted/private albums (`RESTRICTED{,_VIDEO}_ALBUMS`, `PRIVATE_ALBUM_ACCESS_CHAT_MESSAGE`), secret comments, twins/lookalikes, popularity score, rise-up, smiles/quick-hello greetings — Badoo-era paid surfaces dormant or repurposed [inf].
- `com.magiclab.ads.leak.AdsLeakedActivity` — internal ads debug harness; `com.supernova.app.*` — internal design-system package, both shipped.
