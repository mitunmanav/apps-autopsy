# 24 — Third-party SDK inventory

Derived from manifest components, bundled packages, resources, and imports.

## Google

| SDK | Evidence |
|---|---|
| Google Maps SDK | `com.google.android.gms.maps.*`, `SupportMapFragment`/`MapView`/`LatLng`/`CameraPosition`/`LatLngBounds`, API key resource |
| Play Services Location (fused) | `LocationRequest` refs in map activities |
| Google Sign-In | `GoogleSignInOptions`/`GoogleSignInAccount`, `drive.file` scope |
| Play Billing | `BILLING`, `BillingClientSetup`, `PurchaseHelper` |
| AdMob / Google Mobile Ads | `ads_mobile_sdk` packages, `om4`/`j7` types, app ID resource |
| AdX / Ad Manager | `ADX`/`ADAX` remote fields, adxads JSON |
| Firebase (Analytics, Remote Config, Messaging, A/B testing, Installations, InstanceID) | `AbtRegistrar`, `FireBaseRemoteConfigAdData`, FCM service, `FirebaseInitProvider`, remote ad JSON |
| ML Kit Barcode (Barhopper dynamite) | `com.google.mlkit.dynamite.barcode.ModuleDescriptor`, `libbarhopper_v3.so`, model assets |
| Play Core (in-app update/review likely) | Play Core manifest entries, `UpdateApp` model |
| Pairip | application class, `libpairipcore.so`, PairIP license component |
| CameraX + Media3/ExoPlayer | JNI libs, `exo_*` resources (entire xxhdpi split), `FullScreenVideoView` |
| google-api-client (`com.google.api.client.googleapis.GoogleUtils`) | present — but **no Drive service classes** (see 14) |
| WorkManager, Room, DataStore | bundled libs + init provider + `libdatastore_shared_counter.so` |

## Third-party

| SDK | Evidence |
|---|---|
| OneSignal | manifest components |
| Facebook SDK | `com.facebook.share.*` imports, manifest activities, FBEventUtils event names |
| TikTok (App ID resource) | `7594777517932707848` — analytics/attribution or share |
| OneLink share URL | `onelink.to/gpsmapcamera` (AppsFlyer OneLink domain — but **no AppsFlyer SDK** bundled) |
| iText PDF | `com.itextpdf.text.pdf.*` (`PdfWriter`, `ColumnText`, `Barcode128`) |
| pdfcreator | `com.tejpratapsingh.pdfcreator` |
| uCrop | bundled (image cropping) |
| Glide | `com.bumptech.glide` imports |
| SubsamplingScaleImageView | `com.davemorrissey.labs.subscaleview` (deep-zoom preview) |
| Apache Commons Codec | 127 language/codec classes |
| Volley-like HTTP (`zi6` request, `ud0` listener) | weather/AQI/elevation calls in `CameraActivity` |
| AndroidX (appcompat, recyclerview, viewpager2, constraintlayout, media, graphics-path, biometric, datastore) | extensive |
| Open Camera (code fork) | 156 `preference_*` keys — see 03 |

## Not found

- `osmdroid` (`ev_e3573e6b…`), `com.google.api.services.drive` (`ev_4f95cb29…`), `javax.mail`/SMTP, Retrofit
