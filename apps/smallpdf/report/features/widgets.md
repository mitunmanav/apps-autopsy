# Feature: Home-Screen Widgets

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

- Glance-based `AppWidgetProvider` receivers `[obs]` for: tools overview, compress, scan, conversion, merge, edit, e-sign (widget XML meta-data in `res/xml/`).
- Behavior `[inf]`: each widget deep-links into the corresponding `u4a` tool → `ToolFlowActivity`/`ScannerActivity`; tools widget shows the same group registry (`v4a.d`).
- Update mechanism `[inf]`: Glance state + periodic refresh; no remote data needed for tool shortcuts.
- `[partial]`: exact per-widget receiver class names are obfuscated; widget preview layouts in `res/layout` + `res/xml` `[obs]`.
