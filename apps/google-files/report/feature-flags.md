# Feature flags — Phenotype / server-driven

Flags recovered from the `vxs` table + `nit`/`njz` QueryKey annotations +
phenotype registration code (`kef`: `Fail to register phenotypeflags for %s`).
`assets/phenotype_metadata` declares channels. **Defaults/server values unknown.**

## Feature gates (vxs)

| Flag | Feature |
|---|---|
| `enable_zip_folder` | ZIP-as-folder browsing |
| `enable_android_file_sharing` | share-sheet integration |
| `enable_android_file_sharing_data_clean_up` | sharing leftovers cleanup |
| `enable_android_sharing_daily_maintenance` | daily share-maintenance job |
| `filesSearchProjectionList` + per-type `*SearchProjectionList` (`paymentCard`, `webPage`, `tab`, `digitalDocument`, `collection`…) | smart-search projection shaping |
| `appsearchDonationCapping` | JAM donation rate cap |
| `appsearchFetchResultSizeFor{Universal,Clock,PaymentCard,FlightReservation,EventReservation,File,Image,OnlineVideo,DigitalDocument,SavedItem,SavedCollection,List,Tab,CalendarEvent}` | per-schema fetch sizes |
| `appsearchDonationToFetchVisibilityDelayInMillis` | donation→visible latency |

## Update / behavior flags

- In-app update prompts, flexible vs immediate flows (`kef`/`hxz` sessions)
- `is_gemini_display_logged` — Gemini entry logging gate (pref, not phenotype)
- First-run/onboarding completion flags
- `is_first_nearby_share_logging_attempt` (`ixj`)

## Notes

- Phenotype = Google server-pushed config → real enablement is
  **server-decided at runtime**; flag presence only proves the code path exists.
- `CBVerifier` logs in `kef` show flag commits are verified ("committing
  phenotypeflags") — signature-checked config channel.
