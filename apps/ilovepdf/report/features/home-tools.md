> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Home / tools catalog

## How it works
`MainActivity` hosts `FragmentHostActivity` nav (`main_nav_graph`): Home shows
the 27-tool grid plus banner/promo/premium upsells; `ToolsFragment`,
`ToolsGridComposeActivity` (`presentation.features.toolgridcompose`) render the
catalog; `RecentToolDBModel` + `ToolUsesDBModel` feed "recent/frequent" rows;
tool ordering can be A/B'd via `experiment`/`ab_testing` flags (Remote Config).
Tools open `ToolContainerActivity`/`FileSelectionActivity` →
`FileSelectionContainerFragment` (files, cloud, favorites tabs) → per-tool
options fragment → `ForegroundToolExecutionService` → `OutputFilesActivity`.
