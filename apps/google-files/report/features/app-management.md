# Feature: App management (Apps tab)

## Capabilities

- Installed-app listing via `QUERY_ALL_PACKAGES` + `PackageManager`.
- **APK install**: `REQUEST_INSTALL_PACKAGES` — Files can trigger package
  installs of APKs it browses (strings: install errors, app-info, APK labels).
- **Uninstall**: `REQUEST_DELETE_PACKAGES` → system uninstall dialog.
- **App info / cache clear**: per-app cache deletion strings (uses
  `clearApplicationUserData`-adjacent or Settings intents — exact mechanism
  obfuscated).
- **Unused-apps suggestion**: `PACKAGE_USAGE_STATS` + `app_usage_database`
  (helper `huh`; impl `hvg`,`hwa`,`hvv`,`iaj`,`qdc`) feeding cleanup card —
  see `cleanup.md`.

## Package tracking

- `documentbrowser.browselanding.rootcontainerlist.receiver.PackageChangeReceiver`
  — `PACKAGE_ADDED`-family receiver keeps app lists + APK mapping current.
- `GET_PACKAGE_SIZE` permission — legacy app-size enumeration for storage
  breakdown (`hvg`/`hwa` usage-stats + `qdc` storagestats helpers).
- `com.android.vending.p2p.APP_INSTALL_API` — Play P2P app-sharing install
  surface (see `sharing.md`).

## Evidence

Permissions, receivers, usage-stats classes, app-management strings.

## Unknowns

- Whether split-APK installs (`PackageInstaller` multi-APK sessions) are
  supported from browse — class presence suggests session API usage.
- Cache-clear actually deletes vs opens Settings (Settings intent more likely
  on modern Android).
