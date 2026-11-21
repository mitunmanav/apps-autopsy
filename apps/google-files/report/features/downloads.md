# Feature: Downloads & Save-to-Downloads

## Downloads tab

- `gateway.downloads.DownloadsActivity` — dedicated category (MediaStore
  `Downloads` collection + `Download/` directory fallback); exported gateway
  for external `VIEW_DOWNLOADS`-style intents.

## Save-to-Downloads gateway

- `gateway.savetodownloads.SaveToDownloadsActivity` — exported `SAVE`/share
  target into Downloads; lets other apps (and Files share flows) drop content
  into user-visible Downloads through a normalized content pipeline.

## MDD (Mobile Data Download)

- `omz` `DownloaderCallbackImpl` — Google's MDD client for model/asset bundles;
  `Failed to apply zip download transform for file %s` → bundles arrive zipped,
  `mxh` unpacks (`Failed to unzip queued bundle. appId`).
- Feeds ML models/feature packs without bloating the APK.

## Evidence

Gateway aliases in manifest; `omz`/`mxh`; downloads strings.

## Unknowns

- MDD feature IDs/schedule (server-configured).
- Whether downloads category indexes custom download dirs.
