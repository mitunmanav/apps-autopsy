# Uninstall / Block Protection

**Artifact:** `ai.regainapp` · SHA-256 `76be9ba8d7e6c5ff368cd430cc89fccc0f0c7dab3c44549caac2eaf46e3a298a`
**Modules:** device admin + block-protection windows · **Evidence:** OBS

## What it is
Anti-circumvention: guards Settings/uninstaller/Regain itself from being force-stopped or uninstalled during active blocks; device admin provides forced screen-lock.

## UI entry (OBS)
`block_protection_screen`, `block_protection_settings`, `uninstall_protection`, `prevent_uninstall`, `device_admin_settings`; `BlockProtectionActivity`, `RegainDeviceAdminReceiver` (`@xml/device_admin_policies` = `<force-lock/>` only).

## Params model (OBS)
`BlockFeatureSetting`, `FeatureStatusV11` (protection state), `BlockProtectionWindowFactory`, `PermissionLogs`.

## Execution path (OBS)
1. Monitor sees package `com.android.settings`/uninstaller/Regain in foreground while protection on → `handleAppBlockProtection`/`checkAppBlockProtection` → `BlockProtectionWindowFactory`/`BlockProtectionActivity` overlay + back-press.
2. Split-screen/floating-window evasion → `checkSplitScreenWindow`/`isSplitScreenWindow`/`isFloatingWindow` → overlay.
3. `RegainDeviceAdminReceiver` enables device-admin → `force-lock` policy locks the screen when tampering detected.
4. `onAppInstalledEvent`/`PackageChangeReceiver` watch install/uninstall intents.

## Data flow
Target package foreground → protection check → overlay/admin action.

## Premium/offline (OBS)
Fully local; INF premium-gated.
