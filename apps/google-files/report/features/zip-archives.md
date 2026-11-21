# Feature: ZIP archives — create, browse, extract

## Read/browse (zip-as-folder)

- `qdm` — zip container reader over storagelib; `qdr` implements `qdv`
  (zip-document adapter): wraps `java.util.zip.ZipFile`, lazy-open + refcounted
  `synchronized` handle (`g()`/`h()`/`i()`), `Uri` =
  `storagelib-zip-document:<canonical-path>`.
- Zip contents appear as a virtual folder — `filtering not supported for
  zipFiles` (`qdm`): flat listing, no recursive sort.
- MIME sniffing `application/zip` + `application/x-zip[-compressed]` + `.lottie`
  quirk (`gln`,`kah`,`itt`,`qdc`,`kpt`).
- `Entry not found in zip file:` / `Entry not found in shared zip file:` (`qdq`)
  — entry resolution errors per-entry, not whole-archive fail.
- Gateway `gateway.zip.EnableZipPreviewActivityReceiver` + zip preview gateway
  route external `VIEW .zip` intents into browse mode (enable-gated receiver
  pattern like the other preview gateways).

## Extraction safety — zip-slip guard

`qdr`: **`Invalid zip file canonical path`** — canonical-path containment check
before writing entries; absolute/`../` traversal rejected.

- Encrypted entries: `This zip file contains encrypted entries.` (`qbn`) —
  detected & surfaced (decrypt not implemented → graceful failure).
- Charset handling: `qdr(File, Charset)` — configurable name charset.
- `Failed to unzip the document: %s` (`qbw`), `Error occurred while reading zip
  file` (`qdm`), `Failed getFilesSourceFromUnzippedContainer() on an invalid
  container` (`hvr`).

## Create/compress

- Naming: `qdt` appends `.zip` if absent; `Can't create zip file with empty
  name!` (`htl`); `New zip file edit text changed` — inline name validation.
- Target doc `lrt` (`Failed to create target zip document.`).
- UI peers `htl`/`gpy`/`gln`; extract dialog `jqu`/`jqr`
  (`UnzipParentDialogFragmentPeer#onBackPressedCallback`,
  `On Unzip Dismiss Clicked`).
- Strings confirm: extract-progress, delete-after-extract option,
  unreadable-file handling.

## Downloader interop

`omz` `DownloaderCallbackImpl`: `Failed to apply zip download transform` —
MDD-delivered bundles arrive zipped and are unzipped by `mxh`
(`Failed to unzip queued bundle. appId`).

## Flags

`enable_zip_folder` phenotype flag gates zip-as-folder browsing.

## Evidence / unknowns

Classes: `qdm,qdq,qdr,qdt,qbn,htl,gpy,gln,lrt,jqu,jqr,hvr,kah,omz,mxh`.
Unresolved: streaming vs buffered extract sizes, compression level, ZIP64
handling, symlink entry policy.
