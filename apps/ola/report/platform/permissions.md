# Permissions — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`
Declared in manifest (obs). Declaration ≠ grant; runtime grant state is unk.

| Group | Permissions | Likely consumer (inf) |
|---|---|---|
| Location | `ACCESS_FINE_LOCATION`, `ACCESS_COARSE_LOCATION` | ride booking, live tracking |
| FGS | `FOREGROUND_SERVICE`, `_LOCATION`, `_DATA_SYNC` | ShareLiveLocationService, NavigationService, asset-pack extraction |
| Network | `INTERNET`, `ACCESS_NETWORK_STATE`, `ACCESS_WIFI_STATE` | all API/telemetry |
| Phone/SMS | `READ_PHONE_STATE`, `READ_PHONE_NUMBERS`, `READ_BASIC_PHONE_STATE`, `CALL_PHONE`, `READ_SMS`, `RECEIVE_SMS`, `SEND_SMS` | OTP autofill (READ/RECEIVE_SMS), SIM binding in Ola Money (SEND_SMS + SmsSentBroadcastReceiver), driver/support calls (CALL_PHONE) |
| Camera/Audio | `CAMERA`, `RECORD_AUDIO` | KYC camera flow (olamoneyrest.kyc.CameraActivity), QR scan, support/voice (inf) |
| Contacts | `READ_CONTACTS` | P2P payments, referral invite, emergency contacts (inf) |
| Storage | `READ_EXTERNAL_STORAGE`, `WRITE_EXTERNAL_STORAGE` (maxSdk 29), `READ_MEDIA_AUDIO` | KYC doc upload, receipts (inf) |
| Biometric/NFC | `USE_BIOMETRIC`, `USE_FINGERPRINT`, `NFC` | 2-step verification, UPI/NFC pay via juspay hypernfc |
| System | `WAKE_LOCK`, `VIBRATE`, `POST_NOTIFICATIONS`, `RECEIVE_BOOT_COMPLETED` (via receivers), `FOREGROUND_SERVICE*` | push, SOS, trip tracking |
| Ad/analytics | `com.google.android.gms.permission.AD_ID` family, Firebase/MoEngage/MiPush internal perms | ad attribution |
| Custom | `com.olacabs.customer.permission.MIPUSH_RECEIVE` (signature-level) | MiPush provider guard |
| Launcher badges | Xiaomi/Oppo/Vivo badge permissions (multiple `*.permission.*BADGE*`) | unread badges |

## Sensitivity notes (inf)
- `READ_SMS` + `RECEIVE_SMS` + `SEND_SMS` + `READ_CONTACTS` + `RECORD_AUDIO` make this a high-permission-scope build, consistent with OTP autofill + wallet SIM binding + P2P/contacts features.
- `READ_PHONE_NUMBERS`/`READ_BASIC_PHONE_STATE` support device-bound wallet identity (SIM binding activities + SimStateBroadCastReciever exist, obs).
- `READ_MEDIA_AUDIO` alone among scoped media permissions suggests a limited media feature (e.g., notification sounds/upload) — no READ_MEDIA_IMAGES/VIDEO declared (obs).
