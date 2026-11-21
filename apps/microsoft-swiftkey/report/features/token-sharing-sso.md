# Token sharing (cross-app SSO)

Evidence: `com.microsoft.tokenshare.*` (45 classes), `TokenSharingService`, `AccountChangeReceiver`, `assets/ts_configuration.jwt`, `assets/signature_config.json`, `token_share_*` meta-data, manifest query `com.microsoft.tokenshare.TokenSharingService`.

## What it is

Microsoft **TokenShare** — lets one signed-in Microsoft app hand auth tokens to another signed-in Microsoft app on the same device (single sign-on across the MS app suite; e.g. sign into SwiftKey with the account already logged in OneDrive/Outlook).

## Components

- `com.microsoft.tokenshare.TokenSharingService` — exported service, action `com.microsoft.tokenshare.TokenSharingService`; `SIGNIN_COMPLETED` broadcast handled by `AccountChangeReceiver` (data `scheme=package` — per-app sign-in events).
- `token_share_sdk_version`, `token_share_build_version`, `token_share_parcelable_version` meta-data — bundled SDK versions.

## Trust model — `ts_configuration.jwt`

An RS256 JWT shipping a **certificate-chain allowlist**: which app signing certs may participate in token sharing. ~50 named chains (`name` + SHA-256 cert fingerprints): authenticator_app_prod, bing(+chain), bingapps(+chain), cheshire(+chain), cloudconnect(_new)_production, company_portal_prod, connections(+chain), copilot_chain, copilot_beta_chain, cortana(+chain), delve_in_prod, designer_mobile_(prod|dogfood), edge_local_and_rolling, excel_word_powerpoint_(officehubrow_chain|outlook_lync_defender), flow, invoice(+chain), kaizala, launcher(+chain), link_to_windows_prod, microsoft_lists, mmx, mmx2(+chain), oneauth_testapp, outlooklite_in_prod, powerapp, ruby, shiftr_df, skydrive(+certificate_chain), skype(+raider), stream_mobile_(prod|beta), surface_duo_msa_sign_in_(prod|self_host), **swiftkey**, wunderlist, yammer(+chain).

`signature_config.json` mirrors the same chains for the token-sharing signature checks (skydrive/excel-word-powerpoint/skype/cortana/launcher/powerapp/bing/copilot/cheshire/…).

Sibling queries in the manifest (`com.microsoft.tokenshare.TokenSharingService` intent) let the app discover other TokenShare providers.

## Security notes

- Chains include dev/dogfood/self-host signers (designer_mobile_dogfood, oneauth_testapp, surface_duo…self_host, launcher dev/daily/rc) — internal builds keep their own entries.
- Access is gated by signature verification, not permission strings — the exported service validates caller certs against this allowlist.
