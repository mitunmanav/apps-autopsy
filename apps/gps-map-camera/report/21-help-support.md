# 21 — Help, support & legal

## Screens

- `FAQScreen` — FAQ categories (map/photos, manual location, templates, premium/ads per strings); `FAQ_NATIVE` ad slot
- `UserGuide_Activity` + `UserGuide_Answer_Activity` — in-app guide
- `VideoTutorial` — tutorial video `https://www.youtube.com/watch?v=488jwww9nd8` ("GPSMapCamera" channel)
- `Send_An_Error` — error-report submission form
- `Privacy_Policy` — `https://sites.google.com/view/gmcapp-privacy/home`; ToS `https://sites.google.com/view/gmcapptos/home`
- `MoreAppsActivity` — cross-promo (`MoreAppsData`, `TransferApp` models, `onelink.to/gpsmapcamera`, `bit.ly/gpsmapcamera`, iOS link `apps.apple.com/…/id1503116917`)
- Support contact: `support@gpsmapcamera.com` (shipped string)

## Contact / email recipients

`EmailSettingActivity`, `PrimaryRecipientActivity`, `SecondaryRecipientActivity`, `model.EmailModel`, `model.ContactModel`, `helper.OnEmailItemClickListener`, keys `email_recipient`, `email_secondary_recipient`, `email_subject`, `email_content`, `is_send_email_photos`, `is_send_address_time`, `email_setting_on` — configurable recipients/subject/body for photo/report sharing via email (no SMTP library → handled via system share/`mailto` intents).

## Model classes

`VideoTutorialModel`, `LicenseList` (open-source licenses screen data), `SettingModel`, `ViewModel`.
