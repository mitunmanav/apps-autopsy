# Permissions

Artifact: `com.bumble.app` `base.apk` SHA-256 `5f97a815b83c26dfb22140b4572b775f1266425c5d7eb6a292dca2978f7700c2`.

61 `uses-permission` + 2 signature-level permissions defined. Grouped by purpose; feature mapping is [inf] unless tied to code.

## Network / connectivity [obs]
`INTERNET`, `ACCESS_NETWORK_STATE`, `ACCESS_WIFI_STATE`, `CHANGE_NETWORK_STATE`, `CHANGE_WIFI_STATE` — core + network switching (WebRTC fallback [inf]).

## Location [obs]
`ACCESS_COARSE_LOCATION`, `ACCESS_FINE_LOCATION` — discovery/encounters geo (`SERVER_UPDATE_LOCATION_AND_GET_ENCOUNTERS`).

## Camera / mic / media [obs]
`CAMERA`, `RECORD_AUDIO`, `MODIFY_AUDIO_SETTINGS`, `READ_MEDIA_IMAGES`, `READ_MEDIA_VIDEO`, `READ_MEDIA_AUDIO`, `READ_MEDIA_VISUAL_USER_SELECTED`, legacy `READ/WRITE_EXTERNAL_STORAGE` — photo verification, chat media, video calls.

## Foreground services [obs]
`FOREGROUND_SERVICE`, `FOREGROUND_SERVICE_DATA_SYNC`, `FOREGROUND_SERVICE_CAMERA`, `FOREGROUND_SERVICE_MICROPHONE` — WebRtcService + sync workers.

## Calls / telephony / contacts-ish [obs]
`READ_PHONE_STATE`, `READ_PHONE_NUMBERS`, `GET_ACCOUNTS` — phone-number signup, autofill [inf].

## Notifications / badges [obs]
`POST_NOTIFICATIONS`, `VIBRATE`, `WAKE_LOCK`, `USE_FULL_SCREEN_INTENT`, `DISABLE_KEYGUARD` (incoming-call UX), plus ~15 badge-related perms (representative: `READ_APP_BADGE`, `com.sec.android.provider.badge.READ/WRITE`, `com.anddoes.launcher.UPDATE_COUNT`, `com.htc.launcher.READ_SETTINGS/UPDATE_SHORTCUT`, `com.sonyericsson.home.BROADCAST_BADGE`, `com.sonymobile.home.PROVIDER_INSERT_BADGE`, `com.majeur.launcher.UPDATE_BADGE`, `com.huawei.android.launcher.CHANGE_BADGE/READ/WRITE_SETTINGS`, `com.oppo.launcher.READ/WRITE_SETTINGS`, `com.samsung.android.mapsagent.READ_APP_INFO` — last one is a Samsung agent perm, likely maps/Bixby-related [inf]).

## Bluetooth / NFC / capture [obs]
`BLUETOOTH`, `BLUETOOTH_CONNECT` (call audio routing [inf]), `NFC`, `DETECT_SCREEN_CAPTURE` (screenshot protection on sensitive media [inf]). No `RECEIVE_BOOT_COMPLETED` or exact-alarm perms declared.

## Billing / ads / install [obs]
`com.android.vending.BILLING`, `com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE`, `com.google.android.gms.permission.AD_ID`, `ACCESS_ADSERVICES_{AD_ID,ATTRIBUTION,TOPICS}` (Privacy Sandbox), `com.huawei.appmarket.GET_COMMON_DATA`, `com.google.android.providers.gsf.READ_GSERVICES`.

## Push [obs]
`com.google.android.c2dm.permission.RECEIVE`

## Biometric / auth [obs]
`USE_BIOMETRIC`, `USE_FINGERPRINT` — app-lock / purchase confirm [inf].

## Vendor custom [obs]
`com.badoo.permission.SignaturePrivileged` — Badoo-platform signature perm, gates privileged broadcasts between group apps [inf].

## Permissions the app defines [obs]
- `com.bumble.app.VERIFF_STATUS_BROADCAST_PERMISSION` (signature) — Veriff result broadcast isolation.
- `com.bumble.app.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` (signature) — guards dynamic receivers.

## Assessment
- No `SYSTEM_ALERT_WINDOW`, no `QUERY_ALL_PACKAGES`, no accessibility abuse — permission surface is broad but consistent with feature set [obs/inf].
- Runtime grant state per permission: [unk] (static only).
