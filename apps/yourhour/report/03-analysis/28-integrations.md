# 28 — Third-Party Integrations

| SDK | Evidence | Purpose |
|---|---|---|
| **Firebase** Analytics | `a44.r` → `firebaseAnalytics.a(bundle,event)`; ~150 custom events throughout | product analytics |
| Firebase **Crashlytics** | `u83.a().b(e)` wrapper on every catch | crash reporting |
| Firebase **Messaging** | `NotificationReceiver` (`MESSAGING_EVENT`), FCM token upload `auth/fcm-token` | pushes (parental + offers) |
| Firebase **RTDB/Firestore** | `yourhour-mindefy.firebaseio.com`, firestore classes | remote config / legacy data |
| Firebase **Remote Config + A/B Testing** | `RemoteConfigRegistrar`, `AbtRegistrar` in manifest | **server-side feature flags + experiments** — previously unlisted |
| Firebase **Storage** | `StorageRegistrar`, `uf8.java` bucket rules | file storage (story pics, backups) |
| **Google Play Billing** | `com.android.vending.BILLING`, SKU list (21) | subscriptions/IAP |
| **pairip** | `com.pairip.*`, LicenseActivity, CHECK_LICENSE, `usesNonSdkApi` | Play integrity/license |
| **Ad mediation — 17 networks** | DEX census: Pangle 99, Smaato 89, Unity 77, Mintegral 76, AppLovin 73, AdMob 61 (`ca-app-pub-3128150064662905`), Vungle 58, Fyber 56, IronSource 54, FAN 182 (embedded dex), InMobi 24, Amazon 22, Chartboost 20, Tapjoy 20, myTarget 19, Yandex 18, Moloco 17 | full waterfall — see [reference/third-party-sdks.md](../05-reference/third-party-sdks.md) |
| **OMSDK** | `assets/ad-viewer/omid-*.js` | IAB ad-viewability measurement |
| **Facebook SDK** | app id `670696773447420`, client token, `com.facebook.internal.d` receiver refs | login/share/ads |
| **Google Sign-In / Drive** | `auth/google`, `drive.metadata.readonly` scope, server-client-id strings | auth + backup |
| **UCrop** | cropper provider + `profilePic.jpg` | avatar cropping |
| **Glance** | widget providers + `widget_*_info.xml` | widgets |
| **Room / WorkManager / Lifecycle / Compose** | `_Impl`, workers, view-tree owners | platform stack |
| **Lottie** | lottie assets | animations |
| **Play In-App Updates** | `appUpdateType`, `allowAssetPackDeletion` | force update |
| **OkHttp/Retrofit** | 30 s client, BASIC logging, `/api/v1/` paths | backend |
| Ad mediation | `native_ad_*`/`interstitial`/`rewarded` slot keys across networks | ad orchestration |
