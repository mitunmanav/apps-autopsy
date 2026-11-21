# 15 — App Categories

## Model

- `category_model` table: built-in categories (**Social, Games, Media, Productivity** + custom)
  with `arg_is_productive` flag, icon `arg_res_id`, name.
- Apps assigned via AppSettings ("Category") or bulk ManageAppActivity (`arg_category_id`,
  `selectedCategory`).

## Components

| Component | Role |
|---|---|
| `CreateCategoryActivity` (`create_category`) | new custom category (name, icon, productive flag) |
| `CustomCategoryActivity` (`custom_category`, extra `arg_category_id`) | custom-category detail; ads `app_usage_report` + `daily_report_interstitial` |
| `UpdateCategoryActivity` (`update_category`) | edit; extras `arg_category_id`, `arg_res_id`, `arg_category_name`, `arg_is_productive` |
| `CategorySettingsActivity` (`category_settings`) | per-category config: daily limit, auto-lock, alerts |
| `CategoryReportActivity` (`category_report`) | category usage report; entry via `dashboard`/`app_usage_report`/`category`; tier extras `premium`/`free`/`unknown`; `arg_pin_screen` PIN gate |

## Features

- **Category daily limits** — cap total minutes across all apps in a category; enforced by
  the same `enforcement` path in UsageTimerService (auto-lock per category).
- **Productive categories** — flagged categories count differently in scores/reports.
- **Category reports** — aggregate usage/unlocks per category over time; premium for depth.

## Analytics

`create_category`, `custom_category`, `update_category`, `category_settings`,
`category_report` screens; `categorized_app_selected` assignment events.

## Premium

Category limits/custom categories/report depth are premium-gated per the tier extras.
