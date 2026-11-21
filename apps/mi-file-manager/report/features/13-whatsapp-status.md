# 13 — WhatsApp Status Saver & WhatsApp Media

`com.android.fileexplorer.whatsapp` package (`ev_26d53a3c…b4e184`) — browse/save WhatsApp "status" media, plus WhatsApp media management.

## Components

- `whatsapp` UI: `WhatsAppTabAppTagFragment` (app-tag tab), status browsing fragments/adapters (`StatusCacheItem`, status lists, image/video tabs), download/save buttons.
- `whatsapp.job.WhatsAppStatusSaveService` — `IntentService` (`ev_f5ff8a5b…f0c4d`):
  ```java
  protected void onHandleIntent(Intent intent) {
      long dt = System.currentTimeMillis() - SettingManager.getWhatsAppStatusSyncTime();
      if (dt <= 0 || dt >= 3600000) {          // throttle: at most hourly
          a.f();                              // sync/copy statuses
          SettingManager.setWhatsAppStatusSyncTime(now);
      }
      // finally t1.a.d() — notification/task cleanup
  }
  ```
  Hourly-throttled background sync of `WhatsApp/Media/.Statuses` into the app's cache so statuses appear in the "Status" tab without opening WhatsApp.
- `SettingManager.get/setWhatsAppStatusSyncTime` — sync watermark pref.
- `WhatsappCleanerActivity` (deep-clean, doc 10) — class exists in dex but is **not declared in the manifest** (dead code in this build).

## Mechanism

- Reads `WhatsApp/Media` + `.Statuses` (hidden) dirs — permitted by `MANAGE_EXTERNAL_STORAGE`/media perms. Note: the manifest's `<queries>` does **not** include `com.whatsapp` (manifest-verified) — visibility checks rely on filesystem access, not package introspection.
- "Save status" copies status media into `Pictures`/DCIM and triggers `MediaScannerConnection` so it lands in gallery.
- `AppTag`/`AppScanConfig` DAOs categorize WhatsApp-owned media for the AppTag views (doc 05).

## Evidence

`ev_26d53a3c…b4e184` (whatsapp package inventory), `ev_f5ff8a5b…f0c4d` (service body), manifest `ev_24480d9e…089c2a7` (service decl; no whatsapp query), `ev_c7d5130a…787a4a` (WhatsappCleanerActivity undeclared).

## Unknowns

- Exact source/destination path constants (obfuscated `a.f()` internals) — standard `.Statuses` handling inferred from class names/strings, not verified literal paths.
- Android 11+ package-visibility: needs `QUERY_ALL_PACKAGES`/media perms — declared.
- Whether WA Business (`.Statuses` under `WhatsApp Business`) is covered — likely via same scan (unverified).
