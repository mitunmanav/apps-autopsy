# 12 — Privacy Consent & Permission Onboarding

## Consent gate

- `PrivacyActivity` (action `fe.intent.action.PRIVACY`, not exported) + `Utils.startPrivacy(ctx, req)` — launched from `FileExplorerTabActivity.onCreate` before the main UI proceeds (`ev_f082a1db…e02f72`):
  - `d0.d()` → `startPrivacy(REQUEST_CODE_ASK_SET_PERMISSIONS_ME=4101)`;
  - `!h0.c() && d0.g(this)` or `d0.f(this)` → `startPrivacy(128)` (`REQUEST_CODE_PRIVACY`).
  Result `RESULT_PRIVACY_SUCCESS=128` unblocks normal init.
- Fragments: `PrivacyFragment`, `PrivacyKRFragment` (Korea-specific text), `StatementPermissionFragment` — EULA/privacy links:
  - `xiaomi_privacy_policy_new` = `https://privacy.mi.com/all/%2$s`
  - `eula` = `http://www.miui.com/res/doc/eula.html?region=%1$s&lang=%2$s`
- `RevokeAuthDialog`, `NetDisabledDialog` — revoke-consent + offline states.
- `CMPLib` — **`com.zeus.gmc.sdk.mobileads.columbus.cmpLib.CMPLib`**, the Zeus/Columbus ad SDK's own consent library (verified `ev_e9665481…d570f5`). It is NOT Google UMP — `com.google.android.ump` classes are absent from the dex (verified). `e0.c()`-gated `CMPLib.onCreate` runs before ads init.

## Runtime permission onboarding

- `RequestPermissionFragment` — standard dangerous-permission ask (`REQUEST_CODE_ASK_PERMISSIONS=114`, `ASK_SET_PERMISSIONS=129`).
- `RequestManageExternalStoragePermissionFragment` — Android 11+ `MANAGE_EXTERNAL_STORAGE` (All files access) deep-link to Settings.
- `StatementPermissionFragment` — pre-permission rationale screen.
- `DocumentsUIActivity` exists in dex but is **not declared in the manifest** (dead code — doc 02); it was presumably the SAF fallback when raw access is denied.

## Privacy surface decisions

- `firebase_analytics_collection_enabled`/`crashlytics`/`perf` meta-data `false` by default — analytics gated until consent (doc 19).
- Ads: consent flag feeds `MiAdManager`/`cmpLib.CMPLib` before ad SDKs initialize (`AbsApplicationProxy.initAd` ordering).

## Evidence

`ev_f082a1db…e02f72` (onCreate gating), GlobalConsts `ev_6298fcc4…deb6b58` (request codes 114/128/129/140/141/4101), strings (privacy/eula URLs), class inventory (privacy fragments/dialogs).

## Unknowns

- Which consent flag (`d0.d`/`h0.c`/`d0.g`/`d0.f` — obfuscated predicates) maps to which legal regime — names stripped; ordering observed only.
- Internal workings of `cmpLib.CMPLib` (Zeus SDK's own consent store — TCF/vendor strings) — the library is present and inited, internals not decompiled.
