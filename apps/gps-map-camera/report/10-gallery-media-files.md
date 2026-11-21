# 10 — Gallery, media, folders & file naming

## Screens

- `MyFilesActivity` — file home: drive banner, folder list, `IS_UPLOAD_ON_GOOGLE_DRIVE` switch (line ~461)
- `FolderActivity`, `ui.activities.SingleFolderActivity` — folder browse; `COLLECTION_*` ad slots on gallery/media-viewer/single-folder/video-player
- `ui.activities.GalleryActivity`, `clusterImage.activity.GalleryActivity`/`PreviewActivity`, `Gallery.widgets.ClickableViewPager` — grid + fullscreen preview pager
- `ui.activities.MediaViewerActivity` — media details; opens photo GPS in Google Maps (`maps.google.com/?q=`); `ACTION_VIEW` on URIs (line ~1337)
- `clusterImage.activity.ImageClusterActivity` — photos clustered on map (see 07)
- `widgets.MyRecyclerView`, `widgets.MySquareImageView`, `helper.RoundedCornerLayout`, `helper.RoundImageView`, `helper.MaxHeightScrollView`, `helper.SafeNestedScrollView` — custom views
- Models: `Media`, `ImageModel`, `FileGetSet`, `MultiHeaderModel`/`MultiHeaderData` (sectioned lists)

## Media editing & organization

- **Edit Photo**: `Crop`, `Rotate`, `Keep Editing`, `Edit` strings + uCrop (`com.yalantis.ucrop`) bundled → crop/rotate editing on captured photos
- **Filters**: `Filter 1`–`Filter 17` — 17 named photo filters
- **File ops**: `Rename`/`File renamed.`/`Rename failed.`, `Delete`/`Delete failed`, `Sort By`, multi-select (`Item Selected`, `Select Photos`)
- **Custom folders**: `Add New Folder`, `Create Folder`, `Create a location-wise folder`, `Multiple folders`, `Unfold the Folders!`, `Folder name is already exist`, `Contents of the folder will also be deleted.` — user-created folders incl. location-wise organization
- **Search**: `Search your Album`, `Search…`, `Search by Area`, `Voice search` — album search incl. area-based and voice input
- **Share**: `Share Photo`, `Share Media`, `Share with %s`, `Location Share`, `Open share options after each capture`

## File naming (`FileName_Activity`, `helper.FileNameUtils`)

User-configurable filename templates — keys: `is_decimal_file`, `is_dms_file`, `is_notes_file`, `is_pluscode_file`, `is_timezone_file`, `is_hr_min_sec`, `full_file_name`, `is_increment`/`sequence_value` numbering, `PREFIX`/`SUFFIX`. Filenames can embed decimal or DMS coords, plus code, notes, timezone, time. `FILENAME_SCREEN_*` ad slots.

## Storage

- `IS_SAVE_IN_INTERNAL_STORAGE` toggle; `folder_path`, `saf_gmc_uri` (SAF-picked SD-card tree URI), `IS_SDCARD_PERMISSION(_TAKEN)`, `is_display_folder_name`
- `preference_save_location`, `preference_save_location_saf`, `preference_using_saf` (Open Camera layer)
- MediaStore `Documents/GPS Map Camera/Backups` for `.gmc` backups; `FileProvider` for share intents
- `LAST_THUMB_PATH/URI`, `IMAGE_URI_PREVIEW`, `ent_image_uri` — last-capture state
- `GALLERY_IMAGE_CLICK_COUNT` — ad-cadence counter on gallery taps
- `is_original_image` — keep un-stamped original option

## Unknowns

- Whether sharing strips or keeps EXIF (share intent paths obfuscated)
