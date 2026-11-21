> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Home-screen widgets

## How it works
- `ILovePDFWidgetProvider` (appwidget provider, `widget_ilovepdf_info`,
  preview `widget_preview`) — shortcut grid into tools; `MyWidget`
  (Glance `androidx.glance.appwidget`, `AppWidget` libs) is the modern widget;
  `ShortcutsActivity` handles launcher shortcuts; `widget_actions`/
  `WidgetUtils` map widget clicks to tool deep-links.

## Receivers
`WidgetPinnedReceiver` (widget-pinned event), `WidgetRecentToolsReceiver`
(recent-tools widget → deep-link tool), `WidgetScanReceiver` (one-tap scan),
`GlanceRemoteViewsService`/`UnmanagedSessionReceiver` (Glance layout host).
